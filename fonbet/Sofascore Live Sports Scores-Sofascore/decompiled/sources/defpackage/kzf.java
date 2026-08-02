package defpackage;

import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kzf {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final p03 h;
    public final k1d i;
    public int j;
    public long k;

    public kzf(p03 p03Var, bah bahVar, k1d k1dVar) {
        double d = bahVar.d;
        double d2 = bahVar.e;
        this.a = d;
        this.b = d2;
        this.c = bahVar.f * 1000;
        this.h = p03Var;
        this.i = k1dVar;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int min = size == this.e ? Math.min(100, i + currentTimeMillis) : Math.max(0, i - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(ps0 ps0Var, TaskCompletionSource taskCompletionSource) {
        this.h.x(new cu0(null, ps0Var.a, i7f.c, null), new mt4(SystemClock.elapsedRealtime() - this.d < 2000, this, taskCompletionSource, ps0Var));
    }
}
