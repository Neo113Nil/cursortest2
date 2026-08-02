package com.usercentrics.sdk.v2.language.facade;

import com.usercentrics.sdk.v2.language.service.ILanguageService;
import com.usercentrics.sdk.v2.location.data.LocationAwareResponse;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageFacade.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JB\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lcom/usercentrics/sdk/v2/language/facade/LanguageFacade;", "Lcom/usercentrics/sdk/v2/language/facade/ILanguageFacade;", "languageService", "Lcom/usercentrics/sdk/v2/language/service/ILanguageService;", "(Lcom/usercentrics/sdk/v2/language/service/ILanguageService;)V", "resolveLanguage", "Lkotlin/Result;", "Lcom/usercentrics/sdk/v2/location/data/LocationAwareResponse;", "", "settingsId", "version", "defaultLanguage", "bypassCache", "", "resolveLanguage-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LanguageFacade implements ILanguageFacade {
    private final ILanguageService languageService;

    public LanguageFacade(ILanguageService languageService) {
        Intrinsics.checkNotNullParameter(languageService, "languageService");
        this.languageService = languageService;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.usercentrics.sdk.v2.language.facade.ILanguageFacade
    /* renamed from: resolveLanguage-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10623resolveLanguageyxL6bBk(String str, String str2, String str3, boolean z, Continuation<? super Result<LocationAwareResponse<String>>> continuation) {
        LanguageFacade$resolveLanguage$1 languageFacade$resolveLanguage$1;
        int i;
        LanguageFacade languageFacade;
        try {
            if (continuation instanceof LanguageFacade$resolveLanguage$1) {
                languageFacade$resolveLanguage$1 = (LanguageFacade$resolveLanguage$1) continuation;
                if ((languageFacade$resolveLanguage$1.label & Integer.MIN_VALUE) != 0) {
                    languageFacade$resolveLanguage$1.label -= Integer.MIN_VALUE;
                    LanguageFacade$resolveLanguage$1 languageFacade$resolveLanguage$12 = languageFacade$resolveLanguage$1;
                    Object obj = languageFacade$resolveLanguage$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = languageFacade$resolveLanguage$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ILanguageService iLanguageService = this.languageService;
                        languageFacade$resolveLanguage$12.L$0 = this;
                        languageFacade$resolveLanguage$12.label = 1;
                        if (iLanguageService.loadSelectedLanguage(str, str2, str3, z, languageFacade$resolveLanguage$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        languageFacade = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        languageFacade = (LanguageFacade) languageFacade$resolveLanguage$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    String selectedLanguage = languageFacade.languageService.getSelectedLanguage();
                    Intrinsics.checkNotNull(selectedLanguage);
                    UsercentricsLocation userLocation = languageFacade.languageService.getUserLocation();
                    Intrinsics.checkNotNull(userLocation);
                    return Result.m11180constructorimpl(new LocationAwareResponse(selectedLanguage, userLocation, languageFacade.languageService.getLanguagesEtagChanged()));
                }
            }
            if (i != 0) {
            }
            Result.Companion companion2 = Result.INSTANCE;
            String selectedLanguage2 = languageFacade.languageService.getSelectedLanguage();
            Intrinsics.checkNotNull(selectedLanguage2);
            UsercentricsLocation userLocation2 = languageFacade.languageService.getUserLocation();
            Intrinsics.checkNotNull(userLocation2);
            return Result.m11180constructorimpl(new LocationAwareResponse(selectedLanguage2, userLocation2, languageFacade.languageService.getLanguagesEtagChanged()));
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(e));
        }
        languageFacade$resolveLanguage$1 = new LanguageFacade$resolveLanguage$1(this, continuation);
        LanguageFacade$resolveLanguage$1 languageFacade$resolveLanguage$122 = languageFacade$resolveLanguage$1;
        Object obj2 = languageFacade$resolveLanguage$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = languageFacade$resolveLanguage$122.label;
    }
}
