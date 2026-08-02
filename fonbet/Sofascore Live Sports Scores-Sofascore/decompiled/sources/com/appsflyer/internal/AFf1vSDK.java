package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.joa;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\u000f\u001a\u00020\u00148FX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0015\u0010\u0011\u001a\u00020\u00148FX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFf1vSDK;", "", "Lcom/appsflyer/internal/AFc1hSDK;", "p0", "Lcom/appsflyer/internal/AFf1tSDK;", "p1", "Lcom/appsflyer/internal/AFc1gSDK;", "p2", "<init>", "(Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFf1tSDK;Lcom/appsflyer/internal/AFc1gSDK;)V", "", "d", "()J", "registerClient", "Lcom/appsflyer/internal/AFc1hSDK;", "unregisterClient", "Lcom/appsflyer/internal/AFf1tSDK;", "AFLogger", "Lcom/appsflyer/internal/AFc1gSDK;", "AFKeystoreWrapper", "", "Ljoa;", "AFa1zSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1vSDK {
    private static final long v = 86400;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final joa unregisterClient;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    public final AFc1gSDK AFKeystoreWrapper;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final joa AFLogger;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final AFc1hSDK d;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @NotNull
    public final AFf1tSDK registerClient;

    public AFf1vSDK(@NotNull AFc1hSDK aFc1hSDK, @NotNull AFf1tSDK aFf1tSDK, @NotNull AFc1gSDK aFc1gSDK) {
        aFc1hSDK.getClass();
        aFf1tSDK.getClass();
        aFc1gSDK.getClass();
        this.d = aFc1hSDK;
        this.registerClient = aFf1tSDK;
        this.AFKeystoreWrapper = aFc1gSDK;
        final int i = 0;
        this.unregisterClient = ypa.b(new Function0(this) { // from class: com.appsflyer.internal.q
            public final /* synthetic */ AFf1vSDK b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean AFLogger;
                int i2 = i;
                AFf1vSDK aFf1vSDK = this.b;
                switch (i2) {
                    case 0:
                        AFLogger = AFf1vSDK.AFLogger(aFf1vSDK);
                        break;
                    default:
                        AFLogger = AFf1vSDK.unregisterClient(aFf1vSDK);
                        break;
                }
                return Boolean.valueOf(AFLogger);
            }
        });
        final int i2 = 1;
        this.AFLogger = ypa.b(new Function0(this) { // from class: com.appsflyer.internal.q
            public final /* synthetic */ AFf1vSDK b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean AFLogger;
                int i22 = i2;
                AFf1vSDK aFf1vSDK = this.b;
                switch (i22) {
                    case 0:
                        AFLogger = AFf1vSDK.AFLogger(aFf1vSDK);
                        break;
                    default:
                        AFLogger = AFf1vSDK.unregisterClient(aFf1vSDK);
                        break;
                }
                return Boolean.valueOf(AFLogger);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AFLogger(AFf1vSDK aFf1vSDK) {
        return Boolean.parseBoolean(aFf1vSDK.d.AFLogger("com.appsflyer.rc.sandbox"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unregisterClient(AFf1vSDK aFf1vSDK) {
        return Boolean.parseBoolean(aFf1vSDK.d.AFLogger("com.appsflyer.rc.staging"));
    }

    public final long d() {
        Object u2gVar;
        String AFLogger = this.d.AFLogger("com.appsflyer.rc.cache.max-age-fallback");
        if (AFLogger == null) {
            return v;
        }
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Long.valueOf(Long.parseLong(AFLogger));
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.REMOTE_CONTROL;
            String message = a.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            AFLoggerBase.e$default(aFLogger, logTag, "Can't read maxAgeFallback from Manifest: ".concat(message), a, false, false, false, false, 120, null);
            u2gVar = Long.valueOf(v);
        }
        return ((Number) u2gVar).longValue();
    }
}
