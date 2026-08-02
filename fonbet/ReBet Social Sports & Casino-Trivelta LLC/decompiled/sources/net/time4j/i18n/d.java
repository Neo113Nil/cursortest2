package net.time4j.i18n;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Locale;

/* loaded from: classes5.dex */
public enum d {
    tl("fil"),
    no("nb"),
    in(StackTraceHelper.ID_KEY),
    iw("he");

    static final d[] ALIASES = values();
    private final String alias;

    d(String str) {
        this.alias = str;
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        if (language.equals("no") && locale.getVariant().equals("NY") && locale.getCountry().equals("NO")) {
            return "nn";
        }
        for (d dVar : ALIASES) {
            if (language.equals(dVar.name())) {
                return dVar.alias;
            }
        }
        return language;
    }
}
