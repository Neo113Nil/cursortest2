package ru.ozon.id.core;

import K1.G;
import Kk.C3532b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/id/core/FeatureFlagConf;", "", "forceMobileIdOverCellular", "", "allowedWebViewDomains", "", "webViewForceCastHttpInHttps", "shouldLogSharedSessionError", "<init>", "(ZLjava/lang/String;ZLjava/lang/Boolean;)V", "getForceMobileIdOverCellular", "()Z", "getAllowedWebViewDomains", "()Ljava/lang/String;", "getWebViewForceCastHttpInHttps", "getShouldLogSharedSessionError", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;ZLjava/lang/Boolean;)Lru/ozon/id/core/FeatureFlagConf;", "equals", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FeatureFlagConf {
    private final String allowedWebViewDomains;
    private final boolean forceMobileIdOverCellular;
    private final Boolean shouldLogSharedSessionError;
    private final boolean webViewForceCastHttpInHttps;

    public FeatureFlagConf(boolean z11, String str, boolean z12, Boolean bool) {
        this.forceMobileIdOverCellular = z11;
        this.allowedWebViewDomains = str;
        this.webViewForceCastHttpInHttps = z12;
        this.shouldLogSharedSessionError = bool;
    }

    public static /* synthetic */ FeatureFlagConf copy$default(FeatureFlagConf featureFlagConf, boolean z11, String str, boolean z12, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = featureFlagConf.forceMobileIdOverCellular;
        }
        if ((i11 & 2) != 0) {
            str = featureFlagConf.allowedWebViewDomains;
        }
        if ((i11 & 4) != 0) {
            z12 = featureFlagConf.webViewForceCastHttpInHttps;
        }
        if ((i11 & 8) != 0) {
            bool = featureFlagConf.shouldLogSharedSessionError;
        }
        return featureFlagConf.copy(z11, str, z12, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getForceMobileIdOverCellular() {
        return this.forceMobileIdOverCellular;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAllowedWebViewDomains() {
        return this.allowedWebViewDomains;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getWebViewForceCastHttpInHttps() {
        return this.webViewForceCastHttpInHttps;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getShouldLogSharedSessionError() {
        return this.shouldLogSharedSessionError;
    }

    @NotNull
    public final FeatureFlagConf copy(boolean forceMobileIdOverCellular, String allowedWebViewDomains, boolean webViewForceCastHttpInHttps, Boolean shouldLogSharedSessionError) {
        return new FeatureFlagConf(forceMobileIdOverCellular, allowedWebViewDomains, webViewForceCastHttpInHttps, shouldLogSharedSessionError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlagConf)) {
            return false;
        }
        FeatureFlagConf featureFlagConf = (FeatureFlagConf) other;
        return this.forceMobileIdOverCellular == featureFlagConf.forceMobileIdOverCellular && Intrinsics.d(this.allowedWebViewDomains, featureFlagConf.allowedWebViewDomains) && this.webViewForceCastHttpInHttps == featureFlagConf.webViewForceCastHttpInHttps && Intrinsics.d(this.shouldLogSharedSessionError, featureFlagConf.shouldLogSharedSessionError);
    }

    public final String getAllowedWebViewDomains() {
        return this.allowedWebViewDomains;
    }

    public final boolean getForceMobileIdOverCellular() {
        return this.forceMobileIdOverCellular;
    }

    public final Boolean getShouldLogSharedSessionError() {
        return this.shouldLogSharedSessionError;
    }

    public final boolean getWebViewForceCastHttpInHttps() {
        return this.webViewForceCastHttpInHttps;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.forceMobileIdOverCellular) * 31;
        String str = this.allowedWebViewDomains;
        int a11 = C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.webViewForceCastHttpInHttps);
        Boolean bool = this.shouldLogSharedSessionError;
        return a11 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.forceMobileIdOverCellular;
        String str = this.allowedWebViewDomains;
        boolean z12 = this.webViewForceCastHttpInHttps;
        Boolean bool = this.shouldLogSharedSessionError;
        StringBuilder d11 = G.d("FeatureFlagConf(forceMobileIdOverCellular=", ", allowedWebViewDomains=", str, ", webViewForceCastHttpInHttps=", z11);
        d11.append(z12);
        d11.append(", shouldLogSharedSessionError=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ FeatureFlagConf(boolean z11, String str, boolean z12, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? null : bool);
    }
}
