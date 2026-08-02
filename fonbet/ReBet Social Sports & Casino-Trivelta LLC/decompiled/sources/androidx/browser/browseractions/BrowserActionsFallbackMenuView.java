package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import v.AbstractC6593a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f17528a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17529b;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17528a = getResources().getDimensionPixelOffset(AbstractC6593a.f66767b);
        this.f17529b = getResources().getDimensionPixelOffset(AbstractC6593a.f66766a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f17528a * 2), this.f17529b), 1073741824), i11);
    }
}
