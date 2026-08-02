package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k40 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ l40 a;

    public k40(l40 l40Var) {
        this.a = l40Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        this.a.g0();
        l40 l40Var = this.a;
        synchronized (l40Var.e) {
            if (l40Var.j) {
                l40Var.j = false;
                ArrayList arrayList = l40Var.g;
                l40Var.g = l40Var.h;
                l40Var.h = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g0();
        l40 l40Var = this.a;
        synchronized (l40Var.e) {
            try {
                if (l40Var.g.isEmpty()) {
                    l40Var.c.removeFrameCallback(this);
                    l40Var.j = false;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
