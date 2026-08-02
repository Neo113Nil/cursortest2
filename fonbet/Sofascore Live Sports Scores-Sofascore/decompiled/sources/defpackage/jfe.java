package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jfe extends v4 {
    public final Object[] d;
    public final s0k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfe(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 0);
        objArr.getClass();
        objArr2.getClass();
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new s0k(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        s0k s0kVar = this.e;
        if (s0kVar.hasNext()) {
            this.b++;
            return s0kVar.next();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i - s0kVar.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yhk.d();
            return null;
        }
        int i = this.b;
        s0k s0kVar = this.e;
        int i2 = s0kVar.c;
        if (i <= i2) {
            this.b = i - 1;
            return s0kVar.previous();
        }
        int i3 = i - 1;
        this.b = i3;
        return this.d[i3 - i2];
    }
}
