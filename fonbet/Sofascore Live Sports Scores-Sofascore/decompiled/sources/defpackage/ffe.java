package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ffe extends b7 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public ffe(Object[] objArr, Object[] objArr2, int i, int i2) {
        objArr.getClass();
        objArr2.getClass();
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (size() > 32) {
            size();
            size();
            int length = objArr2.length;
        } else {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
        }
    }

    @Override // defpackage.b7
    public final b7 a(Object obj) {
        int size = size() - ((size() - 1) & (-32));
        int i = this.d;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[size] = obj;
            return new ffe(objArr, copyOf, size() + 1, i);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        if ((size() >> 5) <= (1 << i)) {
            return new ffe(e(objArr, objArr2, i), objArr3, size() + 1, i);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new ffe(e(objArr4, objArr2, i2), objArr3, size() + 1, i2);
    }

    @Override // defpackage.b7
    public final hfe d() {
        return new hfe(this, this.a, this.b, this.d);
    }

    public final Object[] e(Object[] objArr, Object[] objArr2, int i) {
        int B = u0a.B(size() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[B] = objArr2;
            return copyOf;
        }
        copyOf[B] = e((Object[]) copyOf[B], objArr2, i - 5);
        return copyOf;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        tz9.v(i, size());
        if (((size() - 1) & (-32)) <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[u0a.B(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.u4, java.util.List
    public final ListIterator listIterator(int i) {
        tz9.w(i, size());
        return new jfe(i, size(), (this.d / 5) + 1, this.a, this.b);
    }
}
