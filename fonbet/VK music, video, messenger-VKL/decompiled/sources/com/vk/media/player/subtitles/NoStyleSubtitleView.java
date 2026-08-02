package com.vk.media.player.subtitles;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.view.subtitles.BaseSubtitleView;
import xsna.c5g;
import xsna.f4m;
import xsna.iah0;
import xsna.j5g;

/* compiled from: NoStyleSubtitleView.kt */
/* loaded from: classes3.dex */
public final class NoStyleSubtitleView extends BaseSubtitleView {
    public final AppCompatTextView h;
    public float i;
    public int j;
    public int k;
    public int l;
    public int m;
    public Integer n;
    public Float o;

    public NoStyleSubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 12, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet);
        this.h = appCompatTextView;
        this.k = 4;
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        int a = iah0.a(8);
        int a2 = iah0.a(4);
        appCompatTextView.setPadding(a, a2, a, a2);
        a(getDefaultTextColor(), getDefaultBackgroundColor());
        b();
        setRenderItems(null);
        addView(appCompatTextView);
    }

    private final float getHorizontalMarginPercent() {
        Float f = this.o;
        return f != null ? f.floatValue() : this.i;
    }

    public final void a(int i, int i2) {
        AppCompatTextView appCompatTextView = this.h;
        appCompatTextView.setTextColor(i);
        float a = iah0.a(this.k);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{a, a, a, a, a, a, a, a}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        appCompatTextView.setBackground(shapeDrawable);
    }

    public final void b() {
        this.h.setTextSize(0, getResources().getDimension(R.dimen.subtitles_text_size));
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.subtitles_horizontal_margin_percent, typedValue, true);
        this.i = typedValue.getFloat();
        this.j = (int) getResources().getDimension(R.dimen.subtitles_bottom_margin);
        requestLayout();
    }

    public final Integer getBottomMarginOverride() {
        return this.n;
    }

    public final Float getHorizontalMarginPercentOverride() {
        return this.o;
    }

    public final TextView getTextView() {
        return this.h;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        AppCompatTextView appCompatTextView = this.h;
        int measuredHeight = appCompatTextView.getMeasuredHeight();
        int measuredWidth = appCompatTextView.getMeasuredWidth();
        int horizontalMarginPercent = (int) (i5 * getHorizontalMarginPercent());
        int max = Math.max(horizontalMarginPercent, this.l);
        int max2 = Math.max(horizontalMarginPercent, this.m);
        Integer num = this.n;
        int intValue = num != null ? num.intValue() : this.j;
        if (getLayoutDirection() == 1) {
            max = max2;
        }
        appCompatTextView.layout(max, (i6 - measuredHeight) - intValue, measuredWidth + max, i6 - intValue);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int horizontalMarginPercent = (int) (size * getHorizontalMarginPercent());
        int max = (size - Math.max(horizontalMarginPercent, this.l)) - Math.max(horizontalMarginPercent, this.m);
        AppCompatTextView appCompatTextView = this.h;
        int measuredWidth = appCompatTextView.getMeasuredWidth();
        if (max > measuredWidth) {
            max = measuredWidth;
        }
        appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
    }

    public final void setBackgroundRoundRadius(int i) {
        this.k = i;
    }

    public final void setBottomMarginOverride(Integer num) {
        this.n = num;
    }

    public final void setHorizontalMarginPercentOverride(Float f) {
        this.o = f;
    }

    @Override // one.video.view.subtitles.BaseSubtitleView
    public void setRenderItems(List<? extends SubtitleRenderItem> list) {
        String str;
        super.setRenderItems(list);
        if (list != null) {
            List<? extends SubtitleRenderItem> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((SubtitleRenderItem) it.next()).b);
            }
            str = j5g.g0(arrayList, "\n", null, null, 0, null, 62);
        } else {
            str = null;
        }
        AppCompatTextView appCompatTextView = this.h;
        if (str == null || str.length() == 0) {
            f4m.j(appCompatTextView);
        } else {
            appCompatTextView.setVisibility(0);
        }
        appCompatTextView.setText(str);
        requestLayout();
    }
}
