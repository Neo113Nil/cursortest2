package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.u;
import com.google.android.material.focus.FocusRingDrawable;
import com.sofascore.results.R;
import defpackage.fnl;
import defpackage.he8;
import defpackage.jy0;
import defpackage.lhk;
import defpackage.ng2;
import defpackage.x2a;
import defpackage.xah;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q extends androidx.recyclerview.widget.l {
    public final MaterialCalendar a;

    public q(MaterialCalendar materialCalendar) {
        this.a = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.a.d.f;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        fnl fnlVar = (fnl) uVar;
        MaterialCalendar materialCalendar = this.a;
        int i2 = materialCalendar.d.a.c + i;
        fnlVar.b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = fnlVar.b;
        Context context = textView.getContext();
        textView.setContentDescription(lhk.d().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        ng2 ng2Var = materialCalendar.g;
        Calendar d = lhk.d();
        jy0 jy0Var = (jy0) (d.get(1) == i2 ? ng2Var.f : ng2Var.d);
        Iterator it = ((SingleDateSelector) materialCalendar.c).a().iterator();
        while (it.hasNext()) {
            d.setTimeInMillis(((Long) it.next()).longValue());
            if (d.get(1) == i2) {
                jy0Var = (jy0) ng2Var.e;
            }
        }
        jy0Var.g(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Context context2 = textView.getContext();
            Drawable foreground = textView.getForeground();
            ColorDrawable colorDrawable = FocusRingDrawable.p;
            if (x2a.L(context2.getTheme(), R.attr.focusRingsEnabled, false)) {
                foreground = new FocusRingDrawable(context2, foreground);
            }
            if (foreground instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) foreground;
                xah xahVar = (xah) jy0Var.f;
                he8 he8Var = focusRingDrawable.o;
                he8Var.t = xahVar;
                he8Var.p = ((Rect) jy0Var.b).top;
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(jy0Var == ((jy0) ng2Var.e));
        textView.setOnClickListener(new p(this, i2));
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new fnl((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
