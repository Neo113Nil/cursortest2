package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m5 extends e5 implements ListIterator {
    public final /* synthetic */ n5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(n5 n5Var, int i) {
        super(n5Var, ((List) n5Var.c).listIterator(i));
        this.e = n5Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        n5 n5Var = this.e;
        boolean isEmpty = n5Var.isEmpty();
        c().add(obj);
        ((azc) n5Var.g).f++;
        if (isEmpty) {
            n5Var.c();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(n5 n5Var) {
        super(n5Var);
        this.e = n5Var;
    }
}
