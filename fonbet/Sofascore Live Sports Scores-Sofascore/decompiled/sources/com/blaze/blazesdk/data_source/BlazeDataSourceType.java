package com.blaze.blazesdk.data_source;

import androidx.annotation.Keep;
import defpackage.f1m;
import defpackage.mz1;
import defpackage.tdm;
import defpackage.zzl;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "", "<init>", "()V", "", "getStringRepresentation$blazesdk_release", "()Ljava/lang/String;", "stringRepresentation", "getAnalyticsLabelExpressionRepresentation$blazesdk_release", "analyticsLabelExpressionRepresentation", "Labels", "Ids", "Search", "Recommendations", "RemoteConfig", "a", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$a;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Ids;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Labels;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Recommendations;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$RemoteConfig;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Search;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeDataSourceType {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Recommendations;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "type", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType;", "<init>", "(Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType;)V", "getType", "()Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType;", "setType", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Recommendations extends BlazeDataSourceType {
        public static final int $stable = 8;

        @NotNull
        private BlazeRecommendationsType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Recommendations(@NotNull BlazeRecommendationsType blazeRecommendationsType) {
            super(null);
            blazeRecommendationsType.getClass();
            this.type = blazeRecommendationsType;
        }

        public static /* synthetic */ Recommendations copy$default(Recommendations recommendations, BlazeRecommendationsType blazeRecommendationsType, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeRecommendationsType = recommendations.type;
            }
            return recommendations.copy(blazeRecommendationsType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BlazeRecommendationsType getType() {
            return this.type;
        }

        @NotNull
        public final Recommendations copy(@NotNull BlazeRecommendationsType type) {
            type.getClass();
            return new Recommendations(type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Recommendations) && Intrinsics.c(this.type, ((Recommendations) other).type);
        }

        @NotNull
        public final BlazeRecommendationsType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public final void setType(@NotNull BlazeRecommendationsType blazeRecommendationsType) {
            blazeRecommendationsType.getClass();
            this.type = blazeRecommendationsType;
        }

        @NotNull
        public String toString() {
            return "Recommendations(type=" + this.type + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends BlazeDataSourceType {
        public final BlazeDirectMediaSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull BlazeDirectMediaSource blazeDirectMediaSource) {
            super(null);
            blazeDirectMediaSource.getClass();
            this.a = blazeDirectMediaSource;
        }
    }

    public /* synthetic */ BlazeDataSourceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final String getAnalyticsLabelExpressionRepresentation$blazesdk_release() {
        String str;
        if (this instanceof Labels) {
            StringBuilder sb = new StringBuilder();
            Labels labels = (Labels) this;
            sb.append(labels.getBlazeWidgetLabel().getStringLabelExpression());
            BlazeDataSourcePersonalizedType personalizedType = labels.getPersonalizedType();
            if (personalizedType != null) {
                str = ", personalized: " + personalizedType.getStringRepresentation$blazesdk_release();
            } else {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }
        if (this instanceof Ids) {
            return null;
        }
        if (!(this instanceof Search)) {
            if (this instanceof Recommendations) {
                return ((Recommendations) this).getType().getAnalyticsName$blazesdk_release();
            }
            if (this instanceof RemoteConfig) {
                throw f1m.a;
            }
            if (this instanceof a) {
                return ((a) this).a.getAnalyticsRepresentation$blazesdk_release();
            }
            zzl.b();
            return null;
        }
        StringBuilder sb2 = new StringBuilder("search - ");
        Search search = (Search) this;
        sb2.append(search.getSearchText());
        String sb3 = sb2.toString();
        BlazeWidgetLabel blazeWidgetLabel = search.getBlazeWidgetLabel();
        if (blazeWidgetLabel == null || StringsKt.R(blazeWidgetLabel.getStringLabelExpression())) {
            return sb3;
        }
        StringBuilder r = mz1.r(sb3, " (labels: ");
        r.append(blazeWidgetLabel.getStringLabelExpression());
        r.append(')');
        return r.toString();
    }

    @NotNull
    public final String getStringRepresentation$blazesdk_release() {
        if (this instanceof Labels) {
            return ((Labels) this).getBlazeWidgetLabel().getStringLabelExpression();
        }
        if (this instanceof Ids) {
            return CollectionsKt.f0(((Ids) this).getIds(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
        }
        if (!(this instanceof Search)) {
            if (this instanceof Recommendations) {
                return ((Recommendations) this).getType().getStringRepresentation$blazesdk_release();
            }
            if (this instanceof RemoteConfig) {
                throw f1m.a;
            }
            if (this instanceof a) {
                return ((a) this).a.getStringRepresentation$blazesdk_release();
            }
            zzl.b();
            return null;
        }
        StringBuilder sb = new StringBuilder("text: ");
        Search search = (Search) this;
        sb.append(search.getSearchText());
        String sb2 = sb.toString();
        BlazeWidgetLabel blazeWidgetLabel = search.getBlazeWidgetLabel();
        if (blazeWidgetLabel == null || StringsKt.R(blazeWidgetLabel.getStringLabelExpression())) {
            return sb2;
        }
        StringBuilder r = mz1.r(sb2, ", labels: ");
        r.append(blazeWidgetLabel.getStringLabelExpression());
        return r.toString();
    }

    private BlazeDataSourceType() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$RemoteConfig;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "fallbackDataSourceType", "<init>", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;)V", "getFallbackDataSourceType", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "setFallbackDataSourceType", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoteConfig extends BlazeDataSourceType {
        public static final int $stable = 8;

        @Nullable
        private BlazeDataSourceType fallbackDataSourceType;

        public /* synthetic */ RemoteConfig(BlazeDataSourceType blazeDataSourceType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : blazeDataSourceType);
        }

        public static /* synthetic */ RemoteConfig copy$default(RemoteConfig remoteConfig, BlazeDataSourceType blazeDataSourceType, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeDataSourceType = remoteConfig.fallbackDataSourceType;
            }
            return remoteConfig.copy(blazeDataSourceType);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final BlazeDataSourceType getFallbackDataSourceType() {
            return this.fallbackDataSourceType;
        }

        @NotNull
        public final RemoteConfig copy(@Nullable BlazeDataSourceType fallbackDataSourceType) {
            return new RemoteConfig(fallbackDataSourceType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoteConfig) && Intrinsics.c(this.fallbackDataSourceType, ((RemoteConfig) other).fallbackDataSourceType);
        }

        @Nullable
        public final BlazeDataSourceType getFallbackDataSourceType() {
            return this.fallbackDataSourceType;
        }

        public int hashCode() {
            BlazeDataSourceType blazeDataSourceType = this.fallbackDataSourceType;
            if (blazeDataSourceType == null) {
                return 0;
            }
            return blazeDataSourceType.hashCode();
        }

        public final void setFallbackDataSourceType(@Nullable BlazeDataSourceType blazeDataSourceType) {
            this.fallbackDataSourceType = blazeDataSourceType;
        }

        @NotNull
        public String toString() {
            return "RemoteConfig(fallbackDataSourceType=" + this.fallbackDataSourceType + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public RemoteConfig(@Nullable BlazeDataSourceType blazeDataSourceType) {
            super(null);
            this.fallbackDataSourceType = blazeDataSourceType;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Ids;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "Ltdm;", "", "", "ids", "Lcom/blaze/blazesdk/data_source/BlazeOrderType;", "orderType", "Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;", "advancedOrderType", "<init>", "(Ljava/util/List;Lcom/blaze/blazesdk/data_source/BlazeOrderType;Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/blaze/blazesdk/data_source/BlazeOrderType;", "component3", "()Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;", "copy", "(Ljava/util/List;Lcom/blaze/blazesdk/data_source/BlazeOrderType;Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;)Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Ids;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getIds", "setIds", "(Ljava/util/List;)V", "Lcom/blaze/blazesdk/data_source/BlazeOrderType;", "getOrderType", "setOrderType", "(Lcom/blaze/blazesdk/data_source/BlazeOrderType;)V", "Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;", "getAdvancedOrderType", "setAdvancedOrderType", "(Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ids extends BlazeDataSourceType implements tdm {
        public static final int $stable = 8;

        @Nullable
        private BlazeAdvancedOrderType advancedOrderType;

        @NotNull
        private List<String> ids;

        @Nullable
        private BlazeOrderType orderType;

        public /* synthetic */ Ids(List list, BlazeOrderType blazeOrderType, BlazeAdvancedOrderType blazeAdvancedOrderType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : blazeOrderType, (i & 4) != 0 ? null : blazeAdvancedOrderType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ids copy$default(Ids ids, List list, BlazeOrderType blazeOrderType, BlazeAdvancedOrderType blazeAdvancedOrderType, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ids.ids;
            }
            if ((i & 2) != 0) {
                blazeOrderType = ids.orderType;
            }
            if ((i & 4) != 0) {
                blazeAdvancedOrderType = ids.advancedOrderType;
            }
            return ids.copy(list, blazeOrderType, blazeAdvancedOrderType);
        }

        @NotNull
        public final List<String> component1() {
            return this.ids;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final BlazeOrderType getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final BlazeAdvancedOrderType getAdvancedOrderType() {
            return this.advancedOrderType;
        }

        @NotNull
        public final Ids copy(@NotNull List<String> ids, @Nullable BlazeOrderType orderType, @Nullable BlazeAdvancedOrderType advancedOrderType) {
            ids.getClass();
            return new Ids(ids, orderType, advancedOrderType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ids)) {
                return false;
            }
            Ids ids = (Ids) other;
            return Intrinsics.c(this.ids, ids.ids) && this.orderType == ids.orderType && Intrinsics.c(this.advancedOrderType, ids.advancedOrderType);
        }

        @Override // defpackage.tdm
        @Nullable
        public BlazeAdvancedOrderType getAdvancedOrderType() {
            return this.advancedOrderType;
        }

        @NotNull
        public final List<String> getIds() {
            return this.ids;
        }

        @Nullable
        public BlazeOrderType getOrderType() {
            return this.orderType;
        }

        public int hashCode() {
            int hashCode = this.ids.hashCode() * 31;
            BlazeOrderType blazeOrderType = this.orderType;
            int hashCode2 = (hashCode + (blazeOrderType == null ? 0 : blazeOrderType.hashCode())) * 31;
            BlazeAdvancedOrderType blazeAdvancedOrderType = this.advancedOrderType;
            return hashCode2 + (blazeAdvancedOrderType != null ? blazeAdvancedOrderType.hashCode() : 0);
        }

        public void setAdvancedOrderType(@Nullable BlazeAdvancedOrderType blazeAdvancedOrderType) {
            this.advancedOrderType = blazeAdvancedOrderType;
        }

        public final void setIds(@NotNull List<String> list) {
            list.getClass();
            this.ids = list;
        }

        public void setOrderType(@Nullable BlazeOrderType blazeOrderType) {
            this.orderType = blazeOrderType;
        }

        @NotNull
        public String toString() {
            return "Ids(ids=" + this.ids + ", orderType=" + this.orderType + ", advancedOrderType=" + this.advancedOrderType + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ids(@NotNull List<String> list, @Nullable BlazeOrderType blazeOrderType, @Nullable BlazeAdvancedOrderType blazeAdvancedOrderType) {
            super(null);
            list.getClass();
            this.ids = list;
            this.orderType = blazeOrderType;
            this.advancedOrderType = blazeAdvancedOrderType;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Search;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "searchText", "", "maxItems", "", "blazeWidgetLabel", "Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;)V", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "getMaxItems", "()Ljava/lang/Integer;", "setMaxItems", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBlazeWidgetLabel", "()Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "setBlazeWidgetLabel", "(Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;)Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Search;", "equals", "", "other", "", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Search extends BlazeDataSourceType {
        public static final int $stable = 8;

        @Nullable
        private BlazeWidgetLabel blazeWidgetLabel;

        @Nullable
        private Integer maxItems;

        @NotNull
        private String searchText;

        public /* synthetic */ Search(String str, Integer num, BlazeWidgetLabel blazeWidgetLabel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : blazeWidgetLabel);
        }

        public static /* synthetic */ Search copy$default(Search search, String str, Integer num, BlazeWidgetLabel blazeWidgetLabel, int i, Object obj) {
            if ((i & 1) != 0) {
                str = search.searchText;
            }
            if ((i & 2) != 0) {
                num = search.maxItems;
            }
            if ((i & 4) != 0) {
                blazeWidgetLabel = search.blazeWidgetLabel;
            }
            return search.copy(str, num, blazeWidgetLabel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getSearchText() {
            return this.searchText;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getMaxItems() {
            return this.maxItems;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final BlazeWidgetLabel getBlazeWidgetLabel() {
            return this.blazeWidgetLabel;
        }

        @NotNull
        public final Search copy(@NotNull String searchText, @Nullable Integer maxItems, @Nullable BlazeWidgetLabel blazeWidgetLabel) {
            searchText.getClass();
            return new Search(searchText, maxItems, blazeWidgetLabel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Search)) {
                return false;
            }
            Search search = (Search) other;
            return Intrinsics.c(this.searchText, search.searchText) && Intrinsics.c(this.maxItems, search.maxItems) && Intrinsics.c(this.blazeWidgetLabel, search.blazeWidgetLabel);
        }

        @Nullable
        public final BlazeWidgetLabel getBlazeWidgetLabel() {
            return this.blazeWidgetLabel;
        }

        @Nullable
        public final Integer getMaxItems() {
            return this.maxItems;
        }

        @NotNull
        public final String getSearchText() {
            return this.searchText;
        }

        public int hashCode() {
            int hashCode = this.searchText.hashCode() * 31;
            Integer num = this.maxItems;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            BlazeWidgetLabel blazeWidgetLabel = this.blazeWidgetLabel;
            return hashCode2 + (blazeWidgetLabel != null ? blazeWidgetLabel.hashCode() : 0);
        }

        public final void setBlazeWidgetLabel(@Nullable BlazeWidgetLabel blazeWidgetLabel) {
            this.blazeWidgetLabel = blazeWidgetLabel;
        }

        public final void setMaxItems(@Nullable Integer num) {
            this.maxItems = num;
        }

        public final void setSearchText(@NotNull String str) {
            str.getClass();
            this.searchText = str;
        }

        @NotNull
        public String toString() {
            return "Search(searchText=" + this.searchText + ", maxItems=" + this.maxItems + ", blazeWidgetLabel=" + this.blazeWidgetLabel + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Search(@NotNull String str, @Nullable Integer num, @Nullable BlazeWidgetLabel blazeWidgetLabel) {
            super(null);
            str.getClass();
            this.searchText = str;
            this.maxItems = num;
            this.blazeWidgetLabel = blazeWidgetLabel;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\\\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010,R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u00100R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u00104R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u00108R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010<R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Labels;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "Ltdm;", "Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "blazeWidgetLabel", "", "labelsPriority", "Lcom/blaze/blazesdk/data_source/BlazeOrderType;", "orderType", "Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;", "advancedOrderType", "", "maxItems", "Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;", "personalizedType", "<init>", "(Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;Ljava/util/List;Lcom/blaze/blazesdk/data_source/BlazeOrderType;Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;Ljava/lang/Integer;Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;)V", "component1", "()Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/blaze/blazesdk/data_source/BlazeOrderType;", "component4", "()Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;", "component5", "()Ljava/lang/Integer;", "component6", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;", "copy", "(Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;Ljava/util/List;Lcom/blaze/blazesdk/data_source/BlazeOrderType;Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;Ljava/lang/Integer;Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;)Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Labels;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "getBlazeWidgetLabel", "setBlazeWidgetLabel", "(Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;)V", "Ljava/util/List;", "getLabelsPriority", "setLabelsPriority", "(Ljava/util/List;)V", "Lcom/blaze/blazesdk/data_source/BlazeOrderType;", "getOrderType", "setOrderType", "(Lcom/blaze/blazesdk/data_source/BlazeOrderType;)V", "Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;", "getAdvancedOrderType", "setAdvancedOrderType", "(Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;)V", "Ljava/lang/Integer;", "getMaxItems", "setMaxItems", "(Ljava/lang/Integer;)V", "Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;", "getPersonalizedType", "setPersonalizedType", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Labels extends BlazeDataSourceType implements tdm {
        public static final int $stable = 8;

        @Nullable
        private BlazeAdvancedOrderType advancedOrderType;

        @NotNull
        private BlazeWidgetLabel blazeWidgetLabel;

        @Nullable
        private List<BlazeWidgetLabel> labelsPriority;

        @Nullable
        private Integer maxItems;

        @Nullable
        private BlazeOrderType orderType;

        @Nullable
        private BlazeDataSourcePersonalizedType personalizedType;

        public /* synthetic */ Labels(BlazeWidgetLabel blazeWidgetLabel, List list, BlazeOrderType blazeOrderType, BlazeAdvancedOrderType blazeAdvancedOrderType, Integer num, BlazeDataSourcePersonalizedType blazeDataSourcePersonalizedType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(blazeWidgetLabel, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : blazeOrderType, (i & 8) != 0 ? null : blazeAdvancedOrderType, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : blazeDataSourcePersonalizedType);
        }

        public static /* synthetic */ Labels copy$default(Labels labels, BlazeWidgetLabel blazeWidgetLabel, List list, BlazeOrderType blazeOrderType, BlazeAdvancedOrderType blazeAdvancedOrderType, Integer num, BlazeDataSourcePersonalizedType blazeDataSourcePersonalizedType, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeWidgetLabel = labels.blazeWidgetLabel;
            }
            if ((i & 2) != 0) {
                list = labels.labelsPriority;
            }
            if ((i & 4) != 0) {
                blazeOrderType = labels.orderType;
            }
            if ((i & 8) != 0) {
                blazeAdvancedOrderType = labels.advancedOrderType;
            }
            if ((i & 16) != 0) {
                num = labels.maxItems;
            }
            if ((i & 32) != 0) {
                blazeDataSourcePersonalizedType = labels.personalizedType;
            }
            Integer num2 = num;
            BlazeDataSourcePersonalizedType blazeDataSourcePersonalizedType2 = blazeDataSourcePersonalizedType;
            return labels.copy(blazeWidgetLabel, list, blazeOrderType, blazeAdvancedOrderType, num2, blazeDataSourcePersonalizedType2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BlazeWidgetLabel getBlazeWidgetLabel() {
            return this.blazeWidgetLabel;
        }

        @Nullable
        public final List<BlazeWidgetLabel> component2() {
            return this.labelsPriority;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final BlazeOrderType getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final BlazeAdvancedOrderType getAdvancedOrderType() {
            return this.advancedOrderType;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Integer getMaxItems() {
            return this.maxItems;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final BlazeDataSourcePersonalizedType getPersonalizedType() {
            return this.personalizedType;
        }

        @NotNull
        public final Labels copy(@NotNull BlazeWidgetLabel blazeWidgetLabel, @Nullable List<BlazeWidgetLabel> labelsPriority, @Nullable BlazeOrderType orderType, @Nullable BlazeAdvancedOrderType advancedOrderType, @Nullable Integer maxItems, @Nullable BlazeDataSourcePersonalizedType personalizedType) {
            blazeWidgetLabel.getClass();
            return new Labels(blazeWidgetLabel, labelsPriority, orderType, advancedOrderType, maxItems, personalizedType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Labels)) {
                return false;
            }
            Labels labels = (Labels) other;
            return Intrinsics.c(this.blazeWidgetLabel, labels.blazeWidgetLabel) && Intrinsics.c(this.labelsPriority, labels.labelsPriority) && this.orderType == labels.orderType && Intrinsics.c(this.advancedOrderType, labels.advancedOrderType) && Intrinsics.c(this.maxItems, labels.maxItems) && Intrinsics.c(this.personalizedType, labels.personalizedType);
        }

        @Override // defpackage.tdm
        @Nullable
        public BlazeAdvancedOrderType getAdvancedOrderType() {
            return this.advancedOrderType;
        }

        @NotNull
        public final BlazeWidgetLabel getBlazeWidgetLabel() {
            return this.blazeWidgetLabel;
        }

        @Nullable
        public final List<BlazeWidgetLabel> getLabelsPriority() {
            return this.labelsPriority;
        }

        @Nullable
        public final Integer getMaxItems() {
            return this.maxItems;
        }

        @Nullable
        public BlazeOrderType getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final BlazeDataSourcePersonalizedType getPersonalizedType() {
            return this.personalizedType;
        }

        public int hashCode() {
            int hashCode = this.blazeWidgetLabel.hashCode() * 31;
            List<BlazeWidgetLabel> list = this.labelsPriority;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            BlazeOrderType blazeOrderType = this.orderType;
            int hashCode3 = (hashCode2 + (blazeOrderType == null ? 0 : blazeOrderType.hashCode())) * 31;
            BlazeAdvancedOrderType blazeAdvancedOrderType = this.advancedOrderType;
            int hashCode4 = (hashCode3 + (blazeAdvancedOrderType == null ? 0 : blazeAdvancedOrderType.hashCode())) * 31;
            Integer num = this.maxItems;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            BlazeDataSourcePersonalizedType blazeDataSourcePersonalizedType = this.personalizedType;
            return hashCode5 + (blazeDataSourcePersonalizedType != null ? blazeDataSourcePersonalizedType.hashCode() : 0);
        }

        public void setAdvancedOrderType(@Nullable BlazeAdvancedOrderType blazeAdvancedOrderType) {
            this.advancedOrderType = blazeAdvancedOrderType;
        }

        public final void setBlazeWidgetLabel(@NotNull BlazeWidgetLabel blazeWidgetLabel) {
            blazeWidgetLabel.getClass();
            this.blazeWidgetLabel = blazeWidgetLabel;
        }

        public final void setLabelsPriority(@Nullable List<BlazeWidgetLabel> list) {
            this.labelsPriority = list;
        }

        public final void setMaxItems(@Nullable Integer num) {
            this.maxItems = num;
        }

        public void setOrderType(@Nullable BlazeOrderType blazeOrderType) {
            this.orderType = blazeOrderType;
        }

        public final void setPersonalizedType(@Nullable BlazeDataSourcePersonalizedType blazeDataSourcePersonalizedType) {
            this.personalizedType = blazeDataSourcePersonalizedType;
        }

        @NotNull
        public String toString() {
            return "Labels(blazeWidgetLabel=" + this.blazeWidgetLabel + ", labelsPriority=" + this.labelsPriority + ", orderType=" + this.orderType + ", advancedOrderType=" + this.advancedOrderType + ", maxItems=" + this.maxItems + ", personalizedType=" + this.personalizedType + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Labels(@NotNull BlazeWidgetLabel blazeWidgetLabel, @Nullable List<BlazeWidgetLabel> list, @Nullable BlazeOrderType blazeOrderType, @Nullable BlazeAdvancedOrderType blazeAdvancedOrderType, @Nullable Integer num, @Nullable BlazeDataSourcePersonalizedType blazeDataSourcePersonalizedType) {
            super(null);
            blazeWidgetLabel.getClass();
            this.blazeWidgetLabel = blazeWidgetLabel;
            this.labelsPriority = list;
            this.orderType = blazeOrderType;
            this.advancedOrderType = blazeAdvancedOrderType;
            this.maxItems = num;
            this.personalizedType = blazeDataSourcePersonalizedType;
        }
    }
}
