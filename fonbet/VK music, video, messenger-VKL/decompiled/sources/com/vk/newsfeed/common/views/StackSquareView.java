package com.vk.newsfeed.common.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKMultiImageView;
import com.vk.newsfeed.common.R$styleable;
import com.vkontakte.android.R;
import xsna.an10;
import xsna.d540;
import xsna.dhr0;
import xsna.flo;
import xsna.njt;
import xsna.qog0;
import xsna.too0;

/* compiled from: StackSquareView.kt */
/* loaded from: classes4.dex */
public final class StackSquareView extends VKMultiImageView implements too0 {
    public static final /* synthetic */ int t = 0;
    public final float f;
    public float g;
    public float h;
    public float i;
    public final Paint j;
    public final Rect k;
    public final Rect l;
    public qog0 m;
    public final Paint n;
    public final Paint o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;

    /* compiled from: StackSquareView.kt */
    public static final class a {
        public static final float a(float f) {
            int i = StackSquareView.t;
            return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
        }
    }

    public StackSquareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a2 = a.a(4.0f);
        this.f = a2;
        float a3 = a.a(2.0f);
        float a4 = a.a(0.5f);
        this.g = a3;
        this.h = a2;
        this.i = a4;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.vk_black_alpha8));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.i);
        this.j = paint;
        this.k = new Rect();
        this.l = new Rect();
        this.m = new qog0(a2, dhr0.t.c(R.attr.vk_ui_background_secondary));
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.n = paint2;
        this.o = new Paint(3);
        int b = an10.b(a.a(22.0f));
        int b2 = an10.b(a.a(18.0f));
        int b3 = an10.b(a.a(9.0f));
        int b4 = an10.b(a.a(40.0f));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.i);
        this.p = obtainStyledAttributes.getDimensionPixelSize(3, b);
        this.q = obtainStyledAttributes.getDimensionPixelSize(0, b3);
        this.r = obtainStyledAttributes.getDimensionPixelSize(1, b2);
        this.s = obtainStyledAttributes.getDimensionPixelSize(2, b4);
        obtainStyledAttributes.recycle();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.m = new qog0(this.f, dhr0.t.c(R.attr.vk_ui_background_secondary));
        invalidate();
    }

    public final float getBorderWidth() {
        return this.i;
    }

    public final float getCornerRadiusImages() {
        return this.h;
    }

    public final int getCount() {
        return this.b.b.size();
    }

    public final float getMarginBetweenImages() {
        return this.g;
    }

    public final void l() {
        RoundingParams roundingParams = new RoundingParams();
        float f = this.h;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            roundingParams.f(f);
        }
        d540<njt> d540Var = this.b;
        int size = d540Var.b.size();
        for (int i = 0; i < size; i++) {
            flo<njt> a2 = d540Var.a(i);
            if (a2 != null) {
                njt njtVar = a2.d;
                njtVar.getClass();
                njtVar.u(roundingParams);
            }
        }
    }

    @Override // com.vk.imageloader.view.VKMultiImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        Rect rect = this.k;
        int i = 0;
        rect.top = 0;
        rect.bottom = getMeasuredHeight();
        float f2 = this.i / 2.0f;
        int count = getCount();
        int i2 = 0;
        while (i2 < count) {
            Rect rect2 = this.l;
            rect2.set(rect);
            if (getCount() == 1) {
                rect.left = i;
                rect.right = getMeasuredWidth();
            } else {
                int i3 = this.p;
                if (i2 == 0) {
                    rect.left = i;
                    rect.right = i3;
                } else {
                    int i4 = this.r;
                    if (i2 == 1) {
                        int count2 = getCount();
                        if (count2 == 2) {
                            rect.left = i4;
                            rect.right = getMeasuredWidth();
                        } else if (count2 == 3) {
                            int i5 = this.q;
                            rect.left = i5;
                            rect.right = i5 + i3;
                        }
                    } else if (i2 == 2 && getCount() == 3) {
                        rect.left = i4;
                        rect.right = getMeasuredWidth();
                    }
                }
            }
            Drawable d = this.b.a(i2).d();
            if (d == null) {
                f = f2;
            } else {
                Paint paint = this.j;
                if (i2 == 0) {
                    d.setBounds(rect);
                    d.draw(canvas2);
                    float f3 = this.h;
                    canvas2.drawRoundRect(rect.left + f2, f2, rect.right - f2, getMeasuredHeight() - f2, f3, f3, paint);
                    f = f2;
                    canvas2 = canvas;
                } else {
                    f = f2;
                    float f4 = this.i / 2.0f;
                    int saveLayer = canvas.saveLayer(rect.left, rect.top, rect.right, rect.bottom, this.o);
                    d.setBounds(rect);
                    d.draw(canvas);
                    float f5 = this.h;
                    canvas.drawRoundRect(rect.left + f4, rect.top + f4, rect.right - f4, rect.bottom - f4, f5, f5, paint);
                    float f6 = rect2.left;
                    float f7 = this.g;
                    float f8 = this.h;
                    canvas.drawRoundRect((f6 - f7) - f4, (rect2.top - f7) - f4, rect2.right + f7 + f4, rect2.bottom + f7 + f4, f8, f8, paint);
                    float f9 = rect2.left;
                    float f10 = this.g;
                    float f11 = this.h;
                    canvas2 = canvas;
                    canvas2.drawRoundRect(f9 - f10, rect2.top - f10, rect2.right + f10, rect2.bottom + f10, f11, f11, this.n);
                    canvas2.restoreToCount(saveLayer);
                }
            }
            i2++;
            f2 = f;
            i = 0;
        }
        getX();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.getSuperState());
            setMarginBetweenImages(state.b);
            setBorderWidth(state.c);
            setCornerRadiusImages(state.d);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.b = this.g;
        state.c = this.i;
        state.d = this.h;
        return state;
    }

    public final void setBorderWidth(float f) {
        this.i = a.a(f);
        invalidate();
    }

    public final void setCornerRadiusImages(float f) {
        this.h = a.a(f);
        l();
        invalidate();
    }

    public final void setCount(int i) {
        if (this.b.b.size() != i) {
            k();
            for (int i2 = 0; i2 < i; i2++) {
                setPlaceholder(this.m);
                b();
            }
            l();
            requestLayout();
        }
    }

    public final void setDrawBackgrounds(boolean z) {
        invalidate();
    }

    public final void setMarginBetweenImages(float f) {
        this.g = a.a(f);
        invalidate();
        requestLayout();
    }

    /* compiled from: StackSquareView.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public float b;
        public float c;
        public float d;

        /* compiled from: StackSquareView.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
            int i = StackSquareView.t;
            float a2 = a.a(2.0f);
            float a3 = a.a(0.5f);
            this.b = a2;
            this.c = a3;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeFloat(this.d);
        }

        public State(Parcel parcel) {
            super(parcel);
            int i = StackSquareView.t;
            float a2 = a.a(2.0f);
            float a3 = a.a(0.5f);
            this.b = a2;
            this.c = a3;
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readFloat();
        }
    }
}
