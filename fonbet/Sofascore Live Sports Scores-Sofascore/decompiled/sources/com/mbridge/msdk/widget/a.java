package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class a implements View.OnClickListener {
    private long a = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.a > 2000) {
            this.a = timeInMillis;
            a(view);
        }
    }
}
