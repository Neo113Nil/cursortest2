package com.evervault.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/evervault/sdk/HttpConfig;", "", "keysUrl", "", "apiUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getApiUrl", "()Ljava/lang/String;", "setApiUrl", "(Ljava/lang/String;)V", "getKeysUrl", "setKeysUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HttpConfig {

    @NotNull
    private String apiUrl;

    @NotNull
    private String keysUrl;

    public HttpConfig(@NotNull String keysUrl, @NotNull String apiUrl) {
        Intrinsics.checkNotNullParameter(keysUrl, "keysUrl");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        this.keysUrl = keysUrl;
        this.apiUrl = apiUrl;
    }

    public static /* synthetic */ HttpConfig copy$default(HttpConfig httpConfig, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = httpConfig.keysUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = httpConfig.apiUrl;
        }
        return httpConfig.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKeysUrl() {
        return this.keysUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getApiUrl() {
        return this.apiUrl;
    }

    @NotNull
    public final HttpConfig copy(@NotNull String keysUrl, @NotNull String apiUrl) {
        Intrinsics.checkNotNullParameter(keysUrl, "keysUrl");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        return new HttpConfig(keysUrl, apiUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpConfig)) {
            return false;
        }
        HttpConfig httpConfig = (HttpConfig) other;
        return Intrinsics.areEqual(this.keysUrl, httpConfig.keysUrl) && Intrinsics.areEqual(this.apiUrl, httpConfig.apiUrl);
    }

    @NotNull
    public final String getApiUrl() {
        return this.apiUrl;
    }

    @NotNull
    public final String getKeysUrl() {
        return this.keysUrl;
    }

    public int hashCode() {
        return (this.keysUrl.hashCode() * 31) + this.apiUrl.hashCode();
    }

    public final void setApiUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apiUrl = str;
    }

    public final void setKeysUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.keysUrl = str;
    }

    @NotNull
    public String toString() {
        return "HttpConfig(keysUrl=" + this.keysUrl + ", apiUrl=" + this.apiUrl + ")";
    }
}
