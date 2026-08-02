package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l40 extends au3 {
    public static final mqi m = ypa.b(mz.s);
    public static final j40 n = new j40(0);
    public final Choreographer c;
    public final Handler d;
    public boolean i;
    public boolean j;
    public final n40 l;
    public final Object e = new Object();
    public final vg0 f = new vg0();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public final k40 k = new k40(this);

    public l40(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.l = new n40(choreographer, this);
    }

    public final void g0() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.e) {
                vg0 vg0Var = this.f;
                runnable = (Runnable) (vg0Var.isEmpty() ? null : vg0Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.e) {
                    vg0 vg0Var2 = this.f;
                    runnable = (Runnable) (vg0Var2.isEmpty() ? null : vg0Var2.removeFirst());
                }
            }
            synchronized (this.e) {
                if (this.f.isEmpty()) {
                    z = false;
                    this.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.e) {
            try {
                this.f.addLast(runnable);
                if (!this.i) {
                    this.i = true;
                    this.d.post(this.k);
                    if (!this.j) {
                        this.j = true;
                        this.c.postFrameCallback(this.k);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
