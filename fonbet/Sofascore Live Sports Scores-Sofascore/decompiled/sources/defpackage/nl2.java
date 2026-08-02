package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nl2 extends f8b {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl2(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.a = 0;
    }

    @Override // defpackage.f8b
    public int calculateDxToMakeVisible(View view, int i) {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return super.calculateDxToMakeVisible(view, i);
        }
    }

    @Override // defpackage.f8b
    public int calculateDyToMakeVisible(View view, int i) {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return super.calculateDyToMakeVisible(view, i);
        }
    }

    @Override // defpackage.f8b
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i;
        float f;
        float f2;
        switch (this.a) {
            case 1:
                displayMetrics.getClass();
                i = displayMetrics.densityDpi;
                return 180.0f / i;
            case 2:
            case 3:
            default:
                return super.calculateSpeedPerPixel(displayMetrics);
            case 4:
                displayMetrics.getClass();
                i = displayMetrics.densityDpi;
                return 180.0f / i;
            case 5:
                displayMetrics.getClass();
                f = displayMetrics.densityDpi;
                f2 = 300.0f;
                return f2 / f;
            case 6:
                displayMetrics.getClass();
                f = displayMetrics.densityDpi;
                f2 = 50.0f;
                return f2 / f;
            case 7:
                f = displayMetrics.densityDpi;
                f2 = 100.0f;
                return f2 / f;
        }
    }

    @Override // defpackage.f8b
    public int calculateTimeForScrolling(int i) {
        switch (this.a) {
            case 2:
                return 150;
            case 3:
                return 150;
            default:
                return super.calculateTimeForScrolling(i);
        }
    }

    @Override // androidx.recyclerview.widget.s
    public PointF computeScrollVectorForPosition(int i) {
        switch (this.a) {
            case 0:
                return null;
            default:
                return super.computeScrollVectorForPosition(i);
        }
    }

    @Override // defpackage.f8b
    public int getHorizontalSnapPreference() {
        switch (this.a) {
            case 6:
                return -1;
            default:
                return super.getHorizontalSnapPreference();
        }
    }

    @Override // defpackage.f8b
    public int getVerticalSnapPreference() {
        switch (this.a) {
            case 2:
                return -1;
            case 3:
                return -1;
            case 4:
            case 5:
            default:
                return super.getVerticalSnapPreference();
            case 6:
                return -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl2(Context context, int i) {
        super(context);
        this.a = i;
    }
}
