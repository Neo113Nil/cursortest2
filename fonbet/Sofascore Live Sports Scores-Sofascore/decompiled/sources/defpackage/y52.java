package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class y52 extends v4 {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public y52(Object obj, int i) {
        super(i, 1, 0);
        this.e = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    this.b++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    yhk.d();
                    break;
                } else {
                    int i2 = this.b - 1;
                    this.b = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    yhk.d();
                    break;
                } else {
                    this.b--;
                    break;
                }
        }
        return null;
    }

    public y52(int i, int i2, Object[] objArr) {
        super(i, i2, 0);
        this.e = objArr;
    }
}
