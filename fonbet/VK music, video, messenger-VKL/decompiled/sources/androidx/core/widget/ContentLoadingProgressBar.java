package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import xsna.ou4;
import xsna.yv6;

/* loaded from: classes12.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public static final /* synthetic */ int d = 0;
    public final yv6 b;
    public final ou4 c;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new yv6(this, 2);
        this.c = new ou4(this, 3);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.b);
        removeCallbacks(this.c);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.b);
        removeCallbacks(this.c);
    }
}
