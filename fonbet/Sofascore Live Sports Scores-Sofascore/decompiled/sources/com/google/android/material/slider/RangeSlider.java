package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.eq3;
import defpackage.lnb;
import defpackage.m6k;
import defpackage.pjf;
import defpackage.qzb;
import defpackage.td4;
import defpackage.wka;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class RangeSlider extends b {
    public float g1;
    public int h1;

    public RangeSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m6k.v(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = pjf.K;
        m6k.w(context, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        if (obtainStyledAttributes.hasValue(1)) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(obtainStyledAttributes.getResourceId(1, 0));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                arrayList.add(Float.valueOf(obtainTypedArray.getFloat(i, -1.0f)));
            }
            setValues(arrayList);
        }
        this.g1 = obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.s0;
    }

    public int getContinuousModeTickCount() {
        return this.v0;
    }

    public int getFocusedThumbIndex() {
        return this.t0;
    }

    public int getHaloRadius() {
        return this.J;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.D0;
    }

    public int getLabelBehavior() {
        return this.E;
    }

    @Override // com.google.android.material.slider.b
    public float getMinSeparation() {
        return this.g1;
    }

    public float getStepSize() {
        return this.u0;
    }

    @Override // com.google.android.material.slider.b
    public float getThumbElevation() {
        return this.U0;
    }

    public int getThumbHeight() {
        return this.I;
    }

    @Override // com.google.android.material.slider.b
    public int getThumbRadius() {
        return this.H / 2;
    }

    @Override // com.google.android.material.slider.b
    @Nullable
    public ColorStateList getThumbStrokeColor() {
        return this.W0;
    }

    @Override // com.google.android.material.slider.b
    public float getThumbStrokeWidth() {
        return this.V0;
    }

    @Override // com.google.android.material.slider.b
    @NonNull
    public ColorStateList getThumbTintList() {
        return this.X0;
    }

    public int getThumbTrackGapSize() {
        return this.K;
    }

    public int getThumbWidth() {
        return this.H;
    }

    public int getTickActiveRadius() {
        return this.y0;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.E0;
    }

    public int getTickInactiveRadius() {
        return this.z0;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.F0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.F0.equals(this.E0)) {
            return this.E0;
        }
        a70.r("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        return null;
    }

    public int getTickVisibilityMode() {
        return this.x0;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.G0;
    }

    @Override // com.google.android.material.slider.b
    public int getTrackCornerSize() {
        int i = this.P;
        return i == -1 ? this.F / 2 : i;
    }

    public int getTrackHeight() {
        return this.F;
    }

    @Nullable
    public ColorStateList getTrackIconActiveColor() {
        return this.W;
    }

    @Nullable
    public Drawable getTrackIconActiveEnd() {
        return this.U;
    }

    @Nullable
    public Drawable getTrackIconActiveStart() {
        return this.S;
    }

    @Nullable
    public ColorStateList getTrackIconInactiveColor() {
        return this.e0;
    }

    @Nullable
    public Drawable getTrackIconInactiveEnd() {
        return this.c0;
    }

    @Nullable
    public Drawable getTrackIconInactiveStart() {
        return this.a0;
    }

    public int getTrackIconSize() {
        return this.f0;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.H0;
    }

    public int getTrackInsideCornerSize() {
        return this.Q;
    }

    public int getTrackSidePadding() {
        return this.G;
    }

    public int getTrackStopIndicatorSize() {
        return this.O;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.H0.equals(this.G0)) {
            return this.G0;
        }
        a70.r("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        return null;
    }

    public int getTrackWidth() {
        return this.A0;
    }

    public float getValueFrom() {
        return this.p0;
    }

    public float getValueTo() {
        return this.q0;
    }

    @Override // com.google.android.material.slider.b
    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.r0);
    }

    @Override // com.google.android.material.slider.b, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.g1 = rangeSliderState.a;
        int i = rangeSliderState.b;
        this.h1 = i;
        setSeparationUnit(i);
    }

    @Override // com.google.android.material.slider.b, android.view.View
    public final Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.a = this.g1;
        rangeSliderState.b = this.h1;
        return rangeSliderState;
    }

    @Override // com.google.android.material.slider.b
    public void setCentered(boolean z) {
        if (this.R == z) {
            return;
        }
        this.R = z;
        float f = this.p0;
        if (z) {
            setValues(Float.valueOf((f + this.q0) / 2.0f));
        } else {
            setValues(Float.valueOf(f));
        }
        Q(true);
    }

    public void setContinuousModeTickCount(int i) {
        if (i < 0) {
            a70.p(lnb.k(i, "The continuousModeTickCount(", ") must be greater than or equal to 0"));
        } else if (this.v0 != i) {
            this.v0 = i;
            this.C0 = true;
            postInvalidate();
        }
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable, this.H);
        this.S0 = newDrawable;
        this.T0.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.S0 = null;
        this.T0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.T0;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            a(newDrawable, this.H);
            list.add(newDrawable);
        }
        postInvalidate();
    }

    @Override // com.google.android.material.slider.b, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.r0.size()) {
            a70.p("index out of range");
            return;
        }
        this.t0 = i;
        this.h.v(i);
        postInvalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setHaloRadius(int i) {
        if (i == this.J) {
            return;
        }
        this.J = i;
        RippleDrawable n = n();
        if (n() == null || n == null) {
            postInvalidate();
        } else {
            n.setRadius(this.J);
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.b
    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.D0)) {
            return;
        }
        this.D0 = colorStateList;
        RippleDrawable n = n();
        if (n() != null && n != null) {
            n.setColor(colorStateList);
            return;
        }
        int o = o(colorStateList);
        Paint paint = this.d;
        paint.setColor(o);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setLabelBehavior(int i) {
        if (this.E != i) {
            this.E = i;
            Q(true);
        }
    }

    public void setMinSeparation(float f) {
        this.g1 = f;
        this.h1 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.g1 = f;
        this.h1 = 1;
        setSeparationUnit(1);
    }

    @Override // com.google.android.material.slider.b
    public void setOrientation(int i) {
        if (this.B == i) {
            return;
        }
        this.B = i;
        Q(true);
    }

    public void setStepSize(float f) {
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.u0 != f) {
                this.u0 = f;
                this.C0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.p0 + ")-valueTo(" + this.q0 + ") range");
    }

    @Override // com.google.android.material.slider.b
    public void setThumbElevation(float f) {
        if (f == this.U0) {
            return;
        }
        this.U0 = f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i >= arrayList.size()) {
                return;
            }
            ((qzb) arrayList.get(i)).s(this.U0);
            i++;
        }
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // com.google.android.material.slider.b
    public void setThumbHeight(int i) {
        if (i == this.I) {
            return;
        }
        this.I = i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((qzb) arrayList.get(i2)).setBounds(0, 0, this.H, this.I);
            i2++;
        }
        Drawable drawable = this.S0;
        if (drawable != null) {
            a(drawable, this.H);
        }
        Iterator it = this.T0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next(), this.H);
        }
        Q(false);
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.b
    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.W0) {
            return;
        }
        this.W0 = colorStateList;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i >= arrayList.size()) {
                postInvalidate();
                return;
            } else {
                ((qzb) arrayList.get(i)).y(colorStateList);
                i++;
            }
        }
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(eq3.q(i, getContext()));
        }
    }

    @Override // com.google.android.material.slider.b
    public void setThumbStrokeWidth(float f) {
        if (f == this.V0) {
            return;
        }
        this.V0 = f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i >= arrayList.size()) {
                postInvalidate();
                return;
            } else {
                ((qzb) arrayList.get(i)).A(f);
                i++;
            }
        }
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.slider.b
    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.X0)) {
            return;
        }
        this.X0 = colorStateList;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((qzb) arrayList.get(i)).t(this.X0);
                i++;
            }
        }
    }

    @Override // com.google.android.material.slider.b
    public void setThumbTrackGapSize(int i) {
        if (this.K == i) {
            return;
        }
        this.K = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setThumbWidth(int i) {
        if (i == this.H) {
            return;
        }
        this.H = i;
        Drawable drawable = this.S0;
        if (drawable != null) {
            a(drawable, i);
        }
        for (int i2 = 0; i2 < this.T0.size(); i2++) {
            a((Drawable) this.T0.get(i2), i);
        }
        A(i, -1, null);
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.b
    public void setTickActiveRadius(int i) {
        if (this.y0 != i) {
            this.y0 = i;
            this.f.setStrokeWidth(i * 2);
            Q(false);
        }
    }

    @Override // com.google.android.material.slider.b
    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.E0)) {
            return;
        }
        this.E0 = colorStateList;
        this.f.setColor(o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTickInactiveRadius(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            this.e.setStrokeWidth(i * 2);
            Q(false);
        }
    }

    @Override // com.google.android.material.slider.b
    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.F0)) {
            return;
        }
        this.F0 = colorStateList;
        this.e.setColor(o(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z) {
        setTickVisibilityMode(z ? 0 : 2);
    }

    @Override // com.google.android.material.slider.b
    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.G0)) {
            return;
        }
        this.G0 = colorStateList;
        this.b.setColor(o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackCornerSize(int i) {
        if (this.P == i) {
            return;
        }
        this.P = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackHeight(int i) {
        if (this.F != i) {
            this.F = i;
            this.a.setStrokeWidth(i);
            this.b.setStrokeWidth(this.F);
            Q(false);
        }
    }

    @Override // com.google.android.material.slider.b
    public void setTrackIconActiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.W) {
            return;
        }
        this.W = colorStateList;
        N();
        M();
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackIconActiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.U) {
            return;
        }
        this.U = drawable;
        this.V = false;
        M();
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackIconActiveStart(@Nullable Drawable drawable) {
        if (drawable == this.S) {
            return;
        }
        this.S = drawable;
        this.T = false;
        N();
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackIconInactiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.e0) {
            return;
        }
        this.e0 = colorStateList;
        P();
        O();
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackIconInactiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.c0) {
            return;
        }
        this.c0 = drawable;
        this.d0 = false;
        O();
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackIconInactiveStart(@Nullable Drawable drawable) {
        if (drawable == this.a0) {
            return;
        }
        this.a0 = drawable;
        this.b0 = false;
        P();
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackIconSize(int i) {
        if (this.f0 == i) {
            return;
        }
        this.f0 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.H0)) {
            return;
        }
        this.H0 = colorStateList;
        this.a.setColor(o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackInsideCornerSize(int i) {
        if (this.Q == i) {
            return;
        }
        this.Q = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setTrackStopIndicatorSize(int i) {
        if (this.O == i) {
            return;
        }
        this.O = i;
        this.g.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.p0 = f;
        this.C0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.q0 = f;
        this.C0 = true;
        postInvalidate();
    }

    @Override // com.google.android.material.slider.b
    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        C(arrayList);
    }

    public void setValues(@NonNull List<Float> list) {
        C(new ArrayList(list));
    }

    public void setTrackIconActiveEnd(int i) {
        setTrackIconActiveEnd(i != 0 ? td4.d0(i, getContext()) : null);
    }

    public void setTrackIconActiveStart(int i) {
        setTrackIconActiveStart(i != 0 ? td4.d0(i, getContext()) : null);
    }

    public void setTrackIconInactiveEnd(int i) {
        setTrackIconInactiveEnd(i != 0 ? td4.d0(i, getContext()) : null);
    }

    public void setTrackIconInactiveStart(int i) {
        setTrackIconInactiveStart(i != 0 ? td4.d0(i, getContext()) : null);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new c();
        public float a;
        public int b;

        public RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.a = parcel.readFloat();
            this.b = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.a);
            parcel.writeInt(this.b);
        }

        public RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(@Nullable wka wkaVar) {
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(@NonNull int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }
}
