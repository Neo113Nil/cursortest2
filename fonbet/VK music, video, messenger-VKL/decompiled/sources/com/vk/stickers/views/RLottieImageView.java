package com.vk.stickers.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.metrics.eventtracking.b;
import com.vk.rlottie.RLottieDrawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.pm0;

/* compiled from: RLottieImageView.kt */
/* loaded from: classes6.dex */
public final class RLottieImageView extends AppCompatImageView {
    public static final /* synthetic */ int l = 0;
    public String b;
    public RLottieDrawable.a c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Matrix i;
    public boolean j;
    public boolean k;

    /* compiled from: RLottieImageView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RLottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.i = new Matrix();
    }

    private final RLottieDrawable getRLottieDrawable() {
        Drawable drawable = getDrawable();
        if (drawable instanceof RLottieDrawable) {
            return (RLottieDrawable) drawable;
        }
        return null;
    }

    private final void setRLottieDrawable(RLottieDrawable rLottieDrawable) {
        setImageDrawable(rLottieDrawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
    
        if (r6.isIdentity() == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        float f;
        int i;
        Drawable drawable = getDrawable();
        RLottieDrawable rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
        if (rLottieDrawable == null) {
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        boolean z = false;
        if (width <= 0 || height <= 0) {
            this.j = false;
            return;
        }
        int i2 = this.f;
        int i3 = this.g;
        rLottieDrawable.setBounds(0, 0, i2, i3);
        ImageView.ScaleType scaleType = getScaleType();
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        Matrix matrix = this.i;
        matrix.reset();
        int[] iArr = a.$EnumSwitchMapping$0;
        switch (iArr[scaleType.ordinal()]) {
            case 1:
                matrix.set(getImageMatrix());
                break;
            case 2:
                matrix.setScale(width / i2, height / i3);
                z = true;
                this.j = z;
                invalidate();
                return;
            case 3:
                matrix.setTranslate((width - i2) * 0.5f, (height - i3) * 0.5f);
                z = true;
                this.j = z;
                invalidate();
                return;
            case 4:
                float f2 = width;
                float f3 = i2;
                float f4 = height;
                float f5 = i3;
                float max = Math.max(f2 / f3, f4 / f5);
                float a2 = pm0.a(f3, max, f2, 0.5f);
                float a3 = pm0.a(f5, max, f4, 0.5f);
                matrix.setScale(max, max);
                matrix.postTranslate(a2, a3);
                z = true;
                this.j = z;
                invalidate();
                return;
            case 5:
                float f6 = width;
                float f7 = i2;
                float f8 = height;
                float f9 = i3;
                float min = Math.min(1.0f, Math.min(f6 / f7, f8 / f9));
                float a4 = pm0.a(f7, min, f6, 0.5f);
                float a5 = pm0.a(f9, min, f8, 0.5f);
                matrix.setScale(min, min);
                matrix.postTranslate(a4, a5);
                z = true;
                this.j = z;
                invalidate();
                return;
            case 6:
            case 7:
            case 8:
                float f10 = width;
                float f11 = i2;
                float f12 = height;
                float f13 = i3;
                float min2 = Math.min(f10 / f11, f12 / f13);
                float f14 = f11 * min2;
                float f15 = f13 * min2;
                int i4 = iArr[scaleType.ordinal()];
                float f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i4 != 6) {
                    if (i4 == 7) {
                        f = (f10 - f14) * 0.5f;
                    } else if (i4 == 8) {
                        f = f10 - f14;
                    }
                    i = iArr[scaleType.ordinal()];
                    if (i != 6) {
                        if (i == 7) {
                            f16 = (f12 - f15) * 0.5f;
                        } else if (i == 8) {
                            f16 = f12 - f15;
                        }
                    }
                    matrix.setScale(min2, min2);
                    matrix.postTranslate(f, f16);
                    z = true;
                    this.j = z;
                    invalidate();
                    return;
                }
                f = 0.0f;
                i = iArr[scaleType.ordinal()];
                if (i != 6) {
                }
                matrix.setScale(min2, min2);
                matrix.postTranslate(f, f16);
                z = true;
                this.j = z;
                invalidate();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void W(int i, int i2, String str) {
        if (getRLottieDrawable() != null && i == this.d && i2 == this.e) {
            getRLottieDrawable();
            return;
        }
        this.d = i;
        this.e = i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Pair pair = new Pair(Integer.valueOf(jSONObject.optInt(Logger.METHOD_W, i)), Integer.valueOf(jSONObject.optInt("h", i2)));
            float intValue = ((Number) pair.d()).intValue();
            float intValue2 = ((Number) pair.g()).intValue();
            float max = Math.max(i / intValue, i2 / intValue2);
            this.f = (int) (intValue * max);
            this.g = (int) (intValue2 * max);
            RLottieDrawable rLottieDrawable = new RLottieDrawable(str, "rlottie-" + SystemClock.elapsedRealtimeNanos(), this.f, this.g, null, false, false, null, 496);
            rLottieDrawable.k.q = this.h;
            setImageDrawable(rLottieDrawable);
            RLottieDrawable rLottieDrawable2 = getRLottieDrawable();
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.k.t = this.c;
            }
            RLottieDrawable rLottieDrawable3 = getRLottieDrawable();
            if (rLottieDrawable3 != null) {
                if (this.k) {
                    rLottieDrawable3.i();
                } else {
                    rLottieDrawable3.j();
                }
            }
            RLottieDrawable rLottieDrawable4 = getRLottieDrawable();
            if (rLottieDrawable4 != null) {
                rLottieDrawable4.setCallback(this);
            }
            V();
            invalidate();
        } catch (Exception e) {
            b.a.a(e);
        }
        getRLottieDrawable();
    }

    public final void clear() {
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.i();
        }
        RLottieDrawable rLottieDrawable2 = getRLottieDrawable();
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.k();
        }
        setRLottieDrawable(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.k) {
                return;
            }
            rLottieDrawable.j();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clear();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int save = canvas.save();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.clipRect(paddingLeft, paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.translate(paddingLeft, paddingTop);
        if (this.j) {
            canvas.concat(this.i);
        }
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0 || (str = this.b) == null) {
            return;
        }
        W(getMeasuredWidth(), getMeasuredHeight(), str);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        V();
    }

    public final void setAnimationListener(RLottieDrawable.a aVar) {
        this.c = aVar;
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.k.t = this.c;
        }
    }

    public final void setPlayCount(int i) {
        this.h = i;
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.k.q = i;
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        V();
        invalidate();
    }

    public final void setStatic(boolean z) {
        RLottieDrawable rLottieDrawable;
        this.k = z;
        if (z) {
            Drawable drawable = getDrawable();
            rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
            if (rLottieDrawable != null) {
                rLottieDrawable.i();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        rLottieDrawable = drawable2 instanceof RLottieDrawable ? (RLottieDrawable) drawable2 : null;
        if (rLottieDrawable != null) {
            rLottieDrawable.j();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getDrawable() || super.verifyDrawable(drawable);
    }
}
