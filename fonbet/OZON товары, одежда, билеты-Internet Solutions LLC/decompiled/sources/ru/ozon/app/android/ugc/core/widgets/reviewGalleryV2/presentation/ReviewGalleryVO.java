package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import Ak.C2436a;
import B0.C2454a;
import Bl.C2639a;
import G.g;
import J0.P;
import Kk.C3532b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bC\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002|}B©\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010!\u0012\u0006\u0010%\u001a\u00020\u000f\u0012\u0006\u0010&\u001a\u00020\u000f\u0012\u0006\u0010'\u001a\u00020\u000f\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-\u0012\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-\u0012\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-¢\u0006\u0004\b2\u00103Jè\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0016\b\u0002\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u00107R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010e\u001a\u0004\bf\u0010gR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010h\u001a\u0004\bi\u0010jR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010#\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b#\u0010k\u001a\u0004\bn\u0010mR\u0019\u0010$\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b$\u0010k\u001a\u0004\bo\u0010mR\u0017\u0010%\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010P\u001a\u0004\bp\u0010RR\u0017\u0010&\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010P\u001a\u0004\b&\u0010RR\u0017\u0010'\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u0010P\u001a\u0004\b'\u0010RR\u0017\u0010(\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b(\u0010P\u001a\u0004\b(\u0010RR\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010q\u001a\u0004\br\u0010sR\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010t\u001a\u0004\bu\u0010vR%\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b/\u0010w\u001a\u0004\bx\u0010yR%\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b0\u0010w\u001a\u0004\bz\u0010yR%\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b1\u0010w\u001a\u0004\b{\u0010y¨\u0006~"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "reviewUuid", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;", "content", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;", "sideButtonsHeader", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "closeButton", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "rightPanel", "", "hasAudio", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;", "user", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.SOCIAL_USER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "rating", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemsContainerDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_ITEMS_CONTAINER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonFooterDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_BUTTON_FOOTER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;", "topMediaItems", "bottomMediaItems", "bottomItems", "withContainers", "isFillMode", "isVideo", "isCompactControls", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "contentViewAction", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;", "onBackConfig", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "prevTrackingInfo", "nextTrackingInfo", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;ZLru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonFooterDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;ZZZZLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;ZLru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonFooterDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;ZZZZLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getReviewUuid", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;", "getContent", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;", "getSideButtonsHeader", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "getCloseButton", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "getRightPanel", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "Z", "getHasAudio", "()Z", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;", "getUser", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", "getSocialUser", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "getRating", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "getProduct", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemsContainerDTO;", "getProductItemsContainer", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemsContainerDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", "getCommentFooter", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonFooterDTO;", "getCommentButtonFooter", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonFooterDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;", "getTopMediaItems", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;", "getBottomMediaItems", "getBottomItems", "getWithContainers", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContentViewAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;", "getOnBackConfig", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getPrevTrackingInfo", "getNextTrackingInfo", "OnBackConfigVO", "SideButtonsVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewGalleryVO implements c {
    private final BadgeDTO badge;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomItems;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomMediaItems;
    private final SocialIconButtonDTO closeButton;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooter;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooter;

    @NotNull
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper content;
    private final AtomActionDTO contentViewAction;
    private final boolean hasAudio;
    private final long id;
    private final boolean isCompactControls;
    private final boolean isFillMode;
    private final boolean isVideo;
    private final Map<String, TokenizedTrackingInfo> nextTrackingInfo;
    private final OnBackConfigVO onBackConfig;
    private final Map<String, TokenizedTrackingInfo> prevTrackingInfo;
    private final ReviewProductTileDTO product;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainer;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO rating;

    @NotNull
    private final String reviewUuid;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel;
    private final SideButtonsVO sideButtonsHeader;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO topMediaItems;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser user;
    private final boolean withContainers;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackConfigVO {

        @NotNull
        private final AtomAction action;
        private final t tokenizedEvent;

        public OnBackConfigVO(@NotNull AtomAction action, t tVar) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBackConfigVO)) {
                return false;
            }
            OnBackConfigVO onBackConfigVO = (OnBackConfigVO) other;
            return Intrinsics.d(this.action, onBackConfigVO.action) && Intrinsics.d(this.tokenizedEvent, onBackConfigVO.tokenizedEvent);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "OnBackConfigVO(action=" + this.action + ", tokenizedEvent=" + this.tokenizedEvent + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "leftButton", "rightButton", "", "leftMarginPx", "rightMarginPx", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getLeftButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButton", "I", "getLeftMarginPx", "getRightMarginPx", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SideButtonsVO {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO leftButton;
        private final int leftMarginPx;
        private final IconButtonV3DTO rightButton;
        private final int rightMarginPx;

        public SideButtonsVO(IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, int i12) {
            this.leftButton = iconButtonV3DTO;
            this.rightButton = iconButtonV3DTO2;
            this.leftMarginPx = i11;
            this.rightMarginPx = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SideButtonsVO)) {
                return false;
            }
            SideButtonsVO sideButtonsVO = (SideButtonsVO) other;
            return Intrinsics.d(this.leftButton, sideButtonsVO.leftButton) && Intrinsics.d(this.rightButton, sideButtonsVO.rightButton) && this.leftMarginPx == sideButtonsVO.leftMarginPx && this.rightMarginPx == sideButtonsVO.rightMarginPx;
        }

        public final IconButtonV3DTO getLeftButton() {
            return this.leftButton;
        }

        public final int getLeftMarginPx() {
            return this.leftMarginPx;
        }

        public final IconButtonV3DTO getRightButton() {
            return this.rightButton;
        }

        public final int getRightMarginPx() {
            return this.rightMarginPx;
        }

        public int hashCode() {
            IconButtonV3DTO iconButtonV3DTO = this.leftButton;
            int hashCode = (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode()) * 31;
            IconButtonV3DTO iconButtonV3DTO2 = this.rightButton;
            return Integer.hashCode(this.rightMarginPx) + C2454a.a(this.leftMarginPx, (hashCode + (iconButtonV3DTO2 != null ? iconButtonV3DTO2.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO iconButtonV3DTO = this.leftButton;
            IconButtonV3DTO iconButtonV3DTO2 = this.rightButton;
            int i11 = this.leftMarginPx;
            int i12 = this.rightMarginPx;
            StringBuilder sb2 = new StringBuilder("SideButtonsVO(leftButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", rightButton=");
            sb2.append(iconButtonV3DTO2);
            sb2.append(", leftMarginPx=");
            return P.a(i11, i12, ", rightMarginPx=", ")", sb2);
        }
    }

    public ReviewGalleryVO(long j11, @NotNull String reviewUuid, @NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper content, SideButtonsVO sideButtonsVO, SocialIconButtonDTO socialIconButtonDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO, boolean z11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser reviewUser, ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO, BadgeDTO badgeDTO, ReviewProductTileDTO reviewProductTileDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainerDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooterDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooterDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO2, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO3, boolean z12, boolean z13, boolean z14, boolean z15, AtomActionDTO atomActionDTO, OnBackConfigVO onBackConfigVO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.reviewUuid = reviewUuid;
        this.content = content;
        this.sideButtonsHeader = sideButtonsVO;
        this.closeButton = socialIconButtonDTO;
        this.rightPanel = reviewsRightPanelDTO;
        this.hasAudio = z11;
        this.user = reviewUser;
        this.socialUser = socialUser;
        this.rating = productRatingDTO;
        this.badge = badgeDTO;
        this.product = reviewProductTileDTO;
        this.productItemsContainer = productItemsContainerDTO;
        this.commentFooter = commentFooterDTO;
        this.commentButtonFooter = commentButtonFooterDTO;
        this.topMediaItems = itemsContainerDTO;
        this.bottomMediaItems = itemsContainerDTO2;
        this.bottomItems = itemsContainerDTO3;
        this.withContainers = z12;
        this.isFillMode = z13;
        this.isVideo = z14;
        this.isCompactControls = z15;
        this.contentViewAction = atomActionDTO;
        this.onBackConfig = onBackConfigVO;
        this.trackingInfo = map;
        this.prevTrackingInfo = map2;
        this.nextTrackingInfo = map3;
    }

    public static /* synthetic */ ReviewGalleryVO copy$default(ReviewGalleryVO reviewGalleryVO, long j11, String str, ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper contentWrapper, SideButtonsVO sideButtonsVO, SocialIconButtonDTO socialIconButtonDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO, boolean z11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser reviewUser, ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO, BadgeDTO badgeDTO, ReviewProductTileDTO reviewProductTileDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainerDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooterDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooterDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO2, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO3, boolean z12, boolean z13, boolean z14, boolean z15, AtomActionDTO atomActionDTO, OnBackConfigVO onBackConfigVO, Map map, Map map2, Map map3, int i11, Object obj) {
        Map map4;
        Map map5;
        long j12 = (i11 & 1) != 0 ? reviewGalleryVO.id : j11;
        String str2 = (i11 & 2) != 0 ? reviewGalleryVO.reviewUuid : str;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper contentWrapper2 = (i11 & 4) != 0 ? reviewGalleryVO.content : contentWrapper;
        SideButtonsVO sideButtonsVO2 = (i11 & 8) != 0 ? reviewGalleryVO.sideButtonsHeader : sideButtonsVO;
        SocialIconButtonDTO socialIconButtonDTO2 = (i11 & 16) != 0 ? reviewGalleryVO.closeButton : socialIconButtonDTO;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO2 = (i11 & 32) != 0 ? reviewGalleryVO.rightPanel : reviewsRightPanelDTO;
        boolean z16 = (i11 & 64) != 0 ? reviewGalleryVO.hasAudio : z11;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser reviewUser2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewGalleryVO.user : reviewUser;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser2 = (i11 & 256) != 0 ? reviewGalleryVO.socialUser : socialUser;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewGalleryVO.rating : productRatingDTO;
        BadgeDTO badgeDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewGalleryVO.badge : badgeDTO;
        ReviewProductTileDTO reviewProductTileDTO2 = (i11 & 2048) != 0 ? reviewGalleryVO.product : reviewProductTileDTO;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainerDTO2 = (i11 & 4096) != 0 ? reviewGalleryVO.productItemsContainer : productItemsContainerDTO;
        long j13 = j12;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooterDTO2 = (i11 & 8192) != 0 ? reviewGalleryVO.commentFooter : commentFooterDTO;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooterDTO2 = (i11 & 16384) != 0 ? reviewGalleryVO.commentButtonFooter : commentButtonFooterDTO;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO4 = (i11 & 32768) != 0 ? reviewGalleryVO.topMediaItems : itemsContainerDTO;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO5 = (i11 & 65536) != 0 ? reviewGalleryVO.bottomMediaItems : itemsContainerDTO2;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO6 = (i11 & 131072) != 0 ? reviewGalleryVO.bottomItems : itemsContainerDTO3;
        boolean z17 = (i11 & 262144) != 0 ? reviewGalleryVO.withContainers : z12;
        boolean z18 = (i11 & 524288) != 0 ? reviewGalleryVO.isFillMode : z13;
        boolean z19 = (i11 & 1048576) != 0 ? reviewGalleryVO.isVideo : z14;
        boolean z21 = (i11 & 2097152) != 0 ? reviewGalleryVO.isCompactControls : z15;
        AtomActionDTO atomActionDTO2 = (i11 & 4194304) != 0 ? reviewGalleryVO.contentViewAction : atomActionDTO;
        OnBackConfigVO onBackConfigVO2 = (i11 & 8388608) != 0 ? reviewGalleryVO.onBackConfig : onBackConfigVO;
        Map map6 = (i11 & 16777216) != 0 ? reviewGalleryVO.trackingInfo : map;
        Map map7 = (i11 & 33554432) != 0 ? reviewGalleryVO.prevTrackingInfo : map2;
        if ((i11 & 67108864) != 0) {
            map5 = map7;
            map4 = reviewGalleryVO.nextTrackingInfo;
        } else {
            map4 = map3;
            map5 = map7;
        }
        return reviewGalleryVO.copy(j13, str2, contentWrapper2, sideButtonsVO2, socialIconButtonDTO2, reviewsRightPanelDTO2, z16, reviewUser2, socialUser2, productRatingDTO2, badgeDTO2, reviewProductTileDTO2, productItemsContainerDTO2, commentFooterDTO2, commentButtonFooterDTO2, itemsContainerDTO4, itemsContainerDTO5, itemsContainerDTO6, z17, z18, z19, z21, atomActionDTO2, onBackConfigVO2, map6, map5, map4);
    }

    @NotNull
    public final ReviewGalleryVO copy(long id2, @NotNull String reviewUuid, @NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper content, SideButtonsVO sideButtonsHeader, SocialIconButtonDTO closeButton, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel, boolean hasAudio, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser user, ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO rating, BadgeDTO badge, ReviewProductTileDTO product, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainer, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooter, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooter, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO topMediaItems, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomMediaItems, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomItems, boolean withContainers, boolean isFillMode, boolean isVideo, boolean isCompactControls, AtomActionDTO contentViewAction, OnBackConfigVO onBackConfig, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> prevTrackingInfo, Map<String, TokenizedTrackingInfo> nextTrackingInfo) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ReviewGalleryVO(id2, reviewUuid, content, sideButtonsHeader, closeButton, rightPanel, hasAudio, user, socialUser, rating, badge, product, productItemsContainer, commentFooter, commentButtonFooter, topMediaItems, bottomMediaItems, bottomItems, withContainers, isFillMode, isVideo, isCompactControls, contentViewAction, onBackConfig, trackingInfo, prevTrackingInfo, nextTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryVO)) {
            return false;
        }
        ReviewGalleryVO reviewGalleryVO = (ReviewGalleryVO) other;
        return this.id == reviewGalleryVO.id && Intrinsics.d(this.reviewUuid, reviewGalleryVO.reviewUuid) && Intrinsics.d(this.content, reviewGalleryVO.content) && Intrinsics.d(this.sideButtonsHeader, reviewGalleryVO.sideButtonsHeader) && Intrinsics.d(this.closeButton, reviewGalleryVO.closeButton) && Intrinsics.d(this.rightPanel, reviewGalleryVO.rightPanel) && this.hasAudio == reviewGalleryVO.hasAudio && Intrinsics.d(this.user, reviewGalleryVO.user) && Intrinsics.d(this.socialUser, reviewGalleryVO.socialUser) && Intrinsics.d(this.rating, reviewGalleryVO.rating) && Intrinsics.d(this.badge, reviewGalleryVO.badge) && Intrinsics.d(this.product, reviewGalleryVO.product) && Intrinsics.d(this.productItemsContainer, reviewGalleryVO.productItemsContainer) && Intrinsics.d(this.commentFooter, reviewGalleryVO.commentFooter) && Intrinsics.d(this.commentButtonFooter, reviewGalleryVO.commentButtonFooter) && Intrinsics.d(this.topMediaItems, reviewGalleryVO.topMediaItems) && Intrinsics.d(this.bottomMediaItems, reviewGalleryVO.bottomMediaItems) && Intrinsics.d(this.bottomItems, reviewGalleryVO.bottomItems) && this.withContainers == reviewGalleryVO.withContainers && this.isFillMode == reviewGalleryVO.isFillMode && this.isVideo == reviewGalleryVO.isVideo && this.isCompactControls == reviewGalleryVO.isCompactControls && Intrinsics.d(this.contentViewAction, reviewGalleryVO.contentViewAction) && Intrinsics.d(this.onBackConfig, reviewGalleryVO.onBackConfig) && Intrinsics.d(this.trackingInfo, reviewGalleryVO.trackingInfo) && Intrinsics.d(this.prevTrackingInfo, reviewGalleryVO.prevTrackingInfo) && Intrinsics.d(this.nextTrackingInfo, reviewGalleryVO.nextTrackingInfo);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO getBottomItems() {
        return this.bottomItems;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO getBottomMediaItems() {
        return this.bottomMediaItems;
    }

    public final SocialIconButtonDTO getCloseButton() {
        return this.closeButton;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO getCommentButtonFooter() {
        return this.commentButtonFooter;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO getCommentFooter() {
        return this.commentFooter;
    }

    @NotNull
    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper getContent() {
        return this.content;
    }

    public final AtomActionDTO getContentViewAction() {
        return this.contentViewAction;
    }

    public final boolean getHasAudio() {
        return this.hasAudio;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Map<String, TokenizedTrackingInfo> getNextTrackingInfo() {
        return this.nextTrackingInfo;
    }

    public final OnBackConfigVO getOnBackConfig() {
        return this.onBackConfig;
    }

    public final Map<String, TokenizedTrackingInfo> getPrevTrackingInfo() {
        return this.prevTrackingInfo;
    }

    public final ReviewProductTileDTO getProduct() {
        return this.product;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO getProductItemsContainer() {
        return this.productItemsContainer;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO getRating() {
        return this.rating;
    }

    @NotNull
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO getRightPanel() {
        return this.rightPanel;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SideButtonsVO getSideButtonsHeader() {
        return this.sideButtonsHeader;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser getSocialUser() {
        return this.socialUser;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO getTopMediaItems() {
        return this.topMediaItems;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser getUser() {
        return this.user;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final boolean getWithContainers() {
        return this.withContainers;
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.reviewUuid)) * 31;
        SideButtonsVO sideButtonsVO = this.sideButtonsHeader;
        int hashCode2 = (hashCode + (sideButtonsVO == null ? 0 : sideButtonsVO.hashCode())) * 31;
        SocialIconButtonDTO socialIconButtonDTO = this.closeButton;
        int hashCode3 = (hashCode2 + (socialIconButtonDTO == null ? 0 : socialIconButtonDTO.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO = this.rightPanel;
        int a11 = C3532b.a((hashCode3 + (reviewsRightPanelDTO == null ? 0 : reviewsRightPanelDTO.hashCode())) * 31, 31, this.hasAudio);
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser reviewUser = this.user;
        int hashCode4 = (a11 + (reviewUser == null ? 0 : reviewUser.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser = this.socialUser;
        int hashCode5 = (hashCode4 + (socialUser == null ? 0 : socialUser.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO = this.rating;
        int hashCode6 = (hashCode5 + (productRatingDTO == null ? 0 : productRatingDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode7 = (hashCode6 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        ReviewProductTileDTO reviewProductTileDTO = this.product;
        int hashCode8 = (hashCode7 + (reviewProductTileDTO == null ? 0 : reviewProductTileDTO.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainerDTO = this.productItemsContainer;
        int hashCode9 = (hashCode8 + (productItemsContainerDTO == null ? 0 : productItemsContainerDTO.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooterDTO = this.commentFooter;
        int hashCode10 = (hashCode9 + (commentFooterDTO == null ? 0 : commentFooterDTO.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooterDTO = this.commentButtonFooter;
        int hashCode11 = (hashCode10 + (commentButtonFooterDTO == null ? 0 : commentButtonFooterDTO.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO = this.topMediaItems;
        int hashCode12 = (hashCode11 + (itemsContainerDTO == null ? 0 : itemsContainerDTO.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO2 = this.bottomMediaItems;
        int hashCode13 = (hashCode12 + (itemsContainerDTO2 == null ? 0 : itemsContainerDTO2.hashCode())) * 31;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO3 = this.bottomItems;
        int a12 = C3532b.a(C3532b.a(C3532b.a(C3532b.a((hashCode13 + (itemsContainerDTO3 == null ? 0 : itemsContainerDTO3.hashCode())) * 31, 31, this.withContainers), 31, this.isFillMode), 31, this.isVideo), 31, this.isCompactControls);
        AtomActionDTO atomActionDTO = this.contentViewAction;
        int hashCode14 = (a12 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        OnBackConfigVO onBackConfigVO = this.onBackConfig;
        int hashCode15 = (hashCode14 + (onBackConfigVO == null ? 0 : onBackConfigVO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode16 = (hashCode15 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.prevTrackingInfo;
        int hashCode17 = (hashCode16 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.nextTrackingInfo;
        return hashCode17 + (map3 != null ? map3.hashCode() : 0);
    }

    /* renamed from: isCompactControls, reason: from getter */
    public final boolean getIsCompactControls() {
        return this.isCompactControls;
    }

    /* renamed from: isFillMode, reason: from getter */
    public final boolean getIsFillMode() {
        return this.isFillMode;
    }

    /* renamed from: isVideo, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.reviewUuid;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper contentWrapper = this.content;
        SideButtonsVO sideButtonsVO = this.sideButtonsHeader;
        SocialIconButtonDTO socialIconButtonDTO = this.closeButton;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO = this.rightPanel;
        boolean z11 = this.hasAudio;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser reviewUser = this.user;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser = this.socialUser;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO = this.rating;
        BadgeDTO badgeDTO = this.badge;
        ReviewProductTileDTO reviewProductTileDTO = this.product;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainerDTO = this.productItemsContainer;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooterDTO = this.commentFooter;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooterDTO = this.commentButtonFooter;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO = this.topMediaItems;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO2 = this.bottomMediaItems;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO3 = this.bottomItems;
        boolean z12 = this.withContainers;
        boolean z13 = this.isFillMode;
        boolean z14 = this.isVideo;
        boolean z15 = this.isCompactControls;
        AtomActionDTO atomActionDTO = this.contentViewAction;
        OnBackConfigVO onBackConfigVO = this.onBackConfig;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.prevTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.nextTrackingInfo;
        StringBuilder c11 = C2436a.c(j11, "ReviewGalleryVO(id=", ", reviewUuid=", str);
        c11.append(", content=");
        c11.append(contentWrapper);
        c11.append(", sideButtonsHeader=");
        c11.append(sideButtonsVO);
        c11.append(", closeButton=");
        c11.append(socialIconButtonDTO);
        c11.append(", rightPanel=");
        c11.append(reviewsRightPanelDTO);
        c11.append(", hasAudio=");
        c11.append(z11);
        c11.append(", user=");
        c11.append(reviewUser);
        c11.append(", socialUser=");
        c11.append(socialUser);
        c11.append(", rating=");
        c11.append(productRatingDTO);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(", product=");
        c11.append(reviewProductTileDTO);
        c11.append(", productItemsContainer=");
        c11.append(productItemsContainerDTO);
        c11.append(", commentFooter=");
        c11.append(commentFooterDTO);
        c11.append(", commentButtonFooter=");
        c11.append(commentButtonFooterDTO);
        c11.append(", topMediaItems=");
        c11.append(itemsContainerDTO);
        c11.append(", bottomMediaItems=");
        c11.append(itemsContainerDTO2);
        c11.append(", bottomItems=");
        c11.append(itemsContainerDTO3);
        C2436a.e(", withContainers=", ", isFillMode=", c11, z12, z13);
        C2436a.e(", isVideo=", ", isCompactControls=", c11, z14, z15);
        c11.append(", contentViewAction=");
        c11.append(atomActionDTO);
        c11.append(", onBackConfig=");
        c11.append(onBackConfigVO);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(", prevTrackingInfo=");
        c11.append(map2);
        return C2639a.b(c11, ", nextTrackingInfo=", map3, ")");
    }
}
