package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a21 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e21 b;

    public /* synthetic */ a21(e21 e21Var, int i) {
        this.a = i;
        this.b = e21Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float resultCenterY;
        int i9 = this.a;
        e21 e21Var = this.b;
        view.getClass();
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                boolean z = e21Var.n;
                Rect rect = e21Var.o;
                e21Var.v = e21Var.getFirstTeamLogo().getBottom() - e21Var.getFirstTeamLogo().getPivotY();
                resultCenterY = e21Var.getResultCenterY();
                e21Var.u = resultCenterY;
                if (e21Var.isAttachedToWindow()) {
                    e21Var.getBinding().l.getGlobalVisibleRect(rect);
                    int i10 = z ? rect.right : rect.left;
                    e21Var.getFirstTeamLogo().getGlobalVisibleRect(rect);
                    e21Var.w = i10 - (z ? rect.left : rect.right);
                    break;
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                e21Var.t = (-e21Var.getFollowButtonFirstTeam().getX()) + (e21Var.n ? e21Var.getWidth() : -e21Var.getFollowButtonFirstTeam().getWidth());
                break;
        }
    }
}
