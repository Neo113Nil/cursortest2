package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import e1.AbstractC4134a;
import e1.InterfaceC4148o;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4148o f21819c;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f21818b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public int f21817a = -1;

    public i0(InterfaceC4148o interfaceC4148o) {
        this.f21819c = interfaceC4148o;
    }

    public void a(int i10, Object obj) {
        if (this.f21817a == -1) {
            AbstractC4134a.g(this.f21818b.size() == 0);
            this.f21817a = 0;
        }
        if (this.f21818b.size() > 0) {
            SparseArray sparseArray = this.f21818b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC4134a.a(i10 >= keyAt);
            if (keyAt == i10) {
                InterfaceC4148o interfaceC4148o = this.f21819c;
                SparseArray sparseArray2 = this.f21818b;
                interfaceC4148o.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f21818b.append(i10, obj);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f21818b.size(); i10++) {
            this.f21819c.accept(this.f21818b.valueAt(i10));
        }
        this.f21817a = -1;
        this.f21818b.clear();
    }

    public void c(int i10) {
        for (int size = this.f21818b.size() - 1; size >= 0 && i10 < this.f21818b.keyAt(size); size--) {
            this.f21819c.accept(this.f21818b.valueAt(size));
            this.f21818b.removeAt(size);
        }
        this.f21817a = this.f21818b.size() > 0 ? Math.min(this.f21817a, this.f21818b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f21818b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f21818b.keyAt(i12)) {
                return;
            }
            this.f21819c.accept(this.f21818b.valueAt(i11));
            this.f21818b.removeAt(i11);
            int i13 = this.f21817a;
            if (i13 > 0) {
                this.f21817a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object e(int i10) {
        if (this.f21817a == -1) {
            this.f21817a = 0;
        }
        while (true) {
            int i11 = this.f21817a;
            if (i11 <= 0 || i10 >= this.f21818b.keyAt(i11)) {
                break;
            }
            this.f21817a--;
        }
        while (this.f21817a < this.f21818b.size() - 1 && i10 >= this.f21818b.keyAt(this.f21817a + 1)) {
            this.f21817a++;
        }
        return this.f21818b.valueAt(this.f21817a);
    }

    public Object f() {
        return this.f21818b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f21818b.size() == 0;
    }
}
