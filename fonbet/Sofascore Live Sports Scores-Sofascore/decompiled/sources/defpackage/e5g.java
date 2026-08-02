package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class e5g extends u4 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public e5g(Object[] objArr, int i) {
        this.a = objArr;
        if (i < 0) {
            ogj.h(ljg.j(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            ogj.e(objArr.length, lnb.t(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    public final void c(int i) {
        if (i < 0) {
            ogj.h(ljg.j(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            ogj.e(size(), lnb.t(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d = size() - i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        q4 q4Var = u4.Companion;
        int size = size();
        q4Var.getClass();
        q4.b(i, size);
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.d;
    }

    @Override // defpackage.u4, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new d5g(this);
    }

    @Override // defpackage.v2, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.a;
            if (i3 >= size || i >= this.b) {
                break;
            }
            objArr[i3] = objArr2[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = objArr2[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // defpackage.v2, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
