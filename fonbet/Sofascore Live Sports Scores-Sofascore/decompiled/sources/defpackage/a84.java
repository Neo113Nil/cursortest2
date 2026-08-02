package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.r;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a84 extends f8b {
    public final /* synthetic */ b84 a;
    public final /* synthetic */ n b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a84(Context context, b84 b84Var, n nVar) {
        super(context);
        this.a = b84Var;
        this.b = nVar;
    }

    @Override // defpackage.f8b
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        displayMetrics.getClass();
        return this.a.d / displayMetrics.densityDpi;
    }

    @Override // defpackage.f8b, androidx.recyclerview.widget.s
    public final void onTargetFound(View view, qrf qrfVar, r rVar) {
        view.getClass();
        qrfVar.getClass();
        rVar.getClass();
        n nVar = this.b;
        b84 b84Var = this.a;
        int[] calculateDistanceToFinalSnap = b84Var.calculateDistanceToFinalSnap(nVar, view);
        int i = calculateDistanceToFinalSnap[0];
        int i2 = calculateDistanceToFinalSnap[1];
        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.abs(i));
        int i3 = b84Var.e;
        if (i3 <= calculateTimeForDeceleration) {
            calculateTimeForDeceleration = i3;
        }
        rVar.b(i, i2, this.mDecelerateInterpolator, 1 < calculateTimeForDeceleration ? calculateTimeForDeceleration : 1);
    }
}
