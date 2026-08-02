package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ewf extends vv9 {
    public static final Object[] i;
    public static final ewf j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new ewf(0, 0, 0, objArr, objArr);
    }

    public ewf(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int B = tol.B(obj);
                while (true) {
                    int i2 = B & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    B = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wu9
    public final int e(int i2, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // defpackage.vv9, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.wu9
    public final Object[] m() {
        return this.d;
    }

    @Override // defpackage.wu9
    public final int n() {
        return this.h;
    }

    @Override // defpackage.wu9
    public final int o() {
        return 0;
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return false;
    }

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // defpackage.vv9
    public final hv9 v() {
        return hv9.r(this.h, this.d);
    }

    @Override // defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}
