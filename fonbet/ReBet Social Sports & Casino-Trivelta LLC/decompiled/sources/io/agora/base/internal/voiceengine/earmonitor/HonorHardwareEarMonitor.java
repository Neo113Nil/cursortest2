package io.agora.base.internal.voiceengine.earmonitor;

import android.content.Context;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ReflectUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class HonorHardwareEarMonitor implements IHardwareEarMonitor {
    private static final String TAG = "HonorHardwareEarMonitor";
    private Context mContext;
    private Class<?> mHnAudioClientClass;
    private Class<?> mHnEarReturnClientClass;
    private HardwareEarMonitorListener mListener;
    private Class<?> mParamNameClass;
    private Class<?> mServiceTypeClass;
    private AudioServiceCallbackImpl mAudioServiceCallbackImpl = new AudioServiceCallbackImpl();
    private Object mHnAudioClient = null;
    private Object mHnEarReturnClient = null;
    private volatile boolean mInitialized = false;
    private volatile boolean mIsDestroyed = false;
    private volatile boolean mEarMonitorEnabled = false;
    private volatile boolean mBindServiceSuccess = false;

    public class AudioServiceCallbackImpl implements InvocationHandler {
        private AudioServiceCallbackImpl() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                if ("onResult".equals(method.getName())) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    Logging.w(HonorHardwareEarMonitor.TAG, "onResult: " + intValue);
                    if (HonorHardwareEarMonitor.this.mIsDestroyed) {
                        Logging.w(HonorHardwareEarMonitor.TAG, "ignore result after destroy");
                        if (intValue == 0) {
                            HonorHardwareEarMonitor.this.destroyImpl();
                            return obj;
                        }
                    } else {
                        if (intValue != 0) {
                            if (intValue == 1000) {
                                boolean isHardwareEarMonitorSupported = HonorHardwareEarMonitor.this.isHardwareEarMonitorSupported();
                                if (HonorHardwareEarMonitor.this.mListener != null) {
                                    HonorHardwareEarMonitor.this.mListener.onHardwareEarMonitorSupported(isHardwareEarMonitorSupported);
                                }
                                Logging.d(HonorHardwareEarMonitor.TAG, "IAudioServiceCallback: Karaoke feature bind service success");
                                return obj;
                            }
                            Logging.e(HonorHardwareEarMonitor.TAG, "IAudioServiceCallback: onResult error number " + intValue);
                            return obj;
                        }
                        HonorHardwareEarMonitor.this.bindService();
                        if (HonorHardwareEarMonitor.this.mListener != null) {
                            HonorHardwareEarMonitor.this.mListener.onInitResult(0);
                        }
                        Logging.d(HonorHardwareEarMonitor.TAG, "IAudioServiceCallback: HnAudioClient init success");
                    }
                }
                return obj;
            } catch (Throwable th2) {
                Logging.e(HonorHardwareEarMonitor.TAG, "AudioServiceCallbackImpl invoke failed ", th2);
                return obj;
            }
        }
    }

    public HonorHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener) {
        Logging.d(TAG, ">>ctor");
        this.mListener = hardwareEarMonitorListener;
        this.mContext = ContextUtils.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindService() {
        List list = (List) ReflectUtils.safeCallMethod(this.mHnAudioClientClass, this.mHnAudioClient, "getSupportedServices", new Class[0], new Object[0]);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() == 1) {
                    initHnEarReturnClient();
                    this.mBindServiceSuccess = true;
                    Logging.w(TAG, "bind service success");
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyImpl() {
        try {
            ReflectUtils.safeCallMethod(this.mHnEarReturnClientClass, this.mHnEarReturnClient, "destroy", new Class[0], new Object[0]);
            ReflectUtils.safeCallMethod(this.mHnAudioClientClass, this.mHnAudioClient, "destroy", new Class[0], new Object[0]);
            Logging.d(TAG, "karaoke kit destroy call.");
        } catch (Throwable th2) {
            Logging.e(TAG, "destroy failed ", th2);
        }
    }

    public static boolean hasEarMonitorClass() {
        return (ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient") == null || ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient") == null || ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.IAudioServiceCallback") == null) ? false : true;
    }

    private void initHnEarReturnClient() {
        Logging.d(TAG, "initHnEarReturnClient");
        Class<?> cls = this.mHnAudioClientClass;
        Object obj = this.mHnAudioClient;
        Class<?> cls2 = this.mServiceTypeClass;
        this.mHnEarReturnClient = ReflectUtils.safeCallMethod(cls, obj, "createService", new Class[]{cls2}, new Object[]{cls2.getEnumConstants()[0]});
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void destroy() {
        Logging.d(TAG, "karaoke kit destroy");
        this.mListener = null;
        if (this.mInitialized) {
            this.mInitialized = false;
            this.mEarMonitorEnabled = false;
            this.mBindServiceSuccess = false;
            this.mIsDestroyed = true;
            destroyImpl();
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int enableHardwareEarMonitor(boolean z10) {
        String str = TAG;
        Logging.d(str, ">>enableHardwareEarMonitor " + z10);
        try {
            int intValue = ((Integer) ReflectUtils.safeCallMethod(this.mHnEarReturnClientClass, this.mHnEarReturnClient, "enableEarReturn", new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z10)})).intValue();
            if (intValue == 0) {
                this.mEarMonitorEnabled = z10;
                return 0;
            }
            Logging.e(str, "enableKaraokeFeature failed ret " + intValue);
            return -1;
        } catch (Throwable th2) {
            Logging.e(TAG, "enableHardwareEarMonitor failed ", th2);
            return -1;
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void initialize() {
        String str = TAG;
        Logging.d(str, "HnAudioClient initialize");
        if (this.mContext == null) {
            Logging.e(str, "mContext is null!");
            return;
        }
        if (this.mInitialized) {
            Logging.w(str, "already initialized, ignore");
            return;
        }
        try {
            this.mHnAudioClientClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient");
            this.mHnEarReturnClientClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient");
            Class<?> safeFindClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.IAudioServiceCallback");
            this.mServiceTypeClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient$ServiceType");
            this.mParamNameClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient$ParameName");
            Object newProxyInstance = Proxy.newProxyInstance(safeFindClass.getClassLoader(), new Class[]{safeFindClass}, this.mAudioServiceCallbackImpl);
            Object newInstance = this.mHnAudioClientClass.getConstructor(Context.class, safeFindClass).newInstance(this.mContext, newProxyInstance);
            this.mHnAudioClient = newInstance;
            ReflectUtils.safeCallMethod(this.mHnAudioClientClass, newInstance, "initialize", new Class[0], new Object[0]);
            this.mInitialized = true;
            Logging.d(str, "HnAudioClient initialize success");
        } catch (Throwable unused) {
            Logging.e(TAG, "HnAudioClient initialize failed");
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public boolean isHardwareEarMonitorSupported() {
        try {
            boolean booleanValue = ((Boolean) ReflectUtils.safeCallMethod(this.mHnAudioClientClass, this.mHnAudioClient, "isDeviceSupported", new Class[]{Context.class}, new Object[]{this.mContext})).booleanValue();
            String str = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("earMonitor is");
            sb2.append(booleanValue ? " " : "not ");
            sb2.append("supported and bind service ");
            sb2.append(this.mBindServiceSuccess ? "success" : "failed");
            Logging.d(str, sb2.toString());
            if (booleanValue) {
                return this.mBindServiceSuccess;
            }
            return false;
        } catch (Throwable th2) {
            Logging.e(TAG, "isHardwareEarMonitorSupported false ", th2);
            return false;
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int setHardwareEarMonitorVolume(int i10) {
        if (!this.mEarMonitorEnabled) {
            return -7;
        }
        String str = TAG;
        Logging.d(str, ">>setHardwareEarMonitorVolume " + i10);
        int max = Math.max(0, Math.min(i10, 100));
        try {
            Class<?> cls = this.mHnEarReturnClientClass;
            Object obj = this.mHnEarReturnClient;
            Class<?> cls2 = this.mParamNameClass;
            int intValue = ((Integer) ReflectUtils.safeCallMethod(cls, obj, "setParameter", new Class[]{cls2, Integer.TYPE}, new Object[]{cls2.getEnumConstants()[1], Integer.valueOf(max)})).intValue();
            if (intValue == 0) {
                return 0;
            }
            Logging.e(str, "setHardwareEarMonitorVolume failed ret " + intValue);
            return -1;
        } catch (Throwable th2) {
            Logging.e(TAG, "setHardwareEarMonitorVolume failed ", th2);
            return -1;
        }
    }
}
