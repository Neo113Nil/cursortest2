package com.appsflyer.internal;

import Sc.InterfaceC4008j;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1zSDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u0016*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0012\u0010\u0017J\u000f\u0010\u000b\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u000b\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u0014\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0015\u0010!\u001a\u00020\u00188\u0003X\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010)R\u001b\u0010\u000e\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b\u001e\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFf1vSDK;", "Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFh1xSDK;", "Lcom/appsflyer/internal/AFd1mSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1mSDK;)V", "", "force", "()Z", "", "AFInAppEventType", "(I)Z", "Landroid/content/Context;", "valueOf", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFf1vSDK$AFa1vSDK;", "p1", "AFKeystoreWrapper", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1vSDK$AFa1vSDK;)Z", "values", "", "", "(Lcom/appsflyer/internal/AFh1xSDK;Ljava/lang/String;)V", "", "()J", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFe1dSDK;", "()Lcom/appsflyer/internal/AFe1dSDK;", "Lcom/appsflyer/internal/AFd1kSDK;", "registerClient", "Lcom/appsflyer/internal/AFd1kSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "AFLogger", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1qSDK;", "d", "Lcom/appsflyer/internal/AFd1qSDK;", "e", "unregisterClient", "Lcom/appsflyer/internal/AFh1xSDK;", "LSc/j;", "w", "AFa1tSDK", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1vSDK extends AFe1eSDK<AFh1xSDK> {

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK AFInAppEventType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFd1qSDK e;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j AFLogger;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final AFd1kSDK AFKeystoreWrapper;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @NotNull
    private final AFh1xSDK values;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j valueOf;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1vSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Long> {
        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            Long y02;
            String AFInAppEventParameterName = AFf1vSDK.this.AFInAppEventType.AFInAppEventParameterName("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((AFInAppEventParameterName == null || (y02 = kotlin.text.h.y0(AFInAppEventParameterName)) == null) ? 1000L : y02.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1vSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<Boolean> {
        AnonymousClass4() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1vSDK.this.AFInAppEventType.AFInAppEventParameterName("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\f\b\u0002\u0010\u0011\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\f\u001a\u00060\nj\u0002`\u000bHÇ\u0003¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\f\b\u0002\u0010\u0011\u001a\u00060\nj\u0002`\u000bHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u0004R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00060\nj\u0002`\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\rR$\u0010'\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u0007\"\u0004\b)\u0010*"}, d2 = {"Lcom/appsflyer/internal/AFf1vSDK$AFa1vSDK;", "", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "component4", "()Ljava/lang/StringBuilder;", "p0", "p1", "p2", "p3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1vSDK$AFa1vSDK;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "advertisingId", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "advertisingIdWithGps", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "gaidError", "Ljava/lang/StringBuilder;", "getGaidError", "isLimitAdTrackingEnabled", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final /* data */ class AFa1vSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1vSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1vSDK copy$default(AFa1vSDK aFa1vSDK, String str, Boolean bool, boolean z11, StringBuilder sb2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aFa1vSDK.advertisingId;
            }
            if ((i11 & 2) != 0) {
                bool = aFa1vSDK.isLimitAdTrackingEnabled;
            }
            if ((i11 & 4) != 0) {
                z11 = aFa1vSDK.advertisingIdWithGps;
            }
            if ((i11 & 8) != 0) {
                sb2 = aFa1vSDK.gaidError;
            }
            return aFa1vSDK.copy(str, bool, z11, sb2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

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
        public final AFa1vSDK copy(String p02, Boolean p12, boolean p22, @NotNull StringBuilder p32) {
            Intrinsics.checkNotNullParameter(p32, "gaidError");
            return new AFa1vSDK(p02, p12, p22, p32);
        }

        public final boolean equals(Object p02) {
            if (this == p02) {
                return true;
            }
            if (!(p02 instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) p02;
            return Intrinsics.d(this.advertisingId, aFa1vSDK.advertisingId) && Intrinsics.d(this.isLimitAdTrackingEnabled, aFa1vSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1vSDK.advertisingIdWithGps && Intrinsics.d(this.gaidError, aFa1vSDK.gaidError);
        }

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

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z11 = this.advertisingIdWithGps;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return this.gaidError.hashCode() + ((hashCode2 + i11) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z11) {
            this.advertisingIdWithGps = z11;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "AFa1vSDK(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ')';
        }

        public AFa1vSDK(String str, Boolean bool, boolean z11, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z11;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1vSDK(String str, Boolean bool, boolean z11, StringBuilder sb2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AFa1ySDK implements CloudDevCallback {
        final /* synthetic */ AFa1vSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1ySDK(AFa1vSDK aFa1vSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1vSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFLogger.afWarnLog("Could not fetch GAID using CloudDevSdk: " + reason);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFLogger.afRDLog("CloudDevCallback received onSuccess");
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1vSDK(@NotNull AFd1mSDK aFd1mSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        AFd1kSDK w11 = aFd1mSDK.w();
        Intrinsics.checkNotNullExpressionValue(w11, "");
        this.AFKeystoreWrapper = w11;
        AFd1sSDK AFInAppEventType = aFd1mSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.AFInAppEventType = AFInAppEventType;
        AFd1qSDK afErrorLogForExcManagerOnly = aFd1mSDK.afErrorLogForExcManagerOnly();
        Intrinsics.checkNotNullExpressionValue(afErrorLogForExcManagerOnly, "");
        this.e = afErrorLogForExcManagerOnly;
        this.values = new AFh1xSDK(null, null, null, null, null, null, null, null, 255, null);
        this.AFLogger = Sc.k.b(new AnonymousClass1());
        this.valueOf = Sc.k.b(new AnonymousClass4());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001b, B:8:0x002d, B:12:0x0032, B:13:0x0042, B:15:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFKeystoreWrapper(Context p02, AFa1vSDK p12) throws IllegalStateException {
        try {
            AFb1zSDK.AFa1uSDK valueOf = AFb1zSDK.valueOf(p02);
            p12.setAdvertisingId(valueOf.valueOf);
            p12.setLimitAdTrackingEnabled(Boolean.valueOf(valueOf.values()));
            String advertisingId = p12.getAdvertisingId();
            if (advertisingId != null) {
                if (advertisingId.length() == 0) {
                }
                if (Unit.f71690a == null) {
                    return true;
                }
                p12.getGaidError().append("gpsAdInfo-null (bypass) |");
                throw new IllegalStateException("GpsAdInfo is null (bypass)");
            }
            p12.getGaidError().append("emptyOrNull (bypass) |");
            if (Unit.f71690a == null) {
            }
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Failed to fetch GAID: ");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2, true, false, false);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th2.toString();
            }
            AFLogger.afInfoLog(localizedMessage);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[LOOP:0: B:2:0x0003->B:10:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[EDGE_INSN: B:11:0x0030->B:12:0x0030 BREAK  A[LOOP:0: B:2:0x0003->B:10:0x002d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean force() {
        boolean z11 = false;
        for (int i11 = 2; i11 > 0; i11--) {
            if (registerClient() && AFKeystoreWrapper(i11)) {
                AFLogger.afRDLog("GAID fetched using Samsung Cloud dev SDK");
            } else if (!AFInAppEventType(i11)) {
                AFLogger.afRDLog("Failed to fetch GAID");
                z11 = false;
                if (!z11) {
                    break;
                }
            } else {
                AFLogger.afRDLog("GAID fetched using GMS");
            }
            z11 = true;
            if (!z11) {
            }
        }
        this.e.f57393e = this.values;
        return z11;
    }

    private final boolean registerClient() {
        return ((Boolean) this.valueOf.getValue()).booleanValue();
    }

    private static boolean unregisterClient() {
        String obj;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            if (th2 instanceof ClassNotFoundException) {
                obj = "CloudDevSdk not found";
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected exception while checking if running in cloud environment: ");
                sb2.append(th2.getMessage());
                obj = sb2.toString();
            }
            AFLogger.afErrorLog(obj, th2, true);
            return false;
        }
    }

    private static int valueOf(Context p02) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p02);
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th2);
            return -1;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @NotNull
    public final AFe1dSDK values() {
        if (this.e.AFInAppEventType()) {
            AFLogger.afRDLog("QUEUE: Advertising ID collection is disabled. Skipping fetching... ");
            return AFe1dSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(force());
        Boolean bool = Boolean.FALSE;
        AFe1dSDK aFe1dSDK = C7714v.b0(valueOf, bool, bool).contains(Boolean.TRUE) ? AFe1dSDK.SUCCESS : AFe1dSDK.FAILURE;
        AFd1qSDK aFd1qSDK = this.e;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
        StringBuilder sb2 = new StringBuilder("QUEUE: FetchAdvertisingIdTask: took ");
        sb2.append(aFe1mSDK.AFKeystoreWrapper);
        sb2.append("ms");
        AFLogger.afRDLog(sb2.toString());
        aFd1qSDK.AFInAppEventType(aFe1mSDK);
        return aFe1dSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFInAppEventType(int p02) {
        boolean z11;
        String obj;
        AFLogger.afInfoLog("Trying to fetch GAID...");
        AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
        Context context = this.AFKeystoreWrapper.valueOf;
        Intrinsics.f(context);
        int valueOf = valueOf(context);
        Context context2 = this.AFKeystoreWrapper.valueOf;
        Intrinsics.f(context2);
        if (!valueOf(context2, aFa1vSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.AFKeystoreWrapper.valueOf;
                Intrinsics.f(context3);
                if (AFKeystoreWrapper(context3, aFa1vSDK)) {
                    z11 = true;
                    obj = aFa1vSDK.getGaidError().toString();
                    if (obj != null && !kotlin.text.h.K(obj)) {
                        String obj2 = kotlin.text.h.z0(obj).toString();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(valueOf);
                        sb2.append(": ");
                        sb2.append(obj2);
                        obj = sb2.toString();
                    }
                    AFKeystoreWrapper(this.values, obj);
                    if (!z11) {
                        return false;
                    }
                }
            }
            z11 = false;
            obj = aFa1vSDK.getGaidError().toString();
            if (obj != null) {
                String obj22 = kotlin.text.h.z0(obj).toString();
                StringBuilder sb22 = new StringBuilder();
                sb22.append(valueOf);
                sb22.append(": ");
                sb22.append(obj22);
                obj = sb22.toString();
            }
            AFKeystoreWrapper(this.values, obj);
            if (!z11) {
            }
        }
        AFh1xSDK aFh1xSDK = this.values;
        aFh1xSDK.AFInAppEventType = aFa1vSDK.getAdvertisingId();
        aFh1xSDK.unregisterClient = aFa1vSDK.isLimitAdTrackingEnabled();
        aFh1xSDK.valueOf = aFa1vSDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r2.booleanValue()) : null;
        aFh1xSDK.AFInAppEventParameterName = Boolean.valueOf(aFa1vSDK.getAdvertisingIdWithGps());
        aFh1xSDK.AFKeystoreWrapper = Boolean.FALSE;
        aFh1xSDK.d = Boolean.valueOf(p02 != 2);
        return true;
    }

    private final boolean valueOf(Context p02, AFa1vSDK p12) throws IllegalStateException {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p02);
            if (advertisingIdInfo != null) {
                p12.setAdvertisingId(advertisingIdInfo.getId());
                p12.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p12.setAdvertisingIdWithGps(true);
                String advertisingId = p12.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    unit = Unit.f71690a;
                }
                p12.getGaidError().append("emptyOrNull |");
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Google Play Services is missing ");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        AFKeystoreWrapper(r9.values, r2.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b7, code lost:
    
        r0 = r2.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c1, code lost:
    
        if (r0.length() != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        r0 = r9.values;
        r0.AFInAppEventType = r2.getAdvertisingId();
        r2 = java.lang.Boolean.FALSE;
        r0.unregisterClient = r2;
        r4 = java.lang.Boolean.TRUE;
        r0.valueOf = r4;
        r0.AFInAppEventParameterName = r2;
        r0.AFKeystoreWrapper = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d9, code lost:
    
        if (r10 == 2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dc, code lost:
    
        r0.d = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r2.getGaidError().length() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r2.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean values(int p02) {
        String obj;
        AFLogger.afInfoLog("Trying to fetch GAID using Samsung Cloud Dev...");
        boolean z11 = false;
        if (unregisterClient()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.AFKeystoreWrapper.valueOf;
            Intrinsics.f(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.AFKeystoreWrapper.valueOf;
                    Intrinsics.f(context2);
                    cloudDevSdk2.request(context2, C7714v.a0("gaid"), new AFa1ySDK(aFa1vSDK, countDownLatch));
                    countDownLatch.await(((Number) this.AFLogger.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            obj = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th2 instanceof ClassNotFoundException) {
                            obj = "CloudDevSdk not found";
                        } else {
                            StringBuilder sb2 = new StringBuilder("Unexpected exception while fetching GAID using Samsung Cloud Dev ");
                            sb2.append(th2.getMessage());
                            obj = sb2.toString();
                        }
                        AFLogger.afErrorLog(obj, th2, true);
                        StringBuilder gaidError = aFa1vSDK.getGaidError();
                        gaidError.append(th2.getClass().getSimpleName());
                        gaidError.append(" |");
                    } finally {
                    }
                }
            }
        }
        AFLogger.afInfoLog("Not running in Samsung Cloud Environment. Try using GMS...");
        return false;
    }

    private final boolean AFKeystoreWrapper(int p02) {
        return values(p02);
    }

    private static void AFKeystoreWrapper(AFh1xSDK aFh1xSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1xSDK.values;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" | ");
            sb2.append(str);
            String obj = sb2.toString();
            if (obj != null) {
                str = obj;
            }
        }
        aFh1xSDK.values = str;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long AFInAppEventType() {
        return ((Number) this.AFLogger.getValue()).longValue();
    }
}
