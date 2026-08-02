package ru.ozon.app.android.account.locale.app.data;

import Cb0.g;
import Ib.a;
import Sc.s;
import android.content.res.Resources;
import android.os.LocaleList;
import androidx.core.os.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.android.ozonLogger.core.h;
import ru.ozon.app.android.account.locale.network.NetworkLocaleRepository;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.flags.LanguageCookieDomainWhitelist;
import ru.ozon.app.android.network.flags.LanguageCookieLocalizationEnabled;
import ru.ozon.app.android.network.flags.LocalizationV2FeatureFlag;
import ru.ozon.app.android.network.flags.SendingAcceptLanguageHeaderEnabledFlag;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import sj.d;
import sj.f;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import zb0.AbstractC11016a;
import zb0.e;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001MBk\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010$J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u0002002\b\u0010.\u001a\u0004\u0018\u00010\u00192\u0006\u0010/\u001a\u00020\u0019H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002002\u0006\u00103\u001a\u00020\u0019H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u0002002\b\u0010.\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b6\u00105J\u0018\u00109\u001a\u00020\u001b2\u0006\u00108\u001a\u000207H\u0096@¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001fH\u0016¢\u0006\u0004\b=\u0010!J\u0018\u0010>\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b>\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010@R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010DR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010ER\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010FR\u001c\u0010G\u001a\u00020\u001f8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010!R\u0014\u0010L\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/AppLocaleRepositoryImpl;", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "Lru/ozon/app/android/account/locale/app/data/PrefsLocaleDataStore;", "prefsDataStore", "LIb/a;", "Lru/ozon/app/android/account/locale/app/data/DefaultAppLocaleDataSource;", "defaultAppLocaleDataSourceLazy", "Lru/ozon/app/android/account/locale/app/data/ChangeLocaleUseCase;", "changeLocaleUseCase", "Lru/ozon/app/android/account/locale/network/NetworkLocaleRepository;", "networkLocaleRepository", "Lru/ozon/app/android/account/locale/app/data/AppLocaleChangedEventBus;", "appLocaleChangedEventBus", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lsj/d;", "ozonLogger", "LOb0/a;", "ozonIdAppApi", "Lru/ozon/app/android/account/locale/app/data/LocalizationDebugPreferences;", "localizationDebugPreferences", "<init>", "(Lru/ozon/app/android/account/locale/app/data/PrefsLocaleDataStore;LIb/a;LIb/a;LIb/a;Lru/ozon/app/android/account/locale/app/data/AppLocaleChangedEventBus;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/version/AppVersionService;Lsj/d;LOb0/a;Lru/ozon/app/android/account/locale/app/data/LocalizationDebugPreferences;)V", "", "language", "", "setApplicationLocaleRemote", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "setApplicationLocaleLocal", "Ljava/util/Locale;", "selectLocale", "()Ljava/util/Locale;", "getSystemLanguage", "collectNetworkCookieEvents", "()V", "LCb0/g$b;", "info", "logInvalidLocalization", "(LCb0/g$b;)V", "updateLocaleInCookie", "", "Ljava/net/URI;", "getAppDomains", "()Ljava/util/List;", "oldLanguage", "newLanguage", "", "isAvailableAndRequireLanguage", "(Ljava/lang/String;Ljava/lang/String;)Z", "lang", "isLanguageSupported", "(Ljava/lang/String;)Z", "isRequireSetLocale", "Lru/ozon/app/android/account/locale/app/data/LocalizationVersion;", "version", "setLocalizationVersion", "(Lru/ozon/app/android/account/locale/app/data/LocalizationVersion;Lkotlin/coroutines/d;)Ljava/lang/Object;", "updateLocaleIfNeed", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "getDisplayedLocale", "setApplicationLocale", "Lru/ozon/app/android/account/locale/app/data/PrefsLocaleDataStore;", "LIb/a;", "Lru/ozon/app/android/account/locale/app/data/AppLocaleChangedEventBus;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/version/AppVersionService;", "Lsj/d;", "LOb0/a;", "Lru/ozon/app/android/account/locale/app/data/LocalizationDebugPreferences;", "currentAppLocale", "Ljava/util/Locale;", "getCurrentAppLocale", "getLocalizationEnabled", "()Z", "localizationEnabled", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLocaleRepositoryImpl implements AppLocaleRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final Locale localeFromTag;
    private static final Locale testLocale;

    @NotNull
    private final AppLocaleChangedEventBus appLocaleChangedEventBus;

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final a<ChangeLocaleUseCase> changeLocaleUseCase;

    @NotNull
    private Locale currentAppLocale;

    @NotNull
    private final a<DefaultAppLocaleDataSource> defaultAppLocaleDataSourceLazy;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final LocalizationDebugPreferences localizationDebugPreferences;

    @NotNull
    private final a<NetworkLocaleRepository> networkLocaleRepository;

    @NotNull
    private final Ob0.a ozonIdAppApi;

    @NotNull
    private final d ozonLogger;

    @NotNull
    private final PrefsLocaleDataStore prefsDataStore;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/AppLocaleRepositoryImpl$Companion;", "", "<init>", "()V", "", "BX_LANGUAGE_VALUE_OLD", "Ljava/lang/String;", "BX_LANGUAGE_VALUE_NEW", "", "BX_LANGUAGE_KEY", "C", "LOG_LOCALIZATION_KEY", "LOG_LOCALIZATION_NEW_LANG_KEY", "LOG_LOCALIZATION_OLD_LANG_KEY", "LOG_LOCALIZATION_LANGUAGES_KEY", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Locale forLanguageTag = Locale.forLanguageTag("sw");
        localeFromTag = forLanguageTag;
        testLocale = new Locale.Builder().setLanguage(forLanguageTag.getLanguage()).setScript(forLanguageTag.getScript()).setExtension('k', "bx").build();
    }

    public AppLocaleRepositoryImpl(@NotNull PrefsLocaleDataStore prefsDataStore, @NotNull a<DefaultAppLocaleDataSource> defaultAppLocaleDataSourceLazy, @NotNull a<ChangeLocaleUseCase> changeLocaleUseCase, @NotNull a<NetworkLocaleRepository> networkLocaleRepository, @NotNull AppLocaleChangedEventBus appLocaleChangedEventBus, @NotNull FeatureService featureService, @NotNull AppVersionService appVersionService, @NotNull d ozonLogger, @NotNull Ob0.a ozonIdAppApi, @NotNull LocalizationDebugPreferences localizationDebugPreferences) {
        Intrinsics.checkNotNullParameter(prefsDataStore, "prefsDataStore");
        Intrinsics.checkNotNullParameter(defaultAppLocaleDataSourceLazy, "defaultAppLocaleDataSourceLazy");
        Intrinsics.checkNotNullParameter(changeLocaleUseCase, "changeLocaleUseCase");
        Intrinsics.checkNotNullParameter(networkLocaleRepository, "networkLocaleRepository");
        Intrinsics.checkNotNullParameter(appLocaleChangedEventBus, "appLocaleChangedEventBus");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(ozonLogger, "ozonLogger");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        Intrinsics.checkNotNullParameter(localizationDebugPreferences, "localizationDebugPreferences");
        this.prefsDataStore = prefsDataStore;
        this.defaultAppLocaleDataSourceLazy = defaultAppLocaleDataSourceLazy;
        this.changeLocaleUseCase = changeLocaleUseCase;
        this.networkLocaleRepository = networkLocaleRepository;
        this.appLocaleChangedEventBus = appLocaleChangedEventBus;
        this.featureService = featureService;
        this.appVersionService = appVersionService;
        this.ozonLogger = ozonLogger;
        this.ozonIdAppApi = ozonIdAppApi;
        this.localizationDebugPreferences = localizationDebugPreferences;
        this.currentAppLocale = selectLocale();
        collectNetworkCookieEvents();
    }

    private final void collectNetworkCookieEvents() {
        C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new AppLocaleRepositoryImpl$collectNetworkCookieEvents$1(this, null), 3);
    }

    private final List<URI> getAppDomains() {
        List m11 = h.m(this.featureService.getStringKey(LanguageCookieDomainWhitelist.INSTANCE), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            arrayList.add(new URI(Nk.a.b("https://", h.z0((String) it.next()).toString())));
        }
        return arrayList;
    }

    private final Locale getCurrentAppLocale() {
        if (!this.localizationDebugPreferences.isDebugLocaleEnabled()) {
            return this.currentAppLocale;
        }
        Locale testLocale2 = testLocale;
        Intrinsics.checkNotNullExpressionValue(testLocale2, "testLocale");
        return testLocale2;
    }

    private final boolean getLocalizationEnabled() {
        return this.featureService.getBooleanKey(SendingAcceptLanguageHeaderEnabledFlag.INSTANCE);
    }

    private final Locale getSystemLanguage() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        int size = locales.size();
        for (int i11 = 0; i11 < size; i11++) {
            Locale locale = locales.get(i11);
            if (!Intrinsics.d(locale.getVariant(), "bx_language") && !Intrinsics.d(locale.getExtension('k'), "bx")) {
                return locale;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAvailableAndRequireLanguage(String oldLanguage, String newLanguage) {
        return isLanguageSupported(newLanguage) && isRequireSetLocale(oldLanguage);
    }

    private final boolean isLanguageSupported(String lang) {
        Xc.a<Ub0.d> a11 = Ub0.d.a();
        if (a11 != null && a11.isEmpty()) {
            return false;
        }
        Iterator<E> it = a11.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((Ub0.d) it.next()).d().toLanguageTag(), lang)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isRequireSetLocale(String oldLanguage) {
        return !(oldLanguage == null || oldLanguage.length() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInvalidLocalization(g.b info) {
        h.a.d(this.ozonLogger, c.ERROR, "unsupported_language_cookie", f.a(U.j(new Pair("old_language", info.b()), new Pair("new_language", info.a()), new Pair("supported_localizations", C7714v.V(Ub0.d.a(), null, null, null, AppLocaleRepositoryImpl$logInvalidLocalization$1.INSTANCE, 31)))), null, 8);
    }

    private final Locale selectLocale() {
        Locale readLocale = this.prefsDataStore.readLocale();
        if (readLocale != null) {
            return readLocale;
        }
        if (!getLocalizationEnabled()) {
            return new Locale("ru");
        }
        Locale systemLanguage = getSystemLanguage();
        Locale addScriptIfNeed = systemLanguage != null ? AppLocaleRepository.INSTANCE.addScriptIfNeed(systemLanguage) : null;
        boolean isAvailableFromFeatureFlag = this.defaultAppLocaleDataSourceLazy.get().isAvailableFromFeatureFlag(this.appVersionService.getVersion(), addScriptIfNeed != null ? AppLocaleRepositoryKt.mapToLanguageTag(addScriptIfNeed) : null);
        if (addScriptIfNeed != null && AppLocaleRepository.INSTANCE.isSupported(addScriptIfNeed) && isAvailableFromFeatureFlag) {
            return addScriptIfNeed;
        }
        return new Locale(this.defaultAppLocaleDataSourceLazy.get().selectBy(addScriptIfNeed != null ? addScriptIfNeed.getLanguage() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e5, code lost:
    
        if (r11.execute(r10, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        if (r11.emit(r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setApplicationLocaleLocal(String str, kotlin.coroutines.d<? super Unit> dVar) {
        AppLocaleRepositoryImpl$setApplicationLocaleLocal$1 appLocaleRepositoryImpl$setApplicationLocaleLocal$1;
        int i11;
        AppLocaleRepositoryImpl appLocaleRepositoryImpl;
        if (dVar instanceof AppLocaleRepositoryImpl$setApplicationLocaleLocal$1) {
            appLocaleRepositoryImpl$setApplicationLocaleLocal$1 = (AppLocaleRepositoryImpl$setApplicationLocaleLocal$1) dVar;
            int i12 = appLocaleRepositoryImpl$setApplicationLocaleLocal$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                appLocaleRepositoryImpl$setApplicationLocaleLocal$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = appLocaleRepositoryImpl$setApplicationLocaleLocal$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = appLocaleRepositoryImpl$setApplicationLocaleLocal$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Locale readLocale = this.prefsDataStore.readLocale();
                    if (Intrinsics.d(readLocale != null ? readLocale.getLanguage() : null, str)) {
                        return Unit.f71690a;
                    }
                    Locale forLanguageTag = Locale.forLanguageTag(str);
                    Locale build = new Locale.Builder().setLanguage(forLanguageTag.getLanguage()).setScript(forLanguageTag.getScript()).setExtension('k', "bx").build();
                    this.currentAppLocale = build;
                    PrefsLocaleDataStore prefsLocaleDataStore = this.prefsDataStore;
                    Intrinsics.f(build);
                    prefsLocaleDataStore.saveLocale(build);
                    i a11 = i.a(build);
                    Intrinsics.checkNotNullExpressionValue(a11, "create(...)");
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 x11 = De.s.f6650a.x();
                    AppLocaleRepositoryImpl$setApplicationLocaleLocal$2 appLocaleRepositoryImpl$setApplicationLocaleLocal$2 = new AppLocaleRepositoryImpl$setApplicationLocaleLocal$2(a11, build, null);
                    appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$0 = this;
                    appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$1 = str;
                    appLocaleRepositoryImpl$setApplicationLocaleLocal$1.label = 1;
                    if (C10727i.f(x11, appLocaleRepositoryImpl$setApplicationLocaleLocal$2, appLocaleRepositoryImpl$setApplicationLocaleLocal$1) != aVar) {
                        appLocaleRepositoryImpl = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    str = (String) appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$1;
                    appLocaleRepositoryImpl = (AppLocaleRepositoryImpl) appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$0;
                    s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    str = (String) appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$1;
                    appLocaleRepositoryImpl = (AppLocaleRepositoryImpl) appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$0;
                    s.b(obj);
                    appLocaleRepositoryImpl.updateLocaleInCookie();
                    ChangeLocaleUseCase changeLocaleUseCase = appLocaleRepositoryImpl.changeLocaleUseCase.get();
                    appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$0 = null;
                    appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$1 = null;
                    appLocaleRepositoryImpl$setApplicationLocaleLocal$1.label = 3;
                }
                AppLocaleChangedEventBus appLocaleChangedEventBus = appLocaleRepositoryImpl.appLocaleChangedEventBus;
                appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$0 = appLocaleRepositoryImpl;
                appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$1 = str;
                appLocaleRepositoryImpl$setApplicationLocaleLocal$1.label = 2;
            }
        }
        appLocaleRepositoryImpl$setApplicationLocaleLocal$1 = new AppLocaleRepositoryImpl$setApplicationLocaleLocal$1(this, dVar);
        Object obj2 = appLocaleRepositoryImpl$setApplicationLocaleLocal$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = appLocaleRepositoryImpl$setApplicationLocaleLocal$1.label;
        if (i11 != 0) {
        }
        AppLocaleChangedEventBus appLocaleChangedEventBus2 = appLocaleRepositoryImpl.appLocaleChangedEventBus;
        appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$0 = appLocaleRepositoryImpl;
        appLocaleRepositoryImpl$setApplicationLocaleLocal$1.L$1 = str;
        appLocaleRepositoryImpl$setApplicationLocaleLocal$1.label = 2;
    }

    private final Object setApplicationLocaleRemote(String str, kotlin.coroutines.d<? super Unit> dVar) {
        Object saveLocale = this.networkLocaleRepository.get().saveLocale(str, dVar);
        return saveLocale == Wc.a.COROUTINE_SUSPENDED ? saveLocale : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLocaleInCookie() {
        if (this.featureService.getBooleanKey(LocalizationV2FeatureFlag.INSTANCE)) {
            return;
        }
        List<URI> appDomains = getAppDomains();
        final String str = "x-o3-language";
        if (!getLocalizationEnabled() || !this.featureService.getBooleanKey(LanguageCookieLocalizationEnabled.INSTANCE)) {
            this.ozonIdAppApi.M().a(appDomains, e0.h("x-o3-language"));
            return;
        }
        e eVar = new e(str, this) { // from class: ru.ozon.app.android.account.locale.app.data.AppLocaleRepositoryImpl$updateLocaleInCookie$cookie$1
            private final String name;
            private final String value;

            {
                this.name = str;
                this.value = AppLocaleRepositoryKt.mapToLanguageTag(this.getDisplayedLocale());
            }

            @Override // zb0.e
            public String getName() {
                return this.name;
            }

            @Override // zb0.e
            public String getValue() {
                return this.value;
            }
        };
        eVar.getAttributes().g(true);
        eVar.getAttributes().f();
        this.ozonIdAppApi.M().c(C7714v.a0(eVar), appDomains);
    }

    @Override // ru.ozon.app.android.account.locale.app.data.AppLocaleRepository
    @NotNull
    public Locale getDisplayedLocale() {
        return getCurrentAppLocale();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r2.setApplicationLocaleLocal(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.ozon.app.android.account.locale.app.data.AppLocaleRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setApplicationLocale(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AppLocaleRepositoryImpl$setApplicationLocale$1 appLocaleRepositoryImpl$setApplicationLocale$1;
        int i11;
        AppLocaleRepositoryImpl appLocaleRepositoryImpl;
        if (dVar instanceof AppLocaleRepositoryImpl$setApplicationLocale$1) {
            appLocaleRepositoryImpl$setApplicationLocale$1 = (AppLocaleRepositoryImpl$setApplicationLocale$1) dVar;
            int i12 = appLocaleRepositoryImpl$setApplicationLocale$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                appLocaleRepositoryImpl$setApplicationLocale$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = appLocaleRepositoryImpl$setApplicationLocale$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = appLocaleRepositoryImpl$setApplicationLocale$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    appLocaleRepositoryImpl$setApplicationLocale$1.L$0 = this;
                    appLocaleRepositoryImpl$setApplicationLocale$1.L$1 = str;
                    appLocaleRepositoryImpl$setApplicationLocale$1.label = 1;
                    if (setApplicationLocaleRemote(str, appLocaleRepositoryImpl$setApplicationLocale$1) != aVar) {
                        appLocaleRepositoryImpl = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                str = (String) appLocaleRepositoryImpl$setApplicationLocale$1.L$1;
                appLocaleRepositoryImpl = (AppLocaleRepositoryImpl) appLocaleRepositoryImpl$setApplicationLocale$1.L$0;
                s.b(obj);
                appLocaleRepositoryImpl$setApplicationLocale$1.L$0 = null;
                appLocaleRepositoryImpl$setApplicationLocale$1.L$1 = null;
                appLocaleRepositoryImpl$setApplicationLocale$1.label = 2;
            }
        }
        appLocaleRepositoryImpl$setApplicationLocale$1 = new AppLocaleRepositoryImpl$setApplicationLocale$1(this, dVar);
        Object obj2 = appLocaleRepositoryImpl$setApplicationLocale$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = appLocaleRepositoryImpl$setApplicationLocale$1.label;
        if (i11 != 0) {
        }
        appLocaleRepositoryImpl$setApplicationLocale$1.L$0 = null;
        appLocaleRepositoryImpl$setApplicationLocale$1.L$1 = null;
        appLocaleRepositoryImpl$setApplicationLocale$1.label = 2;
    }

    @Override // ru.ozon.app.android.account.locale.app.data.AppLocaleRepository
    public Object setLocalizationVersion(@NotNull final LocalizationVersion localizationVersion, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AbstractC11016a M11 = this.ozonIdAppApi.M();
        final String str = "x-o3-localization-version";
        e eVar = new e(str, localizationVersion) { // from class: ru.ozon.app.android.account.locale.app.data.AppLocaleRepositoryImpl$setLocalizationVersion$2
            private final String name;
            private final String value;

            {
                this.name = str;
                this.value = localizationVersion.getCookieValue();
            }

            @Override // zb0.e
            public String getName() {
                return this.name;
            }

            @Override // zb0.e
            public String getValue() {
                return this.value;
            }
        };
        eVar.getAttributes().f();
        M11.c(C7714v.a0(eVar), getAppDomains());
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.account.locale.app.data.AppLocaleRepository
    public Object updateLocaleIfNeed(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (this.prefsDataStore.readLocalizationEnabled() == getLocalizationEnabled()) {
            updateLocaleInCookie();
            return Unit.f71690a;
        }
        this.prefsDataStore.saveLocalizationEnabledAndClearLocale(getLocalizationEnabled());
        Object applicationLocale = setApplicationLocale(AppLocaleRepositoryKt.mapToLanguageTag(selectLocale()), dVar);
        return applicationLocale == Wc.a.COROUTINE_SUSPENDED ? applicationLocale : Unit.f71690a;
    }
}
