package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzabo;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzags;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhah;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c78 implements xnd, ynd, nmk, shn, zzabo {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public Object d;
    public Object e;

    public c78(long j, int i, byte b) {
        this.a = i;
        switch (i) {
            case 9:
                zzguk.f(((zzabn) this.d) == null);
                this.b = j;
                this.c = j + 65536;
                break;
            default:
                qx9.t(((zo) this.d) == null);
                this.b = j;
                this.c = j + 65536;
                break;
        }
    }

    public static c78 p(zzavp zzavpVar, byte[] bArr, boolean z) {
        zzavpVar.a();
        zzavpVar.a.d.b = zzawe.e(bArr);
        List list = (List) zzavpVar.b(Optional.empty());
        long longValue = ((Long) list.get(0)).longValue();
        long longValue2 = ((Long) list.get(1)).longValue();
        long longValue3 = ((Long) list.get(2)).longValue();
        zzavpVar.c(longValue, Optional.empty());
        byte[] a = zzavo.a();
        String f = zzhah.a.f(a.length, a);
        int length = f.length();
        String str = true != z ? "" : "-s";
        return new c78(zzavpVar, longValue2, longValue3, wt3.m("3.904631200.", f, new StringBuilder(str.length() + length + 12), str));
    }

    @Override // defpackage.ynd
    public long a(nl6 nl6Var) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.c = -1L;
        return j2;
    }

    @Override // defpackage.nmk
    public boolean b() {
        return true;
    }

    @Override // defpackage.shn
    public long c(zzagi zzagiVar) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        this.c = -1L;
        return -(j + 2);
    }

    @Override // defpackage.xnd
    public a0h createSeekMap() {
        int i = 1;
        qx9.t(this.b != -1);
        return new aw0((g78) this.d, this.b, i);
    }

    @Override // defpackage.nmk
    public long d(j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.shn
    public void e(long j) {
        long[] jArr = ((zzagt) this.e).a;
        this.c = jArr[zzfm.s(jArr, j, true)];
    }

    public void f(Object obj, Object obj2, mpf mpfVar) {
        mpf mpfVar2 = (mpf) obj2;
        ((spf) ((ou4) this.e).b).e((nec) obj, mpfVar2.a, mpfVar2.b, mpfVar2.c);
    }

    @Override // defpackage.xnd
    public long g(ml6 ml6Var) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.c = -1L;
        return j2;
    }

    public long h() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        long j2 = 0;
        for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
            j2 += k(entry.getKey(), entry.getValue());
        }
        this.c = j2;
        return j2;
    }

    public long i(long j) {
        long j2 = this.c;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.b;
        long j5 = j3 / j4;
        return (((bzf) this.e) == bzf.a || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public j80 j(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        long j2 = this.c;
        long j3 = j + j2;
        long j4 = this.b;
        return j3 > j4 ? ((pmk) this.d).u(j4 - j2, j80Var, j80Var3, j80Var2) : j80Var2;
    }

    public long k(Object obj, Object obj2) {
        try {
            long j = ((mpf) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.c = -1L;
            throw e;
        }
    }

    public void n(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        while (h() > j) {
            if (linkedHashMap.isEmpty()) {
                if (h() == 0) {
                    return;
                }
                a70.r("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) CollectionsKt.X(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.c = h() - k(key, value);
                f(key, value, null);
            }
        }
    }

    public boolean q(long j, boolean z, boolean z2) {
        zzoc zzocVar = (zzoc) this.e;
        zzocVar.Q();
        zzocVar.R();
        zzic zzicVar = (zzic) zzocVar.b;
        boolean c = zzicVar.c();
        zzgu zzguVar = zzicVar.f;
        if (c) {
            lmo lmoVar = zzicVar.e;
            zzic.k(lmoVar);
            zzhe zzheVar = lmoVar.q;
            zzicVar.k.getClass();
            zzheVar.b(System.currentTimeMillis());
        }
        long j2 = j - this.b;
        if (!z && j2 < 1000) {
            zzic.m(zzguVar);
            zzguVar.o.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.c;
            this.c = j;
        }
        zzic.m(zzguVar);
        zzguVar.o.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !zzicVar.d.f0();
        zzmb zzmbVar = zzicVar.l;
        zzic.l(zzmbVar);
        zzpp.M0(zzmbVar.U(z3), bundle, true);
        if (!z2) {
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.X("auto", bundle, "_e");
        }
        this.b = j;
        ozo ozoVar = (ozo) this.d;
        ozoVar.c();
        ozoVar.b(((Long) zzfy.p0.a(null)).longValue());
        return true;
    }

    @Override // defpackage.xnd, defpackage.ynd
    public void startSeek(long j) {
        switch (this.a) {
            case 0:
                long[] jArr = ((f78) this.e).a;
                this.c = jArr[lik.e(jArr, j, true)];
                break;
            default:
                long[] jArr2 = ((f78) this.e).a;
                this.c = jArr2[nik.f(jArr2, j, true)];
                break;
        }
    }

    @Override // defpackage.nmk
    public j80 u(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return ((pmk) this.d).u(i(j), j80Var, j80Var2, j(j, j80Var, j80Var3, j80Var2));
    }

    @Override // defpackage.nmk
    public j80 z(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return ((pmk) this.d).z(i(j), j80Var, j80Var2, j(j, j80Var, j80Var3, j80Var2));
    }

    @Override // defpackage.shn
    public zzahk zzc() {
        zzguk.f(this.b != -1);
        return new zzags((zzagu) this.d, this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public zzabn zzd() {
        zzabn zzabnVar = (zzabn) this.d;
        zzabnVar.getClass();
        return zzabnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public c78 zze() {
        c78 c78Var = (c78) this.e;
        if (c78Var == null || ((zzabn) c78Var.d) == null) {
            return null;
        }
        return c78Var;
    }

    @Override // defpackage.ynd
    /* renamed from: createSeekMap, reason: collision with other method in class */
    public b0h mo18createSeekMap() {
        int i = 1;
        z1a.E(this.b != -1);
        return new bw0((g78) this.d, this.b, i);
    }

    public c78(zzagu zzaguVar, zzagt zzagtVar) {
        this.a = 6;
        this.d = zzaguVar;
        this.e = zzagtVar;
        this.b = -1L;
        this.c = -1L;
    }

    public c78(zzavp zzavpVar, long j, long j2, String str) {
        this.a = 7;
        this.d = zzavpVar;
        this.b = j;
        this.c = j2;
        this.e = str;
    }

    public c78(zzoc zzocVar) {
        this.a = 8;
        this.e = zzocVar;
        zzic zzicVar = (zzic) zzocVar.b;
        this.d = new ozo(this, zzicVar, 0);
        zzicVar.k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = elapsedRealtime;
        this.c = elapsedRealtime;
    }

    public c78(ou4 ou4Var, long j) {
        this.a = 2;
        this.e = ou4Var;
        this.d = new LinkedHashMap(0, 0.75f, true);
        this.b = j;
        if (j > 0) {
            return;
        }
        a70.p("maxSize <= 0");
        throw null;
    }

    public c78(long j, int i) {
        this.a = 4;
        z1a.E(((ap) this.d) == null);
        this.b = j;
        this.c = j + i;
    }

    public c78(pmk pmkVar, bzf bzfVar, long j) {
        this.a = 5;
        this.d = pmkVar;
        this.e = bzfVar;
        this.b = (pmkVar.m() + pmkVar.l()) * 1000000;
        this.c = j * 1000000;
    }
}
