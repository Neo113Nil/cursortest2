package androidx.appcompat.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f868b;

    public /* synthetic */ p2(s2 s2Var, int i5) {
        this.f867a = i5;
        this.f868b = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f867a) {
            case 0:
                g2 g2Var = this.f868b.f919c;
                if (g2Var != null) {
                    g2Var.setListSelectionHidden(true);
                    g2Var.requestLayout();
                    break;
                }
                break;
            default:
                s2 s2Var = this.f868b;
                g2 g2Var2 = s2Var.f919c;
                if (g2Var2 != null && g2Var2.isAttachedToWindow() && s2Var.f919c.getCount() > s2Var.f919c.getChildCount() && s2Var.f919c.getChildCount() <= s2Var.f928m) {
                    s2Var.f940z.setInputMethodMode(2);
                    s2Var.show();
                    break;
                }
                break;
        }
    }
}
