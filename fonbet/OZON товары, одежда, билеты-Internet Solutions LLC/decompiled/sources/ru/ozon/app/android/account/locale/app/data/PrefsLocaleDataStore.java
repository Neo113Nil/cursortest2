package ru.ozon.app.android.account.locale.app.data;

import android.content.SharedPreferences;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/PrefsLocaleDataStore;", "", "preferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "readLocalizationEnabled", "", "readLocale", "Ljava/util/Locale;", "saveLocale", "", "locale", "saveLocalizationEnabledAndClearLocale", "localizationEnabled", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrefsLocaleDataStore {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SharedPreferences preferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/PrefsLocaleDataStore$Companion;", "", "<init>", "()V", "LOCALE_LANG_PREFS_KEY", "", "LOCALE_SCRIPT_PREFS_KEY", "LOCALIZATION_ENABLED_FLAG", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PrefsLocaleDataStore(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    public final Locale readLocale() {
        String string = this.preferences.getString("locale_language", null);
        String string2 = this.preferences.getString("locale_script", null);
        if (string != null && string.length() != 0 && (string2 == null || string2.length() == 0)) {
            return new Locale(string);
        }
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            return null;
        }
        return Locale.forLanguageTag(string + "-" + string2);
    }

    public final boolean readLocalizationEnabled() {
        return this.preferences.getBoolean("location_enabled_flag", false);
    }

    public final void saveLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putString("locale_language", locale.getLanguage());
        edit.putString("locale_script", locale.getScript());
        edit.apply();
    }

    public final void saveLocalizationEnabledAndClearLocale(boolean localizationEnabled) {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.remove("locale_language");
        edit.remove("locale_script");
        edit.putBoolean("location_enabled_flag", localizationEnabled);
        edit.apply();
    }
}
