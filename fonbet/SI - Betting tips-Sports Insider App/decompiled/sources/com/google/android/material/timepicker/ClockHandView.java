package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;

    @NonNull
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface OnActionUpListener {
        void onActionUp(float f6, boolean z5);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface OnRotateListener {
        void onRotate(float f6, boolean z5);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void adjustLevel(float f6, float f10) {
        this.currentLevel = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), f6, f10) > ((float) getLeveledCircleRadius(2)) + ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f6 = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f6;
        float f10 = height;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f10;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.selectorRadius, this.paint);
        double sin2 = Math.sin(this.degRad);
        double cos2 = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f6, f10, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin2)), this.paint);
        canvas.drawCircle(f6, f10, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f6, float f10) {
        int degrees = (int) Math.toDegrees(Math.atan2(f10 - (getHeight() / 2), f6 - (getWidth() / 2)));
        int i5 = degrees + 90;
        return i5 < 0 ? degrees + 450 : i5;
    }

    private int getLeveledCircleRadius(int i5) {
        return i5 == 2 ? Math.round(this.circleRadius * 0.66f) : this.circleRadius;
    }

    private Pair<Float, Float> getValuesForAnimation(float f6) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f6) > 180.0f) {
            if (handRotation > 180.0f && f6 < 180.0f) {
                f6 += 360.0f;
            }
            if (handRotation < 180.0f && f6 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f6));
    }

    private boolean handleTouchInput(float f6, float f10, boolean z5, boolean z7, boolean z10) {
        float degreesFromXY = getDegreesFromXY(f6, f10);
        boolean z11 = false;
        boolean z12 = getHandRotation() != degreesFromXY;
        if (z7 && z12) {
            return true;
        }
        if (!z12 && !z5) {
            return false;
        }
        if (z10 && this.animatingOnTouchUp) {
            z11 = true;
        }
        setHandRotation(degreesFromXY, z11);
        return true;
    }

    private void initRotationAnimator() {
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.this.lambda$initRotationAnimator$0(valueAnimator);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRotationAnimator$0(ValueAnimator valueAnimator) {
        setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void setHandRotationInternal(float f6, boolean z5) {
        float f10 = f6 % 360.0f;
        this.originalDeg = f10;
        this.degRad = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + width;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + height;
        RectF rectF = this.selectorBox;
        int i5 = this.selectorRadius;
        rectF.set(cos - i5, sin - i5, cos + i5, sin + i5);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f10, z5);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        super.onLayout(z5, i5, i10, i11, i12);
        if (this.rotationAnimator.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z7;
        boolean z10;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y5 = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x10;
            this.downY = y5;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z5 = true;
            z7 = false;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i5 = (int) (x10 - this.downX);
            int i10 = (int) (y5 - this.downY);
            this.isInTapRegion = (i10 * i10) + (i5 * i5) > this.scaledTouchSlop;
            z7 = this.changedDuringTouch;
            boolean z11 = actionMasked == 1;
            if (this.isMultiLevel) {
                adjustLevel(x10, y5);
            }
            z10 = z11;
            z5 = false;
        } else {
            z7 = false;
            z5 = false;
            z10 = false;
        }
        boolean handleTouchInput = this.changedDuringTouch | handleTouchInput(x10, y5, z7, z5, z10);
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z10 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x10, y5), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z5) {
        this.animatingOnTouchUp = z5;
    }

    public void setCircleRadius(int i5) {
        this.circleRadius = i5;
        invalidate();
    }

    public void setCurrentLevel(int i5) {
        this.currentLevel = i5;
        invalidate();
    }

    public void setHandRotation(float f6) {
        setHandRotation(f6, false);
    }

    public void setMultiLevel(boolean z5) {
        if (this.isMultiLevel && !z5) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z5;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public void setHandRotation(float f6, boolean z5) {
        this.rotationAnimator.cancel();
        if (!z5) {
            setHandRotationInternal(f6, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f6);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.start();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i5, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, DEFAULT_ANIMATION_DURATION);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        initRotationAnimator();
    }
}
