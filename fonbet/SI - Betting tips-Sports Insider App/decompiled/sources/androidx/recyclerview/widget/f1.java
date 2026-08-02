package androidx.recyclerview.widget;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public d1 f2390a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2391b;

    /* renamed from: c, reason: collision with root package name */
    public long f2392c;

    /* renamed from: d, reason: collision with root package name */
    public long f2393d;

    /* renamed from: e, reason: collision with root package name */
    public long f2394e;

    /* renamed from: f, reason: collision with root package name */
    public long f2395f;

    public static void b(d2 d2Var) {
        int i5 = d2Var.mFlags;
        if (!d2Var.isInvalid() && (i5 & 4) == 0) {
            d2Var.getOldPosition();
            d2Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(d2 d2Var, d2 d2Var2, e1 e1Var, e1 e1Var2);

    public final void c(d2 d2Var) {
        d1 d1Var = this.f2390a;
        if (d1Var != null) {
            RecyclerView recyclerView = ((v0) d1Var).f2572a;
            d2Var.setIsRecyclable(true);
            if (d2Var.mShadowedHolder != null && d2Var.mShadowingHolder == null) {
                d2Var.mShadowedHolder = null;
            }
            d2Var.mShadowingHolder = null;
            if (d2Var.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(d2Var.itemView) || !d2Var.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(d2Var.itemView, false);
        }
    }

    public abstract void d(d2 d2Var);

    public abstract void e();

    public abstract boolean f();
}
