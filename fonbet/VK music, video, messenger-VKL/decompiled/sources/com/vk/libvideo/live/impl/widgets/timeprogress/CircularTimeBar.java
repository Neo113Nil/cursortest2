package com.vk.libvideo.live.impl.widgets.timeprogress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import xsna.jec;

/* loaded from: classes3.dex */
public class CircularTimeBar extends View {
    public final jec b;

    public CircularTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        jec jecVar = new jec();
        jecVar.b = jec.a.IDLE;
        jecVar.e = -90.0f;
        jecVar.f = true;
        jecVar.i = 7.0f;
        jecVar.k = 13.0f;
        jecVar.m = 3.0f;
        jecVar.q = -16711681;
        jecVar.r = -16711681;
        jecVar.s = -2013265920;
        jecVar.a();
        this.b = jecVar;
        setBackgroundDrawable(jecVar);
    }

    public jec getCircularTimeDrawable() {
        return this.b;
    }
}
