package org.chromium.base;

import android.os.LocaleList;
import android.text.TextUtils;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class LocaleUtils {
    private LocaleUtils() {
    }

    public static String a(Locale locale) {
        String language;
        language = locale.getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                language = "id";
                break;
            case "iw":
                language = "he";
                break;
            case "ji":
                language = "yi";
                break;
            case "jw":
                language = "jv";
                break;
            case "tl":
                language = "fil";
                break;
            case "gom":
                language = "kok";
                break;
        }
        String country = locale.getCountry();
        return (language.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) ? "nn-NO" : country.isEmpty() ? language : G.g.c(language, "-", country);
    }

    @CalledByNative
    public static String getDefaultCountryCode() {
        String c11 = c.b().c("default-country-code");
        return c11 != null ? c11 : Locale.getDefault().getCountry();
    }

    @CalledByNative
    public static String getDefaultLocaleListString() {
        String language;
        String str;
        LocaleList localeList = LocaleList.getDefault();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < localeList.size(); i11++) {
            Locale locale = localeList.get(i11);
            language = locale.getLanguage();
            language.getClass();
            switch (language) {
                case "in":
                    str = "id";
                    break;
                case "iw":
                    str = "he";
                    break;
                case "ji":
                    str = "yi";
                    break;
                case "jw":
                    str = "jv";
                    break;
                case "tl":
                    str = "fil";
                    break;
                case "gom":
                    str = "kok";
                    break;
                default:
                    str = language;
                    break;
            }
            if (!str.equals(language)) {
                locale = new Locale.Builder().setLocale(locale).setLanguage(str).build();
            }
            arrayList.add(a(locale));
        }
        return TextUtils.join(",", arrayList);
    }

    @CalledByNative
    public static String getDefaultLocaleString() {
        return a(Locale.getDefault());
    }
}
