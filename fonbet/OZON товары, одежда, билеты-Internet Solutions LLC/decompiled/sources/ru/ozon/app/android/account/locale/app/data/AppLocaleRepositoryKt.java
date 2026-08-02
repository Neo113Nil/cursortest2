package ru.ozon.app.android.account.locale.app.data;

import G.g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLanguageTag", "", "Ljava/util/Locale;", "account_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLocaleRepositoryKt {
    @NotNull
    public static final String mapToLanguageTag(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            return g.c(locale.getLanguage(), "-", locale.getScript());
        }
        String language = locale.getLanguage();
        Intrinsics.f(language);
        return language;
    }
}
