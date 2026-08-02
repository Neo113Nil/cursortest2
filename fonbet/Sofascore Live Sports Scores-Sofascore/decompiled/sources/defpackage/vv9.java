package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class vv9 extends wu9 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient hv9 b;

    public static int r(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            z1a.r("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static vv9 s(int i, Object... objArr) {
        if (i == 0) {
            return ewf.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new djh(obj);
        }
        int r = r(i);
        Object[] objArr2 = new Object[r];
        int i2 = r - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                yhk.s(ljg.j(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int A = tol.A(hashCode);
            while (true) {
                int i6 = A & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                A++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new djh(obj4);
        }
        if (r(i4) < r / 2) {
            return s(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new ewf(i3, i2, i4, objArr, objArr2);
    }

    public static vv9 t(Collection collection) {
        if ((collection instanceof vv9) && !(collection instanceof SortedSet)) {
            vv9 vv9Var = (vv9) collection;
            if (!vv9Var.p()) {
                return vv9Var;
            }
        }
        Object[] array = collection.toArray();
        return s(array.length, array);
    }

    public static vv9 u(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? s(objArr.length, (Object[]) objArr.clone()) : new djh(objArr[0]) : ewf.j;
    }

    public static vv9 w(Object obj, Object obj2) {
        return s(2, obj, obj2);
    }

    public static vv9 x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        z1a.r("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return s(length, objArr2);
    }

    @Override // defpackage.wu9
    public hv9 d() {
        hv9 hv9Var = this.b;
        if (hv9Var != null) {
            return hv9Var;
        }
        hv9 v = v();
        this.b = v;
        return v;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof vv9) && (this instanceof ewf) && (((vv9) obj) instanceof ewf) && ((ewf) this).e != obj.hashCode()) {
            return false;
        }
        return w1a.o(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return w1a.s(this);
    }

    public hv9 v() {
        Object[] array = toArray(wu9.a);
        av9 av9Var = hv9.b;
        return hv9.r(array.length, array);
    }

    @Override // defpackage.wu9
    public Object writeReplace() {
        return new uv9(toArray(wu9.a));
    }
}
