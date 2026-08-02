package k7;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class o extends h implements Set, j$.util.Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18901c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient m f18902b;

    public static o f(int i5, Object... objArr) {
        if (i5 == 0) {
            return x.j;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new a0(obj);
        }
        int g10 = g(i5);
        Object[] objArr2 = new Object[g10];
        int i10 = g10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(androidx.appcompat.widget.c1.i(i13, "at index "));
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i14 = rotateLeft & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i12, i5, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new a0(obj4);
        }
        if (g(i12) < g10 / 2) {
            return f(i12, objArr);
        }
        if (i12 <= 0) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new x(i11, i10, i12, objArr, objArr2);
    }

    public static int g(int i5) {
        int max = Math.max(i5, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof o) && (this instanceof x) && (((o) obj) instanceof x) && ((x) this).f18933e != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public m h() {
        m mVar = this.f18902b;
        if (mVar != null) {
            return mVar;
        }
        m i5 = i();
        this.f18902b = i5;
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a.b(this);
    }

    public m i() {
        Object[] array = toArray(h.f18864a);
        i iVar = m.f18895b;
        return m.h(array.length, array);
    }
}
