package com.blaze.blazesdk.data_source;

import androidx.annotation.Keep;
import defpackage.fc6;
import defpackage.km5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0004R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType;", "", "<init>", "()V", "stringRepresentation", "", "getStringRepresentation$blazesdk_release", "()Ljava/lang/String;", "analyticsName", "getAnalyticsName$blazesdk_release", "asQueryParam", "", "ForYou", "Trending", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$ForYou;", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$Trending;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeRecommendationsType {
    public static final int $stable = 0;

    public /* synthetic */ BlazeRecommendationsType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final String asQueryParam(@NotNull List<String> list) {
        list.getClass();
        return CollectionsKt.f0(list, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
    }

    @NotNull
    public abstract String getAnalyticsName$blazesdk_release();

    @NotNull
    public abstract String getStringRepresentation$blazesdk_release();

    private BlazeRecommendationsType() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$Trending;", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType;", "anyLabelFilter", "", "", "<init>", "(Ljava/util/List;)V", "stringRepresentation", "getStringRepresentation$blazesdk_release", "()Ljava/lang/String;", "analyticsName", "getAnalyticsName$blazesdk_release", "anyLabelFilterQueryParam", "getAnyLabelFilterQueryParam$blazesdk_release", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Trending extends BlazeRecommendationsType {
        public static final int $stable = 8;

        @NotNull
        private List<String> anyLabelFilter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Trending(@NotNull List<String> list) {
            super(null);
            list.getClass();
            this.anyLabelFilter = list;
        }

        private final List<String> component1() {
            return this.anyLabelFilter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Trending copy$default(Trending trending, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = trending.anyLabelFilter;
            }
            return trending.copy(list);
        }

        @NotNull
        public final Trending copy(@NotNull List<String> anyLabelFilter) {
            anyLabelFilter.getClass();
            return new Trending(anyLabelFilter);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Trending) && Intrinsics.c(this.anyLabelFilter, ((Trending) other).anyLabelFilter);
        }

        @Override // com.blaze.blazesdk.data_source.BlazeRecommendationsType
        @NotNull
        public String getAnalyticsName$blazesdk_release() {
            return "Trending - " + getStringRepresentation$blazesdk_release();
        }

        @NotNull
        public final String getAnyLabelFilterQueryParam$blazesdk_release() {
            return asQueryParam(this.anyLabelFilter);
        }

        @Override // com.blaze.blazesdk.data_source.BlazeRecommendationsType
        @NotNull
        public String getStringRepresentation$blazesdk_release() {
            return asQueryParam(this.anyLabelFilter);
        }

        public int hashCode() {
            return this.anyLabelFilter.hashCode();
        }

        @NotNull
        public String toString() {
            return fc6.p(new StringBuilder("Trending(anyLabelFilter="), this.anyLabelFilter, ')');
        }

        public Trending() {
            this(null, 1, null);
        }

        public Trending(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? km5.a : list);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J)\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$ForYou;", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType;", "anyLabelFilter", "", "", "promotedLabels", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAnyLabelFilter", "()Ljava/util/List;", "setAnyLabelFilter", "(Ljava/util/List;)V", "stringRepresentation", "getStringRepresentation$blazesdk_release", "()Ljava/lang/String;", "analyticsName", "getAnalyticsName$blazesdk_release", "anyLabelFilterQueryParam", "getAnyLabelFilterQueryParam$blazesdk_release", "promotedLabelsQueryParam", "getPromotedLabelsQueryParam$blazesdk_release", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ForYou extends BlazeRecommendationsType {
        public static final int $stable = 8;

        @NotNull
        private List<String> anyLabelFilter;

        @NotNull
        private List<String> promotedLabels;

        public ForYou(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? km5.a : list, (i & 2) != 0 ? km5.a : list2);
        }

        private final List<String> component2() {
            return this.promotedLabels;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ForYou copy$default(ForYou forYou, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = forYou.anyLabelFilter;
            }
            if ((i & 2) != 0) {
                list2 = forYou.promotedLabels;
            }
            return forYou.copy(list, list2);
        }

        @NotNull
        public final List<String> component1() {
            return this.anyLabelFilter;
        }

        @NotNull
        public final ForYou copy(@NotNull List<String> anyLabelFilter, @NotNull List<String> promotedLabels) {
            anyLabelFilter.getClass();
            promotedLabels.getClass();
            return new ForYou(anyLabelFilter, promotedLabels);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForYou)) {
                return false;
            }
            ForYou forYou = (ForYou) other;
            return Intrinsics.c(this.anyLabelFilter, forYou.anyLabelFilter) && Intrinsics.c(this.promotedLabels, forYou.promotedLabels);
        }

        @Override // com.blaze.blazesdk.data_source.BlazeRecommendationsType
        @NotNull
        public String getAnalyticsName$blazesdk_release() {
            return "For You - " + getStringRepresentation$blazesdk_release();
        }

        @NotNull
        public final List<String> getAnyLabelFilter() {
            return this.anyLabelFilter;
        }

        @NotNull
        public final String getAnyLabelFilterQueryParam$blazesdk_release() {
            return asQueryParam(this.anyLabelFilter);
        }

        @NotNull
        public final String getPromotedLabelsQueryParam$blazesdk_release() {
            return asQueryParam(this.promotedLabels);
        }

        @Override // com.blaze.blazesdk.data_source.BlazeRecommendationsType
        @NotNull
        public String getStringRepresentation$blazesdk_release() {
            return asQueryParam(this.anyLabelFilter);
        }

        public int hashCode() {
            return this.promotedLabels.hashCode() + (this.anyLabelFilter.hashCode() * 31);
        }

        public final void setAnyLabelFilter(@NotNull List<String> list) {
            list.getClass();
            this.anyLabelFilter = list;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ForYou(anyLabelFilter=");
            sb.append(this.anyLabelFilter);
            sb.append(", promotedLabels=");
            return fc6.p(sb, this.promotedLabels, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForYou(@NotNull List<String> list, @NotNull List<String> list2) {
            super(null);
            list.getClass();
            list2.getClass();
            this.anyLabelFilter = list;
            this.promotedLabels = list2;
        }

        public ForYou() {
            this(null, null, 3, null);
        }
    }
}
