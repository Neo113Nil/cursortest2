package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.AppState;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.protocol.Device;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class SystemEventsBreadcrumbsIntegration implements Integration, Closeable, AppState.AppStateListener {
    private final String[] actions;
    private final Context context;
    Handler customHandler;
    private volatile IntentFilter filter;
    private volatile HandlerThread handlerThread;
    private volatile boolean isClosed;
    private final AtomicBoolean isReceiverRegistered;
    private volatile boolean isStopped;
    private SentryAndroidOptions options;
    private BatteryState previousBatteryState;
    volatile SystemEventsBroadcastReceiver receiver;
    private final AutoClosableReentrantLock receiverLock;
    private IScopes scopes;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, getDefaultActionsInternal(), null);
    }

    public SystemEventsBreadcrumbsIntegration(Context context, Handler handler) {
        this(context, getDefaultActionsInternal(), handler);
    }

    SystemEventsBreadcrumbsIntegration(Context context, String[] strArr, Handler handler) {
        this.isClosed = false;
        this.isStopped = false;
        this.filter = null;
        this.handlerThread = null;
        this.isReceiverRegistered = new AtomicBoolean(false);
        this.receiverLock = new AutoClosableReentrantLock();
        this.customHandler = null;
        this.context = ContextUtils.getApplicationContext(context);
        this.actions = strArr;
        this.customHandler = handler;
    }

    public SystemEventsBreadcrumbsIntegration(Context context, List<String> list) {
        this.isClosed = false;
        this.isStopped = false;
        this.filter = null;
        this.handlerThread = null;
        this.isReceiverRegistered = new AtomicBoolean(false);
        this.receiverLock = new AutoClosableReentrantLock();
        this.customHandler = null;
        this.context = ContextUtils.getApplicationContext(context);
        String[] strArr = new String[list.size()];
        this.actions = strArr;
        list.toArray(strArr);
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        this.scopes = iScopes;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.options.isEnableSystemEventBreadcrumbs()));
        if (this.options.isEnableSystemEventBreadcrumbs()) {
            AppState.getInstance().addAppStateListener(this);
            if (ContextUtils.isForegroundImportance()) {
                registerReceiver(this.scopes, this.options);
            }
        }
    }

    private void registerReceiver(final IScopes iScopes, final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.isClosed && !this.isStopped && this.receiver == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.SystemEventsBreadcrumbsIntegration$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.this.m13375xce8519cc(iScopes, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        return;
     */
    /* renamed from: lambda$registerReceiver$0$io-sentry-android-core-SystemEventsBreadcrumbsIntegration, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ void m13375xce8519cc(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
        ISentryLifecycleToken acquire = this.receiverLock.acquire();
        try {
            if (!this.isClosed && !this.isStopped && this.receiver == null) {
                this.receiver = new SystemEventsBroadcastReceiver(iScopes, sentryAndroidOptions);
                if (this.filter == null) {
                    this.filter = new IntentFilter();
                    for (String str : this.actions) {
                        this.filter.addAction(str);
                    }
                }
                if (this.customHandler == null && this.handlerThread == null) {
                    this.handlerThread = new HandlerThread("SystemEventsReceiver", 10);
                    this.handlerThread.start();
                }
                try {
                    Handler handler = this.customHandler;
                    if (handler == null) {
                        handler = new Handler(this.handlerThread.getLooper());
                    }
                    ContextUtils.registerReceiver(this.context, sentryAndroidOptions, this.receiver, this.filter, handler);
                    if (!this.isReceiverRegistered.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        IntegrationUtils.addIntegrationToSdkVersion("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
                }
                if (acquire != null) {
                    acquire.close();
                }
            }
        } catch (Throwable th2) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void scheduleUnregisterReceiver() {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.SystemEventsBreadcrumbsIntegration$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SystemEventsBreadcrumbsIntegration.this.m13376x776299dd();
                }
            });
        } catch (RejectedExecutionException unused) {
            m13376x776299dd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: unregisterReceiver, reason: merged with bridge method [inline-methods] */
    public void m13376x776299dd() {
        ISentryLifecycleToken acquire = this.receiverLock.acquire();
        try {
            this.isStopped = true;
            SystemEventsBroadcastReceiver systemEventsBroadcastReceiver = this.receiver;
            this.receiver = null;
            if (acquire != null) {
                acquire.close();
            }
            if (systemEventsBroadcastReceiver != null) {
                this.context.unregisterReceiver(systemEventsBroadcastReceiver);
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ISentryLifecycleToken acquire = this.receiverLock.acquire();
        try {
            this.isClosed = true;
            this.filter = null;
            if (this.handlerThread != null) {
                this.handlerThread.quit();
            }
            this.handlerThread = null;
            if (acquire != null) {
                acquire.close();
            }
            AppState.getInstance().removeAppStateListener(this);
            scheduleUnregisterReceiver();
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static List<String> getDefaultActions() {
        return Arrays.asList(getDefaultActionsInternal());
    }

    private static String[] getDefaultActionsInternal() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
        if (this.scopes == null || this.options == null) {
            return;
        }
        this.isStopped = false;
        registerReceiver(this.scopes, this.options);
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        scheduleUnregisterReceiver();
    }

    final class SystemEventsBroadcastReceiver extends BroadcastReceiver {
        private static final long DEBOUNCE_WAIT_TIME_MS = 60000;
        private final Debouncer batteryChangedDebouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), 60000, 0);
        private final char[] buf = new char[64];
        private final SentryAndroidOptions options;
        private final IScopes scopes;

        SystemEventsBroadcastReceiver(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
            this.scopes = iScopes;
            this.options = sentryAndroidOptions;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BatteryState batteryState;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                batteryState = null;
            } else {
                if (this.batteryChangedDebouncer.checkForDebounce()) {
                    return;
                }
                Float batteryLevel = DeviceInfoUtil.getBatteryLevel(intent, this.options);
                BatteryState batteryState2 = new BatteryState(batteryLevel != null ? Integer.valueOf(batteryLevel.intValue()) : null, DeviceInfoUtil.isCharging(intent, this.options));
                if (batteryState2.equals(SystemEventsBreadcrumbsIntegration.this.previousBatteryState)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.previousBatteryState = batteryState2;
                batteryState = batteryState2;
            }
            Breadcrumb createBreadcrumb = createBreadcrumb(System.currentTimeMillis(), intent, action, batteryState);
            Hint hint = new Hint();
            hint.set(TypeCheckHint.ANDROID_INTENT, intent);
            this.scopes.addBreadcrumb(createBreadcrumb, hint);
        }

        String getStringAfterDotFast(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.buf.length;
            for (int i = length - 1; i >= 0; i--) {
                char charAt = str.charAt(i);
                if (charAt == '.') {
                    char[] cArr = this.buf;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return StringUtils.getStringAfterDot(str);
                }
                length2--;
                this.buf[length2] = charAt;
            }
            return str;
        }

        private Breadcrumb createBreadcrumb(long j, Intent intent, String str, BatteryState batteryState) {
            Bundle extras;
            Breadcrumb breadcrumb = new Breadcrumb(j);
            breadcrumb.setType("system");
            breadcrumb.setCategory("device.event");
            String stringAfterDotFast = getStringAfterDotFast(str);
            if (stringAfterDotFast != null) {
                breadcrumb.setData("action", stringAfterDotFast);
            }
            if (batteryState == null) {
                if (this.options.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                    HashMap hashMap = new HashMap(extras.size());
                    for (String str2 : extras.keySet()) {
                        try {
                            Object obj = extras.get(str2);
                            if (obj != null) {
                                hashMap.put(str2, obj.toString());
                            }
                        } catch (Throwable th) {
                            this.options.getLogger().log(SentryLevel.ERROR, th, "%s key of the %s action threw an error.", str2, str);
                        }
                    }
                    breadcrumb.setData("extras", hashMap);
                }
            } else {
                if (batteryState.level != null) {
                    breadcrumb.setData("level", batteryState.level);
                }
                if (batteryState.charging != null) {
                    breadcrumb.setData(Device.JsonKeys.CHARGING, batteryState.charging);
                }
            }
            breadcrumb.setLevel(SentryLevel.INFO);
            return breadcrumb;
        }
    }

    static final class BatteryState {
        private final Boolean charging;
        private final Integer level;

        BatteryState(Integer num, Boolean bool) {
            this.level = num;
            this.charging = bool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BatteryState)) {
                return false;
            }
            BatteryState batteryState = (BatteryState) obj;
            return Objects.equals(this.level, batteryState.level) && Objects.equals(this.charging, batteryState.charging);
        }

        public int hashCode() {
            return Objects.hash(this.level, this.charging);
        }
    }
}
