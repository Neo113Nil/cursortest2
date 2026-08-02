package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ot4 extends du4 implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final vt4 h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final boolean v;

    public ot4(int i, nsj nsjVar, int i2, vt4 vt4Var, int i3, boolean z, nt4 nt4Var) {
        super(i, nsjVar, i2);
        hv9 hv9Var;
        int i4;
        int i5;
        String[] strArr;
        int i6;
        this.h = vt4Var;
        this.g = hu4.f(this.d.c);
        int i7 = 0;
        this.i = hu4.d(i3, false);
        int i8 = 0;
        while (true) {
            hv9 hv9Var2 = vt4Var.n;
            hv9Var = vt4Var.r;
            i4 = Integer.MAX_VALUE;
            if (i8 >= hv9Var2.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i5 = hu4.b(this.d, (String) vt4Var.n.get(i8), false);
                if (i5 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.k = i8;
        this.j = i5;
        int i9 = this.d.e;
        int i10 = vt4Var.o;
        this.l = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        sm8 sm8Var = this.d;
        int i11 = sm8Var.e;
        this.m = i11 == 0 || (i11 & 1) != 0;
        this.p = (sm8Var.d & 1) != 0;
        int i12 = sm8Var.y;
        this.q = i12;
        this.r = sm8Var.z;
        int i13 = sm8Var.h;
        this.s = i13;
        this.f = (i13 == -1 || i13 <= vt4Var.q) && (i12 == -1 || i12 <= vt4Var.p) && nt4Var.apply(sm8Var);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i14 = lik.a;
        if (i14 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
        } else {
            Locale locale = configuration.locale;
            strArr = new String[]{i14 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i15 = 0; i15 < strArr.length; i15++) {
            strArr[i15] = lik.z(strArr[i15]);
        }
        int i16 = 0;
        while (true) {
            if (i16 >= strArr.length) {
                i6 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = hu4.b(this.d, strArr[i16], false);
                if (i6 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.n = i16;
        this.o = i6;
        int i17 = 0;
        while (true) {
            if (i17 >= hv9Var.size()) {
                break;
            }
            String str = this.d.l;
            if (str != null && str.equals(hv9Var.get(i17))) {
                i4 = i17;
                break;
            }
            i17++;
        }
        this.t = i4;
        this.u = (i3 & 384) == 128;
        this.v = (i3 & 64) == 64;
        boolean z2 = this.f;
        vt4 vt4Var2 = this.h;
        if (hu4.d(i3, vt4Var2.K) && (z2 || vt4Var2.E)) {
            i7 = (!hu4.d(i3, false) || !z2 || this.d.h == -1 || vt4Var2.x || vt4Var2.w || (!vt4Var2.M && z)) ? 1 : 2;
        }
        this.e = i7;
    }

    @Override // defpackage.du4
    public final int a() {
        return this.e;
    }

    @Override // defpackage.du4
    public final boolean b(du4 du4Var) {
        int i;
        String str;
        int i2;
        ot4 ot4Var = (ot4) du4Var;
        sm8 sm8Var = ot4Var.d;
        vt4 vt4Var = this.h;
        boolean z = vt4Var.H;
        sm8 sm8Var2 = this.d;
        if (!z && ((i2 = sm8Var2.y) == -1 || i2 != sm8Var.y)) {
            return false;
        }
        if (!vt4Var.F && ((str = sm8Var2.l) == null || !TextUtils.equals(str, sm8Var.l))) {
            return false;
        }
        if (!vt4Var.G && ((i = sm8Var2.z) == -1 || i != sm8Var.z)) {
            return false;
        }
        if (vt4Var.I) {
            return true;
        }
        return this.u == ot4Var.u && this.v == ot4Var.v;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ot4 ot4Var) {
        dwd dwdVar;
        dwd d;
        boolean z = this.i;
        boolean z2 = this.f;
        if (z2 && z) {
            d = hu4.j;
            dwdVar = d;
        } else {
            dwd dwdVar2 = hu4.j;
            dwdVar = dwdVar2;
            d = dwdVar2.d();
        }
        boolean z3 = ot4Var.i;
        int i = ot4Var.s;
        w63 c = w63.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.k);
        Integer valueOf2 = Integer.valueOf(ot4Var.k);
        h4g h4gVar = h4g.a;
        w63 b = c.b(valueOf, valueOf2, h4gVar).a(this.j, ot4Var.j).a(this.l, ot4Var.l).c(this.p, ot4Var.p).c(this.m, ot4Var.m).b(Integer.valueOf(this.n), Integer.valueOf(ot4Var.n), h4gVar).a(this.o, ot4Var.o).c(z2, ot4Var.f).b(Integer.valueOf(this.t), Integer.valueOf(ot4Var.t), h4gVar);
        int i2 = this.s;
        w63 b2 = b.b(Integer.valueOf(i2), Integer.valueOf(i), this.h.w ? dwdVar.d() : hu4.k).c(this.u, ot4Var.u).c(this.v, ot4Var.v).b(Integer.valueOf(this.q), Integer.valueOf(ot4Var.q), d).b(Integer.valueOf(this.r), Integer.valueOf(ot4Var.r), d);
        Integer valueOf3 = Integer.valueOf(i2);
        Integer valueOf4 = Integer.valueOf(i);
        if (!lik.a(this.g, ot4Var.g)) {
            d = hu4.k;
        }
        return b2.b(valueOf3, valueOf4, d).e();
    }
}
