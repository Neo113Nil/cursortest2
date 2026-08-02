package com.vk.voip.ui.asr_online;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.vk.voip.ui.asr_online.AsrOnlineViewHorizontal;
import com.vkontakte.android.R;
import java.util.List;
import xsna.a0k0;
import xsna.bwt0;
import xsna.cn70;
import xsna.e3m;
import xsna.epx;
import xsna.iah0;
import xsna.iew0;
import xsna.mv3;
import xsna.zmp0;
import xsna.zzz;

/* compiled from: AsrOnlineViewHorizontal.kt */
/* loaded from: classes7.dex */
public final class AsrOnlineViewHorizontal extends AsrOnlineView {
    public static final int j = cn70.b(10);
    public static final int k = cn70.b(8);
    public int f;
    public zzz g;
    public float h;
    public int i;

    public AsrOnlineViewHorizontal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 1;
        setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_avatar_overlay, context)));
        bwt0.d(this, 50.0f, (r4 & 2) != 0, (r4 & 4) != 0);
        getSubtitlesTextView().setLines(this.f);
        getSubtitlesTextView().setMaxLines(150);
        setPadding(0, j, 0, k);
        getSubtitlesTextView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.lv3
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = AsrOnlineViewHorizontal.j;
                AsrOnlineViewHorizontal asrOnlineViewHorizontal = AsrOnlineViewHorizontal.this;
                asrOnlineViewHorizontal.f = asrOnlineViewHorizontal.getSubtitlesTextView().getLineCount();
            }
        });
        addOnLayoutChangeListener(new mv3(this, 0));
    }

    private final a0k0 getSlideByOrientation() {
        zzz zzzVar = this.g;
        Float valueOf = zzzVar != null ? Float.valueOf(zzzVar.c()) : null;
        return epx.d(valueOf, 90.0f) ? new a0k0(8388611) : epx.d(valueOf, 270.0f) ? new a0k0(8388613) : new a0k0(8388611);
    }

    @Override // com.vk.voip.ui.asr_online.AsrOnlineView
    public final void b() {
        this.f = 1;
        a0k0 slideByOrientation = getSlideByOrientation();
        slideByOrientation.setDuration(250L);
        slideByOrientation.addTarget(this);
        zmp0.a(this, slideByOrientation);
        bwt0.p0(this, false);
    }

    @Override // com.vk.voip.ui.asr_online.AsrOnlineView
    public final void c(List<iew0> list) {
        super.c(list);
        if (bwt0.K(this)) {
            return;
        }
        a0k0 slideByOrientation = getSlideByOrientation();
        slideByOrientation.setDuration(250L);
        slideByOrientation.addTarget(this);
        zmp0.a(this, slideByOrientation);
        bwt0.p0(this, true);
    }

    @Override // com.vk.voip.ui.asr_online.AsrOnlineView, android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredHeight = (childAt.getMeasuredHeight() * 2) + i4;
                TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                if (textView != null) {
                    i3 = textView.getLineHeight();
                }
                i4 = measuredHeight;
            }
        }
        int i6 = i3 * 4;
        if (i4 < i6) {
            setSubtitlesHeight(i4 - iah0.a(3));
        } else {
            setSubtitlesHeight(i6);
        }
        setMeasuredDimension(measuredWidth, getSubtitlesHeight());
    }

    public final void setOrientationDelegate(zzz zzzVar) {
        this.g = zzzVar;
    }

    @Override // com.vk.voip.ui.asr_online.AsrOnlineView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            this.f = 1;
        }
    }
}
