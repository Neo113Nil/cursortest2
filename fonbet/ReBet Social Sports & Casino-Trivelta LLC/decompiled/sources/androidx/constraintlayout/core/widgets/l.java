package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.e;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class l extends j {

    /* renamed from: C0, reason: collision with root package name */
    public int f18079C0 = 0;

    /* renamed from: D0, reason: collision with root package name */
    public int f18080D0 = 0;

    /* renamed from: E0, reason: collision with root package name */
    public int f18081E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    public int f18082F0 = 0;

    /* renamed from: G0, reason: collision with root package name */
    public int f18083G0 = 0;

    /* renamed from: H0, reason: collision with root package name */
    public int f18084H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    public int f18085I0 = 0;

    /* renamed from: J0, reason: collision with root package name */
    public int f18086J0 = 0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f18087K0 = false;

    /* renamed from: L0, reason: collision with root package name */
    public int f18088L0 = 0;

    /* renamed from: M0, reason: collision with root package name */
    public int f18089M0 = 0;

    /* renamed from: N0, reason: collision with root package name */
    public b.a f18090N0 = new b.a();

    /* renamed from: O0, reason: collision with root package name */
    public b.InterfaceC0352b f18091O0 = null;

    public int A1() {
        return this.f18085I0;
    }

    public int B1() {
        return this.f18086J0;
    }

    public int C1() {
        return this.f18079C0;
    }

    public abstract void D1(int i10, int i11, int i12, int i13);

    public void E1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.f18091O0 == null && K() != null) {
            this.f18091O0 = ((f) K()).K1();
        }
        b.a aVar = this.f18090N0;
        aVar.f17797a = bVar;
        aVar.f17798b = bVar2;
        aVar.f17799c = i10;
        aVar.f17800d = i11;
        this.f18091O0.b(eVar, aVar);
        eVar.l1(this.f18090N0.f17801e);
        eVar.M0(this.f18090N0.f17802f);
        eVar.L0(this.f18090N0.f17804h);
        eVar.B0(this.f18090N0.f17803g);
    }

    public boolean F1() {
        e eVar = this.f17940T;
        b.InterfaceC0352b K12 = eVar != null ? ((f) eVar).K1() : null;
        if (K12 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f18078B0; i10++) {
            e eVar2 = this.mWidgets[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b u10 = eVar2.u(0);
                e.b u11 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u10 != bVar || eVar2.f17987u == 1 || u11 != bVar || eVar2.f17989v == 1) {
                    if (u10 == bVar) {
                        u10 = e.b.WRAP_CONTENT;
                    }
                    if (u11 == bVar) {
                        u11 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.f18090N0;
                    aVar.f17797a = u10;
                    aVar.f17798b = u11;
                    aVar.f17799c = eVar2.W();
                    this.f18090N0.f17800d = eVar2.x();
                    K12.b(eVar2, this.f18090N0);
                    eVar2.l1(this.f18090N0.f17801e);
                    eVar2.M0(this.f18090N0.f17802f);
                    eVar2.B0(this.f18090N0.f17803g);
                }
            }
        }
        return true;
    }

    public boolean G1() {
        return this.f18087K0;
    }

    public void H1(boolean z10) {
        this.f18087K0 = z10;
    }

    public void I1(int i10, int i11) {
        this.f18088L0 = i10;
        this.f18089M0 = i11;
    }

    public void J1(int i10) {
        this.f18081E0 = i10;
        this.f18079C0 = i10;
        this.f18082F0 = i10;
        this.f18080D0 = i10;
        this.f18083G0 = i10;
        this.f18084H0 = i10;
    }

    public void K1(int i10) {
        this.f18080D0 = i10;
    }

    public void L1(int i10) {
        this.f18084H0 = i10;
    }

    public void M1(int i10) {
        this.f18081E0 = i10;
        this.f18085I0 = i10;
    }

    public void N1(int i10) {
        this.f18082F0 = i10;
        this.f18086J0 = i10;
    }

    public void O1(int i10) {
        this.f18083G0 = i10;
        this.f18085I0 = i10;
        this.f18086J0 = i10;
    }

    public void P1(int i10) {
        this.f18079C0 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.j, androidx.constraintlayout.core.widgets.i
    public void c(f fVar) {
        v1();
    }

    public void u1(boolean z10) {
        int i10 = this.f18083G0;
        if (i10 > 0 || this.f18084H0 > 0) {
            if (z10) {
                this.f18085I0 = this.f18084H0;
                this.f18086J0 = i10;
            } else {
                this.f18085I0 = i10;
                this.f18086J0 = this.f18084H0;
            }
        }
    }

    public void v1() {
        for (int i10 = 0; i10 < this.f18078B0; i10++) {
            e eVar = this.mWidgets[i10];
            if (eVar != null) {
                eVar.V0(true);
            }
        }
    }

    public boolean w1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.f18078B0; i10++) {
            if (hashSet.contains(this.mWidgets[i10])) {
                return true;
            }
        }
        return false;
    }

    public int x1() {
        return this.f18089M0;
    }

    public int y1() {
        return this.f18088L0;
    }

    public int z1() {
        return this.f18080D0;
    }
}
