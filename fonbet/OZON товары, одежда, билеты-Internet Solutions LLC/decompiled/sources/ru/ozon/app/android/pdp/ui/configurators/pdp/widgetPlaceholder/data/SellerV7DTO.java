package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

import AZ.c;
import Bk.C2638a;
import C.o0;
import Gl.C3124a;
import I0.C3173b;
import Nh.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003:;<Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010)\u001a\u00020\u0001H\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u007f\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u00104\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001b¨\u0006="}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BasePlaceholderWidgetObject;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Header;", "sellerCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "rating", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Island;", "chat", "backgroundColor", "", "innerBackgroundColor", "backgroundImage", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "json", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Header;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Island;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Island;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getHeader", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Header;", "getSellerCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getRating", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Island;", "getChat", "getBackgroundColor", "()Ljava/lang/String;", "getInnerBackgroundColor", "getBackgroundImage", "getTrackingInfo", "()Ljava/util/Map;", "getJson", "setJson", "(Ljava/lang/String;)V", "hasSimpleCell", "", "getHasSimpleCell", "()Z", "innerBackground", "getInnerBackground", "copyExcludingAnalytics", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "Header", "Island", "Badge", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerV7DTO extends BasePlaceholderWidgetObject {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final String backgroundImage;
    private final Island chat;
    private final boolean hasSimpleCell;
    private final Header header;
    private final String innerBackground;
    private final String innerBackgroundColor;
    private String json;
    private final Island rating;

    @NotNull
    private final CellDTO sellerCell;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Badge;", "", "isSubscribed", "", "subscribed", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "unsubscribed", "<init>", "(ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "()Z", "getSubscribed", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getUnsubscribed", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badge {
        public static final int $stable = 0;
        private final boolean isSubscribed;

        @NotNull
        private final BadgeDTO subscribed;

        @NotNull
        private final BadgeDTO unsubscribed;

        public Badge(boolean z11, @NotNull BadgeDTO subscribed, @NotNull BadgeDTO unsubscribed) {
            Intrinsics.checkNotNullParameter(subscribed, "subscribed");
            Intrinsics.checkNotNullParameter(unsubscribed, "unsubscribed");
            this.isSubscribed = z11;
            this.subscribed = subscribed;
            this.unsubscribed = unsubscribed;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, boolean z11, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = badge.isSubscribed;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = badge.subscribed;
            }
            if ((i11 & 4) != 0) {
                badgeDTO2 = badge.unsubscribed;
            }
            return badge.copy(z11, badgeDTO, badgeDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getSubscribed() {
            return this.subscribed;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getUnsubscribed() {
            return this.unsubscribed;
        }

        @NotNull
        public final Badge copy(boolean isSubscribed, @NotNull BadgeDTO subscribed, @NotNull BadgeDTO unsubscribed) {
            Intrinsics.checkNotNullParameter(subscribed, "subscribed");
            Intrinsics.checkNotNullParameter(unsubscribed, "unsubscribed");
            return new Badge(isSubscribed, subscribed, unsubscribed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return this.isSubscribed == badge.isSubscribed && Intrinsics.d(this.subscribed, badge.subscribed) && Intrinsics.d(this.unsubscribed, badge.unsubscribed);
        }

        @NotNull
        public final BadgeDTO getSubscribed() {
            return this.subscribed;
        }

        @NotNull
        public final BadgeDTO getUnsubscribed() {
            return this.unsubscribed;
        }

        public int hashCode() {
            return this.unsubscribed.hashCode() + C3124a.c(this.subscribed, Boolean.hashCode(this.isSubscribed) * 31, 31);
        }

        public final boolean isSubscribed() {
            return this.isSubscribed;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSubscribed;
            BadgeDTO badgeDTO = this.subscribed;
            BadgeDTO badgeDTO2 = this.unsubscribed;
            StringBuilder sb2 = new StringBuilder("Badge(isSubscribed=");
            sb2.append(z11);
            sb2.append(", subscribed=");
            sb2.append(badgeDTO);
            sb2.append(", unsubscribed=");
            return c.b(sb2, badgeDTO2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Badge;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Badge;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Badge;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = 0;
        private final Badge badge;

        @NotNull
        private final TextDTO title;

        public Header(@NotNull TextDTO title, Badge badge) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.badge = badge;
        }

        public static /* synthetic */ Header copy$default(Header header, TextDTO textDTO, Badge badge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = header.title;
            }
            if ((i11 & 2) != 0) {
                badge = header.badge;
            }
            return header.copy(textDTO, badge);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final Header copy(@NotNull TextDTO title, Badge badge) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Header(title, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.badge, header.badge);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Badge badge = this.badge;
            return hashCode + (badge == null ? 0 : badge.hashCode());
        }

        @NotNull
        public String toString() {
            return "Header(title=" + this.title + ", badge=" + this.badge + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jq\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Island;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "templateLink", "placeholderValue", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTemplateLink", "getPlaceholderValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Island {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;
        private final OnBoardingDTO onboarding;
        private final String placeholderValue;
        private final String templateLink;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Island(@NotNull IconDTO icon, @NotNull TextDTO title, String str, OnBoardingDTO onBoardingDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, String str2, String str3) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.backgroundColor = str;
            this.onboarding = onBoardingDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.templateLink = str2;
            this.placeholderValue = str3;
        }

        public static /* synthetic */ Island copy$default(Island island, IconDTO iconDTO, TextDTO textDTO, String str, OnBoardingDTO onBoardingDTO, AtomActionDTO atomActionDTO, Map map, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = island.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = island.title;
            }
            if ((i11 & 4) != 0) {
                str = island.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                onBoardingDTO = island.onboarding;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = island.action;
            }
            if ((i11 & 32) != 0) {
                map = island.trackingInfo;
            }
            if ((i11 & 64) != 0) {
                str2 = island.templateLink;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str3 = island.placeholderValue;
            }
            String str4 = str2;
            String str5 = str3;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return island.copy(iconDTO, textDTO, str, onBoardingDTO, atomActionDTO2, map2, str4, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTemplateLink() {
            return this.templateLink;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPlaceholderValue() {
            return this.placeholderValue;
        }

        @NotNull
        public final Island copy(@NotNull IconDTO icon, @NotNull TextDTO title, String backgroundColor, OnBoardingDTO onboarding, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, String templateLink, String placeholderValue) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Island(icon, title, backgroundColor, onboarding, action, trackingInfo, templateLink, placeholderValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Island)) {
                return false;
            }
            Island island = (Island) other;
            return Intrinsics.d(this.icon, island.icon) && Intrinsics.d(this.title, island.title) && Intrinsics.d(this.backgroundColor, island.backgroundColor) && Intrinsics.d(this.onboarding, island.onboarding) && Intrinsics.d(this.action, island.action) && Intrinsics.d(this.trackingInfo, island.trackingInfo) && Intrinsics.d(this.templateLink, island.templateLink) && Intrinsics.d(this.placeholderValue, island.placeholderValue);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        public final String getPlaceholderValue() {
            return this.placeholderValue;
        }

        public final String getTemplateLink() {
            return this.templateLink;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            int hashCode2 = (hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            String str2 = this.templateLink;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placeholderValue;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            String str2 = this.templateLink;
            String str3 = this.placeholderValue;
            StringBuilder i11 = Bi.b.i("Island(icon=", ", title=", ", backgroundColor=", iconDTO, textDTO);
            i11.append(str);
            i11.append(", onboarding=");
            i11.append(onBoardingDTO);
            i11.append(", action=");
            Sh.b.f(i11, atomActionDTO, ", trackingInfo=", map, ", templateLink=");
            return C3173b.c(i11, str2, ", placeholderValue=", str3, ")");
        }
    }

    public SellerV7DTO(Header header, @NotNull CellDTO sellerCell, Island island, Island island2, String str, String str2, String str3, Map<String, TokenizedTrackingInfo> map, String str4) {
        Intrinsics.checkNotNullParameter(sellerCell, "sellerCell");
        this.header = header;
        this.sellerCell = sellerCell;
        this.rating = island;
        this.chat = island2;
        this.backgroundColor = str;
        this.innerBackgroundColor = str2;
        this.backgroundImage = str3;
        this.trackingInfo = map;
        this.json = str4;
        this.hasSimpleCell = island == null && island2 == null;
        this.innerBackground = str3 != null ? null : str2;
    }

    public static /* synthetic */ SellerV7DTO copy$default(SellerV7DTO sellerV7DTO, Header header, CellDTO cellDTO, Island island, Island island2, String str, String str2, String str3, Map map, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = sellerV7DTO.header;
        }
        if ((i11 & 2) != 0) {
            cellDTO = sellerV7DTO.sellerCell;
        }
        if ((i11 & 4) != 0) {
            island = sellerV7DTO.rating;
        }
        if ((i11 & 8) != 0) {
            island2 = sellerV7DTO.chat;
        }
        if ((i11 & 16) != 0) {
            str = sellerV7DTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            str2 = sellerV7DTO.innerBackgroundColor;
        }
        if ((i11 & 64) != 0) {
            str3 = sellerV7DTO.backgroundImage;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = sellerV7DTO.trackingInfo;
        }
        if ((i11 & 256) != 0) {
            str4 = sellerV7DTO.json;
        }
        Map map2 = map;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        String str8 = str;
        Island island3 = island;
        return sellerV7DTO.copy(header, cellDTO, island3, island2, str8, str6, str7, map2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellDTO getSellerCell() {
        return this.sellerCell;
    }

    /* renamed from: component3, reason: from getter */
    public final Island getRating() {
        return this.rating;
    }

    /* renamed from: component4, reason: from getter */
    public final Island getChat() {
        return this.chat;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final SellerV7DTO copy(Header header, @NotNull CellDTO sellerCell, Island rating, Island chat, String backgroundColor, String innerBackgroundColor, String backgroundImage, Map<String, TokenizedTrackingInfo> trackingInfo, String json) {
        Intrinsics.checkNotNullParameter(sellerCell, "sellerCell");
        return new SellerV7DTO(header, sellerCell, rating, chat, backgroundColor, innerBackgroundColor, backgroundImage, trackingInfo, json);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    @NotNull
    public BasePlaceholderWidgetObject copyExcludingAnalytics() {
        BadgeDTO badgeDTO;
        ArrayList arrayList;
        CellDTO.LeftBlock leftBlock;
        CellDTO.RightBlock rightBlock;
        Island island;
        ImageDTO imageDTO;
        ImageDTO copy;
        ImageDTO image;
        IconDTO icon;
        OnBoardingDTO onBoardingDTO;
        ImageDTO imageDTO2;
        ImageDTO copy2;
        ImageDTO image2;
        IconDTO icon2;
        IconDTO iconDTO;
        ImageDTO imageDTO3;
        IndicatorDTO indicatorDTO;
        BadgeDTO badgeDTO2;
        ButtonV3DTO buttonV3DTO;
        ButtonV3DTO button;
        ButtonV3DTO button2;
        CommonControlSettings common;
        BadgeDTO badge;
        BadgeDTO badge2;
        BadgeDTO badge3;
        CommonControlSettings common2;
        IndicatorDTO indicator;
        IndicatorDTO indicator2;
        ImageDTO image3;
        ImageDTO copy3;
        ImageDTO image4;
        IconDTO icon3;
        IconDTO icon4;
        CommonControlSettings common3;
        IconDTO iconDTO2;
        ImageDTO imageDTO4;
        ImageDTO image5;
        ImageDTO copy4;
        ImageDTO image6;
        IconDTO icon5;
        IconDTO icon6;
        CommonControlSettings common4;
        CommonControlSettings common5;
        CommonControlSettings common6;
        Header header = this.header;
        Island island2 = null;
        OnBoardingDTO onBoardingDTO2 = null;
        Header copy$default = header != null ? Header.copy$default(header, TextDTO.copy$default(header.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 520191, null), null, 2, null) : null;
        CellDTO cellDTO = this.sellerCell;
        CommonControlSettings common7 = cellDTO.getCommon();
        CommonControlSettings copy$default2 = common7 != null ? CommonControlSettings.copy$default(common7, null, null, null, 5, null) : null;
        CellDTO.CenterBlock centerBlock = this.sellerCell.getCenterBlock();
        BadgeDTO titleBadge = this.sellerCell.getCenterBlock().getTitleBadge();
        if (titleBadge != null) {
            BadgeDTO titleBadge2 = this.sellerCell.getCenterBlock().getTitleBadge();
            CommonControlSettings copy$default3 = (titleBadge2 == null || (common6 = titleBadge2.getCommon()) == null) ? null : CommonControlSettings.copy$default(common6, null, null, null, 5, null);
            BadgeDTO titleBadge3 = this.sellerCell.getCenterBlock().getTitleBadge();
            badgeDTO = BadgeDTO.copy$default(titleBadge, null, null, null, null, null, copy$default3, null, titleBadge3 != null ? titleBadge3.getHideDisclosure() : null, null, null, null, null, 3935, null);
        } else {
            badgeDTO = null;
        }
        List<BadgeDTO> badgeList = this.sellerCell.getCenterBlock().getBadgeList();
        if (badgeList != null) {
            List<BadgeDTO> list = badgeList;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            for (BadgeDTO badgeDTO3 : list) {
                BadgeDTO titleBadge4 = this.sellerCell.getCenterBlock().getTitleBadge();
                CommonControlSettings copy$default4 = (titleBadge4 == null || (common5 = titleBadge4.getCommon()) == null) ? null : CommonControlSettings.copy$default(common5, null, null, null, 5, null);
                BadgeDTO titleBadge5 = this.sellerCell.getCenterBlock().getTitleBadge();
                arrayList2.add(BadgeDTO.copy$default(badgeDTO3, null, null, null, null, null, copy$default4, null, titleBadge5 != null ? titleBadge5.getHideDisclosure() : null, null, null, null, null, 3935, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        CellDTO.CenterBlock copy$default5 = CellDTO.CenterBlock.copy$default(centerBlock, null, null, null, badgeDTO, null, arrayList, 23, null);
        CellDTO.LeftBlock leftBlock2 = this.sellerCell.getLeftBlock();
        if (leftBlock2 != null) {
            CellDTO.LeftBlock leftBlock3 = this.sellerCell.getLeftBlock();
            CommonControlSettings copy$default6 = (leftBlock3 == null || (common4 = leftBlock3.getCommon()) == null) ? null : CommonControlSettings.copy$default(common4, null, null, null, 5, null);
            CellDTO.LeftBlock leftBlock4 = this.sellerCell.getLeftBlock();
            AtomDTO control = leftBlock4 != null ? leftBlock4.getControl() : null;
            CellDTO.LeftBlock leftBlock5 = this.sellerCell.getLeftBlock();
            if (leftBlock5 == null || (icon5 = leftBlock5.getIcon()) == null) {
                iconDTO2 = null;
            } else {
                CellDTO.LeftBlock leftBlock6 = this.sellerCell.getLeftBlock();
                iconDTO2 = IconDTO.copy$default(icon5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (leftBlock6 == null || (icon6 = leftBlock6.getIcon()) == null) ? null : icon6.getBackgroundImageFitType(), 32767, null);
            }
            CellDTO.LeftBlock leftBlock7 = this.sellerCell.getLeftBlock();
            if (leftBlock7 == null || (image5 = leftBlock7.getImage()) == null) {
                imageDTO4 = null;
            } else {
                CellDTO.LeftBlock leftBlock8 = this.sellerCell.getLeftBlock();
                copy4 = image5.copy((r34 & 1) != 0 ? image5.image : null, (r34 & 2) != 0 ? image5.backgroundColor : null, (r34 & 4) != 0 ? image5.aspectRatio : null, (r34 & 8) != 0 ? image5.hasParanja : false, (r34 & 16) != 0 ? image5.layoutPaddingLeft : null, (r34 & 32) != 0 ? image5.layoutPaddingRight : null, (r34 & 64) != 0 ? image5.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? image5.layoutPaddingBottom : null, (r34 & 256) != 0 ? image5.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? image5.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? image5.testInfo : null, (r34 & 2048) != 0 ? image5.trackingInfo : null, (r34 & 4096) != 0 ? image5.imageWidth : (leftBlock8 == null || (image6 = leftBlock8.getImage()) == null) ? null : image6.getImageWidth(), (r34 & 8192) != 0 ? image5.imageType : null, (r34 & 16384) != 0 ? image5.fitType : null, (r34 & 32768) != 0 ? image5.customRatio : null);
                imageDTO4 = copy4;
            }
            leftBlock = CellDTO.LeftBlock.copy$default(leftBlock2, copy$default6, null, null, null, null, iconDTO2, imageDTO4, control, 30, null);
        } else {
            leftBlock = null;
        }
        CellDTO.RightBlock rightBlock2 = this.sellerCell.getRightBlock();
        if (rightBlock2 != null) {
            CellDTO.RightBlock rightBlock3 = this.sellerCell.getRightBlock();
            CommonControlSettings copy$default7 = (rightBlock3 == null || (common3 = rightBlock3.getCommon()) == null) ? null : CommonControlSettings.copy$default(common3, null, null, null, 5, null);
            CellDTO.RightBlock rightBlock4 = this.sellerCell.getRightBlock();
            if (rightBlock4 == null || (icon3 = rightBlock4.getIcon()) == null) {
                iconDTO = null;
            } else {
                CellDTO.RightBlock rightBlock5 = this.sellerCell.getRightBlock();
                iconDTO = IconDTO.copy$default(icon3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (rightBlock5 == null || (icon4 = rightBlock5.getIcon()) == null) ? null : icon4.getBackgroundImageFitType(), 32767, null);
            }
            CellDTO.RightBlock rightBlock6 = this.sellerCell.getRightBlock();
            if (rightBlock6 == null || (image3 = rightBlock6.getImage()) == null) {
                imageDTO3 = null;
            } else {
                CellDTO.RightBlock rightBlock7 = this.sellerCell.getRightBlock();
                copy3 = image3.copy((r34 & 1) != 0 ? image3.image : null, (r34 & 2) != 0 ? image3.backgroundColor : null, (r34 & 4) != 0 ? image3.aspectRatio : null, (r34 & 8) != 0 ? image3.hasParanja : false, (r34 & 16) != 0 ? image3.layoutPaddingLeft : null, (r34 & 32) != 0 ? image3.layoutPaddingRight : null, (r34 & 64) != 0 ? image3.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? image3.layoutPaddingBottom : null, (r34 & 256) != 0 ? image3.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? image3.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? image3.testInfo : null, (r34 & 2048) != 0 ? image3.trackingInfo : null, (r34 & 4096) != 0 ? image3.imageWidth : (rightBlock7 == null || (image4 = rightBlock7.getImage()) == null) ? null : image4.getImageWidth(), (r34 & 8192) != 0 ? image3.imageType : null, (r34 & 16384) != 0 ? image3.fitType : null, (r34 & 32768) != 0 ? image3.customRatio : null);
                imageDTO3 = copy3;
            }
            CellDTO.RightBlock rightBlock8 = this.sellerCell.getRightBlock();
            if (rightBlock8 == null || (indicator = rightBlock8.getIndicator()) == null) {
                indicatorDTO = null;
            } else {
                CellDTO.RightBlock rightBlock9 = this.sellerCell.getRightBlock();
                indicatorDTO = IndicatorDTO.copy$default(indicator, null, null, null, null, null, null, null, null, null, (rightBlock9 == null || (indicator2 = rightBlock9.getIndicator()) == null) ? null : indicator2.getStyleType(), null, 1279, null);
            }
            CellDTO.LeftBlock leftBlock9 = this.sellerCell.getLeftBlock();
            AtomDTO control2 = leftBlock9 != null ? leftBlock9.getControl() : null;
            CellDTO.RightBlock rightBlock10 = this.sellerCell.getRightBlock();
            if (rightBlock10 == null || (badge = rightBlock10.getBadge()) == null) {
                badgeDTO2 = null;
            } else {
                CellDTO.RightBlock rightBlock11 = this.sellerCell.getRightBlock();
                CommonControlSettings copy$default8 = (rightBlock11 == null || (badge3 = rightBlock11.getBadge()) == null || (common2 = badge3.getCommon()) == null) ? null : CommonControlSettings.copy$default(common2, null, null, null, 5, null);
                CellDTO.RightBlock rightBlock12 = this.sellerCell.getRightBlock();
                badgeDTO2 = BadgeDTO.copy$default(badge, null, null, null, null, null, copy$default8, null, (rightBlock12 == null || (badge2 = rightBlock12.getBadge()) == null) ? null : badge2.getHideDisclosure(), null, null, null, null, 3935, null);
            }
            CellDTO.RightBlock rightBlock13 = this.sellerCell.getRightBlock();
            if (rightBlock13 == null || (button = rightBlock13.getButton()) == null) {
                buttonV3DTO = null;
            } else {
                CellDTO.RightBlock rightBlock14 = this.sellerCell.getRightBlock();
                buttonV3DTO = ButtonV3DTO.copy$default(button, null, null, null, null, null, null, null, null, null, null, null, null, null, (rightBlock14 == null || (button2 = rightBlock14.getButton()) == null || (common = button2.getCommon()) == null) ? null : CommonControlSettings.copy$default(common, null, null, null, 5, null), null, null, null, 122879, null);
            }
            rightBlock = CellDTO.RightBlock.copy$default(rightBlock2, copy$default7, null, null, null, null, badgeDTO2, indicatorDTO, iconDTO, buttonV3DTO, imageDTO3, control2, null, 2078, null);
        } else {
            rightBlock = null;
        }
        CellDTO copy$default9 = CellDTO.copy$default(cellDTO, copy$default5, null, leftBlock, rightBlock, copy$default2, 2, null);
        Island island3 = this.rating;
        if (island3 != null) {
            IconDTO icon7 = island3.getIcon();
            CellDTO.RightBlock rightBlock15 = this.sellerCell.getRightBlock();
            IconDTO copy$default10 = IconDTO.copy$default(icon7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (rightBlock15 == null || (icon2 = rightBlock15.getIcon()) == null) ? null : icon2.getBackgroundImageFitType(), 32767, null);
            TextDTO copy$default11 = TextDTO.copy$default(this.rating.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 520191, null);
            OnBoardingDTO onboarding = this.rating.getOnboarding();
            if (onboarding != null) {
                ImageTitleSubtitleCellDTO banner = this.rating.getOnboarding().getBanner();
                CommonCellSettings common8 = this.rating.getOnboarding().getBanner().getCommon();
                CommonCellSettings copy$default12 = common8 != null ? CommonCellSettings.copy$default(common8, null, null, null, null, null, null, null, 95, null) : null;
                ImageDTO image7 = this.rating.getOnboarding().getBanner().getImage();
                if (image7 != null) {
                    CellDTO.LeftBlock leftBlock10 = this.sellerCell.getLeftBlock();
                    copy2 = image7.copy((r34 & 1) != 0 ? image7.image : null, (r34 & 2) != 0 ? image7.backgroundColor : null, (r34 & 4) != 0 ? image7.aspectRatio : null, (r34 & 8) != 0 ? image7.hasParanja : false, (r34 & 16) != 0 ? image7.layoutPaddingLeft : null, (r34 & 32) != 0 ? image7.layoutPaddingRight : null, (r34 & 64) != 0 ? image7.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? image7.layoutPaddingBottom : null, (r34 & 256) != 0 ? image7.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? image7.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? image7.testInfo : null, (r34 & 2048) != 0 ? image7.trackingInfo : null, (r34 & 4096) != 0 ? image7.imageWidth : (leftBlock10 == null || (image2 = leftBlock10.getImage()) == null) ? null : image2.getImageWidth(), (r34 & 8192) != 0 ? image7.imageType : null, (r34 & 16384) != 0 ? image7.fitType : null, (r34 & 32768) != 0 ? image7.customRatio : null);
                    imageDTO2 = copy2;
                } else {
                    imageDTO2 = null;
                }
                ImageFixedDTO imageFixed = this.rating.getOnboarding().getBanner().getImageFixed();
                ImageTitleSubtitleCellDTO copy$default13 = ImageTitleSubtitleCellDTO.copy$default(banner, copy$default12, null, null, null, imageFixed != null ? ImageFixedDTO.copy$default(imageFixed, null, null, null, false, 0, null, null, null, null, null, null, 1023, null) : null, imageDTO2, 14, null);
                IconButtonDTO closeButton = this.rating.getOnboarding().getCloseButton();
                CommonControlSettings common9 = this.rating.getOnboarding().getCloseButton().getCommon();
                onBoardingDTO = OnBoardingDTO.copy$default(onboarding, copy$default13, IconButtonDTO.copy$default(closeButton, null, null, null, null, common9 != null ? CommonControlSettings.copy$default(common9, null, null, null, 5, null) : null, 15, null), null, null, null, null, 56, null);
            } else {
                onBoardingDTO = null;
            }
            island = Island.copy$default(island3, copy$default10, copy$default11, null, onBoardingDTO, null, null, null, null, 244, null);
        } else {
            island = null;
        }
        Island island4 = this.chat;
        if (island4 != null) {
            IconDTO icon8 = island4.getIcon();
            CellDTO.RightBlock rightBlock16 = this.sellerCell.getRightBlock();
            IconDTO copy$default14 = IconDTO.copy$default(icon8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (rightBlock16 == null || (icon = rightBlock16.getIcon()) == null) ? null : icon.getBackgroundImageFitType(), 32767, null);
            TextDTO copy$default15 = TextDTO.copy$default(this.chat.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 520191, null);
            OnBoardingDTO onboarding2 = this.chat.getOnboarding();
            if (onboarding2 != null) {
                ImageTitleSubtitleCellDTO banner2 = this.chat.getOnboarding().getBanner();
                CommonCellSettings common10 = this.chat.getOnboarding().getBanner().getCommon();
                CommonCellSettings copy$default16 = common10 != null ? CommonCellSettings.copy$default(common10, null, null, null, null, null, null, null, 95, null) : null;
                ImageDTO image8 = this.chat.getOnboarding().getBanner().getImage();
                if (image8 != null) {
                    CellDTO.LeftBlock leftBlock11 = this.sellerCell.getLeftBlock();
                    copy = image8.copy((r34 & 1) != 0 ? image8.image : null, (r34 & 2) != 0 ? image8.backgroundColor : null, (r34 & 4) != 0 ? image8.aspectRatio : null, (r34 & 8) != 0 ? image8.hasParanja : false, (r34 & 16) != 0 ? image8.layoutPaddingLeft : null, (r34 & 32) != 0 ? image8.layoutPaddingRight : null, (r34 & 64) != 0 ? image8.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? image8.layoutPaddingBottom : null, (r34 & 256) != 0 ? image8.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? image8.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? image8.testInfo : null, (r34 & 2048) != 0 ? image8.trackingInfo : null, (r34 & 4096) != 0 ? image8.imageWidth : (leftBlock11 == null || (image = leftBlock11.getImage()) == null) ? null : image.getImageWidth(), (r34 & 8192) != 0 ? image8.imageType : null, (r34 & 16384) != 0 ? image8.fitType : null, (r34 & 32768) != 0 ? image8.customRatio : null);
                    imageDTO = copy;
                } else {
                    imageDTO = null;
                }
                ImageFixedDTO imageFixed2 = this.chat.getOnboarding().getBanner().getImageFixed();
                ImageTitleSubtitleCellDTO copy$default17 = ImageTitleSubtitleCellDTO.copy$default(banner2, copy$default16, null, null, null, imageFixed2 != null ? ImageFixedDTO.copy$default(imageFixed2, null, null, null, false, 0, null, null, null, null, null, null, 1023, null) : null, imageDTO, 14, null);
                IconButtonDTO closeButton2 = this.chat.getOnboarding().getCloseButton();
                CommonControlSettings common11 = this.chat.getOnboarding().getCloseButton().getCommon();
                onBoardingDTO2 = OnBoardingDTO.copy$default(onboarding2, copy$default17, IconButtonDTO.copy$default(closeButton2, null, null, null, null, common11 != null ? CommonControlSettings.copy$default(common11, null, null, null, 5, null) : null, 15, null), null, null, null, null, 56, null);
            }
            island2 = Island.copy$default(island4, copy$default14, copy$default15, null, onBoardingDTO2, null, null, null, null, 244, null);
        }
        return copy$default(this, copy$default, copy$default9, island, island2, null, null, null, null, null, 368, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerV7DTO)) {
            return false;
        }
        SellerV7DTO sellerV7DTO = (SellerV7DTO) other;
        return Intrinsics.d(this.header, sellerV7DTO.header) && Intrinsics.d(this.sellerCell, sellerV7DTO.sellerCell) && Intrinsics.d(this.rating, sellerV7DTO.rating) && Intrinsics.d(this.chat, sellerV7DTO.chat) && Intrinsics.d(this.backgroundColor, sellerV7DTO.backgroundColor) && Intrinsics.d(this.innerBackgroundColor, sellerV7DTO.innerBackgroundColor) && Intrinsics.d(this.backgroundImage, sellerV7DTO.backgroundImage) && Intrinsics.d(this.trackingInfo, sellerV7DTO.trackingInfo) && Intrinsics.d(this.json, sellerV7DTO.json);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Island getChat() {
        return this.chat;
    }

    public final boolean getHasSimpleCell() {
        return this.hasSimpleCell;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final String getInnerBackground() {
        return this.innerBackground;
    }

    public final String getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public String getJson() {
        return this.json;
    }

    public final Island getRating() {
        return this.rating;
    }

    @NotNull
    public final CellDTO getSellerCell() {
        return this.sellerCell;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Header header = this.header;
        int c11 = Bi.b.c(this.sellerCell, (header == null ? 0 : header.hashCode()) * 31, 31);
        Island island = this.rating;
        int hashCode = (c11 + (island == null ? 0 : island.hashCode())) * 31;
        Island island2 = this.chat;
        int hashCode2 = (hashCode + (island2 == null ? 0 : island2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.innerBackgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundImage;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.json;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public void setJson(String str) {
        this.json = str;
    }

    @NotNull
    public String toString() {
        Header header = this.header;
        CellDTO cellDTO = this.sellerCell;
        Island island = this.rating;
        Island island2 = this.chat;
        String str = this.backgroundColor;
        String str2 = this.innerBackgroundColor;
        String str3 = this.backgroundImage;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str4 = this.json;
        StringBuilder sb2 = new StringBuilder("SellerV7DTO(header=");
        sb2.append(header);
        sb2.append(", sellerCell=");
        sb2.append(cellDTO);
        sb2.append(", rating=");
        sb2.append(island);
        sb2.append(", chat=");
        sb2.append(island2);
        sb2.append(", backgroundColor=");
        a.h(sb2, str, ", innerBackgroundColor=", str2, ", backgroundImage=");
        C2638a.e(sb2, str3, ", trackingInfo=", map, ", json=");
        return o0.c(sb2, str4, ")");
    }
}
