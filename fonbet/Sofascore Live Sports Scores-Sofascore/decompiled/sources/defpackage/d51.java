package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class d51 extends FrameLayout {
    public final float a;
    public final float b;
    public final DisplayMetrics c;
    public final ArrayList d;

    public d51(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, qjf.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getFloat(1, -1.0f);
            this.b = obtainStyledAttributes.getFloat(0, -1.0f);
            obtainStyledAttributes.recycle();
            this.c = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static int d(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public static int e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    public final int a(int i) {
        if (getMaxHeightPct() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return View.MeasureSpec.getSize(i);
        }
        return Math.round(((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels)) / 4.0f) * 4;
    }

    public final int b(int i) {
        if (getMaxWidthPct() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return View.MeasureSpec.getSize(i);
        }
        return Math.round(((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels)) / 4.0f) * 4;
    }

    public final View c(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        a70.r(ljg.j(i, "No such child: "));
        return null;
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.c;
    }

    public float getMaxHeightPct() {
        return this.b;
    }

    public float getMaxWidthPct() {
        return this.a;
    }

    public List<View> getVisibleChildren() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        super.measureChildWithMargins(view, i, i2, i3, i4);
        view.getMeasuredWidth();
        view.getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = getDisplayMetrics().widthPixels;
        int i4 = getDisplayMetrics().heightPixels;
        ArrayList arrayList = this.d;
        arrayList.clear();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
    }
}
