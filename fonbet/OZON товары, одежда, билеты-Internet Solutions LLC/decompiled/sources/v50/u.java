package v50;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class u extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    private static final int f102411c = C.D.c(24.0f);

    /* renamed from: a, reason: collision with root package name */
    private float f102412a;

    /* renamed from: b, reason: collision with root package name */
    private float f102413b;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f102412a = motionEvent.getX();
            this.f102413b = motionEvent.getY();
        } else if (valueOf != null && valueOf.intValue() == 2) {
            float abs = Math.abs(this.f102412a - motionEvent.getX());
            int i11 = f102411c;
            if (abs > i11 || Math.abs(this.f102413b - motionEvent.getY()) > i11) {
                return true;
            }
        } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 1)) {
            this.f102412a = 0.0f;
            this.f102413b = 0.0f;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
