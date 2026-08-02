package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import defpackage.f8b;
import defpackage.qrf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h extends f8b {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(w wVar, Context context, int i) {
        super(context);
        this.a = i;
        this.b = wVar;
    }

    private final void a(View view, qrf qrfVar, r rVar) {
        i iVar = (i) this.b;
        int[] calculateDistanceToFinalSnap = iVar.calculateDistanceToFinalSnap(iVar.mRecyclerView.getLayoutManager(), view);
        int i = calculateDistanceToFinalSnap[0];
        int i2 = calculateDistanceToFinalSnap[1];
        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
        if (calculateTimeForDeceleration > 0) {
            rVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
        }
    }

    private final void b(View view, qrf qrfVar, r rVar) {
        w wVar = this.b;
        RecyclerView recyclerView = wVar.mRecyclerView;
        if (recyclerView == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = wVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
        int i = calculateDistanceToFinalSnap[0];
        int i2 = calculateDistanceToFinalSnap[1];
        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
        if (calculateTimeForDeceleration > 0) {
            rVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
        }
    }

    @Override // defpackage.f8b
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i;
        switch (this.a) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // defpackage.f8b
    public int calculateTimeForScrolling(int i) {
        switch (this.a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i));
            default:
                return super.calculateTimeForScrolling(i);
        }
    }

    @Override // defpackage.f8b, androidx.recyclerview.widget.s
    public final void onTargetFound(View view, qrf qrfVar, r rVar) {
        switch (this.a) {
            case 0:
                a(view, qrfVar, rVar);
                break;
            default:
                b(view, qrfVar, rVar);
                break;
        }
    }
}
