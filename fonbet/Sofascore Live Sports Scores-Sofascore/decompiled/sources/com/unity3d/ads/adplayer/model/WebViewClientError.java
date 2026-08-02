package com.unity3d.ads.adplayer.model;

import defpackage.bf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "", "url", "", "reason", "Lcom/unity3d/ads/adplayer/model/ErrorReason;", "statusCode", "", "<init>", "(Ljava/lang/String;Lcom/unity3d/ads/adplayer/model/ErrorReason;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getReason", "()Lcom/unity3d/ads/adplayer/model/ErrorReason;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/unity3d/ads/adplayer/model/ErrorReason;Ljava/lang/Integer;)Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class WebViewClientError {

    @NotNull
    private final ErrorReason reason;

    @Nullable
    private final Integer statusCode;

    @Nullable
    private final String url;

    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, errorReason, (i & 4) != 0 ? null : num);
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ErrorReason getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final WebViewClientError copy(@Nullable String url, @NotNull ErrorReason reason, @Nullable Integer statusCode) {
        reason.getClass();
        return new WebViewClientError(url, reason, statusCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewClientError)) {
            return false;
        }
        WebViewClientError webViewClientError = (WebViewClientError) other;
        return Intrinsics.c(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && Intrinsics.c(this.statusCode, webViewClientError.statusCode);
    }

    @NotNull
    public final ErrorReason getReason() {
        return this.reason;
    }

    @Nullable
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (this.reason.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Integer num = this.statusCode;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("WebViewClientError(url=");
        sb.append(this.url);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", statusCode=");
        return bf3.n(sb, this.statusCode, ')');
    }

    public WebViewClientError(@Nullable String str, @NotNull ErrorReason errorReason, @Nullable Integer num) {
        errorReason.getClass();
        this.url = str;
        this.reason = errorReason;
        this.statusCode = num;
    }
}
