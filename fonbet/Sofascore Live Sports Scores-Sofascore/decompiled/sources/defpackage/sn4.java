package defpackage;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sn4 {
    public static final vvf n = hv9.y(4800000L, 3100000L, 2100000L, 1500000L, 800000L);
    public static final vvf o = hv9.y(1500000L, 1000000L, 730000L, 440000L, 170000L);
    public static final vvf p = hv9.y(2200000L, 1400000L, 1100000L, 910000L, 620000L);
    public static final vvf q = hv9.y(3000000L, 1900000L, 1400000L, 1000000L, 660000L);
    public static final vvf r = hv9.y(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);
    public static final vvf s = hv9.y(2800000L, 2400000L, 1600000L, 1100000L, 950000L);
    public static sn4 t;
    public final lv9 a;
    public final iz0 b;
    public final flh c;
    public final sqi d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;

    public sn4(Context context, HashMap hashMap) {
        this.a = lv9.f(hashMap);
        iz0 iz0Var = new iz0();
        iz0Var.a = new CopyOnWriteArrayList();
        this.b = iz0Var;
        this.c = new flh(0);
        this.d = sqi.a;
        this.e = true;
        if (context == null) {
            this.i = 0;
            this.l = a(0);
            return;
        }
        mbd b = mbd.b(context);
        int c = b.c();
        this.i = c;
        this.l = a(c);
        qn4 qn4Var = new qn4(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) b.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(qn4Var));
        ((Handler) b.c).post(new gjc(7, b, qn4Var));
    }

    public final long a(int i) {
        Integer valueOf = Integer.valueOf(i);
        lv9 lv9Var = this.a;
        Long l = (Long) lv9Var.get(valueOf);
        if (l == null) {
            l = (Long) lv9Var.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void b(int i, long j, long j2) {
        int i2;
        long j3;
        long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        Iterator it = this.b.a.iterator();
        while (it.hasNext()) {
            gz0 gz0Var = (gz0) it.next();
            if (gz0Var.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                gz0Var.a.post(new fz0(gz0Var, i2, j3, j4, 0));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }
}
