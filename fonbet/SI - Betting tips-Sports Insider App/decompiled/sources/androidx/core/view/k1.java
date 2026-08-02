package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f1343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f1344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f1345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1347e;

    public k1(s1 s1Var, k2 k2Var, k2 k2Var2, int i5, View view) {
        this.f1343a = s1Var;
        this.f1344b = k2Var;
        this.f1345c = k2Var2;
        this.f1346d = i5;
        this.f1347e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        s1 s1Var = this.f1343a;
        r1 r1Var = s1Var.f1391a;
        r1Var.e(animatedFraction);
        k2 k2Var = this.f1344b;
        h2 h2Var = k2Var.f1349a;
        float c2 = r1Var.c();
        PathInterpolator pathInterpolator = n1.f1363e;
        int i5 = Build.VERSION.SDK_INT;
        z1 y1Var = i5 >= 34 ? new y1(k2Var) : i5 >= 31 ? new x1(k2Var) : i5 >= 30 ? new w1(k2Var) : i5 >= 29 ? new v1(k2Var) : new t1(k2Var);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.f1346d & i10) == 0) {
                y1Var.c(i10, h2Var.f(i10));
            } else {
                g0.d f6 = h2Var.f(i10);
                g0.d f10 = this.f1345c.f1349a.f(i10);
                float f11 = 1.0f - c2;
                y1Var.c(i10, k2.e(f6, (int) (((f6.f9676a - f10.f9676a) * f11) + 0.5d), (int) (((f6.f9677b - f10.f9677b) * f11) + 0.5d), (int) (((f6.f9678c - f10.f9678c) * f11) + 0.5d), (int) (((f6.f9679d - f10.f9679d) * f11) + 0.5d)));
            }
        }
        n1.h(this.f1347e, y1Var.b(), Collections.singletonList(s1Var));
    }
}
