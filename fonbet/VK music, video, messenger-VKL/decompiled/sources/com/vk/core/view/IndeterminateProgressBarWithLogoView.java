package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.dhr0;
import xsna.fuo;
import xsna.iah0;
import xsna.l2e0;
import xsna.o45;
import xsna.xng0;

/* compiled from: IndeterminateProgressBarWithLogoView.kt */
/* loaded from: classes.dex */
public final class IndeterminateProgressBarWithLogoView extends RelativeLayout {
    public static final int b = iah0.a(16);
    public static final int c = iah0.a(100);
    public static final int d = iah0.a(15);

    public IndeterminateProgressBarWithLogoView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public IndeterminateProgressBarWithLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public IndeterminateProgressBarWithLogoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ IndeterminateProgressBarWithLogoView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public IndeterminateProgressBarWithLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View.inflate(context, R.layout.indeterminate_progress_bar_with_logo_view, this);
        ImageView imageView = (ImageView) findViewById(R.id.vk_icon);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress);
        progressBar.setIndeterminateDrawable(new l2e0(context.getColor(R.color.vk_azure_A100), c, d, new o45(imageView, 2)));
        progressBar.setInterpolator(new fuo());
        abg0 abg0Var = dhr0.t;
        progressBar.setBackground(new xng0(abg0Var.c(R.attr.vk_ui_transparent_active)));
        setBackgroundColor(abg0Var.c(R.attr.vk_ui_background_content));
    }
}
