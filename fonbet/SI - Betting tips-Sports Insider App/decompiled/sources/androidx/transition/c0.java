package androidx.transition;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.e f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f2680b;

    public c0(d0 d0Var, s.e eVar) {
        this.f2680b = d0Var;
        this.f2679a = eVar;
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void onTransitionEnd(a0 a0Var) {
        ((ArrayList) this.f2679a.get(this.f2680b.f2684b)).remove(a0Var);
        a0Var.removeListener(this);
    }
}
