package defpackage;

import androidx.media3.common.b;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wzk implements uzk, vzk, ijn {
    public final /* synthetic */ int a = 2;
    public final int b;
    public long c;
    public int d;
    public long e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public wzk(zzagk zzagkVar, zzaht zzahtVar, jjn jjnVar, String str, int i) {
        this.f = zzagkVar;
        this.g = zzahtVar;
        this.h = jjnVar;
        int i2 = jjnVar.a;
        int i3 = jjnVar.b;
        int i4 = jjnVar.d * i2;
        int i5 = jjnVar.c;
        int i6 = i4 / 8;
        if (i5 != i6) {
            throw zzat.a(null, x5n.n(new StringBuilder(String.valueOf(i6).length() + 28 + String.valueOf(i5).length()), i6, "Expected block size: ", i5, "; got: "));
        }
        int i7 = i3 * i6;
        int i8 = i7 * 8;
        int max = Math.max(i6, i7 / 10);
        this.b = max;
        zzt zztVar = new zzt();
        zztVar.c("audio/wav");
        zztVar.d(str);
        zztVar.h = i8;
        zztVar.i = i8;
        zztVar.o = max;
        zztVar.G = i2;
        int i9 = jjnVar.e;
        zztVar.H = i9 == 0 ? -1 : i9 << 2;
        zztVar.I = i3;
        zztVar.J = i;
        this.i = new zzv(zztVar);
    }

    @Override // defpackage.uzk, defpackage.vzk
    public void a(int i, long j) {
        int i2 = this.a;
        Object obj = this.i;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.h;
        switch (i2) {
            case 0:
                ((ol6) obj3).d(new zzk((k9e) obj4, 1, i, j));
                ((usj) obj2).a((sm8) obj);
                break;
            default:
                a0l a0lVar = new a0l((k9e) obj4, 1, i, j);
                ((pl6) obj3).m(a0lVar);
                vsj vsjVar = (vsj) obj2;
                vsjVar.d((b) obj);
                vsjVar.f(a0lVar.e);
                break;
        }
    }

    @Override // defpackage.uzk, defpackage.vzk
    public void b(long j) {
        switch (this.a) {
            case 0:
                this.c = j;
                this.d = 0;
                this.e = 0L;
                break;
            default:
                this.c = j;
                this.d = 0;
                this.e = 0L;
                break;
        }
    }

    @Override // defpackage.ijn
    public void c(long j) {
        this.c = j;
        this.d = 0;
        this.e = 0L;
    }

    @Override // defpackage.ijn
    public void d(int i, long j) {
        ((zzagk) this.f).c(new kjn((jjn) this.h, 1, i, j));
        ((zzaht) this.g).e((zzv) this.i);
    }

    @Override // defpackage.ijn
    public boolean e(zzagi zzagiVar, long j) {
        Object obj;
        int i;
        int i2;
        long j2 = j;
        while (true) {
            obj = this.g;
            if (j2 <= 0 || (i = this.d) >= (i2 = this.b)) {
                break;
            }
            int d = ((zzaht) obj).d(zzagiVar, (int) Math.min(i2 - i, j2), true);
            if (d == -1) {
                j2 = 0;
            } else {
                this.d += d;
                j2 -= d;
            }
        }
        jjn jjnVar = (jjn) this.h;
        int i3 = this.d;
        int i4 = jjnVar.c;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long w = this.c + zzfm.w(this.e, 1000000L, jjnVar.b, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.d - i6;
            ((zzaht) obj).f(w, 1, i6, i7, null);
            this.e += i5;
            this.d = i7;
        }
        return j2 <= 0;
    }

    @Override // defpackage.vzk
    public boolean f(nl6 nl6Var, long j) {
        Object obj;
        int i;
        int i2;
        long j2 = j;
        while (true) {
            obj = this.g;
            if (j2 <= 0 || (i = this.d) >= (i2 = this.b)) {
                break;
            }
            int c = ((vsj) obj).c(nl6Var, (int) Math.min(i2 - i, j2), true);
            if (c == -1) {
                j2 = 0;
            } else {
                this.d += c;
                j2 -= c;
            }
        }
        k9e k9eVar = (k9e) this.h;
        int i3 = k9eVar.c;
        int i4 = this.d / i3;
        if (i4 > 0) {
            long j3 = this.c;
            long j4 = this.e;
            long j5 = k9eVar.b;
            String str = nik.a;
            long b0 = j3 + nik.b0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.d - i5;
            ((vsj) obj).a(b0, 1, i5, i6, null);
            this.e += i4;
            this.d = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.uzk
    public boolean g(ml6 ml6Var, long j) {
        Object obj;
        int i;
        int i2;
        long j2 = j;
        while (true) {
            obj = this.g;
            if (j2 <= 0 || (i = this.d) >= (i2 = this.b)) {
                break;
            }
            int b = ((usj) obj).b(ml6Var, (int) Math.min(i2 - i, j2), true);
            if (b == -1) {
                j2 = 0;
            } else {
                this.d += b;
                j2 -= b;
            }
        }
        int i3 = ((k9e) this.h).c;
        int i4 = this.d / i3;
        if (i4 > 0) {
            long D = this.c + lik.D(this.e, 1000000L, r1.b);
            int i5 = i4 * i3;
            int i6 = this.d - i5;
            ((usj) obj).c(D, 1, i5, i6, null);
            this.e += i4;
            this.d = i6;
        }
        return j2 <= 0;
    }

    public wzk(ol6 ol6Var, usj usjVar, k9e k9eVar, String str, int i) {
        this.f = ol6Var;
        this.g = usjVar;
        this.h = k9eVar;
        int i2 = k9eVar.a;
        int i3 = k9eVar.b;
        int i4 = (k9eVar.d * i2) / 8;
        int i5 = k9eVar.c;
        if (i5 == i4) {
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int max = Math.max(i4, i6 / 10);
            this.b = max;
            pm8 pm8Var = new pm8();
            pm8Var.k = str;
            pm8Var.f = i7;
            pm8Var.g = i7;
            pm8Var.l = max;
            pm8Var.x = i2;
            pm8Var.y = i3;
            pm8Var.z = i;
            this.i = new sm8(pm8Var);
            return;
        }
        throw r9e.a("Expected block size: " + i4 + "; got: " + i5, null);
    }

    public wzk(pl6 pl6Var, vsj vsjVar, k9e k9eVar, String str, int i) {
        this.f = pl6Var;
        this.g = vsjVar;
        this.h = k9eVar;
        int i2 = k9eVar.a;
        int i3 = k9eVar.b;
        int i4 = (k9eVar.d * i2) / 8;
        int i5 = k9eVar.c;
        if (i5 == i4) {
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int max = Math.max(i4, i6 / 10);
            this.b = max;
            qm8 qm8Var = new qm8();
            qm8Var.m = sjc.p("audio/wav");
            qm8Var.n = sjc.p(str);
            qm8Var.h = i7;
            qm8Var.i = i7;
            qm8Var.o = max;
            qm8Var.F = i2;
            qm8Var.G = i3;
            qm8Var.H = i;
            this.i = new b(qm8Var);
            return;
        }
        throw s9e.a(null, "Expected block size: " + i4 + "; got: " + i5);
    }
}
