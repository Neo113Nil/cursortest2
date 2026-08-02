package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class j extends h implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.h, java.util.List
    public final java.util.List subList(int i5, int i10) {
        j jVar;
        synchronized (this.f17727b) {
            jVar = new j(this.f17731c.subList(i5, i10), this.f17727b);
        }
        return jVar;
    }

    private Object writeReplace() {
        return new h(this.f17731c);
    }
}
