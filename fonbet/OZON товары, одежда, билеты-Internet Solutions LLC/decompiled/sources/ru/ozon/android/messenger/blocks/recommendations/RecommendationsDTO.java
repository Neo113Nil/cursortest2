package ru.ozon.android.messenger.blocks.recommendations;

import D3.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u0005HIJKLB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b)\u0010*J¢\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001aR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010%R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010'R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bE\u0010'R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bG\u0010*¨\u0006M"}, d2 = {"Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$Badge;", "badges", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "buttonBadge", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductsDTO;", "products", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ErrorDTO;", "error", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "updateBlockAction", "", "", "lexemes", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "trackingInfo", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$a;", "place", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductsDTO;Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ErrorDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$a;)V", "component1", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component5", "()Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductsDTO;", "component6", "()Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ErrorDTO;", "component7", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component8", "()Ljava/util/Map;", "component9", "component10", "()Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$a;", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductsDTO;Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ErrorDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$a;)Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "getSubtitle", "Ljava/util/List;", "getBadges", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getButtonBadge", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductsDTO;", "getProducts", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ErrorDTO;", "getError", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getUpdateBlockAction", "Ljava/util/Map;", "getLexemes", "getTrackingInfo", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$a;", "getPlace", "Badge", "ProductsDTO", "ProductDTO", "ErrorDTO", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RecommendationsDTO {
    public static final int $stable = 8;
    private final List<Badge> badges;
    private final BadgeDTO buttonBadge;
    private final ErrorDTO error;
    private final Map<String, String> lexemes;

    @NotNull
    private final a place;
    private final ProductsDTO products;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;
    private final AtomActionDTO updateBlockAction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$Badge;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "expirationDate", "Lorg/joda/time/DateTime;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lorg/joda/time/DateTime;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getExpirationDate", "()Lorg/joda/time/DateTime;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badge {
        public static final int $stable = 8;

        @NotNull
        private final BadgeDTO badge;
        private final DateTime expirationDate;

        public Badge(@NotNull BadgeDTO badge, DateTime dateTime) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.badge = badge;
            this.expirationDate = dateTime;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, BadgeDTO badgeDTO, DateTime dateTime, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = badge.badge;
            }
            if ((i11 & 2) != 0) {
                dateTime = badge.expirationDate;
            }
            return badge.copy(badgeDTO, dateTime);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component2, reason: from getter */
        public final DateTime getExpirationDate() {
            return this.expirationDate;
        }

        @NotNull
        public final Badge copy(@NotNull BadgeDTO badge, DateTime expirationDate) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            return new Badge(badge, expirationDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return Intrinsics.d(this.badge, badge.badge) && Intrinsics.d(this.expirationDate, badge.expirationDate);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final DateTime getExpirationDate() {
            return this.expirationDate;
        }

        public int hashCode() {
            int hashCode = this.badge.hashCode() * 31;
            DateTime dateTime = this.expirationDate;
            return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
        }

        @NotNull
        public String toString() {
            return "Badge(badge=" + this.badge + ", expirationDate=" + this.expirationDate + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ErrorDTO;", "", "imageUrl", "", "description", "Lru/ozon/uni/atoms/data/text/TextDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;)V", "getImageUrl", "()Ljava/lang/String;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorDTO {
        public static final int $stable = UncontainedButtonDTO.$stable;
        private final UncontainedButtonDTO button;

        @NotNull
        private final TextDTO description;
        private final String imageUrl;

        public ErrorDTO(String str, @NotNull TextDTO description, UncontainedButtonDTO uncontainedButtonDTO) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.imageUrl = str;
            this.description = description;
            this.button = uncontainedButtonDTO;
        }

        public static /* synthetic */ ErrorDTO copy$default(ErrorDTO errorDTO, String str, TextDTO textDTO, UncontainedButtonDTO uncontainedButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = errorDTO.imageUrl;
            }
            if ((i11 & 2) != 0) {
                textDTO = errorDTO.description;
            }
            if ((i11 & 4) != 0) {
                uncontainedButtonDTO = errorDTO.button;
            }
            return errorDTO.copy(str, textDTO, uncontainedButtonDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final UncontainedButtonDTO getButton() {
            return this.button;
        }

        @NotNull
        public final ErrorDTO copy(String imageUrl, @NotNull TextDTO description, UncontainedButtonDTO button) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new ErrorDTO(imageUrl, description, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorDTO)) {
                return false;
            }
            ErrorDTO errorDTO = (ErrorDTO) other;
            return Intrinsics.d(this.imageUrl, errorDTO.imageUrl) && Intrinsics.d(this.description, errorDTO.description) && Intrinsics.d(this.button, errorDTO.button);
        }

        public final UncontainedButtonDTO getButton() {
            return this.button;
        }

        @NotNull
        public final TextDTO getDescription() {
            return this.description;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            String str = this.imageUrl;
            int a11 = Ns.b.a(this.description, (str == null ? 0 : str.hashCode()) * 31, 31);
            UncontainedButtonDTO uncontainedButtonDTO = this.button;
            return a11 + (uncontainedButtonDTO != null ? uncontainedButtonDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.imageUrl;
            TextDTO textDTO = this.description;
            UncontainedButtonDTO uncontainedButtonDTO = this.button;
            StringBuilder b11 = Co.a.b("ErrorDTO(imageUrl=", textDTO, str, ", description=", ", button=");
            b11.append(uncontainedButtonDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Jv\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\b\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, d2 = {"Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductDTO;", "", "imageUrl", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImageUrl", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductDTO;", "equals", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final IconButtonDTO button;
        private final IconDTO icon;

        @NotNull
        private final String imageUrl;
        private final Boolean isAdult;
        private final PriceDTO price;

        @NotNull
        private final TextDTO title;
        private final Map<String, MessengerTrackingInfo> trackingInfo;

        public ProductDTO(@NotNull String imageUrl, @NotNull TextDTO title, PriceDTO priceDTO, Boolean bool, IconDTO iconDTO, IconButtonDTO iconButtonDTO, AtomActionDTO atomActionDTO, Map<String, MessengerTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            this.imageUrl = imageUrl;
            this.title = title;
            this.price = priceDTO;
            this.isAdult = bool;
            this.icon = iconDTO;
            this.button = iconButtonDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, String str, TextDTO textDTO, PriceDTO priceDTO, Boolean bool, IconDTO iconDTO, IconButtonDTO iconButtonDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = productDTO.imageUrl;
            }
            if ((i11 & 2) != 0) {
                textDTO = productDTO.title;
            }
            if ((i11 & 4) != 0) {
                priceDTO = productDTO.price;
            }
            if ((i11 & 8) != 0) {
                bool = productDTO.isAdult;
            }
            if ((i11 & 16) != 0) {
                iconDTO = productDTO.icon;
            }
            if ((i11 & 32) != 0) {
                iconButtonDTO = productDTO.button;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = productDTO.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = productDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            IconDTO iconDTO2 = iconDTO;
            IconButtonDTO iconButtonDTO2 = iconButtonDTO;
            return productDTO.copy(str, textDTO, priceDTO, bool, iconDTO2, iconButtonDTO2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsAdult() {
            return this.isAdult;
        }

        /* renamed from: component5, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component6, reason: from getter */
        public final IconButtonDTO getButton() {
            return this.button;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, MessengerTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final ProductDTO copy(@NotNull String imageUrl, @NotNull TextDTO title, PriceDTO price, Boolean isAdult, IconDTO icon, IconButtonDTO button, AtomActionDTO action, Map<String, MessengerTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            return new ProductDTO(imageUrl, title, price, isAdult, icon, button, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductDTO)) {
                return false;
            }
            ProductDTO productDTO = (ProductDTO) other;
            return Intrinsics.d(this.imageUrl, productDTO.imageUrl) && Intrinsics.d(this.title, productDTO.title) && Intrinsics.d(this.price, productDTO.price) && Intrinsics.d(this.isAdult, productDTO.isAdult) && Intrinsics.d(this.icon, productDTO.icon) && Intrinsics.d(this.button, productDTO.button) && Intrinsics.d(this.action, productDTO.action) && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final IconButtonDTO getButton() {
            return this.button;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.title, this.imageUrl.hashCode() * 31, 31);
            PriceDTO priceDTO = this.price;
            int hashCode = (a11 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            Boolean bool = this.isAdult;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            IconButtonDTO iconButtonDTO = this.button;
            int hashCode4 = (hashCode3 + (iconButtonDTO == null ? 0 : iconButtonDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isAdult() {
            return this.isAdult;
        }

        @NotNull
        public String toString() {
            String str = this.imageUrl;
            TextDTO textDTO = this.title;
            PriceDTO priceDTO = this.price;
            Boolean bool = this.isAdult;
            IconDTO iconDTO = this.icon;
            IconButtonDTO iconButtonDTO = this.button;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = Co.a.b("ProductDTO(imageUrl=", textDTO, str, ", title=", ", price=");
            b11.append(priceDTO);
            b11.append(", isAdult=");
            b11.append(bool);
            b11.append(", icon=");
            b11.append(iconDTO);
            b11.append(", button=");
            b11.append(iconButtonDTO);
            b11.append(", action=");
            return D40.a.d(b11, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductsDTO;", "", "list", "", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductDTO;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductsDTO {
        public static final int $stable = 8;
        private final List<ProductDTO> list;

        public ProductsDTO(List<ProductDTO> list) {
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductsDTO copy$default(ProductsDTO productsDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = productsDTO.list;
            }
            return productsDTO.copy(list);
        }

        public final List<ProductDTO> component1() {
            return this.list;
        }

        @NotNull
        public final ProductsDTO copy(List<ProductDTO> list) {
            return new ProductsDTO(list);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProductsDTO) && Intrinsics.d(this.list, ((ProductsDTO) other).list);
        }

        public final List<ProductDTO> getList() {
            return this.list;
        }

        public int hashCode() {
            List<ProductDTO> list = this.list;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return H3.c.a("ProductsDTO(list=", ")", this.list);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FOOTER;
        public static final a INVALID;
        public static final a MESSAGE;

        static {
            a aVar = new a("INVALID", 0);
            INVALID = aVar;
            a aVar2 = new a("MESSAGE", 1);
            MESSAGE = aVar2;
            a aVar3 = new a(CommentV3DTO.FOOTER_NAME, 2);
            FOOTER = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public RecommendationsDTO(@NotNull TextDTO title, TextDTO textDTO, List<Badge> list, BadgeDTO badgeDTO, ProductsDTO productsDTO, ErrorDTO errorDTO, AtomActionDTO atomActionDTO, Map<String, String> map, Map<String, MessengerTrackingInfo> map2, @NotNull a place) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(place, "place");
        this.title = title;
        this.subtitle = textDTO;
        this.badges = list;
        this.buttonBadge = badgeDTO;
        this.products = productsDTO;
        this.error = errorDTO;
        this.updateBlockAction = atomActionDTO;
        this.lexemes = map;
        this.trackingInfo = map2;
        this.place = place;
    }

    public static /* synthetic */ RecommendationsDTO copy$default(RecommendationsDTO recommendationsDTO, TextDTO textDTO, TextDTO textDTO2, List list, BadgeDTO badgeDTO, ProductsDTO productsDTO, ErrorDTO errorDTO, AtomActionDTO atomActionDTO, Map map, Map map2, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = recommendationsDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = recommendationsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = recommendationsDTO.badges;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = recommendationsDTO.buttonBadge;
        }
        if ((i11 & 16) != 0) {
            productsDTO = recommendationsDTO.products;
        }
        if ((i11 & 32) != 0) {
            errorDTO = recommendationsDTO.error;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = recommendationsDTO.updateBlockAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = recommendationsDTO.lexemes;
        }
        if ((i11 & 256) != 0) {
            map2 = recommendationsDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            aVar = recommendationsDTO.place;
        }
        Map map3 = map2;
        a aVar2 = aVar;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map4 = map;
        ProductsDTO productsDTO2 = productsDTO;
        ErrorDTO errorDTO2 = errorDTO;
        return recommendationsDTO.copy(textDTO, textDTO2, list, badgeDTO, productsDTO2, errorDTO2, atomActionDTO2, map4, map3, aVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final a getPlace() {
        return this.place;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final List<Badge> component3() {
        return this.badges;
    }

    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getButtonBadge() {
        return this.buttonBadge;
    }

    /* renamed from: component5, reason: from getter */
    public final ProductsDTO getProducts() {
        return this.products;
    }

    /* renamed from: component6, reason: from getter */
    public final ErrorDTO getError() {
        return this.error;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getUpdateBlockAction() {
        return this.updateBlockAction;
    }

    public final Map<String, String> component8() {
        return this.lexemes;
    }

    public final Map<String, MessengerTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final RecommendationsDTO copy(@NotNull TextDTO title, TextDTO subtitle, List<Badge> badges, BadgeDTO buttonBadge, ProductsDTO products, ErrorDTO error, AtomActionDTO updateBlockAction, Map<String, String> lexemes, Map<String, MessengerTrackingInfo> trackingInfo, @NotNull a place) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(place, "place");
        return new RecommendationsDTO(title, subtitle, badges, buttonBadge, products, error, updateBlockAction, lexemes, trackingInfo, place);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsDTO)) {
            return false;
        }
        RecommendationsDTO recommendationsDTO = (RecommendationsDTO) other;
        return Intrinsics.d(this.title, recommendationsDTO.title) && Intrinsics.d(this.subtitle, recommendationsDTO.subtitle) && Intrinsics.d(this.badges, recommendationsDTO.badges) && Intrinsics.d(this.buttonBadge, recommendationsDTO.buttonBadge) && Intrinsics.d(this.products, recommendationsDTO.products) && Intrinsics.d(this.error, recommendationsDTO.error) && Intrinsics.d(this.updateBlockAction, recommendationsDTO.updateBlockAction) && Intrinsics.d(this.lexemes, recommendationsDTO.lexemes) && Intrinsics.d(this.trackingInfo, recommendationsDTO.trackingInfo) && this.place == recommendationsDTO.place;
    }

    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final BadgeDTO getButtonBadge() {
        return this.buttonBadge;
    }

    public final ErrorDTO getError() {
        return this.error;
    }

    public final Map<String, String> getLexemes() {
        return this.lexemes;
    }

    @NotNull
    public final a getPlace() {
        return this.place;
    }

    public final ProductsDTO getProducts() {
        return this.products;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final AtomActionDTO getUpdateBlockAction() {
        return this.updateBlockAction;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<Badge> list = this.badges;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BadgeDTO badgeDTO = this.buttonBadge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        ProductsDTO productsDTO = this.products;
        int hashCode5 = (hashCode4 + (productsDTO == null ? 0 : productsDTO.hashCode())) * 31;
        ErrorDTO errorDTO = this.error;
        int hashCode6 = (hashCode5 + (errorDTO == null ? 0 : errorDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.updateBlockAction;
        int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, String> map = this.lexemes;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map2 = this.trackingInfo;
        return this.place.hashCode() + ((hashCode8 + (map2 != null ? map2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<Badge> list = this.badges;
        BadgeDTO badgeDTO = this.buttonBadge;
        ProductsDTO productsDTO = this.products;
        ErrorDTO errorDTO = this.error;
        AtomActionDTO atomActionDTO = this.updateBlockAction;
        Map<String, String> map = this.lexemes;
        Map<String, MessengerTrackingInfo> map2 = this.trackingInfo;
        a aVar = this.place;
        StringBuilder g10 = g.g("RecommendationsDTO(title=", textDTO, ", subtitle=", textDTO2, ", badges=");
        g10.append(list);
        g10.append(", buttonBadge=");
        g10.append(badgeDTO);
        g10.append(", products=");
        g10.append(productsDTO);
        g10.append(", error=");
        g10.append(errorDTO);
        g10.append(", updateBlockAction=");
        Sh.b.f(g10, atomActionDTO, ", lexemes=", map, ", trackingInfo=");
        g10.append(map2);
        g10.append(", place=");
        g10.append(aVar);
        g10.append(")");
        return g10.toString();
    }
}
