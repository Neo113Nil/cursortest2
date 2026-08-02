package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Locale;
import java.util.WeakHashMap;
import xsna.am;
import xsna.b0u0;
import xsna.iut0;
import xsna.ruo0;
import xsna.yic;

/* compiled from: TimePickerClockPresenter.java */
/* loaded from: classes13.dex */
public final class c implements ClockHandView.b, ruo0 {
    public static final String[] g = {"12", "1", "2", "3", "4", CampaignEx.CLICKMODE_ON, "6", Gc.e, "8", "9", "10", "11"};
    public static final String[] h = {"00", "1", "2", "3", "4", CampaignEx.CLICKMODE_ON, "6", Gc.e, "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    public static final String[] i = {"00", CampaignEx.CLICKMODE_ON, "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public final TimePickerView b;
    public final TimeModel c;
    public float d;
    public float e;
    public boolean f = false;

    /* compiled from: TimePickerClockPresenter.java */
    public class a extends yic {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // xsna.yic, xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            Resources resources = view.getResources();
            TimeModel timeModel = c.this.c;
            amVar.r(resources.getString(timeModel.d == 1 ? R$string.material_hour_24h_suffix : R$string.material_hour_suffix, String.valueOf(timeModel.d())));
        }
    }

    /* compiled from: TimePickerClockPresenter.java */
    public class b extends yic {
        public b(Context context, int i) {
            super(context, i);
        }

        @Override // xsna.yic, xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            amVar.r(view.getResources().getString(R$string.material_minute_suffix, String.valueOf(c.this.c.f)));
        }
    }

    public c(TimePickerView timePickerView, TimeModel timeModel) {
        this.b = timePickerView;
        this.c = timeModel;
        if (timeModel.d == 0) {
            timePickerView.x.setVisibility(0);
        }
        timePickerView.v.k.add(this);
        timePickerView.z = this;
        timePickerView.y = this;
        timePickerView.v.s = this;
        for (int i2 = 0; i2 < 12; i2++) {
            Resources resources = this.b.getResources();
            String[] strArr = g;
            strArr[i2] = TimeModel.a(resources, strArr[i2], "%d");
        }
        for (int i3 = 0; i3 < 12; i3++) {
            Resources resources2 = this.b.getResources();
            String[] strArr2 = i;
            strArr2[i3] = TimeModel.a(resources2, strArr2[i3], "%02d");
        }
        invalidate();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public final void Y1(float f, boolean z) {
        if (this.f) {
            return;
        }
        TimeModel timeModel = this.c;
        int i2 = timeModel.e;
        int i3 = timeModel.f;
        int round = Math.round(f);
        int i4 = timeModel.g;
        TimePickerView timePickerView = this.b;
        if (i4 == 12) {
            timeModel.f((round + 3) / 6);
            this.d = (float) Math.floor(timeModel.f * 6);
        } else {
            int i5 = (round + 15) / 30;
            if (timeModel.d == 1) {
                i5 %= 12;
                if (timePickerView.w.w.v == 2) {
                    i5 += 12;
                }
            }
            timeModel.e(i5);
            this.e = (timeModel.d() * 30) % 360;
        }
        if (z) {
            return;
        }
        b();
        if (timeModel.f == i3 && timeModel.e == i2) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    public final void a(int i2, boolean z) {
        boolean z2 = i2 == 12;
        TimePickerView timePickerView = this.b;
        ClockHandView clockHandView = timePickerView.v;
        Chip chip = timePickerView.u;
        Chip chip2 = timePickerView.t;
        ClockFaceView clockFaceView = timePickerView.w;
        clockHandView.e = z2;
        TimeModel timeModel = this.c;
        timeModel.g = i2;
        int i3 = timeModel.d;
        clockFaceView.T4(z2 ? R$string.material_minute_suffix : i3 == 1 ? R$string.material_hour_24h_suffix : R$string.material_hour_suffix, z2 ? i : i3 == 1 ? h : g);
        int i4 = (timeModel.g == 10 && i3 == 1 && timeModel.e >= 12) ? 2 : 1;
        ClockHandView clockHandView2 = clockFaceView.w;
        clockHandView2.v = i4;
        clockHandView2.invalidate();
        timePickerView.v.c(z2 ? this.d : this.e, z);
        boolean z3 = i2 == 12;
        chip2.setChecked(z3);
        int i5 = z3 ? 2 : 0;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        chip2.setAccessibilityLiveRegion(i5);
        boolean z4 = i2 == 10;
        chip.setChecked(z4);
        chip.setAccessibilityLiveRegion(z4 ? 2 : 0);
        iut0.q(chip, new a(timePickerView.getContext(), R$string.material_hour_selection));
        iut0.q(chip2, new b(timePickerView.getContext(), R$string.material_minute_selection));
    }

    public final void b() {
        TimeModel timeModel = this.c;
        int i2 = timeModel.h;
        int d = timeModel.d();
        int i3 = timeModel.f;
        TimePickerView timePickerView = this.b;
        Chip chip = timePickerView.u;
        Chip chip2 = timePickerView.t;
        timePickerView.x.b(i2 == 1 ? R$id.material_clock_period_pm_button : R$id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(i3));
        String format2 = String.format(locale, "%02d", Integer.valueOf(d));
        if (!TextUtils.equals(chip2.getText(), format)) {
            chip2.setText(format);
        }
        if (TextUtils.equals(chip.getText(), format2)) {
            return;
        }
        chip.setText(format2);
    }

    @Override // xsna.ruo0
    public final void hide() {
        this.b.setVisibility(8);
    }

    @Override // xsna.ruo0
    public final void invalidate() {
        TimeModel timeModel = this.c;
        this.e = (timeModel.d() * 30) % 360;
        this.d = timeModel.f * 6;
        a(timeModel.g, false);
        b();
    }

    @Override // xsna.ruo0
    public final void show() {
        this.b.setVisibility(0);
    }
}
