package L4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.C3008l;
import com.bumptech.glide.load.resource.bitmap.C3009m;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.w;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.util.l;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f6965a;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f6969e;

    /* renamed from: f, reason: collision with root package name */
    public int f6970f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f6971g;

    /* renamed from: h, reason: collision with root package name */
    public int f6972h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6977m;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f6979o;

    /* renamed from: p, reason: collision with root package name */
    public int f6980p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6984t;

    /* renamed from: u, reason: collision with root package name */
    public Resources.Theme f6985u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6986v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6987w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6988x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6990z;

    /* renamed from: b, reason: collision with root package name */
    public float f6966b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.engine.j f6967c = com.bumptech.glide.load.engine.j.f29827e;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.h f6968d = com.bumptech.glide.h.NORMAL;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6973i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f6974j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f6975k = -1;

    /* renamed from: l, reason: collision with root package name */
    public com.bumptech.glide.load.g f6976l = O4.b.c();

    /* renamed from: n, reason: collision with root package name */
    public boolean f6978n = true;

    /* renamed from: q, reason: collision with root package name */
    public com.bumptech.glide.load.j f6981q = new com.bumptech.glide.load.j();

    /* renamed from: r, reason: collision with root package name */
    public Map f6982r = new com.bumptech.glide.util.b();

    /* renamed from: s, reason: collision with root package name */
    public Class f6983s = Object.class;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6989y = true;

    public static boolean H(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final boolean A() {
        return this.f6987w;
    }

    public final boolean B() {
        return this.f6986v;
    }

    public final boolean C(a aVar) {
        return Float.compare(aVar.f6966b, this.f6966b) == 0 && this.f6970f == aVar.f6970f && l.e(this.f6969e, aVar.f6969e) && this.f6972h == aVar.f6972h && l.e(this.f6971g, aVar.f6971g) && this.f6980p == aVar.f6980p && l.e(this.f6979o, aVar.f6979o) && this.f6973i == aVar.f6973i && this.f6974j == aVar.f6974j && this.f6975k == aVar.f6975k && this.f6977m == aVar.f6977m && this.f6978n == aVar.f6978n && this.f6987w == aVar.f6987w && this.f6988x == aVar.f6988x && this.f6967c.equals(aVar.f6967c) && this.f6968d == aVar.f6968d && this.f6981q.equals(aVar.f6981q) && this.f6982r.equals(aVar.f6982r) && this.f6983s.equals(aVar.f6983s) && l.e(this.f6976l, aVar.f6976l) && l.e(this.f6985u, aVar.f6985u);
    }

    public final boolean D() {
        return this.f6973i;
    }

    public final boolean E() {
        return G(8);
    }

    public boolean F() {
        return this.f6989y;
    }

    public final boolean G(int i10) {
        return H(this.f6965a, i10);
    }

    public final boolean I() {
        return this.f6978n;
    }

    public final boolean J() {
        return this.f6977m;
    }

    public final boolean K() {
        return G(2048);
    }

    public final boolean L() {
        return l.v(this.f6975k, this.f6974j);
    }

    public a M() {
        this.f6984t = true;
        return X();
    }

    public a N(boolean z10) {
        if (this.f6986v) {
            return clone().N(z10);
        }
        this.f6988x = z10;
        this.f6965a |= PKIFailureInfo.signerNotTrusted;
        return Y();
    }

    public a O() {
        return S(p.f30045e, new C3008l());
    }

    public a P() {
        return R(p.f30044d, new C3009m());
    }

    public a Q() {
        return R(p.f30043c, new y());
    }

    public final a R(p pVar, n nVar) {
        return W(pVar, nVar, false);
    }

    public final a S(p pVar, n nVar) {
        if (this.f6986v) {
            return clone().S(pVar, nVar);
        }
        g(pVar);
        return e0(nVar, false);
    }

    public a T(int i10, int i11) {
        if (this.f6986v) {
            return clone().T(i10, i11);
        }
        this.f6975k = i10;
        this.f6974j = i11;
        this.f6965a |= 512;
        return Y();
    }

    public a U(Drawable drawable) {
        if (this.f6986v) {
            return clone().U(drawable);
        }
        this.f6971g = drawable;
        int i10 = this.f6965a | 64;
        this.f6972h = 0;
        this.f6965a = i10 & (-129);
        return Y();
    }

    public a V(com.bumptech.glide.h hVar) {
        if (this.f6986v) {
            return clone().V(hVar);
        }
        this.f6968d = (com.bumptech.glide.h) com.bumptech.glide.util.k.d(hVar);
        this.f6965a |= 8;
        return Y();
    }

    public final a W(p pVar, n nVar, boolean z10) {
        a f02 = z10 ? f0(pVar, nVar) : S(pVar, nVar);
        f02.f6989y = true;
        return f02;
    }

    public final a Y() {
        if (this.f6984t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return X();
    }

    public a Z(com.bumptech.glide.load.i iVar, Object obj) {
        if (this.f6986v) {
            return clone().Z(iVar, obj);
        }
        com.bumptech.glide.util.k.d(iVar);
        com.bumptech.glide.util.k.d(obj);
        this.f6981q.e(iVar, obj);
        return Y();
    }

    public a a(a aVar) {
        if (this.f6986v) {
            return clone().a(aVar);
        }
        if (H(aVar.f6965a, 2)) {
            this.f6966b = aVar.f6966b;
        }
        if (H(aVar.f6965a, PKIFailureInfo.transactionIdInUse)) {
            this.f6987w = aVar.f6987w;
        }
        if (H(aVar.f6965a, PKIFailureInfo.badCertTemplate)) {
            this.f6990z = aVar.f6990z;
        }
        if (H(aVar.f6965a, 4)) {
            this.f6967c = aVar.f6967c;
        }
        if (H(aVar.f6965a, 8)) {
            this.f6968d = aVar.f6968d;
        }
        if (H(aVar.f6965a, 16)) {
            this.f6969e = aVar.f6969e;
            this.f6970f = 0;
            this.f6965a &= -33;
        }
        if (H(aVar.f6965a, 32)) {
            this.f6970f = aVar.f6970f;
            this.f6969e = null;
            this.f6965a &= -17;
        }
        if (H(aVar.f6965a, 64)) {
            this.f6971g = aVar.f6971g;
            this.f6972h = 0;
            this.f6965a &= -129;
        }
        if (H(aVar.f6965a, 128)) {
            this.f6972h = aVar.f6972h;
            this.f6971g = null;
            this.f6965a &= -65;
        }
        if (H(aVar.f6965a, 256)) {
            this.f6973i = aVar.f6973i;
        }
        if (H(aVar.f6965a, 512)) {
            this.f6975k = aVar.f6975k;
            this.f6974j = aVar.f6974j;
        }
        if (H(aVar.f6965a, 1024)) {
            this.f6976l = aVar.f6976l;
        }
        if (H(aVar.f6965a, 4096)) {
            this.f6983s = aVar.f6983s;
        }
        if (H(aVar.f6965a, 8192)) {
            this.f6979o = aVar.f6979o;
            this.f6980p = 0;
            this.f6965a &= -16385;
        }
        if (H(aVar.f6965a, 16384)) {
            this.f6980p = aVar.f6980p;
            this.f6979o = null;
            this.f6965a &= -8193;
        }
        if (H(aVar.f6965a, 32768)) {
            this.f6985u = aVar.f6985u;
        }
        if (H(aVar.f6965a, PKIFailureInfo.notAuthorized)) {
            this.f6978n = aVar.f6978n;
        }
        if (H(aVar.f6965a, PKIFailureInfo.unsupportedVersion)) {
            this.f6977m = aVar.f6977m;
        }
        if (H(aVar.f6965a, 2048)) {
            this.f6982r.putAll(aVar.f6982r);
            this.f6989y = aVar.f6989y;
        }
        if (H(aVar.f6965a, PKIFailureInfo.signerNotTrusted)) {
            this.f6988x = aVar.f6988x;
        }
        if (!this.f6978n) {
            this.f6982r.clear();
            int i10 = this.f6965a;
            this.f6977m = false;
            this.f6965a = i10 & (-133121);
            this.f6989y = true;
        }
        this.f6965a |= aVar.f6965a;
        this.f6981q.d(aVar.f6981q);
        return Y();
    }

    public a a0(com.bumptech.glide.load.g gVar) {
        if (this.f6986v) {
            return clone().a0(gVar);
        }
        this.f6976l = (com.bumptech.glide.load.g) com.bumptech.glide.util.k.d(gVar);
        this.f6965a |= 1024;
        return Y();
    }

    public a b() {
        if (this.f6984t && !this.f6986v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f6986v = true;
        return M();
    }

    public a b0(float f10) {
        if (this.f6986v) {
            return clone().b0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f6966b = f10;
        this.f6965a |= 2;
        return Y();
    }

    public a c() {
        return f0(p.f30044d, new com.bumptech.glide.load.resource.bitmap.n());
    }

    public a c0(boolean z10) {
        if (this.f6986v) {
            return clone().c0(true);
        }
        this.f6973i = !z10;
        this.f6965a |= 256;
        return Y();
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            com.bumptech.glide.load.j jVar = new com.bumptech.glide.load.j();
            aVar.f6981q = jVar;
            jVar.d(this.f6981q);
            com.bumptech.glide.util.b bVar = new com.bumptech.glide.util.b();
            aVar.f6982r = bVar;
            bVar.putAll(this.f6982r);
            aVar.f6984t = false;
            aVar.f6986v = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public a d0(n nVar) {
        return e0(nVar, true);
    }

    public a e(Class cls) {
        if (this.f6986v) {
            return clone().e(cls);
        }
        this.f6983s = (Class) com.bumptech.glide.util.k.d(cls);
        this.f6965a |= 4096;
        return Y();
    }

    public a e0(n nVar, boolean z10) {
        if (this.f6986v) {
            return clone().e0(nVar, z10);
        }
        w wVar = new w(nVar, z10);
        g0(Bitmap.class, nVar, z10);
        g0(Drawable.class, wVar, z10);
        g0(BitmapDrawable.class, wVar.c(), z10);
        g0(H4.c.class, new H4.f(nVar), z10);
        return Y();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return C((a) obj);
        }
        return false;
    }

    public a f(com.bumptech.glide.load.engine.j jVar) {
        if (this.f6986v) {
            return clone().f(jVar);
        }
        this.f6967c = (com.bumptech.glide.load.engine.j) com.bumptech.glide.util.k.d(jVar);
        this.f6965a |= 4;
        return Y();
    }

    public final a f0(p pVar, n nVar) {
        if (this.f6986v) {
            return clone().f0(pVar, nVar);
        }
        g(pVar);
        return d0(nVar);
    }

    public a g(p pVar) {
        return Z(p.f30048h, com.bumptech.glide.util.k.d(pVar));
    }

    public a g0(Class cls, n nVar, boolean z10) {
        if (this.f6986v) {
            return clone().g0(cls, nVar, z10);
        }
        com.bumptech.glide.util.k.d(cls);
        com.bumptech.glide.util.k.d(nVar);
        this.f6982r.put(cls, nVar);
        int i10 = this.f6965a;
        this.f6978n = true;
        this.f6965a = 67584 | i10;
        this.f6989y = false;
        if (z10) {
            this.f6965a = i10 | 198656;
            this.f6977m = true;
        }
        return Y();
    }

    public a h(Drawable drawable) {
        if (this.f6986v) {
            return clone().h(drawable);
        }
        this.f6979o = drawable;
        int i10 = this.f6965a | 8192;
        this.f6980p = 0;
        this.f6965a = i10 & (-16385);
        return Y();
    }

    public a h0(n... nVarArr) {
        return nVarArr.length > 1 ? e0(new com.bumptech.glide.load.h(nVarArr), true) : nVarArr.length == 1 ? d0(nVarArr[0]) : Y();
    }

    public int hashCode() {
        return l.q(this.f6985u, l.q(this.f6976l, l.q(this.f6983s, l.q(this.f6982r, l.q(this.f6981q, l.q(this.f6968d, l.q(this.f6967c, l.r(this.f6988x, l.r(this.f6987w, l.r(this.f6978n, l.r(this.f6977m, l.p(this.f6975k, l.p(this.f6974j, l.r(this.f6973i, l.q(this.f6979o, l.p(this.f6980p, l.q(this.f6971g, l.p(this.f6972h, l.q(this.f6969e, l.p(this.f6970f, l.m(this.f6966b)))))))))))))))))))));
    }

    public final com.bumptech.glide.load.engine.j i() {
        return this.f6967c;
    }

    public a i0(boolean z10) {
        if (this.f6986v) {
            return clone().i0(z10);
        }
        this.f6990z = z10;
        this.f6965a |= PKIFailureInfo.badCertTemplate;
        return Y();
    }

    public final int j() {
        return this.f6970f;
    }

    public final Drawable k() {
        return this.f6969e;
    }

    public final Drawable l() {
        return this.f6979o;
    }

    public final int m() {
        return this.f6980p;
    }

    public final boolean n() {
        return this.f6988x;
    }

    public final com.bumptech.glide.load.j o() {
        return this.f6981q;
    }

    public final int p() {
        return this.f6974j;
    }

    public final int q() {
        return this.f6975k;
    }

    public final Drawable r() {
        return this.f6971g;
    }

    public final int s() {
        return this.f6972h;
    }

    public final com.bumptech.glide.h t() {
        return this.f6968d;
    }

    public final Class u() {
        return this.f6983s;
    }

    public final com.bumptech.glide.load.g v() {
        return this.f6976l;
    }

    public final float w() {
        return this.f6966b;
    }

    public final Resources.Theme x() {
        return this.f6985u;
    }

    public final Map y() {
        return this.f6982r;
    }

    public final boolean z() {
        return this.f6990z;
    }

    public final a X() {
        return this;
    }
}
