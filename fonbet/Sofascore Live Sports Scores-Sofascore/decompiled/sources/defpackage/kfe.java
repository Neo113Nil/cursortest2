package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kfe extends v4 {
    public final Object[] d;
    public final t0k e;

    public kfe(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 1);
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new t0k(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        t0k t0kVar = this.e;
        if (t0kVar.hasNext()) {
            this.b++;
            return t0kVar.next();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i - t0kVar.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yhk.d();
            return null;
        }
        int i = this.b;
        t0k t0kVar = this.e;
        int i2 = t0kVar.c;
        if (i <= i2) {
            this.b = i - 1;
            return t0kVar.previous();
        }
        int i3 = i - 1;
        this.b = i3;
        return this.d[i3 - i2];
    }
}
