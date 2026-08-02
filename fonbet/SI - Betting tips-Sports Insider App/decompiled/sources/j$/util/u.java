package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class u extends o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.o, java.util.List
    public final java.util.List subList(int i5, int i10) {
        return new u(this.f17760b.subList(i5, i10));
    }

    private Object writeReplace() {
        return new o(this.f17760b);
    }
}
