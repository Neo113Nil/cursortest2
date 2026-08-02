package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f17838m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f17822e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f17822e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public void d(int i10) {
        if (this.f17827j) {
            return;
        }
        this.f17827j = true;
        this.f17824g = i10;
        for (d dVar : this.f17828k) {
            dVar.a(dVar);
        }
    }
}
