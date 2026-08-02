package com.google.android.material.datepicker;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class h {
    public static String a(long j10) {
        return b(j10, null);
    }

    public static String b(long j10, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j10)) : o(j10) ? d(j10) : k(j10);
    }

    public static String c(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String h10 = h(j10);
        if (z10) {
            h10 = String.format(context.getString(ia.k.f48514T), h10);
        }
        return z11 ? String.format(context.getString(ia.k.f48510P), h10) : z12 ? String.format(context.getString(ia.k.f48503I), h10) : h10;
    }

    public static String d(long j10) {
        return e(j10, Locale.getDefault());
    }

    public static String e(long j10, Locale locale) {
        return w.b(locale).format(new Date(j10));
    }

    public static String f(long j10) {
        return g(j10, Locale.getDefault());
    }

    public static String g(long j10, Locale locale) {
        return w.h(locale).format(new Date(j10));
    }

    public static String h(long j10) {
        return o(j10) ? f(j10) : m(j10);
    }

    public static String i(Context context, int i10) {
        return w.k().get(1) == i10 ? String.format(context.getString(ia.k.f48507M), Integer.valueOf(i10)) : String.format(context.getString(ia.k.f48508N), Integer.valueOf(i10));
    }

    public static String j(long j10) {
        return w.p(Locale.getDefault()).format(new Date(j10));
    }

    public static String k(long j10) {
        return l(j10, Locale.getDefault());
    }

    public static String l(long j10, Locale locale) {
        return w.o(locale).format(new Date(j10));
    }

    public static String m(long j10) {
        return n(j10, Locale.getDefault());
    }

    public static String n(long j10, Locale locale) {
        return w.q(locale).format(new Date(j10));
    }

    public static boolean o(long j10) {
        Calendar k10 = w.k();
        Calendar m10 = w.m();
        m10.setTimeInMillis(j10);
        return k10.get(1) == m10.get(1);
    }
}
