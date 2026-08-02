package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public abstract class e extends xa.k {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f35306a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35307b;

    /* renamed from: c, reason: collision with root package name */
    public final DateFormat f35308c;

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f35309d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35310e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f35311f;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f35312g;

    /* renamed from: h, reason: collision with root package name */
    public int f35313h = 0;

    public e(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f35307b = str;
        this.f35308c = dateFormat;
        this.f35306a = textInputLayout;
        this.f35309d = calendarConstraints;
        this.f35310e = textInputLayout.getContext().getString(ia.k.f48509O);
        this.f35311f = new Runnable() { // from class: com.google.android.material.datepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                e.b(e.this, str);
            }
        };
    }

    public static /* synthetic */ void a(e eVar, long j10) {
        eVar.getClass();
        eVar.f35306a.setError(String.format(eVar.f35310e, eVar.g(h.a(j10))));
        eVar.d();
    }

    public static /* synthetic */ void b(e eVar, String str) {
        TextInputLayout textInputLayout = eVar.f35306a;
        DateFormat dateFormat = eVar.f35308c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(ia.k.f48504J) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + String.format(context.getString(ia.k.f48506L), eVar.g(str)) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + String.format(context.getString(ia.k.f48505K), eVar.g(dateFormat.format(new Date(w.k().getTimeInMillis())))));
        eVar.d();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f35307b.length() && editable.length() >= this.f35313h) {
            char charAt = this.f35307b.charAt(editable.length());
            if (Character.isLetterOrDigit(charAt)) {
                return;
            }
            editable.append(charAt);
        }
    }

    @Override // xa.k, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f35313h = charSequence.length();
    }

    public final Runnable c(final long j10) {
        return new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                e.a(e.this, j10);
            }
        };
    }

    public abstract void d();

    public abstract void e(Long l10);

    public void f(View view, Runnable runnable) {
        view.post(runnable);
    }

    public final String g(String str) {
        return str.replace(' ', Typography.nbsp);
    }

    @Override // xa.k, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f35306a.removeCallbacks(this.f35311f);
        this.f35306a.removeCallbacks(this.f35312g);
        this.f35306a.setError(null);
        e(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f35307b.length()) {
            return;
        }
        try {
            Date parse = this.f35308c.parse(charSequence.toString());
            this.f35306a.setError(null);
            long time = parse.getTime();
            if (this.f35309d.g().isValid(time) && this.f35309d.J(time)) {
                e(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable c10 = c(time);
            this.f35312g = c10;
            f(this.f35306a, c10);
        } catch (ParseException unused) {
            f(this.f35306a, this.f35311f);
        }
    }
}
