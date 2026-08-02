package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
public class ReactSlider extends AppCompatSeekBar {
    private static int DEFAULT_TOTAL_STEPS = 128;
    private boolean isSliding;
    private List<String> mAccessibilityIncrements;
    private String mAccessibilityUnits;
    private int mLowerLimit;
    private double mMaxValue;
    private double mMinValue;
    private double mRealLowerLimit;
    private double mRealUpperLimit;
    private double mStep;
    private double mStepCalculated;

    @Nullable
    private String mThumbImageUri;
    private int mThumbSizePx;

    @Nullable
    private Integer mThumbTintColor;
    private int mUpperLimit;
    private double mValue;

    public ReactSlider(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinValue = 0.0d;
        this.mMaxValue = 0.0d;
        this.mValue = 0.0d;
        this.isSliding = false;
        this.mStep = 0.0d;
        this.mStepCalculated = 0.0d;
        this.mRealLowerLimit = -9.223372036854776E18d;
        this.mRealUpperLimit = 9.223372036854776E18d;
        this.mThumbSizePx = 0;
        this.mThumbImageUri = null;
        this.mThumbTintColor = null;
        super.setLayoutDirection(I18nUtil.getInstance().isRTL(context) ? 1 : 0);
        disableStateListAnimatorIfNeeded();
    }

    private void disableStateListAnimatorIfNeeded() {
        if (Build.VERSION.SDK_INT < 26) {
            super.setStateListAnimator(null);
        }
    }

    void setMaxValue(double d) {
        this.mMaxValue = d;
        updateAll();
    }

    void setMinValue(double d) {
        this.mMinValue = d;
        updateAll();
    }

    int getValidProgressValue(int i) {
        if (i < getLowerLimit()) {
            return getLowerLimit();
        }
        return i > getUpperLimit() ? getUpperLimit() : i;
    }

    void setValue(double d) {
        this.mValue = d;
        updateValue();
    }

    void setStep(double d) {
        this.mStep = d;
        updateAll();
    }

    void setLowerLimit(double d) {
        this.mRealLowerLimit = d;
        updateLowerLimit();
    }

    void setUpperLimit(double d) {
        this.mRealUpperLimit = d;
        updateUpperLimit();
    }

    int getLowerLimit() {
        return this.mLowerLimit;
    }

    int getUpperLimit() {
        return this.mUpperLimit;
    }

    boolean isSliding() {
        return this.isSliding;
    }

    void isSliding(boolean z) {
        this.isSliding = z;
    }

    void setAccessibilityUnits(String str) {
        this.mAccessibilityUnits = str;
    }

    void setAccessibilityIncrements(List<String> list) {
        this.mAccessibilityIncrements = list;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.mValue);
        }
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        final AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            final AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            new Timer().schedule(new TimerTask() { // from class: com.reactnativecommunity.slider.ReactSlider.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
            }, 1000L);
        }
    }

    public void setupAccessibility(int i) {
        List<String> list;
        if (this.mAccessibilityUnits == null || (list = this.mAccessibilityIncrements) == null || list.size() - 1 != ((int) this.mMaxValue)) {
            return;
        }
        String str = this.mAccessibilityIncrements.get(i);
        int length = this.mAccessibilityUnits.length();
        String str2 = this.mAccessibilityUnits;
        if (str != null && Integer.parseInt(str) == 1) {
            str2 = str2.substring(0, length - 1);
        }
        announceForAccessibility(String.format("%s %s", str, str2));
    }

    public double toRealProgress(int i) {
        if (i == getMax()) {
            return this.mMaxValue;
        }
        return (i * getStepValue()) + this.mMinValue;
    }

    private void updateAll() {
        if (this.mStep == 0.0d) {
            this.mStepCalculated = (this.mMaxValue - this.mMinValue) / DEFAULT_TOTAL_STEPS;
        }
        setMax(getTotalSteps());
        setKeyProgressIncrement(1);
        updateLowerLimit();
        updateUpperLimit();
        updateValue();
    }

    private void updateLowerLimit() {
        double max = Math.max(this.mRealLowerLimit, this.mMinValue);
        double d = this.mMinValue;
        int round = (int) Math.round(((max - d) / (this.mMaxValue - d)) * getTotalSteps());
        int i = this.mUpperLimit;
        if (round > i) {
            Log.d("Invalid configuration", "upperLimit < lowerLimit; lowerLimit not set");
        } else {
            this.mLowerLimit = Math.min(round, i);
        }
    }

    private void updateUpperLimit() {
        double min = Math.min(this.mRealUpperLimit, this.mMaxValue);
        double d = this.mMinValue;
        int round = (int) Math.round(((min - d) / (this.mMaxValue - d)) * getTotalSteps());
        if (this.mLowerLimit > round) {
            Log.d("Invalid configuration", "upperLimit < lowerLimit; upperLimit not set");
        } else {
            this.mUpperLimit = round;
        }
    }

    private void updateValue() {
        double d = this.mValue;
        double d2 = this.mMinValue;
        setProgress((int) Math.round(((d - d2) / (this.mMaxValue - d2)) * getTotalSteps()));
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.mMaxValue - this.mMinValue) / getStepValue());
    }

    private double getStepValue() {
        double d = this.mStep;
        return d > 0.0d ? d : this.mStepCalculated;
    }

    private BitmapDrawable getBitmapDrawable(final String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new Callable<BitmapDrawable>() { // from class: com.reactnativecommunity.slider.ReactSlider.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public BitmapDrawable call() {
                    Bitmap decodeStream;
                    try {
                        if (!str.startsWith("http://") && !str.startsWith("https://") && !str.startsWith("file://") && !str.startsWith("asset://") && !str.startsWith("data:")) {
                            decodeStream = BitmapFactory.decodeResource(ReactSlider.this.getResources(), ReactSlider.this.getResources().getIdentifier(str, "drawable", ReactSlider.this.getContext().getPackageName()));
                            return new BitmapDrawable(ReactSlider.this.getResources(), decodeStream);
                        }
                        decodeStream = BitmapFactory.decodeStream(new URL(str).openStream());
                        return new BitmapDrawable(ReactSlider.this.getResources(), decodeStream);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }).get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setThumbImage(@Nullable String str) {
        this.mThumbImageUri = str;
        refreshThumb();
    }

    public void setThumbSize(float f) {
        this.mThumbSizePx = f > 0.0f ? Math.round(f * getResources().getDisplayMetrics().density) : 0;
        refreshThumb();
    }

    public void setThumbTintColor(@Nullable Integer num) {
        this.mThumbTintColor = num;
        if (this.mThumbImageUri != null || this.mThumbSizePx > 0) {
            refreshThumb();
        } else {
            applyThumbTintColorFilter();
        }
    }

    private void applyThumbTintColorFilter() {
        if (getThumb() == null) {
            return;
        }
        if (this.mThumbTintColor != null) {
            getThumb().setColorFilter(this.mThumbTintColor.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            getThumb().clearColorFilter();
        }
    }

    private void refreshThumb() {
        int defaultColor;
        BitmapDrawable bitmapDrawable;
        String str = this.mThumbImageUri;
        if (str != null && (bitmapDrawable = getBitmapDrawable(str)) != null) {
            if (this.mThumbSizePx > 0) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                int i = this.mThumbSizePx;
                setThumb(new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, i, i, true)));
            } else {
                setThumb(bitmapDrawable);
            }
            applyThumbTintColorFilter();
            setSplitTrack(false);
            return;
        }
        int i2 = this.mThumbSizePx;
        if (i2 > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Integer num = this.mThumbTintColor;
            if (num != null) {
                defaultColor = num.intValue();
            } else {
                defaultColor = getThumbTintList() != null ? getThumbTintList().getDefaultColor() : -1;
            }
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(defaultColor);
            float f = this.mThumbSizePx / 2.0f;
            canvas.drawCircle(f, f, f, paint);
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(1.0f);
            paint2.setColor(436207616);
            canvas.drawCircle(f, f, f - 0.5f, paint2);
            setThumb(new BitmapDrawable(getResources(), createBitmap));
            applyThumbTintColorFilter();
            setSplitTrack(false);
            return;
        }
        applyThumbTintColorFilter();
    }
}
