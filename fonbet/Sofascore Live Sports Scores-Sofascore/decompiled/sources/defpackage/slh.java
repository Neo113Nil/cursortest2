package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class slh extends c7 {
    public static final slh b = new slh(new Object[0]);
    public final Object[] a;

    public slh(Object[] objArr) {
        this.a = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.c7
    public final c7 a(int i, Object obj) {
        b0a.z(i, size());
        if (i == size()) {
            return c(obj);
        }
        int size = size();
        Object[] objArr = this.a;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            mh0.i(0, i, 6, objArr, objArr2);
            mh0.d(i + 1, i, size(), objArr, objArr2);
            objArr2[i] = obj;
            return new slh(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        mh0.d(i + 1, i, size() - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new gfe(copyOf, objArr3, size() + 1, 0);
    }

    @Override // defpackage.c7
    public final c7 c(Object obj) {
        int size = size();
        Object[] objArr = this.a;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, size() + 1);
            copyOf[size()] = obj;
            return new slh(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new gfe(objArr, objArr2, size() + 1, 0);
    }

    @Override // defpackage.c7
    public final c7 d(Collection collection) {
        if (collection.size() + size() > 32) {
            ife m = m();
            m.addAll(collection);
            return m.d();
        }
        Object[] copyOf = Arrays.copyOf(this.a, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[size] = it.next();
            size++;
        }
        return new slh(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        b0a.y(i, size());
        return this.a[i];
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.u4, java.util.List
    public final int indexOf(Object obj) {
        return ph0.G(obj, this.a);
    }

    @Override // defpackage.u4, java.util.List
    public final int lastIndexOf(Object obj) {
        return ph0.N(obj, this.a);
    }

    @Override // defpackage.u4, java.util.List
    public final ListIterator listIterator(int i) {
        b0a.z(i, size());
        return new z52(i, size(), this.a);
    }

    @Override // defpackage.c7
    public final ife m() {
        return new ife(this, null, this.a, 0);
    }

    @Override // defpackage.c7
    public final c7 n(a7 a7Var) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.a;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (((Boolean) a7Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr2[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? b : new slh(mh0.l(0, size, objArr2));
    }

    @Override // defpackage.c7
    public final c7 o(int i) {
        b0a.y(i, size());
        if (size() == 1) {
            return b;
        }
        int size = size() - 1;
        Object[] objArr = this.a;
        Object[] copyOf = Arrays.copyOf(objArr, size);
        mh0.d(i, i + 1, size(), objArr, copyOf);
        return new slh(copyOf);
    }

    @Override // defpackage.c7
    public final c7 p(int i, Object obj) {
        b0a.y(i, size());
        Object[] objArr = this.a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new slh(copyOf);
    }
}
