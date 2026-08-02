package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import defpackage.bsk;
import defpackage.ork;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n extends u {
    public final TextView b;
    public final MaterialCalendarGridView c;

    public n(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.b = textView;
        WeakHashMap weakHashMap = bsk.a;
        new ork(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(textView, Boolean.TRUE);
        this.c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
