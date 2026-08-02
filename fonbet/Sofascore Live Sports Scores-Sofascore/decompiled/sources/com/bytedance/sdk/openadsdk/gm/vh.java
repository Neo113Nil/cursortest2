package com.bytedance.sdk.openadsdk.gm;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh extends View {
    private final int pcc;

    public vh(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.pcc = rj.sf(getContext(), 0.66f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.pcc);
    }

    public vh(Context context) {
        this(context, Color.parseColor("#25000000"));
    }
}
