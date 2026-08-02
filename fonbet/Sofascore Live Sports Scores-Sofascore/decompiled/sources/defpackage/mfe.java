package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mfe extends v4 {
    public final ife d;
    public int e;
    public t0k f;
    public int g;

    public mfe(ife ifeVar, int i) {
        super(i, ifeVar.size(), 1);
        this.d = ifeVar;
        this.e = ifeVar.m();
        this.g = -1;
        c();
    }

    public final void a() {
        if (this.e == this.d.m()) {
            return;
        }
        a70.o();
    }

    @Override // defpackage.v4, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        ife ifeVar = this.d;
        ifeVar.add(i, obj);
        this.b++;
        this.c = ifeVar.size();
        this.e = ifeVar.m();
        this.g = -1;
        c();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void c() {
        ife ifeVar = this.d;
        Object[] objArr = ifeVar.f;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int size = (ifeVar.size() - 1) & (-32);
        int i = this.b;
        if (i > size) {
            i = size;
        }
        int i2 = (ifeVar.d / 5) + 1;
        t0k t0kVar = this.f;
        if (t0kVar == null) {
            this.f = new t0k(objArr, i, size, i2);
            return;
        }
        t0kVar.b = i;
        t0kVar.c = size;
        t0kVar.d = i2;
        Object[] objArr2 = t0kVar.e;
        if (objArr2.length < i2) {
            objArr2 = new Object[i2];
            t0kVar.e = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        t0kVar.f = r0;
        t0kVar.c(i - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        int i = this.b;
        this.g = i;
        t0k t0kVar = this.f;
        ife ifeVar = this.d;
        if (t0kVar == null) {
            Object[] objArr = ifeVar.g;
            this.b = i + 1;
            return objArr[i];
        }
        if (t0kVar.hasNext()) {
            this.b++;
            return t0kVar.next();
        }
        Object[] objArr2 = ifeVar.g;
        int i2 = this.b;
        this.b = i2 + 1;
        return objArr2[i2 - t0kVar.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            yhk.d();
            return null;
        }
        int i = this.b;
        this.g = i - 1;
        t0k t0kVar = this.f;
        ife ifeVar = this.d;
        if (t0kVar == null) {
            Object[] objArr = ifeVar.g;
            int i2 = i - 1;
            this.b = i2;
            return objArr[i2];
        }
        int i3 = t0kVar.c;
        if (i <= i3) {
            this.b = i - 1;
            return t0kVar.previous();
        }
        Object[] objArr2 = ifeVar.g;
        int i4 = i - 1;
        this.b = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.v4, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.g;
        if (i == -1) {
            zzl.s();
            return;
        }
        ife ifeVar = this.d;
        ifeVar.remove(i);
        int i2 = this.g;
        if (i2 < this.b) {
            this.b = i2;
        }
        this.c = ifeVar.size();
        this.e = ifeVar.m();
        this.g = -1;
        c();
    }

    @Override // defpackage.v4, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.g;
        if (i == -1) {
            zzl.s();
            return;
        }
        ife ifeVar = this.d;
        ifeVar.set(i, obj);
        this.e = ifeVar.m();
        c();
    }
}
