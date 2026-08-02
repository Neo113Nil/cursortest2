package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.C2556n4;
import com.ironsource.C2751y2;
import com.ironsource.InterfaceC2738x7;
import com.ironsource.Jb;
import com.ironsource.Pc;
import com.ironsource.sdk.controller.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes8.dex */
public class h extends FrameLayout implements Pc {
    private Context a;
    private v b;
    private final InterfaceC2738x7 c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.c = Jb.Y().a();
        this.a = context;
        setClickable(true);
    }

    private void b() {
        ((Activity) this.a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.c.A(activity) == 1) {
                int i = rect.bottom - rect2.bottom;
                if (i > 0) {
                    return i;
                }
                return 0;
            }
            int i2 = rect.right - rect2.right;
            if (i2 > 0) {
                return i2;
            }
            return 0;
        } catch (Exception e) {
            C2556n4.d().a(e);
            return 0;
        }
    }

    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e) {
            C2556n4.d().a(e);
            return 0;
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    public void a(v vVar) {
        this.b = vVar;
        vVar.a(this);
        this.b.H();
        this.a = this.b.q();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
        this.b.b(true, "main");
    }

    @Override // com.ironsource.Pc
    public boolean onBackButtonPressed() {
        return C2751y2.a().a((Activity) this.a);
    }

    @Override // com.ironsource.Pc
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.E();
        this.b.b(false, "main");
        v vVar = this.b;
        if (vVar != null) {
            vVar.a(v.EnumC0225v.Gone);
            this.b.F();
            this.b.G();
        }
        removeAllViews();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.ironsource.Pc
    public void onOrientationChanged(String str, int i) {
    }

    private void a() {
        ((Activity) this.a).runOnUiThread(new a());
    }

    private void a(int i, int i2) {
        try {
            Context context = this.a;
            if (context != null) {
                int A = this.c.A(context);
                if (A == 1) {
                    setPadding(0, i, 0, i2);
                } else if (A == 2) {
                    setPadding(0, i, i2, 0);
                }
            }
        } catch (Exception e) {
            C2556n4.d().a(e);
        }
    }
}
