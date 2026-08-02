package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes12.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final b b;
    public float c;
    public int d;

    public interface a {
    }

    public final class b implements Runnable {
        public boolean b;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b = false;
            int i = AspectRatioFrameLayout.e;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
            try {
                this.d = obtainStyledAttributes.getInt(2, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.b = new b();
    }

    public int getResizeMode() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.c <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.c / (f3 / f4)) - 1.0f;
        float abs = Math.abs(f5);
        b bVar = this.b;
        if (abs <= 0.01f) {
            if (bVar.b) {
                return;
            }
            bVar.b = true;
            AspectRatioFrameLayout.this.post(bVar);
            return;
        }
        int i3 = this.d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.c;
                } else if (i3 == 4) {
                    if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = this.c;
                    } else {
                        f2 = this.c;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.c;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = this.c;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.c;
            measuredWidth = (int) (f4 * f);
        }
        if (!bVar.b) {
            bVar.b = true;
            AspectRatioFrameLayout.this.post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.c != f) {
            this.c = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable a aVar) {
    }
}
