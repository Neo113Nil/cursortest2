package androidx.transition;

import android.graphics.Rect;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f2715b;

    public /* synthetic */ j(int i5, Rect rect) {
        this.f2714a = i5;
        this.f2715b = rect;
    }

    @Override // androidx.transition.u
    public final Rect a() {
        switch (this.f2714a) {
            case 0:
                return this.f2715b;
            default:
                Rect rect = this.f2715b;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
