package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.zzgy;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.a0u0;
import xsna.dgn;
import xsna.fl2;
import xsna.fot;
import xsna.mf01;
import xsna.sc01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class c extends ViewGroup {
    public final int[] b;
    public final Rect c;
    public final Rect d;
    public final OuterHighlightDrawable e;
    public final InnerZoneDrawable f;
    public View g;

    @Nullable
    public AnimatorSet h;
    public final mf01 i;
    public final fot j;

    @Nullable
    public fot k;
    public sc01 l;
    public boolean m;
    public HelpTextView n;

    public c(Context context) {
        super(context);
        this.b = new int[2];
        this.c = new Rect();
        this.d = new Rect();
        setId(R.id.cast_featurehighlight_view);
        setWillNotDraw(false);
        InnerZoneDrawable innerZoneDrawable = new InnerZoneDrawable(context);
        this.f = innerZoneDrawable;
        innerZoneDrawable.setCallback(this);
        OuterHighlightDrawable outerHighlightDrawable = new OuterHighlightDrawable(context);
        this.e = outerHighlightDrawable;
        outerHighlightDrawable.setCallback(this);
        this.i = new mf01(this);
        fot fotVar = new fot(context, new a(this), null);
        this.j = fotVar;
        fotVar.a.setIsLongpressEnabled(false);
        setVisibility(8);
    }

    public final void a(@Nullable Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.n.asView(), "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L);
        duration.setInterpolator(zzgy.zzb());
        Rect rect = this.c;
        float exactCenterX = rect.exactCenterX();
        OuterHighlightDrawable outerHighlightDrawable = this.e;
        float f = exactCenterX - outerHighlightDrawable.i;
        float exactCenterY = rect.exactCenterY() - outerHighlightDrawable.j;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(outerHighlightDrawable, PropertyValuesHolder.ofFloat("scale", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), PropertyValuesHolder.ofFloat("translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f), PropertyValuesHolder.ofFloat("translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, exactCenterY), PropertyValuesHolder.ofInt("alpha", 0));
        ofPropertyValuesHolder.setInterpolator(zzgy.zzb());
        Animator duration2 = ofPropertyValuesHolder.setDuration(200L);
        Animator a = this.f.a();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, a);
        animatorSet.addListener(new a0u0(this, runnable));
        AnimatorSet animatorSet2 = this.h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.h = animatorSet;
        animatorSet.start();
    }

    public final void b(@Nullable Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.n.asView(), "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L);
        duration.setInterpolator(zzgy.zzb());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.e, PropertyValuesHolder.ofFloat("scale", 1.125f), PropertyValuesHolder.ofInt("alpha", 0));
        ofPropertyValuesHolder.setInterpolator(zzgy.zzb());
        Animator duration2 = ofPropertyValuesHolder.setDuration(200L);
        Animator a = this.f.a();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, a);
        animatorSet.addListener(new fl2(this, runnable));
        AnimatorSet animatorSet2 = this.h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.h = animatorSet;
        animatorSet.start();
    }

    public final void c(int i) {
        OuterHighlightDrawable outerHighlightDrawable = this.e;
        Paint paint = outerHighlightDrawable.f;
        paint.setColor(i);
        outerHighlightDrawable.m = paint.getAlpha();
        outerHighlightDrawable.invalidateSelf();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        OuterHighlightDrawable outerHighlightDrawable = this.e;
        outerHighlightDrawable.draw(canvas);
        this.f.draw(canvas);
        View view = this.g;
        if (view == null) {
            throw new IllegalStateException("Neither target view nor drawable was set");
        }
        if (view.getParent() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(this.g.getWidth(), this.g.getHeight(), Bitmap.Config.ARGB_8888);
            this.g.draw(new Canvas(createBitmap));
            int color = outerHighlightDrawable.f.getColor();
            int red = Color.red(color);
            int green = Color.green(color);
            int blue = Color.blue(color);
            for (int i = 0; i < createBitmap.getHeight(); i++) {
                for (int i2 = 0; i2 < createBitmap.getWidth(); i2++) {
                    int pixel = createBitmap.getPixel(i2, i);
                    if (Color.alpha(pixel) != 0) {
                        createBitmap.setPixel(i2, i, Color.argb(Color.alpha(pixel), red, green, blue));
                    }
                }
            }
            Rect rect = this.c;
            canvas.drawBitmap(createBitmap, rect.left, rect.top, (Paint) null);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.g;
        if (view == null) {
            throw new IllegalStateException("Target view must be set before layout");
        }
        ViewParent parent = view.getParent();
        int[] iArr = this.b;
        if (parent != null) {
            View view2 = this.g;
            getLocationInWindow(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            view2.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i5;
            iArr[1] = iArr[1] - i6;
        }
        int i7 = iArr[0];
        int i8 = iArr[1];
        int width = this.g.getWidth() + i7;
        int height = this.g.getHeight() + iArr[1];
        Rect rect = this.c;
        rect.set(i7, i8, width, height);
        Rect rect2 = this.d;
        rect2.set(i, i2, i3, i4);
        this.e.setBounds(rect2);
        this.f.setBounds(rect2);
        mf01 mf01Var = this.i;
        c cVar = mf01Var.f;
        View asView = cVar.n.asView();
        if (rect.isEmpty() || rect2.isEmpty()) {
            asView.layout(0, 0, 0, 0);
        } else {
            int centerY = rect.centerY();
            int centerX = rect.centerX();
            int centerY2 = rect2.centerY();
            int height2 = rect.height();
            int i9 = mf01Var.b;
            int max = Math.max(i9 + i9, height2) / 2;
            int i10 = centerY + max;
            int i11 = mf01Var.c;
            if (centerY < centerY2) {
                int i12 = i10 + i11;
                mf01Var.b(rect2.width(), rect2.bottom - i12, asView);
                int a = mf01Var.a(asView, rect2.left, rect2.right, asView.getMeasuredWidth(), centerX);
                dgn.b(asView, i12, a, i12, asView.getMeasuredWidth() + a);
            } else {
                int i13 = (centerY - max) - i11;
                mf01Var.b(rect2.width(), i13 - rect2.top, asView);
                int a2 = mf01Var.a(asView, rect2.left, rect2.right, asView.getMeasuredWidth(), centerX);
                asView.layout(a2, i13 - asView.getMeasuredHeight(), asView.getMeasuredWidth() + a2, i13);
            }
        }
        Rect rect3 = mf01Var.a;
        rect3.set(asView.getLeft(), asView.getTop(), asView.getRight(), asView.getBottom());
        OuterHighlightDrawable outerHighlightDrawable = cVar.e;
        int i14 = outerHighlightDrawable.b;
        outerHighlightDrawable.d.set(rect);
        outerHighlightDrawable.e.set(rect3);
        float exactCenterX = rect.exactCenterX();
        float exactCenterY = rect.exactCenterY();
        Rect bounds = outerHighlightDrawable.getBounds();
        if (Math.min(exactCenterY - bounds.top, bounds.bottom - exactCenterY) < outerHighlightDrawable.a) {
            outerHighlightDrawable.i = exactCenterX;
            outerHighlightDrawable.j = exactCenterY;
        } else {
            outerHighlightDrawable.i = exactCenterX <= bounds.exactCenterX() ? rect3.exactCenterX() + i14 : rect3.exactCenterX() - i14;
            exactCenterY = rect3.exactCenterY();
            outerHighlightDrawable.j = exactCenterY;
        }
        outerHighlightDrawable.g = outerHighlightDrawable.c + Math.max(OuterHighlightDrawable.a(outerHighlightDrawable.i, exactCenterY, rect), OuterHighlightDrawable.a(outerHighlightDrawable.i, outerHighlightDrawable.j, rect3));
        outerHighlightDrawable.invalidateSelf();
        InnerZoneDrawable innerZoneDrawable = cVar.f;
        Rect rect4 = innerZoneDrawable.c;
        rect4.set(rect);
        innerZoneDrawable.h = rect4.exactCenterX();
        innerZoneDrawable.i = rect4.exactCenterY();
        innerZoneDrawable.f = Math.max(innerZoneDrawable.d, Math.max(rect4.width() / 2.0f, rect4.height() / 2.0f));
        innerZoneDrawable.invalidateSelf();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(View.MeasureSpec.getSize(i), i), View.resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.m = this.c.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (!this.m) {
            this.j.a(motionEvent);
            return true;
        }
        fot fotVar = this.k;
        if (fotVar != null) {
            fotVar.a(motionEvent);
            if (actionMasked == 1) {
                motionEvent = MotionEvent.obtain(motionEvent);
                motionEvent.setAction(3);
            }
        }
        if (this.g.getParent() != null) {
            this.g.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.f || drawable == null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
