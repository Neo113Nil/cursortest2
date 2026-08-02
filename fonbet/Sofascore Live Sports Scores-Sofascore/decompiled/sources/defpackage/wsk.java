package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wsk extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ HorizontalScrollView b;
    public final /* synthetic */ View c;

    public wsk(View view, HorizontalScrollView horizontalScrollView, View view2) {
        this.a = view;
        this.b = horizontalScrollView;
        this.c = view2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getClass();
        View view = this.a;
        Drawable background = view.getBackground();
        RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
        if (rippleDrawable != null) {
            rippleDrawable.setHotspot(this.b.getScrollX(), motionEvent.getY());
        }
        view.setPressed(true);
        View view2 = this.c;
        view2.setPressed(true);
        view2.performClick();
        return true;
    }
}
