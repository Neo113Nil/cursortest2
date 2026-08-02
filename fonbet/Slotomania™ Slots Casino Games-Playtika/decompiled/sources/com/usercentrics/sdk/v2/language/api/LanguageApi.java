package com.usercentrics.sdk.v2.language.api;

import com.usercentrics.sdk.BuildKonfig;
import com.usercentrics.sdk.domain.api.http.HttpRequests;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.models.api.ApiErrors;
import com.usercentrics.sdk.services.api.NetworkResolver;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J2\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/usercentrics/sdk/v2/language/api/LanguageApi;", "Lcom/usercentrics/sdk/v2/language/api/ILanguageApi;", "restClient", "Lcom/usercentrics/sdk/domain/api/http/HttpRequests;", "networkResolver", "Lcom/usercentrics/sdk/services/api/NetworkResolver;", "(Lcom/usercentrics/sdk/domain/api/http/HttpRequests;Lcom/usercentrics/sdk/services/api/NetworkResolver;)V", "buildUrl", "", "settingsId", "jsonFileVersion", "getAvailableLanguages", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "version", "headers", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LanguageApi implements ILanguageApi {
    private final NetworkResolver networkResolver;
    private final HttpRequests restClient;

    public LanguageApi(HttpRequests restClient, NetworkResolver networkResolver) {
        Intrinsics.checkNotNullParameter(restClient, "restClient");
        Intrinsics.checkNotNullParameter(networkResolver, "networkResolver");
        this.restClient = restClient;
        this.networkResolver = networkResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.language.api.ILanguageApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAvailableLanguages(String str, String str2, Map<String, String> map, Continuation<? super HttpResponse> continuation) {
        LanguageApi$getAvailableLanguages$1 languageApi$getAvailableLanguages$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof LanguageApi$getAvailableLanguages$1) {
            languageApi$getAvailableLanguages$1 = (LanguageApi$getAvailableLanguages$1) continuation;
            if ((languageApi$getAvailableLanguages$1.label & Integer.MIN_VALUE) != 0) {
                languageApi$getAvailableLanguages$1.label -= Integer.MIN_VALUE;
                Object obj = languageApi$getAvailableLanguages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = languageApi$getAvailableLanguages$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String buildUrl = buildUrl(str, str2);
                    HttpRequests httpRequests = this.restClient;
                    languageApi$getAvailableLanguages$1.label = 1;
                    obj = httpRequests.getSync2(buildUrl, map, languageApi$getAvailableLanguages$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.getStatusCode() != 403 || httpResponse.getStatusCode() == 404) {
                    throw new UsercentricsException(ApiErrors.AVAILABLE_LANGUAGES_SETTINGS_NOT_FOUND, null, 2, null);
                }
                return obj;
            }
        }
        languageApi$getAvailableLanguages$1 = new LanguageApi$getAvailableLanguages$1(this, continuation);
        Object obj2 = languageApi$getAvailableLanguages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = languageApi$getAvailableLanguages$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.getStatusCode() != 403) {
        }
        throw new UsercentricsException(ApiErrors.AVAILABLE_LANGUAGES_SETTINGS_NOT_FOUND, null, 2, null);
    }

    private final String buildUrl(String settingsId, String jsonFileVersion) {
        return this.networkResolver.cdnBaseUrl() + "/" + BuildKonfig.INSTANCE.getEndpoint_settingsUrlPath() + "/" + settingsId + "/" + jsonFileVersion + "/languages.json";
    }
}
