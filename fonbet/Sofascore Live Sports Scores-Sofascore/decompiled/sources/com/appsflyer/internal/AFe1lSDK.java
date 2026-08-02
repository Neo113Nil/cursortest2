package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1lSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.L6;
import com.ironsource.U3;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import defpackage.dmi;
import defpackage.joa;
import defpackage.lnb;
import defpackage.vxd;
import defpackage.ypa;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000e\u0010\u0011J\u001d\u0010\t\u001a\u00020\u0013*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\t\u001a\u00020\rH\u0014¢\u0006\u0004\b\t\u0010\u0018J\u000f\u0010\u0010\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u0010\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\t\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0015\u0010\u0016\u001a\u00020\u00158BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010'R\u0015\u0010&\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010(\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFe1lSDK;", "Lcom/appsflyer/internal/AFe1vSDK;", "Lcom/appsflyer/internal/AFg1cSDK;", "Lcom/appsflyer/internal/AFc1aSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1aSDK;)V", "Landroid/content/Context;", "", "d", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1lSDK$AFa1ySDK;", "p1", "", "AFLogger", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1lSDK$AFa1ySDK;)Z", "unregisterClient", "(I)Z", "", "", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "", "registerClient", "()J", "()Z", "Lcom/appsflyer/internal/AFd1bSDK;", "()Lcom/appsflyer/internal/AFd1bSDK;", "Lcom/appsflyer/internal/AFc1cSDK;", "Lcom/appsflyer/internal/AFc1cSDK;", "Lcom/appsflyer/internal/AFc1hSDK;", "force", "Lcom/appsflyer/internal/AFc1hSDK;", "Lcom/appsflyer/internal/AFc1gSDK;", "w", "Lcom/appsflyer/internal/AFc1gSDK;", "AFKeystoreWrapper", "e", "Lcom/appsflyer/internal/AFg1cSDK;", "v", "Ljoa;", com.mbridge.msdk.setting.i.a, "AFa1zSDK", "AFa1ySDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1lSDK extends AFe1vSDK<AFg1cSDK> {

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AFg1cSDK AFLogger;

    /* renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFc1hSDK d;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final joa v;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final AFc1cSDK unregisterClient;

    /* renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final joa registerClient;

    /* renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final AFc1gSDK AFKeystoreWrapper;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "sdk_main_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1ySDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1uSDK(AFa1ySDK aFa1ySDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1ySDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            reason.getClass();
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, dmi.q("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            kinds.getClass();
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get(L6.X0));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1lSDK(@NotNull AFc1aSDK aFc1aSDK) {
        super(AFd1aSDK.AFKeystoreWrapper, new AFe1zSDK[0], "FetchAdvertisingIdTask");
        aFc1aSDK.getClass();
        final int i = 0;
        AFc1cSDK valueOf = aFc1aSDK.valueOf();
        valueOf.getClass();
        this.unregisterClient = valueOf;
        AFc1hSDK AFKeystoreWrapper = aFc1aSDK.AFKeystoreWrapper();
        AFKeystoreWrapper.getClass();
        this.d = AFKeystoreWrapper;
        AFc1gSDK imeiData = aFc1aSDK.setImeiData();
        imeiData.getClass();
        this.AFKeystoreWrapper = imeiData;
        this.AFLogger = new AFg1cSDK(null, null, null, null, null, null, null, null, 255, null);
        this.registerClient = ypa.b(new Function0(this) { // from class: com.appsflyer.internal.o
            public final /* synthetic */ AFe1lSDK b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long unregisterClient;
                boolean d;
                int i2 = i;
                AFe1lSDK aFe1lSDK = this.b;
                switch (i2) {
                    case 0:
                        unregisterClient = AFe1lSDK.unregisterClient(aFe1lSDK);
                        return Long.valueOf(unregisterClient);
                    default:
                        d = AFe1lSDK.d(aFe1lSDK);
                        return Boolean.valueOf(d);
                }
            }
        });
        final int i2 = 1;
        this.v = ypa.b(new Function0(this) { // from class: com.appsflyer.internal.o
            public final /* synthetic */ AFe1lSDK b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long unregisterClient;
                boolean d;
                int i22 = i2;
                AFe1lSDK aFe1lSDK = this.b;
                switch (i22) {
                    case 0:
                        unregisterClient = AFe1lSDK.unregisterClient(aFe1lSDK);
                        return Long.valueOf(unregisterClient);
                    default:
                        d = AFe1lSDK.d(aFe1lSDK);
                        return Boolean.valueOf(d);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        d(r21.AFLogger, r10.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d4, code lost:
    
        r0 = r10.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d8, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00de, code lost:
    
        if (r0.length() != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e1, code lost:
    
        r0 = r21.AFLogger;
        r0.d = r10.getAdvertisingId();
        r1 = java.lang.Boolean.FALSE;
        r0.unregisterClient = r1;
        r2 = java.lang.Boolean.TRUE;
        r0.AFKeystoreWrapper = r2;
        r0.AFLogger = r1;
        r0.registerClient = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f8, code lost:
    
        if (r22 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fa, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fb, code lost:
    
        r0.w = java.lang.Boolean.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0101, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (r10.getGaidError().length() <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        if (r10.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFLogger(int p0) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.ADVERTISING_ID;
        AFLoggerBase.i$default(aFLogger, logTag, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        boolean z = false;
        if (i()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.unregisterClient.d;
            context.getClass();
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.unregisterClient.d;
                    context2.getClass();
                    cloudDevSdk2.request(context2, kotlin.collections.a.c(L6.X0), new AFa1uSDK(aFa1ySDK, countDownLatch));
                    countDownLatch.await(((Number) this.registerClient.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1ySDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                    } catch (Throwable th2) {
                        if (aFa1ySDK.getGaidError().length() > 0) {
                            d(this.AFLogger, aFa1ySDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
            }
        }
        AFLoggerBase.i$default(aFLogger, logTag, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private static int d(Context p0) {
        try {
            return GoogleApiAvailability.e.b(p0, GoogleApiAvailabilityLight.a);
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private static boolean i() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : dmi.q("Unexpected exception while checking if running in cloud environment: ", th.getMessage()), th, true, false, false, false, 112, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return ((Number) this.registerClient.getValue()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0129 A[LOOP:0: B:7:0x001f->B:15:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012d A[EDGE_INSN: B:16:0x012d->B:17:0x012d BREAK  A[LOOP:0: B:7:0x001f->B:15:0x0129], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    @Override // com.appsflyer.internal.AFe1vSDK
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1bSDK unregisterClient() {
        boolean z;
        String obj;
        if (this.AFKeystoreWrapper.setAndroidIdData) {
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFd1bSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = 2;
        boolean z2 = false;
        while (i > 0) {
            if (((Boolean) this.v.getValue()).booleanValue() && AFLogger(i)) {
                AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.ADVERTISING_ID;
                AFLoggerBase.i$default(aFLogger, logTag, "Trying to fetch GAID...", false, 4, null);
                AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
                Context context = this.unregisterClient.d;
                context.getClass();
                int d = d(context);
                Context context2 = this.unregisterClient.d;
                context2.getClass();
                if (!unregisterClient(context2, aFa1ySDK)) {
                    String AFLogger = this.d.AFLogger("AF_ENABLE_GP_SERVICE_FALLBACK");
                    if (AFLogger != null ? Boolean.parseBoolean(AFLogger) : true) {
                        Context context3 = this.unregisterClient.d;
                        context3.getClass();
                        if (AFLogger(context3, aFa1ySDK)) {
                            z = true;
                            obj = aFa1ySDK.getGaidError().toString();
                            if (!StringsKt.R(obj)) {
                                obj = d + ": " + StringsKt.l0(obj).toString();
                            }
                            d(this.AFLogger, obj);
                            if (!z) {
                                AFLoggerBase.v$default(aFLogger, logTag, "Failed to fetch GAID", false, 4, null);
                                z2 = false;
                                if (!z2) {
                                    break;
                                }
                                i--;
                            }
                        }
                    }
                    z = false;
                    obj = aFa1ySDK.getGaidError().toString();
                    if (!StringsKt.R(obj)) {
                    }
                    d(this.AFLogger, obj);
                    if (!z) {
                    }
                }
                AFg1cSDK aFg1cSDK = this.AFLogger;
                aFg1cSDK.d = aFa1ySDK.getAdvertisingId();
                aFg1cSDK.unregisterClient = aFa1ySDK.isLimitAdTrackingEnabled();
                aFg1cSDK.AFKeystoreWrapper = aFa1ySDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r9.booleanValue()) : null;
                aFg1cSDK.AFLogger = Boolean.valueOf(aFa1ySDK.getAdvertisingIdWithGps());
                aFg1cSDK.registerClient = Boolean.FALSE;
                aFg1cSDK.w = Boolean.valueOf(i != 2);
                AFLoggerBase.v$default(aFLogger, logTag, "GAID fetched using GMS", false, 4, null);
            }
            z2 = true;
            if (!z2) {
            }
        }
        this.AFKeystoreWrapper.getInstance = this.AFLogger;
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean bool = Boolean.FALSE;
        AFd1bSDK aFd1bSDK = kotlin.collections.b.j(valueOf, bool, bool).contains(Boolean.TRUE) ? AFd1bSDK.SUCCESS : AFd1bSDK.FAILURE;
        AFc1gSDK aFc1gSDK = this.AFKeystoreWrapper;
        AFd1kSDK aFd1kSDK = new AFd1kSDK(System.currentTimeMillis() - currentTimeMillis);
        AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, vxd.m("QUEUE: FetchAdvertisingIdTask: took ", aFd1kSDK.registerClient, "ms"), false, 4, null);
        aFc1gSDK.d(aFd1kSDK);
        return aFd1bSDK;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010'R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFe1lSDK$AFa1ySDK;", "", "", "advertisingId", "", U3.j.M, "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1lSDK$AFa1ySDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AFa1ySDK {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public /* synthetic */ AFa1ySDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }

        public static /* synthetic */ AFa1ySDK copy$default(AFa1ySDK aFa1ySDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1ySDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1ySDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1ySDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1ySDK.gaidError;
            }
            return aFa1ySDK.copy(str, bool, z, sb);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1ySDK copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            gaidError.getClass();
            return new AFa1ySDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) other;
            return Intrinsics.c(this.advertisingId, aFa1ySDK.advertisingId) && Intrinsics.c(this.isLimitAdTrackingEnabled, aFa1ySDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1ySDK.advertisingIdWithGps && Intrinsics.c(this.gaidError, aFa1ySDK.gaidError);
        }

        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            return this.gaidError.hashCode() + dmi.e((hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.advertisingIdWithGps);
        }

        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1ySDK(@Nullable String str, @Nullable Boolean bool, boolean z, @NotNull StringBuilder sb) {
            sb.getClass();
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = sb;
        }

        public AFa1ySDK() {
            this(null, null, false, null, 15, null);
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(AFe1lSDK aFe1lSDK) {
        return Boolean.parseBoolean(aFe1lSDK.d.AFLogger("com.appsflyer.enable_instant_plays"));
    }

    private static void d(AFg1cSDK aFg1cSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFg1cSDK.force;
        if (str2 != null) {
            str = lnb.o(str2, " | ", str);
        }
        aFg1cSDK.force = str;
    }

    private static boolean AFLogger(Context p0, AFa1ySDK p1) throws IllegalStateException {
        try {
            AFb1lSDK.AFa1zSDK registerClient = AFb1lSDK.registerClient(p0);
            p1.setAdvertisingId(registerClient.unregisterClient);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(registerClient.AFKeystoreWrapper));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId != null && advertisingId.length() != 0) {
                return true;
            }
            p1.getGaidError().append("emptyOrNull (bypass) |");
            return true;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.ADVERTISING_ID;
            AFLoggerBase.e$default(aFLogger, logTag, dmi.q("Failed to fetch GAID: ", th.getMessage()), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFLoggerBase.i$default(aFLogger, logTag, localizedMessage, false, 4, null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long unregisterClient(AFe1lSDK aFe1lSDK) {
        Long k0;
        String AFLogger = aFe1lSDK.d.AFLogger("com.appsflyer.fetch_ids.timeout");
        if (AFLogger == null || (k0 = StringsKt.k0(AFLogger)) == null) {
            return 1000L;
        }
        return k0.longValue();
    }

    private final boolean unregisterClient(Context p0, AFa1ySDK p1) throws IllegalStateException {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p1.setAdvertisingId(advertisingIdInfo.getId());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    return true;
                }
                p1.getGaidError().append("emptyOrNull |");
                return true;
            }
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.ADVERTISING_ID;
            AFLoggerBase.e$default(aFLogger, logTag, dmi.q("Google Play Services is missing ", th.getMessage()), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFLoggerBase.i$default(aFLogger, logTag, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }
}
