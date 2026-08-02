package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lfe extends v4 {
    public final hfe d;
    public int e;
    public s0k f;
    public int g;

    public lfe(hfe hfeVar, int i) {
        super(i, hfeVar.size(), 0);
        this.d = hfeVar;
        this.e = hfeVar.m();
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
        hfe hfeVar = this.d;
        hfeVar.add(i, obj);
        this.b++;
        this.c = hfeVar.size();
        this.e = hfeVar.m();
        this.g = -1;
        c();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void c() {
        hfe hfeVar = this.d;
        Object[] objArr = hfeVar.d;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int size = (hfeVar.size() - 1) & (-32);
        int i = this.b;
        if (i > size) {
            i = size;
        }
        int i2 = (hfeVar.a / 5) + 1;
        s0k s0kVar = this.f;
        if (s0kVar == null) {
            this.f = new s0k(objArr, i, size, i2);
            return;
        }
        s0kVar.b = i;
        s0kVar.c = size;
        s0kVar.d = i2;
        Object[] objArr2 = s0kVar.e;
        if (objArr2.length < i2) {
            objArr2 = new Object[i2];
            s0kVar.e = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        s0kVar.f = r0;
        s0kVar.c(i - r0, 1);
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
        s0k s0kVar = this.f;
        hfe hfeVar = this.d;
        if (s0kVar == null) {
            Object[] objArr = hfeVar.e;
            this.b = i + 1;
            return objArr[i];
        }
        if (s0kVar.hasNext()) {
            this.b++;
            return s0kVar.next();
        }
        Object[] objArr2 = hfeVar.e;
        int i2 = this.b;
        this.b = i2 + 1;
        return objArr2[i2 - s0kVar.c];
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
        s0k s0kVar = this.f;
        hfe hfeVar = this.d;
        if (s0kVar == null) {
            Object[] objArr = hfeVar.e;
            int i2 = i - 1;
            this.b = i2;
            return objArr[i2];
        }
        int i3 = s0kVar.c;
        if (i <= i3) {
            this.b = i - 1;
            return s0kVar.previous();
        }
        Object[] objArr2 = hfeVar.e;
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
        hfe hfeVar = this.d;
        hfeVar.remove(i);
        int i2 = this.g;
        if (i2 < this.b) {
            this.b = i2;
        }
        this.c = hfeVar.size();
        this.e = hfeVar.m();
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
        hfe hfeVar = this.d;
        hfeVar.set(i, obj);
        this.e = hfeVar.m();
        c();
    }
}
