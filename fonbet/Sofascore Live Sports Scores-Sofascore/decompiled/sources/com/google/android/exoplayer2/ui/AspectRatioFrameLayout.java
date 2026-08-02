package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ojf;
import defpackage.uh0;
import defpackage.wh0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public final wh0 a;
    public float b;
    public int c;

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ojf.a, 0, 0);
            try {
                this.c = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.a = new wh0(this, 0);
    }

    public int getResizeMode() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r4 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2 = r2 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r1 = r1 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r4 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L23;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = (this.b / (f2 / f3)) - 1.0f;
        float abs = Math.abs(f4);
        wh0 wh0Var = this.a;
        if (abs <= 0.01f) {
            if (wh0Var.b) {
                return;
            }
            wh0Var.b = true;
            ((AspectRatioFrameLayout) wh0Var.c).post(wh0Var);
            return;
        }
        int i3 = this.c;
        if (i3 == 0) {
            f = this.b;
        } else if (i3 == 1) {
            float f5 = f2 / this.b;
            measuredHeight = (int) f5;
        } else if (i3 == 2) {
            float f6 = f3 * this.b;
            measuredWidth = (int) f6;
        } else if (i3 == 4) {
            f = this.b;
        }
        if (!wh0Var.b) {
            wh0Var.b = true;
            ((AspectRatioFrameLayout) wh0Var.c).post(wh0Var);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable uh0 uh0Var) {
    }
}
