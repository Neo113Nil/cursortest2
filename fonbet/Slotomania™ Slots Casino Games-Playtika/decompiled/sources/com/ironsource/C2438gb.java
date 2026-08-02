package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.gb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2438gb extends LevelPlayMediaView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2438gb(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2438gb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2438gb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
