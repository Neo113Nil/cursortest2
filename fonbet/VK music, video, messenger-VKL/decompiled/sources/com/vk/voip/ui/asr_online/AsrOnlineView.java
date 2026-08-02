package com.vk.voip.ui.asr_online;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dhr0;
import xsna.i5s;
import xsna.iah0;
import xsna.iew0;
import xsna.wk;

/* compiled from: AsrOnlineView.kt */
/* loaded from: classes7.dex */
public class AsrOnlineView extends ScrollView {
    public static final /* synthetic */ int e = 0;
    public TextView b;
    public boolean c;
    public int d;

    public AsrOnlineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVerticalScrollBarEnabled(false);
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = iah0.a(16);
        layoutParams.leftMargin = iah0.a(12);
        textView.setLayoutParams(layoutParams);
        textView.setLines(3);
        textView.setTextAppearance(R.style.VkLegacyTypography_Text);
        textView.setMaxLines(150);
        this.b = textView;
        addView(textView);
    }

    public final void a(List<iew0> list) {
        if (list.isEmpty()) {
            b();
        } else {
            c(list);
        }
    }

    public void b() {
        this.b.setText("");
    }

    public void c(List<iew0> list) {
        int lineCount;
        if (this.b.getLineCount() == 150 && this.b.getLineCount() - 5 > 0) {
            for (int i = 0; i < lineCount; i++) {
                this.b.getEditableText().delete(this.b.getLayout().getLineStart(0), this.b.getLayout().getLineEnd(0));
            }
        }
        this.b.setText("");
        boolean z = false;
        for (iew0 iew0Var : list) {
            if (z) {
                this.b.append("\n");
            }
            String a = i5s.a(new StringBuilder(), iew0Var.a, ": ");
            SpannableString spannableString = new SpannableString(a);
            spannableString.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_subhead)), 0, a.length(), 33);
            this.b.append(spannableString);
            String str = iew0Var.b;
            SpannableString spannableString2 = new SpannableString(str);
            spannableString2.setSpan(new ForegroundColorSpan(getContext().getColor(R.color.vk_gray_100)), 0, str.length(), 33);
            this.b.append(spannableString2);
            z = true;
        }
        this.b.post(new wk(this, 1));
    }

    public final int getSubtitlesHeight() {
        return this.d;
    }

    public final SpannableStringBuilder getSubtitlesTextSpannable() {
        CharSequence text = this.b.getText();
        if (text instanceof SpannableStringBuilder) {
            return (SpannableStringBuilder) text;
        }
        return null;
    }

    public final TextView getSubtitlesTextView() {
        return this.b;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                i3 = childAt.getMeasuredHeight() + i3;
            }
        }
        if (this.d == 0) {
            this.d = i3;
        }
        setMeasuredDimension(measuredWidth, this.d - iah0.a(3));
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() == 0 ? this.c && super.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void setScrollingEnabled(boolean z) {
        this.c = z;
    }

    public final void setSubtitlesHeight(int i) {
        this.d = i;
    }

    public final void setSubtitlesTextView(TextView textView) {
        this.b = textView;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            this.b.setText("");
        }
    }
}
