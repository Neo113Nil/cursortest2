package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 extends b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f1720d = new v0(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1721b;

    /* renamed from: c, reason: collision with root package name */
    public int f1722c;

    public v0(Object[] objArr, int i5, boolean z5) {
        this.f1577a = z5;
        this.f1721b = objArr;
        this.f1722c = i5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i5 = this.f1722c;
        Object[] objArr = this.f1721b;
        if (i5 == objArr.length) {
            this.f1721b = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1721b;
        int i10 = this.f1722c;
        this.f1722c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i5) {
        if (i5 < 0 || i5 >= this.f1722c) {
            StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Index:", ", Size:");
            r5.append(this.f1722c);
            throw new IndexOutOfBoundsException(r5.toString());
        }
    }

    public final v0 c(int i5) {
        if (i5 >= this.f1722c) {
            return new v0(Arrays.copyOf(this.f1721b, i5), this.f1722c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        b(i5);
        return this.f1721b[i5];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        b(i5);
        Object[] objArr = this.f1721b;
        Object obj = objArr[i5];
        if (i5 < this.f1722c - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.f1722c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        a();
        b(i5);
        Object[] objArr = this.f1721b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1722c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        a();
        if (i5 >= 0 && i5 <= (i10 = this.f1722c)) {
            Object[] objArr = this.f1721b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i5, objArr, i5 + 1, i10 - i5);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i5);
                System.arraycopy(this.f1721b, i5, objArr2, i5 + 1, this.f1722c - i5);
                this.f1721b = objArr2;
            }
            this.f1721b[i5] = obj;
            this.f1722c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Index:", ", Size:");
        r5.append(this.f1722c);
        throw new IndexOutOfBoundsException(r5.toString());
    }
}
