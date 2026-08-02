package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data;

import B90.C2616s;
import C.o0;
import De.C2859b;
import G.g;
import Nh.a;
import T7.P;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO;", "", "content", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ContentDTO;", "asyncParameters", "", "", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ContentDTO;Ljava/util/Map;)V", "getContent", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ContentDTO;", "getAsyncParameters", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ContentDTO", "BannerDTO", "ProgressBarDTO", "ProgressDTO", "CardDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MilesForBuyersDTO {
    public static final int $stable = 8;
    private final Map<String, Object> asyncParameters;

    @NotNull
    private final ContentDTO content;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$BannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "rightImage", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBackgroundImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getRightImage", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerDTO {
        public static final int $stable = 8;

        @NotNull
        private final ButtonV3DTO actionButton;
        private final ImageDTO backgroundImage;

        @NotNull
        private final ImageDTO rightImage;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public BannerDTO(@NotNull TextDTO title, @NotNull ButtonV3DTO actionButton, ImageDTO imageDTO, @NotNull ImageDTO rightImage, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            Intrinsics.checkNotNullParameter(rightImage, "rightImage");
            this.title = title;
            this.actionButton = actionButton;
            this.backgroundImage = imageDTO;
            this.rightImage = rightImage;
            this.trackingInfo = map;
        }

        public static /* synthetic */ BannerDTO copy$default(BannerDTO bannerDTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO, ImageDTO imageDTO, ImageDTO imageDTO2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = bannerDTO.title;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = bannerDTO.actionButton;
            }
            if ((i11 & 4) != 0) {
                imageDTO = bannerDTO.backgroundImage;
            }
            if ((i11 & 8) != 0) {
                imageDTO2 = bannerDTO.rightImage;
            }
            if ((i11 & 16) != 0) {
                map = bannerDTO.trackingInfo;
            }
            Map map2 = map;
            ImageDTO imageDTO3 = imageDTO;
            return bannerDTO.copy(textDTO, buttonV3DTO, imageDTO3, imageDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        /* renamed from: component3, reason: from getter */
        public final ImageDTO getBackgroundImage() {
            return this.backgroundImage;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ImageDTO getRightImage() {
            return this.rightImage;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final BannerDTO copy(@NotNull TextDTO title, @NotNull ButtonV3DTO actionButton, ImageDTO backgroundImage, @NotNull ImageDTO rightImage, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            Intrinsics.checkNotNullParameter(rightImage, "rightImage");
            return new BannerDTO(title, actionButton, backgroundImage, rightImage, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerDTO)) {
                return false;
            }
            BannerDTO bannerDTO = (BannerDTO) other;
            return Intrinsics.d(this.title, bannerDTO.title) && Intrinsics.d(this.actionButton, bannerDTO.actionButton) && Intrinsics.d(this.backgroundImage, bannerDTO.backgroundImage) && Intrinsics.d(this.rightImage, bannerDTO.rightImage) && Intrinsics.d(this.trackingInfo, bannerDTO.trackingInfo);
        }

        @NotNull
        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        public final ImageDTO getBackgroundImage() {
            return this.backgroundImage;
        }

        @NotNull
        public final ImageDTO getRightImage() {
            return this.rightImage;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int c11 = C2859b.c(this.actionButton, this.title.hashCode() * 31, 31);
            ImageDTO imageDTO = this.backgroundImage;
            int b11 = a.b(this.rightImage, (c11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            ButtonV3DTO buttonV3DTO = this.actionButton;
            ImageDTO imageDTO = this.backgroundImage;
            ImageDTO imageDTO2 = this.rightImage;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("BannerDTO(title=");
            sb2.append(textDTO);
            sb2.append(", actionButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", backgroundImage=");
            sb2.append(imageDTO);
            sb2.append(", rightImage=");
            sb2.append(imageDTO2);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J]\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "borderColor", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "withAnimation", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO$Animation;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO$Animation;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getWithAnimation", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO$Animation;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Animation", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CardDTO {
        public static final int $stable = 0;

        @NotNull
        private final ButtonV3DTO actionButton;

        @NotNull
        private final String backgroundColor;
        private final String borderColor;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @EnumNullFallback
        private final Animation withAnimation;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO$Animation;", "", "<init>", "(Ljava/lang/String;I)V", "MILE_IMAGE_CLIMBING_OVER", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Animation {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ Animation[] $VALUES;
            public static final Animation MILE_IMAGE_CLIMBING_OVER = new Animation("MILE_IMAGE_CLIMBING_OVER", 0);

            private static final /* synthetic */ Animation[] $values() {
                return new Animation[]{MILE_IMAGE_CLIMBING_OVER};
            }

            static {
                Animation[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Animation(String str, int i11) {
            }

            public static Animation valueOf(String str) {
                return (Animation) Enum.valueOf(Animation.class, str);
            }

            public static Animation[] values() {
                return (Animation[]) $VALUES.clone();
            }
        }

        public CardDTO(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO actionButton, @NotNull String backgroundColor, String str, @NotNull CommonControlSettings common, Animation animation) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(common, "common");
            this.image = image;
            this.title = title;
            this.subtitle = subtitle;
            this.actionButton = actionButton;
            this.backgroundColor = backgroundColor;
            this.borderColor = str;
            this.common = common;
            this.withAnimation = animation;
        }

        public static /* synthetic */ CardDTO copy$default(CardDTO cardDTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, String str, String str2, CommonControlSettings commonControlSettings, Animation animation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = cardDTO.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = cardDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = cardDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO = cardDTO.actionButton;
            }
            if ((i11 & 16) != 0) {
                str = cardDTO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                str2 = cardDTO.borderColor;
            }
            if ((i11 & 64) != 0) {
                commonControlSettings = cardDTO.common;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                animation = cardDTO.withAnimation;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Animation animation2 = animation;
            String str3 = str;
            String str4 = str2;
            return cardDTO.copy(imageDTO, textDTO, textDTO2, buttonV3DTO, str3, str4, commonControlSettings2, animation2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component8, reason: from getter */
        public final Animation getWithAnimation() {
            return this.withAnimation;
        }

        @NotNull
        public final CardDTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO actionButton, @NotNull String backgroundColor, String borderColor, @NotNull CommonControlSettings common, Animation withAnimation) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(common, "common");
            return new CardDTO(image, title, subtitle, actionButton, backgroundColor, borderColor, common, withAnimation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardDTO)) {
                return false;
            }
            CardDTO cardDTO = (CardDTO) other;
            return Intrinsics.d(this.image, cardDTO.image) && Intrinsics.d(this.title, cardDTO.title) && Intrinsics.d(this.subtitle, cardDTO.subtitle) && Intrinsics.d(this.actionButton, cardDTO.actionButton) && Intrinsics.d(this.backgroundColor, cardDTO.backgroundColor) && Intrinsics.d(this.borderColor, cardDTO.borderColor) && Intrinsics.d(this.common, cardDTO.common) && this.withAnimation == cardDTO.withAnimation;
        }

        @NotNull
        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Animation getWithAnimation() {
            return this.withAnimation;
        }

        public int hashCode() {
            int a11 = g.a(C2859b.c(this.actionButton, Ns.b.a(this.subtitle, Ns.b.a(this.title, this.image.hashCode() * 31, 31), 31), 31), 31, this.backgroundColor);
            String str = this.borderColor;
            int a12 = Bi.a.a(this.common, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
            Animation animation = this.withAnimation;
            return a12 + (animation != null ? animation.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.actionButton;
            String str = this.backgroundColor;
            String str2 = this.borderColor;
            CommonControlSettings commonControlSettings = this.common;
            Animation animation = this.withAnimation;
            StringBuilder d11 = C2616s.d("CardDTO(image=", imageDTO, ", title=", textDTO, ", subtitle=");
            d11.append(textDTO2);
            d11.append(", actionButton=");
            d11.append(buttonV3DTO);
            d11.append(", backgroundColor=");
            a.h(d11, str, ", borderColor=", str2, ", common=");
            d11.append(commonControlSettings);
            d11.append(", withAnimation=");
            d11.append(animation);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ContentDTO;", "", "banner", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$BannerDTO;", "progressBar", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressBarDTO;", "card", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$BannerDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressBarDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO;)V", "getBanner", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$BannerDTO;", "getProgressBar", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressBarDTO;", "getCard", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentDTO {
        public static final int $stable = 8;
        private final BannerDTO banner;
        private final CardDTO card;
        private final ProgressBarDTO progressBar;

        public ContentDTO(BannerDTO bannerDTO, ProgressBarDTO progressBarDTO, CardDTO cardDTO) {
            this.banner = bannerDTO;
            this.progressBar = progressBarDTO;
            this.card = cardDTO;
        }

        public static /* synthetic */ ContentDTO copy$default(ContentDTO contentDTO, BannerDTO bannerDTO, ProgressBarDTO progressBarDTO, CardDTO cardDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bannerDTO = contentDTO.banner;
            }
            if ((i11 & 2) != 0) {
                progressBarDTO = contentDTO.progressBar;
            }
            if ((i11 & 4) != 0) {
                cardDTO = contentDTO.card;
            }
            return contentDTO.copy(bannerDTO, progressBarDTO, cardDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final BannerDTO getBanner() {
            return this.banner;
        }

        /* renamed from: component2, reason: from getter */
        public final ProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        /* renamed from: component3, reason: from getter */
        public final CardDTO getCard() {
            return this.card;
        }

        @NotNull
        public final ContentDTO copy(BannerDTO banner, ProgressBarDTO progressBar, CardDTO card) {
            return new ContentDTO(banner, progressBar, card);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentDTO)) {
                return false;
            }
            ContentDTO contentDTO = (ContentDTO) other;
            return Intrinsics.d(this.banner, contentDTO.banner) && Intrinsics.d(this.progressBar, contentDTO.progressBar) && Intrinsics.d(this.card, contentDTO.card);
        }

        public final BannerDTO getBanner() {
            return this.banner;
        }

        public final CardDTO getCard() {
            return this.card;
        }

        public final ProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        public int hashCode() {
            BannerDTO bannerDTO = this.banner;
            int hashCode = (bannerDTO == null ? 0 : bannerDTO.hashCode()) * 31;
            ProgressBarDTO progressBarDTO = this.progressBar;
            int hashCode2 = (hashCode + (progressBarDTO == null ? 0 : progressBarDTO.hashCode())) * 31;
            CardDTO cardDTO = this.card;
            return hashCode2 + (cardDTO != null ? cardDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ContentDTO(banner=" + this.banner + ", progressBar=" + this.progressBar + ", card=" + this.card + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J_\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressBarDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "progressBar", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressDTO;", "progressBarDescription", "rightImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "borderColor", "", "subtitleBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getProgressBar", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressDTO;", "getProgressBarDescription", "getRightImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getBorderColor", "()Ljava/lang/String;", "getSubtitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBarDTO {
        public static final int $stable = 8;
        private final String borderColor;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final ProgressDTO progressBar;
        private final TextDTO progressBarDescription;

        @NotNull
        private final ImageDTO rightImage;

        @NotNull
        private final TextDTO subtitle;
        private final BadgeDTO subtitleBadge;

        @NotNull
        private final TextDTO title;

        public ProgressBarDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ProgressDTO progressBar, TextDTO textDTO, @NotNull ImageDTO rightImage, @NotNull CommonControlSettings common, String str, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            Intrinsics.checkNotNullParameter(rightImage, "rightImage");
            Intrinsics.checkNotNullParameter(common, "common");
            this.title = title;
            this.subtitle = subtitle;
            this.progressBar = progressBar;
            this.progressBarDescription = textDTO;
            this.rightImage = rightImage;
            this.common = common;
            this.borderColor = str;
            this.subtitleBadge = badgeDTO;
        }

        public static /* synthetic */ ProgressBarDTO copy$default(ProgressBarDTO progressBarDTO, TextDTO textDTO, TextDTO textDTO2, ProgressDTO progressDTO, TextDTO textDTO3, ImageDTO imageDTO, CommonControlSettings commonControlSettings, String str, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = progressBarDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = progressBarDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                progressDTO = progressBarDTO.progressBar;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = progressBarDTO.progressBarDescription;
            }
            if ((i11 & 16) != 0) {
                imageDTO = progressBarDTO.rightImage;
            }
            if ((i11 & 32) != 0) {
                commonControlSettings = progressBarDTO.common;
            }
            if ((i11 & 64) != 0) {
                str = progressBarDTO.borderColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                badgeDTO = progressBarDTO.subtitleBadge;
            }
            String str2 = str;
            BadgeDTO badgeDTO2 = badgeDTO;
            ImageDTO imageDTO2 = imageDTO;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return progressBarDTO.copy(textDTO, textDTO2, progressDTO, textDTO3, imageDTO2, commonControlSettings2, str2, badgeDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ProgressDTO getProgressBar() {
            return this.progressBar;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getProgressBarDescription() {
            return this.progressBarDescription;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ImageDTO getRightImage() {
            return this.rightImage;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component8, reason: from getter */
        public final BadgeDTO getSubtitleBadge() {
            return this.subtitleBadge;
        }

        @NotNull
        public final ProgressBarDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ProgressDTO progressBar, TextDTO progressBarDescription, @NotNull ImageDTO rightImage, @NotNull CommonControlSettings common, String borderColor, BadgeDTO subtitleBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            Intrinsics.checkNotNullParameter(rightImage, "rightImage");
            Intrinsics.checkNotNullParameter(common, "common");
            return new ProgressBarDTO(title, subtitle, progressBar, progressBarDescription, rightImage, common, borderColor, subtitleBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBarDTO)) {
                return false;
            }
            ProgressBarDTO progressBarDTO = (ProgressBarDTO) other;
            return Intrinsics.d(this.title, progressBarDTO.title) && Intrinsics.d(this.subtitle, progressBarDTO.subtitle) && Intrinsics.d(this.progressBar, progressBarDTO.progressBar) && Intrinsics.d(this.progressBarDescription, progressBarDTO.progressBarDescription) && Intrinsics.d(this.rightImage, progressBarDTO.rightImage) && Intrinsics.d(this.common, progressBarDTO.common) && Intrinsics.d(this.borderColor, progressBarDTO.borderColor) && Intrinsics.d(this.subtitleBadge, progressBarDTO.subtitleBadge);
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final ProgressDTO getProgressBar() {
            return this.progressBar;
        }

        public final TextDTO getProgressBarDescription() {
            return this.progressBarDescription;
        }

        @NotNull
        public final ImageDTO getRightImage() {
            return this.rightImage;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final BadgeDTO getSubtitleBadge() {
            return this.subtitleBadge;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.progressBar.hashCode() + Ns.b.a(this.subtitle, this.title.hashCode() * 31, 31)) * 31;
            TextDTO textDTO = this.progressBarDescription;
            int a11 = Bi.a.a(this.common, a.b(this.rightImage, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31);
            String str = this.borderColor;
            int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            BadgeDTO badgeDTO = this.subtitleBadge;
            return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ProgressDTO progressDTO = this.progressBar;
            TextDTO textDTO3 = this.progressBarDescription;
            ImageDTO imageDTO = this.rightImage;
            CommonControlSettings commonControlSettings = this.common;
            String str = this.borderColor;
            BadgeDTO badgeDTO = this.subtitleBadge;
            StringBuilder g10 = D3.g.g("ProgressBarDTO(title=", textDTO, ", subtitle=", textDTO2, ", progressBar=");
            g10.append(progressDTO);
            g10.append(", progressBarDescription=");
            g10.append(textDTO3);
            g10.append(", rightImage=");
            g10.append(imageDTO);
            g10.append(", common=");
            g10.append(commonControlSettings);
            g10.append(", borderColor=");
            g10.append(str);
            g10.append(", subtitleBadge=");
            g10.append(badgeDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressDTO;", "", "progressBar", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "backgroundColor", "", "darkBackgroundColor", "<init>", "(Lru/ozon/app/android/atoms/data/progress/ProgressBar;Ljava/lang/String;Ljava/lang/String;)V", "getProgressBar", "()Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "getBackgroundColor", "()Ljava/lang/String;", "getDarkBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressDTO {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final String darkBackgroundColor;

        @NotNull
        private final ProgressBar progressBar;

        public ProgressDTO(@NotNull ProgressBar progressBar, String str, String str2) {
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            this.progressBar = progressBar;
            this.backgroundColor = str;
            this.darkBackgroundColor = str2;
        }

        public static /* synthetic */ ProgressDTO copy$default(ProgressDTO progressDTO, ProgressBar progressBar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                progressBar = progressDTO.progressBar;
            }
            if ((i11 & 2) != 0) {
                str = progressDTO.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                str2 = progressDTO.darkBackgroundColor;
            }
            return progressDTO.copy(progressBar, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDarkBackgroundColor() {
            return this.darkBackgroundColor;
        }

        @NotNull
        public final ProgressDTO copy(@NotNull ProgressBar progressBar, String backgroundColor, String darkBackgroundColor) {
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            return new ProgressDTO(progressBar, backgroundColor, darkBackgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressDTO)) {
                return false;
            }
            ProgressDTO progressDTO = (ProgressDTO) other;
            return Intrinsics.d(this.progressBar, progressDTO.progressBar) && Intrinsics.d(this.backgroundColor, progressDTO.backgroundColor) && Intrinsics.d(this.darkBackgroundColor, progressDTO.darkBackgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getDarkBackgroundColor() {
            return this.darkBackgroundColor;
        }

        @NotNull
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        public int hashCode() {
            int hashCode = this.progressBar.hashCode() * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.darkBackgroundColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ProgressBar progressBar = this.progressBar;
            String str = this.backgroundColor;
            String str2 = this.darkBackgroundColor;
            StringBuilder sb2 = new StringBuilder("ProgressDTO(progressBar=");
            sb2.append(progressBar);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", darkBackgroundColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    public MilesForBuyersDTO(@NotNull ContentDTO content, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.asyncParameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MilesForBuyersDTO copy$default(MilesForBuyersDTO milesForBuyersDTO, ContentDTO contentDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            contentDTO = milesForBuyersDTO.content;
        }
        if ((i11 & 2) != 0) {
            map = milesForBuyersDTO.asyncParameters;
        }
        return milesForBuyersDTO.copy(contentDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ContentDTO getContent() {
        return this.content;
    }

    public final Map<String, Object> component2() {
        return this.asyncParameters;
    }

    @NotNull
    public final MilesForBuyersDTO copy(@NotNull ContentDTO content, Map<String, ? extends Object> asyncParameters) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new MilesForBuyersDTO(content, asyncParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilesForBuyersDTO)) {
            return false;
        }
        MilesForBuyersDTO milesForBuyersDTO = (MilesForBuyersDTO) other;
        return Intrinsics.d(this.content, milesForBuyersDTO.content) && Intrinsics.d(this.asyncParameters, milesForBuyersDTO.asyncParameters);
    }

    public final Map<String, Object> getAsyncParameters() {
        return this.asyncParameters;
    }

    @NotNull
    public final ContentDTO getContent() {
        return this.content;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        Map<String, Object> map = this.asyncParameters;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "MilesForBuyersDTO(content=" + this.content + ", asyncParameters=" + this.asyncParameters + ")";
    }
}
