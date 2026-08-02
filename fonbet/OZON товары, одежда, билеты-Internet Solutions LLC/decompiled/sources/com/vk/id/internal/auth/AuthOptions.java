package com.vk.id.internal.auth;

import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import com.vk.id.OAuth;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b&\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b-\u0010\u0017R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b2\u0010\u0017¨\u00063"}, d2 = {"Lcom/vk/id/internal/auth/AuthOptions;", "", "", "appId", "codeChallenge", "codeChallengeMethod", "redirectUriCodeFlow", "redirectUriBrowser", "state", "locale", "theme", "", "webAuthPhoneScreen", "Lcom/vk/id/OAuth;", "oAuth", "prompt", "", "scopes", "statsInfo", "sdkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/vk/id/OAuth;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppId", "getCodeChallenge", "getCodeChallengeMethod", "getRedirectUriCodeFlow", "getRedirectUriBrowser", "getState", "getLocale", "getTheme", "Z", "getWebAuthPhoneScreen", "()Z", "Lcom/vk/id/OAuth;", "getOAuth", "()Lcom/vk/id/OAuth;", "getPrompt", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "getStatsInfo", "getSdkVersion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AuthOptions {

    @NotNull
    private final String appId;

    @NotNull
    private final String codeChallenge;

    @NotNull
    private final String codeChallengeMethod;
    private final String locale;
    private final OAuth oAuth;

    @NotNull
    private final String prompt;

    @NotNull
    private final String redirectUriBrowser;

    @NotNull
    private final String redirectUriCodeFlow;

    @NotNull
    private final Set<String> scopes;

    @NotNull
    private final String sdkVersion;

    @NotNull
    private final String state;

    @NotNull
    private final String statsInfo;
    private final String theme;
    private final boolean webAuthPhoneScreen;

    public AuthOptions(@NotNull String appId, @NotNull String codeChallenge, @NotNull String codeChallengeMethod, @NotNull String redirectUriCodeFlow, @NotNull String redirectUriBrowser, @NotNull String state, String str, String str2, boolean z11, OAuth oAuth, @NotNull String prompt, @NotNull Set<String> scopes, @NotNull String statsInfo, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        Intrinsics.checkNotNullParameter(redirectUriCodeFlow, "redirectUriCodeFlow");
        Intrinsics.checkNotNullParameter(redirectUriBrowser, "redirectUriBrowser");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(statsInfo, "statsInfo");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.appId = appId;
        this.codeChallenge = codeChallenge;
        this.codeChallengeMethod = codeChallengeMethod;
        this.redirectUriCodeFlow = redirectUriCodeFlow;
        this.redirectUriBrowser = redirectUriBrowser;
        this.state = state;
        this.locale = str;
        this.theme = str2;
        this.webAuthPhoneScreen = z11;
        this.oAuth = oAuth;
        this.prompt = prompt;
        this.scopes = scopes;
        this.statsInfo = statsInfo;
        this.sdkVersion = sdkVersion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthOptions)) {
            return false;
        }
        AuthOptions authOptions = (AuthOptions) other;
        return Intrinsics.d(this.appId, authOptions.appId) && Intrinsics.d(this.codeChallenge, authOptions.codeChallenge) && Intrinsics.d(this.codeChallengeMethod, authOptions.codeChallengeMethod) && Intrinsics.d(this.redirectUriCodeFlow, authOptions.redirectUriCodeFlow) && Intrinsics.d(this.redirectUriBrowser, authOptions.redirectUriBrowser) && Intrinsics.d(this.state, authOptions.state) && Intrinsics.d(this.locale, authOptions.locale) && Intrinsics.d(this.theme, authOptions.theme) && this.webAuthPhoneScreen == authOptions.webAuthPhoneScreen && this.oAuth == authOptions.oAuth && Intrinsics.d(this.prompt, authOptions.prompt) && Intrinsics.d(this.scopes, authOptions.scopes) && Intrinsics.d(this.statsInfo, authOptions.statsInfo) && Intrinsics.d(this.sdkVersion, authOptions.sdkVersion);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    @NotNull
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final OAuth getOAuth() {
        return this.oAuth;
    }

    @NotNull
    public final String getPrompt() {
        return this.prompt;
    }

    @NotNull
    public final String getRedirectUriBrowser() {
        return this.redirectUriBrowser;
    }

    @NotNull
    public final String getRedirectUriCodeFlow() {
        return this.redirectUriCodeFlow;
    }

    @NotNull
    public final Set<String> getScopes() {
        return this.scopes;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final String getStatsInfo() {
        return this.statsInfo;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final boolean getWebAuthPhoneScreen() {
        return this.webAuthPhoneScreen;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(g.a(g.a(this.appId.hashCode() * 31, 31, this.codeChallenge), 31, this.codeChallengeMethod), 31, this.redirectUriCodeFlow), 31, this.redirectUriBrowser), 31, this.state);
        String str = this.locale;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.theme;
        int a12 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.webAuthPhoneScreen);
        OAuth oAuth = this.oAuth;
        return this.sdkVersion.hashCode() + g.a((this.scopes.hashCode() + g.a((a12 + (oAuth != null ? oAuth.hashCode() : 0)) * 31, 31, this.prompt)) * 31, 31, this.statsInfo);
    }

    @NotNull
    public String toString() {
        String str = this.appId;
        String str2 = this.codeChallenge;
        String str3 = this.codeChallengeMethod;
        String str4 = this.redirectUriCodeFlow;
        String str5 = this.redirectUriBrowser;
        String str6 = this.state;
        String str7 = this.locale;
        String str8 = this.theme;
        boolean z11 = this.webAuthPhoneScreen;
        OAuth oAuth = this.oAuth;
        String str9 = this.prompt;
        Set<String> set = this.scopes;
        String str10 = this.statsInfo;
        String str11 = this.sdkVersion;
        StringBuilder d11 = C3660k.d("AuthOptions(appId=", str, ", codeChallenge=", str2, ", codeChallengeMethod=");
        a.h(d11, str3, ", redirectUriCodeFlow=", str4, ", redirectUriBrowser=");
        a.h(d11, str5, ", state=", str6, ", locale=");
        a.h(d11, str7, ", theme=", str8, ", webAuthPhoneScreen=");
        d11.append(z11);
        d11.append(", oAuth=");
        d11.append(oAuth);
        d11.append(", prompt=");
        d11.append(str9);
        d11.append(", scopes=");
        d11.append(set);
        d11.append(", statsInfo=");
        return C3173b.c(d11, str10, ", sdkVersion=", str11, ")");
    }
}
