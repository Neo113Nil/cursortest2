package com.vk.core.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.links.LinkedTextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.cn70;
import xsna.gp10;
import xsna.jno0;
import xsna.ozl;
import xsna.qjc;
import xsna.rlc;
import xsna.tr;

/* compiled from: ExpandableTextViewGroup.kt */
@ozl
/* loaded from: classes17.dex */
public final class ExpandableTextViewGroup extends ViewGroup {
    public static final /* synthetic */ int i = 0;
    public final LinkedTextView b;
    public final LinkedTextView c;
    public int d;
    public boolean e;
    public qjc.a f;
    public final a g;
    public ValueAnimator h;

    public ExpandableTextViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        LinkedTextView linkedTextView = this.b;
        int maxLines = linkedTextView.getMaxLines();
        int i2 = this.d;
        if (maxLines != i2) {
            linkedTextView.setMaxLines(i2);
        }
    }

    public final void b() {
        LinkedTextView linkedTextView = this.b;
        if (linkedTextView.getMaxLines() != Integer.MAX_VALUE) {
            linkedTextView.setMaxLines(Integer.MAX_VALUE);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -2);
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinkedTextView linkedTextView = this.b;
        int measuredWidth = linkedTextView.getMeasuredWidth() + paddingLeft;
        int measuredHeight = linkedTextView.getMeasuredHeight() + paddingTop;
        linkedTextView.layout(paddingLeft, paddingTop, measuredWidth, measuredHeight);
        boolean z2 = this.e;
        LinkedTextView linkedTextView2 = this.c;
        if (z2) {
            linkedTextView2.layout(paddingLeft, measuredHeight, linkedTextView2.getMeasuredWidth() + paddingLeft, linkedTextView2.getMeasuredHeight() + measuredHeight);
        } else {
            linkedTextView2.layout(0, 0, 0, 0);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int size = View.MeasureSpec.getSize(i2);
        int a2 = gp10.a(i2, suggestedMinimumWidth, size, paddingRight);
        int i4 = 0;
        int a3 = tr.a(a2, 1073741823, 0, 1073741824);
        int a4 = tr.a(0, 1073741823, 0, 0);
        LinkedTextView linkedTextView = this.b;
        linkedTextView.measure(a3, a4);
        Layout layout = linkedTextView.getLayout();
        if (layout != null) {
            z = true;
            for (int lineCount = layout.getLineCount() - 1; -1 < lineCount; lineCount--) {
                if (layout.getEllipsisCount(lineCount) > 0) {
                    break;
                }
            }
        }
        z = false;
        this.e = z;
        int measuredHeight = linkedTextView.getMeasuredHeight();
        if (this.e) {
            int a5 = tr.a(a2, 1073741823, 0, Integer.MIN_VALUE);
            int a6 = tr.a(0, 1073741823, 0, 0);
            LinkedTextView linkedTextView2 = this.c;
            linkedTextView2.measure(a5, a6);
            i4 = linkedTextView2.getMeasuredHeight() + ((int) linkedTextView.getLineSpacingExtra());
        }
        setMeasuredDimension(size, View.MeasureSpec.getMode(i3) == 1073741824 ? View.MeasureSpec.getSize(i3) : paddingBottom + measuredHeight + i4);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.b.setContentDescription(charSequence);
    }

    public final void setExpandText(CharSequence charSequence) {
        LinkedTextView linkedTextView = this.c;
        if (charSequence == null) {
            linkedTextView.setText(charSequence);
            return;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(this.g, 0, charSequence.length(), 17);
        linkedTextView.setText(spannableString);
    }

    public final void setMaxLines(int i2) {
        this.d = i2;
    }

    public final void setOnExpandClickListener(qjc.a aVar) {
        this.f = aVar;
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTextIsSelectable(boolean z) {
        this.b.setTextIsSelectable(z);
    }

    public ExpandableTextViewGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, (i2 & 2) != 0 ? null : attributeSet, 0);
        LinkedTextView linkedTextView = new LinkedTextView(context, null, 6, 0);
        this.b = linkedTextView;
        LinkedTextView linkedTextView2 = new LinkedTextView(context, null, 6, 0);
        this.c = linkedTextView2;
        this.d = Integer.MAX_VALUE;
        this.g = new a();
        linkedTextView.setDuplicateParentStateEnabled(true);
        linkedTextView.setLinksClickable(false);
        jno0.c(linkedTextView, R.attr.vk_ui_text_primary);
        linkedTextView.setTextDirection(5);
        linkedTextView.setCanShowMessageOptions(true);
        linkedTextView.setHyphenationFrequency(0);
        linkedTextView.setLineSpacing(cn70.a() * 2.0f, 1.0f);
        FontFamily fontFamily = FontFamily.REGULAR;
        Float valueOf = Float.valueOf(15.0f);
        com.vk.typography.b.k(linkedTextView, fontFamily, valueOf, 4);
        linkedTextView.setEllipsize(TextUtils.TruncateAt.END);
        linkedTextView2.setDuplicateParentStateEnabled(true);
        linkedTextView2.setLinksClickable(false);
        jno0.c(linkedTextView2, R.attr.vk_ui_text_primary);
        linkedTextView2.setTextDirection(5);
        linkedTextView2.setCanShowMessageOptions(true);
        linkedTextView2.setHyphenationFrequency(0);
        awt0.x(linkedTextView2, 0, cn70.b(8), 0, 0, 13);
        com.vk.typography.b.k(linkedTextView2, FontFamily.MEDIUM, valueOf, 4);
        addView(linkedTextView);
        addView(linkedTextView2);
    }

    /* compiled from: ExpandableTextViewGroup.kt */
    public final class a extends qjc {
        public a() {
            super(null);
            this.b = true;
        }

        @Override // xsna.rku0
        public final void f(Context context, View view) {
            ExpandableTextViewGroup expandableTextViewGroup = ExpandableTextViewGroup.this;
            qjc.a aVar = expandableTextViewGroup.f;
            if (aVar != null) {
                aVar.I(null);
            }
            LinkedTextView linkedTextView = expandableTextViewGroup.b;
            int height = expandableTextViewGroup.getHeight();
            ViewGroup.LayoutParams layoutParams = expandableTextViewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = height;
            }
            expandableTextViewGroup.b();
            linkedTextView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(linkedTextView.getMeasuredWidth(), 1073741823)), 1073741824), tr.a(0, 1073741823, 0, 0));
            ValueAnimator ofInt = ValueAnimator.ofInt(height, expandableTextViewGroup.getPaddingBottom() + expandableTextViewGroup.getPaddingTop() + linkedTextView.getMeasuredHeight());
            ofInt.addUpdateListener(new rlc(expandableTextViewGroup, 1));
            ofInt.setDuration(250L);
            ofInt.start();
            expandableTextViewGroup.h = ofInt;
        }

        @Override // xsna.rku0
        public final void a(Context context, View view) {
        }
    }
}
