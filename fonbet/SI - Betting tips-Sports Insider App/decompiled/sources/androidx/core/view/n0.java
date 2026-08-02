package androidx.core.view;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1359a;

    /* renamed from: b, reason: collision with root package name */
    public int f1360b;

    /* renamed from: c, reason: collision with root package name */
    public int f1361c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1362d;

    public n0() {
        if (m3.f.f20310b == null) {
            m3.f.f20310b = new m3.f(25);
        }
    }

    public int a(int i5) {
        if (i5 < this.f1361c) {
            return ((ByteBuffer) this.f1362d).getShort(this.f1360b + i5);
        }
        return 0;
    }

    public void c() {
        if (((hf.i) this.f1362d).f10619h != this.f1361c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i5 = this.f1359a;
            hf.i iVar = (hf.i) this.f1362d;
            if (i5 >= iVar.f10617f || iVar.f10614c[i5] >= 0) {
                return;
            } else {
                this.f1359a = i5 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f1360b) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1360b) {
            tag = d(view);
        } else {
            tag = view.getTag(this.f1359a);
            if (!((Class) this.f1362d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate d10 = z0.d(view);
            b bVar = d10 == null ? null : d10 instanceof a ? ((a) d10).f1279a : new b(d10);
            if (bVar == null) {
                bVar = new b();
            }
            z0.o(view, bVar);
            view.setTag(this.f1359a, obj);
            z0.i(this.f1361c, view);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f1359a < ((hf.i) this.f1362d).f10617f;
    }

    public void remove() {
        hf.i iVar = (hf.i) this.f1362d;
        c();
        if (this.f1360b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        iVar.d();
        iVar.m(this.f1360b);
        this.f1360b = -1;
        this.f1361c = iVar.f10619h;
    }
}
