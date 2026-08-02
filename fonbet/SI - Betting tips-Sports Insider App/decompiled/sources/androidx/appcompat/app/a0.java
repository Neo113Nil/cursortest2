package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static l0.g b(Configuration configuration) {
        return l0.g.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(l0.g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f19306a.a()));
    }

    public static void d(Configuration configuration, l0.g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(gVar.f19306a.a()));
    }
}
