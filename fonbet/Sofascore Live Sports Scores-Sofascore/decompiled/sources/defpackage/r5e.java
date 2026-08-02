package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r5e implements l1c {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final ewd e;
    public final int f;
    public final int g;
    public final int h;
    public final n1c i;
    public final n1c j;
    public final float k;
    public final int l;
    public final boolean m;
    public final lnh n;
    public final l1c o;
    public final boolean p;
    public final List q;
    public final List r;
    public final ku3 s;
    public final kx4 t;
    public final long u;

    public r5e(List list, int i, int i2, int i3, ewd ewdVar, int i4, int i5, int i6, n1c n1cVar, n1c n1cVar2, float f, int i7, boolean z, lnh lnhVar, l1c l1cVar, boolean z2, List list2, List list3, ku3 ku3Var, kx4 kx4Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ewdVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = n1cVar;
        this.j = n1cVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = lnhVar;
        this.o = l1cVar;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = ku3Var;
        this.t = kx4Var;
        this.u = j;
    }

    @Override // defpackage.l1c
    public final Map a() {
        return this.o.a();
    }

    @Override // defpackage.l1c
    public final void b() {
        this.o.b();
    }

    @Override // defpackage.l1c
    public final Function1 c() {
        return this.o.c();
    }

    public final r5e d(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        n1c n1cVar = (n1c) CollectionsKt.Y(list);
        n1c n1cVar2 = (n1c) CollectionsKt.h0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((n1cVar.k + i3) - i5, (n1cVar2.k + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - n1cVar.k, i4 - n1cVar2.k) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((n1c) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((n1c) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((n1c) list3.get(i8)).a(i);
        }
        return new r5e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long e() {
        l1c l1cVar = this.o;
        return (l1cVar.getWidth() << 32) | (l1cVar.getHeight() & 4294967295L);
    }

    @Override // defpackage.l1c
    public final int getHeight() {
        return this.o.getHeight();
    }

    @Override // defpackage.l1c
    public final int getWidth() {
        return this.o.getWidth();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r5e(km5 km5Var, int i, int i2, int i3, ewd ewdVar, int i4, int i5, int i6, lnh lnhVar, l1c l1cVar, ku3 ku3Var, kx4 kx4Var, long j) {
        this(km5Var, i, i2, i3, ewdVar, i4, i5, i6, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, false, lnhVar, l1cVar, false, r17, r17, ku3Var, kx4Var, j);
        km5 km5Var2 = km5.a;
    }
}
