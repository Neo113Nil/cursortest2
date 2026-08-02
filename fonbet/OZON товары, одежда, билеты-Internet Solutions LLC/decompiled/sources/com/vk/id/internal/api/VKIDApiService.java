package com.vk.id.internal.api;

import Sc.r;
import Sc.s;
import We.InterfaceC4865g;
import We.L;
import We.M;
import aa.C4989c;
import com.google.android.gms.common.Scopes;
import com.vk.id.VKIDInvalidTokenException;
import com.vk.id.internal.api.dto.VKIDUserInfoPayload;
import com.vk.id.internal.auth.VKIDTokenPayload;
import com.vk.id.internal.auth.app.VkAuthSilentAuthProvider;
import com.vk.id.network.InternalVKIDApiContract;
import com.vk.id.network.InternalVKIDCall;
import com.vk.id.network.InternalVKIDCallKt;
import ha.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import ma.C8120a;
import ma.C8121b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006 "}, d2 = {"Lcom/vk/id/internal/api/VKIDApiService;", "", "Lcom/vk/id/network/InternalVKIDApiContract;", "api", "<init>", "(Lcom/vk/id/network/InternalVKIDApiContract;)V", "LWe/g;", "Lcom/vk/id/network/InternalVKIDCall;", "Lcom/vk/id/internal/auth/VKIDTokenPayload;", "wrapTokenToVKIDCall", "(LWe/g;)Lcom/vk/id/network/InternalVKIDCall;", "", "code", "codeVerifier", "clientId", "deviceId", "redirectUri", "state", "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/network/InternalVKIDCall;", "accessToken", "Lcom/vk/id/internal/api/dto/VKIDUserInfoPayload;", "getUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/network/InternalVKIDCall;", "clientSecret", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "getSilentAuthProviders", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/id/network/InternalVKIDCall;", "", "logout", "Lcom/vk/id/network/InternalVKIDApiContract;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDApiService {

    @NotNull
    private final InternalVKIDApiContract api;

    public VKIDApiService(@NotNull InternalVKIDApiContract api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    public static final r getSilentAuthProviders$lambda$1(VKIDApiService vKIDApiService, L it) {
        ?? r02;
        Intrinsics.checkNotNullParameter(it, "it");
        r.Companion companion = r.INSTANCE;
        M c11 = it.c();
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONArray jSONArray = new JSONObject(c11.string()).getJSONArray("response");
        VkAuthSilentAuthProvider.Companion companion2 = VkAuthSilentAuthProvider.INSTANCE;
        if (jSONArray != null) {
            r02 = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                if (optJSONObject != null) {
                    r02.add(companion2.parse(optJSONObject));
                }
            }
        } else {
            r02 = 0;
        }
        if (r02 == 0) {
            r02 = K.f71697a;
        }
        return r.a(r02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r getUserInfo$lambda$0(L it) {
        Object a11;
        Intrinsics.checkNotNullParameter(it, "it");
        M c11 = it.c();
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(c11.string());
        if (jSONObject.isNull("error")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("user");
            r.Companion companion = r.INSTANCE;
            String optString = jSONObject2.optString("first_name");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String optString2 = jSONObject2.optString("last_name");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            String optString3 = jSONObject2.optString("phone");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
            String optString4 = jSONObject2.optString("avatar");
            Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
            String optString5 = jSONObject2.optString(Scopes.EMAIL);
            Intrinsics.checkNotNullExpressionValue(optString5, "optString(...)");
            a11 = new VKIDUserInfoPayload(optString, optString2, optString3, optString4, optString5);
        } else if (Intrinsics.d(jSONObject.getString("error"), "invalid_token")) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(new VKIDInvalidTokenException());
        } else {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(new IOException());
        }
        return r.a(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r logout$lambda$3(L it) {
        Object a11;
        Intrinsics.checkNotNullParameter(it, "it");
        M c11 = it.c();
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(c11.string());
        if (jSONObject.isNull("error")) {
            r.Companion companion = r.INSTANCE;
            a11 = Unit.f71690a;
        } else if (Intrinsics.d(jSONObject.getString("error"), "invalid_token")) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(new VKIDInvalidTokenException());
        } else {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(new IOException());
        }
        return r.a(a11);
    }

    private final InternalVKIDCall<VKIDTokenPayload> wrapTokenToVKIDCall(InterfaceC4865g interfaceC4865g) {
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(interfaceC4865g, new C4989c(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r wrapTokenToVKIDCall$lambda$6(L it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.c() == null) {
            throw new IOException("Empty body " + it.m() + " " + it);
        }
        M c11 = it.c();
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = c11.string();
        JSONObject jSONObject = new JSONObject(string);
        if (jSONObject.has("error")) {
            throw new IOException("Api error: " + it.m() + " " + string);
        }
        try {
            r.Companion companion = r.INSTANCE;
            String string2 = jSONObject.getString("access_token");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jSONObject.getString("refresh_token");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String optString = jSONObject.optString("id_token");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            long j11 = jSONObject.getLong("user_id");
            long optLong = jSONObject.optLong("expires_in");
            String optString2 = jSONObject.optString("state");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            String string4 = jSONObject.getString("scope");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return r.a(new VKIDTokenPayload(string2, string3, optString, optLong, j11, optString2, string4));
        } catch (JSONException e11) {
            throw new JSONException(e11.getMessage() + ": " + it.m() + " " + string);
        }
    }

    @NotNull
    public final InternalVKIDCall<List<VkAuthSilentAuthProvider>> getSilentAuthProviders(@NotNull String clientId, @NotNull String clientSecret) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(this.api.getSilentAuthProviders(clientId, clientSecret), new d(this, 2));
    }

    @NotNull
    public final InternalVKIDCall<VKIDTokenPayload> getToken(@NotNull String code, @NotNull String codeVerifier, @NotNull String clientId, @NotNull String deviceId, @NotNull String redirectUri, @NotNull String state) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(state, "state");
        return wrapTokenToVKIDCall(this.api.getToken(code, codeVerifier, clientId, deviceId, redirectUri, state));
    }

    @NotNull
    public final InternalVKIDCall<VKIDUserInfoPayload> getUserInfo(@NotNull String accessToken, @NotNull String clientId, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(this.api.getUser(accessToken, clientId, deviceId), new C8120a(0));
    }

    @NotNull
    public final InternalVKIDCall<Unit> logout(@NotNull String accessToken, @NotNull String clientId, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return InternalVKIDCallKt.internalVKIDWrapToVKIDCall(this.api.logout(accessToken, clientId, deviceId), new C8121b(0));
    }
}
