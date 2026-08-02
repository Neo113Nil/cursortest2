package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.data;

import GZ.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bQ\b\u0081\b\u0018\u00002\u00020\u0001:\u0001|B«\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010'\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b.\u0010/J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010f\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010j\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010o\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010OJ\u0010\u0010p\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010BJ\u0017\u0010q\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010,HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jê\u0002\u0010v\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010wJ\u0013\u0010x\u001a\u00020\u00152\b\u0010y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010z\u001a\u00020#HÖ\u0001J\t\u0010{\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010=R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010C\u001a\u0004\b\u0014\u0010BR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010C\u001a\u0004\b\u001b\u0010BR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010C\u001a\u0004\b\u001f\u0010BR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0015\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010C\u001a\u0004\bM\u0010BR\u0015\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\n\n\u0002\u0010P\u001a\u0004\bN\u0010OR\u0015\u0010$\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010C\u001a\u0004\bQ\u0010BR\u001f\u0010%\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00101R\u0013\u0010*\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00101¨\u0006}"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;", "", "avatar", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatarImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "newTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "headerAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notificationAction", "shareButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "badges", "Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "defaultFavoriteButton", "activeFavoriteButton", "isFavorite", "", "favoriteButton", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "defaultSubscribeButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "activeSubscribeButton", "isSubscribe", "subscribeAction", "errorSubscribeNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "isNavBarEmbedded", "rightIcon", "hideRightIcon", "rightMargin", "", "addExtraMargins", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "infoIcon", "backgroundColor", "paddings", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO$Paddings;", "avatarV2", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/Boolean;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO$Paddings;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getAvatar", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getNewTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getHeaderAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotificationAction", "getShareButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBadges", "()Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "getDefaultFavoriteButton", "getActiveFavoriteButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFavoriteButton", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "getDefaultSubscribeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActiveSubscribeButton", "getSubscribeAction", "getErrorSubscribeNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getRightIcon", "getHideRightIcon", "getRightMargin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAddExtraMargins", "getTrackingInfo", "()Ljava/util/Map;", "getInfoIcon", "getBackgroundColor", "()Ljava/lang/String;", "getPaddings", "()Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO$Paddings;", "getAvatarV2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/Boolean;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO$Paddings;Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;", "equals", "other", "hashCode", "toString", "Paddings", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerTransparencyV3DTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.SmallIconButton activeFavoriteButton;
    private final ButtonV3DTO activeSubscribeButton;
    private final Boolean addExtraMargins;
    private final IconDTO avatar;
    private final ImageDTO avatarImage;
    private final IconDTO avatarV2;
    private final String backgroundColor;
    private final BadgeListDTO badges;
    private final ButtonV3Atom.SmallIconButton defaultFavoriteButton;
    private final ButtonV3DTO defaultSubscribeButton;
    private final NotificationDTO errorSubscribeNotification;
    private final SisBrandFavoriteButton favoriteButton;
    private final AtomActionDTO headerAction;
    private final Boolean hideRightIcon;
    private final IconDTO infoIcon;
    private final Boolean isFavorite;
    private final Boolean isNavBarEmbedded;
    private final Boolean isSubscribe;
    private final TextDTO newTitle;
    private final AtomActionDTO notificationAction;
    private final Paddings paddings;
    private final IconDTO rightIcon;
    private final Integer rightMargin;
    private final ButtonV3Atom.SmallIconButton shareButton;
    private final AtomActionDTO subscribeAction;
    private final TextDTO subtitle;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO$Paddings;", "", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getLeftPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paddings {
        public static final int $stable = 0;
        private final CommonCellSettings.LayoutPadding bottomPadding;
        private final CommonCellSettings.LayoutPadding leftPadding;
        private final CommonCellSettings.LayoutPadding rightPadding;
        private final CommonCellSettings.LayoutPadding topPadding;

        public Paddings(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4) {
            this.leftPadding = layoutPadding;
            this.rightPadding = layoutPadding2;
            this.topPadding = layoutPadding3;
            this.bottomPadding = layoutPadding4;
        }

        public static /* synthetic */ Paddings copy$default(Paddings paddings, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = paddings.leftPadding;
            }
            if ((i11 & 2) != 0) {
                layoutPadding2 = paddings.rightPadding;
            }
            if ((i11 & 4) != 0) {
                layoutPadding3 = paddings.topPadding;
            }
            if ((i11 & 8) != 0) {
                layoutPadding4 = paddings.bottomPadding;
            }
            return paddings.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings copy(CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding bottomPadding) {
            return new Paddings(leftPadding, rightPadding, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return this.leftPadding == paddings.leftPadding && this.rightPadding == paddings.rightPadding && this.topPadding == paddings.topPadding && this.bottomPadding == paddings.bottomPadding;
        }

        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
            int hashCode = (layoutPadding == null ? 0 : layoutPadding.hashCode()) * 31;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
            int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
            int hashCode3 = (hashCode2 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
            return hashCode3 + (layoutPadding4 != null ? layoutPadding4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Paddings(leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
        }
    }

    public SellerTransparencyV3DTO(IconDTO iconDTO, ImageDTO imageDTO, TextAtom textAtom, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ButtonV3Atom.SmallIconButton smallIconButton, BadgeListDTO badgeListDTO, ButtonV3Atom.SmallIconButton smallIconButton2, ButtonV3Atom.SmallIconButton smallIconButton3, Boolean bool, SisBrandFavoriteButton sisBrandFavoriteButton, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Boolean bool2, AtomActionDTO atomActionDTO3, NotificationDTO notificationDTO, Boolean bool3, IconDTO iconDTO2, Boolean bool4, Integer num, Boolean bool5, Map<String, TokenizedTrackingInfo> map, IconDTO iconDTO3, String str, Paddings paddings, IconDTO iconDTO4) {
        this.avatar = iconDTO;
        this.avatarImage = imageDTO;
        this.title = textAtom;
        this.newTitle = textDTO;
        this.subtitle = textDTO2;
        this.headerAction = atomActionDTO;
        this.notificationAction = atomActionDTO2;
        this.shareButton = smallIconButton;
        this.badges = badgeListDTO;
        this.defaultFavoriteButton = smallIconButton2;
        this.activeFavoriteButton = smallIconButton3;
        this.isFavorite = bool;
        this.favoriteButton = sisBrandFavoriteButton;
        this.defaultSubscribeButton = buttonV3DTO;
        this.activeSubscribeButton = buttonV3DTO2;
        this.isSubscribe = bool2;
        this.subscribeAction = atomActionDTO3;
        this.errorSubscribeNotification = notificationDTO;
        this.isNavBarEmbedded = bool3;
        this.rightIcon = iconDTO2;
        this.hideRightIcon = bool4;
        this.rightMargin = num;
        this.addExtraMargins = bool5;
        this.trackingInfo = map;
        this.infoIcon = iconDTO3;
        this.backgroundColor = str;
        this.paddings = paddings;
        this.avatarV2 = iconDTO4;
    }

    public static /* synthetic */ SellerTransparencyV3DTO copy$default(SellerTransparencyV3DTO sellerTransparencyV3DTO, IconDTO iconDTO, ImageDTO imageDTO, TextAtom textAtom, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ButtonV3Atom.SmallIconButton smallIconButton, BadgeListDTO badgeListDTO, ButtonV3Atom.SmallIconButton smallIconButton2, ButtonV3Atom.SmallIconButton smallIconButton3, Boolean bool, SisBrandFavoriteButton sisBrandFavoriteButton, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Boolean bool2, AtomActionDTO atomActionDTO3, NotificationDTO notificationDTO, Boolean bool3, IconDTO iconDTO2, Boolean bool4, Integer num, Boolean bool5, Map map, IconDTO iconDTO3, String str, Paddings paddings, IconDTO iconDTO4, int i11, Object obj) {
        IconDTO iconDTO5;
        Paddings paddings2;
        IconDTO iconDTO6 = (i11 & 1) != 0 ? sellerTransparencyV3DTO.avatar : iconDTO;
        ImageDTO imageDTO2 = (i11 & 2) != 0 ? sellerTransparencyV3DTO.avatarImage : imageDTO;
        TextAtom textAtom2 = (i11 & 4) != 0 ? sellerTransparencyV3DTO.title : textAtom;
        TextDTO textDTO3 = (i11 & 8) != 0 ? sellerTransparencyV3DTO.newTitle : textDTO;
        TextDTO textDTO4 = (i11 & 16) != 0 ? sellerTransparencyV3DTO.subtitle : textDTO2;
        AtomActionDTO atomActionDTO4 = (i11 & 32) != 0 ? sellerTransparencyV3DTO.headerAction : atomActionDTO;
        AtomActionDTO atomActionDTO5 = (i11 & 64) != 0 ? sellerTransparencyV3DTO.notificationAction : atomActionDTO2;
        ButtonV3Atom.SmallIconButton smallIconButton4 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? sellerTransparencyV3DTO.shareButton : smallIconButton;
        BadgeListDTO badgeListDTO2 = (i11 & 256) != 0 ? sellerTransparencyV3DTO.badges : badgeListDTO;
        ButtonV3Atom.SmallIconButton smallIconButton5 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? sellerTransparencyV3DTO.defaultFavoriteButton : smallIconButton2;
        ButtonV3Atom.SmallIconButton smallIconButton6 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? sellerTransparencyV3DTO.activeFavoriteButton : smallIconButton3;
        Boolean bool6 = (i11 & 2048) != 0 ? sellerTransparencyV3DTO.isFavorite : bool;
        SisBrandFavoriteButton sisBrandFavoriteButton2 = (i11 & 4096) != 0 ? sellerTransparencyV3DTO.favoriteButton : sisBrandFavoriteButton;
        ButtonV3DTO buttonV3DTO3 = (i11 & 8192) != 0 ? sellerTransparencyV3DTO.defaultSubscribeButton : buttonV3DTO;
        IconDTO iconDTO7 = iconDTO6;
        ButtonV3DTO buttonV3DTO4 = (i11 & 16384) != 0 ? sellerTransparencyV3DTO.activeSubscribeButton : buttonV3DTO2;
        Boolean bool7 = (i11 & 32768) != 0 ? sellerTransparencyV3DTO.isSubscribe : bool2;
        AtomActionDTO atomActionDTO6 = (i11 & 65536) != 0 ? sellerTransparencyV3DTO.subscribeAction : atomActionDTO3;
        NotificationDTO notificationDTO2 = (i11 & 131072) != 0 ? sellerTransparencyV3DTO.errorSubscribeNotification : notificationDTO;
        Boolean bool8 = (i11 & 262144) != 0 ? sellerTransparencyV3DTO.isNavBarEmbedded : bool3;
        IconDTO iconDTO8 = (i11 & 524288) != 0 ? sellerTransparencyV3DTO.rightIcon : iconDTO2;
        Boolean bool9 = (i11 & 1048576) != 0 ? sellerTransparencyV3DTO.hideRightIcon : bool4;
        Integer num2 = (i11 & 2097152) != 0 ? sellerTransparencyV3DTO.rightMargin : num;
        Boolean bool10 = (i11 & 4194304) != 0 ? sellerTransparencyV3DTO.addExtraMargins : bool5;
        Map map2 = (i11 & 8388608) != 0 ? sellerTransparencyV3DTO.trackingInfo : map;
        IconDTO iconDTO9 = (i11 & 16777216) != 0 ? sellerTransparencyV3DTO.infoIcon : iconDTO3;
        String str2 = (i11 & 33554432) != 0 ? sellerTransparencyV3DTO.backgroundColor : str;
        Paddings paddings3 = (i11 & 67108864) != 0 ? sellerTransparencyV3DTO.paddings : paddings;
        if ((i11 & 134217728) != 0) {
            paddings2 = paddings3;
            iconDTO5 = sellerTransparencyV3DTO.avatarV2;
        } else {
            iconDTO5 = iconDTO4;
            paddings2 = paddings3;
        }
        return sellerTransparencyV3DTO.copy(iconDTO7, imageDTO2, textAtom2, textDTO3, textDTO4, atomActionDTO4, atomActionDTO5, smallIconButton4, badgeListDTO2, smallIconButton5, smallIconButton6, bool6, sisBrandFavoriteButton2, buttonV3DTO3, buttonV3DTO4, bool7, atomActionDTO6, notificationDTO2, bool8, iconDTO8, bool9, num2, bool10, map2, iconDTO9, str2, paddings2, iconDTO5);
    }

    /* renamed from: component1, reason: from getter */
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    /* renamed from: component10, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getDefaultFavoriteButton() {
        return this.defaultFavoriteButton;
    }

    /* renamed from: component11, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getActiveFavoriteButton() {
        return this.activeFavoriteButton;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component13, reason: from getter */
    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    /* renamed from: component14, reason: from getter */
    public final ButtonV3DTO getDefaultSubscribeButton() {
        return this.defaultSubscribeButton;
    }

    /* renamed from: component15, reason: from getter */
    public final ButtonV3DTO getActiveSubscribeButton() {
        return this.activeSubscribeButton;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    /* renamed from: component17, reason: from getter */
    public final AtomActionDTO getSubscribeAction() {
        return this.subscribeAction;
    }

    /* renamed from: component18, reason: from getter */
    public final NotificationDTO getErrorSubscribeNotification() {
        return this.errorSubscribeNotification;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getIsNavBarEmbedded() {
        return this.isNavBarEmbedded;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageDTO getAvatarImage() {
        return this.avatarImage;
    }

    /* renamed from: component20, reason: from getter */
    public final IconDTO getRightIcon() {
        return this.rightIcon;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getHideRightIcon() {
        return this.hideRightIcon;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    /* renamed from: component23, reason: from getter */
    public final Boolean getAddExtraMargins() {
        return this.addExtraMargins;
    }

    public final Map<String, TokenizedTrackingInfo> component24() {
        return this.trackingInfo;
    }

    /* renamed from: component25, reason: from getter */
    public final IconDTO getInfoIcon() {
        return this.infoIcon;
    }

    /* renamed from: component26, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component27, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component28, reason: from getter */
    public final IconDTO getAvatarV2() {
        return this.avatarV2;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getNewTitle() {
        return this.newTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getHeaderAction() {
        return this.headerAction;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getNotificationAction() {
        return this.notificationAction;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getShareButton() {
        return this.shareButton;
    }

    /* renamed from: component9, reason: from getter */
    public final BadgeListDTO getBadges() {
        return this.badges;
    }

    @NotNull
    public final SellerTransparencyV3DTO copy(IconDTO avatar, ImageDTO avatarImage, TextAtom title, TextDTO newTitle, TextDTO subtitle, AtomActionDTO headerAction, AtomActionDTO notificationAction, ButtonV3Atom.SmallIconButton shareButton, BadgeListDTO badges, ButtonV3Atom.SmallIconButton defaultFavoriteButton, ButtonV3Atom.SmallIconButton activeFavoriteButton, Boolean isFavorite, SisBrandFavoriteButton favoriteButton, ButtonV3DTO defaultSubscribeButton, ButtonV3DTO activeSubscribeButton, Boolean isSubscribe, AtomActionDTO subscribeAction, NotificationDTO errorSubscribeNotification, Boolean isNavBarEmbedded, IconDTO rightIcon, Boolean hideRightIcon, Integer rightMargin, Boolean addExtraMargins, Map<String, TokenizedTrackingInfo> trackingInfo, IconDTO infoIcon, String backgroundColor, Paddings paddings, IconDTO avatarV2) {
        return new SellerTransparencyV3DTO(avatar, avatarImage, title, newTitle, subtitle, headerAction, notificationAction, shareButton, badges, defaultFavoriteButton, activeFavoriteButton, isFavorite, favoriteButton, defaultSubscribeButton, activeSubscribeButton, isSubscribe, subscribeAction, errorSubscribeNotification, isNavBarEmbedded, rightIcon, hideRightIcon, rightMargin, addExtraMargins, trackingInfo, infoIcon, backgroundColor, paddings, avatarV2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerTransparencyV3DTO)) {
            return false;
        }
        SellerTransparencyV3DTO sellerTransparencyV3DTO = (SellerTransparencyV3DTO) other;
        return Intrinsics.d(this.avatar, sellerTransparencyV3DTO.avatar) && Intrinsics.d(this.avatarImage, sellerTransparencyV3DTO.avatarImage) && Intrinsics.d(this.title, sellerTransparencyV3DTO.title) && Intrinsics.d(this.newTitle, sellerTransparencyV3DTO.newTitle) && Intrinsics.d(this.subtitle, sellerTransparencyV3DTO.subtitle) && Intrinsics.d(this.headerAction, sellerTransparencyV3DTO.headerAction) && Intrinsics.d(this.notificationAction, sellerTransparencyV3DTO.notificationAction) && Intrinsics.d(this.shareButton, sellerTransparencyV3DTO.shareButton) && Intrinsics.d(this.badges, sellerTransparencyV3DTO.badges) && Intrinsics.d(this.defaultFavoriteButton, sellerTransparencyV3DTO.defaultFavoriteButton) && Intrinsics.d(this.activeFavoriteButton, sellerTransparencyV3DTO.activeFavoriteButton) && Intrinsics.d(this.isFavorite, sellerTransparencyV3DTO.isFavorite) && Intrinsics.d(this.favoriteButton, sellerTransparencyV3DTO.favoriteButton) && Intrinsics.d(this.defaultSubscribeButton, sellerTransparencyV3DTO.defaultSubscribeButton) && Intrinsics.d(this.activeSubscribeButton, sellerTransparencyV3DTO.activeSubscribeButton) && Intrinsics.d(this.isSubscribe, sellerTransparencyV3DTO.isSubscribe) && Intrinsics.d(this.subscribeAction, sellerTransparencyV3DTO.subscribeAction) && Intrinsics.d(this.errorSubscribeNotification, sellerTransparencyV3DTO.errorSubscribeNotification) && Intrinsics.d(this.isNavBarEmbedded, sellerTransparencyV3DTO.isNavBarEmbedded) && Intrinsics.d(this.rightIcon, sellerTransparencyV3DTO.rightIcon) && Intrinsics.d(this.hideRightIcon, sellerTransparencyV3DTO.hideRightIcon) && Intrinsics.d(this.rightMargin, sellerTransparencyV3DTO.rightMargin) && Intrinsics.d(this.addExtraMargins, sellerTransparencyV3DTO.addExtraMargins) && Intrinsics.d(this.trackingInfo, sellerTransparencyV3DTO.trackingInfo) && Intrinsics.d(this.infoIcon, sellerTransparencyV3DTO.infoIcon) && Intrinsics.d(this.backgroundColor, sellerTransparencyV3DTO.backgroundColor) && Intrinsics.d(this.paddings, sellerTransparencyV3DTO.paddings) && Intrinsics.d(this.avatarV2, sellerTransparencyV3DTO.avatarV2);
    }

    public final ButtonV3Atom.SmallIconButton getActiveFavoriteButton() {
        return this.activeFavoriteButton;
    }

    public final ButtonV3DTO getActiveSubscribeButton() {
        return this.activeSubscribeButton;
    }

    public final Boolean getAddExtraMargins() {
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

    public final ButtonV3DTO getDefaultSubscribeButton() {
        return this.defaultSubscribeButton;
    }

    public final NotificationDTO getErrorSubscribeNotification() {
        return this.errorSubscribeNotification;
    }

    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    public final AtomActionDTO getHeaderAction() {
        return this.headerAction;
    }

    public final Boolean getHideRightIcon() {
        return this.hideRightIcon;
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

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final IconDTO getRightIcon() {
        return this.rightIcon;
    }

    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    public final ButtonV3Atom.SmallIconButton getShareButton() {
        return this.shareButton;
    }

    public final AtomActionDTO getSubscribeAction() {
        return this.subscribeAction;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        IconDTO iconDTO = this.avatar;
        int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
        ImageDTO imageDTO = this.avatarImage;
        int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextDTO textDTO = this.newTitle;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode5 = (hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.headerAction;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.notificationAction;
        int hashCode7 = (hashCode6 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.shareButton;
        int hashCode8 = (hashCode7 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        BadgeListDTO badgeListDTO = this.badges;
        int hashCode9 = (hashCode8 + (badgeListDTO == null ? 0 : badgeListDTO.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.defaultFavoriteButton;
        int hashCode10 = (hashCode9 + (smallIconButton2 == null ? 0 : smallIconButton2.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton3 = this.activeFavoriteButton;
        int hashCode11 = (hashCode10 + (smallIconButton3 == null ? 0 : smallIconButton3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        int hashCode13 = (hashCode12 + (sisBrandFavoriteButton == null ? 0 : sisBrandFavoriteButton.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.defaultSubscribeButton;
        int hashCode14 = (hashCode13 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO2 = this.activeSubscribeButton;
        int hashCode15 = (hashCode14 + (buttonV3DTO2 == null ? 0 : buttonV3DTO2.hashCode())) * 31;
        Boolean bool2 = this.isSubscribe;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AtomActionDTO atomActionDTO3 = this.subscribeAction;
        int hashCode17 = (hashCode16 + (atomActionDTO3 == null ? 0 : atomActionDTO3.hashCode())) * 31;
        NotificationDTO notificationDTO = this.errorSubscribeNotification;
        int hashCode18 = (hashCode17 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        Boolean bool3 = this.isNavBarEmbedded;
        int hashCode19 = (hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        IconDTO iconDTO2 = this.rightIcon;
        int hashCode20 = (hashCode19 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31;
        Boolean bool4 = this.hideRightIcon;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.rightMargin;
        int hashCode22 = (hashCode21 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool5 = this.addExtraMargins;
        int hashCode23 = (hashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode24 = (hashCode23 + (map == null ? 0 : map.hashCode())) * 31;
        IconDTO iconDTO3 = this.infoIcon;
        int hashCode25 = (hashCode24 + (iconDTO3 == null ? 0 : iconDTO3.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode26 = (hashCode25 + (str == null ? 0 : str.hashCode())) * 31;
        Paddings paddings = this.paddings;
        int hashCode27 = (hashCode26 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        IconDTO iconDTO4 = this.avatarV2;
        return hashCode27 + (iconDTO4 != null ? iconDTO4.hashCode() : 0);
    }

    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    public final Boolean isNavBarEmbedded() {
        return this.isNavBarEmbedded;
    }

    public final Boolean isSubscribe() {
        return this.isSubscribe;
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.avatar;
        ImageDTO imageDTO = this.avatarImage;
        TextAtom textAtom = this.title;
        TextDTO textDTO = this.newTitle;
        TextDTO textDTO2 = this.subtitle;
        AtomActionDTO atomActionDTO = this.headerAction;
        AtomActionDTO atomActionDTO2 = this.notificationAction;
        ButtonV3Atom.SmallIconButton smallIconButton = this.shareButton;
        BadgeListDTO badgeListDTO = this.badges;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.defaultFavoriteButton;
        ButtonV3Atom.SmallIconButton smallIconButton3 = this.activeFavoriteButton;
        Boolean bool = this.isFavorite;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        ButtonV3DTO buttonV3DTO = this.defaultSubscribeButton;
        ButtonV3DTO buttonV3DTO2 = this.activeSubscribeButton;
        Boolean bool2 = this.isSubscribe;
        AtomActionDTO atomActionDTO3 = this.subscribeAction;
        NotificationDTO notificationDTO = this.errorSubscribeNotification;
        Boolean bool3 = this.isNavBarEmbedded;
        IconDTO iconDTO2 = this.rightIcon;
        Boolean bool4 = this.hideRightIcon;
        Integer num = this.rightMargin;
        Boolean bool5 = this.addExtraMargins;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        IconDTO iconDTO3 = this.infoIcon;
        String str = this.backgroundColor;
        Paddings paddings = this.paddings;
        IconDTO iconDTO4 = this.avatarV2;
        StringBuilder sb2 = new StringBuilder("SellerTransparencyV3DTO(avatar=");
        sb2.append(iconDTO);
        sb2.append(", avatarImage=");
        sb2.append(imageDTO);
        sb2.append(", title=");
        sb2.append(textAtom);
        sb2.append(", newTitle=");
        sb2.append(textDTO);
        sb2.append(", subtitle=");
        sb2.append(textDTO2);
        sb2.append(", headerAction=");
        sb2.append(atomActionDTO);
        sb2.append(", notificationAction=");
        sb2.append(atomActionDTO2);
        sb2.append(", shareButton=");
        sb2.append(smallIconButton);
        sb2.append(", badges=");
        sb2.append(badgeListDTO);
        sb2.append(", defaultFavoriteButton=");
        sb2.append(smallIconButton2);
        sb2.append(", activeFavoriteButton=");
        sb2.append(smallIconButton3);
        sb2.append(", isFavorite=");
        sb2.append(bool);
        sb2.append(", favoriteButton=");
        sb2.append(sisBrandFavoriteButton);
        sb2.append(", defaultSubscribeButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", activeSubscribeButton=");
        sb2.append(buttonV3DTO2);
        sb2.append(", isSubscribe=");
        sb2.append(bool2);
        sb2.append(", subscribeAction=");
        sb2.append(atomActionDTO3);
        sb2.append(", errorSubscribeNotification=");
        sb2.append(notificationDTO);
        sb2.append(", isNavBarEmbedded=");
        sb2.append(bool3);
        sb2.append(", rightIcon=");
        sb2.append(iconDTO2);
        sb2.append(", hideRightIcon=");
        e.d(bool4, num, ", rightMargin=", ", addExtraMargins=", sb2);
        sb2.append(bool5);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", infoIcon=");
        sb2.append(iconDTO3);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", paddings=");
        sb2.append(paddings);
        sb2.append(", avatarV2=");
        sb2.append(iconDTO4);
        sb2.append(")");
        return sb2.toString();
    }
}
