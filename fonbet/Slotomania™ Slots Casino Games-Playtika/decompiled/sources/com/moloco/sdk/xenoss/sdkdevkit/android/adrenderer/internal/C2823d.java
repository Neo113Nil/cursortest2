package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C2823d extends WebView {
    public static final int b = 0;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2823d(Context context) {
        super(context.getApplicationContext());
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g getHtmlCssFixer() {
        return this.a;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
