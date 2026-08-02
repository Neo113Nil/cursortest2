package com.vk.id.network;

import We.InterfaceC4865g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0011J7\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/network/InternalVKIDApiContract;", "", "", "code", "codeVerifier", "clientId", "deviceId", "redirectUri", "state", "LWe/g;", "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LWe/g;", "clientSecret", "getSilentAuthProviders", "(Ljava/lang/String;Ljava/lang/String;)LWe/g;", "accessToken", "getUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LWe/g;", "logout", "sakVersion", "Lorg/json/JSONArray;", "events", "externalDeviceId", "sendStatEventsAnonymously", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)LWe/g;", "sendStatEvents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)LWe/g;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface InternalVKIDApiContract {
    @NotNull
    InterfaceC4865g getSilentAuthProviders(@NotNull String clientId, @NotNull String clientSecret);

    @NotNull
    InterfaceC4865g getToken(@NotNull String code, @NotNull String codeVerifier, @NotNull String clientId, @NotNull String deviceId, @NotNull String redirectUri, @NotNull String state);

    @NotNull
    InterfaceC4865g getUser(@NotNull String accessToken, @NotNull String clientId, @NotNull String deviceId);

    @NotNull
    InterfaceC4865g logout(@NotNull String accessToken, @NotNull String clientId, @NotNull String deviceId);

    @NotNull
    InterfaceC4865g sendStatEvents(@NotNull String accessToken, @NotNull String clientId, @NotNull String clientSecret, @NotNull String sakVersion, @NotNull JSONArray events, @NotNull String externalDeviceId);

    @NotNull
    InterfaceC4865g sendStatEventsAnonymously(@NotNull String clientId, @NotNull String clientSecret, @NotNull String sakVersion, @NotNull JSONArray events, @NotNull String externalDeviceId);
}
