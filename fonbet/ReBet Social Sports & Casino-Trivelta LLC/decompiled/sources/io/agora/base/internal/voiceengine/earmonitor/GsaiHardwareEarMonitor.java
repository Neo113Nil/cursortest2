package io.agora.base.internal.voiceengine.earmonitor;

import android.content.Context;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ReflectUtils;

/* loaded from: classes2.dex */
public abstract class GsaiHardwareEarMonitor implements IHardwareEarMonitor {
    private String TAG;
    private HardwareEarMonitorListener mListener;
    private Class<?> mMediaClientClass;
    private Object mMediaClient = null;
    private volatile boolean mInitialized = false;
    private volatile boolean mEarMonitorEnabled = false;
    private Context mContext = ContextUtils.getApplicationContext();

    public GsaiHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener, String str) {
        this.TAG = str;
        this.mListener = hardwareEarMonitorListener;
        Logging.d(str, ">>ctor");
    }

    public static boolean hasEarMonitorClass() {
        return ReflectUtils.safeFindClass("com.itgsa.opensdk.media.MediaClient") != null;
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void destroy() {
        Logging.d(this.TAG, "karaoke kit destroy");
        this.mListener = null;
        if (this.mInitialized) {
            this.mInitialized = false;
            this.mEarMonitorEnabled = false;
            enableHardwareEarMonitor(false);
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int enableHardwareEarMonitor(boolean z10) {
        Logging.d(this.TAG, ">>enableHardwareEarMonitor " + z10);
        Class cls = Integer.TYPE;
        try {
            if (z10) {
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setMixerSoundType", new Class[]{cls}, new Object[]{Integer.valueOf(getMixerSoundType())});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setPlayFeedbackParam", new Class[]{cls}, new Object[]{1});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "openKTVDevice", new Class[0], new Object[0]);
            } else {
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setPlayFeedbackParam", new Class[]{cls}, new Object[]{0});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "closeKTVDevice", new Class[0], new Object[0]);
            }
            this.mEarMonitorEnabled = z10;
            return 0;
        } catch (Throwable th2) {
            Logging.e(this.TAG, "enableHardwareEarMonitor failed ", th2);
            return -1;
        }
    }

    public abstract int getMixerSoundType();

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void initialize() {
        Logging.d(this.TAG, "HnAudioClient initialize");
        if (this.mContext == null) {
            Logging.e(this.TAG, "mContext is null!");
            return;
        }
        if (this.mInitialized) {
            Logging.w(this.TAG, "already initialized, ignore");
            return;
        }
        try {
            Class<?> safeFindClass = ReflectUtils.safeFindClass("com.itgsa.opensdk.media.MediaClient");
            this.mMediaClientClass = safeFindClass;
            this.mMediaClient = ReflectUtils.safeCallMethod(safeFindClass, null, "initialize", new Class[]{Context.class}, new Object[]{this.mContext});
            this.mInitialized = true;
            HardwareEarMonitorListener hardwareEarMonitorListener = this.mListener;
            if (hardwareEarMonitorListener != null) {
                hardwareEarMonitorListener.onInitResult(0);
                this.mListener.onHardwareEarMonitorSupported(isHardwareEarMonitorSupported());
            }
            Logging.d(this.TAG, "MediaClient initialize success");
        } catch (Throwable unused) {
            Logging.d(this.TAG, "MediaClient initialize failed");
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public boolean isHardwareEarMonitorSupported() {
        try {
            boolean booleanValue = ((Boolean) ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "isSupported", new Class[0], new Object[0])).booleanValue();
            String str = this.TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Karaoke earMonitor is");
            sb2.append(booleanValue ? " " : " not ");
            sb2.append("support ");
            Logging.d(str, sb2.toString());
            return booleanValue;
        } catch (Throwable th2) {
            Logging.e(this.TAG, "isHardwareEarMonitorSupported false ", th2);
            return false;
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int setHardwareEarMonitorVolume(int i10) {
        if (!this.mEarMonitorEnabled) {
            return -7;
        }
        int i11 = (int) (i10 * 0.15d);
        Logging.d(this.TAG, ">>setHardwareEarMonitorVolume " + i11);
        try {
            ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setMicVolParam", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i11)});
            return 0;
        } catch (Throwable th2) {
            Logging.e(this.TAG, "setHardwareEarMonitorVolume failed ", th2);
            return -1;
        }
    }
}
