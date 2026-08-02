package com.evervault.sdk;

import com.evervault.sdk.core.keys.CageKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J;\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013¨\u0006."}, d2 = {"Lcom/evervault/sdk/Config;", "", "teamId", "", "appId", "configUrls", "Lcom/evervault/sdk/ConfigUrls;", "publicKey", "(Ljava/lang/String;Ljava/lang/String;Lcom/evervault/sdk/ConfigUrls;Ljava/lang/String;)V", "encryption", "Lcom/evervault/sdk/EncryptionConfig;", "httpConfig", "Lcom/evervault/sdk/HttpConfig;", "debugKey", "Lcom/evervault/sdk/core/keys/CageKey;", "(Ljava/lang/String;Ljava/lang/String;Lcom/evervault/sdk/EncryptionConfig;Lcom/evervault/sdk/HttpConfig;Lcom/evervault/sdk/core/keys/CageKey;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getDebugKey", "()Lcom/evervault/sdk/core/keys/CageKey;", "setDebugKey", "(Lcom/evervault/sdk/core/keys/CageKey;)V", "getEncryption", "()Lcom/evervault/sdk/EncryptionConfig;", "setEncryption", "(Lcom/evervault/sdk/EncryptionConfig;)V", "getHttpConfig", "()Lcom/evervault/sdk/HttpConfig;", "setHttpConfig", "(Lcom/evervault/sdk/HttpConfig;)V", "getTeamId", "setTeamId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Config {

    @NotNull
    private String appId;

    @NotNull
    private CageKey debugKey;

    @NotNull
    private EncryptionConfig encryption;

    @NotNull
    private HttpConfig httpConfig;

    @NotNull
    private String teamId;

    public Config(@NotNull String teamId, @NotNull String appId, @NotNull EncryptionConfig encryption, @NotNull HttpConfig httpConfig, @NotNull CageKey debugKey) {
        Intrinsics.checkNotNullParameter(teamId, "teamId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(encryption, "encryption");
        Intrinsics.checkNotNullParameter(httpConfig, "httpConfig");
        Intrinsics.checkNotNullParameter(debugKey, "debugKey");
        this.teamId = teamId;
        this.appId = appId;
        this.encryption = encryption;
        this.httpConfig = httpConfig;
        this.debugKey = debugKey;
    }

    public static /* synthetic */ Config copy$default(Config config, String str, String str2, EncryptionConfig encryptionConfig, HttpConfig httpConfig, CageKey cageKey, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = config.teamId;
        }
        if ((i10 & 2) != 0) {
            str2 = config.appId;
        }
        if ((i10 & 4) != 0) {
            encryptionConfig = config.encryption;
        }
        if ((i10 & 8) != 0) {
            httpConfig = config.httpConfig;
        }
        if ((i10 & 16) != 0) {
            cageKey = config.debugKey;
        }
        CageKey cageKey2 = cageKey;
        EncryptionConfig encryptionConfig2 = encryptionConfig;
        return config.copy(str, str2, encryptionConfig2, httpConfig, cageKey2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTeamId() {
        return this.teamId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final EncryptionConfig getEncryption() {
        return this.encryption;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final HttpConfig getHttpConfig() {
        return this.httpConfig;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CageKey getDebugKey() {
        return this.debugKey;
    }

    @NotNull
    public final Config copy(@NotNull String teamId, @NotNull String appId, @NotNull EncryptionConfig encryption, @NotNull HttpConfig httpConfig, @NotNull CageKey debugKey) {
        Intrinsics.checkNotNullParameter(teamId, "teamId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(encryption, "encryption");
        Intrinsics.checkNotNullParameter(httpConfig, "httpConfig");
        Intrinsics.checkNotNullParameter(debugKey, "debugKey");
        return new Config(teamId, appId, encryption, httpConfig, debugKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return Intrinsics.areEqual(this.teamId, config.teamId) && Intrinsics.areEqual(this.appId, config.appId) && Intrinsics.areEqual(this.encryption, config.encryption) && Intrinsics.areEqual(this.httpConfig, config.httpConfig) && Intrinsics.areEqual(this.debugKey, config.debugKey);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final CageKey getDebugKey() {
        return this.debugKey;
    }

    @NotNull
    public final EncryptionConfig getEncryption() {
        return this.encryption;
    }

    @NotNull
    public final HttpConfig getHttpConfig() {
        return this.httpConfig;
    }

    @NotNull
    public final String getTeamId() {
        return this.teamId;
    }

    public int hashCode() {
        return (((((((this.teamId.hashCode() * 31) + this.appId.hashCode()) * 31) + this.encryption.hashCode()) * 31) + this.httpConfig.hashCode()) * 31) + this.debugKey.hashCode();
    }

    public final void setAppId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appId = str;
    }

    public final void setDebugKey(@NotNull CageKey cageKey) {
        Intrinsics.checkNotNullParameter(cageKey, "<set-?>");
        this.debugKey = cageKey;
    }

    public final void setEncryption(@NotNull EncryptionConfig encryptionConfig) {
        Intrinsics.checkNotNullParameter(encryptionConfig, "<set-?>");
        this.encryption = encryptionConfig;
    }

    public final void setHttpConfig(@NotNull HttpConfig httpConfig) {
        Intrinsics.checkNotNullParameter(httpConfig, "<set-?>");
        this.httpConfig = httpConfig;
    }

    public final void setTeamId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.teamId = str;
    }

    @NotNull
    public String toString() {
        return "Config(teamId=" + this.teamId + ", appId=" + this.appId + ", encryption=" + this.encryption + ", httpConfig=" + this.httpConfig + ", debugKey=" + this.debugKey + ")";
    }

    public /* synthetic */ Config(String str, String str2, EncryptionConfig encryptionConfig, HttpConfig httpConfig, CageKey cageKey, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, encryptionConfig, httpConfig, (i10 & 16) != 0 ? ConfigKt.DEBUG_KEY : cageKey);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(@NotNull String teamId, @NotNull String appId, @NotNull ConfigUrls configUrls, @Nullable String str) {
        this(teamId, appId, new EncryptionConfig(str, null, 0, 0, 0, null, null, 0, 0, 510, null), new HttpConfig(configUrls.getKeysUrl(), configUrls.getApiUrl()), null, 16, null);
        Intrinsics.checkNotNullParameter(teamId, "teamId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(configUrls, "configUrls");
    }
}
