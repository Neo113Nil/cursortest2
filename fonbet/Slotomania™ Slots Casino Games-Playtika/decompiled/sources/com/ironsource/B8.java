package com.ironsource;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class B8 extends FrameLayout {
    private final String a;
    private a b;

    public interface a {
        void a(Ag ag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = "ISNNativeAdContainer";
    }

    private final Ag a() {
        return new Ag(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final a getListener$mediationsdk_release() {
        return this.b;
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
    public void onVisibilityChanged(View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        Logger.i(this.a, "onVisibilityChanged: " + i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.i(this.a, "onWindowVisibilityChanged: " + i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.b = aVar;
    }
}
