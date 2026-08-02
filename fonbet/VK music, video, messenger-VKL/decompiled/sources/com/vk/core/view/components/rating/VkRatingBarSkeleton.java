package com.vk.core.view.components.rating;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.extra.R$styleable;
import com.vk.core.view.components.rating.b;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.iah0;
import xsna.krv0;
import xsna.s3q0;
import xsna.txe0;

/* compiled from: VkRatingBarSkeleton.kt */
/* loaded from: classes17.dex */
public final class VkRatingBarSkeleton extends View {
    public final Paint b;
    public final int c;
    public txe0 d;
    public RatingBar$Size e;

    public VkRatingBarSkeleton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final RatingBar$Size getSize() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        txe0 txe0Var = this.d;
        if (txe0Var == null) {
            txe0Var = null;
        }
        canvas.translate(txe0Var.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (int i = 0; i < 5; i++) {
            txe0 txe0Var2 = this.d;
            int i2 = (txe0Var2 == null ? null : txe0Var2).a * i;
            if (txe0Var2 == null) {
                txe0Var2 = null;
            }
            float f = (txe0Var2.b * i) + i2;
            int save = canvas.save();
            canvas.translate(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            try {
                txe0 txe0Var3 = this.d;
                float f2 = (txe0Var3 == null ? null : txe0Var3).a / 2.0f;
                float f3 = (txe0Var3 == null ? null : txe0Var3).a / 2.0f;
                if (txe0Var3 == null) {
                    txe0Var3 = null;
                }
                Paint paint = this.b;
                paint.setColor(this.c);
                s3q0 s3q0Var = s3q0.a;
                canvas.drawCircle(f2, f3, txe0Var3.a / 2.0f, paint);
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        txe0 txe0Var = this.d;
        int i3 = ((txe0Var == null ? null : txe0Var).c * 2) + ((txe0Var == null ? null : txe0Var).b * 4) + ((txe0Var == null ? null : txe0Var).a * 5);
        if (txe0Var == null) {
            txe0Var = null;
        }
        setMeasuredDimension(i3, txe0Var.a);
    }

    public final void setSize(RatingBar$Size ratingBar$Size) {
        txe0 txe0Var;
        this.e = ratingBar$Size;
        int i = b.a.$EnumSwitchMapping$0[ratingBar$Size.ordinal()];
        if (i == 1) {
            txe0Var = new txe0(iah0.a(12), iah0.a(5), iah0.a(2));
        } else if (i == 2) {
            txe0Var = new txe0(iah0.a(16), iah0.a(6), iah0.a(2));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            txe0Var = new txe0(iah0.a(28), iah0.a(18), iah0.a(4));
        }
        this.d = txe0Var;
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkRatingBarSkeleton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = new Paint(1);
        this.c = krv0.m(R.attr.vk_ui_skeleton_from, context);
        RatingBar$Size ratingBar$Size = RatingBar$Size.Medium;
        this.e = ratingBar$Size;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.j, 0, 0);
        setSize((RatingBar$Size) RatingBar$Size.h().get(obtainStyledAttributes.getInt(0, ratingBar$Size.ordinal())));
        obtainStyledAttributes.recycle();
    }
}
