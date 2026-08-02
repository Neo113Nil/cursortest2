package net.time4j.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes5.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f58080a = new a();

    public static class a implements i {
        @Override // net.time4j.format.i
        public char a(Locale locale) {
            return f(locale).getDecimalSeparator();
        }

        @Override // net.time4j.format.i
        public String b(Locale locale) {
            return locale.getLanguage().equals("ar") ? "\u200f+" : String.valueOf('+');
        }

        @Override // net.time4j.format.i
        public j c(Locale locale) {
            return j.f58081a;
        }

        @Override // net.time4j.format.i
        public String d(Locale locale) {
            return locale.getLanguage().equals("ar") ? "\u200f-" : String.valueOf(f(locale).getMinusSign());
        }

        @Override // net.time4j.format.i
        public char e(Locale locale) {
            return f(locale).getZeroDigit();
        }

        public final DecimalFormatSymbols f(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }

        @Override // net.time4j.format.i
        public Locale[] getAvailableLocales() {
            return DecimalFormatSymbols.getAvailableLocales();
        }
    }

    char a(Locale locale);

    String b(Locale locale);

    j c(Locale locale);

    String d(Locale locale);

    char e(Locale locale);

    Locale[] getAvailableLocales();
}
