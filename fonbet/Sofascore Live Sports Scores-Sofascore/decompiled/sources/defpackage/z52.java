package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z52 extends v4 {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public z52(int i, int i2, Object[] objArr) {
        super(i, i2, 1);
        this.e = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.e;
                    int i = this.b;
                    this.b = i + 1;
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
        switch (this.d) {
            case 0:
                if (!hasPrevious()) {
                    yhk.d();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.e;
                    int i = this.b - 1;
                    this.b = i;
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

    public z52(Object obj, int i) {
        super(i, 1, 1);
        this.e = obj;
    }
}
