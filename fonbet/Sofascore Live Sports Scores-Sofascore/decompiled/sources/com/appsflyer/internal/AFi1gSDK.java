package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.SessionReadyListener;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1gSDK implements AFi1hSDK {

    @NotNull
    private final AFi1fSDK AFKeystoreWrapper;

    @NotNull
    private final AFd1zSDK<AFa1mSDK> AFLogger;

    @Nullable
    private volatile SessionReadyListener d;

    @NotNull
    private final AtomicBoolean i;

    @NotNull
    private final List<AFi1dSDK> registerClient;

    @NotNull
    private final AFd1zSDK<AFc1hSDK> unregisterClient;

    @NotNull
    private final AtomicBoolean w;

    public AFi1gSDK(@NotNull AFd1zSDK<AFc1hSDK> aFd1zSDK, @NotNull AFd1zSDK<AFa1mSDK> aFd1zSDK2) {
        aFd1zSDK.getClass();
        aFd1zSDK2.getClass();
        this.unregisterClient = aFd1zSDK;
        this.AFLogger = aFd1zSDK2;
        this.AFKeystoreWrapper = new AFi1fSDK();
        this.registerClient = new ArrayList();
        this.w = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
    }

    private final void AFLogger() {
        Object obj;
        if (this.i.get()) {
            return;
        }
        List<AFi1dSDK> list = this.registerClient;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((AFi1dSDK) it.next()).unregisterClient()) {
                    Iterator<T> it2 = this.registerClient.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (!((AFi1dSDK) obj).unregisterClient()) {
                                break;
                            }
                        }
                    }
                    AFi1dSDK aFi1dSDK = (AFi1dSDK) obj;
                    if (aFi1dSDK != null) {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, dmi.q("Condition not satisfied: ", aFi1dSDK.registerClient()), false, 4, null);
                        return;
                    }
                    return;
                }
            }
        }
        if (this.d == null) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "All conditions satisfied but no listener registered yet", false, 4, null);
        } else if (this.i.compareAndSet(false, true)) {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "All session readiness conditions satisfied, triggering callback", false, 4, null);
            e();
        }
    }

    private final void e() {
        SessionReadyListener sessionReadyListener = this.d;
        if (sessionReadyListener != null) {
            try {
                sessionReadyListener.onSessionReady();
            } catch (Throwable th) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Error in onSessionReady callback", th, false, false, false, false, 120, null);
            }
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void AFKeystoreWrapper() {
        synchronized (this.registerClient) {
            try {
                this.AFKeystoreWrapper.registerClient = false;
                Iterator<T> it = this.registerClient.iterator();
                while (it.hasNext()) {
                    ((AFi1dSDK) it.next()).AFLogger();
                }
                this.registerClient.clear();
                this.w.set(false);
                this.i.set(false);
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Session readiness evaluation finished", false, 4, null);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void N_(@NotNull Intent intent) {
        intent.getClass();
        synchronized (this.registerClient) {
            try {
                this.w.set(true);
                this.i.set(false);
                int d = ((AFc1hSDK) this.unregisterClient.unregisterClient.invoke()).AFKeystoreWrapper.d("appsFlyerCount", 0);
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.SDK_LIFECYCLE;
                AFLoggerBase.d$default(aFLogger, logTag, "Starting session readiness evaluation for launch counter: " + d, false, 4, null);
                if (d == 0) {
                    AFLoggerBase.d$default(aFLogger, logTag, "Conversion event: no additional conditions required", false, 4, null);
                } else if (((AFa1mSDK) this.AFLogger.unregisterClient.invoke()).e_(intent)) {
                    this.registerClient.add(this.AFKeystoreWrapper);
                    AFLoggerBase.d$default(aFLogger, logTag, "Added deeplink condition for launch event (has deeplink)", false, 4, null);
                } else {
                    AFLoggerBase.d$default(aFLogger, logTag, "Deeplink condition not needed for launch event (no deeplink)", false, 4, null);
                }
                AFLogger();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void d(@Nullable SessionReadyListener sessionReadyListener) {
        synchronized (this.registerClient) {
            try {
                this.d = sessionReadyListener;
                if (sessionReadyListener == null) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Session ready listener unregistered", false, 4, null);
                } else {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Session ready listener registered", false, 4, null);
                    if (this.w.get() && !this.i.get()) {
                        AFLogger();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final boolean registerClient() {
        return this.d != null;
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void unregisterClient() {
        if (this.AFKeystoreWrapper.registerClient) {
            return;
        }
        synchronized (this.registerClient) {
            try {
                AFi1fSDK aFi1fSDK = this.AFKeystoreWrapper;
                if (!aFi1fSDK.registerClient) {
                    aFi1fSDK.registerClient = true;
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Deeplink processed condition satisfied", false, 4, null);
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.SDK_LIFECYCLE;
                AFLoggerBase.d$default(aFLogger, logTag, "Deeplink condition satisfied", false, 4, null);
                if (!this.w.get()) {
                    AFLoggerBase.d$default(aFLogger, logTag, "Evaluation not started yet, condition will be checked when evaluation begins", false, 4, null);
                } else if (this.registerClient.contains(this.AFKeystoreWrapper)) {
                    AFLogger();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final boolean d() {
        synchronized (this.registerClient) {
            try {
                boolean z = false;
                if (!this.w.get()) {
                    return false;
                }
                List<AFi1dSDK> list = this.registerClient;
                if (list != null) {
                    if (!list.isEmpty()) {
                    }
                    z = true;
                    return z;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((AFi1dSDK) it.next()).unregisterClient()) {
                        break;
                    }
                }
                z = true;
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
