package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f901b;

    public /* synthetic */ r0(int i5, Object obj) {
        this.f900a = i5;
        this.f901b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f900a) {
            case 0:
                z0 z0Var = (z0) this.f901b;
                if (!z0Var.getInternalPopup().a()) {
                    z0Var.f1030f.k(z0Var.getTextDirection(), z0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = z0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                x0 x0Var = (x0) this.f901b;
                z0 z0Var2 = x0Var.H;
                x0Var.getClass();
                if (!z0Var2.isAttachedToWindow() || !z0Var2.getGlobalVisibleRect(x0Var.F)) {
                    x0Var.dismiss();
                    break;
                } else {
                    x0Var.p();
                    x0Var.show();
                    break;
                }
                break;
        }
    }
}
