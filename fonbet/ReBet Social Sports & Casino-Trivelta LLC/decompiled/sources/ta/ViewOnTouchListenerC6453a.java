package ta;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: ta.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ViewOnTouchListenerC6453a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f65798a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65799b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65800c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65801d;

    public ViewOnTouchListenerC6453a(Dialog dialog, Rect rect) {
        this.f65798a = dialog;
        this.f65799b = rect.left;
        this.f65800c = rect.top;
        this.f65801d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f65799b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f65800c + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f65801d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f65798a.onTouchEvent(obtain);
    }
}
