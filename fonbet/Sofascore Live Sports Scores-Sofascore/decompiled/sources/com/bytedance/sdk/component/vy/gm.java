package com.bytedance.sdk.component.vy;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gm implements View.OnTouchListener {
    private ViewConfiguration pcc;
    private int sf = -1;

    public abstract void pcc(View.OnTouchListener onTouchListener);

    public boolean pcc(float f, float f2, float f3, float f4, Context context) {
        ViewConfiguration viewConfiguration = this.pcc;
        if (viewConfiguration == null) {
            viewConfiguration = ViewConfiguration.get(context);
            this.pcc = viewConfiguration;
        }
        if (this.sf == -1) {
            this.sf = viewConfiguration.getScaledTouchSlop();
        }
        return Math.abs(f - f3) <= ((float) this.sf) && Math.abs(f2 - f4) <= ((float) this.sf);
    }
}
