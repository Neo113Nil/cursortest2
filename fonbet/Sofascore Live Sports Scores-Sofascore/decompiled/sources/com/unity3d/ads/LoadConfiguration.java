package com.unity3d.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.lm5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0014BC\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/LoadConfiguration;", "", "placementId", "", "adMarkup", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "mediationAdUnitId", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/MediationInfo;Ljava/lang/String;Ljava/util/Map;)V", "getPlacementId", "()Ljava/lang/String;", "getAdMarkup", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getMediationAdUnitId", "getExtras", "()Ljava/util/Map;", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadConfiguration {

    @Nullable
    private final String adMarkup;

    @NotNull
    private final Map<String, String> extras;

    @Nullable
    private final String mediationAdUnitId;

    @Nullable
    private final MediationInfo mediationInfo;

    @NotNull
    private final String placementId;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003J\u001a\u0010\u000f\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/LoadConfiguration$Builder;", "", "placementId", "", "<init>", "(Ljava/lang/String;)V", "getPlacementId", "()Ljava/lang/String;", "adMarkup", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "mediationAdUnitId", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "withAdMarkup", "withExtras", "withMediationInfo", "withMediationAdUnitId", "build", "Lcom/unity3d/ads/LoadConfiguration;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String adMarkup;

        @NotNull
        private Map<String, String> extras;

        @Nullable
        private String mediationAdUnitId;

        @Nullable
        private MediationInfo mediationInfo;

        @NotNull
        private final String placementId;

        public Builder(@NotNull String str) {
            str.getClass();
            this.placementId = str;
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            this.extras = lm5Var;
        }

        @NotNull
        public final LoadConfiguration build() {
            return new LoadConfiguration(this.placementId, this.adMarkup, this.mediationInfo, this.mediationAdUnitId, this.extras, null);
        }

        @NotNull
        public final String getPlacementId() {
            return this.placementId;
        }

        @NotNull
        public final Builder withAdMarkup(@NotNull String adMarkup) {
            adMarkup.getClass();
            this.adMarkup = adMarkup;
            return this;
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> extras) {
            extras.getClass();
            this.extras = extras;
            return this;
        }

        @NotNull
        public final Builder withMediationAdUnitId(@NotNull String mediationAdUnitId) {
            mediationAdUnitId.getClass();
            this.mediationAdUnitId = mediationAdUnitId;
            return this;
        }

        @NotNull
        public final Builder withMediationInfo(@NotNull MediationInfo mediationInfo) {
            mediationInfo.getClass();
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    private LoadConfiguration(String str, String str2, MediationInfo mediationInfo, String str3, Map<String, String> map) {
        this.placementId = str;
        this.adMarkup = str2;
        this.mediationInfo = mediationInfo;
        this.mediationAdUnitId = str3;
        this.extras = map;
    }

    @Nullable
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    @Nullable
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ LoadConfiguration(String str, String str2, MediationInfo mediationInfo, String str3, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, mediationInfo, str3, map);
    }
}
