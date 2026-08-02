package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2592b;

    public /* synthetic */ y(int i5, Object obj) {
        this.f2591a = i5;
        this.f2592b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f2591a;
        Object obj = this.f2592b;
        switch (i5) {
            case 0:
                c0 c0Var = (c0) obj;
                ValueAnimator valueAnimator = c0Var.f2354z;
                int i10 = c0Var.A;
                if (i10 == 1) {
                    valueAnimator.cancel();
                } else if (i10 != 2) {
                }
                c0Var.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).d();
                break;
        }
    }
}
