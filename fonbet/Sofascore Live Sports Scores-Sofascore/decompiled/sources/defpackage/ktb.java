package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ktb {
    public int a;
    public int b;
    public int c;
    public Object d;

    public ktb() {
        if (v9f.b == null) {
            v9f.b = new v9f(5);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void c() {
        if (((ltb) this.d).h == this.c) {
            return;
        }
        a70.o();
    }

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i = this.a;
            ltb ltbVar = (ltb) this.d;
            if (i >= ltbVar.f || ltbVar.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = d(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate f = bsk.f(view);
            p9 p9Var = f != null ? f instanceof o9 ? ((o9) f).a : new p9(f) : null;
            if (p9Var == null) {
                p9Var = new p9();
            }
            bsk.q(view, p9Var);
            view.setTag(this.a, obj);
            bsk.k(this.c, view);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((ltb) this.d).f;
    }

    public void remove() {
        ltb ltbVar = (ltb) this.d;
        c();
        if (this.b == -1) {
            a70.r("Call next() before removing element from the iterator.");
            return;
        }
        ltbVar.g();
        ltbVar.o(this.b);
        this.b = -1;
        this.c = ltbVar.h;
    }
}
