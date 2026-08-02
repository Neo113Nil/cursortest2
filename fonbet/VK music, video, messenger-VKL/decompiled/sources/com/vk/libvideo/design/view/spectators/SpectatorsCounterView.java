package com.vk.libvideo.design.view.spectators;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.R$styleable;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import xsna.brm0;
import xsna.iah0;
import xsna.iut0;
import xsna.rlk;
import xsna.xjk0;

/* compiled from: SpectatorsCounterView.kt */
/* loaded from: classes2.dex */
public final class SpectatorsCounterView extends FrameLayout implements rlk {
    public AppCompatTextView b;
    public final int c;

    public SpectatorsCounterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.rlk
    public void setCurrentViewers(int i) {
        if (this.b == null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setId(R.id.liveSpectatorsViewersIcon);
            imageView.setImageResource(R.drawable.vk_icon_view_20);
            imageView.setColorFilter(-3355444);
            imageView.setPadding(4, 4, 4, 4);
            float f = 20;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
            float f2 = 4;
            layoutParams.leftMargin = iah0.a(f2);
            layoutParams.rightMargin = iah0.a(f2);
            layoutParams.gravity = 16;
            addView(imageView, layoutParams);
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setId(R.id.liveSpectatorsViewers);
            appCompatTextView.setIncludeFontPadding(false);
            appCompatTextView.setSingleLine();
            appCompatTextView.setTextColor(-1);
            appCompatTextView.setBreakStrategy(0);
            appCompatTextView.setTextSize(12.0f);
            appCompatTextView.setShadowLayer(12.0f, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1375731712);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = iah0.a(26);
            layoutParams2.rightMargin = iah0.a(8);
            layoutParams2.gravity = 16;
            addView(appCompatTextView, layoutParams2);
            this.b = appCompatTextView;
            setBackgroundResource(this.c);
            iut0.q(this, new xjk0());
        }
        AppCompatTextView appCompatTextView2 = this.b;
        if (appCompatTextView2 != null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setGroupingSeparator(' ');
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            decimalFormat.setGroupingSize(3);
            decimalFormat.setMaximumFractionDigits(0);
            appCompatTextView2.setText(brm0.y(decimalFormat.format(i), " ", " "));
            appCompatTextView2.setContentDescription(getContext().getResources().getQuantityString(R.plurals.video_spectators_count, i, Integer.valueOf(i)));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpectatorsCounterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        this.c = obtainStyledAttributes.getResourceId(0, R.drawable.bg_live_inline_spectators_rounded);
        obtainStyledAttributes.recycle();
    }
}
