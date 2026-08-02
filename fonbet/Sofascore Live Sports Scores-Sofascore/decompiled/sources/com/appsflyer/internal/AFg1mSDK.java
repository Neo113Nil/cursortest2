package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.zzl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJG\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\rJ'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\rJ'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\rJ\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010 \u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/appsflyer/internal/AFg1mSDK;", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "Lcom/appsflyer/internal/AFc1hSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1hSDK;)V", "Lcom/appsflyer/sdk_base/logger/LogTag;", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", com.mbridge.msdk.setting.i.a, "w", "v", "force", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V", "Lcom/appsflyer/AFLogger$LogLevel;", "unregisterClient", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/appsflyer/internal/AFc1hSDK;", "getShouldExtendMsg", "()Z", "AFLogger", "AFa1zSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFg1mSDK extends AFLoggerBase {

    @NotNull
    private final AFc1hSDK unregisterClient;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] AFLogger;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            AFLogger = iArr;
        }
    }

    public AFg1mSDK(@NotNull AFc1hSDK aFc1hSDK) {
        aFc1hSDK.getClass();
        this.unregisterClient = aFc1hSDK;
    }

    private final void unregisterClient(AFLogger.LogLevel p0, LogTag p1, String p2, Throwable p3) {
        if (p0.getLevel() <= AFa1zSDK.d().AFKeystoreWrapper.setImeiData().getEntries.getLevel()) {
            extendedMsg(p2, p1);
            switch (AFa1vSDK.AFLogger[p0.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    zzl.b();
                    break;
            }
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void d(@NotNull LogTag p0, @NotNull String p1, boolean p2) {
        p0.getClass();
        p1.getClass();
        unregisterClient(AFLogger.LogLevel.DEBUG, p0, p1, null);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void e(@NotNull LogTag p0, @NotNull String p1, @NotNull Throwable p2, boolean p3, boolean p4, boolean p5, boolean p6) {
        p0.getClass();
        p1.getClass();
        p2.getClass();
        if (p4) {
            unregisterClient(AFLogger.LogLevel.ERROR, p0, p1, p2);
        } else if (p3) {
            unregisterClient(AFLogger.LogLevel.DEBUG, p0, p1, null);
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void force(@NotNull LogTag p0, @NotNull String p1) {
        p0.getClass();
        p1.getClass();
        String AFLogger = this.unregisterClient.AFLogger("AF_DISABLE_LOGS_COMPLETELY");
        if (AFLogger != null ? Boolean.parseBoolean(AFLogger) : false) {
            return;
        }
        withTag(p1, p0);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AFa1zSDK.d().AFKeystoreWrapper.setImeiData().getEntries.getLevel();
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void i(@NotNull LogTag p0, @NotNull String p1, boolean p2) {
        p0.getClass();
        p1.getClass();
        unregisterClient(AFLogger.LogLevel.INFO, p0, p1, null);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void v(@NotNull LogTag p0, @NotNull String p1, boolean p2) {
        p0.getClass();
        p1.getClass();
        unregisterClient(AFLogger.LogLevel.VERBOSE, p0, p1, null);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void w(@NotNull LogTag p0, @NotNull String p1, boolean p2) {
        p0.getClass();
        p1.getClass();
        unregisterClient(AFLogger.LogLevel.WARNING, p0, p1, null);
    }
}
