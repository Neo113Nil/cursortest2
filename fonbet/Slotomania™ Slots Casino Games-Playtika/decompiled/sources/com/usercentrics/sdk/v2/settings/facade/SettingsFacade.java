package com.usercentrics.sdk.v2.settings.facade;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.models.api.ApiErrors;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.services.settings.ISettingsMapper;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import com.usercentrics.sdk.v2.settings.service.ICacheBypassResolver;
import com.usercentrics.sdk.v2.settings.service.ISettingsService;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import com.usercentrics.sdk.v2.translation.service.ITranslationService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsFacade.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/facade/SettingsFacade;", "Lcom/usercentrics/sdk/v2/settings/facade/ISettingsFacade;", "settingsService", "Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;", "translationService", "Lcom/usercentrics/sdk/v2/translation/service/ITranslationService;", "settingsMapper", "Lcom/usercentrics/sdk/services/settings/ISettingsMapper;", "cacheBypassResolver", "Lcom/usercentrics/sdk/v2/settings/service/ICacheBypassResolver;", "(Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;Lcom/usercentrics/sdk/v2/translation/service/ITranslationService;Lcom/usercentrics/sdk/services/settings/ISettingsMapper;Lcom/usercentrics/sdk/v2/settings/service/ICacheBypassResolver;)V", "loadSettings", "Lkotlin/Result;", "Lcom/usercentrics/sdk/models/settings/LegacyExtendedSettings;", "settingsInitParameters", "Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;", "loadSettings-gIAlu-s", "(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsFacade implements ISettingsFacade {
    private final ICacheBypassResolver cacheBypassResolver;
    private final ISettingsMapper settingsMapper;
    private final ISettingsService settingsService;
    private final ITranslationService translationService;

    public SettingsFacade(ISettingsService settingsService, ITranslationService translationService, ISettingsMapper settingsMapper, ICacheBypassResolver cacheBypassResolver) {
        Intrinsics.checkNotNullParameter(settingsService, "settingsService");
        Intrinsics.checkNotNullParameter(translationService, "translationService");
        Intrinsics.checkNotNullParameter(settingsMapper, "settingsMapper");
        Intrinsics.checkNotNullParameter(cacheBypassResolver, "cacheBypassResolver");
        this.settingsService = settingsService;
        this.translationService = translationService;
        this.settingsMapper = settingsMapper;
        this.cacheBypassResolver = cacheBypassResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.usercentrics.sdk.v2.settings.facade.ISettingsFacade
    /* renamed from: loadSettings-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10625loadSettingsgIAlus(SettingsInitializationParameters settingsInitializationParameters, Continuation<? super Result<LegacyExtendedSettings>> continuation) {
        SettingsFacade$loadSettings$1 settingsFacade$loadSettings$1;
        Object coroutine_suspended;
        int i;
        SettingsFacade settingsFacade;
        ITranslationService iTranslationService;
        String jsonFileLanguage;
        boolean bypassCache;
        SettingsFacade settingsFacade2;
        try {
            if (continuation instanceof SettingsFacade$loadSettings$1) {
                settingsFacade$loadSettings$1 = (SettingsFacade$loadSettings$1) continuation;
                if ((settingsFacade$loadSettings$1.label & Integer.MIN_VALUE) != 0) {
                    settingsFacade$loadSettings$1.label -= Integer.MIN_VALUE;
                    Object obj = settingsFacade$loadSettings$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsFacade$loadSettings$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ISettingsService iSettingsService = this.settingsService;
                        settingsFacade$loadSettings$1.L$0 = this;
                        settingsFacade$loadSettings$1.L$1 = settingsInitializationParameters;
                        settingsFacade$loadSettings$1.label = 1;
                        if (iSettingsService.loadSettings(settingsInitializationParameters, settingsFacade$loadSettings$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        settingsFacade = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            settingsInitializationParameters = (SettingsInitializationParameters) settingsFacade$loadSettings$1.L$1;
                            settingsFacade2 = (SettingsFacade) settingsFacade$loadSettings$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            NewSettingsData settings = settingsFacade2.settingsService.getSettings();
                            Intrinsics.checkNotNull(settings);
                            LegalBasisLocalization translations = settingsFacade2.translationService.getTranslations();
                            Intrinsics.checkNotNull(translations);
                            LegacyExtendedSettings map = settingsFacade2.settingsMapper.map(settings.getData(), settings.getServices(), translations, settingsInitializationParameters.getControllerId());
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m11180constructorimpl(map);
                        }
                        settingsInitializationParameters = (SettingsInitializationParameters) settingsFacade$loadSettings$1.L$1;
                        settingsFacade = (SettingsFacade) settingsFacade$loadSettings$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    iTranslationService = settingsFacade.translationService;
                    jsonFileLanguage = settingsInitializationParameters.getJsonFileLanguage();
                    bypassCache = settingsFacade.cacheBypassResolver.getBypassCache();
                    settingsFacade$loadSettings$1.L$0 = settingsFacade;
                    settingsFacade$loadSettings$1.L$1 = settingsInitializationParameters;
                    settingsFacade$loadSettings$1.label = 2;
                    if (iTranslationService.loadTranslations(jsonFileLanguage, bypassCache, settingsFacade$loadSettings$1) != coroutine_suspended) {
                        settingsFacade2 = settingsFacade;
                        NewSettingsData settings2 = settingsFacade2.settingsService.getSettings();
                        Intrinsics.checkNotNull(settings2);
                        LegalBasisLocalization translations2 = settingsFacade2.translationService.getTranslations();
                        Intrinsics.checkNotNull(translations2);
                        LegacyExtendedSettings map2 = settingsFacade2.settingsMapper.map(settings2.getData(), settings2.getServices(), translations2, settingsInitializationParameters.getControllerId());
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m11180constructorimpl(map2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            iTranslationService = settingsFacade.translationService;
            jsonFileLanguage = settingsInitializationParameters.getJsonFileLanguage();
            bypassCache = settingsFacade.cacheBypassResolver.getBypassCache();
            settingsFacade$loadSettings$1.L$0 = settingsFacade;
            settingsFacade$loadSettings$1.L$1 = settingsInitializationParameters;
            settingsFacade$loadSettings$1.label = 2;
            if (iTranslationService.loadTranslations(jsonFileLanguage, bypassCache, settingsFacade$loadSettings$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new UsercentricsException(ApiErrors.FETCH_SETTINGS, e)));
        }
        settingsFacade$loadSettings$1 = new SettingsFacade$loadSettings$1(this, continuation);
        Object obj2 = settingsFacade$loadSettings$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsFacade$loadSettings$1.label;
    }
}
