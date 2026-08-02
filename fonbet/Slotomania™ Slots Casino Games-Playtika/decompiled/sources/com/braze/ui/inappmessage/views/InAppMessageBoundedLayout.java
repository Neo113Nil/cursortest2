package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.braze.ui.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageBoundedLayout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxDefinedHeightPixels", "", "maxDefinedWidthPixels", "minDefinedHeightPixels", "minDefinedWidthPixels", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public class InAppMessageBoundedLayout extends RelativeLayout {
    private int maxDefinedHeightPixels;
    private int maxDefinedWidthPixels;
    private int minDefinedHeightPixels;
    private int minDefinedWidthPixels;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.InAppMessageBoundedLayout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…nAppMessageBoundedLayout)");
        this.maxDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxWidth, 0);
        this.minDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinWidth, 0);
        this.maxDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxHeight, 0);
        this.minDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinHeight, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i = this.minDefinedWidthPixels;
        if (i > 0 && size < i) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.minDefinedWidthPixels, View.MeasureSpec.getMode(widthMeasureSpec));
        } else {
            int i2 = this.maxDefinedWidthPixels;
            if (i2 > 0 && size > i2) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.maxDefinedWidthPixels, View.MeasureSpec.getMode(widthMeasureSpec));
            }
        }
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int i3 = this.minDefinedHeightPixels;
        if (i3 > 0 && size2 < i3) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.minDefinedHeightPixels, View.MeasureSpec.getMode(heightMeasureSpec));
        } else {
            int i4 = this.maxDefinedHeightPixels;
            if (i4 > 0 && size2 > i4) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.maxDefinedHeightPixels, View.MeasureSpec.getMode(heightMeasureSpec));
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
