package com.blaze.blazesdk.app_configurations.models.recommendations;

import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.u0a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u0004\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u000b¨\u0006 "}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/recommendations/RecommendationsConfigurations;", "", "", "isSupportForYou", "isSupportTrending", "isSupportMoreLike", "enableForYouContentPreparation", "enableTrendingContentPreparation", "<init>", "(ZZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/blaze/blazesdk/app_configurations/models/recommendations/RecommendationsConfigurations;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnableForYouContentPreparation", "getEnableTrendingContentPreparation", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RecommendationsConfigurations {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enableForYouContentPreparation;
    private final boolean enableTrendingContentPreparation;
    private final boolean isSupportForYou;
    private final boolean isSupportMoreLike;
    private final boolean isSupportTrending;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.app_configurations.models.recommendations.RecommendationsConfigurations$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public RecommendationsConfigurations(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isSupportForYou = z;
        this.isSupportTrending = z2;
        this.isSupportMoreLike = z3;
        this.enableForYouContentPreparation = z4;
        this.enableTrendingContentPreparation = z5;
    }

    public static /* synthetic */ RecommendationsConfigurations copy$default(RecommendationsConfigurations recommendationsConfigurations, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recommendationsConfigurations.isSupportForYou;
        }
        if ((i & 2) != 0) {
            z2 = recommendationsConfigurations.isSupportTrending;
        }
        if ((i & 4) != 0) {
            z3 = recommendationsConfigurations.isSupportMoreLike;
        }
        if ((i & 8) != 0) {
            z4 = recommendationsConfigurations.enableForYouContentPreparation;
        }
        if ((i & 16) != 0) {
            z5 = recommendationsConfigurations.enableTrendingContentPreparation;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return recommendationsConfigurations.copy(z, z2, z7, z4, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSupportForYou() {
        return this.isSupportForYou;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSupportTrending() {
        return this.isSupportTrending;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSupportMoreLike() {
        return this.isSupportMoreLike;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableForYouContentPreparation() {
        return this.enableForYouContentPreparation;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnableTrendingContentPreparation() {
        return this.enableTrendingContentPreparation;
    }

    @NotNull
    public final RecommendationsConfigurations copy(boolean isSupportForYou, boolean isSupportTrending, boolean isSupportMoreLike, boolean enableForYouContentPreparation, boolean enableTrendingContentPreparation) {
        return new RecommendationsConfigurations(isSupportForYou, isSupportTrending, isSupportMoreLike, enableForYouContentPreparation, enableTrendingContentPreparation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsConfigurations)) {
            return false;
        }
        RecommendationsConfigurations recommendationsConfigurations = (RecommendationsConfigurations) other;
        return this.isSupportForYou == recommendationsConfigurations.isSupportForYou && this.isSupportTrending == recommendationsConfigurations.isSupportTrending && this.isSupportMoreLike == recommendationsConfigurations.isSupportMoreLike && this.enableForYouContentPreparation == recommendationsConfigurations.enableForYouContentPreparation && this.enableTrendingContentPreparation == recommendationsConfigurations.enableTrendingContentPreparation;
    }

    public final boolean getEnableForYouContentPreparation() {
        return this.enableForYouContentPreparation;
    }

    public final boolean getEnableTrendingContentPreparation() {
        return this.enableTrendingContentPreparation;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableTrendingContentPreparation) + u0a.t(u0a.t(u0a.t(Boolean.hashCode(this.isSupportForYou) * 31, this.isSupportTrending), this.isSupportMoreLike), this.enableForYouContentPreparation);
    }

    public final boolean isSupportForYou() {
        return this.isSupportForYou;
    }

    public final boolean isSupportMoreLike() {
        return this.isSupportMoreLike;
    }

    public final boolean isSupportTrending() {
        return this.isSupportTrending;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RecommendationsConfigurations(isSupportForYou=");
        sb.append(this.isSupportForYou);
        sb.append(", isSupportTrending=");
        sb.append(this.isSupportTrending);
        sb.append(", isSupportMoreLike=");
        sb.append(this.isSupportMoreLike);
        sb.append(", enableForYouContentPreparation=");
        sb.append(this.enableForYouContentPreparation);
        sb.append(", enableTrendingContentPreparation=");
        return lnb.r(sb, this.enableTrendingContentPreparation, ')');
    }
}
