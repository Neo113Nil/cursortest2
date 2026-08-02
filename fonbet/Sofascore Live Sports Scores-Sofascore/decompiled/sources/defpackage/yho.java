package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yho extends e5 implements ListIterator {
    public final /* synthetic */ n5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yho(n5 n5Var, int i) {
        super(n5Var, ((List) n5Var.c).listIterator(i), (byte) 0);
        this.e = n5Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        n5 n5Var = this.e;
        boolean isEmpty = n5Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((hjo) n5Var.g).e++;
        if (isEmpty) {
            n5Var.n();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yho(n5 n5Var) {
        super(n5Var, (byte) 0);
        this.e = n5Var;
    }
}
