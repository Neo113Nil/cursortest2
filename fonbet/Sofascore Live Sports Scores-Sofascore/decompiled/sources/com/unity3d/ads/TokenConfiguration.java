package com.unity3d.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.lm5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bBa\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\"¨\u0006$"}, d2 = {"Lcom/unity3d/ads/TokenConfiguration;", "", "adFormat", "Lcom/unity3d/ads/AdFormat;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "<init>", "(Lcom/unity3d/ads/AdFormat;Ljava/util/Map;)V", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "placementId", "bannerSize", "Lcom/unity3d/ads/BannerSize;", "mediationAdUnitId", "isNewApi", "", "(Lcom/unity3d/ads/AdFormat;Lcom/unity3d/ads/MediationInfo;Ljava/lang/String;Lcom/unity3d/ads/BannerSize;Ljava/lang/String;Ljava/util/Map;Z)V", "getAdFormat", "()Lcom/unity3d/ads/AdFormat;", "getExtras", "()Ljava/util/Map;", "_mediationInfo", "_placementId", "_bannerSize", "_mediationAdUnitId", "_isNewApi", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getPlacementId", "()Ljava/lang/String;", "getBannerSize", "()Lcom/unity3d/ads/BannerSize;", "getMediationAdUnitId", "()Z", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TokenConfiguration {

    @Nullable
    private BannerSize _bannerSize;
    private boolean _isNewApi;

    @Nullable
    private String _mediationAdUnitId;

    @Nullable
    private MediationInfo _mediationInfo;

    @Nullable
    private String _placementId;

    @NotNull
    private final AdFormat adFormat;

    @NotNull
    private final Map<String, String> extras;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0013\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eJ\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/TokenConfiguration$Builder;", "", "adFormat", "Lcom/unity3d/ads/AdFormat;", "<init>", "(Lcom/unity3d/ads/AdFormat;)V", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "placementId", "", "bannerSize", "Lcom/unity3d/ads/BannerSize;", "mediationAdUnitId", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "withMediationInfo", "withPlacementId", "withBannerSize", "withMediationAdUnitId", "withExtras", "build", "Lcom/unity3d/ads/TokenConfiguration;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final AdFormat adFormat;

        @Nullable
        private BannerSize bannerSize;

        @NotNull
        private Map<String, String> extras;

        @Nullable
        private String mediationAdUnitId;

        @Nullable
        private MediationInfo mediationInfo;

        @Nullable
        private String placementId;

        public Builder(@NotNull AdFormat adFormat) {
            adFormat.getClass();
            this.adFormat = adFormat;
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            this.extras = lm5Var;
        }

        @NotNull
        public final TokenConfiguration build() {
            return new TokenConfiguration(this.adFormat, this.mediationInfo, this.placementId, this.bannerSize, this.mediationAdUnitId, this.extras, true, null);
        }

        @NotNull
        public final Builder withBannerSize(@Nullable BannerSize bannerSize) {
            this.bannerSize = bannerSize;
            return this;
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> extras) {
            extras.getClass();
            this.extras = extras;
            return this;
        }

        @NotNull
        public final Builder withMediationAdUnitId(@Nullable String mediationAdUnitId) {
            this.mediationAdUnitId = mediationAdUnitId;
            return this;
        }

        @NotNull
        public final Builder withMediationInfo(@Nullable MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }

        @NotNull
        public final Builder withPlacementId(@Nullable String placementId) {
            this.placementId = placementId;
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, mediationInfo, str, bannerSize, str2, map, (i & 64) != 0 ? false : z);
        mediationInfo = (i & 2) != 0 ? null : mediationInfo;
        str = (i & 4) != 0 ? null : str;
        bannerSize = (i & 8) != 0 ? null : bannerSize;
        str2 = (i & 16) != 0 ? null : str2;
        if ((i & 32) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    @NotNull
    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    /* renamed from: getBannerSize, reason: from getter */
    public final BannerSize get_bannerSize() {
        return this._bannerSize;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @Nullable
    /* renamed from: getMediationAdUnitId, reason: from getter */
    public final String get_mediationAdUnitId() {
        return this._mediationAdUnitId;
    }

    @Nullable
    /* renamed from: getMediationInfo, reason: from getter */
    public final MediationInfo get_mediationInfo() {
        return this._mediationInfo;
    }

    @Nullable
    /* renamed from: getPlacementId, reason: from getter */
    public final String get_placementId() {
        return this._placementId;
    }

    /* renamed from: isNewApi, reason: from getter */
    public final boolean get_isNewApi() {
        return this._isNewApi;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map map, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, mediationInfo, str, bannerSize, str2, map, z);
    }

    public TokenConfiguration(@NotNull AdFormat adFormat, @NotNull Map<String, String> map) {
        adFormat.getClass();
        map.getClass();
        this.adFormat = adFormat;
        this.extras = map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenConfiguration(@NotNull AdFormat adFormat) {
        this(adFormat, null, 2, null);
        adFormat.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TokenConfiguration(AdFormat adFormat, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, map);
        if ((i & 2) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    private TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map<String, String> map, boolean z) {
        this(adFormat, map);
        this._mediationInfo = mediationInfo;
        this._placementId = str;
        this._bannerSize = bannerSize;
        this._mediationAdUnitId = str2;
        this._isNewApi = z;
    }
}
