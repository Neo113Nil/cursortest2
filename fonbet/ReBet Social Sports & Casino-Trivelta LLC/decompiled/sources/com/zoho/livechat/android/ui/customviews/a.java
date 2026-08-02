package com.zoho.livechat.android.ui.customviews;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;

/* loaded from: classes4.dex */
public class a extends TimePickerDialog {

    /* renamed from: a, reason: collision with root package name */
    public int f44365a;

    /* renamed from: b, reason: collision with root package name */
    public int f44366b;

    /* renamed from: c, reason: collision with root package name */
    public int f44367c;

    /* renamed from: d, reason: collision with root package name */
    public int f44368d;

    /* renamed from: e, reason: collision with root package name */
    public int f44369e;

    /* renamed from: f, reason: collision with root package name */
    public int f44370f;

    public a(Context context, int i10, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, boolean z10) {
        super(context, i10, onTimeSetListener, i11, i12, z10);
        this.f44365a = -1;
        this.f44366b = -1;
        this.f44367c = 100;
        this.f44368d = 100;
        this.f44369e = i11;
        this.f44370f = i12;
    }

    public void a(int i10, int i11) {
        this.f44367c = i10;
        this.f44368d = i11;
    }

    public void b(int i10, int i11) {
        this.f44365a = i10;
        this.f44366b = i11;
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public void onTimeChanged(TimePicker timePicker, int i10, int i11) {
        super.onTimeChanged(timePicker, i10, i11);
        int i12 = this.f44365a;
        if (i10 < i12 || (i10 != i12 ? !(i10 != this.f44367c || i11 <= this.f44368d) : i11 < this.f44366b)) {
            updateTime(this.f44369e, this.f44370f);
        } else {
            this.f44369e = i10;
            this.f44370f = i11;
        }
    }
}
