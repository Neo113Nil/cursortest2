package gh;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final o f10122n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10123a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10125c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10126d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10127e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10128f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10129g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10130h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10131i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10132k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10133l;

    /* renamed from: m, reason: collision with root package name */
    public String f10134m;

    static {
        o oVar = new o();
        f10122n = oVar;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        o oVar2 = new o();
        Intrinsics.checkNotNullParameter(oVar2, "<this>");
        Intrinsics.checkNotNullParameter(oVar2, "<this>");
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        o oVar3 = new o();
        Intrinsics.checkNotNullParameter(oVar3, "<this>");
        cg.a aVar = cg.b.f3911b;
        cg.e eVar = cg.e.f3919e;
        long f6 = cg.b.f(cg.d.f(Integer.MAX_VALUE, eVar), eVar);
        if (f6 < 0) {
            throw new IllegalArgumentException(d9.e.g(f6, "maxStale < 0: ").toString());
        }
        Intrinsics.checkNotNullParameter(oVar3, "<this>");
    }

    public c(boolean z5, boolean z7, int i5, int i10, boolean z10, boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, String str) {
        this.f10123a = z5;
        this.f10124b = z7;
        this.f10125c = i5;
        this.f10126d = i10;
        this.f10127e = z10;
        this.f10128f = z11;
        this.f10129g = z12;
        this.f10130h = i11;
        this.f10131i = i12;
        this.j = z13;
        this.f10132k = z14;
        this.f10133l = z15;
        this.f10134m = str;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        String str = this.f10134m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f10123a) {
            sb2.append("no-cache, ");
        }
        if (this.f10124b) {
            sb2.append("no-store, ");
        }
        int i5 = this.f10125c;
        if (i5 != -1) {
            sb2.append("max-age=");
            sb2.append(i5);
            sb2.append(", ");
        }
        int i10 = this.f10126d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.f10127e) {
            sb2.append("private, ");
        }
        if (this.f10128f) {
            sb2.append("public, ");
        }
        if (this.f10129g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.f10130h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f10131i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f10132k) {
            sb2.append("no-transform, ");
        }
        if (this.f10133l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String sb3 = sb2.toString();
        this.f10134m = sb3;
        return sb3;
    }
}
