package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    SingleCircularProgressDrawable(int i11) {
        if (i11 == 0) {
            this.mStartAngleMax = 0.0f;
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.mStartAngleMax = 360.0f;
        }
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override // me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable
    protected void onDrawRing(@NonNull Canvas canvas, @NonNull Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f7 = level / 10000.0f;
        float f11 = this.mStartAngleMax * f7;
        float f12 = f7 * 360.0f;
        drawRing(canvas, paint, f11, f12);
        if (this.mShowBackground) {
            drawRing(canvas, paint, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        invalidateSelf();
        return true;
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z11) {
        if (this.mShowBackground != z11) {
            this.mShowBackground = z11;
            invalidateSelf();
        }
    }
}
