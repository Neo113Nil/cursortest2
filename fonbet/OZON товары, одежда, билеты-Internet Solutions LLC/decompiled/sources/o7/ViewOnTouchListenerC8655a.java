package o7;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC8655a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Dialog f77782a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77783b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77784c;

    /* renamed from: d, reason: collision with root package name */
    private final int f77785d;

    public ViewOnTouchListenerC8655a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f77782a = dialog;
        this.f77783b = rect.left;
        this.f77784c = rect.top;
        this.f77785d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f77783b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f77784c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i11 = this.f77785d;
            obtain.setLocation((-i11) - 1, (-i11) - 1);
        }
        view.performClick();
        return this.f77782a.onTouchEvent(obtain);
    }
}
