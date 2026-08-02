package androidx.appcompat.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r2 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2 f902a;

    public r2(s2 s2Var) {
        this.f902a = s2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s2 s2Var = this.f902a;
        p2 p2Var = s2Var.f932r;
        Handler handler = s2Var.f936v;
        j0 j0Var = s2Var.f940z;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        if (action == 0 && j0Var != null && j0Var.isShowing() && x10 >= 0 && x10 < j0Var.getWidth() && y5 >= 0 && y5 < j0Var.getHeight()) {
            handler.postDelayed(p2Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(p2Var);
        return false;
    }
}
