package org.chromium.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes10.dex */
public class LocaleUtils {
    private LocaleUtils() {
    }

    public static String getUpdatedLanguageForChromium(String language) {
        language.hashCode();
        switch (language) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "jw":
                return "jv";
            case "tl":
                return "fil";
            case "gom":
                return "kok";
            default:
                return language;
        }
    }

    public static Locale getUpdatedLocaleForChromium(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(language);
        return updatedLanguageForChromium.equals(language) ? locale : new Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForChromium).build();
    }

    public static String getUpdatedLanguageForAndroid(String language) {
        language.hashCode();
        if (language.equals("fil")) {
            return "tl";
        }
        return !language.equals(C.LANGUAGE_UNDETERMINED) ? language : "";
    }

    public static Locale getUpdatedLocaleForAndroid(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForAndroid = getUpdatedLanguageForAndroid(language);
        return updatedLanguageForAndroid.equals(language) ? locale : new Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForAndroid).build();
    }

    public static Locale forLanguageTag(String languageTag) {
        return getUpdatedLocaleForAndroid(Locale.forLanguageTag(languageTag));
    }

    public static String toLanguageTag(Locale locale) {
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(locale.getLanguage());
        String country = locale.getCountry();
        if (updatedLanguageForChromium.equals(SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO) && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (country.isEmpty()) {
            return updatedLanguageForChromium;
        }
        return updatedLanguageForChromium + "-" + country;
    }

    public static String toLanguageTags(LocaleList localeList) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(toLanguageTag(getUpdatedLocaleForChromium(localeList.get(i))));
        }
        return TextUtils.join(",", arrayList);
    }

    public static String toBaseLanguage(String languageTag) {
        int indexOf = languageTag.indexOf(45);
        return indexOf < 0 ? languageTag : languageTag.substring(0, indexOf);
    }

    public static boolean isBaseLanguageEqual(String first, String second) {
        return TextUtils.equals(toBaseLanguage(first), toBaseLanguage(second));
    }

    public static String getDefaultLocaleString() {
        return toLanguageTag(Locale.getDefault());
    }

    public static String getDefaultLocaleListString() {
        return toLanguageTags(LocaleList.getDefault());
    }

    public static String getDefaultCountryCode() {
        String switchValue = CommandLine.getInstance().getSwitchValue(BaseSwitches.DEFAULT_COUNTRY_CODE_AT_INSTALL);
        return switchValue != null ? switchValue : Locale.getDefault().getCountry();
    }

    public static String getConfigurationLanguage(Configuration config) {
        Locale locale = config.locale;
        return locale != null ? locale.toLanguageTag() : "";
    }

    public static String getContextLanguage(Context context) {
        return getConfigurationLanguage(context.getResources().getConfiguration());
    }

    public static void updateConfig(Context base, Configuration config, String languageTag) {
        ApisN.setConfigLocales(base, config, languageTag);
    }

    public static void setDefaultLocalesFromConfiguration(Configuration config) {
        ApisN.setLocaleList(config);
    }

    static class ApisN {
        ApisN() {
        }

        static void setConfigLocales(Context base, Configuration config, String language) {
            config.setLocales(prependToLocaleList(language, base.getResources().getConfiguration().getLocales()));
        }

        static void setLocaleList(Configuration config) {
            LocaleList.setDefault(config.getLocales());
        }

        static LocaleList prependToLocaleList(String languageTag, LocaleList localeList) {
            return LocaleList.forLanguageTags(String.format("%1$s,%2$s", languageTag, localeList.toLanguageTags().replaceFirst(String.format("(^|,)%1$s$|%1$s,", languageTag), "")));
        }
    }
}
