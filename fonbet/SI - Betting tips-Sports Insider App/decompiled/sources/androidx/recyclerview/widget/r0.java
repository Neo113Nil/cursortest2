package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f2535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(h2 h2Var, Context context, int i5) {
        super(context);
        this.f2534a = i5;
        this.f2535b = h2Var;
    }

    @Override // androidx.recyclerview.widget.m0
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i5;
        switch (this.f2534a) {
            case 0:
                i5 = displayMetrics.densityDpi;
                break;
            default:
                i5 = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i5;
    }

    @Override // androidx.recyclerview.widget.m0
    public int calculateTimeForScrolling(int i5) {
        switch (this.f2534a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i5));
            default:
                return super.calculateTimeForScrolling(i5);
        }
    }

    @Override // androidx.recyclerview.widget.m0, androidx.recyclerview.widget.y1
    public final void onTargetFound(View view, z1 z1Var, w1 w1Var) {
        switch (this.f2534a) {
            case 0:
                s0 s0Var = (s0) this.f2535b;
                int[] calculateDistanceToFinalSnap = s0Var.calculateDistanceToFinalSnap(s0Var.mRecyclerView.getLayoutManager(), view);
                int i5 = calculateDistanceToFinalSnap[0];
                int i10 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i5), Math.abs(i10)));
                if (calculateTimeForDeceleration > 0) {
                    w1Var.b(i5, i10, this.mDecelerateInterpolator, calculateTimeForDeceleration);
                    break;
                }
                break;
            default:
                h2 h2Var = this.f2535b;
                RecyclerView recyclerView = h2Var.mRecyclerView;
                if (recyclerView != null) {
                    int[] calculateDistanceToFinalSnap2 = h2Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
                    int i11 = calculateDistanceToFinalSnap2[0];
                    int i12 = calculateDistanceToFinalSnap2[1];
                    int calculateTimeForDeceleration2 = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
                    if (calculateTimeForDeceleration2 > 0) {
                        w1Var.b(i11, i12, this.mDecelerateInterpolator, calculateTimeForDeceleration2);
                        break;
                    }
                }
                break;
        }
    }
}
