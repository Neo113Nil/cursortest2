package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import l0.AbstractC5338c;
import y0.z;

/* loaded from: classes3.dex */
public class h implements ClockHandView.c, TimePickerView.f, TimePickerView.e, ClockHandView.b, i {

    /* renamed from: a, reason: collision with root package name */
    public final TimePickerView f36463a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeModel f36464b;

    /* renamed from: c, reason: collision with root package name */
    public float f36465c;

    /* renamed from: d, reason: collision with root package name */
    public float f36466d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36467e = false;
    private static final String[] HOUR_CLOCK_VALUES = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] HOUR_CLOCK_24_VALUES = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private static final String[] MINUTE_CLOCK_VALUES = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public class a extends com.google.android.material.timepicker.a {
        public a(Context context, int i10) {
            super(context, i10);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.A0(view.getResources().getString(h.this.f36464b.c(), String.valueOf(h.this.f36464b.d())));
        }
    }

    public class b extends com.google.android.material.timepicker.a {
        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.A0(view.getResources().getString(ia.k.f48536n, String.valueOf(h.this.f36464b.f36405e)));
        }
    }

    public h(TimePickerView timePickerView, TimeModel timeModel) {
        this.f36463a = timePickerView;
        this.f36464b = timeModel;
        h();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        this.f36467e = true;
        TimeModel timeModel = this.f36464b;
        int i10 = timeModel.f36405e;
        int i11 = timeModel.f36404d;
        if (timeModel.f36406f == 10) {
            this.f36463a.F(this.f36466d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) AbstractC5338c.getSystemService(this.f36463a.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                j(12, true);
            }
        } else {
            int round = Math.round(f10);
            if (!z10) {
                this.f36464b.j(((round + 15) / 30) * 5);
                this.f36465c = this.f36464b.f36405e * 6;
            }
            this.f36463a.F(this.f36465c, z10);
        }
        this.f36467e = false;
        l();
        i(i11, i10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    public void b(int i10) {
        this.f36464b.k(i10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i10) {
        j(i10, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f10, boolean z10) {
        if (this.f36467e || z10) {
            return;
        }
        TimeModel timeModel = this.f36464b;
        int i10 = timeModel.f36404d;
        int i11 = timeModel.f36405e;
        int round = Math.round(f10);
        TimeModel timeModel2 = this.f36464b;
        if (timeModel2.f36406f == 12) {
            timeModel2.j((round + 3) / 6);
            this.f36465c = (float) Math.floor(this.f36464b.f36405e * 6);
        } else {
            int i12 = (round + 15) / 30;
            if (timeModel2.f36403c == 1) {
                i12 %= 12;
                if (this.f36463a.B() == 2) {
                    i12 += 12;
                }
            }
            this.f36464b.h(i12);
            this.f36466d = g();
        }
        l();
        i(i10, i11);
    }

    public final String[] f() {
        return this.f36464b.f36403c == 1 ? HOUR_CLOCK_24_VALUES : HOUR_CLOCK_VALUES;
    }

    public final int g() {
        return (this.f36464b.d() * 30) % 360;
    }

    public void h() {
        if (this.f36464b.f36403c == 0) {
            this.f36463a.P();
        }
        this.f36463a.A(this);
        this.f36463a.L(this);
        this.f36463a.K(this);
        this.f36463a.I(this);
        m();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.i
    public void hide() {
        this.f36463a.setVisibility(8);
    }

    public final void i(int i10, int i11) {
        TimeModel timeModel = this.f36464b;
        if (timeModel.f36405e == i11 && timeModel.f36404d == i10) {
            return;
        }
        this.f36463a.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.i
    public void invalidate() {
        this.f36466d = g();
        TimeModel timeModel = this.f36464b;
        this.f36465c = timeModel.f36405e * 6;
        j(timeModel.f36406f, false);
        l();
    }

    public void j(int i10, boolean z10) {
        boolean z11 = i10 == 12;
        this.f36463a.D(z11);
        this.f36464b.f36406f = i10;
        this.f36463a.N(z11 ? MINUTE_CLOCK_VALUES : f(), z11 ? ia.k.f48536n : this.f36464b.c());
        k();
        this.f36463a.F(z11 ? this.f36465c : this.f36466d, z10);
        this.f36463a.C(i10);
        this.f36463a.H(new a(this.f36463a.getContext(), ia.k.f48533k));
        this.f36463a.G(new b(this.f36463a.getContext(), ia.k.f48535m));
    }

    public final void k() {
        TimeModel timeModel = this.f36464b;
        int i10 = 1;
        if (timeModel.f36406f == 10 && timeModel.f36403c == 1 && timeModel.f36404d >= 12) {
            i10 = 2;
        }
        this.f36463a.E(i10);
    }

    public final void l() {
        TimePickerView timePickerView = this.f36463a;
        TimeModel timeModel = this.f36464b;
        timePickerView.R(timeModel.f36407g, timeModel.d(), this.f36464b.f36405e);
    }

    public final void m() {
        n(HOUR_CLOCK_VALUES, "%d");
        n(HOUR_CLOCK_24_VALUES, "%d");
        n(MINUTE_CLOCK_VALUES, "%02d");
    }

    public final void n(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = TimeModel.b(this.f36463a.getResources(), strArr[i10], str);
        }
    }

    @Override // com.google.android.material.timepicker.i
    public void show() {
        this.f36463a.setVisibility(0);
    }
}
