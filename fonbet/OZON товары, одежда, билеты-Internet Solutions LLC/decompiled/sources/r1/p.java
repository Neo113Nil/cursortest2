package r1;

import B0.C2454a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f82828a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f82829b;

    /* renamed from: c, reason: collision with root package name */
    private final int f82830c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7799Q f82831d;

    /* renamed from: e, reason: collision with root package name */
    private final float f82832e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC7799Q f82833f;

    /* renamed from: g, reason: collision with root package name */
    private final float f82834g;

    /* renamed from: h, reason: collision with root package name */
    private final float f82835h;

    /* renamed from: i, reason: collision with root package name */
    private final int f82836i;

    /* renamed from: j, reason: collision with root package name */
    private final int f82837j;

    /* renamed from: k, reason: collision with root package name */
    private final float f82838k;

    /* renamed from: l, reason: collision with root package name */
    private final float f82839l;

    /* renamed from: m, reason: collision with root package name */
    private final float f82840m;

    /* renamed from: n, reason: collision with root package name */
    private final float f82841n;

    private p() {
        throw null;
    }

    public p(float f7, float f11, float f12, float f13, float f14, float f15, float f16, int i11, int i12, int i13, String str, List list, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2) {
        super(0);
        this.f82828a = str;
        this.f82829b = list;
        this.f82830c = i11;
        this.f82831d = abstractC7799Q;
        this.f82832e = f7;
        this.f82833f = abstractC7799Q2;
        this.f82834g = f11;
        this.f82835h = f12;
        this.f82836i = i12;
        this.f82837j = i13;
        this.f82838k = f13;
        this.f82839l = f14;
        this.f82840m = f15;
        this.f82841n = f16;
    }

    public final AbstractC7799Q b() {
        return this.f82831d;
    }

    public final float c() {
        return this.f82832e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<r1.g>] */
    @NotNull
    public final List<g> e() {
        return this.f82829b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f82828a, pVar.f82828a) && Intrinsics.d(this.f82831d, pVar.f82831d) && this.f82832e == pVar.f82832e && Intrinsics.d(this.f82833f, pVar.f82833f) && this.f82834g == pVar.f82834g && this.f82835h == pVar.f82835h && this.f82836i == pVar.f82836i && this.f82837j == pVar.f82837j && this.f82838k == pVar.f82838k && this.f82839l == pVar.f82839l && this.f82840m == pVar.f82840m && this.f82841n == pVar.f82841n && this.f82830c == pVar.f82830c && Intrinsics.d(this.f82829b, pVar.f82829b);
    }

    public final int h() {
        return this.f82830c;
    }

    public final int hashCode() {
        int c11 = H00.a.c(this.f82828a.hashCode() * 31, 31, this.f82829b);
        AbstractC7799Q abstractC7799Q = this.f82831d;
        int a11 = Pk0.b.a(this.f82832e, (c11 + (abstractC7799Q != null ? abstractC7799Q.hashCode() : 0)) * 31, 31);
        AbstractC7799Q abstractC7799Q2 = this.f82833f;
        return Integer.hashCode(this.f82830c) + Pk0.b.a(this.f82841n, Pk0.b.a(this.f82840m, Pk0.b.a(this.f82839l, Pk0.b.a(this.f82838k, C2454a.a(this.f82837j, C2454a.a(this.f82836i, Pk0.b.a(this.f82835h, Pk0.b.a(this.f82834g, (a11 + (abstractC7799Q2 != null ? abstractC7799Q2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final AbstractC7799Q i() {
        return this.f82833f;
    }

    public final float k() {
        return this.f82834g;
    }

    public final int l() {
        return this.f82836i;
    }

    public final int m() {
        return this.f82837j;
    }

    public final float n() {
        return this.f82838k;
    }

    public final float o() {
        return this.f82835h;
    }

    public final float q() {
        return this.f82840m;
    }

    public final float r() {
        return this.f82841n;
    }

    public final float s() {
        return this.f82839l;
    }
}
