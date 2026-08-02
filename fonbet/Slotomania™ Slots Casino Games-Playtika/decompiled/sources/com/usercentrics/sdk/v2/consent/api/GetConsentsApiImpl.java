package com.usercentrics.sdk.v2.consent.api;

import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.core.settings.SettingsOrchestrator;
import com.usercentrics.sdk.domain.api.http.HttpErrorResponse;
import com.usercentrics.sdk.domain.api.http.HttpRequests;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.services.api.NetworkResolver;
import com.usercentrics.sdk.v2.consent.data.ConsentsDataDto;
import com.usercentrics.sdk.v2.consent.data.GetConsentsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

/* compiled from: GetConsentsApiImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0002J8\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J8\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/usercentrics/sdk/v2/consent/api/GetConsentsApiImpl;", "Lcom/usercentrics/sdk/v2/consent/api/GetConsentsApi;", "requests", "Lcom/usercentrics/sdk/domain/api/http/HttpRequests;", "networkResolver", "Lcom/usercentrics/sdk/services/api/NetworkResolver;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", "settingsOrchestrator", "Lcom/usercentrics/sdk/core/settings/SettingsOrchestrator;", "(Lcom/usercentrics/sdk/domain/api/http/HttpRequests;Lcom/usercentrics/sdk/services/api/NetworkResolver;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/core/settings/SettingsOrchestrator;)V", "createUrl", "", "settingsId", "controllerId", "errorResponse", "", "httpResponse", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "onError", "Lkotlin/Function1;", "Lcom/usercentrics/sdk/errors/UsercentricsException;", "getUserConsents", "onSuccess", "Lcom/usercentrics/sdk/v2/consent/data/GetConsentsData;", "onResponse", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetConsentsApiImpl implements GetConsentsApi {
    private final JsonParser jsonParser;
    private final NetworkResolver networkResolver;
    private final HttpRequests requests;
    private final SettingsOrchestrator settingsOrchestrator;

    public GetConsentsApiImpl(HttpRequests requests, NetworkResolver networkResolver, JsonParser jsonParser, SettingsOrchestrator settingsOrchestrator) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(networkResolver, "networkResolver");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(settingsOrchestrator, "settingsOrchestrator");
        this.requests = requests;
        this.networkResolver = networkResolver;
        this.jsonParser = jsonParser;
        this.settingsOrchestrator = settingsOrchestrator;
    }

    @Override // com.usercentrics.sdk.v2.consent.api.GetConsentsApi
    public void getUserConsents(final String controllerId, final Function1<? super GetConsentsData, Unit> onSuccess, final Function1<? super UsercentricsException, Unit> onError) {
        Intrinsics.checkNotNullParameter(controllerId, "controllerId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.settingsOrchestrator.getSettingsIdObservable().subscribe(new Function1<String, Unit>() { // from class: com.usercentrics.sdk.v2.consent.api.GetConsentsApiImpl$getUserConsents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String settingsId) {
                HttpRequests httpRequests;
                String createUrl;
                Intrinsics.checkNotNullParameter(settingsId, "settingsId");
                httpRequests = GetConsentsApiImpl.this.requests;
                createUrl = GetConsentsApiImpl.this.createUrl(settingsId, controllerId);
                final GetConsentsApiImpl getConsentsApiImpl = GetConsentsApiImpl.this;
                final Function1<UsercentricsException, Unit> function1 = onError;
                final Function1<GetConsentsData, Unit> function12 = onSuccess;
                Function1<HttpResponse, Unit> function13 = new Function1<HttpResponse, Unit>() { // from class: com.usercentrics.sdk.v2.consent.api.GetConsentsApiImpl$getUserConsents$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(HttpResponse httpResponse) {
                        invoke2(httpResponse);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(HttpResponse httpResponse) {
                        Intrinsics.checkNotNullParameter(httpResponse, "httpResponse");
                        GetConsentsApiImpl.this.onResponse(httpResponse, function1, function12);
                    }
                };
                final Function1<UsercentricsException, Unit> function14 = onError;
                httpRequests.get(createUrl, null, function13, new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.v2.consent.api.GetConsentsApiImpl$getUserConsents$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        function14.invoke(new UsercentricsException("Failed to get user consents: " + it.getMessage(), it));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResponse(HttpResponse httpResponse, Function1<? super UsercentricsException, Unit> onError, Function1<? super GetConsentsData, Unit> onSuccess) {
        Json json;
        if (httpResponse.getStatusCode() != 200) {
            errorResponse(httpResponse, onError);
            return;
        }
        try {
            KSerializer<ConsentsDataDto> serializer = ConsentsDataDto.INSTANCE.serializer();
            String body = httpResponse.getBody();
            json = JsonParserKt.json;
            onSuccess.invoke(GetConsentsApiImplKt.mapToGetConsentsData((ConsentsDataDto) json.decodeFromString(serializer, body), this.jsonParser));
        } catch (Exception e) {
            onError.invoke(new UsercentricsException("Missing necessary fields to restore user session", e));
        }
    }

    private final void errorResponse(HttpResponse httpResponse, Function1<? super UsercentricsException, Unit> onError) {
        Json json;
        KSerializer<HttpErrorResponse> serializer = HttpErrorResponse.INSTANCE.serializer();
        String body = httpResponse.getBody();
        json = JsonParserKt.json;
        String message = ((HttpErrorResponse) json.decodeFromString(serializer, body)).getMessage();
        if (message == null) {
            message = "";
        }
        onError.invoke(new UsercentricsException(message, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String createUrl(String settingsId, String controllerId) {
        return this.networkResolver.getConsentsBaseUrl() + "/?settingsId=" + settingsId + "&controllerId=" + controllerId;
    }
}
