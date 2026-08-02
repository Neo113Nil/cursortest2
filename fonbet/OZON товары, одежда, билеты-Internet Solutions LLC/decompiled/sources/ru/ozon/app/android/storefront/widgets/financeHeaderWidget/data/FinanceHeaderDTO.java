package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.data;

import B0.C2454a;
import B3.p;
import D3.g;
import De.C2860c;
import Nh.a;
import T7.P;
import Ul.C4070a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$FinanceBadgeDTO;", "tooltip", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$TooltipDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$FinanceBadgeDTO;Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$TooltipDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$FinanceBadgeDTO;", "getTooltip", "()Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$TooltipDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "FinanceBadgeDTO", "TooltipDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FinanceHeaderDTO {
    public static final int $stable = 8;
    private final FinanceBadgeDTO badge;

    @NotNull
    private final TextDTO title;
    private final TooltipDTO tooltip;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$FinanceBadgeDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinanceBadgeDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public FinanceBadgeDTO(@NotNull TextDTO title, @NotNull ImageDTO image, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = title;
            this.image = image;
            this.backgroundColor = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ FinanceBadgeDTO copy$default(FinanceBadgeDTO financeBadgeDTO, TextDTO textDTO, ImageDTO imageDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = financeBadgeDTO.title;
            }
            if ((i11 & 2) != 0) {
                imageDTO = financeBadgeDTO.image;
            }
            if ((i11 & 4) != 0) {
                str = financeBadgeDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = financeBadgeDTO.action;
            }
            if ((i11 & 16) != 0) {
                map = financeBadgeDTO.trackingInfo;
            }
            Map map2 = map;
            String str2 = str;
            return financeBadgeDTO.copy(textDTO, imageDTO, str2, atomActionDTO, map2);
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
        public final FinanceBadgeDTO copy(@NotNull TextDTO title, @NotNull ImageDTO image, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            return new FinanceBadgeDTO(title, image, backgroundColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinanceBadgeDTO)) {
                return false;
            }
            FinanceBadgeDTO financeBadgeDTO = (FinanceBadgeDTO) other;
            return Intrinsics.d(this.title, financeBadgeDTO.title) && Intrinsics.d(this.image, financeBadgeDTO.image) && Intrinsics.d(this.backgroundColor, financeBadgeDTO.backgroundColor) && Intrinsics.d(this.action, financeBadgeDTO.action) && Intrinsics.d(this.trackingInfo, financeBadgeDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.image, this.title.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            ImageDTO imageDTO = this.image;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("FinanceBadgeDTO(title=");
            sb2.append(textDTO);
            sb2.append(", image=");
            sb2.append(imageDTO);
            sb2.append(", backgroundColor=");
            p.c(str, ", action=", ", trackingInfo=", sb2, atomActionDTO);
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jx\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\n\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$TooltipDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundColor", "", "autohideDelay", "", "maxWidth", "isExpanded", "", "tooltipKey", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getAutohideDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxWidth", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTooltipKey", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$TooltipDTO;", "equals", "other", "hashCode", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TooltipDTO {
        public static final int $stable = 8;
        private final Integer autohideDelay;
        private final String backgroundColor;
        private final Boolean isExpanded;
        private final Integer maxWidth;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final String tooltipKey;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public TooltipDTO(@NotNull TextDTO title, TextDTO textDTO, String str, Integer num, Integer num2, Boolean bool, String str2, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
            this.backgroundColor = str;
            this.autohideDelay = num;
            this.maxWidth = num2;
            this.isExpanded = bool;
            this.tooltipKey = str2;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TooltipDTO copy$default(TooltipDTO tooltipDTO, TextDTO textDTO, TextDTO textDTO2, String str, Integer num, Integer num2, Boolean bool, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = tooltipDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = tooltipDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = tooltipDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                num = tooltipDTO.autohideDelay;
            }
            if ((i11 & 16) != 0) {
                num2 = tooltipDTO.maxWidth;
            }
            if ((i11 & 32) != 0) {
                bool = tooltipDTO.isExpanded;
            }
            if ((i11 & 64) != 0) {
                str2 = tooltipDTO.tooltipKey;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = tooltipDTO.trackingInfo;
            }
            String str3 = str2;
            Map map2 = map;
            Integer num3 = num2;
            Boolean bool2 = bool;
            return tooltipDTO.copy(textDTO, textDTO2, str, num, num3, bool2, str3, map2);
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
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getAutohideDelay() {
            return this.autohideDelay;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getMaxWidth() {
            return this.maxWidth;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getIsExpanded() {
            return this.isExpanded;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTooltipKey() {
            return this.tooltipKey;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final TooltipDTO copy(@NotNull TextDTO title, TextDTO subtitle, String backgroundColor, Integer autohideDelay, Integer maxWidth, Boolean isExpanded, String tooltipKey, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new TooltipDTO(title, subtitle, backgroundColor, autohideDelay, maxWidth, isExpanded, tooltipKey, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TooltipDTO)) {
                return false;
            }
            TooltipDTO tooltipDTO = (TooltipDTO) other;
            return Intrinsics.d(this.title, tooltipDTO.title) && Intrinsics.d(this.subtitle, tooltipDTO.subtitle) && Intrinsics.d(this.backgroundColor, tooltipDTO.backgroundColor) && Intrinsics.d(this.autohideDelay, tooltipDTO.autohideDelay) && Intrinsics.d(this.maxWidth, tooltipDTO.maxWidth) && Intrinsics.d(this.isExpanded, tooltipDTO.isExpanded) && Intrinsics.d(this.tooltipKey, tooltipDTO.tooltipKey) && Intrinsics.d(this.trackingInfo, tooltipDTO.trackingInfo);
        }

        public final Integer getAutohideDelay() {
            return this.autohideDelay;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getMaxWidth() {
            return this.maxWidth;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final String getTooltipKey() {
            return this.tooltipKey;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.autohideDelay;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxWidth;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.isExpanded;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.tooltipKey;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isExpanded() {
            return this.isExpanded;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.backgroundColor;
            Integer num = this.autohideDelay;
            Integer num2 = this.maxWidth;
            Boolean bool = this.isExpanded;
            String str2 = this.tooltipKey;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = g.g("TooltipDTO(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor=");
            C2454a.f(num, str, ", autohideDelay=", ", maxWidth=", g10);
            C2860c.f(bool, num2, ", isExpanded=", ", tooltipKey=", g10);
            return C4070a.a(g10, str2, ", trackingInfo=", map, ")");
        }
    }

    public FinanceHeaderDTO(@NotNull TextDTO title, FinanceBadgeDTO financeBadgeDTO, TooltipDTO tooltipDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.badge = financeBadgeDTO;
        this.tooltip = tooltipDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinanceHeaderDTO copy$default(FinanceHeaderDTO financeHeaderDTO, TextDTO textDTO, FinanceBadgeDTO financeBadgeDTO, TooltipDTO tooltipDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = financeHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            financeBadgeDTO = financeHeaderDTO.badge;
        }
        if ((i11 & 4) != 0) {
            tooltipDTO = financeHeaderDTO.tooltip;
        }
        if ((i11 & 8) != 0) {
            map = financeHeaderDTO.trackingInfo;
        }
        return financeHeaderDTO.copy(textDTO, financeBadgeDTO, tooltipDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final FinanceBadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component3, reason: from getter */
    public final TooltipDTO getTooltip() {
        return this.tooltip;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final FinanceHeaderDTO copy(@NotNull TextDTO title, FinanceBadgeDTO badge, TooltipDTO tooltip, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new FinanceHeaderDTO(title, badge, tooltip, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceHeaderDTO)) {
            return false;
        }
        FinanceHeaderDTO financeHeaderDTO = (FinanceHeaderDTO) other;
        return Intrinsics.d(this.title, financeHeaderDTO.title) && Intrinsics.d(this.badge, financeHeaderDTO.badge) && Intrinsics.d(this.tooltip, financeHeaderDTO.tooltip) && Intrinsics.d(this.trackingInfo, financeHeaderDTO.trackingInfo);
    }

    public final FinanceBadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final TooltipDTO getTooltip() {
        return this.tooltip;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        FinanceBadgeDTO financeBadgeDTO = this.badge;
        int hashCode2 = (hashCode + (financeBadgeDTO == null ? 0 : financeBadgeDTO.hashCode())) * 31;
        TooltipDTO tooltipDTO = this.tooltip;
        int hashCode3 = (hashCode2 + (tooltipDTO == null ? 0 : tooltipDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FinanceHeaderDTO(title=" + this.title + ", badge=" + this.badge + ", tooltip=" + this.tooltip + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
