package ru.ozon.app.android.pdp.ui.configurators.pdp.seller;

import De.C2859b;
import G.g;
import Gl.C3124a;
import Nh.a;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u00039:;Bo\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J\u008e\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b2\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b3\u0010\u001aR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b7\u0010\u001aR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b8\u0010\u001a¨\u0006<"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetPlaceholderViewObject;", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "sellerCell", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;", "rating", "chat", "", "backgroundColor", "backgroundIconImage", "innerBackgroundColor", "LWZ/t;", "tokenizedEvent", "json", "backgroundImage", "<init>", "(JLru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;", "getHeader", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSellerCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;", "getRating", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;", "getChat", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundIconImage", "getInnerBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getJson", "getBackgroundImage", "SellerHeader", "SellerIsland", "SellerBadge", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerV7VO implements c, WidgetPlaceholderViewObject {
    private final String backgroundColor;
    private final String backgroundIconImage;
    private final String backgroundImage;
    private final SellerIsland chat;
    private final SellerHeader header;
    private final long id;
    private final String innerBackgroundColor;

    @NotNull
    private final String json;
    private final SellerIsland rating;

    @NotNull
    private final CellDTO sellerCell;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;", "", "", "isSubscribed", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "subscribed", "unsubscribed", "<init>", "(ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "copy", "(ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSubscribed", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getUnsubscribed", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SellerBadge {
        private final boolean isSubscribed;

        @NotNull
        private final BadgeDTO subscribed;

        @NotNull
        private final BadgeDTO unsubscribed;

        public SellerBadge(boolean z11, @NotNull BadgeDTO subscribed, @NotNull BadgeDTO unsubscribed) {
            Intrinsics.checkNotNullParameter(subscribed, "subscribed");
            Intrinsics.checkNotNullParameter(unsubscribed, "unsubscribed");
            this.isSubscribed = z11;
            this.subscribed = subscribed;
            this.unsubscribed = unsubscribed;
        }

        public static /* synthetic */ SellerBadge copy$default(SellerBadge sellerBadge, boolean z11, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = sellerBadge.isSubscribed;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = sellerBadge.subscribed;
            }
            if ((i11 & 4) != 0) {
                badgeDTO2 = sellerBadge.unsubscribed;
            }
            return sellerBadge.copy(z11, badgeDTO, badgeDTO2);
        }

        @NotNull
        public final SellerBadge copy(boolean isSubscribed, @NotNull BadgeDTO subscribed, @NotNull BadgeDTO unsubscribed) {
            Intrinsics.checkNotNullParameter(subscribed, "subscribed");
            Intrinsics.checkNotNullParameter(unsubscribed, "unsubscribed");
            return new SellerBadge(isSubscribed, subscribed, unsubscribed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerBadge)) {
                return false;
            }
            SellerBadge sellerBadge = (SellerBadge) other;
            return this.isSubscribed == sellerBadge.isSubscribed && Intrinsics.d(this.subscribed, sellerBadge.subscribed) && Intrinsics.d(this.unsubscribed, sellerBadge.unsubscribed);
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

        /* renamed from: isSubscribed, reason: from getter */
        public final boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSubscribed;
            BadgeDTO badgeDTO = this.subscribed;
            BadgeDTO badgeDTO2 = this.unsubscribed;
            StringBuilder sb2 = new StringBuilder("SellerBadge(isSubscribed=");
            sb2.append(z11);
            sb2.append(", subscribed=");
            sb2.append(badgeDTO);
            sb2.append(", unsubscribed=");
            return AZ.c.b(sb2, badgeDTO2, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;)Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;", "getBadge", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SellerHeader {
        private final SellerBadge badge;

        @NotNull
        private final TextDTO title;

        public SellerHeader(@NotNull TextDTO title, SellerBadge sellerBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.badge = sellerBadge;
        }

        public static /* synthetic */ SellerHeader copy$default(SellerHeader sellerHeader, TextDTO textDTO, SellerBadge sellerBadge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = sellerHeader.title;
            }
            if ((i11 & 2) != 0) {
                sellerBadge = sellerHeader.badge;
            }
            return sellerHeader.copy(textDTO, sellerBadge);
        }

        @NotNull
        public final SellerHeader copy(@NotNull TextDTO title, SellerBadge badge) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new SellerHeader(title, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerHeader)) {
                return false;
            }
            SellerHeader sellerHeader = (SellerHeader) other;
            return Intrinsics.d(this.title, sellerHeader.title) && Intrinsics.d(this.badge, sellerHeader.badge);
        }

        public final SellerBadge getBadge() {
            return this.badge;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            SellerBadge sellerBadge = this.badge;
            return hashCode + (sellerBadge == null ? 0 : sellerBadge.hashCode());
        }

        @NotNull
        public String toString() {
            return "SellerHeader(title=" + this.title + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SellerIsland {
        private final AtomAction action;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;
        private final OnBoardingDTO onboarding;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public SellerIsland(@NotNull IconDTO icon, @NotNull TextDTO title, String str, OnBoardingDTO onBoardingDTO, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.backgroundColor = str;
            this.onboarding = onBoardingDTO;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerIsland)) {
                return false;
            }
            SellerIsland sellerIsland = (SellerIsland) other;
            return Intrinsics.d(this.icon, sellerIsland.icon) && Intrinsics.d(this.title, sellerIsland.title) && Intrinsics.d(this.backgroundColor, sellerIsland.backgroundColor) && Intrinsics.d(this.onboarding, sellerIsland.onboarding) && Intrinsics.d(this.action, sellerIsland.action) && Intrinsics.d(this.tokenizedEvent, sellerIsland.tokenizedEvent);
        }

        public final AtomAction getAction() {
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

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            int hashCode2 = (hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder i11 = Bi.b.i("SellerIsland(icon=", ", title=", ", backgroundColor=", iconDTO, textDTO);
            i11.append(str);
            i11.append(", onboarding=");
            i11.append(onBoardingDTO);
            i11.append(", action=");
            return C2859b.e(tVar, ", tokenizedEvent=", ")", i11, atomAction);
        }
    }

    public SellerV7VO(long j11, SellerHeader sellerHeader, @NotNull CellDTO sellerCell, SellerIsland sellerIsland, SellerIsland sellerIsland2, String str, String str2, String str3, t tVar, @NotNull String json, String str4) {
        Intrinsics.checkNotNullParameter(sellerCell, "sellerCell");
        Intrinsics.checkNotNullParameter(json, "json");
        this.id = j11;
        this.header = sellerHeader;
        this.sellerCell = sellerCell;
        this.rating = sellerIsland;
        this.chat = sellerIsland2;
        this.backgroundColor = str;
        this.backgroundIconImage = str2;
        this.innerBackgroundColor = str3;
        this.tokenizedEvent = tVar;
        this.json = json;
        this.backgroundImage = str4;
    }

    public static /* synthetic */ SellerV7VO copy$default(SellerV7VO sellerV7VO, long j11, SellerHeader sellerHeader, CellDTO cellDTO, SellerIsland sellerIsland, SellerIsland sellerIsland2, String str, String str2, String str3, t tVar, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = sellerV7VO.id;
        }
        return sellerV7VO.copy(j11, (i11 & 2) != 0 ? sellerV7VO.header : sellerHeader, (i11 & 4) != 0 ? sellerV7VO.sellerCell : cellDTO, (i11 & 8) != 0 ? sellerV7VO.rating : sellerIsland, (i11 & 16) != 0 ? sellerV7VO.chat : sellerIsland2, (i11 & 32) != 0 ? sellerV7VO.backgroundColor : str, (i11 & 64) != 0 ? sellerV7VO.backgroundIconImage : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? sellerV7VO.innerBackgroundColor : str3, (i11 & 256) != 0 ? sellerV7VO.tokenizedEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? sellerV7VO.json : str4, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? sellerV7VO.backgroundImage : str5);
    }

    @NotNull
    public final SellerV7VO copy(long id2, SellerHeader header, @NotNull CellDTO sellerCell, SellerIsland rating, SellerIsland chat, String backgroundColor, String backgroundIconImage, String innerBackgroundColor, t tokenizedEvent, @NotNull String json, String backgroundImage) {
        Intrinsics.checkNotNullParameter(sellerCell, "sellerCell");
        Intrinsics.checkNotNullParameter(json, "json");
        return new SellerV7VO(id2, header, sellerCell, rating, chat, backgroundColor, backgroundIconImage, innerBackgroundColor, tokenizedEvent, json, backgroundImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerV7VO)) {
            return false;
        }
        SellerV7VO sellerV7VO = (SellerV7VO) other;
        return this.id == sellerV7VO.id && Intrinsics.d(this.header, sellerV7VO.header) && Intrinsics.d(this.sellerCell, sellerV7VO.sellerCell) && Intrinsics.d(this.rating, sellerV7VO.rating) && Intrinsics.d(this.chat, sellerV7VO.chat) && Intrinsics.d(this.backgroundColor, sellerV7VO.backgroundColor) && Intrinsics.d(this.backgroundIconImage, sellerV7VO.backgroundIconImage) && Intrinsics.d(this.innerBackgroundColor, sellerV7VO.innerBackgroundColor) && Intrinsics.d(this.tokenizedEvent, sellerV7VO.tokenizedEvent) && Intrinsics.d(this.json, sellerV7VO.json) && Intrinsics.d(this.backgroundImage, sellerV7VO.backgroundImage);
    }

    public final String getBackgroundIconImage() {
        return this.backgroundIconImage;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final SellerIsland getChat() {
        return this.chat;
    }

    public final SellerHeader getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject
    @NotNull
    public String getJson() {
        return this.json;
    }

    public final SellerIsland getRating() {
        return this.rating;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CellDTO getSellerCell() {
        return this.sellerCell;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        SellerHeader sellerHeader = this.header;
        int c11 = Bi.b.c(this.sellerCell, (hashCode + (sellerHeader == null ? 0 : sellerHeader.hashCode())) * 31, 31);
        SellerIsland sellerIsland = this.rating;
        int hashCode2 = (c11 + (sellerIsland == null ? 0 : sellerIsland.hashCode())) * 31;
        SellerIsland sellerIsland2 = this.chat;
        int hashCode3 = (hashCode2 + (sellerIsland2 == null ? 0 : sellerIsland2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundIconImage;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.innerBackgroundColor;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int a11 = g.a((hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.json);
        String str4 = this.backgroundImage;
        return a11 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        SellerHeader sellerHeader = this.header;
        CellDTO cellDTO = this.sellerCell;
        SellerIsland sellerIsland = this.rating;
        SellerIsland sellerIsland2 = this.chat;
        String str = this.backgroundColor;
        String str2 = this.backgroundIconImage;
        String str3 = this.innerBackgroundColor;
        t tVar = this.tokenizedEvent;
        String str4 = this.json;
        String str5 = this.backgroundImage;
        StringBuilder sb2 = new StringBuilder("SellerV7VO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(sellerHeader);
        sb2.append(", sellerCell=");
        sb2.append(cellDTO);
        sb2.append(", rating=");
        sb2.append(sellerIsland);
        sb2.append(", chat=");
        sb2.append(sellerIsland2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        a.h(sb2, ", backgroundIconImage=", str2, ", innerBackgroundColor=", str3);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", json=");
        sb2.append(str4);
        return C6594f.a(", backgroundImage=", str5, ")", sb2);
    }
}
