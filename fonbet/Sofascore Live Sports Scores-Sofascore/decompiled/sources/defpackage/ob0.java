package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ob0 {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static fib b(Configuration configuration) {
        return fib.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(fib fibVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(fibVar.c()));
    }

    public static void d(Configuration configuration, fib fibVar) {
        configuration.setLocales(LocaleList.forLanguageTags(fibVar.c()));
    }
}
