package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ac0;
import defpackage.bsk;
import defpackage.cl5;
import defpackage.dkf;
import defpackage.e51;
import defpackage.eq3;
import defpackage.fb5;
import defpackage.gpi;
import defpackage.i9a;
import defpackage.l2a;
import defpackage.lvk;
import defpackage.ork;
import defpackage.s02;
import defpackage.td4;
import defpackage.to;
import defpackage.wfj;
import defpackage.xc0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final e51 R = new e51(17, "thumbPos", Float.class);
    public static final int[] S = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public final ColorStateList J;
    public StaticLayout K;
    public StaticLayout L;
    public final to M;
    public ObjectAnimator N;
    public ac0 O;
    public gpi P;
    public final Rect Q;
    public Drawable a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public CharSequence o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;
    public boolean s;
    public int t;
    public final int u;
    public float v;
    public float w;
    public final VelocityTracker x;
    public final int y;
    public float z;

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, com.sofascore.results.R.attr.switchStyle);
        int resourceId;
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.x = VelocityTracker.obtain();
        this.H = true;
        this.Q = new Rect();
        wfj.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = dkf.x;
        l2a y = l2a.y(com.sofascore.results.R.attr.switchStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) y.c;
        bsk.p(this, context, iArr, attributeSet, typedArray, com.sofascore.results.R.attr.switchStyle);
        Drawable q = y.q(2);
        this.a = q;
        if (q != null) {
            q.setCallback(this);
        }
        Drawable q2 = y.q(11);
        this.f = q2;
        if (q2 != null) {
            q2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.s = typedArray.getBoolean(3, true);
        this.k = typedArray.getDimensionPixelSize(8, 0);
        this.l = typedArray.getDimensionPixelSize(5, 0);
        this.m = typedArray.getDimensionPixelSize(6, 0);
        this.n = typedArray.getBoolean(4, false);
        ColorStateList m = y.m(9);
        if (m != null) {
            this.b = m;
            this.d = true;
        }
        PorterDuff.Mode c = fb5.c(typedArray.getInt(10, -1), null);
        if (this.c != c) {
            this.c = c;
            this.e = true;
        }
        if (this.d || this.e) {
            a();
        }
        ColorStateList m2 = y.m(12);
        if (m2 != null) {
            this.g = m2;
            this.i = true;
        }
        PorterDuff.Mode c2 = fb5.c(typedArray.getInt(13, -1), null);
        if (this.h != c2) {
            this.h = c2;
            this.j = true;
        }
        if (this.i || this.j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, dkf.y);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = eq3.q(resourceId, context)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.J = colorStateList;
            } else {
                this.J = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = obtainStyledAttributes.getInt(1, -1);
            int i2 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i2 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(defaultFromStyle);
                int i3 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                to toVar = new to();
                toVar.a = context2.getResources().getConfiguration().locale;
                this.M = toVar;
            } else {
                this.M = null;
            }
            setTextOnInternal(this.o);
            setTextOffInternal(this.q);
            obtainStyledAttributes.recycle();
        }
        new xc0(this).f(attributeSet, com.sofascore.results.R.attr.switchStyle);
        y.F();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.sofascore.results.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @NonNull
    private ac0 getEmojiTextViewHelper() {
        ac0 ac0Var = this.O;
        if (ac0Var != null) {
            return ac0Var;
        }
        ac0 ac0Var2 = new ac0(this);
        this.O = ac0Var2;
        return ac0Var2;
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = lvk.a;
        int layoutDirection = getLayoutDirection();
        float f = this.z;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect b = drawable2 != null ? fb5.b(drawable2) : fb5.c;
        return ((((this.A - this.C) - rect.left) - rect.right) - b.left) - b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.q = charSequence;
        TransformationMethod k0 = ((s02) getEmojiTextViewHelper().b.b).k0(this.M);
        if (k0 != null) {
            charSequence = k0.getTransformation(charSequence, this);
        }
        this.r = charSequence;
        this.L = null;
        if (this.s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.o = charSequence;
        TransformationMethod k0 = ((s02) getEmojiTextViewHelper().b.b).k0(this.M);
        if (k0 != null) {
            charSequence = k0.getTransformation(charSequence, this);
        }
        this.p = charSequence;
        this.K = null;
        if (this.s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable mutate = drawable.mutate();
                this.a = mutate;
                if (this.d) {
                    mutate.setTintList(this.b);
                }
                if (this.e) {
                    this.a.setTintMode(this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f = mutate;
                if (this.i) {
                    mutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f.setTintMode(this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    public final void d() {
        if (this.P == null && ((s02) this.O.b.b).Q() && cl5.d()) {
            cl5 a = cl5.a();
            int c = a.c();
            if (c == 3 || c == 0) {
                gpi gpiVar = new gpi(this);
                this.P = gpiVar;
                a.h(gpiVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.D;
        int i4 = this.E;
        int i5 = this.F;
        int i6 = this.G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect b = drawable != null ? fb5.b(drawable) : fb5.c;
        Drawable drawable2 = this.f;
        Rect rect = this.Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (b != null) {
                int i8 = b.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = b.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = b.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = b.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.C + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = lvk.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = lvk.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i9a.N(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public final float getThumbPosition() {
        return this.z;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.b;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.g;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.E;
        int i2 = this.G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b = fb5.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.K : this.L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.I;
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.o : this.q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.a != null) {
            Drawable drawable = this.f;
            Rect rect = this.Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = fb5.b(this.a);
            i5 = Math.max(0, b.left - rect.left);
            i9 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        boolean z2 = lvk.a;
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.A + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.A) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.B;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.B + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.B;
        }
        this.D = i6;
        this.E = i8;
        this.G = i7;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.s) {
            StaticLayout staticLayout = this.K;
            TextPaint textPaint = this.I;
            if (staticLayout == null) {
                CharSequence charSequence = this.p;
                this.K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            }
            if (this.L == null) {
                CharSequence charSequence2 = this.r;
                this.L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            }
        }
        Drawable drawable = this.a;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.C = Math.max(this.s ? (this.k * 2) + Math.max(this.K.getWidth(), this.L.getWidth()) : 0, i3);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect b = fb5.b(drawable3);
            i6 = Math.max(i6, b.left);
            i7 = Math.max(i7, b.right);
        }
        boolean z = this.H;
        int i8 = this.l;
        if (z) {
            i8 = Math.max(i8, (this.C * 2) + i6 + i7);
        }
        int max = Math.max(i5, i4);
        this.A = i8;
        this.B = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.o : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker = this.x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.u;
        if (actionMasked != 0) {
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.t;
                    if (i2 == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float f2 = i;
                        if (Math.abs(x - this.v) > f2 || Math.abs(y - this.w) > f2) {
                            this.t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.v = x;
                            this.w = y;
                            return true;
                        }
                    } else if (i2 == 2) {
                        float x2 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x2 - this.v;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : -1.0f;
                        boolean z2 = lvk.a;
                        if (getLayoutDirection() == 1) {
                            f4 = -f4;
                        }
                        float f5 = this.z;
                        float f6 = f4 + f5;
                        if (f6 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f = f6 > 1.0f ? 1.0f : f6;
                        }
                        if (f != f5) {
                            this.v = x2;
                            setThumbPosition(f);
                        }
                        return true;
                    }
                }
            }
            if (this.t == 2) {
                this.t = 0;
                boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z3) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.y) {
                        boolean z4 = lvk.a;
                        z = getLayoutDirection() != 1 ? xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : xVelocity < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        z = getTargetCheckedState();
                    }
                } else {
                    z = isChecked;
                }
                if (z != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.t = 0;
            velocityTracker.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.a;
                Rect rect = this.Q;
                drawable.getPadding(rect);
                int i3 = this.E - i;
                int i4 = (this.D + thumbOffset) - i;
                int i5 = this.C + i4 + rect.left + rect.right + i;
                int i6 = this.G + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.t = 1;
                    this.v = x3;
                    this.w = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.o;
                if (obj == null) {
                    obj = getResources().getString(com.sofascore.results.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = bsk.a;
                new ork(com.sofascore.results.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.q;
            if (obj3 == null) {
                obj3 = getResources().getString(com.sofascore.results.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = bsk.a;
            new ork(com.sofascore.results.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj4);
        }
        IBinder windowToken = getWindowToken();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (windowToken == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (isChecked) {
                f = 1.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (isChecked) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, R, f);
        this.N = ofFloat;
        ofFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i9a.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.s != z) {
            this.s = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.q;
        if (obj == null) {
            obj = getResources().getString(com.sofascore.results.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = bsk.a;
        new ork(com.sofascore.results.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.o;
        if (obj == null) {
            obj = getResources().getString(com.sofascore.results.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = bsk.a;
        new ork(com.sofascore.results.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(td4.d0(i, getContext()));
    }

    public void setThumbTextPadding(int i) {
        this.k = i;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(td4.d0(i, getContext()));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f;
    }
}
