package com.vk.core.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.imageloader.R$styleable;
import xsna.dqa;
import xsna.m33;
import xsna.uko;

@Deprecated
/* loaded from: classes17.dex */
public class OverlayTextView extends AppCompatTextView {
    public Drawable b;
    public Drawable c;
    public final ColorStateList d;
    public boolean e;
    public final boolean f;
    public SpannableStringBuilder g;
    public dqa h;
    public final Matrix i;
    public final Rect j;
    public final float[] k;

    public OverlayTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = false;
        this.f = false;
        this.i = new Matrix();
        this.j = new Rect();
        this.k = new float[9];
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                setOverlay(resourceId);
            }
            this.e = obtainStyledAttributes.getBoolean(3, false);
            this.f = obtainStyledAttributes.getBoolean(2, false);
            this.d = obtainStyledAttributes.getColorStateList(0);
            Drawable drawable = obtainStyledAttributes.getDrawable(4);
            obtainStyledAttributes.recycle();
            setSrc(drawable);
        }
        setWillNotDraw(false);
    }

    @Override // android.view.View
    @TargetApi(21)
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            this.b.setState(drawableState);
            postInvalidate();
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setState(drawableState);
            Drawable drawable3 = this.c;
            drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), this.c.getIntrinsicHeight());
            postInvalidate();
        }
    }

    @Override // android.widget.TextView
    @NonNull
    public Drawable[] getCompoundDrawables() {
        Drawable[] compoundDrawables = super.getCompoundDrawables();
        compoundDrawables[0] = this.c;
        return compoundDrawables;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.k;
        matrix.getValues(fArr);
        canvas.translate(-fArr[2], -fArr[5]);
        Drawable drawable = this.b;
        if (drawable != null) {
            if (this.e) {
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), canvas.getWidth() - getPaddingRight(), canvas.getHeight() - getPaddingBottom());
            } else if (this.f) {
                Drawable background = getBackground();
                Rect rect = this.j;
                if (background != null && !getBackground().getPadding(rect)) {
                    rect.set(0, 0, 0, 0);
                }
                this.b.setBounds(rect.left, rect.top, canvas.getWidth() - rect.right, canvas.getHeight() - rect.bottom);
            } else {
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            }
            this.b.draw(canvas);
        }
    }

    public void setOverlay(int i) {
        setOverlay(m33.a(i, getContext()));
    }

    public void setPadOverlay(boolean z) {
        this.e = z;
        invalidate();
    }

    public void setSrc(Drawable drawable) {
        if (drawable != null) {
            ColorStateList colorStateList = this.d;
            if (colorStateList == null) {
                colorStateList = getTextColors();
            }
            if (colorStateList == null) {
                this.c = drawable.mutate();
            } else {
                uko.a aVar = uko.a;
                Drawable mutate = drawable.mutate();
                mutate.setTintList(colorStateList);
                this.c = mutate;
            }
            this.h = new dqa(this.c);
            setText(getText());
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.h != null) {
            SpannableStringBuilder spannableStringBuilder = this.g;
            if (spannableStringBuilder == null) {
                this.g = new SpannableStringBuilder();
            } else {
                spannableStringBuilder.clear();
            }
            String trim = charSequence == null ? "" : charSequence.toString().trim();
            if (TextUtils.isEmpty(trim)) {
                this.g.append((CharSequence) "  ");
                this.g.setSpan(this.h, 1, 2, 17);
            } else {
                this.g.append((CharSequence) "   ");
                this.g.setSpan(this.h, 0, 1, 17);
                this.g.append((CharSequence) trim);
            }
            charSequence = this.g;
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        setSrc(this.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    public void setOverlay(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        drawable.setCallback(this);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        setSrc(this.c);
    }
}
