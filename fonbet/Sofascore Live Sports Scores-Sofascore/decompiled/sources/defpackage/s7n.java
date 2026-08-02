package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s7n extends m7n implements RandomAccess {
    public static final boolean[] d;
    public boolean[] b;
    public int c;

    static {
        boolean[] zArr = new boolean[0];
        d = zArr;
        new s7n(zArr, 0, false);
    }

    public s7n() {
        this(d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i < 0 || i > (i2 = this.c)) {
            zzl.r(p7n.a(this.c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        boolean[] zArr = this.b;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[x5n.e(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, zArr2, 0, i);
            System.arraycopy(this.b, i, zArr2, i3, this.c - i);
            this.b = zArr2;
        }
        this.b[i] = booleanValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.m7n, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = jan.a;
        collection.getClass();
        if (!(collection instanceof s7n)) {
            return super.addAll(collection);
        }
        s7n s7nVar = (s7n) collection;
        int i = s7nVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.b;
        if (i3 > zArr.length) {
            zArr = Arrays.copyOf(zArr, i3);
            this.b = zArr;
        }
        System.arraycopy(s7nVar.b, 0, zArr, this.c, s7nVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z) {
        c();
        int i = this.c;
        boolean[] zArr = this.b;
        int length = zArr.length;
        if (i == length) {
            zArr = new boolean[x5n.e(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, zArr, 0, this.c);
            this.b = zArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.m7n, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7n)) {
            return super.equals(obj);
        }
        s7n s7nVar = (s7n) obj;
        if (this.c != s7nVar.c) {
            return false;
        }
        boolean[] zArr = s7nVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ian
    public final ian f(int i) {
        if (i >= this.c) {
            return new s7n(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        ilg.c();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Boolean.valueOf(this.b[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.c) {
            zzl.r(p7n.a(this.c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.m7n, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            int i3 = i * 31;
            boolean z = this.b[i2];
            Charset charset = jan.a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.m7n, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        h(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        if (i < this.c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            zzl.r("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.b;
        System.arraycopy(zArr, i2, zArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        h(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public s7n(boolean[] zArr, int i, boolean z) {
        super(z);
        this.b = zArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
