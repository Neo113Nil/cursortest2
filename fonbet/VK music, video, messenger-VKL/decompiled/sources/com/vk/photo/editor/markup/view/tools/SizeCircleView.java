package com.vk.photo.editor.markup.view.tools;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.customview.view.AbsSavedState;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.R$styleable;
import com.vkontakte.android.R;

/* compiled from: SizeCircleView.kt */
/* loaded from: classes4.dex */
public final class SizeCircleView extends View {
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public float f;

    /* compiled from: SizeCircleView.kt */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public float d;

        /* compiled from: SizeCircleView.kt */
        public static final class a implements Parcelable.ClassLoaderCreator<State> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new State(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new State[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final State createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new State(parcel, classLoader);
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeFloat(this.d);
        }

        public State(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readFloat();
        }
    }

    public SizeCircleView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void a() {
        float f = this.d;
        float f2 = this.e;
        float f3 = this.f;
        setScaleX((((f2 - f3) * f) + f3) / f2);
        float f4 = this.d;
        float f5 = this.e;
        float f6 = this.f;
        setScaleY((((f5 - f6) * f4) + f6) / f5);
    }

    public final int getColor() {
        return this.b.getColor();
    }

    public final float getMaxSize() {
        return this.e;
    }

    public final float getMinSize() {
        return this.f;
    }

    public final float getRelativeSize() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.e / 2.0f, this.c);
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.e / 2.0f, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 16;
        setMeasuredDimension(View.resolveSize(((int) this.e) + ((int) Math.floor(Resources.getSystem().getDisplayMetrics().density * f)), i), View.resolveSize(((int) this.e) + ((int) Math.floor(f * Resources.getSystem().getDisplayMetrics().density)), i2));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.b);
            setRelativeSize(state.d);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        State state = new State(onSaveInstanceState);
        state.d = this.d;
        return state;
    }

    public final void setColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public final void setMaxSize(float f) {
        this.e = f;
        a();
        invalidate();
    }

    public final void setMinSize(float f) {
        this.f = f;
        a();
        invalidate();
    }

    public final void setRelativeSize(float f) {
        this.d = f;
        a();
        invalidate();
    }

    public SizeCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public SizeCircleView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ SizeCircleView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editorSizeSeekBarViewStyle : i, R.style.SizeCircleViewStyle);
    }

    public SizeCircleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.b = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setShadowLayer((int) Math.floor(8 * Resources.getSystem().getDisplayMetrics().density), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1291845632);
        this.c = paint2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.g, i, i2);
        setMaxSize(obtainStyledAttributes.getDimension(0, (int) Math.floor(30 * Resources.getSystem().getDisplayMetrics().density)));
        setMinSize(obtainStyledAttributes.getDimension(1, (int) Math.floor(3 * Resources.getSystem().getDisplayMetrics().density)));
        setColor(obtainStyledAttributes.getColor(2, -1));
        paint.setColor(getColor());
        obtainStyledAttributes.recycle();
    }
}
