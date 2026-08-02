package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u1 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f2096b;

    public /* synthetic */ u1(int i5, Rect rect) {
        this.f2095a = i5;
        this.f2096b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f2095a) {
            case 0:
                return this.f2096b;
            default:
                Rect rect = this.f2096b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
