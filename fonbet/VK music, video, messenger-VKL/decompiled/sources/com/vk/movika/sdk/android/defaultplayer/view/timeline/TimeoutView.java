package com.vk.movika.sdk.android.defaultplayer.view.timeline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import java.util.LinkedList;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes3.dex */
public final class TimeoutView extends FrameLayout {
    public TimeoutCropView b;
    public TimeoutCropView c;
    public final LinkedList<gzs<s3q0>> d;

    public TimeoutView(Context context) {
        super(context);
        this.d = new LinkedList<>();
        a();
    }

    public final void a() {
        View.inflate(getContext(), R.layout.mie_timeout_layout, this);
        this.b = (TimeoutCropView) findViewById(R.id.left_timeout_view);
        this.c = (TimeoutCropView) findViewById(R.id.right_timeout_view);
        TimeoutCropView timeoutCropView = this.b;
        if (timeoutCropView != null) {
            timeoutCropView.setOnAnimationEndListener(new a(this, 0));
        }
    }

    public float getPercent() {
        return this.b.getProgress();
    }

    public void setPercent(float f) {
        this.b.setPercent(f);
        this.c.setPercent(f);
    }

    public TimeoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new LinkedList<>();
        a();
    }

    public TimeoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new LinkedList<>();
        a();
    }

    public TimeoutView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = new LinkedList<>();
        a();
    }
}
