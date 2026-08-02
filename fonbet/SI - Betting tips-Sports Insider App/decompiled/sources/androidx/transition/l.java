package androidx.transition;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f2723e;

    public l(n nVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2723e = nVar;
        this.f2719a = obj;
        this.f2720b = arrayList;
        this.f2721c = obj2;
        this.f2722d = arrayList2;
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void onTransitionEnd(a0 a0Var) {
        a0Var.removeListener(this);
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void onTransitionStart(a0 a0Var) {
        n nVar = this.f2723e;
        Object obj = this.f2719a;
        if (obj != null) {
            nVar.A(obj, this.f2720b, null);
        }
        Object obj2 = this.f2721c;
        if (obj2 != null) {
            nVar.A(obj2, this.f2722d, null);
        }
    }
}
