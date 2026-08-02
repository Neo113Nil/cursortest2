package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class s4 extends r4 implements ListIterator {
    public final /* synthetic */ u4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(u4 u4Var, int i) {
        super(u4Var, 0);
        this.d = u4Var;
        q4 q4Var = u4.Companion;
        int size = u4Var.size();
        q4Var.getClass();
        q4.c(i, size);
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yhk.d();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
