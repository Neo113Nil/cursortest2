package defpackage;

import androidx.media3.common.b;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzne;
import com.google.android.gms.internal.ads.zznh;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzv;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tyf {
    public int c;
    public Object e;
    public Object f;
    public int d = 0;
    public boolean a = false;
    public boolean b = false;

    public /* synthetic */ tyf(int i, Object obj, Object obj2) {
        this.e = obj;
        this.c = i;
        this.f = obj2;
    }

    public static void b(n51 n51Var) {
        int i = n51Var.h;
        if (i == 2) {
            z1a.E(i == 2);
            n51Var.h = 1;
            n51Var.s();
        }
    }

    public static boolean h(n51 n51Var) {
        return n51Var.h != 0;
    }

    public static void l(n51 n51Var, long j) {
        n51Var.n = true;
        if (n51Var instanceof sej) {
            sej sejVar = (sej) n51Var;
            z1a.E(sejVar.n);
            sejVar.K = j;
        }
    }

    public static boolean y(zzne zzneVar) {
        return zzneVar.zze() != 0;
    }

    public boolean A() {
        return ((zzne) this.f) != null;
    }

    public void B() {
        int i;
        zzguk.f(!C());
        if (y((zzne) this.e)) {
            i = 3;
        } else {
            zzne zzneVar = (zzne) this.f;
            i = (zzneVar == null || zzneVar.zze() == 0) ? 2 : 4;
        }
        this.d = i;
    }

    public boolean C() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public int D() {
        zzne zzneVar = (zzne) this.f;
        boolean y = y((zzne) this.e);
        int i = 0;
        if (zzneVar != null && zzneVar.zze() != 0) {
            i = 1;
        }
        return (y ? 1 : 0) + i;
    }

    public void E() {
        ((zzne) this.e).getClass();
    }

    public boolean F(jxo jxoVar) {
        zzne z = z(jxoVar);
        z.getClass();
        return z.J();
    }

    public void G(jxo jxoVar) {
        zzne z = z(jxoVar);
        z.getClass();
        z.zzl();
        if (z instanceof zzzv) {
            throw null;
        }
    }

    public void H(zzabm zzabmVar, zzabm zzabmVar2) {
        int i;
        zzne zzneVar = (zzne) this.e;
        int i2 = this.c;
        boolean a = zzabmVar.a(i2);
        boolean a2 = zzabmVar2.a(i2);
        zzne zzneVar2 = (zzne) this.f;
        if (zzneVar2 != null && (i = this.d) != 3 && (i != 0 || !y(zzneVar))) {
            zzneVar = zzneVar2;
        }
        if (!a || zzneVar.zzm()) {
            return;
        }
        E();
        zznh zznhVar = zzabmVar.b[i2];
        zznh zznhVar2 = zzabmVar2.b[i2];
        if (a2 && Objects.equals(zznhVar2, zznhVar) && !C()) {
            return;
        }
        zzneVar.zzl();
        if (zzneVar instanceof zzzv) {
            throw null;
        }
    }

    public void I() {
        int i;
        zzne zzneVar = (zzne) this.e;
        if (y(zzneVar) && (i = this.d) != 4 && i != 2) {
            zzneVar.zzl();
            if (zzneVar instanceof zzzv) {
                throw null;
            }
        }
        zzne zzneVar2 = (zzne) this.f;
        if (zzneVar2 == null || zzneVar2.zze() == 0 || this.d == 3) {
            return;
        }
        zzneVar2.zzl();
        if (zzneVar2 instanceof zzzv) {
            throw null;
        }
    }

    public void J() {
        zzne zzneVar = (zzne) this.e;
        if (y(zzneVar)) {
            zzneVar.i();
            return;
        }
        zzne zzneVar2 = (zzne) this.f;
        if (zzneVar2 == null || zzneVar2.zze() == 0) {
            return;
        }
        zzneVar2.i();
    }

    public boolean K() {
        zzne zzneVar = (zzne) this.e;
        boolean h = y(zzneVar) ? zzneVar.h() : true;
        zzne zzneVar2 = (zzne) this.f;
        return (zzneVar2 == null || zzneVar2.zze() == 0) ? h : zzneVar2.h() & h;
    }

    public boolean L(jxo jxoVar) {
        int i = this.d;
        return ((i == 2 || i == 4) && z(jxoVar) == ((zzne) this.e)) || (this.d == 3 && z(jxoVar) == ((zzne) this.f));
    }

    public boolean M(jxo jxoVar) {
        return u(jxoVar, (zzne) this.e) && u(jxoVar, (zzne) this.f);
    }

    public void N(long j, long j2) {
        zzne zzneVar = (zzne) this.e;
        if (y(zzneVar)) {
            zzneVar.y(j, j2);
        }
        zzne zzneVar2 = (zzne) this.f;
        if (zzneVar2 == null || zzneVar2.zze() == 0) {
            return;
        }
        zzneVar2.y(j, j2);
    }

    public boolean O(jxo jxoVar) {
        zzne z = z(jxoVar);
        return z == null || z.J() || z.x() || z.h();
    }

    public void P() {
        zzne zzneVar = (zzne) this.e;
        if (zzneVar.zze() == 1 && this.d != 4) {
            zzneVar.E();
            return;
        }
        zzne zzneVar2 = (zzne) this.f;
        if (zzneVar2 == null || zzneVar2.zze() != 1 || this.d == 3) {
            return;
        }
        zzneVar2.E();
    }

    public void a(n51 n51Var, ar4 ar4Var) {
        z1a.E(((n51) this.e) == n51Var || ((n51) this.f) == n51Var);
        if (h(n51Var)) {
            if (n51Var == ((n51) ar4Var.f)) {
                ar4Var.g = null;
                ar4Var.f = null;
                ar4Var.b = true;
            }
            b(n51Var);
            z1a.E(n51Var.h == 1);
            n51Var.c.j();
            n51Var.h = 0;
            n51Var.i = null;
            n51Var.j = null;
            n51Var.n = false;
            n51Var.m();
            n51Var.q = null;
        }
    }

    public int c() {
        boolean h = h((n51) this.e);
        n51 n51Var = (n51) this.f;
        return (h ? 1 : 0) + ((n51Var == null || !h(n51Var)) ? 0 : 1);
    }

    public n51 d(y6c y6cVar) {
        jpg jpgVar;
        if (y6cVar == null || (jpgVar = y6cVar.c[this.c]) == null) {
            return null;
        }
        n51 n51Var = (n51) this.e;
        if (n51Var.i == jpgVar) {
            return n51Var;
        }
        n51 n51Var2 = (n51) this.f;
        if (n51Var2 == null || n51Var2.i != jpgVar) {
            return null;
        }
        return n51Var2;
    }

    public boolean e(y6c y6cVar, n51 n51Var) {
        int i = this.c;
        if (n51Var == null) {
            return true;
        }
        jpg jpgVar = y6cVar.c[i];
        jpg jpgVar2 = n51Var.i;
        if (jpgVar2 == null) {
            return true;
        }
        if (jpgVar2 == jpgVar) {
            if (jpgVar == null || n51Var.i()) {
                return true;
            }
            y6c y6cVar2 = y6cVar.m;
            if (y6cVar.g.h && y6cVar2 != null && y6cVar2.e && ((n51Var instanceof sej) || (n51Var instanceof ajc) || n51Var.m >= y6cVar2.e())) {
                return true;
            }
        }
        y6c y6cVar3 = y6cVar.m;
        return y6cVar3 != null && y6cVar3.c[i] == n51Var.i;
    }

    public boolean f() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return h((n51) this.e);
        }
        n51 n51Var = (n51) this.f;
        n51Var.getClass();
        return n51Var.h != 0;
    }

    public void i(boolean z) {
        if (z) {
            if (this.a) {
                n51 n51Var = (n51) this.e;
                z1a.E(n51Var.h == 0);
                n51Var.c.j();
                n51Var.q();
                this.a = false;
                return;
            }
            return;
        }
        if (this.b) {
            n51 n51Var2 = (n51) this.f;
            n51Var2.getClass();
            z1a.E(n51Var2.h == 0);
            n51Var2.c.j();
            n51Var2.q();
            this.b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(n51 n51Var, y6c y6cVar, gtj gtjVar, ar4 ar4Var) {
        int i;
        n51 n51Var2 = (n51) this.e;
        int i2 = this.c;
        if (n51Var == null || n51Var.h == 0 || (n51Var == n51Var2 && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (n51Var == ((n51) this.f) && this.d == 3) {
            return 1;
        }
        Object[] objArr = n51Var.i != y6cVar.c[i2];
        boolean r = gtjVar.r(i2);
        if (!r || objArr != false) {
            if (!n51Var.n) {
                nh6 nh6Var = ((nh6[]) gtjVar.e)[i2];
                int length = nh6Var != null ? nh6Var.length() : 0;
                b[] bVarArr = new b[length];
                for (int i3 = 0; i3 < length; i3++) {
                    nh6Var.getClass();
                    bVarArr[i3] = nh6Var.getFormat(i3);
                }
                jpg jpgVar = y6cVar.c[i2];
                jpgVar.getClass();
                n51Var.x(bVarArr, jpgVar, y6cVar.e(), y6cVar.p, y6cVar.g.a);
                return 3;
            }
            if (!n51Var.j()) {
                return 0;
            }
            a(n51Var, ar4Var);
            if (!r || f()) {
                i(n51Var == n51Var2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((n51) this.e)) {
            i(true);
        }
        n51 n51Var = (n51) this.f;
        if (n51Var == null || n51Var.h != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i;
        n51 n51Var = (n51) this.e;
        int i2 = n51Var.h;
        if (i2 == 1 && this.d != 4) {
            z1a.E(i2 == 1);
            n51Var.h = 2;
            n51Var.r();
            return;
        }
        n51 n51Var2 = (n51) this.f;
        if (n51Var2 == null || (i = n51Var2.h) != 1 || this.d == 3) {
            return;
        }
        z1a.E(i == 1);
        n51Var2.h = 2;
        n51Var2.r();
    }

    public void n() {
        int i = this.d;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.d = 0;
                return;
            }
            return;
        }
        boolean z = i == 4;
        zzne zzneVar = (zzne) this.e;
        zzne zzneVar2 = (zzne) this.f;
        if (z) {
            zzneVar2.getClass();
            zzneVar2.f(17, zzneVar);
        } else {
            zzneVar2.getClass();
            zzneVar.f(17, zzneVar2);
        }
        this.d = this.d != 4 ? 1 : 0;
    }

    public void o() {
        if (!y((zzne) this.e)) {
            w(true);
        }
        zzne zzneVar = (zzne) this.f;
        if (zzneVar == null || zzneVar.zze() != 0) {
            return;
        }
        w(false);
    }

    public int p(jxo jxoVar, zzabm zzabmVar, ar4 ar4Var) {
        int x = x((zzne) this.e, jxoVar, zzabmVar, ar4Var);
        return x == 1 ? x((zzne) this.f, jxoVar, zzabmVar, ar4Var) : x;
    }

    public void q() {
        ((zzne) this.e).zzt();
        this.a = false;
        zzne zzneVar = (zzne) this.f;
        if (zzneVar != null) {
            zzneVar.zzt();
            this.b = false;
        }
    }

    public void r(Object obj) {
        zzne zzneVar = (zzne) this.e;
        if (zzneVar.zza() != 2) {
            return;
        }
        int i = this.d;
        if (i != 4 && i != 1) {
            zzneVar.f(1, obj);
            return;
        }
        zzne zzneVar2 = (zzne) this.f;
        zzneVar2.getClass();
        zzneVar2.f(1, obj);
    }

    public void s(zzaea zzaeaVar) {
        zzne zzneVar = (zzne) this.e;
        if (zzneVar.zza() != 2) {
            E();
            return;
        }
        zzneVar.f(7, zzaeaVar);
        zzne zzneVar2 = (zzne) this.f;
        if (zzneVar2 != null) {
            zzneVar2.f(7, zzaeaVar);
        }
    }

    public boolean t() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return y((zzne) this.e);
        }
        zzne zzneVar = (zzne) this.f;
        zzneVar.getClass();
        return zzneVar.zze() != 0;
    }

    public boolean u(jxo jxoVar, zzne zzneVar) {
        if (zzneVar == null) {
            return true;
        }
        zzzg[] zzzgVarArr = jxoVar.c;
        int i = this.c;
        zzzg zzzgVar = zzzgVarArr[i];
        if (zzneVar.H() == null) {
            return true;
        }
        if (zzneVar.H() == zzzgVar && (zzzgVar == null || zzneVar.J())) {
            return true;
        }
        jxo jxoVar2 = jxoVar.m;
        return jxoVar2 != null && jxoVar2.c[i] == zzneVar.H();
    }

    public void v(zzne zzneVar, ar4 ar4Var) {
        zzguk.f(((zzne) this.e) == zzneVar || ((zzne) this.f) == zzneVar);
        if (y(zzneVar)) {
            if (zzneVar == ((zzne) ar4Var.f)) {
                ar4Var.g = null;
                ar4Var.f = null;
                ar4Var.b = true;
            }
            if (zzneVar.zze() == 2) {
                zzneVar.zzq();
            }
            zzneVar.zzr();
        }
    }

    public void w(boolean z) {
        if (z) {
            if (this.a) {
                ((zzne) this.e).zzs();
                this.a = false;
                return;
            }
            return;
        }
        if (this.b) {
            zzne zzneVar = (zzne) this.f;
            zzneVar.getClass();
            zzneVar.zzs();
            this.b = false;
        }
    }

    public int x(zzne zzneVar, jxo jxoVar, zzabm zzabmVar, ar4 ar4Var) {
        int i;
        if (zzneVar != null && zzneVar.zze() != 0) {
            zzne zzneVar2 = (zzne) this.e;
            boolean z = zzneVar != zzneVar2;
            if (zzneVar == zzneVar2 && ((i = this.d) == 2 || i == 4)) {
                return 1;
            }
            if (zzneVar == ((zzne) this.f) && this.d == 3) {
                return 1;
            }
            zzzg H = zzneVar.H();
            zzzg[] zzzgVarArr = jxoVar.c;
            int i2 = this.c;
            zzzg zzzgVar = zzzgVarArr[i2];
            boolean a = zzabmVar.a(i2);
            if (!a || H != zzzgVar) {
                if (!zzneVar.zzm()) {
                    zzabe zzabeVar = zzabmVar.c[i2];
                    int zze = zzabeVar != null ? zzabeVar.zze() : 0;
                    zzv[] zzvVarArr = new zzv[zze];
                    for (int i3 = 0; i3 < zze; i3++) {
                        zzabeVar.getClass();
                        zzvVarArr[i3] = zzabeVar.zzb(i3);
                    }
                    zzzg zzzgVar2 = zzzgVarArr[i2];
                    zzzgVar2.getClass();
                    zzneVar.I(zzvVarArr, zzzgVar2, jxoVar.a(), jxoVar.p, jxoVar.g.a);
                    return 3;
                }
                if (!zzneVar.h()) {
                    return 0;
                }
                v(zzneVar, ar4Var);
                if (!a || C()) {
                    w(!z);
                    return 1;
                }
            }
        }
        return 1;
    }

    public zzne z(jxo jxoVar) {
        if (jxoVar == null) {
            return null;
        }
        int i = this.c;
        zzzg[] zzzgVarArr = jxoVar.c;
        if (zzzgVarArr[i] == null) {
            return null;
        }
        zzne zzneVar = (zzne) this.e;
        zzzg H = zzneVar.H();
        zzzg zzzgVar = zzzgVarArr[i];
        if (H == zzzgVar) {
            return zzneVar;
        }
        zzne zzneVar2 = (zzne) this.f;
        if (zzneVar2 == null || zzneVar2.H() != zzzgVar) {
            return null;
        }
        return zzneVar2;
    }
}
