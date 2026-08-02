package ru.ozon.app.android.account.locale.app.data;

import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "", "", "updateLocaleIfNeed", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/account/locale/app/data/LocalizationVersion;", "version", "setLocalizationVersion", "(Lru/ozon/app/android/account/locale/app/data/LocalizationVersion;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/Locale;", "getDisplayedLocale", "()Ljava/util/Locale;", "", "language", "setApplicationLocale", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppLocaleRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository$Companion;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "", "isSupported", "(Ljava/util/Locale;)Z", "addScriptIfNeed", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "", "SUPPORTED_LANGUAGES", "Ljava/util/Set;", "REQUIRE_SCRIPT_LANGUAGES", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Set<String> REQUIRE_SCRIPT_LANGUAGES;

        @NotNull
        private static final Set<String> SUPPORTED_LANGUAGES;

        static {
            String[] elements = {"ru", "en", "uz-Latn", "kk", "hy", "zh", "mn", "az-Latn", "tk"};
            Intrinsics.checkNotNullParameter(elements, "elements");
            SUPPORTED_LANGUAGES = C7705l.j0(elements);
            String[] elements2 = {"uz", "az"};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            REQUIRE_SCRIPT_LANGUAGES = C7705l.j0(elements2);
        }

        private Companion() {
        }

        @NotNull
        public final Locale addScriptIfNeed(@NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "<this>");
            if (!REQUIRE_SCRIPT_LANGUAGES.contains(locale.getLanguage())) {
                return locale;
            }
            String script = locale.getScript();
            if (script != null && script.length() != 0) {
                return locale;
            }
            Locale build = new Locale.Builder().setLanguage(locale.getLanguage()).setScript("Latn").build();
            Intrinsics.f(build);
            return build;
        }

        public final boolean isSupported(@NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            return SUPPORTED_LANGUAGES.contains(AppLocaleRepositoryKt.mapToLanguageTag(locale));
        }
    }

    @NotNull
    Locale getDisplayedLocale();

    Object setApplicationLocale(@NotNull String str, @NotNull d<? super Unit> dVar);

    Object setLocalizationVersion(@NotNull LocalizationVersion localizationVersion, @NotNull d<? super Unit> dVar);

    Object updateLocaleIfNeed(@NotNull d<? super Unit> dVar);
}
