package org.chromium.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.BiConsumer;

/* loaded from: classes10.dex */
public class BinderCallsListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String EMPTY_INTERFACE = "EMPTY_INTERFACE";
    private static final long LONG_BINDER_CALL_LIMIT_MILLIS = 2;
    private static final String NON_ANDROID_INTERFACE = "NON_ANDROID_INTERFACE";
    private static final String NULL_INTERFACE = "NULL_INTERFACE";
    private static final String PROXY_TRANSACT_LISTENER_CLASS_NAME = "android.os.Binder$ProxyTransactListener";
    private static final String TAG = "BinderCallsListener";
    private static final String UNKNOWN_INTERFACE = "UNKNOWN_INTERFACE";
    private static BinderCallsListener sInstance;
    private static final HashSet<String> sSlowBinderCallAllowList;
    private Object mImplementation;
    private boolean mInstalled;
    private InterfaceInvocationHandler mInvocationHandler;

    static {
        HashSet<String> hashSet = new HashSet<>();
        sSlowBinderCallAllowList = hashSet;
        Collections.addAll(hashSet, "android.app.IActivityTaskManager", "android.content.pm.IPackageManager", "android.view.IWindowSession", "android.app.IUiModeManager", "android.content.pm.IShortcutService", "android.app.IActivityManager", "android.os.IServiceManager", "android.os.IPowerManager", "android.content.IContentProvider", "android.view.accessibility.IAccessibilityInteractionConnectionCallback", "android.view.accessibility.IAccessibilityManager", "android.view.contentcapture.IContentCaptureManager", "android.os.IUserManager", "android.hardware.devicestate.IDeviceStateManager", "com.android.internal.telephony.ISub", "com.android.internal.app.IAppOpsService", "com.android.internal.app.IBatteryStats", "android.view.IGraphicsStats", "android.app.job.IJobCallback", "android.app.trust.ITrustManager", "android.media.IAudioService", "com.android.internal.inputmethod.IImeTracker", "com.android.internal.inputmethod.IInputMethodSession", "com.android.internal.app.IVoiceInteractionManagerService", "com.android.internal.textservice.ITextServicesManager", "com.android.internal.telephony.ITelephony", "com.android.internal.infra.IAndroidFuture", "com.android.internal.textservice.ISpellCheckerSession", "com.android.internal.telecom.ITelecomService", "android.app.IActivityClientController", "com.android.internal.view.IInputMethodManager", "com.android.internal.view.IInputMethodSession", "android.content.IContentService", "android.app.job.IJobScheduler", "android.net.IConnectivityManager", "android.net.ITetheringConnector", "android.view.IWindowManager", "android.permission.IPermissionManager", "android.app.ILocaleManager", "com.android.internal.appwidget.IAppWidgetService", "android.hardware.display.IDisplayManager", "android.content.IClipboard", "android.hardware.input.IInputManager", "android.app.INotificationManager", "android.app.IAppTask", "android.hardware.biometrics.IAuthService", "android.os.storage.IStorageManager", "android.app.backup.IBackupManager", "android.app.IUiAutomationConnection", "android.os.IThermalService", "android.os.INetworkManagementService", "android.app.usage.IUsageStatsManager", "android.view.autofill.IAutoFillManager", "android.media.session.ISession", "android.location.ILocationManager", "android.companion.virtual.IVirtualDeviceManager", "android.speech.tts.ITextToSpeechService", "android.speech.tts.ITextToSpeechManager", "android.support.customtabs.ICustomTabsCallback", "android.support.customtabs.IEngagementSignalsCallback", "android.app.unipnp.IUnionManager", "android.app.role.IRoleManager", "android.os.IVibratorService", "android.service.textclassifier.ITextClassifierService", "android.security.advancedprotection.IAdvancedProtectionService", "org.chromium.webapk.lib.runtime_library.IWebApkApi", "android.media.session.ISessionManager", "android.media.IMediaRouterService");
    }

    public static BinderCallsListener getInstance() {
        ThreadUtils.assertOnUiThread();
        if (sInstance == null) {
            sInstance = new BinderCallsListener();
        }
        return sInstance;
    }

    private BinderCallsListener() {
        try {
            Class<?> cls = Class.forName(PROXY_TRANSACT_LISTENER_CLASS_NAME);
            this.mInvocationHandler = new InterfaceInvocationHandler();
            this.mImplementation = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this.mInvocationHandler);
        } catch (Exception unused) {
            Log.w(TAG, "Failed to create the listener proxy. Has the framework changed?");
        }
    }

    public static void setInstanceForTesting(BinderCallsListener testInstance) {
        if (sInstance != null && testInstance != null) {
            throw new IllegalStateException("A real instance already exists.");
        }
        sInstance = testInstance;
    }

    public boolean installListener() {
        return installListener(this.mImplementation);
    }

    public Long getTimeSpentInBinderCalls() {
        InterfaceInvocationHandler interfaceInvocationHandler;
        if (!this.mInstalled || (interfaceInvocationHandler = this.mInvocationHandler) == null) {
            return null;
        }
        return Long.valueOf(interfaceInvocationHandler.getTimeSpentInBinderCalls());
    }

    private boolean installListener(Object listener) {
        if (this.mInstalled) {
            return false;
        }
        try {
            ((Method) Class.class.getDeclaredMethod("getMethod", String.class, Class[].class).invoke(Binder.class, "setProxyTransactListener", new Class[]{Class.forName(PROXY_TRANSACT_LISTENER_CLASS_NAME)})).invoke(null, listener);
            Log.d(TAG, "Successfully installed the Binder listener", new Object[0]);
            this.mInstalled = true;
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            Log.w(TAG, "Failed to install the Binder listener");
            return false;
        }
    }

    void setBinderCallListenerObserverForTesting(BiConsumer<String, String> observer) {
        InterfaceInvocationHandler interfaceInvocationHandler = this.mInvocationHandler;
        if (interfaceInvocationHandler != null) {
            interfaceInvocationHandler.mObserver = observer;
        }
    }

    private static class InterfaceInvocationHandler implements InvocationHandler {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private String mCurrentInterfaceDescriptor;
        private int mCurrentTransactionId;
        private long mCurrentTransactionStartTimeMillis;
        private BiConsumer<String, String> mObserver;
        private long mTotalTimeSpentInBinderCallsMillis;

        private InterfaceInvocationHandler() {
            this.mCurrentInterfaceDescriptor = BinderCallsListener.EMPTY_INTERFACE;
        }

        private static boolean isAndroidBinderInterface(String interfaceDescriptor) {
            return (interfaceDescriptor.startsWith("com.android.") && !interfaceDescriptor.startsWith("com.android.vending")) || interfaceDescriptor.startsWith("android.");
        }

        private String getInterfaceDescriptor(IBinder binder) {
            try {
                String interfaceDescriptor = binder.getInterfaceDescriptor();
                if (interfaceDescriptor == null) {
                    return BinderCallsListener.NULL_INTERFACE;
                }
                return interfaceDescriptor.isEmpty() ? BinderCallsListener.EMPTY_INTERFACE : interfaceDescriptor;
            } catch (RemoteException unused) {
                Log.w(BinderCallsListener.TAG, "Unable to read interface descriptor.");
                return BinderCallsListener.UNKNOWN_INTERFACE;
            }
        }

        public long getTimeSpentInBinderCalls() {
            return this.mTotalTimeSpentInBinderCallsMillis;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            if (!ThreadUtils.runningOnUiThread()) {
                return null;
            }
            String name = method.getName();
            name.hashCode();
            boolean z = false;
            if (!name.equals("onTransactEnded")) {
                if (!name.equals("onTransactStarted")) {
                    return null;
                }
                IBinder iBinder = (IBinder) args[0];
                this.mCurrentTransactionId++;
                this.mCurrentTransactionStartTimeMillis = SystemClock.uptimeMillis();
                String interfaceDescriptor = getInterfaceDescriptor(iBinder);
                this.mCurrentInterfaceDescriptor = interfaceDescriptor;
                if (interfaceDescriptor.equals(BinderCallsListener.UNKNOWN_INTERFACE)) {
                    return null;
                }
                boolean z2 = !BinderCallsListener.sSlowBinderCallAllowList.contains(this.mCurrentInterfaceDescriptor);
                if (isAndroidBinderInterface(this.mCurrentInterfaceDescriptor)) {
                    z = z2;
                } else {
                    this.mCurrentInterfaceDescriptor = BinderCallsListener.NON_ANDROID_INTERFACE;
                }
                BiConsumer<String, String> biConsumer = this.mObserver;
                if (biConsumer != null) {
                    biConsumer.accept("onTransactStarted", this.mCurrentInterfaceDescriptor);
                }
                if (z) {
                    return Integer.valueOf(this.mCurrentTransactionId);
                }
                return null;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.mCurrentTransactionStartTimeMillis;
            TraceEvent.instantAndroidIPC("BinderCallsListener#" + this.mCurrentInterfaceDescriptor, uptimeMillis);
            this.mTotalTimeSpentInBinderCallsMillis = this.mTotalTimeSpentInBinderCallsMillis + uptimeMillis;
            BiConsumer<String, String> biConsumer2 = this.mObserver;
            if (biConsumer2 != null) {
                biConsumer2.accept("onTransactEnded", this.mCurrentInterfaceDescriptor);
            }
            Integer num = (Integer) args[0];
            if (num != null && num.intValue() == this.mCurrentTransactionId && uptimeMillis >= 2) {
                Log.w(BinderCallsListener.TAG, "This is not a crash. BinderCallsListener detected a slow call on the UI thread by: " + this.mCurrentInterfaceDescriptor + " with duration=" + uptimeMillis + "ms (max allowed: 2ms)");
            }
            return null;
        }
    }
}
