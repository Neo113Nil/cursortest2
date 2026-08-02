package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceInfo.data;

import B3.p;
import Bl.C2639a;
import G.g;
import K1.G;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\"#B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cardList", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardItemDTO;", "cardListSettings", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardListSettingsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardListSettingsDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCardList", "()Ljava/util/List;", "getCardListSettings", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardListSettingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CardItemDTO", "CardListSettingsDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bFinanceInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<CardItemDTO> cardList;
    private final CardListSettingsDTO cardListSettings;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardItemDTO;", "", "topText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "topTextIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "bottomText", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTopText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTopTextIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBottomText", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardItemDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final TextDTO bottomText;
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO topText;
        private final IconDTO topTextIcon;

        public CardItemDTO(@NotNull TextDTO topText, IconDTO iconDTO, @NotNull TextDTO bottomText, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(topText, "topText");
            Intrinsics.checkNotNullParameter(bottomText, "bottomText");
            this.topText = topText;
            this.topTextIcon = iconDTO;
            this.bottomText = bottomText;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ CardItemDTO copy$default(CardItemDTO cardItemDTO, TextDTO textDTO, IconDTO iconDTO, TextDTO textDTO2, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = cardItemDTO.topText;
            }
            if ((i11 & 2) != 0) {
                iconDTO = cardItemDTO.topTextIcon;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = cardItemDTO.bottomText;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = cardItemDTO.common;
            }
            return cardItemDTO.copy(textDTO, iconDTO, textDTO2, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTopText() {
            return this.topText;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getTopTextIcon() {
            return this.topTextIcon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getBottomText() {
            return this.bottomText;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final CardItemDTO copy(@NotNull TextDTO topText, IconDTO topTextIcon, @NotNull TextDTO bottomText, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(topText, "topText");
            Intrinsics.checkNotNullParameter(bottomText, "bottomText");
            return new CardItemDTO(topText, topTextIcon, bottomText, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardItemDTO)) {
                return false;
            }
            CardItemDTO cardItemDTO = (CardItemDTO) other;
            return Intrinsics.d(this.topText, cardItemDTO.topText) && Intrinsics.d(this.topTextIcon, cardItemDTO.topTextIcon) && Intrinsics.d(this.bottomText, cardItemDTO.bottomText) && Intrinsics.d(this.common, cardItemDTO.common);
        }

        @NotNull
        public final TextDTO getBottomText() {
            return this.bottomText;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getTopText() {
            return this.topText;
        }

        public final IconDTO getTopTextIcon() {
            return this.topTextIcon;
        }

        public int hashCode() {
            int hashCode = this.topText.hashCode() * 31;
            IconDTO iconDTO = this.topTextIcon;
            int a11 = b.a(this.bottomText, (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
            CommonControlSettings commonControlSettings = this.common;
            return a11 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.topText;
            IconDTO iconDTO = this.topTextIcon;
            TextDTO textDTO2 = this.bottomText;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder d11 = C2639a.d("CardItemDTO(topText=", ", topTextIcon=", ", bottomText=", iconDTO, textDTO);
            d11.append(textDTO2);
            d11.append(", common=");
            d11.append(commonControlSettings);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardListSettingsDTO;", "", "gap", "Lru/ozon/uni/atoms/data/common/Paddings;", "verticalPaddings", "horizontalPaddings", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getGap", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getVerticalPaddings", "getHorizontalPaddings", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardListSettingsDTO {
        public static final int $stable = 0;

        @NotNull
        private final Paddings gap;

        @NotNull
        private final Paddings horizontalPaddings;

        @NotNull
        private final Paddings verticalPaddings;

        public CardListSettingsDTO() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ CardListSettingsDTO copy$default(CardListSettingsDTO cardListSettingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = cardListSettingsDTO.gap;
            }
            if ((i11 & 2) != 0) {
                paddings2 = cardListSettingsDTO.verticalPaddings;
            }
            if ((i11 & 4) != 0) {
                paddings3 = cardListSettingsDTO.horizontalPaddings;
            }
            return cardListSettingsDTO.copy(paddings, paddings2, paddings3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getGap() {
            return this.gap;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getVerticalPaddings() {
            return this.verticalPaddings;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getHorizontalPaddings() {
            return this.horizontalPaddings;
        }

        @NotNull
        public final CardListSettingsDTO copy(@NotNull Paddings gap, @NotNull Paddings verticalPaddings, @NotNull Paddings horizontalPaddings) {
            Intrinsics.checkNotNullParameter(gap, "gap");
            Intrinsics.checkNotNullParameter(verticalPaddings, "verticalPaddings");
            Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
            return new CardListSettingsDTO(gap, verticalPaddings, horizontalPaddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardListSettingsDTO)) {
                return false;
            }
            CardListSettingsDTO cardListSettingsDTO = (CardListSettingsDTO) other;
            return this.gap == cardListSettingsDTO.gap && this.verticalPaddings == cardListSettingsDTO.verticalPaddings && this.horizontalPaddings == cardListSettingsDTO.horizontalPaddings;
        }

        @NotNull
        public final Paddings getGap() {
            return this.gap;
        }

        @NotNull
        public final Paddings getHorizontalPaddings() {
            return this.horizontalPaddings;
        }

        @NotNull
        public final Paddings getVerticalPaddings() {
            return this.verticalPaddings;
        }

        public int hashCode() {
            return this.horizontalPaddings.hashCode() + GR.b.b(this.verticalPaddings, this.gap.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.gap;
            Paddings paddings2 = this.verticalPaddings;
            return D40.b.b(p.b("CardListSettingsDTO(gap=", paddings, ", verticalPaddings=", paddings2, ", horizontalPaddings="), this.horizontalPaddings, ")");
        }

        public CardListSettingsDTO(@NotNull Paddings gap, @NotNull Paddings verticalPaddings, @NotNull Paddings horizontalPaddings) {
            Intrinsics.checkNotNullParameter(gap, "gap");
            Intrinsics.checkNotNullParameter(verticalPaddings, "verticalPaddings");
            Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
            this.gap = gap;
            this.verticalPaddings = verticalPaddings;
            this.horizontalPaddings = horizontalPaddings;
        }

        public /* synthetic */ CardListSettingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings3);
        }
    }

    public B2bFinanceInfoDTO(@NotNull TextDTO title, @NotNull List<CardItemDTO> cardList, CardListSettingsDTO cardListSettingsDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        this.title = title;
        this.cardList = cardList;
        this.cardListSettings = cardListSettingsDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ B2bFinanceInfoDTO copy$default(B2bFinanceInfoDTO b2bFinanceInfoDTO, TextDTO textDTO, List list, CardListSettingsDTO cardListSettingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = b2bFinanceInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = b2bFinanceInfoDTO.cardList;
        }
        if ((i11 & 4) != 0) {
            cardListSettingsDTO = b2bFinanceInfoDTO.cardListSettings;
        }
        if ((i11 & 8) != 0) {
            map = b2bFinanceInfoDTO.trackingInfo;
        }
        return b2bFinanceInfoDTO.copy(textDTO, list, cardListSettingsDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<CardItemDTO> component2() {
        return this.cardList;
    }

    /* renamed from: component3, reason: from getter */
    public final CardListSettingsDTO getCardListSettings() {
        return this.cardListSettings;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final B2bFinanceInfoDTO copy(@NotNull TextDTO title, @NotNull List<CardItemDTO> cardList, CardListSettingsDTO cardListSettings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        return new B2bFinanceInfoDTO(title, cardList, cardListSettings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bFinanceInfoDTO)) {
            return false;
        }
        B2bFinanceInfoDTO b2bFinanceInfoDTO = (B2bFinanceInfoDTO) other;
        return Intrinsics.d(this.title, b2bFinanceInfoDTO.title) && Intrinsics.d(this.cardList, b2bFinanceInfoDTO.cardList) && Intrinsics.d(this.cardListSettings, b2bFinanceInfoDTO.cardListSettings) && Intrinsics.d(this.trackingInfo, b2bFinanceInfoDTO.trackingInfo);
    }

    @NotNull
    public final List<CardItemDTO> getCardList() {
        return this.cardList;
    }

    public final CardListSettingsDTO getCardListSettings() {
        return this.cardListSettings;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.cardList);
        CardListSettingsDTO cardListSettingsDTO = this.cardListSettings;
        int hashCode = (b11 + (cardListSettingsDTO == null ? 0 : cardListSettingsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<CardItemDTO> list = this.cardList;
        CardListSettingsDTO cardListSettingsDTO = this.cardListSettings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("B2bFinanceInfoDTO(title=", textDTO, ", cardList=", list, ", cardListSettings=");
        e11.append(cardListSettingsDTO);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }

    public B2bFinanceInfoDTO(TextDTO textDTO, List list, CardListSettingsDTO cardListSettingsDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, (i11 & 2) != 0 ? K.f71697a : list, cardListSettingsDTO, map);
    }
}
