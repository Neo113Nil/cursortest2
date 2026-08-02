package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hu4 {
    public static final dwd j = new z53(new z(13));
    public static final dwd k = new z53(new z(15));
    public hh6 a;
    public sn4 b;
    public final Object c;
    public final Context d;
    public final a99 e;
    public final boolean f;
    public vt4 g;
    public final yt4 h;
    public zm0 i;

    public hu4(Context context) {
        a99 a99Var = new a99(15);
        int i = vt4.P;
        vt4 vt4Var = new vt4(new tt4(context));
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = a99Var;
        this.g = vt4Var;
        this.i = zm0.g;
        boolean z = context != null && lik.x(context);
        this.f = z;
        if (!z && context != null && lik.a >= 32) {
            this.h = yt4.f(context);
        }
        if (this.g.J && context == null) {
            m6k.f0();
        }
    }

    public static void a(psj psjVar, dtj dtjVar, HashMap hashMap) {
        for (int i = 0; i < psjVar.a; i++) {
            ysj ysjVar = (ysj) dtjVar.y.get(psjVar.a(i));
            if (ysjVar != null) {
                int i2 = ysjVar.a.c;
                ysj ysjVar2 = (ysj) hashMap.get(Integer.valueOf(i2));
                if (ysjVar2 == null || (ysjVar2.b.isEmpty() && !ysjVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(i2), ysjVar);
                }
            }
        }
    }

    public static int b(sm8 sm8Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(sm8Var.c)) {
            return 4;
        }
        String f = f(str);
        String f2 = f(sm8Var.c);
        if (f2 == null || f == null) {
            return (z && f2 == null) ? 1 : 0;
        }
        if (f2.startsWith(f) || f.startsWith(f2)) {
            return 3;
        }
        int i = lik.a;
        return f2.split("-", 2)[0].equals(f.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean d(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static Pair g(int i, jub jubVar, int[][][] iArr, bu4 bu4Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        jub jubVar2 = jubVar;
        ArrayList arrayList = new ArrayList();
        int i3 = jubVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == jubVar2.b[i4]) {
                psj psjVar = jubVar2.c[i4];
                for (int i5 = 0; i5 < psjVar.a; i5++) {
                    nsj a = psjVar.a(i5);
                    vvf c = bu4Var.c(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        du4 du4Var = (du4) c.get(i7);
                        int a2 = du4Var.a();
                        if (zArr[i7] || a2 == 0) {
                            i2 = i3;
                        } else {
                            if (a2 == 1) {
                                randomAccess = hv9.z(du4Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(du4Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    du4 du4Var2 = (du4) c.get(i8);
                                    int i9 = i3;
                                    if (du4Var2.a() == 2 && du4Var.b(du4Var2)) {
                                        arrayList2.add(du4Var2);
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
            jubVar2 = jubVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((du4) list.get(i10)).c;
        }
        du4 du4Var3 = (du4) list.get(0);
        return Pair.create(new kh6(0, du4Var3.b, iArr2), Integer.valueOf(du4Var3.a));
    }

    public final vt4 c() {
        vt4 vt4Var;
        synchronized (this.c) {
            vt4Var = this.g;
        }
        return vt4Var;
    }

    public final void e() {
        boolean z;
        hh6 hh6Var;
        yt4 yt4Var;
        synchronized (this.c) {
            try {
                z = this.g.J && !this.f && lik.a >= 32 && (yt4Var = this.h) != null && yt4Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (hh6Var = this.a) == null) {
            return;
        }
        hh6Var.h.c(10);
    }

    public final void h(vt4 vt4Var) {
        boolean equals;
        synchronized (this.c) {
            equals = this.g.equals(vt4Var);
            this.g = vt4Var;
        }
        if (equals) {
            return;
        }
        if (vt4Var.J && this.d == null) {
            m6k.f0();
        }
        hh6 hh6Var = this.a;
        if (hh6Var != null) {
            hh6Var.h.c(10);
        }
    }
}
