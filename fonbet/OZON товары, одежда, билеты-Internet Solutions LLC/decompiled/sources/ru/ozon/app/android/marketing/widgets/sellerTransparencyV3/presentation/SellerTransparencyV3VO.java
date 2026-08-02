package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import Kk.C3532b;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\bA\n\u0002\u0010$\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u0084\u00012\u00060\u0001j\u0002`\u0002:\u0004\u0084\u0001\u0085\u0001B\u0093\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010&\u001a\u00020\u0017\u0012\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020+HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020$HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bL\u0010KR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\bV\u0010?R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010W\u001a\u0004\b\u0018\u0010X\"\u0004\bY\u0010ZR$\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010W\u001a\u0004\b\u0019\u0010X\"\u0004\b[\u0010ZR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010\\\u001a\u0004\b\u001a\u0010]R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010C\u001a\u0004\b^\u0010ER\u0019\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010C\u001a\u0004\b_\u0010ER\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010`\u001a\u0004\bc\u0010bR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010d\u001a\u0004\be\u0010fR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010g\u001a\u0004\bh\u0010iR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010&\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b&\u0010\\\u001a\u0004\bm\u0010]R\u001f\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(8\u0006¢\u0006\f\n\u0004\b)\u0010n\u001a\u0004\bo\u0010pR\u0019\u0010*\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010=\u001a\u0004\bq\u0010?R\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010r\u001a\u0004\bs\u00103R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010t\u001a\u0004\bu\u0010vR\u0019\u0010/\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u0010=\u001a\u0004\bw\u0010?R%\u0010y\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010x8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0019\u0010}\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b}\u0010r\u001a\u0004\b~\u00103R\u0014\u0010\u007f\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\\R\u0016\u0010\u0080\u0001\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\\R\u001a\u0010\u0081\u0001\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\\\u001a\u0005\b\u0081\u0001\u0010]R\u001a\u0010\u0082\u0001\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\\\u001a\u0005\b\u0083\u0001\u0010]¨\u0006\u0086\u0001"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatar", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "avatarImage", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "share", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "newTitle", "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "headerAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notificationAction", "Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "badges", "rightIcon", "", "isFavourite", "isSubscribed", "isNavBarEmbedded", "defaultFavoriteButton", "activeFavoriteButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "defaultSubscribeButton", "activeSubscribeButton", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "defaultNotification", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "favoriteButton", "", "rightMargin", "addExtraMargins", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "infoIcon", "", "backgroundColor", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;", "paddings", "avatarV2", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Ljava/lang/Integer;ZLWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatar", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAvatarImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getShare", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNewTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getHeaderAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotificationAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "getBadges", "()Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "getRightIcon", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setFavourite", "(Ljava/lang/Boolean;)V", "setSubscribed", "Z", "()Z", "getDefaultFavoriteButton", "getActiveFavoriteButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDefaultSubscribeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActiveSubscribeButton", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getDefaultNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "getFavoriteButton", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "Ljava/lang/Integer;", "getRightMargin", "()Ljava/lang/Integer;", "getAddExtraMargins", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getInfoIcon", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;", "getAvatarV2", "", "sellerParams", "Ljava/util/Map;", "getSellerParams", "()Ljava/util/Map;", "sellerId", "getSellerId", "hasLike", "hasSubscribe", "isLikeFunctionEnabled", "hasSubscribeButton", "getHasSubscribeButton", "Companion", "PaddingsVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerTransparencyV3VO implements c {
    private final ButtonV3Atom.SmallIconButton activeFavoriteButton;
    private final ButtonV3DTO activeSubscribeButton;
    private final boolean addExtraMargins;
    private final IconDTO avatar;
    private final ImageDTO avatarImage;
    private final IconDTO avatarV2;
    private final String backgroundColor;
    private final BadgeListDTO badges;
    private final ButtonV3Atom.SmallIconButton defaultFavoriteButton;

    @NotNull
    private final NotificationModelWrapper defaultNotification;
    private final ButtonV3DTO defaultSubscribeButton;
    private final SisBrandFavoriteButton favoriteButton;
    private final boolean hasLike;
    private final boolean hasSubscribe;
    private final boolean hasSubscribeButton;
    private final AtomAction headerAction;
    private final long id;
    private final IconDTO infoIcon;
    private Boolean isFavourite;
    private final boolean isLikeFunctionEnabled;
    private final boolean isNavBarEmbedded;
    private Boolean isSubscribed;
    private final TextDTO newTitle;
    private final AtomActionDTO notificationAction;

    @NotNull
    private final PaddingsVO paddings;
    private final IconDTO rightIcon;
    private final Integer rightMargin;
    private final String sellerId;
    private final Map<String, String> sellerParams;
    private final ButtonV3Atom.SmallIconButton share;
    private final TextDTO subtitle;
    private final TextAtom title;
    private final t tokenizedEvent;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;", "", "", "leftPadding", "rightPadding", "topPadding", "bottomPadding", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeftPadding", "getRightPadding", "getTopPadding", "getBottomPadding", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int bottomPadding;
        private final int leftPadding;
        private final int rightPadding;
        private final int topPadding;

        public PaddingsVO(int i11, int i12, int i13, int i14) {
            this.leftPadding = i11;
            this.rightPadding = i12;
            this.topPadding = i13;
            this.bottomPadding = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.leftPadding == paddingsVO.leftPadding && this.rightPadding == paddingsVO.rightPadding && this.topPadding == paddingsVO.topPadding && this.bottomPadding == paddingsVO.bottomPadding;
        }

        public final int getBottomPadding() {
            return this.bottomPadding;
        }

        public final int getLeftPadding() {
            return this.leftPadding;
        }

        public final int getRightPadding() {
            return this.rightPadding;
        }

        public final int getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottomPadding) + C2454a.a(this.topPadding, C2454a.a(this.rightPadding, Integer.hashCode(this.leftPadding) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.topPadding, this.bottomPadding, ", bottomPadding=", ")", C2438a.a("PaddingsVO(leftPadding=", this.leftPadding, ", rightPadding=", ", topPadding=", this.rightPadding));
        }
    }

    public SellerTransparencyV3VO(long j11, IconDTO iconDTO, ImageDTO imageDTO, ButtonV3Atom.SmallIconButton smallIconButton, TextAtom textAtom, TextDTO textDTO, TextDTO textDTO2, AtomAction atomAction, AtomActionDTO atomActionDTO, BadgeListDTO badgeListDTO, IconDTO iconDTO2, Boolean bool, Boolean bool2, boolean z11, ButtonV3Atom.SmallIconButton smallIconButton2, ButtonV3Atom.SmallIconButton smallIconButton3, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, @NotNull NotificationModelWrapper defaultNotification, SisBrandFavoriteButton sisBrandFavoriteButton, Integer num, boolean z12, t tVar, IconDTO iconDTO3, String str, @NotNull PaddingsVO paddings, IconDTO iconDTO4) {
        AtomActionDTO action;
        CommonControlSettings common;
        AtomActionDTO action2;
        Intrinsics.checkNotNullParameter(defaultNotification, "defaultNotification");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.avatar = iconDTO;
        this.avatarImage = imageDTO;
        this.share = smallIconButton;
        this.title = textAtom;
        this.newTitle = textDTO;
        this.subtitle = textDTO2;
        this.headerAction = atomAction;
        this.notificationAction = atomActionDTO;
        this.badges = badgeListDTO;
        this.rightIcon = iconDTO2;
        this.isFavourite = bool;
        this.isSubscribed = bool2;
        this.isNavBarEmbedded = z11;
        this.defaultFavoriteButton = smallIconButton2;
        this.activeFavoriteButton = smallIconButton3;
        this.defaultSubscribeButton = buttonV3DTO;
        this.activeSubscribeButton = buttonV3DTO2;
        this.defaultNotification = defaultNotification;
        this.favoriteButton = sisBrandFavoriteButton;
        this.rightMargin = num;
        this.addExtraMargins = z12;
        this.tokenizedEvent = tVar;
        this.infoIcon = iconDTO3;
        this.backgroundColor = str;
        this.paddings = paddings;
        this.avatarV2 = iconDTO4;
        Map<String, String> params = (buttonV3DTO2 == null || (common = buttonV3DTO2.getCommon()) == null || (action2 = common.getAction()) == null || (params = action2.getParams()) == null) ? (smallIconButton3 == null || (action = smallIconButton3.getAction()) == null) ? null : action.getParams() : params;
        this.sellerParams = params;
        this.sellerId = params != null ? params.getOrDefault("sellerId", "0") : null;
        boolean z13 = (smallIconButton3 == null && smallIconButton2 == null && this.isFavourite == null) ? false : true;
        this.hasLike = z13;
        boolean z14 = (buttonV3DTO == null && buttonV3DTO2 == null && this.isSubscribed == null) ? false : true;
        this.hasSubscribe = z14;
        this.isLikeFunctionEnabled = z13 && !z14;
        this.hasSubscribeButton = z14 && !z13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerTransparencyV3VO)) {
            return false;
        }
        SellerTransparencyV3VO sellerTransparencyV3VO = (SellerTransparencyV3VO) other;
        return this.id == sellerTransparencyV3VO.id && Intrinsics.d(this.avatar, sellerTransparencyV3VO.avatar) && Intrinsics.d(this.avatarImage, sellerTransparencyV3VO.avatarImage) && Intrinsics.d(this.share, sellerTransparencyV3VO.share) && Intrinsics.d(this.title, sellerTransparencyV3VO.title) && Intrinsics.d(this.newTitle, sellerTransparencyV3VO.newTitle) && Intrinsics.d(this.subtitle, sellerTransparencyV3VO.subtitle) && Intrinsics.d(this.headerAction, sellerTransparencyV3VO.headerAction) && Intrinsics.d(this.notificationAction, sellerTransparencyV3VO.notificationAction) && Intrinsics.d(this.badges, sellerTransparencyV3VO.badges) && Intrinsics.d(this.rightIcon, sellerTransparencyV3VO.rightIcon) && Intrinsics.d(this.isFavourite, sellerTransparencyV3VO.isFavourite) && Intrinsics.d(this.isSubscribed, sellerTransparencyV3VO.isSubscribed) && this.isNavBarEmbedded == sellerTransparencyV3VO.isNavBarEmbedded && Intrinsics.d(this.defaultFavoriteButton, sellerTransparencyV3VO.defaultFavoriteButton) && Intrinsics.d(this.activeFavoriteButton, sellerTransparencyV3VO.activeFavoriteButton) && Intrinsics.d(this.defaultSubscribeButton, sellerTransparencyV3VO.defaultSubscribeButton) && Intrinsics.d(this.activeSubscribeButton, sellerTransparencyV3VO.activeSubscribeButton) && Intrinsics.d(this.defaultNotification, sellerTransparencyV3VO.defaultNotification) && Intrinsics.d(this.favoriteButton, sellerTransparencyV3VO.favoriteButton) && Intrinsics.d(this.rightMargin, sellerTransparencyV3VO.rightMargin) && this.addExtraMargins == sellerTransparencyV3VO.addExtraMargins && Intrinsics.d(this.tokenizedEvent, sellerTransparencyV3VO.tokenizedEvent) && Intrinsics.d(this.infoIcon, sellerTransparencyV3VO.infoIcon) && Intrinsics.d(this.backgroundColor, sellerTransparencyV3VO.backgroundColor) && Intrinsics.d(this.paddings, sellerTransparencyV3VO.paddings) && Intrinsics.d(this.avatarV2, sellerTransparencyV3VO.avatarV2);
    }

    public final ButtonV3Atom.SmallIconButton getActiveFavoriteButton() {
        return this.activeFavoriteButton;
    }

    public final ButtonV3DTO getActiveSubscribeButton() {
        return this.activeSubscribeButton;
    }

    public final boolean getAddExtraMargins() {
        return this.addExtraMargins;
    }

    public final IconDTO getAvatar() {
        return this.avatar;
    }

    public final ImageDTO getAvatarImage() {
        return this.avatarImage;
    }

    public final IconDTO getAvatarV2() {
        return this.avatarV2;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeListDTO getBadges() {
        return this.badges;
    }

    public final ButtonV3Atom.SmallIconButton getDefaultFavoriteButton() {
        return this.defaultFavoriteButton;
    }

    @NotNull
    public final NotificationModelWrapper getDefaultNotification() {
        return this.defaultNotification;
    }

    public final ButtonV3DTO getDefaultSubscribeButton() {
        return this.defaultSubscribeButton;
    }

    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    public final boolean getHasSubscribeButton() {
        return this.hasSubscribeButton;
    }

    public final AtomAction getHeaderAction() {
        return this.headerAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IconDTO getInfoIcon() {
        return this.infoIcon;
    }

    public final TextDTO getNewTitle() {
        return this.newTitle;
    }

    public final AtomActionDTO getNotificationAction() {
        return this.notificationAction;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    public final IconDTO getRightIcon() {
        return this.rightIcon;
    }

    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final ButtonV3Atom.SmallIconButton getShare() {
        return this.share;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
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
        IconDTO iconDTO = this.avatar;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        ImageDTO imageDTO = this.avatarImage;
        int hashCode3 = (hashCode2 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.share;
        int hashCode4 = (hashCode3 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode5 = (hashCode4 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextDTO textDTO = this.newTitle;
        int hashCode6 = (hashCode5 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode7 = (hashCode6 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        AtomAction atomAction = this.headerAction;
        int hashCode8 = (hashCode7 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.notificationAction;
        int hashCode9 = (hashCode8 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        BadgeListDTO badgeListDTO = this.badges;
        int hashCode10 = (hashCode9 + (badgeListDTO == null ? 0 : badgeListDTO.hashCode())) * 31;
        IconDTO iconDTO2 = this.rightIcon;
        int hashCode11 = (hashCode10 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31;
        Boolean bool = this.isFavourite;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSubscribed;
        int a11 = C3532b.a((hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.isNavBarEmbedded);
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.defaultFavoriteButton;
        int hashCode13 = (a11 + (smallIconButton2 == null ? 0 : smallIconButton2.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton3 = this.activeFavoriteButton;
        int hashCode14 = (hashCode13 + (smallIconButton3 == null ? 0 : smallIconButton3.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.defaultSubscribeButton;
        int hashCode15 = (hashCode14 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO2 = this.activeSubscribeButton;
        int hashCode16 = (this.defaultNotification.hashCode() + ((hashCode15 + (buttonV3DTO2 == null ? 0 : buttonV3DTO2.hashCode())) * 31)) * 31;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        int hashCode17 = (hashCode16 + (sisBrandFavoriteButton == null ? 0 : sisBrandFavoriteButton.hashCode())) * 31;
        Integer num = this.rightMargin;
        int a12 = C3532b.a((hashCode17 + (num == null ? 0 : num.hashCode())) * 31, 31, this.addExtraMargins);
        t tVar = this.tokenizedEvent;
        int hashCode18 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        IconDTO iconDTO3 = this.infoIcon;
        int hashCode19 = (hashCode18 + (iconDTO3 == null ? 0 : iconDTO3.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode20 = (this.paddings.hashCode() + ((hashCode19 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        IconDTO iconDTO4 = this.avatarV2;
        return hashCode20 + (iconDTO4 != null ? iconDTO4.hashCode() : 0);
    }

    /* renamed from: isFavourite, reason: from getter */
    public final Boolean getIsFavourite() {
        return this.isFavourite;
    }

    /* renamed from: isLikeFunctionEnabled, reason: from getter */
    public final boolean getIsLikeFunctionEnabled() {
        return this.isLikeFunctionEnabled;
    }

    /* renamed from: isNavBarEmbedded, reason: from getter */
    public final boolean getIsNavBarEmbedded() {
        return this.isNavBarEmbedded;
    }

    /* renamed from: isSubscribed, reason: from getter */
    public final Boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public final void setFavourite(Boolean bool) {
        this.isFavourite = bool;
    }

    public final void setSubscribed(Boolean bool) {
        this.isSubscribed = bool;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.avatar;
        ImageDTO imageDTO = this.avatarImage;
        ButtonV3Atom.SmallIconButton smallIconButton = this.share;
        TextAtom textAtom = this.title;
        TextDTO textDTO = this.newTitle;
        TextDTO textDTO2 = this.subtitle;
        AtomAction atomAction = this.headerAction;
        AtomActionDTO atomActionDTO = this.notificationAction;
        BadgeListDTO badgeListDTO = this.badges;
        IconDTO iconDTO2 = this.rightIcon;
        Boolean bool = this.isFavourite;
        Boolean bool2 = this.isSubscribed;
        boolean z11 = this.isNavBarEmbedded;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.defaultFavoriteButton;
        ButtonV3Atom.SmallIconButton smallIconButton3 = this.activeFavoriteButton;
        ButtonV3DTO buttonV3DTO = this.defaultSubscribeButton;
        ButtonV3DTO buttonV3DTO2 = this.activeSubscribeButton;
        NotificationModelWrapper notificationModelWrapper = this.defaultNotification;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        Integer num = this.rightMargin;
        boolean z12 = this.addExtraMargins;
        t tVar = this.tokenizedEvent;
        IconDTO iconDTO3 = this.infoIcon;
        String str = this.backgroundColor;
        PaddingsVO paddingsVO = this.paddings;
        IconDTO iconDTO4 = this.avatarV2;
        StringBuilder b11 = D40.c.b("SellerTransparencyV3VO(id=", j11, ", avatar=", iconDTO);
        b11.append(", avatarImage=");
        b11.append(imageDTO);
        b11.append(", share=");
        b11.append(smallIconButton);
        b11.append(", title=");
        b11.append(textAtom);
        b11.append(", newTitle=");
        b11.append(textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", headerAction=");
        b11.append(atomAction);
        b11.append(", notificationAction=");
        b11.append(atomActionDTO);
        b11.append(", badges=");
        b11.append(badgeListDTO);
        b11.append(", rightIcon=");
        b11.append(iconDTO2);
        b11.append(", isFavourite=");
        b11.append(bool);
        b11.append(", isSubscribed=");
        b11.append(bool2);
        b11.append(", isNavBarEmbedded=");
        b11.append(z11);
        b11.append(", defaultFavoriteButton=");
        b11.append(smallIconButton2);
        b11.append(", activeFavoriteButton=");
        b11.append(smallIconButton3);
        b11.append(", defaultSubscribeButton=");
        b11.append(buttonV3DTO);
        b11.append(", activeSubscribeButton=");
        b11.append(buttonV3DTO2);
        b11.append(", defaultNotification=");
        b11.append(notificationModelWrapper);
        b11.append(", favoriteButton=");
        b11.append(sisBrandFavoriteButton);
        b11.append(", rightMargin=");
        b11.append(num);
        b11.append(", addExtraMargins=");
        b11.append(z12);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", infoIcon=");
        b11.append(iconDTO3);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", paddings=");
        b11.append(paddingsVO);
        b11.append(", avatarV2=");
        b11.append(iconDTO4);
        b11.append(")");
        return b11.toString();
    }
}
