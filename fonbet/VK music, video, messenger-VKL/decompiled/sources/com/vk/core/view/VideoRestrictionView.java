package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.enj;
import xsna.hny;
import xsna.iah0;
import xsna.jno0;
import xsna.ozl;

/* compiled from: VideoRestrictionView.kt */
@ozl
/* loaded from: classes17.dex */
public final class VideoRestrictionView extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView b;
    public final VKImageView c;

    /* compiled from: VideoRestrictionView.kt */
    public static final class a {
        public static hny a(int i, Context context) {
            hny hnyVar = new hny(context);
            hnyVar.a(i, R.color.vk_black);
            hnyVar.b(enj.d(R.drawable.vk_icon_block_48, R.color.vk_gray_300, context));
            return hnyVar;
        }
    }

    public VideoRestrictionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TextView textView = new TextView(context);
        jno0.c(textView, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(textView, FontFamily.REGULAR, Float.valueOf(14.0f), 4);
        textView.setGravity(17);
        this.b = textView;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setPlaceholderImage(enj.d(R.drawable.vk_icon_block_48, R.color.vk_gray_300, context));
        this.c = vKImageView;
        bwt0.p0(this, false);
        setBackgroundColor(-16777216);
        bwt0.p0(vKImageView, true);
        bwt0.p0(textView, false);
        addView(vKImageView);
        addView(textView);
    }

    public final void a(View view) {
        int measuredHeight = getMeasuredHeight() / 2;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth() / 2;
        int measuredHeight2 = view.getMeasuredHeight() / 2;
        view.layout(measuredWidth - measuredWidth2, measuredHeight - measuredHeight2, measuredWidth + measuredWidth2, measuredHeight + measuredHeight2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        VKImageView vKImageView = this.c;
        if (bwt0.K(vKImageView)) {
            a(vKImageView);
            return;
        }
        TextView textView = this.b;
        if (bwt0.K(textView)) {
            a(textView);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 48;
        this.c.measure(View.MeasureSpec.makeMeasureSpec(iah0.a(f), 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(f), 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i - (iah0.a(36) * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(i, i2);
    }
}
