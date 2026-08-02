package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ut4 extends ctj {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final SparseArray E;
    public final SparseBooleanArray F;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public ut4(wt4 wt4Var) {
        c(wt4Var);
        this.x = wt4Var.y;
        this.y = wt4Var.z;
        this.z = wt4Var.A;
        this.A = wt4Var.B;
        this.B = wt4Var.C;
        this.C = wt4Var.D;
        this.D = wt4Var.E;
        SparseArray sparseArray = wt4Var.F;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.E = sparseArray2;
        this.F = wt4Var.G.clone();
    }

    @Override // defpackage.ctj
    public final etj a() {
        return new wt4(this);
    }

    @Override // defpackage.ctj
    public final ctj b(int i) {
        super.b(i);
        return this;
    }

    @Override // defpackage.ctj
    public final ctj d() {
        this.u = -3;
        return this;
    }

    @Override // defpackage.ctj
    public final ctj e(zsj zsjVar) {
        super.e(zsjVar);
        return this;
    }

    @Override // defpackage.ctj
    public final ctj f() {
        super.f();
        return this;
    }

    @Override // defpackage.ctj
    public final ctj g(String[] strArr) {
        super.g(strArr);
        return this;
    }

    @Override // defpackage.ctj
    public final ctj h() {
        this.s = false;
        return this;
    }

    @Override // defpackage.ctj
    public final ctj i(int i, boolean z) {
        super.i(i, z);
        return this;
    }

    public final void j(Set set) {
        this.w.clear();
        this.w.addAll(set);
    }

    public ut4() {
        this.E = new SparseArray();
        this.F = new SparseBooleanArray();
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
    }
}
