package k7;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends o {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f18931i;
    public static final x j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f18932d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f18933e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f18934f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f18935g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f18936h;

    static {
        Object[] objArr = new Object[0];
        f18931i = objArr;
        j = new x(0, 0, 0, objArr, objArr);
    }

    public x(int i5, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f18932d = objArr;
        this.f18933e = i5;
        this.f18934f = objArr2;
        this.f18935g = i10;
        this.f18936h = i11;
    }

    @Override // k7.h
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f18932d;
        int i5 = this.f18936h;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // k7.h
    public final int b() {
        return this.f18936h;
    }

    @Override // k7.h
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f18934f;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i5 = rotateLeft & this.f18935g;
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i5 + 1;
        }
    }

    @Override // k7.h
    public final c0 d() {
        return h().listIterator(0);
    }

    @Override // k7.h
    public final Object[] e() {
        return this.f18932d;
    }

    @Override // k7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18933e;
    }

    @Override // k7.o
    public final m i() {
        return m.h(this.f18936h, this.f18932d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18936h;
    }
}
