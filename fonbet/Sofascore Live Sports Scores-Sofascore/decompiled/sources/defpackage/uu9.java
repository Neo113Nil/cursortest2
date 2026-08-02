package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class uu9 extends vu9 {
    public Object[] a;
    public int b;
    public boolean c;

    public uu9(int i) {
        yqo.w(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void d(Object... objArr) {
        int length = objArr.length;
        qha.p(length, objArr);
        f(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof wu9) {
                this.b = ((wu9) collection).e(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void f(int i) {
        Object[] objArr = this.a;
        int b = vu9.b(objArr.length, this.b + i);
        if (b > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, b);
            this.c = false;
        }
    }
}
