package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014J@\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO;", "", "topBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "items", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;", "pageControls", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "scrollTime", "", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;Ljava/lang/Long;)V", "getTopBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getItems", "()Ljava/util/List;", "getPageControls", "()Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "getScrollTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;Ljava/lang/Long;)Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO;", "equals", "", "other", "hashCode", "", "toString", "", "Item", "PageControls", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavLikezoneCaruselDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Item> items;

    @NotNull
    private final PageControls pageControls;
    private final Long scrollTime;
    private final BadgeDTO topBadge;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0082\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u000b\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "accentImage", "", "backgroundColor", "backgroundImage", "actionBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "isCenterAlignment", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAccentImage", "()Ljava/lang/String;", "getBackgroundColor", "getBackgroundImage", "getActionBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;", "equals", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final String accentImage;
        private final AtomActionDTO action;
        private final BadgeDTO actionBadge;
        private final String backgroundColor;

        @NotNull
        private final String backgroundImage;
        private final Boolean isCenterAlignment;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Item(@NotNull TextDTO title, TextDTO textDTO, String str, String str2, @NotNull String backgroundImage, BadgeDTO badgeDTO, Boolean bool, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            this.title = title;
            this.subtitle = textDTO;
            this.accentImage = str;
            this.backgroundColor = str2;
            this.backgroundImage = backgroundImage;
            this.actionBadge = badgeDTO;
            this.isCenterAlignment = bool;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Item copy$default(Item item, TextDTO textDTO, TextDTO textDTO2, String str, String str2, String str3, BadgeDTO badgeDTO, Boolean bool, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = item.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = item.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = item.accentImage;
            }
            if ((i11 & 8) != 0) {
                str2 = item.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                str3 = item.backgroundImage;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = item.actionBadge;
            }
            if ((i11 & 64) != 0) {
                bool = item.isCenterAlignment;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = item.action;
            }
            if ((i11 & 256) != 0) {
                map = item.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            BadgeDTO badgeDTO2 = badgeDTO;
            Boolean bool2 = bool;
            String str4 = str3;
            String str5 = str;
            return item.copy(textDTO, textDTO2, str5, str2, str4, badgeDTO2, bool2, atomActionDTO2, map2);
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
        public final String getAccentImage() {
            return this.accentImage;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getActionBadge() {
            return this.actionBadge;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getIsCenterAlignment() {
            return this.isCenterAlignment;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final Item copy(@NotNull TextDTO title, TextDTO subtitle, String accentImage, String backgroundColor, @NotNull String backgroundImage, BadgeDTO actionBadge, Boolean isCenterAlignment, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            return new Item(title, subtitle, accentImage, backgroundColor, backgroundImage, actionBadge, isCenterAlignment, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.title, item.title) && Intrinsics.d(this.subtitle, item.subtitle) && Intrinsics.d(this.accentImage, item.accentImage) && Intrinsics.d(this.backgroundColor, item.backgroundColor) && Intrinsics.d(this.backgroundImage, item.backgroundImage) && Intrinsics.d(this.actionBadge, item.actionBadge) && Intrinsics.d(this.isCenterAlignment, item.isCenterAlignment) && Intrinsics.d(this.action, item.action) && Intrinsics.d(this.trackingInfo, item.trackingInfo);
        }

        public final String getAccentImage() {
            return this.accentImage;
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getActionBadge() {
            return this.actionBadge;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getBackgroundImage() {
            return this.backgroundImage;
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
            String str = this.accentImage;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int a11 = g.a((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.backgroundImage);
            BadgeDTO badgeDTO = this.actionBadge;
            int hashCode4 = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            Boolean bool = this.isCenterAlignment;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isCenterAlignment() {
            return this.isCenterAlignment;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.accentImage;
            String str2 = this.backgroundColor;
            String str3 = this.backgroundImage;
            BadgeDTO badgeDTO = this.actionBadge;
            Boolean bool = this.isCenterAlignment;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = D3.g.g("Item(title=", textDTO, ", subtitle=", textDTO2, ", accentImage=");
            a.h(g10, str, ", backgroundColor=", str2, ", backgroundImage=");
            g10.append(str3);
            g10.append(", actionBadge=");
            g10.append(badgeDTO);
            g10.append(", isCenterAlignment=");
            g10.append(bool);
            g10.append(", action=");
            g10.append(atomActionDTO);
            g10.append(", trackingInfo=");
            return P.f(g10, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "", "backgroundColor", "", "activeColor", "inactiveColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getActiveColor", "getInactiveColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PageControls {
        public static final int $stable = 0;

        @NotNull
        private final String activeColor;

        @NotNull
        private final String backgroundColor;
        private final String inactiveColor;

        public PageControls(@NotNull String backgroundColor, @NotNull String activeColor, String str) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(activeColor, "activeColor");
            this.backgroundColor = backgroundColor;
            this.activeColor = activeColor;
            this.inactiveColor = str;
        }

        public static /* synthetic */ PageControls copy$default(PageControls pageControls, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pageControls.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = pageControls.activeColor;
            }
            if ((i11 & 4) != 0) {
                str3 = pageControls.inactiveColor;
            }
            return pageControls.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActiveColor() {
            return this.activeColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInactiveColor() {
            return this.inactiveColor;
        }

        @NotNull
        public final PageControls copy(@NotNull String backgroundColor, @NotNull String activeColor, String inactiveColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(activeColor, "activeColor");
            return new PageControls(backgroundColor, activeColor, inactiveColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageControls)) {
                return false;
            }
            PageControls pageControls = (PageControls) other;
            return Intrinsics.d(this.backgroundColor, pageControls.backgroundColor) && Intrinsics.d(this.activeColor, pageControls.activeColor) && Intrinsics.d(this.inactiveColor, pageControls.inactiveColor);
        }

        @NotNull
        public final String getActiveColor() {
            return this.activeColor;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getInactiveColor() {
            return this.inactiveColor;
        }

        public int hashCode() {
            int a11 = g.a(this.backgroundColor.hashCode() * 31, 31, this.activeColor);
            String str = this.inactiveColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.activeColor;
            return o0.c(C3660k.d("PageControls(backgroundColor=", str, ", activeColor=", str2, ", inactiveColor="), this.inactiveColor, ")");
        }
    }

    public NavLikezoneCaruselDTO(BadgeDTO badgeDTO, @NotNull List<Item> items, @NotNull PageControls pageControls, Long l11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pageControls, "pageControls");
        this.topBadge = badgeDTO;
        this.items = items;
        this.pageControls = pageControls;
        this.scrollTime = l11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavLikezoneCaruselDTO copy$default(NavLikezoneCaruselDTO navLikezoneCaruselDTO, BadgeDTO badgeDTO, List list, PageControls pageControls, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeDTO = navLikezoneCaruselDTO.topBadge;
        }
        if ((i11 & 2) != 0) {
            list = navLikezoneCaruselDTO.items;
        }
        if ((i11 & 4) != 0) {
            pageControls = navLikezoneCaruselDTO.pageControls;
        }
        if ((i11 & 8) != 0) {
            l11 = navLikezoneCaruselDTO.scrollTime;
        }
        return navLikezoneCaruselDTO.copy(badgeDTO, list, pageControls, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final BadgeDTO getTopBadge() {
        return this.topBadge;
    }

    @NotNull
    public final List<Item> component2() {
        return this.items;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PageControls getPageControls() {
        return this.pageControls;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getScrollTime() {
        return this.scrollTime;
    }

    @NotNull
    public final NavLikezoneCaruselDTO copy(BadgeDTO topBadge, @NotNull List<Item> items, @NotNull PageControls pageControls, Long scrollTime) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pageControls, "pageControls");
        return new NavLikezoneCaruselDTO(topBadge, items, pageControls, scrollTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavLikezoneCaruselDTO)) {
            return false;
        }
        NavLikezoneCaruselDTO navLikezoneCaruselDTO = (NavLikezoneCaruselDTO) other;
        return Intrinsics.d(this.topBadge, navLikezoneCaruselDTO.topBadge) && Intrinsics.d(this.items, navLikezoneCaruselDTO.items) && Intrinsics.d(this.pageControls, navLikezoneCaruselDTO.pageControls) && Intrinsics.d(this.scrollTime, navLikezoneCaruselDTO.scrollTime);
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @NotNull
    public final PageControls getPageControls() {
        return this.pageControls;
    }

    public final Long getScrollTime() {
        return this.scrollTime;
    }

    public final BadgeDTO getTopBadge() {
        return this.topBadge;
    }

    public int hashCode() {
        BadgeDTO badgeDTO = this.topBadge;
        int hashCode = (this.pageControls.hashCode() + g.b((badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31, 31, this.items)) * 31;
        Long l11 = this.scrollTime;
        return hashCode + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NavLikezoneCaruselDTO(topBadge=" + this.topBadge + ", items=" + this.items + ", pageControls=" + this.pageControls + ", scrollTime=" + this.scrollTime + ")";
    }
}
