package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final c f22101a;

    /* renamed from: b, reason: collision with root package name */
    public float f22102b;

    /* renamed from: c, reason: collision with root package name */
    public int f22103c;

    public interface b {
    }

    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public float f22104a;

        /* renamed from: b, reason: collision with root package name */
        public float f22105b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22106c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22107d;

        public c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f22104a = f10;
            this.f22105b = f11;
            this.f22106c = z10;
            if (this.f22107d) {
                return;
            }
            this.f22107d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22107d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22103c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d0.AspectRatioFrameLayout, 0, 0);
            try {
                this.f22103c = obtainStyledAttributes.getInt(d0.f22419a, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f22101a = new c();
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f22103c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f22102b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f22102b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f22101a.a(this.f22102b, f14, false);
            return;
        }
        int i12 = this.f22103c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f22102b;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f22102b;
                    } else {
                        f11 = this.f22102b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f22102b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f22102b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f22102b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f22101a.a(this.f22102b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f22102b != f10) {
            this.f22102b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f22103c != i10) {
            this.f22103c = i10;
            requestLayout();
        }
    }
}
