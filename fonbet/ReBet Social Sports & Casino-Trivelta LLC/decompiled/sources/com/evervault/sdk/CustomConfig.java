package com.evervault.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/evervault/sdk/CustomConfig;", "", "isDebugMode", "", "urls", "Lcom/evervault/sdk/ConfigUrls;", "publicKey", "", "(Ljava/lang/Boolean;Lcom/evervault/sdk/ConfigUrls;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setDebugMode", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPublicKey", "()Ljava/lang/String;", "setPublicKey", "(Ljava/lang/String;)V", "getUrls", "()Lcom/evervault/sdk/ConfigUrls;", "setUrls", "(Lcom/evervault/sdk/ConfigUrls;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lcom/evervault/sdk/ConfigUrls;Ljava/lang/String;)Lcom/evervault/sdk/CustomConfig;", "equals", "other", "hashCode", "", "toString", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomConfig {

    @Nullable
    private Boolean isDebugMode;

    @Nullable
    private String publicKey;

    @Nullable
    private ConfigUrls urls;

    public CustomConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CustomConfig copy$default(CustomConfig customConfig, Boolean bool, ConfigUrls configUrls, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = customConfig.isDebugMode;
        }
        if ((i10 & 2) != 0) {
            configUrls = customConfig.urls;
        }
        if ((i10 & 4) != 0) {
            str = customConfig.publicKey;
        }
        return customConfig.copy(bool, configUrls, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsDebugMode() {
        return this.isDebugMode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ConfigUrls getUrls() {
        return this.urls;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final CustomConfig copy(@Nullable Boolean isDebugMode, @Nullable ConfigUrls urls, @Nullable String publicKey) {
        return new CustomConfig(isDebugMode, urls, publicKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomConfig)) {
            return false;
        }
        CustomConfig customConfig = (CustomConfig) other;
        return Intrinsics.areEqual(this.isDebugMode, customConfig.isDebugMode) && Intrinsics.areEqual(this.urls, customConfig.urls) && Intrinsics.areEqual(this.publicKey, customConfig.publicKey);
    }

    @Nullable
    public final String getPublicKey() {
        return this.publicKey;
    }

    @Nullable
    public final ConfigUrls getUrls() {
        return this.urls;
    }

    public int hashCode() {
        Boolean bool = this.isDebugMode;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ConfigUrls configUrls = this.urls;
        int hashCode2 = (hashCode + (configUrls == null ? 0 : configUrls.hashCode())) * 31;
        String str = this.publicKey;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDebugMode() {
        return this.isDebugMode;
    }

    public final void setDebugMode(@Nullable Boolean bool) {
        this.isDebugMode = bool;
    }

    public final void setPublicKey(@Nullable String str) {
        this.publicKey = str;
    }

    public final void setUrls(@Nullable ConfigUrls configUrls) {
        this.urls = configUrls;
    }

    @NotNull
    public String toString() {
        return "CustomConfig(isDebugMode=" + this.isDebugMode + ", urls=" + this.urls + ", publicKey=" + this.publicKey + ")";
    }

    public CustomConfig(@Nullable Boolean bool, @Nullable ConfigUrls configUrls, @Nullable String str) {
        this.isDebugMode = bool;
        this.urls = configUrls;
        this.publicKey = str;
    }

    public /* synthetic */ CustomConfig(Boolean bool, ConfigUrls configUrls, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : configUrls, (i10 & 4) != 0 ? null : str);
    }
}
