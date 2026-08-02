package ru.ozon.app.android.initializers.localization.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/initializers/localization/util/LocalizationSwitcher;", "", "appLocaleRepository", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "<init>", "(Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;)V", "updateToSavedLocale", "", "baseContext", "Landroid/content/Context;", "appContext", "application", "Landroid/app/Application;", "activity", "Landroid/app/Activity;", "updateLocale", "locale", "Ljava/util/Locale;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalizationSwitcher {

    @NotNull
    private final AppLocaleRepository appLocaleRepository;

    public LocalizationSwitcher(@NotNull AppLocaleRepository appLocaleRepository) {
        Intrinsics.checkNotNullParameter(appLocaleRepository, "appLocaleRepository");
        this.appLocaleRepository = appLocaleRepository;
    }

    private final void updateLocale(Context context, Locale locale) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocales(new LocaleList(locale));
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }

    public final void updateToSavedLocale(@NotNull Context baseContext, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Locale displayedLocale = this.appLocaleRepository.getDisplayedLocale();
        Locale.setDefault(displayedLocale);
        updateLocale(appContext, displayedLocale);
        updateLocale(baseContext, displayedLocale);
    }

    public final void updateToSavedLocale(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Context baseContext = application.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        updateToSavedLocale(baseContext, applicationContext);
    }

    public final void updateToSavedLocale(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        updateToSavedLocale(activity, applicationContext);
    }
}
