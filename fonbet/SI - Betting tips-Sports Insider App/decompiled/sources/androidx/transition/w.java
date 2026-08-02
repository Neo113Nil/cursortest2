package androidx.transition;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements androidx.dynamicanimation.animation.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f2752a;

    public /* synthetic */ w(x xVar) {
        this.f2752a = xVar;
    }

    public final void a(float f6) {
        a0 a0Var;
        x xVar = this.f2752a;
        a0 a0Var2 = xVar.f2765g;
        androidx.appcompat.app.b0 b0Var = z.N;
        if (f6 >= 1.0f) {
            a0Var2.notifyListeners(b0Var, false);
            return;
        }
        long totalDurationMillis = a0Var2.getTotalDurationMillis();
        a0 h10 = ((i0) a0Var2).h(0);
        a0Var = h10.mCloneParent;
        h10.mCloneParent = null;
        a0Var2.setCurrentPlayTimeMillis(-1L, xVar.f2759a);
        a0Var2.setCurrentPlayTimeMillis(totalDurationMillis, -1L);
        xVar.f2759a = totalDurationMillis;
        androidx.fragment.app.c cVar = xVar.f2764f;
        if (cVar != null) {
            cVar.run();
        }
        a0Var2.mAnimators.clear();
        if (a0Var != null) {
            a0Var.notifyListeners(b0Var, true);
        }
    }
}
