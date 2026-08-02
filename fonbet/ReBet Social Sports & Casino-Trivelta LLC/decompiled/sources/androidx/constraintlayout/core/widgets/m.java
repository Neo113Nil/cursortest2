package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m extends e {

    /* renamed from: B0, reason: collision with root package name */
    public ArrayList f18092B0 = new ArrayList();

    public void a(e eVar) {
        this.f18092B0.add(eVar);
        if (eVar.K() != null) {
            ((m) eVar.K()).u1(eVar);
        }
        eVar.d1(this);
    }

    public ArrayList s1() {
        return this.f18092B0;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void t0() {
        this.f18092B0.clear();
        super.t0();
    }

    public abstract void t1();

    public void u1(e eVar) {
        this.f18092B0.remove(eVar);
        eVar.t0();
    }

    public void v1() {
        this.f18092B0.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void w0(androidx.constraintlayout.core.c cVar) {
        super.w0(cVar);
        int size = this.f18092B0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f18092B0.get(i10)).w0(cVar);
        }
    }
}
