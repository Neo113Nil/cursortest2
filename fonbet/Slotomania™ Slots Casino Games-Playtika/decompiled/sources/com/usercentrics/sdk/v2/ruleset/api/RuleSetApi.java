package com.usercentrics.sdk.v2.ruleset.api;

import com.usercentrics.sdk.domain.api.http.HttpRequests;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.models.api.ApiErrors;
import com.usercentrics.sdk.services.api.NetworkResolver;
import io.sentry.SentryEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuleSetApi.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J*\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/usercentrics/sdk/v2/ruleset/api/RuleSetApi;", "Lcom/usercentrics/sdk/v2/ruleset/api/IRuleSetApi;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "networkResolver", "Lcom/usercentrics/sdk/services/api/NetworkResolver;", "restClient", "Lcom/usercentrics/sdk/domain/api/http/HttpRequests;", "(Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/services/api/NetworkResolver;Lcom/usercentrics/sdk/domain/api/http/HttpRequests;)V", "buildUrl", "", "id", "getRuleSet", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "headers", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RuleSetApi implements IRuleSetApi {
    private final UsercentricsLogger logger;
    private final NetworkResolver networkResolver;
    private final HttpRequests restClient;

    public RuleSetApi(UsercentricsLogger logger, NetworkResolver networkResolver, HttpRequests restClient) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(networkResolver, "networkResolver");
        Intrinsics.checkNotNullParameter(restClient, "restClient");
        this.logger = logger;
        this.networkResolver = networkResolver;
        this.restClient = restClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.usercentrics.sdk.v2.ruleset.api.IRuleSetApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRuleSet(String str, Map<String, String> map, Continuation<? super HttpResponse> continuation) {
        RuleSetApi$getRuleSet$1 ruleSetApi$getRuleSet$1;
        int i;
        RuleSetApi ruleSetApi;
        UsercentricsException usercentricsException;
        HttpResponse httpResponse;
        if (continuation instanceof RuleSetApi$getRuleSet$1) {
            ruleSetApi$getRuleSet$1 = (RuleSetApi$getRuleSet$1) continuation;
            if ((ruleSetApi$getRuleSet$1.label & Integer.MIN_VALUE) != 0) {
                ruleSetApi$getRuleSet$1.label -= Integer.MIN_VALUE;
                Object obj = ruleSetApi$getRuleSet$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ruleSetApi$getRuleSet$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        String buildUrl = buildUrl(str);
                        HttpRequests httpRequests = this.restClient;
                        ruleSetApi$getRuleSet$1.L$0 = this;
                        ruleSetApi$getRuleSet$1.L$1 = str;
                        ruleSetApi$getRuleSet$1.label = 1;
                        obj = httpRequests.getSync2(buildUrl, map, ruleSetApi$getRuleSet$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ruleSetApi = this;
                    } catch (Exception e) {
                        e = e;
                        ruleSetApi = this;
                        Throwable th = e;
                        ruleSetApi.logger.error("Failed while fetching ruleSet using id: " + str, th);
                        if (e instanceof UsercentricsException) {
                        }
                        if (usercentricsException == null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) ruleSetApi$getRuleSet$1.L$1;
                    ruleSetApi = (RuleSetApi) ruleSetApi$getRuleSet$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        Throwable th2 = e;
                        ruleSetApi.logger.error("Failed while fetching ruleSet using id: " + str, th2);
                        usercentricsException = e instanceof UsercentricsException ? (UsercentricsException) e : null;
                        if (usercentricsException == null) {
                            throw usercentricsException;
                        }
                        throw new UsercentricsException(ApiErrors.FETCH_RULE_SET, th2);
                    }
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.getStatusCode() != 403 || httpResponse.getStatusCode() == 404) {
                    throw new UsercentricsException(ApiErrors.RULE_SET_NOT_FOUND, null, 2, null);
                }
                return obj;
            }
        }
        ruleSetApi$getRuleSet$1 = new RuleSetApi$getRuleSet$1(this, continuation);
        Object obj2 = ruleSetApi$getRuleSet$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ruleSetApi$getRuleSet$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.getStatusCode() != 403) {
        }
        throw new UsercentricsException(ApiErrors.RULE_SET_NOT_FOUND, null, 2, null);
    }

    private final String buildUrl(String id) {
        return this.networkResolver.cdnBaseUrl() + "/ruleSet/" + id + ".json";
    }
}
