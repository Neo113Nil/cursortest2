package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data;

import B90.C2619v;
import Co.a;
import Hj.C3143a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconLabelButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00014B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0003Jo\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO;", "", "avatar", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "subscribers", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;", "reviews", "subscribe", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "share", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "sellerName", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "trustFactors", "", "Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;Lru/ozon/app/android/atoms/data/button/SwitchingButton;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/Map;)V", "getAvatar", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubscribers", "()Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;", "getReviews", "getSubscribe", "()Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "getShare", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getSellerName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTrustFactors", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "StatisticsItem", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerTransparencyProfileDTO {
    public static final int $stable = 8;

    @NotNull
    private final IconDTO avatar;

    @NotNull
    private final StatisticsItem reviews;

    @NotNull
    private final TextAtom sellerName;

    @NotNull
    private final IconButtonDTO share;

    @NotNull
    private final SwitchingButton subscribe;

    @NotNull
    private final StatisticsItem subscribers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final List<IconLabelButtonDTO> trustFactors;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatisticsItem {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public StatisticsItem(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ StatisticsItem copy$default(StatisticsItem statisticsItem, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = statisticsItem.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = statisticsItem.subtitle;
            }
            return statisticsItem.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final StatisticsItem copy(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new StatisticsItem(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatisticsItem)) {
                return false;
            }
            StatisticsItem statisticsItem = (StatisticsItem) other;
            return Intrinsics.d(this.title, statisticsItem.title) && Intrinsics.d(this.subtitle, statisticsItem.subtitle);
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.a("StatisticsItem(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    public SellerTransparencyProfileDTO(@NotNull IconDTO avatar, @NotNull StatisticsItem subscribers, @NotNull StatisticsItem reviews, @NotNull SwitchingButton subscribe, @NotNull IconButtonDTO share, @NotNull TextAtom sellerName, List<IconLabelButtonDTO> list, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(share, "share");
        Intrinsics.checkNotNullParameter(sellerName, "sellerName");
        this.avatar = avatar;
        this.subscribers = subscribers;
        this.reviews = reviews;
        this.subscribe = subscribe;
        this.share = share;
        this.sellerName = sellerName;
        this.trustFactors = list;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SellerTransparencyProfileDTO copy$default(SellerTransparencyProfileDTO sellerTransparencyProfileDTO, IconDTO iconDTO, StatisticsItem statisticsItem, StatisticsItem statisticsItem2, SwitchingButton switchingButton, IconButtonDTO iconButtonDTO, TextAtom textAtom, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = sellerTransparencyProfileDTO.avatar;
        }
        if ((i11 & 2) != 0) {
            statisticsItem = sellerTransparencyProfileDTO.subscribers;
        }
        if ((i11 & 4) != 0) {
            statisticsItem2 = sellerTransparencyProfileDTO.reviews;
        }
        if ((i11 & 8) != 0) {
            switchingButton = sellerTransparencyProfileDTO.subscribe;
        }
        if ((i11 & 16) != 0) {
            iconButtonDTO = sellerTransparencyProfileDTO.share;
        }
        if ((i11 & 32) != 0) {
            textAtom = sellerTransparencyProfileDTO.sellerName;
        }
        if ((i11 & 64) != 0) {
            list = sellerTransparencyProfileDTO.trustFactors;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = sellerTransparencyProfileDTO.trackingInfo;
        }
        List list2 = list;
        Map map2 = map;
        IconButtonDTO iconButtonDTO2 = iconButtonDTO;
        TextAtom textAtom2 = textAtom;
        return sellerTransparencyProfileDTO.copy(iconDTO, statisticsItem, statisticsItem2, switchingButton, iconButtonDTO2, textAtom2, list2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StatisticsItem getSubscribers() {
        return this.subscribers;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final StatisticsItem getReviews() {
        return this.reviews;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SwitchingButton getSubscribe() {
        return this.subscribe;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final IconButtonDTO getShare() {
        return this.share;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextAtom getSellerName() {
        return this.sellerName;
    }

    public final List<IconLabelButtonDTO> component7() {
        return this.trustFactors;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final SellerTransparencyProfileDTO copy(@NotNull IconDTO avatar, @NotNull StatisticsItem subscribers, @NotNull StatisticsItem reviews, @NotNull SwitchingButton subscribe, @NotNull IconButtonDTO share, @NotNull TextAtom sellerName, List<IconLabelButtonDTO> trustFactors, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(share, "share");
        Intrinsics.checkNotNullParameter(sellerName, "sellerName");
        return new SellerTransparencyProfileDTO(avatar, subscribers, reviews, subscribe, share, sellerName, trustFactors, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerTransparencyProfileDTO)) {
            return false;
        }
        SellerTransparencyProfileDTO sellerTransparencyProfileDTO = (SellerTransparencyProfileDTO) other;
        return Intrinsics.d(this.avatar, sellerTransparencyProfileDTO.avatar) && Intrinsics.d(this.subscribers, sellerTransparencyProfileDTO.subscribers) && Intrinsics.d(this.reviews, sellerTransparencyProfileDTO.reviews) && Intrinsics.d(this.subscribe, sellerTransparencyProfileDTO.subscribe) && Intrinsics.d(this.share, sellerTransparencyProfileDTO.share) && Intrinsics.d(this.sellerName, sellerTransparencyProfileDTO.sellerName) && Intrinsics.d(this.trustFactors, sellerTransparencyProfileDTO.trustFactors) && Intrinsics.d(this.trackingInfo, sellerTransparencyProfileDTO.trackingInfo);
    }

    @NotNull
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final StatisticsItem getReviews() {
        return this.reviews;
    }

    @NotNull
    public final TextAtom getSellerName() {
        return this.sellerName;
    }

    @NotNull
    public final IconButtonDTO getShare() {
        return this.share;
    }

    @NotNull
    public final SwitchingButton getSubscribe() {
        return this.subscribe;
    }

    @NotNull
    public final StatisticsItem getSubscribers() {
        return this.subscribers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final List<IconLabelButtonDTO> getTrustFactors() {
        return this.trustFactors;
    }

    public int hashCode() {
        int b11 = C2619v.b((this.share.hashCode() + ((this.subscribe.hashCode() + ((this.reviews.hashCode() + ((this.subscribers.hashCode() + (this.avatar.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.sellerName);
        List<IconLabelButtonDTO> list = this.trustFactors;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.avatar;
        StatisticsItem statisticsItem = this.subscribers;
        StatisticsItem statisticsItem2 = this.reviews;
        SwitchingButton switchingButton = this.subscribe;
        IconButtonDTO iconButtonDTO = this.share;
        TextAtom textAtom = this.sellerName;
        List<IconLabelButtonDTO> list = this.trustFactors;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SellerTransparencyProfileDTO(avatar=");
        sb2.append(iconDTO);
        sb2.append(", subscribers=");
        sb2.append(statisticsItem);
        sb2.append(", reviews=");
        sb2.append(statisticsItem2);
        sb2.append(", subscribe=");
        sb2.append(switchingButton);
        sb2.append(", share=");
        sb2.append(iconButtonDTO);
        sb2.append(", sellerName=");
        sb2.append(textAtom);
        sb2.append(", trustFactors=");
        return C3143a.h(sb2, list, ", trackingInfo=", map, ")");
    }
}
