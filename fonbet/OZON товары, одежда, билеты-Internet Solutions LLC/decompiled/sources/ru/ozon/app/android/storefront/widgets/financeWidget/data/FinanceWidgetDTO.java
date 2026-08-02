package ru.ozon.app.android.storefront.widgets.financeWidget.data;

import B3.p;
import D3.g;
import Ds.C2880a;
import El.C2971a;
import Kk.C3532b;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO;", "", "leftCard", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO;", "rightCard", "backgroundColor", "", "isCompactSize", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO;Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO;Ljava/lang/String;ZLjava/util/Map;)V", "getLeftCard", "()Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO;", "getRightCard", "getBackgroundColor", "()Ljava/lang/String;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "CardDTO", "ItemDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FinanceWidgetDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final boolean isCompactSize;

    @NotNull
    private final CardDTO leftCard;

    @NotNull
    private final CardDTO rightCard;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0001\u0003\u001f !¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO;", "", "<init>", "()V", "widgetBackgroundColor", "", "getWidgetBackgroundColor", "()Ljava/lang/String;", "setWidgetBackgroundColor", "(Ljava/lang/String;)V", "isCompactSize", "", "()Z", "setCompactSize", "(Z)V", "spanIndex", "", "getSpanIndex", "()I", "setSpanIndex", "(I)V", "widgetTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getWidgetTrackingInfo", "()Ljava/util/Map;", "setWidgetTrackingInfo", "(Ljava/util/Map;)V", "SingleCardDTO", "CoupleCardDTO", "SingleCarousel", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$CoupleCardDTO;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCardDTO;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "singleCarousel", type = SingleCarousel.class), @ProtoOneOfSignature(name = "singleCard", type = SingleCardDTO.class), @ProtoOneOfSignature(name = "coupleCard", type = CoupleCardDTO.class)})
    @ProtoOneOf(label = "type")
    public static abstract class CardDTO {
        public static final int $stable = 8;
        private boolean isCompactSize;
        private int spanIndex;
        private String widgetBackgroundColor;
        private Map<String, TokenizedTrackingInfo> widgetTrackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$CoupleCardDTO;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO;", "topItem", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;", "bottomItem", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;)V", "getTopItem", "()Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;", "getBottomItem", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CoupleCardDTO extends CardDTO {
            public static final int $stable = 8;

            @NotNull
            private final ItemDTO bottomItem;

            @NotNull
            private final ItemDTO topItem;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CoupleCardDTO(@NotNull ItemDTO topItem, @NotNull ItemDTO bottomItem) {
                super(null);
                Intrinsics.checkNotNullParameter(topItem, "topItem");
                Intrinsics.checkNotNullParameter(bottomItem, "bottomItem");
                this.topItem = topItem;
                this.bottomItem = bottomItem;
            }

            public static /* synthetic */ CoupleCardDTO copy$default(CoupleCardDTO coupleCardDTO, ItemDTO itemDTO, ItemDTO itemDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    itemDTO = coupleCardDTO.topItem;
                }
                if ((i11 & 2) != 0) {
                    itemDTO2 = coupleCardDTO.bottomItem;
                }
                return coupleCardDTO.copy(itemDTO, itemDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ItemDTO getTopItem() {
                return this.topItem;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final ItemDTO getBottomItem() {
                return this.bottomItem;
            }

            @NotNull
            public final CoupleCardDTO copy(@NotNull ItemDTO topItem, @NotNull ItemDTO bottomItem) {
                Intrinsics.checkNotNullParameter(topItem, "topItem");
                Intrinsics.checkNotNullParameter(bottomItem, "bottomItem");
                return new CoupleCardDTO(topItem, bottomItem);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CoupleCardDTO)) {
                    return false;
                }
                CoupleCardDTO coupleCardDTO = (CoupleCardDTO) other;
                return Intrinsics.d(this.topItem, coupleCardDTO.topItem) && Intrinsics.d(this.bottomItem, coupleCardDTO.bottomItem);
            }

            @NotNull
            public final ItemDTO getBottomItem() {
                return this.bottomItem;
            }

            @NotNull
            public final ItemDTO getTopItem() {
                return this.topItem;
            }

            public int hashCode() {
                return this.bottomItem.hashCode() + (this.topItem.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "CoupleCardDTO(topItem=" + this.topItem + ", bottomItem=" + this.bottomItem + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCardDTO;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO;", "item", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;)V", "getItem", "()Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SingleCardDTO extends CardDTO {
            public static final int $stable = 8;

            @NotNull
            private final ItemDTO item;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleCardDTO(@NotNull ItemDTO item) {
                super(null);
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
            }

            public static /* synthetic */ SingleCardDTO copy$default(SingleCardDTO singleCardDTO, ItemDTO itemDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    itemDTO = singleCardDTO.item;
                }
                return singleCardDTO.copy(itemDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ItemDTO getItem() {
                return this.item;
            }

            @NotNull
            public final SingleCardDTO copy(@NotNull ItemDTO item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return new SingleCardDTO(item);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleCardDTO) && Intrinsics.d(this.item, ((SingleCardDTO) other).item);
            }

            @NotNull
            public final ItemDTO getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            @NotNull
            public String toString() {
                return "SingleCardDTO(item=" + this.item + ")";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JB\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO;", "banners", "", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel$Banner;", "bannerDuration", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V", "getBanners", "()Ljava/util/List;", "getBannerDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel;", "equals", "", "other", "", "hashCode", "toString", "Banner", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SingleCarousel extends CardDTO {
            public static final int $stable = 8;
            private final Integer bannerDuration;

            @NotNull
            private final List<Banner> banners;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel$Banner;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "backgroundImage", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundImage", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Banner {
                public static final int $stable = 8;
                private final AtomActionDTO action;
                private final String backgroundColor;
                private final String backgroundImage;
                private final ButtonV3DTO button;
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public Banner(@NotNull TextDTO title, TextDTO textDTO, ButtonV3DTO buttonV3DTO, String str, String str2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                    this.subtitle = textDTO;
                    this.button = buttonV3DTO;
                    this.backgroundColor = str;
                    this.backgroundImage = str2;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ Banner copy$default(Banner banner, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = banner.title;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO2 = banner.subtitle;
                    }
                    if ((i11 & 4) != 0) {
                        buttonV3DTO = banner.button;
                    }
                    if ((i11 & 8) != 0) {
                        str = banner.backgroundColor;
                    }
                    if ((i11 & 16) != 0) {
                        str2 = banner.backgroundImage;
                    }
                    if ((i11 & 32) != 0) {
                        atomActionDTO = banner.action;
                    }
                    if ((i11 & 64) != 0) {
                        map = banner.trackingInfo;
                    }
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    Map map2 = map;
                    String str3 = str2;
                    ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
                    return banner.copy(textDTO, textDTO2, buttonV3DTO2, str, str3, atomActionDTO2, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                /* renamed from: component3, reason: from getter */
                public final ButtonV3DTO getButton() {
                    return this.button;
                }

                /* renamed from: component4, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                /* renamed from: component5, reason: from getter */
                public final String getBackgroundImage() {
                    return this.backgroundImage;
                }

                /* renamed from: component6, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component7() {
                    return this.trackingInfo;
                }

                @NotNull
                public final Banner copy(@NotNull TextDTO title, TextDTO subtitle, ButtonV3DTO button, String backgroundColor, String backgroundImage, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new Banner(title, subtitle, button, backgroundColor, backgroundImage, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Banner)) {
                        return false;
                    }
                    Banner banner = (Banner) other;
                    return Intrinsics.d(this.title, banner.title) && Intrinsics.d(this.subtitle, banner.subtitle) && Intrinsics.d(this.button, banner.button) && Intrinsics.d(this.backgroundColor, banner.backgroundColor) && Intrinsics.d(this.backgroundImage, banner.backgroundImage) && Intrinsics.d(this.action, banner.action) && Intrinsics.d(this.trackingInfo, banner.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final String getBackgroundImage() {
                    return this.backgroundImage;
                }

                public final ButtonV3DTO getButton() {
                    return this.button;
                }

                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    TextDTO textDTO = this.subtitle;
                    int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                    ButtonV3DTO buttonV3DTO = this.button;
                    int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
                    String str = this.backgroundColor;
                    int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.backgroundImage;
                    int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode6 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.title;
                    TextDTO textDTO2 = this.subtitle;
                    ButtonV3DTO buttonV3DTO = this.button;
                    String str = this.backgroundColor;
                    String str2 = this.backgroundImage;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder g10 = g.g("Banner(title=", textDTO, ", subtitle=", textDTO2, ", button=");
                    g10.append(buttonV3DTO);
                    g10.append(", backgroundColor=");
                    g10.append(str);
                    g10.append(", backgroundImage=");
                    p.c(str2, ", action=", ", trackingInfo=", g10, atomActionDTO);
                    return P.f(g10, map, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleCarousel(@NotNull List<Banner> banners, Integer num, Map<String, TokenizedTrackingInfo> map) {
                super(null);
                Intrinsics.checkNotNullParameter(banners, "banners");
                this.banners = banners;
                this.bannerDuration = num;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SingleCarousel copy$default(SingleCarousel singleCarousel, List list, Integer num, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = singleCarousel.banners;
                }
                if ((i11 & 2) != 0) {
                    num = singleCarousel.bannerDuration;
                }
                if ((i11 & 4) != 0) {
                    map = singleCarousel.trackingInfo;
                }
                return singleCarousel.copy(list, num, map);
            }

            @NotNull
            public final List<Banner> component1() {
                return this.banners;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getBannerDuration() {
                return this.bannerDuration;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            @NotNull
            public final SingleCarousel copy(@NotNull List<Banner> banners, Integer bannerDuration, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(banners, "banners");
                return new SingleCarousel(banners, bannerDuration, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SingleCarousel)) {
                    return false;
                }
                SingleCarousel singleCarousel = (SingleCarousel) other;
                return Intrinsics.d(this.banners, singleCarousel.banners) && Intrinsics.d(this.bannerDuration, singleCarousel.bannerDuration) && Intrinsics.d(this.trackingInfo, singleCarousel.trackingInfo);
            }

            public final Integer getBannerDuration() {
                return this.bannerDuration;
            }

            @NotNull
            public final List<Banner> getBanners() {
                return this.banners;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.banners.hashCode() * 31;
                Integer num = this.bannerDuration;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<Banner> list = this.banners;
                Integer num = this.bannerDuration;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("SingleCarousel(banners=");
                sb2.append(list);
                sb2.append(", bannerDuration=");
                sb2.append(num);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        public /* synthetic */ CardDTO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSpanIndex() {
            return this.spanIndex;
        }

        public final String getWidgetBackgroundColor() {
            return this.widgetBackgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> getWidgetTrackingInfo() {
            return this.widgetTrackingInfo;
        }

        /* renamed from: isCompactSize, reason: from getter */
        public final boolean getIsCompactSize() {
            return this.isCompactSize;
        }

        public final void setCompactSize(boolean z11) {
            this.isCompactSize = z11;
        }

        public final void setSpanIndex(int i11) {
            this.spanIndex = i11;
        }

        public final void setWidgetBackgroundColor(String str) {
            this.widgetBackgroundColor = str;
        }

        public final void setWidgetTrackingInfo(Map<String, TokenizedTrackingInfo> map) {
            this.widgetTrackingInfo = map;
        }

        private CardDTO() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;", "", "balanceState", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;", "promoState", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBalanceState", "()Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;", "getPromoState", "()Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "BalanceState", "PromoState", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ItemDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final BalanceState balanceState;
        private final PromoState promoState;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$BalanceState;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "balance", "balanceIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "chevronIcon", "rightActionButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "bottomActionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBalance", "getBalanceIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getChevronIcon", "getRightActionButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBottomActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BalanceState {
            public static final int $stable;

            @NotNull
            private final TextDTO balance;
            private final IconDTO balanceIcon;
            private final ButtonV3DTO bottomActionButton;

            @NotNull
            private final IconDTO chevronIcon;
            private final IconButtonV3DTO rightActionButton;

            @NotNull
            private final TextDTO title;

            static {
                int i11 = IconButtonV3DTO.$stable;
                int i12 = IconDTO.$stable;
                $stable = i11 | i12 | i12;
            }

            public BalanceState(@NotNull TextDTO title, @NotNull TextDTO balance, IconDTO iconDTO, @NotNull IconDTO chevronIcon, IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(balance, "balance");
                Intrinsics.checkNotNullParameter(chevronIcon, "chevronIcon");
                this.title = title;
                this.balance = balance;
                this.balanceIcon = iconDTO;
                this.chevronIcon = chevronIcon;
                this.rightActionButton = iconButtonV3DTO;
                this.bottomActionButton = buttonV3DTO;
            }

            public static /* synthetic */ BalanceState copy$default(BalanceState balanceState, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, IconDTO iconDTO2, IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = balanceState.title;
                }
                if ((i11 & 2) != 0) {
                    textDTO2 = balanceState.balance;
                }
                if ((i11 & 4) != 0) {
                    iconDTO = balanceState.balanceIcon;
                }
                if ((i11 & 8) != 0) {
                    iconDTO2 = balanceState.chevronIcon;
                }
                if ((i11 & 16) != 0) {
                    iconButtonV3DTO = balanceState.rightActionButton;
                }
                if ((i11 & 32) != 0) {
                    buttonV3DTO = balanceState.bottomActionButton;
                }
                IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
                ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
                return balanceState.copy(textDTO, textDTO2, iconDTO, iconDTO2, iconButtonV3DTO2, buttonV3DTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getBalance() {
                return this.balance;
            }

            /* renamed from: component3, reason: from getter */
            public final IconDTO getBalanceIcon() {
                return this.balanceIcon;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final IconDTO getChevronIcon() {
                return this.chevronIcon;
            }

            /* renamed from: component5, reason: from getter */
            public final IconButtonV3DTO getRightActionButton() {
                return this.rightActionButton;
            }

            /* renamed from: component6, reason: from getter */
            public final ButtonV3DTO getBottomActionButton() {
                return this.bottomActionButton;
            }

            @NotNull
            public final BalanceState copy(@NotNull TextDTO title, @NotNull TextDTO balance, IconDTO balanceIcon, @NotNull IconDTO chevronIcon, IconButtonV3DTO rightActionButton, ButtonV3DTO bottomActionButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(balance, "balance");
                Intrinsics.checkNotNullParameter(chevronIcon, "chevronIcon");
                return new BalanceState(title, balance, balanceIcon, chevronIcon, rightActionButton, bottomActionButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BalanceState)) {
                    return false;
                }
                BalanceState balanceState = (BalanceState) other;
                return Intrinsics.d(this.title, balanceState.title) && Intrinsics.d(this.balance, balanceState.balance) && Intrinsics.d(this.balanceIcon, balanceState.balanceIcon) && Intrinsics.d(this.chevronIcon, balanceState.chevronIcon) && Intrinsics.d(this.rightActionButton, balanceState.rightActionButton) && Intrinsics.d(this.bottomActionButton, balanceState.bottomActionButton);
            }

            @NotNull
            public final TextDTO getBalance() {
                return this.balance;
            }

            public final IconDTO getBalanceIcon() {
                return this.balanceIcon;
            }

            public final ButtonV3DTO getBottomActionButton() {
                return this.bottomActionButton;
            }

            @NotNull
            public final IconDTO getChevronIcon() {
                return this.chevronIcon;
            }

            public final IconButtonV3DTO getRightActionButton() {
                return this.rightActionButton;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = b.a(this.balance, this.title.hashCode() * 31, 31);
                IconDTO iconDTO = this.balanceIcon;
                int a12 = C2971a.a(this.chevronIcon, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
                IconButtonV3DTO iconButtonV3DTO = this.rightActionButton;
                int hashCode = (a12 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
                ButtonV3DTO buttonV3DTO = this.bottomActionButton;
                return hashCode + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.balance;
                IconDTO iconDTO = this.balanceIcon;
                IconDTO iconDTO2 = this.chevronIcon;
                IconButtonV3DTO iconButtonV3DTO = this.rightActionButton;
                ButtonV3DTO buttonV3DTO = this.bottomActionButton;
                StringBuilder g10 = g.g("BalanceState(title=", textDTO, ", balance=", textDTO2, ", balanceIcon=");
                g10.append(iconDTO);
                g10.append(", chevronIcon=");
                g10.append(iconDTO2);
                g10.append(", rightActionButton=");
                g10.append(iconButtonV3DTO);
                g10.append(", bottomActionButton=");
                g10.append(buttonV3DTO);
                g10.append(")");
                return g10.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO$PromoState;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PromoState {
            public static final int $stable = 0;

            @NotNull
            private final ImageDTO image;

            @NotNull
            private final TextDTO title;

            public PromoState(@NotNull TextDTO title, @NotNull ImageDTO image) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(image, "image");
                this.title = title;
                this.image = image;
            }

            public static /* synthetic */ PromoState copy$default(PromoState promoState, TextDTO textDTO, ImageDTO imageDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = promoState.title;
                }
                if ((i11 & 2) != 0) {
                    imageDTO = promoState.image;
                }
                return promoState.copy(textDTO, imageDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final ImageDTO getImage() {
                return this.image;
            }

            @NotNull
            public final PromoState copy(@NotNull TextDTO title, @NotNull ImageDTO image) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(image, "image");
                return new PromoState(title, image);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PromoState)) {
                    return false;
                }
                PromoState promoState = (PromoState) other;
                return Intrinsics.d(this.title, promoState.title) && Intrinsics.d(this.image, promoState.image);
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.image.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "PromoState(title=" + this.title + ", image=" + this.image + ")";
            }
        }

        public ItemDTO(BalanceState balanceState, PromoState promoState, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            this.balanceState = balanceState;
            this.promoState = promoState;
            this.backgroundColor = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, BalanceState balanceState, PromoState promoState, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                balanceState = itemDTO.balanceState;
            }
            if ((i11 & 2) != 0) {
                promoState = itemDTO.promoState;
            }
            if ((i11 & 4) != 0) {
                str = itemDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = itemDTO.action;
            }
            if ((i11 & 16) != 0) {
                map = itemDTO.trackingInfo;
            }
            Map map2 = map;
            String str2 = str;
            return itemDTO.copy(balanceState, promoState, str2, atomActionDTO, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final BalanceState getBalanceState() {
            return this.balanceState;
        }

        /* renamed from: component2, reason: from getter */
        public final PromoState getPromoState() {
            return this.promoState;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ItemDTO copy(BalanceState balanceState, PromoState promoState, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new ItemDTO(balanceState, promoState, backgroundColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.balanceState, itemDTO.balanceState) && Intrinsics.d(this.promoState, itemDTO.promoState) && Intrinsics.d(this.backgroundColor, itemDTO.backgroundColor) && Intrinsics.d(this.action, itemDTO.action) && Intrinsics.d(this.trackingInfo, itemDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BalanceState getBalanceState() {
            return this.balanceState;
        }

        public final PromoState getPromoState() {
            return this.promoState;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            BalanceState balanceState = this.balanceState;
            int hashCode = (balanceState == null ? 0 : balanceState.hashCode()) * 31;
            PromoState promoState = this.promoState;
            int hashCode2 = (hashCode + (promoState == null ? 0 : promoState.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BalanceState balanceState = this.balanceState;
            PromoState promoState = this.promoState;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ItemDTO(balanceState=");
            sb2.append(balanceState);
            sb2.append(", promoState=");
            sb2.append(promoState);
            sb2.append(", backgroundColor=");
            p.c(str, ", action=", ", trackingInfo=", sb2, atomActionDTO);
            return P.f(sb2, map, ")");
        }
    }

    public FinanceWidgetDTO(@NotNull CardDTO leftCard, @NotNull CardDTO rightCard, String str, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        Intrinsics.checkNotNullParameter(rightCard, "rightCard");
        this.leftCard = leftCard;
        this.rightCard = rightCard;
        this.backgroundColor = str;
        this.isCompactSize = z11;
        this.trackingInfo = map;
    }

    public static /* synthetic */ FinanceWidgetDTO copy$default(FinanceWidgetDTO financeWidgetDTO, CardDTO cardDTO, CardDTO cardDTO2, String str, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cardDTO = financeWidgetDTO.leftCard;
        }
        if ((i11 & 2) != 0) {
            cardDTO2 = financeWidgetDTO.rightCard;
        }
        if ((i11 & 4) != 0) {
            str = financeWidgetDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            z11 = financeWidgetDTO.isCompactSize;
        }
        if ((i11 & 16) != 0) {
            map = financeWidgetDTO.trackingInfo;
        }
        Map map2 = map;
        String str2 = str;
        return financeWidgetDTO.copy(cardDTO, cardDTO2, str2, z11, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CardDTO getLeftCard() {
        return this.leftCard;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CardDTO getRightCard() {
        return this.rightCard;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCompactSize() {
        return this.isCompactSize;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final FinanceWidgetDTO copy(@NotNull CardDTO leftCard, @NotNull CardDTO rightCard, String backgroundColor, boolean isCompactSize, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        Intrinsics.checkNotNullParameter(rightCard, "rightCard");
        return new FinanceWidgetDTO(leftCard, rightCard, backgroundColor, isCompactSize, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceWidgetDTO)) {
            return false;
        }
        FinanceWidgetDTO financeWidgetDTO = (FinanceWidgetDTO) other;
        return Intrinsics.d(this.leftCard, financeWidgetDTO.leftCard) && Intrinsics.d(this.rightCard, financeWidgetDTO.rightCard) && Intrinsics.d(this.backgroundColor, financeWidgetDTO.backgroundColor) && this.isCompactSize == financeWidgetDTO.isCompactSize && Intrinsics.d(this.trackingInfo, financeWidgetDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CardDTO getLeftCard() {
        return this.leftCard;
    }

    @NotNull
    public final CardDTO getRightCard() {
        return this.rightCard;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.rightCard.hashCode() + (this.leftCard.hashCode() * 31)) * 31;
        String str = this.backgroundColor;
        int a11 = C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCompactSize);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isCompactSize() {
        return this.isCompactSize;
    }

    @NotNull
    public String toString() {
        CardDTO cardDTO = this.leftCard;
        CardDTO cardDTO2 = this.rightCard;
        String str = this.backgroundColor;
        boolean z11 = this.isCompactSize;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FinanceWidgetDTO(leftCard=");
        sb2.append(cardDTO);
        sb2.append(", rightCard=");
        sb2.append(cardDTO2);
        sb2.append(", backgroundColor=");
        C2880a.c(str, ", isCompactSize=", ", trackingInfo=", sb2, z11);
        return P.f(sb2, map, ")");
    }
}
