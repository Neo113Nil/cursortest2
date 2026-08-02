package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pkb extends AbstractList implements RandomAccess, Serializable {
    public final long[] a;
    public final int b;
    public final int c;

    public pkb(long[] jArr, int i, int i2) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.b;
        while (true) {
            if (i >= this.c) {
                i = -1;
                break;
            }
            if (this.a[i] == longValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pkb)) {
            return super.equals(obj);
        }
        pkb pkbVar = (pkb) obj;
        int size = size();
        if (pkbVar.size() == size) {
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] == pkbVar.a[pkbVar.b + i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        z1a.v(i, size());
        return Long.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + jaa.F(this.a[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.b;
            int i2 = i;
            while (true) {
                if (i2 >= this.c) {
                    i2 = -1;
                    break;
                }
                if (this.a[i2] == longValue) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i2 = this.c;
            while (true) {
                i2--;
                i = this.b;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.a[i2] == longValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Long l = (Long) obj;
        z1a.v(i, size());
        int i2 = this.b + i;
        long[] jArr = this.a;
        long j = jArr[i2];
        l.getClass();
        jArr[i2] = l.longValue();
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        z1a.A(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.b;
        return new pkb(this.a, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 10);
        sb.append('[');
        long[] jArr = this.a;
        int i = this.b;
        sb.append(jArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(jArr[i]);
        }
    }
}
