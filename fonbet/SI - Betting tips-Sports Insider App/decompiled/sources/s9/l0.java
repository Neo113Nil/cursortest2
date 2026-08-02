package s9;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 extends b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f23350d;

    /* renamed from: e, reason: collision with root package name */
    public static final l0 f23351e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f23352b;

    /* renamed from: c, reason: collision with root package name */
    public int f23353c;

    static {
        Object[] objArr = new Object[0];
        f23350d = objArr;
        f23351e = new l0(objArr, 0, false);
    }

    public l0(Object[] objArr, int i5, boolean z5) {
        this.f23283a = z5;
        this.f23352b = objArr;
        this.f23353c = i5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i5 = this.f23353c;
        Object[] objArr = this.f23352b;
        if (i5 == objArr.length) {
            this.f23352b = Arrays.copyOf(this.f23352b, androidx.appcompat.widget.c1.h(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f23352b;
        int i10 = this.f23353c;
        this.f23353c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i5) {
        if (i5 < 0 || i5 >= this.f23353c) {
            StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Index:", ", Size:");
            r5.append(this.f23353c);
            throw new IndexOutOfBoundsException(r5.toString());
        }
    }

    public final l0 c(int i5) {
        if (i5 >= this.f23353c) {
            return new l0(i5 == 0 ? f23350d : Arrays.copyOf(this.f23352b, i5), this.f23353c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        b(i5);
        return this.f23352b[i5];
    }

    @Override // s9.b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        b(i5);
        Object[] objArr = this.f23352b;
        Object obj = objArr[i5];
        if (i5 < this.f23353c - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.f23353c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        a();
        b(i5);
        Object[] objArr = this.f23352b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23353c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        a();
        if (i5 >= 0 && i5 <= (i10 = this.f23353c)) {
            Object[] objArr = this.f23352b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i5, objArr, i5 + 1, i10 - i5);
            } else {
                Object[] objArr2 = new Object[androidx.appcompat.widget.c1.h(objArr.length, 3, 2, 1, 10)];
                System.arraycopy(this.f23352b, 0, objArr2, 0, i5);
                System.arraycopy(this.f23352b, i5, objArr2, i5 + 1, this.f23353c - i5);
                this.f23352b = objArr2;
            }
            this.f23352b[i5] = obj;
            this.f23353c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Index:", ", Size:");
        r5.append(this.f23353c);
        throw new IndexOutOfBoundsException(r5.toString());
    }
}
