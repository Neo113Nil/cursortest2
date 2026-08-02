package com.henninghall.date_picker;

import com.henninghall.date_picker.f;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import vi.AbstractC6692a;

/* loaded from: classes3.dex */
public abstract class h {
    public static String a(String str) {
        return e(str, f.c.d);
    }

    public static String b(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateInstance(0, locale)).toLocalizedPattern().replaceAll(",", "").replaceAll("([a-zA-Z]+)", " $1").trim();
    }

    public static String c(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateTimeInstance(0, 0, locale)).toLocalizedPattern().replace(",", "");
    }

    public static String d(String str) {
        return e(str, f.c.MMMEd);
    }

    public static String e(String str, f.c cVar) {
        try {
            try {
                return f.b(str, cVar);
            } catch (f.d unused) {
                return f.b(str.substring(0, str.indexOf("_")), cVar);
            }
        } catch (f.d | IndexOutOfBoundsException unused2) {
            return (String) f.f38479a.get(cVar);
        }
    }

    public static Locale f(String str) {
        try {
            return AbstractC6692a.e(str);
        } catch (Exception unused) {
            return AbstractC6692a.e(str.substring(0, str.indexOf("_")));
        }
    }

    public static String g(String str) {
        return e(str, f.c.y);
    }

    public static boolean h(Locale locale) {
        DateFormat timeInstance = DateFormat.getTimeInstance(0, locale);
        return (timeInstance instanceof SimpleDateFormat) && ((SimpleDateFormat) timeInstance).toPattern().contains("a");
    }
}
