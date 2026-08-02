package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iu4 {
    public static final dwd k = new z53(new z(14));
    public ih6 a;
    public tn4 b;
    public final Object c;
    public final Context d;
    public final wib e;
    public wt4 f;
    public Thread g;
    public gxh h;
    public an0 i;
    public Boolean j;

    public iu4(Context context) {
        wib wibVar = new wib(15);
        wt4 wt4Var = wt4.H;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = wibVar;
        if (wt4Var != null) {
            this.f = wt4Var;
        } else {
            wt4Var.getClass();
            ut4 ut4Var = new ut4(wt4Var);
            ut4Var.c(wt4Var);
            wt4Var = new wt4(ut4Var);
            this.f = wt4Var;
        }
        this.i = an0.b;
        if (wt4Var.C && context == null) {
            tgj.d0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(kub kubVar, wt4 wt4Var, lh6[] lh6VarArr) {
        int i = kubVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            qsj qsjVar = kubVar.c[i2];
            Map map = (Map) wt4Var.F.get(i2);
            if (map != null && map.containsKey(qsjVar)) {
                Map map2 = (Map) wt4Var.F.get(i2);
                if (map2 != null && map2.get(qsjVar) != null) {
                    pvd.j();
                    return;
                }
                lh6VarArr[i2] = null;
            }
        }
    }

    public static void b(kub kubVar, wt4 wt4Var, lh6[] lh6VarArr) {
        for (int i = 0; i < kubVar.a; i++) {
            int i2 = kubVar.b[i];
            if (wt4Var.G.get(i) || wt4Var.w.contains(Integer.valueOf(i2))) {
                lh6VarArr[i] = null;
            }
        }
    }

    public static void c(kub kubVar, etj etjVar, lh6[] lh6VarArr) {
        int i = kubVar.a;
        qsj[] qsjVarArr = kubVar.c;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            d(qsjVarArr[i2], etjVar, hashMap);
        }
        d(kubVar.f, etjVar, hashMap);
        for (int i3 = 0; i3 < i; i3++) {
            zsj zsjVar = (zsj) hashMap.get(Integer.valueOf(kubVar.b[i3]));
            if (zsjVar != null) {
                osj osjVar = zsjVar.a;
                hv9 hv9Var = zsjVar.b;
                lh6VarArr[i3] = (hv9Var.isEmpty() || qsjVarArr[i3].b(osjVar) == -1) ? null : new lh6(0, osjVar, jaa.O(hv9Var));
            }
        }
    }

    public static void d(qsj qsjVar, etj etjVar, HashMap hashMap) {
        for (int i = 0; i < qsjVar.a; i++) {
            zsj zsjVar = (zsj) etjVar.v.get(qsjVar.a(i));
            if (zsjVar != null) {
                osj osjVar = zsjVar.a;
                zsj zsjVar2 = (zsj) hashMap.get(Integer.valueOf(osjVar.c));
                if (zsjVar2 == null || (zsjVar2.b.isEmpty() && !zsjVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(osjVar.c), zsjVar);
                }
            }
        }
    }

    public static Pair e(lh6[] lh6VarArr, int i) {
        for (int i2 = 0; i2 < lh6VarArr.length; i2++) {
            lh6 lh6Var = lh6VarArr[i2];
            if (lh6Var != null && lh6Var.a.c == i) {
                return Pair.create(lh6Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int f(b bVar, hv9 hv9Var) {
        for (int i = 0; i < hv9Var.size(); i++) {
            for (int i2 = 0; i2 < bVar.c.size(); i2++) {
                if (((uka) bVar.c.get(i2)).b.equals(hv9Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int g(b bVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(bVar.d)) {
            return 4;
        }
        String j = j(str);
        String j2 = j(bVar.d);
        if (j2 == null || j == null) {
            return (z && j2 == null) ? 1 : 0;
        }
        if (j2.startsWith(j) || j.startsWith(j2)) {
            return 3;
        }
        String str2 = nik.a;
        return j2.split("-", 2)[0].equals(j.split("-", 2)[0]) ? 2 : 0;
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static lh6 l(qsj qsjVar, int[][] iArr, wt4 wt4Var) {
        wt4Var.q.getClass();
        osj osjVar = null;
        st4 st4Var = null;
        int i = 0;
        for (int i2 = 0; i2 < qsjVar.a; i2++) {
            osj a = qsjVar.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a.a; i3++) {
                if (n51.k(iArr2[i3], wt4Var.D)) {
                    st4 st4Var2 = new st4(a.d[i3], iArr2[i3]);
                    if (st4Var != null) {
                        if (w63.a.c(st4Var2.b, st4Var.b).c(st4Var2.a, st4Var.a).e() <= 0) {
                        }
                    }
                    osjVar = a;
                    i = i3;
                    st4Var = st4Var2;
                }
            }
        }
        if (osjVar == null) {
            return null;
        }
        return new lh6(0, osjVar, new int[]{i});
    }

    public static Pair m(int i, kub kubVar, int[][][] iArr, cu4 cu4Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        kub kubVar2 = kubVar;
        ArrayList arrayList = new ArrayList();
        int i3 = kubVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == kubVar2.b[i4]) {
                qsj qsjVar = kubVar2.c[i4];
                for (int i5 = 0; i5 < qsjVar.a; i5++) {
                    osj a = qsjVar.a(i5);
                    vvf c = cu4Var.c(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        eu4 eu4Var = (eu4) c.get(i7);
                        int a2 = eu4Var.a();
                        if (zArr[i7] || a2 == 0) {
                            i2 = i3;
                        } else {
                            if (a2 == 1) {
                                randomAccess = hv9.z(eu4Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eu4Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    eu4 eu4Var2 = (eu4) c.get(i8);
                                    int i9 = i3;
                                    if (eu4Var2.a() == 2 && eu4Var.b(eu4Var2)) {
                                        arrayList2.add(eu4Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccess = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            kubVar2 = kubVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((eu4) list.get(i10)).c;
        }
        eu4 eu4Var3 = (eu4) list.get(0);
        return Pair.create(new lh6(0, eu4Var3.b, iArr2), Integer.valueOf(eu4Var3.a));
    }

    public final wt4 h() {
        wt4 wt4Var;
        synchronized (this.c) {
            wt4Var = this.f;
        }
        return wt4Var;
    }

    public final void i() {
        boolean z;
        ih6 ih6Var;
        gxh gxhVar;
        synchronized (this.c) {
            try {
                z = this.f.C && Build.VERSION.SDK_INT >= 32 && (gxhVar = this.h) != null && gxhVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (ih6Var = this.a) == null) {
            return;
        }
        ih6Var.h.g(10);
    }

    public final void k() {
        gxh gxhVar;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    z1a.D("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (gxhVar = this.h) != null) {
            gxhVar.e();
            this.h = null;
        }
        this.a = null;
        this.b = null;
    }

    public final void n(etj etjVar) {
        if (etjVar instanceof wt4) {
            o((wt4) etjVar);
        }
        ut4 ut4Var = new ut4(h());
        ut4Var.c(etjVar);
        o(new wt4(ut4Var));
    }

    public final void o(wt4 wt4Var) {
        boolean equals;
        synchronized (this.c) {
            equals = this.f.equals(wt4Var);
            this.f = wt4Var;
        }
        if (equals) {
            return;
        }
        if (wt4Var.C && this.d == null) {
            tgj.d0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        ih6 ih6Var = this.a;
        if (ih6Var != null) {
            ih6Var.h.g(10);
        }
    }
}
