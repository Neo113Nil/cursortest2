package defpackage;

import android.text.TextUtils;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pt4 extends eu4 implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final wt4 h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final boolean r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pt4(int i, osj osjVar, int i2, wt4 wt4Var, int i3, boolean z, jt4 jt4Var, int i4) {
        super(i, osjVar, i2);
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        String[] H;
        int i7;
        int i8;
        int i9;
        boolean z4;
        wt4 wt4Var2;
        boolean z5;
        atj atjVar;
        this.h = wt4Var;
        boolean z6 = wt4Var.B;
        hv9 hv9Var = wt4Var.p;
        hv9 hv9Var2 = wt4Var.l;
        int i10 = z6 ? 24 : 16;
        int i11 = 0;
        this.n = false;
        this.g = iu4.j(this.d.d);
        this.i = n51.k(i3, false);
        int i12 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i12 >= hv9Var2.size()) {
                i6 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = iu4.g(this.d, (String) hv9Var2.get(i12), false);
                if (i6 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.k = i12;
        this.j = i6;
        int i13 = this.d.f;
        this.l = (i13 == 0 || i13 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.m = iu4.f(this.d, wt4Var.m);
        b bVar = this.d;
        int i14 = bVar.f;
        this.o = i14 == 0 || (i14 & 1) != 0;
        this.r = (bVar.e & 1) != 0;
        String str = bVar.o;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                        z2 = false;
                        break;
                    }
                    z2 = -1;
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        z2 = true;
                        break;
                    }
                    z2 = -1;
                    break;
                case 1504698186:
                    if (str.equals("audio/iamf")) {
                        z2 = 2;
                        break;
                    }
                    z2 = -1;
                    break;
                default:
                    z2 = -1;
                    break;
            }
            switch (z2) {
                case false:
                case true:
                case true:
                    z3 = true;
                    break;
            }
            this.y = z3;
            int i15 = bVar.G;
            this.s = i15;
            this.t = bVar.H;
            int i16 = bVar.j;
            this.u = i16;
            this.f = (i16 != -1 || i16 <= wt4Var.o) && (i15 == -1 || i15 <= wt4Var.n) && jt4Var.apply(bVar);
            H = nik.H();
            i7 = 0;
            while (true) {
                if (i7 >= H.length) {
                    i8 = iu4.g(this.d, H[i7], false);
                    if (i8 <= 0) {
                        i7++;
                    }
                } else {
                    i8 = 0;
                    i7 = Integer.MAX_VALUE;
                }
            }
            this.p = i7;
            this.q = i8;
            i9 = 0;
            while (true) {
                if (i9 < hv9Var.size()) {
                    String str2 = this.d.o;
                    if (str2 == null || !str2.equals(hv9Var.get(i9))) {
                        i9++;
                    } else {
                        i5 = i9;
                    }
                }
            }
            this.v = i5;
            this.w = (i3 & 384) != 128;
            this.x = (i3 & 64) != 64;
            z4 = this.f;
            wt4Var2 = this.h;
            z5 = wt4Var2.D;
            atjVar = wt4Var2.q;
            if (n51.k(i3, z5) && (z4 || wt4Var2.A)) {
                atjVar.getClass();
                i11 = (n51.k(i3, false) || !z4 || this.d.j == -1 || (!wt4Var2.E && z) || (i10 & i3) == 0) ? 1 : 2;
            }
            this.e = i11;
        }
        z3 = false;
        this.y = z3;
        int i152 = bVar.G;
        this.s = i152;
        this.t = bVar.H;
        int i162 = bVar.j;
        this.u = i162;
        this.f = (i162 != -1 || i162 <= wt4Var.o) && (i152 == -1 || i152 <= wt4Var.n) && jt4Var.apply(bVar);
        H = nik.H();
        i7 = 0;
        while (true) {
            if (i7 >= H.length) {
            }
            i7++;
        }
        this.p = i7;
        this.q = i8;
        i9 = 0;
        while (true) {
            if (i9 < hv9Var.size()) {
            }
            i9++;
        }
        this.v = i5;
        this.w = (i3 & 384) != 128;
        this.x = (i3 & 64) != 64;
        z4 = this.f;
        wt4Var2 = this.h;
        z5 = wt4Var2.D;
        atjVar = wt4Var2.q;
        if (n51.k(i3, z5)) {
            atjVar.getClass();
            if (n51.k(i3, false)) {
            }
        }
        this.e = i11;
    }

    @Override // defpackage.eu4
    public final int a() {
        return this.e;
    }

    @Override // defpackage.eu4
    public final boolean b(eu4 eu4Var) {
        int i;
        String str;
        pt4 pt4Var = (pt4) eu4Var;
        b bVar = pt4Var.d;
        this.h.getClass();
        b bVar2 = this.d;
        int i2 = bVar2.G;
        if (i2 == -1 || i2 != bVar.G) {
            return false;
        }
        return (this.n || ((str = bVar2.o) != null && TextUtils.equals(str, bVar.o))) && (i = bVar2.H) != -1 && i == bVar.H && this.w == pt4Var.w && this.x == pt4Var.x;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(pt4 pt4Var) {
        boolean z = this.i;
        boolean z2 = this.f;
        dwd d = (z2 && z) ? iu4.k : iu4.k.d();
        boolean z3 = pt4Var.i;
        int i = pt4Var.u;
        w63 c = w63.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.k);
        Integer valueOf2 = Integer.valueOf(pt4Var.k);
        h4g h4gVar = h4g.a;
        w63 b = c.b(valueOf, valueOf2, h4gVar).a(this.j, pt4Var.j).a(this.l, pt4Var.l).b(Integer.valueOf(this.m), Integer.valueOf(pt4Var.m), h4gVar).c(this.r, pt4Var.r).c(this.o, pt4Var.o).b(Integer.valueOf(this.p), Integer.valueOf(pt4Var.p), h4gVar).a(this.q, pt4Var.q).c(z2, pt4Var.f).b(Integer.valueOf(this.v), Integer.valueOf(pt4Var.v), h4gVar);
        this.h.getClass();
        w63 b2 = b.c(this.w, pt4Var.w).c(this.x, pt4Var.x).c(this.y, pt4Var.y).b(Integer.valueOf(this.s), Integer.valueOf(pt4Var.s), d).b(Integer.valueOf(this.t), Integer.valueOf(pt4Var.t), d);
        if (Objects.equals(this.g, pt4Var.g)) {
            b2 = b2.b(Integer.valueOf(this.u), Integer.valueOf(i), d);
        }
        return b2.e();
    }
}
