package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.results.R;
import defpackage.lhk;
import defpackage.mc3;
import defpackage.og4;
import defpackage.qfj;
import defpackage.vhh;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class c extends qfj {
    public final TextInputLayout a;
    public final String b;
    public final SimpleDateFormat c;
    public final CalendarConstraints d;
    public final String e;
    public final mc3 f;
    public og4 g;
    public int h = 0;

    public c(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.b = str;
        this.c = simpleDateFormat;
        this.a = textInputLayout;
        this.d = calendarConstraints;
        this.e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f = new mc3(17, this, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.b;
        if (length >= str.length() || editable.length() < this.h) {
            return;
        }
        char charAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(charAt)) {
            return;
        }
        editable.append(charAt);
    }

    @Override // defpackage.qfj, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.h = charSequence.length();
    }

    @Override // defpackage.qfj, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.d;
        TextInputLayout textInputLayout = this.a;
        mc3 mc3Var = this.f;
        textInputLayout.removeCallbacks(mc3Var);
        textInputLayout.removeCallbacks(this.g);
        textInputLayout.setError(null);
        vhh vhhVar = (vhh) this;
        SingleDateSelector singleDateSelector = vhhVar.k;
        singleDateSelector.a = null;
        singleDateSelector.getClass();
        vhhVar.i.b(singleDateSelector.a);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.b.length()) {
            return;
        }
        try {
            Date parse = this.c.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = parse.getTime();
            if (time >= ((DateValidatorPointForward) calendarConstraints.c).a) {
                Calendar c = lhk.c(calendarConstraints.a.a);
                c.set(5, 1);
                if (c.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.b;
                    int i4 = month.e;
                    Calendar c2 = lhk.c(month.a);
                    c2.set(5, i4);
                    if (time <= c2.getTimeInMillis()) {
                        Long valueOf = Long.valueOf(parse.getTime());
                        vhh vhhVar2 = (vhh) this;
                        SingleDateSelector singleDateSelector2 = vhhVar2.k;
                        singleDateSelector2.a = valueOf;
                        singleDateSelector2.getClass();
                        vhhVar2.i.b(singleDateSelector2.a);
                        return;
                    }
                }
            }
            og4 og4Var = new og4(this, time, 0);
            this.g = og4Var;
            textInputLayout.post(og4Var);
        } catch (ParseException unused) {
            textInputLayout.post(mc3Var);
        }
    }
}
