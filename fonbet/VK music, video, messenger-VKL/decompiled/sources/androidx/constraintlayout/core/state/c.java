package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Collections;
import xsna.e2v;
import xsna.lhq;

/* compiled from: HelperReference.java */
/* loaded from: classes11.dex */
public class c extends a implements lhq {
    public final State k0;
    public final State.Helper l0;
    public final ArrayList<Object> m0;

    public c(State state, State.Helper helper) {
        super(state);
        this.m0 = new ArrayList<>();
        this.k0 = state;
        this.l0 = helper;
    }

    @Override // androidx.constraintlayout.core.state.a, xsna.dpf0
    public final ConstraintWidget a() {
        return s();
    }

    public final void q(Object... objArr) {
        Collections.addAll(this.m0, objArr);
    }

    public final void r() {
        super.apply();
    }

    public e2v s() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.a, xsna.dpf0
    public void apply() {
    }
}
