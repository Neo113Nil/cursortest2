package we;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f25259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25260c;

    public /* synthetic */ b(View view, int i5, int i10) {
        this.f25258a = i10;
        this.f25259b = view;
        this.f25260c = i5;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f6, Transformation t3) {
        switch (this.f25258a) {
            case 0:
                Intrinsics.checkNotNullParameter(t3, "t");
                View view = this.f25259b;
                if (f6 != 1.0f) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i5 = this.f25260c;
                    layoutParams.height = i5 - ((int) (i5 * f6));
                    view.requestLayout();
                    break;
                } else {
                    view.setVisibility(8);
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(t3, "t");
                View view2 = this.f25259b;
                view2.getLayoutParams().height = f6 == 1.0f ? -2 : (int) (this.f25260c * f6);
                view2.requestLayout();
                break;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        switch (this.f25258a) {
        }
        return true;
    }
}
