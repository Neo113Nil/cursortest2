package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y39 implements Iterator, eia {
    public final jlh a;
    public final int b;
    public int c;
    public final int d;

    public y39(jlh jlhVar, int i, int i2) {
        this.a = jlhVar;
        this.b = i2;
        this.c = i;
        this.d = jlhVar.h;
        if (jlhVar.g) {
            llh.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        jlh jlhVar = this.a;
        int i = jlhVar.h;
        int i2 = this.d;
        if (i != i2) {
            llh.e();
        }
        int i3 = this.c;
        this.c = jlhVar.a[(i3 * 5) + 3] + i3;
        return new klh(jlhVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
