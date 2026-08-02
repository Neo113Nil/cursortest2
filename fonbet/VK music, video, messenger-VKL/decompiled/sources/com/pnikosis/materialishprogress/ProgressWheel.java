package com.pnikosis.materialishprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.x9;

/* loaded from: classes.dex */
public class ProgressWheel extends View {
    public int b;
    public int c;
    public int d;
    public boolean e;
    public double f;
    public final double g;
    public float h;
    public boolean i;
    public long j;
    public int k;
    public int l;
    public final Paint m;
    public final Paint n;
    public RectF o;
    public float p;
    public long q;
    public boolean r;
    public float s;
    public float t;
    public boolean u;
    public final boolean v;

    /* loaded from: classes14.dex */
    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new a();
        public float b;
        public float c;
        public boolean d;
        public float e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;

        public static class a implements Parcelable.Creator<WheelSavedState> {
            @Override // android.os.Parcelable.Creator
            public final WheelSavedState createFromParcel(Parcel parcel) {
                WheelSavedState wheelSavedState = new WheelSavedState(parcel);
                wheelSavedState.b = parcel.readFloat();
                wheelSavedState.c = parcel.readFloat();
                wheelSavedState.d = parcel.readByte() != 0;
                wheelSavedState.e = parcel.readFloat();
                wheelSavedState.f = parcel.readInt();
                wheelSavedState.g = parcel.readInt();
                wheelSavedState.h = parcel.readInt();
                wheelSavedState.i = parcel.readInt();
                wheelSavedState.j = parcel.readInt();
                wheelSavedState.k = parcel.readByte() != 0;
                wheelSavedState.l = parcel.readByte() != 0;
                return wheelSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final WheelSavedState[] newArray(int i) {
                return new WheelSavedState[i];
            }
        }

        public WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes14.dex */
    public interface a {
    }

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 28;
        this.c = 4;
        this.d = 4;
        this.e = false;
        this.f = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        this.g = 460.0d;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = true;
        this.j = 0L;
        this.k = -1442840576;
        this.l = 16777215;
        this.m = new Paint();
        this.n = new Paint();
        this.o = new RectF();
        this.p = 230.0f;
        this.q = 0L;
        this.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.u = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.c = (int) TypedValue.applyDimension(1, this.c, displayMetrics);
        this.d = (int) TypedValue.applyDimension(1, this.d, displayMetrics);
        int applyDimension = (int) TypedValue.applyDimension(1, this.b, displayMetrics);
        this.b = applyDimension;
        this.b = (int) obtainStyledAttributes.getDimension(3, applyDimension);
        this.e = obtainStyledAttributes.getBoolean(4, false);
        this.c = (int) obtainStyledAttributes.getDimension(2, this.c);
        this.d = (int) obtainStyledAttributes.getDimension(8, this.d);
        this.p = obtainStyledAttributes.getFloat(9, this.p / 360.0f) * 360.0f;
        this.g = obtainStyledAttributes.getInt(1, (int) this.g);
        this.k = obtainStyledAttributes.getColor(0, this.k);
        this.l = obtainStyledAttributes.getColor(7, this.l);
        this.r = obtainStyledAttributes.getBoolean(5, false);
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.q = SystemClock.uptimeMillis();
            this.u = true;
            invalidate();
        }
        obtainStyledAttributes.recycle();
        this.v = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void a() {
        int i = this.k;
        Paint paint = this.m;
        paint.setColor(i);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.c);
        int i2 = this.l;
        Paint paint2 = this.n;
        paint2.setColor(i2);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.d);
    }

    public int getBarColor() {
        return this.k;
    }

    public int getBarWidth() {
        return this.c;
    }

    public int getCircleRadius() {
        return this.b;
    }

    public float getProgress() {
        if (this.u) {
            return -1.0f;
        }
        return this.s / 360.0f;
    }

    public int getRimColor() {
        return this.l;
    }

    public int getRimWidth() {
        return this.d;
    }

    public float getSpinSpeed() {
        return this.p / 360.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        canvas.drawArc(this.o, 360.0f, 360.0f, false, this.n);
        if (this.v) {
            boolean z = this.u;
            Paint paint = this.m;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            boolean z2 = true;
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.q;
                float f3 = (uptimeMillis * this.p) / 1000.0f;
                long j = this.j;
                if (j >= 200) {
                    double d = this.f + uptimeMillis;
                    this.f = d;
                    double d2 = this.g;
                    if (d > d2) {
                        this.f = d - d2;
                        this.j = 0L;
                        this.i = !this.i;
                    }
                    float cos = (((float) Math.cos(((this.f / d2) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    if (this.i) {
                        this.h = cos * 254.0f;
                    } else {
                        float f4 = (1.0f - cos) * 254.0f;
                        this.s = (this.h - f4) + this.s;
                        this.h = f4;
                    }
                } else {
                    this.j = j + uptimeMillis;
                }
                float f5 = this.s + f3;
                this.s = f5;
                if (f5 > 360.0f) {
                    this.s = f5 - 360.0f;
                }
                this.q = SystemClock.uptimeMillis();
                float f6 = this.s - 90.0f;
                float f7 = this.h + 16.0f;
                if (isInEditMode()) {
                    f7 = 135.0f;
                    f = 0.0f;
                } else {
                    f = f6;
                }
                canvas.drawArc(this.o, f, f7, false, paint);
            } else {
                if (this.s != this.t) {
                    this.s = Math.min(this.s + (((SystemClock.uptimeMillis() - this.q) / 1000.0f) * this.p), this.t);
                    this.q = SystemClock.uptimeMillis();
                } else {
                    z2 = false;
                }
                float f8 = this.s;
                if (!this.r) {
                    f2 = ((float) (1.0d - Math.pow(1.0f - (f8 / 360.0f), 4.0f))) * 360.0f;
                    f8 = ((float) (1.0d - Math.pow(1.0f - (this.s / 360.0f), 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.o, f2 - 90.0f, isInEditMode() ? 360.0f : f8, false, paint);
            }
            if (z2) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.b;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
        super.onRestoreInstanceState(wheelSavedState.getSuperState());
        this.s = wheelSavedState.b;
        this.t = wheelSavedState.c;
        this.u = wheelSavedState.d;
        this.p = wheelSavedState.e;
        this.c = wheelSavedState.f;
        this.k = wheelSavedState.g;
        this.d = wheelSavedState.h;
        this.l = wheelSavedState.i;
        this.b = wheelSavedState.j;
        this.r = wheelSavedState.k;
        this.e = wheelSavedState.l;
        this.q = SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        WheelSavedState wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.b = this.s;
        wheelSavedState.c = this.t;
        wheelSavedState.d = this.u;
        wheelSavedState.e = this.p;
        wheelSavedState.f = this.c;
        wheelSavedState.g = this.k;
        wheelSavedState.h = this.d;
        wheelSavedState.i = this.l;
        wheelSavedState.j = this.b;
        wheelSavedState.k = this.r;
        wheelSavedState.l = this.e;
        return wheelSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.e) {
            int i5 = this.c;
            this.o = new RectF(paddingLeft + i5, paddingTop + i5, (i - paddingRight) - i5, (i2 - paddingBottom) - i5);
        } else {
            int i6 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i6, (i2 - paddingBottom) - paddingTop), (this.b * 2) - (this.c * 2));
            int b = x9.b(i6, min, 2, paddingLeft);
            int i7 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i8 = this.c;
            this.o = new RectF(b + i8, i7 + i8, (b + min) - i8, (i7 + min) - i8);
        }
        a();
        invalidate();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.q = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i) {
        this.k = i;
        a();
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setBarWidth(int i) {
        this.c = i;
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setCircleRadius(int i) {
        this.b = i;
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setInstantProgress(float f) {
        if (this.u) {
            this.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.u = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        if (f == this.t) {
            return;
        }
        float min = Math.min(f * 360.0f, 360.0f);
        this.t = min;
        this.s = min;
        this.q = SystemClock.uptimeMillis();
        invalidate();
    }

    public void setLinearProgress(boolean z) {
        this.r = z;
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setProgress(float f) {
        if (this.u) {
            this.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.u = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        float f2 = this.t;
        if (f == f2) {
            return;
        }
        if (this.s == f2) {
            this.q = SystemClock.uptimeMillis();
        }
        this.t = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    public void setRimColor(int i) {
        this.l = i;
        a();
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setRimWidth(int i) {
        this.d = i;
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setSpinSpeed(float f) {
        this.p = f * 360.0f;
    }

    public void setCallback(a aVar) {
    }
}
