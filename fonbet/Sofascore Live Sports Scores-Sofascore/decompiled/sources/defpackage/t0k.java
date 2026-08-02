package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t0k extends v4 {
    public int d;
    public Object[] e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public t0k(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, 1);
        this.d = i3;
        Object[] objArr2 = new Object[i3];
        this.e = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f = r5;
        objArr2[0] = objArr;
        c(i - r5, 1);
    }

    public final Object a() {
        int i = this.b & 31;
        Object obj = this.e[this.d - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void c(int i, int i2) {
        int i3 = (this.d - i2) * 5;
        while (i2 < this.d) {
            Object[] objArr = this.e;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[x2a.C(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void d(int i) {
        int i2 = 0;
        while (x2a.C(this.b, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            c(this.b, ((this.d - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        Object a = a();
        int i = this.b + 1;
        this.b = i;
        if (i == this.c) {
            this.f = true;
            return a;
        }
        d(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yhk.d();
            return null;
        }
        this.b--;
        if (this.f) {
            this.f = false;
            return a();
        }
        d(31);
        return a();
    }
}
