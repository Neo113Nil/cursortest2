package com.vk.id.network;

import B0.C2454a;
import We.E;
import We.InterfaceC4865g;
import We.w;
import com.vk.id.network.util.CreateRequestKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J7\u0010\u001b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006!"}, d2 = {"Lcom/vk/id/network/InternalVKIDRealApi;", "Lcom/vk/id/network/InternalVKIDApiContract;", "LWe/E;", "client", "<init>", "(LWe/E;)V", "", "code", "codeVerifier", "clientId", "deviceId", "redirectUri", "state", "LWe/g;", "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LWe/g;", "clientSecret", "getSilentAuthProviders", "(Ljava/lang/String;Ljava/lang/String;)LWe/g;", "accessToken", "getUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LWe/g;", "logout", "sakVersion", "Lorg/json/JSONArray;", "events", "externalDeviceId", "sendStatEventsAnonymously", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)LWe/g;", "sendStatEvents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)LWe/g;", "LWe/E;", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDRealApi implements InternalVKIDApiContract {

    @NotNull
    private final E client;

    public InternalVKIDRealApi(@NotNull E client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @NotNull
    public InterfaceC4865g getSilentAuthProviders(@NotNull String clientId, @NotNull String clientSecret) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        w.a aVar = new w.a(0);
        aVar.a("v", "5.220");
        aVar.a("client_id", clientId);
        aVar.a("client_secret", clientSecret);
        return CreateRequestKt.createRequest$default(this.client, "https://api.vk.ru", "method/auth.getSilentAuthProviders", aVar.c(), null, 8, null);
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @NotNull
    public InterfaceC4865g getToken(@NotNull String code, @NotNull String codeVerifier, @NotNull String clientId, @NotNull String deviceId, @NotNull String redirectUri, @NotNull String state) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(state, "state");
        w.a aVar = new w.a(0);
        aVar.a("grant_type", "authorization_code");
        aVar.a("code", code);
        aVar.a("code_verifier", codeVerifier);
        aVar.a("client_id", clientId);
        aVar.a("device_id", deviceId);
        aVar.a("redirect_uri", redirectUri);
        aVar.a("state", state);
        return CreateRequestKt.createRequest$default(this.client, "https://id.vk.ru", "oauth2/auth", aVar.c(), null, 8, null);
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @NotNull
    public InterfaceC4865g getUser(@NotNull String accessToken, @NotNull String clientId, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        w.a aVar = new w.a(0);
        aVar.a("access_token", accessToken);
        aVar.a("device_id", deviceId);
        return CreateRequestKt.createRequest(this.client, "https://id.vk.ru", "oauth2/user_info", aVar.c(), C2454a.b("client_id", clientId));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @NotNull
    public InterfaceC4865g logout(@NotNull String accessToken, @NotNull String clientId, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        w.a aVar = new w.a(0);
        aVar.a("access_token", accessToken);
        aVar.a("client_id", clientId);
        aVar.a("device_id", deviceId);
        return CreateRequestKt.createRequest$default(this.client, "https://id.vk.ru", "oauth2/logout", aVar.c(), null, 8, null);
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @NotNull
    public InterfaceC4865g sendStatEvents(@NotNull String accessToken, @NotNull String clientId, @NotNull String clientSecret, @NotNull String sakVersion, @NotNull JSONArray events, @NotNull String externalDeviceId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(sakVersion, "sakVersion");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(externalDeviceId, "externalDeviceId");
        w.a aVar = new w.a(0);
        aVar.a("access_token", accessToken);
        aVar.a("v", "5.220");
        aVar.a("client_id", clientId);
        aVar.a("client_secret", clientSecret);
        aVar.a("sak_version", sakVersion);
        String jSONArray = events.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        aVar.a("events", jSONArray);
        return CreateRequestKt.createRequest(this.client, "https://api.vk.ru", "method/statEvents.addVKID", aVar.c(), C2454a.b("external_device_id", externalDeviceId));
    }

    @Override // com.vk.id.network.InternalVKIDApiContract
    @NotNull
    public InterfaceC4865g sendStatEventsAnonymously(@NotNull String clientId, @NotNull String clientSecret, @NotNull String sakVersion, @NotNull JSONArray events, @NotNull String externalDeviceId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(sakVersion, "sakVersion");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(externalDeviceId, "externalDeviceId");
        w.a aVar = new w.a(0);
        aVar.a("v", "5.220");
        aVar.a("client_id", clientId);
        aVar.a("client_secret", clientSecret);
        aVar.a("sak_version", sakVersion);
        String jSONArray = events.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        aVar.a("events", jSONArray);
        return CreateRequestKt.createRequest(this.client, "https://api.vk.ru", "method/statEvents.addVKIDAnonymously", aVar.c(), C2454a.b("external_device_id", externalDeviceId));
    }
}
