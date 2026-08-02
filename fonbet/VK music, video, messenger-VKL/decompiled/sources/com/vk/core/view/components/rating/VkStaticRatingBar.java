package com.vk.core.view.components.rating;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.extra.R$styleable;
import com.vk.core.view.components.rating.a;
import com.vkontakte.android.R;
import xsna.krv0;
import xsna.l8g;
import xsna.lxe0;
import xsna.sxe0;
import xsna.vxe0;

/* compiled from: VkStaticRatingBar.kt */
/* loaded from: classes17.dex */
public final class VkStaticRatingBar extends View {
    public final lxe0 b;
    public float c;
    public RatingBar$Size d;
    public a e;

    public VkStaticRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final a getFillStrategy() {
        return this.e;
    }

    public final float getRating() {
        return this.c;
    }

    public final RatingBar$Size getSize() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.b.a(canvas, getWidth(), isEnabled());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Size b = this.b.b();
        setMeasuredDimension(b.getWidth(), b.getHeight());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lxe0 lxe0Var = this.b;
        Bitmap bitmap = lxe0Var.g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        lxe0Var.h = new Canvas(createBitmap);
        lxe0Var.g = createBitmap;
    }

    public final void setFillStrategy(a aVar) {
        this.e = aVar;
        this.b.b = aVar;
        invalidate();
    }

    public final void setRating(float f) {
        this.c = f;
        this.b.a = f;
        setContentDescription(getContext().getString(R.string.ds_internal_static_rating_view_content_description, Float.valueOf(this.c)));
        invalidate();
    }

    public final void setSize(RatingBar$Size ratingBar$Size) {
        this.d = ratingBar$Size;
        sxe0 a = b.a(ratingBar$Size);
        lxe0 lxe0Var = this.b;
        lxe0Var.c = a;
        lxe0Var.e = krv0.e(a.b, getContext());
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkStaticRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        lxe0 lxe0Var = new lxe0();
        lxe0Var.d = new vxe0(l8g.f(0.4f, krv0.m(R.attr.vk_ui_icon_tertiary, context)), krv0.m(R.attr.vk_ui_accent_orange_peach, context));
        this.b = lxe0Var;
        RatingBar$Size ratingBar$Size = RatingBar$Size.Medium;
        this.d = ratingBar$Size;
        this.e = new a.C0861a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k, 0, 0);
        setRating(obtainStyledAttributes.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        setSize((RatingBar$Size) RatingBar$Size.h().get(obtainStyledAttributes.getInt(1, ratingBar$Size.ordinal())));
        int i2 = obtainStyledAttributes.getInt(0, 0);
        setFillStrategy(i2 != 0 ? i2 != 1 ? new a.C0861a() : new a.b() : new a.C0861a());
        obtainStyledAttributes.recycle();
        setContentDescription(getContext().getString(R.string.ds_internal_static_rating_view_content_description, Float.valueOf(this.c)));
    }
}
