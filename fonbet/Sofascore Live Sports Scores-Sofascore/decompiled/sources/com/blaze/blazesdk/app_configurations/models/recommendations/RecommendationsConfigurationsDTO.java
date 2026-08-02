package com.blaze.blazesdk.app_configurations.models.recommendations;

import androidx.annotation.Keep;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/recommendations/RecommendationsConfigurationsDTO;", "", "supportForYou", "", "supportTrending", "supportMoreLike", "enableForYouContentPreparation", "enableTrendingContentPreparation", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSupportForYou", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSupportTrending", "getSupportMoreLike", "getEnableForYouContentPreparation", "getEnableTrendingContentPreparation", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/blaze/blazesdk/app_configurations/models/recommendations/RecommendationsConfigurationsDTO;", "equals", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RecommendationsConfigurationsDTO {
    public static final int $stable = 0;

    @b6h("enableForYouContentPreparation")
    @Nullable
    private final Boolean enableForYouContentPreparation;

    @b6h("enableTrendingContentPreparation")
    @Nullable
    private final Boolean enableTrendingContentPreparation;

    @b6h("supportForYou")
    @Nullable
    private final Boolean supportForYou;

    @b6h("supportMoreLike")
    @Nullable
    private final Boolean supportMoreLike;

    @b6h("supportTrending")
    @Nullable
    private final Boolean supportTrending;

    public /* synthetic */ RecommendationsConfigurationsDTO(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5);
    }

    public static /* synthetic */ RecommendationsConfigurationsDTO copy$default(RecommendationsConfigurationsDTO recommendationsConfigurationsDTO, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = recommendationsConfigurationsDTO.supportForYou;
        }
        if ((i & 2) != 0) {
            bool2 = recommendationsConfigurationsDTO.supportTrending;
        }
        if ((i & 4) != 0) {
            bool3 = recommendationsConfigurationsDTO.supportMoreLike;
        }
        if ((i & 8) != 0) {
            bool4 = recommendationsConfigurationsDTO.enableForYouContentPreparation;
        }
        if ((i & 16) != 0) {
            bool5 = recommendationsConfigurationsDTO.enableTrendingContentPreparation;
        }
        Boolean bool6 = bool5;
        Boolean bool7 = bool3;
        return recommendationsConfigurationsDTO.copy(bool, bool2, bool7, bool4, bool6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getSupportForYou() {
        return this.supportForYou;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getSupportTrending() {
        return this.supportTrending;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getSupportMoreLike() {
        return this.supportMoreLike;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getEnableForYouContentPreparation() {
        return this.enableForYouContentPreparation;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getEnableTrendingContentPreparation() {
        return this.enableTrendingContentPreparation;
    }

    @NotNull
    public final RecommendationsConfigurationsDTO copy(@Nullable Boolean supportForYou, @Nullable Boolean supportTrending, @Nullable Boolean supportMoreLike, @Nullable Boolean enableForYouContentPreparation, @Nullable Boolean enableTrendingContentPreparation) {
        return new RecommendationsConfigurationsDTO(supportForYou, supportTrending, supportMoreLike, enableForYouContentPreparation, enableTrendingContentPreparation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsConfigurationsDTO)) {
            return false;
        }
        RecommendationsConfigurationsDTO recommendationsConfigurationsDTO = (RecommendationsConfigurationsDTO) other;
        return Intrinsics.c(this.supportForYou, recommendationsConfigurationsDTO.supportForYou) && Intrinsics.c(this.supportTrending, recommendationsConfigurationsDTO.supportTrending) && Intrinsics.c(this.supportMoreLike, recommendationsConfigurationsDTO.supportMoreLike) && Intrinsics.c(this.enableForYouContentPreparation, recommendationsConfigurationsDTO.enableForYouContentPreparation) && Intrinsics.c(this.enableTrendingContentPreparation, recommendationsConfigurationsDTO.enableTrendingContentPreparation);
    }

    @Nullable
    public final Boolean getEnableForYouContentPreparation() {
        return this.enableForYouContentPreparation;
    }

    @Nullable
    public final Boolean getEnableTrendingContentPreparation() {
        return this.enableTrendingContentPreparation;
    }

    @Nullable
    public final Boolean getSupportForYou() {
        return this.supportForYou;
    }

    @Nullable
    public final Boolean getSupportMoreLike() {
        return this.supportMoreLike;
    }

    @Nullable
    public final Boolean getSupportTrending() {
        return this.supportTrending;
    }

    public int hashCode() {
        Boolean bool = this.supportForYou;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.supportTrending;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.supportMoreLike;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enableForYouContentPreparation;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.enableTrendingContentPreparation;
        return hashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecommendationsConfigurationsDTO(supportForYou=" + this.supportForYou + ", supportTrending=" + this.supportTrending + ", supportMoreLike=" + this.supportMoreLike + ", enableForYouContentPreparation=" + this.enableForYouContentPreparation + ", enableTrendingContentPreparation=" + this.enableTrendingContentPreparation + ')';
    }

    public RecommendationsConfigurationsDTO(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5) {
        this.supportForYou = bool;
        this.supportTrending = bool2;
        this.supportMoreLike = bool3;
        this.enableForYouContentPreparation = bool4;
        this.enableTrendingContentPreparation = bool5;
    }

    public RecommendationsConfigurationsDTO() {
        this(null, null, null, null, null, 31, null);
    }
}
