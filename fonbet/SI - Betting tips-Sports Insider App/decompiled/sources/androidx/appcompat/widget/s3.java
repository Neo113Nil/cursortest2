package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s3 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f941a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f942b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f943c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f944d;

    /* renamed from: e, reason: collision with root package name */
    public final int f945e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f946f;

    public s3(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f945e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f942b = rect3;
        Rect rect4 = new Rect();
        this.f944d = rect4;
        Rect rect5 = new Rect();
        this.f943c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i5 = -scaledTouchSlop;
        rect4.inset(i5, i5);
        rect5.set(rect2);
        this.f941a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z7;
        int x10 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z7 = this.f946f;
                if (z7 && !this.f944d.contains(x10, y5)) {
                    z10 = z7;
                    z5 = false;
                }
            } else {
                if (action == 3) {
                    z7 = this.f946f;
                    this.f946f = false;
                }
                z5 = true;
                z10 = false;
            }
            z10 = z7;
            z5 = true;
        } else {
            if (this.f942b.contains(x10, y5)) {
                this.f946f = true;
                z5 = true;
            }
            z5 = true;
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Rect rect = this.f943c;
        View view = this.f941a;
        if (!z5 || rect.contains(x10, y5)) {
            motionEvent.setLocation(x10 - rect.left, y5 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
