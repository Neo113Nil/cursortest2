package com.usercentrics.sdk.v2.language.service;

import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.DeviceLanguage;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.services.tcf.Constants;
import com.usercentrics.sdk.v2.language.repository.ILanguageRepository;
import com.usercentrics.sdk.v2.location.data.LocationAwareResponse;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LanguageService.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ.\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/usercentrics/sdk/v2/language/service/LanguageService;", "Lcom/usercentrics/sdk/v2/language/service/ILanguageService;", "languageRepository", "Lcom/usercentrics/sdk/v2/language/repository/ILanguageRepository;", X3.a.k, "Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "(Lcom/usercentrics/sdk/v2/language/repository/ILanguageRepository;Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;Lcom/usercentrics/sdk/log/UsercentricsLogger;)V", "languagesEtagChanged", "", "getLanguagesEtagChanged", "()Z", "setLanguagesEtagChanged", "(Z)V", "platformLanguage", "Lcom/usercentrics/sdk/DeviceLanguage;", "<set-?>", "", "selectedLanguage", "getSelectedLanguage", "()Ljava/lang/String;", "Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;", "userLocation", "getUserLocation", "()Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;", "loadSelectedLanguage", "", "settingsId", "version", "defaultLanguage", "bypassCache", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matchAvailableLanguage", "availableLanguages", "", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LanguageService implements ILanguageService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String deviceLanguageMessage = "The language has been set to the device language.";
    private static final String fallbackLanguageMessage = "The language has been set to the default one, English.";
    private final ILanguageRepository languageRepository;
    private boolean languagesEtagChanged;
    private final UsercentricsLogger logger;
    private final DeviceLanguage platformLanguage;
    private String selectedLanguage;
    private final DeviceStorage storage;
    private UsercentricsLocation userLocation;

    public LanguageService(ILanguageRepository languageRepository, DeviceStorage storage, UsercentricsLogger logger) {
        Intrinsics.checkNotNullParameter(languageRepository, "languageRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.languageRepository = languageRepository;
        this.storage = storage;
        this.logger = logger;
        this.platformLanguage = new DeviceLanguage();
    }

    @Override // com.usercentrics.sdk.v2.language.service.ILanguageService
    public String getSelectedLanguage() {
        return this.selectedLanguage;
    }

    @Override // com.usercentrics.sdk.v2.language.service.ILanguageService
    public UsercentricsLocation getUserLocation() {
        return this.userLocation;
    }

    @Override // com.usercentrics.sdk.v2.language.service.ILanguageService
    public boolean getLanguagesEtagChanged() {
        return this.languagesEtagChanged;
    }

    @Override // com.usercentrics.sdk.v2.language.service.ILanguageService
    public void setLanguagesEtagChanged(boolean z) {
        this.languagesEtagChanged = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[LOOP:0: B:11:0x0074->B:13:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.language.service.ILanguageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadSelectedLanguage(String str, String str2, String str3, boolean z, Continuation<? super Unit> continuation) {
        LanguageService$loadSelectedLanguage$1 languageService$loadSelectedLanguage$1;
        int i;
        LanguageService languageService;
        Iterator it;
        if (continuation instanceof LanguageService$loadSelectedLanguage$1) {
            languageService$loadSelectedLanguage$1 = (LanguageService$loadSelectedLanguage$1) continuation;
            if ((languageService$loadSelectedLanguage$1.label & Integer.MIN_VALUE) != 0) {
                languageService$loadSelectedLanguage$1.label -= Integer.MIN_VALUE;
                Object obj = languageService$loadSelectedLanguage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = languageService$loadSelectedLanguage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ILanguageRepository iLanguageRepository = this.languageRepository;
                    languageService$loadSelectedLanguage$1.L$0 = this;
                    languageService$loadSelectedLanguage$1.L$1 = str3;
                    languageService$loadSelectedLanguage$1.label = 1;
                    obj = iLanguageRepository.fetchAvailableLanguages(str, str2, z, languageService$loadSelectedLanguage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    languageService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) languageService$loadSelectedLanguage$1.L$1;
                    languageService = (LanguageService) languageService$loadSelectedLanguage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                LocationAwareResponse locationAwareResponse = (LocationAwareResponse) obj;
                languageService.userLocation = locationAwareResponse.getLocation();
                languageService.setLanguagesEtagChanged(locationAwareResponse.getLanguageEtagChanged());
                Iterable iterable = (Iterable) locationAwareResponse.getData();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    arrayList.add(lowerCase);
                }
                languageService.selectedLanguage = languageService.matchAvailableLanguage(str3, arrayList);
                return Unit.INSTANCE;
            }
        }
        languageService$loadSelectedLanguage$1 = new LanguageService$loadSelectedLanguage$1(this, continuation);
        Object obj2 = languageService$loadSelectedLanguage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = languageService$loadSelectedLanguage$1.label;
        if (i != 0) {
        }
        LocationAwareResponse locationAwareResponse2 = (LocationAwareResponse) obj2;
        languageService.userLocation = locationAwareResponse2.getLocation();
        languageService.setLanguagesEtagChanged(locationAwareResponse2.getLanguageEtagChanged());
        Iterable iterable2 = (Iterable) locationAwareResponse2.getData();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        languageService.selectedLanguage = languageService.matchAvailableLanguage(str3, arrayList2);
        return Unit.INSTANCE;
    }

    private final String matchAvailableLanguage(String defaultLanguage, List<String> availableLanguages) {
        String settingsLanguage = this.storage.getSettingsLanguage();
        if (!StringsKt.isBlank(settingsLanguage) && availableLanguages.contains(settingsLanguage)) {
            return settingsLanguage;
        }
        if (!StringsKt.isBlank(defaultLanguage) && availableLanguages.contains(defaultLanguage)) {
            return defaultLanguage;
        }
        DeviceLanguage deviceLanguage = this.platformLanguage;
        String matchLanguage = deviceLanguage.matchLanguage(deviceLanguage.deviceLocale(), availableLanguages);
        if (matchLanguage != null && (!StringsKt.isBlank(matchLanguage))) {
            UsercentricsLogger.DefaultImpls.debug$default(this.logger, deviceLanguageMessage, null, 2, null);
            return matchLanguage;
        }
        String str = (String) CollectionsKt.firstOrNull((List) availableLanguages);
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            UsercentricsLogger.DefaultImpls.debug$default(this.logger, fallbackLanguageMessage, null, 2, null);
            return Constants.FALLBACK_LANGUAGE;
        }
        UsercentricsLogger.DefaultImpls.debug$default(this.logger, INSTANCE.firstAvailableLanguageMessage(str), null, 2, null);
        return str;
    }

    /* compiled from: LanguageService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/usercentrics/sdk/v2/language/service/LanguageService$Companion;", "", "()V", "deviceLanguageMessage", "", "fallbackLanguageMessage", "firstAvailableLanguageMessage", Device.JsonKeys.LANGUAGE, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String firstAvailableLanguageMessage(String language) {
            return "The language has been set to the first of those available, " + language + ".";
        }
    }
}
