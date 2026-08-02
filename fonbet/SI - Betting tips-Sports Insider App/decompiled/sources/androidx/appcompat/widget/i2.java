package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f777b;

    public /* synthetic */ i2(j2 j2Var, int i5) {
        this.f776a = i5;
        this.f777b = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f776a) {
            case 0:
                ViewParent parent = this.f777b.f795d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                j2 j2Var = this.f777b;
                j2Var.a();
                View view = j2Var.f795d;
                if (view.isEnabled() && !view.isLongClickable() && j2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    j2Var.f798g = true;
                    break;
                }
                break;
        }
    }
}
