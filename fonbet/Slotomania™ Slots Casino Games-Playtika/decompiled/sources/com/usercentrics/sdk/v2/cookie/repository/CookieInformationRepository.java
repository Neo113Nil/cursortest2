package com.usercentrics.sdk.v2.cookie.repository;

import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.v2.cookie.api.ICookieInformationApi;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* compiled from: CookieInformationRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/usercentrics/sdk/v2/cookie/repository/CookieInformationRepository;", "Lcom/usercentrics/sdk/v2/cookie/repository/ICookieInformationRepository;", "cookieInformationApi", "Lcom/usercentrics/sdk/v2/cookie/api/ICookieInformationApi;", "json", "Lcom/usercentrics/sdk/core/json/JsonParser;", "(Lcom/usercentrics/sdk/v2/cookie/api/ICookieInformationApi;Lcom/usercentrics/sdk/core/json/JsonParser;)V", "fetchCookieInfo", "Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;", "cookieInfoURL", "", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CookieInformationRepository implements ICookieInformationRepository {
    private final ICookieInformationApi cookieInformationApi;
    private final JsonParser json;

    public CookieInformationRepository(ICookieInformationApi cookieInformationApi, JsonParser json) {
        Intrinsics.checkNotNullParameter(cookieInformationApi, "cookieInformationApi");
        Intrinsics.checkNotNullParameter(json, "json");
        this.cookieInformationApi = cookieInformationApi;
        this.json = json;
    }

    @Override // com.usercentrics.sdk.v2.cookie.repository.ICookieInformationRepository
    public ConsentDisclosureObject fetchCookieInfo(String cookieInfoURL) {
        Json json;
        Intrinsics.checkNotNullParameter(cookieInfoURL, "cookieInfoURL");
        String body = this.cookieInformationApi.getCookiesInfo(cookieInfoURL).getBody();
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(ConsentDisclosureObject.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (ConsentDisclosureObject) json2.decodeFromString(serializer, body);
    }
}
