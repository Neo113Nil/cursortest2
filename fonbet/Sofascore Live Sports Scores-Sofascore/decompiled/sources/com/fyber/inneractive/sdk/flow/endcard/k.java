package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.flow.y0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k {
    public final y0 a;
    public final m b;
    public final boolean c;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b d;
    public final h e;
    public final int f;
    public final AtomicBoolean g;
    public final Object h;

    public k(Context context, t0 t0Var, x0 x0Var) {
        y0 y0Var = new y0(context, t0Var);
        m mVar = new m();
        this.b = mVar;
        this.g = new AtomicBoolean(false);
        this.h = new Object();
        this.a = y0Var;
        this.c = !TextUtils.equals(y0Var.d.B, "1");
        h hVar = new h(x0Var);
        this.e = hVar;
        this.f = hVar.b;
        this.d = new com.fyber.inneractive.sdk.flow.endcard.loaders.b(y0Var, mVar);
    }

    public final b a() {
        synchronized (this.h) {
            try {
                if (!this.g.compareAndSet(false, true)) {
                    return this.b.a();
                }
                b b = b();
                this.e.a(this.b);
                return b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b b() {
        b bVar;
        m mVar = this.b;
        int size = mVar.a.size();
        int i = mVar.c;
        do {
            i++;
            if (i >= size) {
                return null;
            }
            bVar = (b) mVar.a.get(i);
        } while (!bVar.l());
        if (bVar.i() == com.fyber.inneractive.sdk.model.vast.i.Default_End_Card) {
            for (int size2 = mVar.b.size() - 1; size2 >= 0; size2--) {
                if (((b) mVar.b.get(size2)) instanceof o) {
                    return null;
                }
            }
            if (mVar.c >= 0) {
                return null;
            }
        } else if (bVar instanceof c) {
            int i2 = i + 1;
            for (int size3 = mVar.a.size() - 1; size3 >= i2; size3--) {
                b bVar2 = (b) mVar.a.get(size3);
                if (bVar2 instanceof c) {
                    bVar2.destroy();
                    mVar.a.remove(size3);
                }
            }
        }
        mVar.c = i;
        mVar.b.add(bVar);
        bVar.e = mVar.b.size();
        return bVar;
    }
}
