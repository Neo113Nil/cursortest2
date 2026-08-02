package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import xsna.axk;
import xsna.kgb;
import xsna.l2r0;
import xsna.otj0;
import xsna.sno0;

/* compiled from: DateFormatTextWatcher.java */
/* loaded from: classes13.dex */
public abstract class a extends sno0 {

    @NonNull
    public final TextInputLayout b;
    public final String c;
    public final SimpleDateFormat d;
    public final CalendarConstraints e;
    public final String f;
    public final kgb g;
    public axk h;
    public int i = 0;

    public a(String str, SimpleDateFormat simpleDateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.c = str;
        this.d = simpleDateFormat;
        this.b = textInputLayout;
        this.e = calendarConstraints;
        this.f = textInputLayout.getContext().getString(R$string.mtrl_picker_out_of_range);
        this.g = new kgb(2, this, str);
    }

    @Override // xsna.sno0, android.text.TextWatcher
    public final void afterTextChanged(@NonNull Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.c;
        if (length >= str.length() || editable.length() < this.i) {
            return;
        }
        char charAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(charAt)) {
            return;
        }
        editable.append(charAt);
    }

    @Override // xsna.sno0, android.text.TextWatcher
    public final void beforeTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        this.i = charSequence.length();
    }

    @Override // xsna.sno0, android.text.TextWatcher
    public final void onTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.e;
        TextInputLayout textInputLayout = this.b;
        kgb kgbVar = this.g;
        textInputLayout.removeCallbacks(kgbVar);
        textInputLayout.removeCallbacks(this.h);
        textInputLayout.setError(null);
        otj0 otj0Var = (otj0) this;
        otj0Var.l.b = null;
        otj0Var.j.b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.c.length()) {
            return;
        }
        try {
            Date parse = this.d.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = parse.getTime();
            if (calendarConstraints.d.Z6(time)) {
                Calendar c = l2r0.c(calendarConstraints.b.b);
                c.set(5, 1);
                if (c.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.c;
                    int i4 = month.f;
                    Calendar c2 = l2r0.c(month.b);
                    c2.set(5, i4);
                    if (time <= c2.getTimeInMillis()) {
                        Long valueOf = Long.valueOf(parse.getTime());
                        otj0 otj0Var2 = (otj0) this;
                        otj0Var2.l.b = valueOf;
                        otj0Var2.j.b(valueOf);
                        return;
                    }
                }
            }
            axk axkVar = new axk(this, time, 0);
            this.h = axkVar;
            textInputLayout.post(axkVar);
        } catch (ParseException unused) {
            textInputLayout.post(kgbVar);
        }
    }
}
