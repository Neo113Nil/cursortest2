package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ironsource.Aa;
import com.ironsource.C2733x2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes8.dex */
public class o extends FrameLayout {
    private ISBannerSize a;
    private String b;
    private boolean c;
    private a d;

    public interface a {
        void onWindowFocusChanged(boolean z);
    }

    public o(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.c = false;
        this.a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    protected void a() {
        this.c = true;
        this.a = null;
        this.b = null;
        this.d = null;
        C2733x2.a().a((Aa) null);
    }

    public boolean b() {
        return this.c;
    }

    protected o c() {
        o oVar = new o(getContext(), this.a);
        oVar.b = this.b;
        return oVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public ISBannerSize getSize() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.a = iSBannerSize;
    }

    public o(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.c = false;
        this.a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public o(Context context) {
        super(context);
        this.c = false;
    }
}
