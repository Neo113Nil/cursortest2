package com.vk.id;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.net.Uri;
import com.vk.id.auth.Prompt;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.internal.auth.AuthOptions;
import com.vk.id.internal.auth.AuthOptionsKt;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.pkce.PkceGeneratorSHA256;
import com.vk.id.internal.state.StateGenerator;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import java.security.SecureRandom;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/vk/id/AuthOptionsCreator;", "", "Landroid/content/Context;", "appContext", "LSc/j;", "Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;", "pkceGenerator", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/state/StateGenerator;", "stateGenerator", "<init>", "(Landroid/content/Context;LSc/j;LSc/j;LSc/j;Lcom/vk/id/internal/state/StateGenerator;)V", "Lcom/vk/id/auth/VKIDAuthParams;", "authParams", "Lcom/vk/id/StatParams;", "statParams", "Lcom/vk/id/internal/auth/AuthOptions;", "create$vkid_release", "(Lcom/vk/id/auth/VKIDAuthParams;Lcom/vk/id/StatParams;)Lcom/vk/id/internal/auth/AuthOptions;", "create", "Landroid/content/Context;", "LSc/j;", "Lcom/vk/id/internal/state/StateGenerator;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthOptionsCreator {

    @NotNull
    private final Context appContext;

    @NotNull
    private final InterfaceC4008j<PkceGeneratorSHA256> pkceGenerator;

    @NotNull
    private final InterfaceC4008j<InternalVKIDPrefsStore> prefsStore;

    @NotNull
    private final InterfaceC4008j<ServiceCredentials> serviceCredentials;

    @NotNull
    private final StateGenerator stateGenerator;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Prompt.values().length];
            try {
                iArr[Prompt.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Prompt.CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AuthOptionsCreator(@NotNull Context appContext, @NotNull InterfaceC4008j<PkceGeneratorSHA256> pkceGenerator, @NotNull InterfaceC4008j<InternalVKIDPrefsStore> prefsStore, @NotNull InterfaceC4008j<ServiceCredentials> serviceCredentials, @NotNull StateGenerator stateGenerator) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(pkceGenerator, "pkceGenerator");
        Intrinsics.checkNotNullParameter(prefsStore, "prefsStore");
        Intrinsics.checkNotNullParameter(serviceCredentials, "serviceCredentials");
        Intrinsics.checkNotNullParameter(stateGenerator, "stateGenerator");
        this.appContext = appContext;
        this.pkceGenerator = pkceGenerator;
        this.prefsStore = prefsStore;
        this.serviceCredentials = serviceCredentials;
        this.stateGenerator = stateGenerator;
    }

    @NotNull
    public final AuthOptions create$vkid_release(@NotNull VKIDAuthParams authParams, @NotNull StatParams statParams) {
        String base64;
        JSONObject createStatsInfo;
        String base642;
        String base643;
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        Intrinsics.checkNotNullParameter(statParams, "statParams");
        String codeChallenge = authParams.getCodeChallenge();
        if (codeChallenge == null) {
            String generateRandomCodeVerifier = this.pkceGenerator.getValue().generateRandomCodeVerifier(new SecureRandom());
            this.prefsStore.getValue().setCodeVerifier$vkid_release(generateRandomCodeVerifier);
            codeChallenge = this.pkceGenerator.getValue().deriveCodeVerifierChallenge(generateRandomCodeVerifier);
        }
        String str = codeChallenge;
        String state = authParams.getState();
        if (state != null) {
            this.prefsStore.getValue().setState(state);
        } else {
            state = this.stateGenerator.regenerateState();
        }
        String str2 = state;
        VKIDAuthParams.Locale locale = authParams.getLocale();
        if (locale == null) {
            locale = VKIDAuthParams.Locale.INSTANCE.systemLocale$vkid_release(this.appContext);
        }
        VKIDAuthParams.Theme theme = authParams.getTheme();
        if (theme == null) {
            theme = VKIDAuthParams.Theme.INSTANCE.systemTheme(this.appContext);
        }
        ServiceCredentials value = this.serviceCredentials.getValue();
        JSONObject jSONObject = new JSONObject();
        AuthOptionsCreatorKt.addOAuthParams(jSONObject, authParams.getScopes$vkid_release());
        Uri parse = Uri.parse(value.getRedirectUri());
        Uri.Builder buildUpon = parse.buildUpon();
        base64 = AuthOptionsCreatorKt.toBase64(jSONObject);
        buildUpon.appendQueryParameter("oauth2_params", base64);
        Uri.Builder buildUpon2 = parse.buildUpon();
        createStatsInfo = AuthOptionsCreatorKt.createStatsInfo(statParams);
        AuthOptionsCreatorKt.addStatParams(jSONObject, createStatsInfo);
        base642 = AuthOptionsCreatorKt.toBase64(jSONObject);
        buildUpon2.appendQueryParameter("oauth2_params", base642);
        buildUpon2.appendQueryParameter("v", "2.9.0");
        String clientID = value.getClientID();
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        String builder2 = buildUpon2.toString();
        Intrinsics.checkNotNullExpressionValue(builder2, "toString(...)");
        String queryParam = locale != null ? AuthOptionsKt.toQueryParam(locale) : null;
        String queryParam2 = theme != null ? AuthOptionsKt.toQueryParam(theme) : null;
        boolean z11 = !authParams.getUseOAuthProviderIfPossible();
        OAuth oAuth = authParams.getOAuth();
        int i11 = WhenMappings.$EnumSwitchMapping$0[authParams.getPrompt().ordinal()];
        String str3 = i11 != 1 ? i11 != 2 ? "" : "consent" : "login";
        Set<String> scopes$vkid_release = authParams.getScopes$vkid_release();
        base643 = AuthOptionsCreatorKt.toBase64(createStatsInfo);
        return new AuthOptions(clientID, str, "sha256", builder2, builder, str2, queryParam, queryParam2, z11, oAuth, str3, scopes$vkid_release, base643, "2.9.0");
    }
}
