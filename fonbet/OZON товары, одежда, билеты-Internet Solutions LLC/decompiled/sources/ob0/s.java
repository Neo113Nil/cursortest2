package ob0;

import C.o0;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f77982a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f77983b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f77984c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e f77985d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final g f77986e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b f77987f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BlockAntibot;
        public static final a PassAntibot;

        @NotNull
        private final String trackingValue;

        static {
            a aVar = new a("BlockAntibot", 0, "blockAntibot");
            BlockAntibot = aVar;
            a aVar2 = new a("PassAntibot", 1, "passAntibot");
            PassAntibot = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.trackingValue = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.trackingValue;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f77988a;

        /* renamed from: b, reason: collision with root package name */
        private final d f77989b;

        public b(@NotNull c status, d dVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f77988a = status;
            this.f77989b = dVar;
        }

        @NotNull
        public final c a() {
            return this.f77988a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f77988a == bVar.f77988a && Intrinsics.d(this.f77989b, bVar.f77989b);
        }

        public final int hashCode() {
            int hashCode = this.f77988a.hashCode() * 31;
            d dVar = this.f77989b;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "CaptchaChallengeResult(status=" + this.f77988a + ", errorDetails=" + this.f77989b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c CaptchaChallengeBlock;
        public static final c CaptchaChallengeNetworkError;
        public static final c CaptchaChallengeNoCheck;
        public static final c CaptchaChallengeNoUrl;
        public static final c CaptchaChallengeNoWebViewError;
        public static final c CaptchaChallengeNotValidUrl;
        public static final c CaptchaChallengeSuccess;
        public static final c CaptchaChallengeTimeoutError;
        public static final c CaptchaChallengeWebViewClosed;
        public static final c CaptchaChallengeWebViewError;

        @NotNull
        private final String trackingValue;
        private final int uiCode;

        static {
            c cVar = new c("CaptchaChallengeNoUrl", 0, 0, "captchaChallengeNoUrl");
            CaptchaChallengeNoUrl = cVar;
            c cVar2 = new c("CaptchaChallengeNotValidUrl", 1, 1, "captchaChallengeNotValidUrl");
            CaptchaChallengeNotValidUrl = cVar2;
            c cVar3 = new c("CaptchaChallengeNoCheck", 2, 2, "captchaChallengeNoCheck");
            CaptchaChallengeNoCheck = cVar3;
            c cVar4 = new c("CaptchaChallengeSuccess", 3, 3, "captchaChallengeSuccess");
            CaptchaChallengeSuccess = cVar4;
            c cVar5 = new c("CaptchaChallengeBlock", 4, 4, "captchaChallengeBlock");
            CaptchaChallengeBlock = cVar5;
            c cVar6 = new c("CaptchaChallengeNetworkError", 5, 5, "captchaChallengeNetworkError");
            CaptchaChallengeNetworkError = cVar6;
            c cVar7 = new c("CaptchaChallengeTimeoutError", 6, 6, "captchaChallengeTimeoutError");
            CaptchaChallengeTimeoutError = cVar7;
            c cVar8 = new c("CaptchaChallengeWebViewError", 7, 7, "captchaChallengeWebViewError");
            CaptchaChallengeWebViewError = cVar8;
            c cVar9 = new c("CaptchaChallengeNoWebViewError", 8, 8, "captchaChallengeNoWebViewError");
            CaptchaChallengeNoWebViewError = cVar9;
            c cVar10 = new c("CaptchaChallengeWebViewClosed", 9, 9, "captchaChallengeWebViewClosed");
            CaptchaChallengeWebViewClosed = cVar10;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c(String str, int i11, int i12, String str2) {
            this.uiCode = i12;
            this.trackingValue = str2;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.trackingValue;
        }

        public final int b() {
            return this.uiCode;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f77990a;

        /* renamed from: b, reason: collision with root package name */
        private final String f77991b;

        /* renamed from: c, reason: collision with root package name */
        private final String f77992c;

        public d(String str, String str2, String str3) {
            this.f77990a = str;
            this.f77991b = str2;
            this.f77992c = str3;
        }

        public final String a() {
            return this.f77991b;
        }

        public final String b() {
            return this.f77992c;
        }

        public final String c() {
            return this.f77990a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f77990a, dVar.f77990a) && Intrinsics.d(this.f77991b, dVar.f77991b) && Intrinsics.d(this.f77992c, dVar.f77992c);
        }

        public final int hashCode() {
            String str = this.f77990a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f77991b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f77992c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChallengeWebViewError(requestUrl=");
            sb2.append(this.f77990a);
            sb2.append(", errorCode=");
            sb2.append(this.f77991b);
            sb2.append(", errorDescription=");
            return o0.c(sb2, this.f77992c, ")");
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final f f77993a;

        /* renamed from: b, reason: collision with root package name */
        private final long f77994b;

        public /* synthetic */ e(f fVar) {
            this(fVar, 0L);
        }

        public final long a() {
            return this.f77994b;
        }

        @NotNull
        public final f b() {
            return this.f77993a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f77993a == eVar.f77993a && this.f77994b == eVar.f77994b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f77994b) + (this.f77993a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "FingerprintChallengeResult(status=" + this.f77993a + ", durationMs=" + this.f77994b + ")";
        }

        public e(@NotNull f status, long j11) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f77993a = status;
            this.f77994b = j11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ f[] $VALUES;
        public static final f FingerprintChallengeBlock;
        public static final f FingerprintChallengeError;
        public static final f FingerprintChallengeNoNeed;
        public static final f FingerprintChallengeSuccess;
        public static final f FingerprintChallengeTimeout;

        @NotNull
        private final String trackingValue;
        private final int uiCode;

        static {
            f fVar = new f("FingerprintChallengeNoNeed", 0, 0, "mfChallengeNoNeed");
            FingerprintChallengeNoNeed = fVar;
            f fVar2 = new f("FingerprintChallengeSuccess", 1, 1, "mfChallengeSuccess");
            FingerprintChallengeSuccess = fVar2;
            f fVar3 = new f("FingerprintChallengeBlock", 2, 2, "mfChallengeBlock");
            FingerprintChallengeBlock = fVar3;
            f fVar4 = new f("FingerprintChallengeError", 3, 3, "mfChallengeError");
            FingerprintChallengeError = fVar4;
            f fVar5 = new f("FingerprintChallengeTimeout", 4, 4, "mfChallengeTimeoutError");
            FingerprintChallengeTimeout = fVar5;
            f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
            $VALUES = fVarArr;
            $ENTRIES = Xc.b.a(fVarArr);
        }

        private f(String str, int i11, int i12, String str2) {
            this.uiCode = i12;
            this.trackingValue = str2;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.trackingValue;
        }

        public final int b() {
            return this.uiCode;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class h {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ h[] $VALUES;
        public static final h JsChallengeBlock;
        public static final h JsChallengeLoopError;
        public static final h JsChallengeNetworkError;
        public static final h JsChallengeNoCheck;
        public static final h JsChallengeNoUrl;
        public static final h JsChallengeNoWebViewError;
        public static final h JsChallengeNotValidUrl;
        public static final h JsChallengeSuccess;
        public static final h JsChallengeTimeoutError;
        public static final h JsChallengeWebViewError;

        @NotNull
        private final String trackingValue;
        private final int uiCode;

        static {
            h hVar = new h("JsChallengeNoUrl", 0, 0, "jsChallengeNoUrl");
            JsChallengeNoUrl = hVar;
            h hVar2 = new h("JsChallengeNotValidUrl", 1, 1, "jsChallengeNotValidUrl");
            JsChallengeNotValidUrl = hVar2;
            h hVar3 = new h("JsChallengeNoCheck", 2, 2, "jsChallengeNoCheck");
            JsChallengeNoCheck = hVar3;
            h hVar4 = new h("JsChallengeSuccess", 3, 3, "jsChallengeSuccess");
            JsChallengeSuccess = hVar4;
            h hVar5 = new h("JsChallengeBlock", 4, 4, "jsChallengeBlock");
            JsChallengeBlock = hVar5;
            h hVar6 = new h("JsChallengeNetworkError", 5, 5, "jsChallengeNetworkError");
            JsChallengeNetworkError = hVar6;
            h hVar7 = new h("JsChallengeTimeoutError", 6, 6, "jsChallengeTimeoutError");
            JsChallengeTimeoutError = hVar7;
            h hVar8 = new h("JsChallengeWebViewError", 7, 7, "jsChallengeWebViewError");
            JsChallengeWebViewError = hVar8;
            h hVar9 = new h("JsChallengeLoopError", 8, 8, "jsChallengeLoopError");
            JsChallengeLoopError = hVar9;
            h hVar10 = new h("JsChallengeNoWebViewError", 9, 9, "jsChallengeNoWebViewError");
            JsChallengeNoWebViewError = hVar10;
            h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10};
            $VALUES = hVarArr;
            $ENTRIES = Xc.b.a(hVarArr);
        }

        private h(String str, int i11, int i12, String str2) {
            this.uiCode = i12;
            this.trackingValue = str2;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.trackingValue;
        }

        public final int b() {
            return this.uiCode;
        }
    }

    public s(@NotNull String incidentId, boolean z11, @NotNull a overallResult, @NotNull e fingerprintChallengeResult, @NotNull g jsChallengeResult, @NotNull b captchaChallengeResult) {
        Intrinsics.checkNotNullParameter(incidentId, "incidentId");
        Intrinsics.checkNotNullParameter(overallResult, "overallResult");
        Intrinsics.checkNotNullParameter(fingerprintChallengeResult, "fingerprintChallengeResult");
        Intrinsics.checkNotNullParameter(jsChallengeResult, "jsChallengeResult");
        Intrinsics.checkNotNullParameter(captchaChallengeResult, "captchaChallengeResult");
        this.f77982a = incidentId;
        this.f77983b = z11;
        this.f77984c = overallResult;
        this.f77985d = fingerprintChallengeResult;
        this.f77986e = jsChallengeResult;
        this.f77987f = captchaChallengeResult;
    }

    public static s a(s sVar, boolean z11) {
        String incidentId = sVar.f77982a;
        a overallResult = sVar.f77984c;
        e fingerprintChallengeResult = sVar.f77985d;
        g jsChallengeResult = sVar.f77986e;
        b captchaChallengeResult = sVar.f77987f;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(incidentId, "incidentId");
        Intrinsics.checkNotNullParameter(overallResult, "overallResult");
        Intrinsics.checkNotNullParameter(fingerprintChallengeResult, "fingerprintChallengeResult");
        Intrinsics.checkNotNullParameter(jsChallengeResult, "jsChallengeResult");
        Intrinsics.checkNotNullParameter(captchaChallengeResult, "captchaChallengeResult");
        return new s(incidentId, z11, overallResult, fingerprintChallengeResult, jsChallengeResult, captchaChallengeResult);
    }

    @NotNull
    public final b b() {
        return this.f77987f;
    }

    @NotNull
    public final e c() {
        return this.f77985d;
    }

    @NotNull
    public final g d() {
        return this.f77986e;
    }

    @NotNull
    public final a e() {
        return this.f77984c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f77982a, sVar.f77982a) && this.f77983b == sVar.f77983b && this.f77984c == sVar.f77984c && Intrinsics.d(this.f77985d, sVar.f77985d) && Intrinsics.d(this.f77986e, sVar.f77986e) && Intrinsics.d(this.f77987f, sVar.f77987f);
    }

    public final boolean f() {
        return this.f77983b;
    }

    public final int hashCode() {
        return this.f77987f.hashCode() + ((this.f77986e.hashCode() + ((this.f77985d.hashCode() + ((this.f77984c.hashCode() + C3532b.a(this.f77982a.hashCode() * 31, 31, this.f77983b)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AntibotFlowResult(incidentId=" + this.f77982a + ", shouldRetryRequest=" + this.f77983b + ", overallResult=" + this.f77984c + ", fingerprintChallengeResult=" + this.f77985d + ", jsChallengeResult=" + this.f77986e + ", captchaChallengeResult=" + this.f77987f + ")";
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final h f77995a;

        /* renamed from: b, reason: collision with root package name */
        private final long f77996b;

        /* renamed from: c, reason: collision with root package name */
        private final d f77997c;

        public g(@NotNull h status, long j11, d dVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f77995a = status;
            this.f77996b = j11;
            this.f77997c = dVar;
        }

        public static g a(g gVar, long j11) {
            h status = gVar.f77995a;
            d dVar = gVar.f77997c;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(status, "status");
            return new g(status, j11, dVar);
        }

        public final long b() {
            return this.f77996b;
        }

        public final d c() {
            return this.f77997c;
        }

        @NotNull
        public final h d() {
            return this.f77995a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f77995a == gVar.f77995a && this.f77996b == gVar.f77996b && Intrinsics.d(this.f77997c, gVar.f77997c);
        }

        public final int hashCode() {
            int a11 = Pk0.c.a(this.f77995a.hashCode() * 31, 31, this.f77996b);
            d dVar = this.f77997c;
            return a11 + (dVar == null ? 0 : dVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "JsChallengeResult(status=" + this.f77995a + ", durationMs=" + this.f77996b + ", errorDetails=" + this.f77997c + ")";
        }

        public /* synthetic */ g(h hVar, d dVar, int i11) {
            this(hVar, 0L, (i11 & 4) != 0 ? null : dVar);
        }
    }
}
