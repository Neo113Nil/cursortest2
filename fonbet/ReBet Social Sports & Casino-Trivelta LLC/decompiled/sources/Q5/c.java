package Q5;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9380a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1510a f9381b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9382c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9383d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f9384e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9385f;

    /* renamed from: g, reason: collision with root package name */
    public final UserContext f9386g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewContext f9387h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f9388i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f9389j;

    /* renamed from: k, reason: collision with root package name */
    public final List f9390k;

    /* renamed from: l, reason: collision with root package name */
    public final List f9391l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9392m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9393n;

    /* renamed from: o, reason: collision with root package name */
    public final TraceParentInHeaderConfig f9394o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9395p;

    /* renamed from: q, reason: collision with root package name */
    public final String f9396q;

    /* renamed from: r, reason: collision with root package name */
    public final Function1 f9397r;

    /* renamed from: s, reason: collision with root package name */
    public final Function1 f9398s;

    /* renamed from: t, reason: collision with root package name */
    public final z f9399t;

    /* renamed from: u, reason: collision with root package name */
    public final List f9400u;

    public c(String applicationName, AbstractC1510a coralogixDomain, String publicKey, String version, Map labels, String environment, UserContext userContext, ViewContext viewContext, Map instrumentations, Map mobileVitalsOptions, List ignoreUrls, List ignoreErrors, boolean z10, int i10, TraceParentInHeaderConfig traceParentInHeader, boolean z11, String str, Function1 function1, Function1 function12, z userInteractionOptions, List networkCaptureConfig) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(coralogixDomain, "coralogixDomain");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        Intrinsics.checkNotNullParameter(instrumentations, "instrumentations");
        Intrinsics.checkNotNullParameter(mobileVitalsOptions, "mobileVitalsOptions");
        Intrinsics.checkNotNullParameter(ignoreUrls, "ignoreUrls");
        Intrinsics.checkNotNullParameter(ignoreErrors, "ignoreErrors");
        Intrinsics.checkNotNullParameter(traceParentInHeader, "traceParentInHeader");
        Intrinsics.checkNotNullParameter(userInteractionOptions, "userInteractionOptions");
        Intrinsics.checkNotNullParameter(networkCaptureConfig, "networkCaptureConfig");
        this.f9380a = applicationName;
        this.f9381b = coralogixDomain;
        this.f9382c = publicKey;
        this.f9383d = version;
        this.f9384e = labels;
        this.f9385f = environment;
        this.f9386g = userContext;
        this.f9387h = viewContext;
        this.f9388i = instrumentations;
        this.f9389j = mobileVitalsOptions;
        this.f9390k = ignoreUrls;
        this.f9391l = ignoreErrors;
        this.f9392m = z10;
        this.f9393n = i10;
        this.f9394o = traceParentInHeader;
        this.f9395p = z11;
        this.f9396q = str;
        this.f9397r = function1;
        this.f9398s = function12;
        this.f9399t = userInteractionOptions;
        this.f9400u = networkCaptureConfig;
    }

    public static /* synthetic */ c b(c cVar, String str, AbstractC1510a abstractC1510a, String str2, String str3, Map map, String str4, UserContext userContext, ViewContext viewContext, Map map2, Map map3, List list, List list2, boolean z10, int i10, TraceParentInHeaderConfig traceParentInHeaderConfig, boolean z11, String str5, Function1 function1, Function1 function12, z zVar, List list3, int i11, Object obj) {
        List list4;
        z zVar2;
        String str6 = (i11 & 1) != 0 ? cVar.f9380a : str;
        AbstractC1510a abstractC1510a2 = (i11 & 2) != 0 ? cVar.f9381b : abstractC1510a;
        String str7 = (i11 & 4) != 0 ? cVar.f9382c : str2;
        String str8 = (i11 & 8) != 0 ? cVar.f9383d : str3;
        Map map4 = (i11 & 16) != 0 ? cVar.f9384e : map;
        String str9 = (i11 & 32) != 0 ? cVar.f9385f : str4;
        UserContext userContext2 = (i11 & 64) != 0 ? cVar.f9386g : userContext;
        ViewContext viewContext2 = (i11 & 128) != 0 ? cVar.f9387h : viewContext;
        Map map5 = (i11 & 256) != 0 ? cVar.f9388i : map2;
        Map map6 = (i11 & 512) != 0 ? cVar.f9389j : map3;
        List list5 = (i11 & 1024) != 0 ? cVar.f9390k : list;
        List list6 = (i11 & 2048) != 0 ? cVar.f9391l : list2;
        boolean z12 = (i11 & 4096) != 0 ? cVar.f9392m : z10;
        int i12 = (i11 & 8192) != 0 ? cVar.f9393n : i10;
        String str10 = str6;
        TraceParentInHeaderConfig traceParentInHeaderConfig2 = (i11 & 16384) != 0 ? cVar.f9394o : traceParentInHeaderConfig;
        boolean z13 = (i11 & 32768) != 0 ? cVar.f9395p : z11;
        String str11 = (i11 & PKIFailureInfo.notAuthorized) != 0 ? cVar.f9396q : str5;
        Function1 function13 = (i11 & PKIFailureInfo.unsupportedVersion) != 0 ? cVar.f9397r : function1;
        Function1 function14 = (i11 & PKIFailureInfo.transactionIdInUse) != 0 ? cVar.f9398s : function12;
        z zVar3 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? cVar.f9399t : zVar;
        if ((i11 & PKIFailureInfo.badCertTemplate) != 0) {
            zVar2 = zVar3;
            list4 = cVar.f9400u;
        } else {
            list4 = list3;
            zVar2 = zVar3;
        }
        return cVar.a(str10, abstractC1510a2, str7, str8, map4, str9, userContext2, viewContext2, map5, map6, list5, list6, z12, i12, traceParentInHeaderConfig2, z13, str11, function13, function14, zVar2, list4);
    }

    public final c a(String applicationName, AbstractC1510a coralogixDomain, String publicKey, String version, Map labels, String environment, UserContext userContext, ViewContext viewContext, Map instrumentations, Map mobileVitalsOptions, List ignoreUrls, List ignoreErrors, boolean z10, int i10, TraceParentInHeaderConfig traceParentInHeader, boolean z11, String str, Function1 function1, Function1 function12, z userInteractionOptions, List networkCaptureConfig) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(coralogixDomain, "coralogixDomain");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        Intrinsics.checkNotNullParameter(instrumentations, "instrumentations");
        Intrinsics.checkNotNullParameter(mobileVitalsOptions, "mobileVitalsOptions");
        Intrinsics.checkNotNullParameter(ignoreUrls, "ignoreUrls");
        Intrinsics.checkNotNullParameter(ignoreErrors, "ignoreErrors");
        Intrinsics.checkNotNullParameter(traceParentInHeader, "traceParentInHeader");
        Intrinsics.checkNotNullParameter(userInteractionOptions, "userInteractionOptions");
        Intrinsics.checkNotNullParameter(networkCaptureConfig, "networkCaptureConfig");
        return new c(applicationName, coralogixDomain, publicKey, version, labels, environment, userContext, viewContext, instrumentations, mobileVitalsOptions, ignoreUrls, ignoreErrors, z10, i10, traceParentInHeader, z11, str, function1, function12, userInteractionOptions, networkCaptureConfig);
    }

    public final String c() {
        return this.f9380a;
    }

    public final Function1 d() {
        return this.f9397r;
    }

    public final Function1 e() {
        return this.f9398s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f9380a, cVar.f9380a) && Intrinsics.areEqual(this.f9381b, cVar.f9381b) && Intrinsics.areEqual(this.f9382c, cVar.f9382c) && Intrinsics.areEqual(this.f9383d, cVar.f9383d) && Intrinsics.areEqual(this.f9384e, cVar.f9384e) && Intrinsics.areEqual(this.f9385f, cVar.f9385f) && Intrinsics.areEqual(this.f9386g, cVar.f9386g) && Intrinsics.areEqual(this.f9387h, cVar.f9387h) && Intrinsics.areEqual(this.f9388i, cVar.f9388i) && Intrinsics.areEqual(this.f9389j, cVar.f9389j) && Intrinsics.areEqual(this.f9390k, cVar.f9390k) && Intrinsics.areEqual(this.f9391l, cVar.f9391l) && this.f9392m == cVar.f9392m && this.f9393n == cVar.f9393n && Intrinsics.areEqual(this.f9394o, cVar.f9394o) && this.f9395p == cVar.f9395p && Intrinsics.areEqual(this.f9396q, cVar.f9396q) && Intrinsics.areEqual(this.f9397r, cVar.f9397r) && Intrinsics.areEqual(this.f9398s, cVar.f9398s) && Intrinsics.areEqual(this.f9399t, cVar.f9399t) && Intrinsics.areEqual(this.f9400u, cVar.f9400u);
    }

    public final boolean f() {
        return this.f9392m;
    }

    public final AbstractC1510a g() {
        return this.f9381b;
    }

    public final boolean h() {
        return this.f9395p;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.f9380a.hashCode() * 31) + this.f9381b.hashCode()) * 31) + this.f9382c.hashCode()) * 31) + this.f9383d.hashCode()) * 31) + this.f9384e.hashCode()) * 31) + this.f9385f.hashCode()) * 31) + this.f9386g.hashCode()) * 31) + this.f9387h.hashCode()) * 31) + this.f9388i.hashCode()) * 31) + this.f9389j.hashCode()) * 31) + this.f9390k.hashCode()) * 31) + this.f9391l.hashCode()) * 31) + Boolean.hashCode(this.f9392m)) * 31) + Integer.hashCode(this.f9393n)) * 31) + this.f9394o.hashCode()) * 31) + Boolean.hashCode(this.f9395p)) * 31;
        String str = this.f9396q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function1 function1 = this.f9397r;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f9398s;
        return ((((hashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31) + this.f9399t.hashCode()) * 31) + this.f9400u.hashCode();
    }

    public final String i() {
        return this.f9385f;
    }

    public final List j() {
        return this.f9391l;
    }

    public final List k() {
        return this.f9390k;
    }

    public final Map l() {
        return this.f9388i;
    }

    public final Map m() {
        return this.f9384e;
    }

    public final Map n() {
        return this.f9389j;
    }

    public final List o() {
        return this.f9400u;
    }

    public final String p() {
        return this.f9396q;
    }

    public final String q() {
        return this.f9382c;
    }

    public final int r() {
        return this.f9393n;
    }

    public final TraceParentInHeaderConfig s() {
        return this.f9394o;
    }

    public final UserContext t() {
        return this.f9386g;
    }

    public String toString() {
        return "CoralogixOptions(applicationName=" + this.f9380a + ", coralogixDomain=" + this.f9381b + ", publicKey=" + this.f9382c + ", version=" + this.f9383d + ", labels=" + this.f9384e + ", environment=" + this.f9385f + ", userContext=" + this.f9386g + ", viewContext=" + this.f9387h + ", instrumentations=" + this.f9388i + ", mobileVitalsOptions=" + this.f9389j + ", ignoreUrls=" + this.f9390k + ", ignoreErrors=" + this.f9391l + ", collectIPData=" + this.f9392m + ", sessionSampleRate=" + this.f9393n + ", traceParentInHeader=" + this.f9394o + ", debug=" + this.f9395p + ", proxyUrl=" + this.f9396q + ", beforeSend=" + this.f9397r + ", beforeSendCallback=" + this.f9398s + ", userInteractionOptions=" + this.f9399t + ", networkCaptureConfig=" + this.f9400u + ")";
    }

    public final z u() {
        return this.f9399t;
    }

    public final String v() {
        return this.f9383d;
    }

    public final ViewContext w() {
        return this.f9387h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(String str, AbstractC1510a abstractC1510a, String str2, String str3, Map map, String str4, UserContext userContext, ViewContext viewContext, Map map2, Map map3, List list, List list2, boolean z10, int i10, TraceParentInHeaderConfig traceParentInHeaderConfig, boolean z11, String str5, Function1 function1, Function1 function12, z zVar, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, abstractC1510a, str2, str3, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, (32768 & i11) != 0 ? false : z11, (65536 & i11) != 0 ? null : str5, (131072 & i11) != 0 ? null : function1, (262144 & i11) != 0 ? null : function12, (524288 & i11) != 0 ? new z(null, null, 3, null) : zVar, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? CollectionsKt.emptyList() : list3);
        TraceParentInHeaderConfig traceParentInHeaderConfig2;
        Map emptyMap = (i11 & 16) != 0 ? MapsKt.emptyMap() : map;
        String str6 = (i11 & 32) != 0 ? "" : str4;
        UserContext userContext2 = (i11 & 64) != 0 ? new UserContext((String) null, (String) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null) : userContext;
        ViewContext viewContext2 = (i11 & 128) != 0 ? new ViewContext((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : viewContext;
        Map emptyMap2 = (i11 & 256) != 0 ? MapsKt.emptyMap() : map2;
        Map emptyMap3 = (i11 & 512) != 0 ? MapsKt.emptyMap() : map3;
        List emptyList = (i11 & 1024) != 0 ? CollectionsKt.emptyList() : list;
        List emptyList2 = (i11 & 2048) != 0 ? CollectionsKt.emptyList() : list2;
        boolean z12 = (i11 & 4096) != 0 ? true : z10;
        int i12 = (i11 & 8192) != 0 ? 100 : i10;
        int i13 = 3;
        boolean z13 = false;
        TraceParentInHeaderConfigOptions traceParentInHeaderConfigOptions = null;
        Object[] objArr = 0;
        if ((i11 & 16384) != 0) {
            traceParentInHeaderConfig2 = new TraceParentInHeaderConfig(z13, traceParentInHeaderConfigOptions, i13, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            traceParentInHeaderConfig2 = traceParentInHeaderConfig;
        }
    }
}
