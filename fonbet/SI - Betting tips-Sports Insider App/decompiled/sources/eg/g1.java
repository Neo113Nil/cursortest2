package eg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class g1 extends m1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(e1 e1Var) {
        super(true);
        m1 j;
        boolean z5 = true;
        L(e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.f9203b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar != null && (j = pVar.j()) != null) {
            while (!j.E()) {
                o oVar2 = (o) atomicReferenceFieldUpdater.get(j);
                p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
                if (pVar2 != null && (j = pVar2.j()) != null) {
                }
            }
            this.f9173c = z5;
        }
        z5 = false;
        this.f9173c = z5;
    }

    @Override // eg.m1
    public final boolean E() {
        return this.f9173c;
    }

    @Override // eg.m1
    public final boolean F() {
        return true;
    }
}
