package zc;

import android.content.res.Configuration;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import q4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {
    public static void a(Configuration config) {
        Locale locale;
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            String str = gc.d.f9945a;
            String str2 = gc.d.f9947c;
            if (str2 != null) {
                locale = f.f25915f;
                if (!Intrinsics.areEqual(str2, locale.getLanguage())) {
                    locale = f.f25911b;
                    if (!Intrinsics.areEqual(str2, locale.getLanguage())) {
                        locale = f.f25914e;
                        if (!Intrinsics.areEqual(str2, locale.getLanguage())) {
                            locale = f.f25913d;
                            if (!Intrinsics.areEqual(str2, locale.getLanguage())) {
                                locale = f.f25912c;
                                if (!Intrinsics.areEqual(str2, locale.getLanguage())) {
                                    locale = f.f25910a;
                                }
                            }
                        }
                    }
                }
            } else {
                locale = f.a(f.c());
            }
            Intrinsics.checkNotNullParameter(locale, "locale");
            gc.d.f9946b = locale;
            String lang = locale.getLanguage();
            Intrinsics.checkNotNullExpressionValue(lang, "getLanguage(...)");
            Intrinsics.checkNotNullParameter(lang, "lang");
            gc.d.f9945a = lang;
            String systemLocale = f.c().toString();
            Intrinsics.checkNotNullExpressionValue(systemLocale, "toString(...)");
            Intrinsics.checkNotNullParameter(systemLocale, "systemLocale");
            gc.d.f9948d = systemLocale;
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new r(ex, null, 18), 2);
        }
    }
}
