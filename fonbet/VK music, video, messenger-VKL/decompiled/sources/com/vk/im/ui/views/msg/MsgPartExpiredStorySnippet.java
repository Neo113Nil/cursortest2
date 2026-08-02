package com.vk.im.ui.views.msg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.iah0;
import xsna.m33;

/* compiled from: MsgPartExpiredStorySnippet.kt */
/* loaded from: classes2.dex */
public final class MsgPartExpiredStorySnippet extends FluidHorizontalLayout {
    public final View g;
    public final View h;
    public final ImageView i;
    public final TextView j;

    public MsgPartExpiredStorySnippet(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // com.vk.core.tool.view.FluidHorizontalLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.g;
        if (bwt0.K(view)) {
            view.measure(View.MeasureSpec.makeMeasureSpec(iah0.a(2), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        View view2 = this.h;
        if (bwt0.K(view2)) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(iah0.a(2), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    public final void setIcon(Drawable drawable) {
        this.i.setImageDrawable(drawable);
    }

    public final void setIconTint(int i) {
        this.i.getDrawable().setTint(i);
    }

    public final void setLineColor(int i) {
        this.g.setBackgroundColor(i);
        this.h.setBackgroundColor(i);
    }

    public final void setText(CharSequence charSequence) {
        this.j.setText(charSequence);
    }

    public final void setTextColor(int i) {
        this.j.setTextColor(i);
    }

    public MsgPartExpiredStorySnippet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MsgPartExpiredStorySnippet(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MsgPartExpiredStorySnippet(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MsgPartExpiredStorySnippet(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View view = new View(context);
        view.setVisibility(8);
        view.setAlpha(0.4f);
        view.setImportantForAccessibility(2);
        float f = 2;
        view.setLayoutParams(new FluidHorizontalLayout.a(iah0.a(f), 0));
        this.g = view;
        View view2 = new View(context);
        view2.setVisibility(8);
        view2.setAlpha(0.4f);
        view2.setImportantForAccessibility(2);
        view2.setLayoutParams(new FluidHorizontalLayout.a(iah0.a(f), 0));
        this.h = view2;
        ImageView imageView = new ImageView(context);
        imageView.setContentDescription(context.getString(R.string.vkim_accessibility_story));
        float f2 = 24;
        FluidHorizontalLayout.a aVar = new FluidHorizontalLayout.a(iah0.a(f2), iah0.a(f2));
        aVar.d = 16;
        float f3 = 12;
        aVar.setMarginStart(iah0.a(f3));
        imageView.setLayoutParams(aVar);
        this.i = imageView;
        TextView textView = new TextView(context);
        FluidHorizontalLayout.a aVar2 = new FluidHorizontalLayout.a(-2, -2);
        aVar2.d = 16;
        int a = iah0.a(4);
        textView.setPadding(iah0.a(8), a, iah0.a(f3), a);
        aVar2.a = true;
        textView.setLayoutParams(aVar2);
        b.k(textView, FontFamily.REGULAR, Float.valueOf(13.0f), 4);
        this.j = textView;
        addView(view);
        addView(imageView);
        addView(textView);
        addView(view2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.q, i, i2);
        setLineColor(obtainStyledAttributes.getColor(2, e3m.f(R.attr.vk_legacy_im_forward_line_tint, context)));
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        setIcon(drawable == null ? m33.a(R.drawable.vk_icon_story_outline_28, context) : drawable);
        setTextColor(obtainStyledAttributes.getColor(3, e3m.f(R.attr.vk_legacy_im_service_message_text, context)));
        setIconTint(obtainStyledAttributes.getColor(1, e3m.f(R.attr.vk_legacy_im_service_message_text, context)));
        obtainStyledAttributes.recycle();
    }
}
