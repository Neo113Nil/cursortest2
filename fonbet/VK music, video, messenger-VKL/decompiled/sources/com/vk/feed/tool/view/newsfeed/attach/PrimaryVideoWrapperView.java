package com.vk.feed.tool.view.newsfeed.attach;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import xsna.b76;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: PrimaryVideoWrapperView.kt */
/* loaded from: classes18.dex */
public final class PrimaryVideoWrapperView extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public boolean b;
    public wzs<? super Float, ? super Float, s3q0> c;

    public PrimaryVideoWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new b76((byte) 0, 3);
        setId(R.id.primary_video_wrap);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.b) {
            this.c.invoke(Float.valueOf(size2), Float.valueOf(size));
        }
        super.onMeasure(i, i2);
    }

    public final void setUpdateRatioCallback(wzs<? super Float, ? super Float, s3q0> wzsVar) {
        this.c = wzsVar;
    }
}
