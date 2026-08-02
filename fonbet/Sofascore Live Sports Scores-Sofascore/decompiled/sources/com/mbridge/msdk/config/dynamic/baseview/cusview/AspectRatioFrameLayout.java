package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;
    private final c a;
    private float b;
    private int c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface b {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class c implements Runnable {
        private float a;
        private float b;
        private boolean c;
        private boolean d;

        private c() {
        }

        public void a(float f, float f2, boolean z) {
            this.a = f;
            this.b = f2;
            this.c = z;
            if (this.d) {
                return;
            }
            this.d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.a = new c();
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r4 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r2 = r2 * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r1 = r1 / r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r4 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L21;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = f2 / f3;
        float f5 = (this.b / f4) - 1.0f;
        if (Math.abs(f5) <= 0.01f) {
            this.a.a(this.b, f4, false);
            return;
        }
        int i3 = this.c;
        if (i3 == 0) {
            f = this.b;
        } else if (i3 == 1) {
            float f6 = f2 / this.b;
            measuredHeight = (int) f6;
        } else if (i3 == 2) {
            float f7 = f3 * this.b;
            measuredWidth = (int) f7;
        } else if (i3 == 4) {
            f = this.b;
        }
        this.a.a(this.b, f4, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        int i2 = this.c;
        int i3 = 1;
        if (i == 1) {
            i3 = 0;
        } else if (i == 2) {
            i3 = 3;
        } else if (i == 3) {
            i3 = 4;
        } else if (i != 4) {
            i3 = i != 5 ? i2 : 2;
        }
        if (i2 != i3) {
            this.c = i3;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public void setAspectRatioListener(@Nullable b bVar) {
    }
}
