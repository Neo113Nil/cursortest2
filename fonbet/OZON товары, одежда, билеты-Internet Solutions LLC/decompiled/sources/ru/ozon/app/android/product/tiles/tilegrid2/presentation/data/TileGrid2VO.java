package ru.ozon.app.android.product.tiles.tilegrid2.presentation.data;

import Ak.C2436a;
import B0.A0;
import B0.C2454a;
import De.C2860c;
import G.g;
import Kk.C3532b;
import Pk0.b;
import Xc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bX\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B¹\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010&\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00107\u001a\u00020\u001f\u0012\u0006\u00108\u001a\u00020\u001f¢\u0006\u0004\b9\u0010:J\u0080\u0003\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u001f2\b\b\u0002\u00108\u001a\u00020\u001fHÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020$HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u001f2\b\u0010A\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010>R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bI\u0010>R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bP\u0010OR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bT\u0010SR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bV\u0010WR%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\b^\u0010>R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010G\u001a\u0004\bb\u0010>R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010G\u001a\u0004\bc\u0010>R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010d\u001a\u0004\be\u0010fR\u0017\u0010!\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010d\u001a\u0004\b!\u0010fR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010j\u001a\u0004\bk\u0010@R\u001a\u0010&\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010j\u001a\u0004\bl\u0010@R\u0019\u0010'\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b'\u0010U\u001a\u0004\bm\u0010WR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010n\u001a\u0004\bo\u0010pR\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010q\u001a\u0004\br\u0010sR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010D\u001a\u0004\bt\u0010FR\u0019\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010u\u001a\u0004\bv\u0010wR\u0019\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\f\n\u0004\b0\u0010x\u001a\u0004\by\u0010zR\u0019\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\b2\u0010{\u001a\u0004\b|\u0010}R\u001a\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\r\n\u0004\b4\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u00106\u001a\u0002058\u0006¢\u0006\u000f\n\u0005\b6\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u00107\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b7\u0010d\u001a\u0004\b7\u0010fR\u0018\u00108\u001a\u00020\u001f8\u0006¢\u0006\r\n\u0004\b8\u0010d\u001a\u0005\b\u0084\u0001\u0010fR(\u0010\u0085\u0001\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010j\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008d\u0001"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/BackgroundDecorated;", "", "id", "", "accesibilityTileID", "tileId", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "galleryModel", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "leftBottomBadge", "secondLeftBottomBadge", "", "", "topRightButtons", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "contentElements", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$BadgeOnboardingVO;", "badgeOnboarding", "brandLogo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "backgroundColor", "islandBackgroundColor", "", "badgesInCorner", "isSingleTopRight", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$ButtonMode;", "buttonMode", "", "index", "topMargin", "recShelfAction", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "wishlistKey", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "selectionKey", "tileWidgetId", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;", "kebab", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "ratingMolecule", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "countButton", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "isCheckboxTile", "topRightButtonsAnimationEnabled", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$BadgeOnboardingVO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$ButtonMode;IILru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;JLru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;Lru/ozon/app/android/product/common/TileThemeConfigVO;ZZ)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$BadgeOnboardingVO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$ButtonMode;IILru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;JLru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;Lru/ozon/app/android/product/common/TileThemeConfigVO;ZZ)Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAccesibilityTileID", "getTileId", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "getGalleryModel", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getLeftBottomBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSecondLeftBottomBadge", "Ljava/util/List;", "getTopRightButtons", "()Ljava/util/List;", "getContentElements", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$BadgeOnboardingVO;", "getBadgeOnboarding", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$BadgeOnboardingVO;", "getBrandLogo", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getBackgroundColor", "getIslandBackgroundColor", "Z", "getBadgesInCorner", "()Z", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$ButtonMode;", "getButtonMode", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$ButtonMode;", "I", "getIndex", "getTopMargin", "getRecShelfAction", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "getWishlistKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "getSelectionKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "getTileWidgetId", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;", "getKebab", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "getOverlayItem", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "getRatingMolecule", "()Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "getCountButton", "()Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTheme", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTopRightButtonsAnimationEnabled", "scrollWidgetKey", "getScrollWidgetKey", "()Ljava/lang/Integer;", "setScrollWidgetKey", "(I)V", "BadgeOnboardingVO", "ButtonMode", "Kebab", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileGrid2VO implements c, BackgroundDecorated {

    @NotNull
    private final String accesibilityTileID;
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final BadgeOnboardingVO badgeOnboarding;
    private final boolean badgesInCorner;
    private final String brandLogo;

    @NotNull
    private final ButtonMode buttonMode;

    @NotNull
    private final List<TileContentItem> contentElements;
    private final CountButtonVO countButton;

    @NotNull
    private final TileGrid2GalleryModel galleryModel;
    private final long id;
    private final int index;
    private final boolean isCheckboxTile;
    private final boolean isSingleTopRight;
    private final String islandBackgroundColor;
    private final Kebab kebab;
    private final BadgeDTO leftBottomBadge;
    private final TileGrid2DTO.OverlayItem overlayItem;
    private final UgcRatingMolecule ratingMolecule;
    private final AtomActionDTO recShelfAction;
    private int scrollWidgetKey;
    private final BadgeDTO secondLeftBottomBadge;
    private final SelectionProductsTileKey selectionKey;
    private final TestInfo testInfo;

    @NotNull
    private final TileThemeConfigVO theme;

    @NotNull
    private final String tileId;
    private final long tileWidgetId;
    private final int topMargin;
    private final List<Object> topRightButtons;
    private final boolean topRightButtonsAnimationEnabled;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final WishlistTileKey wishlistKey;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$BadgeOnboardingVO;", "", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "onboarding", "", "onboardingKey", "", "badgeCornerRadius", "backgroundCornerRadius", "", "backgroundPadding", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;Ljava/lang/String;FFI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "getOnboarding", "()Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "Ljava/lang/String;", "getOnboardingKey", "F", "getBadgeCornerRadius", "()F", "getBackgroundCornerRadius", "I", "getBackgroundPadding", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class BadgeOnboardingVO {
        private final float backgroundCornerRadius;
        private final int backgroundPadding;
        private final float badgeCornerRadius;

        @NotNull
        private final OnboardingModel onboarding;

        @NotNull
        private final String onboardingKey;

        public BadgeOnboardingVO(@NotNull OnboardingModel onboarding, @NotNull String onboardingKey, float f7, float f11, int i11) {
            Intrinsics.checkNotNullParameter(onboarding, "onboarding");
            Intrinsics.checkNotNullParameter(onboardingKey, "onboardingKey");
            this.onboarding = onboarding;
            this.onboardingKey = onboardingKey;
            this.badgeCornerRadius = f7;
            this.backgroundCornerRadius = f11;
            this.backgroundPadding = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeOnboardingVO)) {
                return false;
            }
            BadgeOnboardingVO badgeOnboardingVO = (BadgeOnboardingVO) other;
            return Intrinsics.d(this.onboarding, badgeOnboardingVO.onboarding) && Intrinsics.d(this.onboardingKey, badgeOnboardingVO.onboardingKey) && Float.compare(this.badgeCornerRadius, badgeOnboardingVO.badgeCornerRadius) == 0 && Float.compare(this.backgroundCornerRadius, badgeOnboardingVO.backgroundCornerRadius) == 0 && this.backgroundPadding == badgeOnboardingVO.backgroundPadding;
        }

        public final float getBackgroundCornerRadius() {
            return this.backgroundCornerRadius;
        }

        public final int getBackgroundPadding() {
            return this.backgroundPadding;
        }

        public final float getBadgeCornerRadius() {
            return this.badgeCornerRadius;
        }

        @NotNull
        public final OnboardingModel getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final String getOnboardingKey() {
            return this.onboardingKey;
        }

        public int hashCode() {
            return Integer.hashCode(this.backgroundPadding) + b.a(this.backgroundCornerRadius, b.a(this.badgeCornerRadius, g.a(this.onboarding.hashCode() * 31, 31, this.onboardingKey), 31), 31);
        }

        @NotNull
        public String toString() {
            OnboardingModel onboardingModel = this.onboarding;
            String str = this.onboardingKey;
            float f7 = this.badgeCornerRadius;
            float f11 = this.backgroundCornerRadius;
            int i11 = this.backgroundPadding;
            StringBuilder sb2 = new StringBuilder("BadgeOnboardingVO(onboarding=");
            sb2.append(onboardingModel);
            sb2.append(", onboardingKey=");
            sb2.append(str);
            sb2.append(", badgeCornerRadius=");
            sb2.append(f7);
            sb2.append(", backgroundCornerRadius=");
            sb2.append(f11);
            sb2.append(", backgroundPadding=");
            return K00.b.e(i11, ")", sb2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$ButtonMode;", "", "count", "", "<init>", "(Ljava/lang/String;II)V", "getCount", "()I", "NONE", "SINGLE", "DOUBLE", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonMode[] $VALUES;
        private final int count;
        public static final ButtonMode NONE = new ButtonMode("NONE", 0, 0);
        public static final ButtonMode SINGLE = new ButtonMode("SINGLE", 1, 1);
        public static final ButtonMode DOUBLE = new ButtonMode("DOUBLE", 2, 2);

        private static final /* synthetic */ ButtonMode[] $values() {
            return new ButtonMode[]{NONE, SINGLE, DOUBLE};
        }

        static {
            ButtonMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ButtonMode(String str, int i11, int i12) {
            this.count = i12;
        }

        public static ButtonMode valueOf(String str) {
            return (ButtonMode) Enum.valueOf(ButtonMode.class, str);
        }

        public static ButtonMode[] values() {
            return (ButtonMode[]) $VALUES.clone();
        }

        public final int getCount() {
            return this.count;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;", "", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Kebab {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final CommonAtomIconDTO icon;

        public Kebab(@NotNull CommonAtomIconDTO icon, @NotNull AtomAction action) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Kebab)) {
                return false;
            }
            Kebab kebab = (Kebab) other;
            return Intrinsics.d(this.icon, kebab.icon) && Intrinsics.d(this.action, kebab.action);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Kebab(icon=" + this.icon + ", action=" + this.action + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TileGrid2VO(long j11, @NotNull String accesibilityTileID, @NotNull String tileId, @NotNull TileGrid2GalleryModel galleryModel, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, List<? extends Object> list, @NotNull List<? extends TileContentItem> contentElements, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, BadgeOnboardingVO badgeOnboardingVO, String str, TestInfo testInfo, String str2, String str3, boolean z11, boolean z12, @NotNull ButtonMode buttonMode, int i11, int i12, AtomActionDTO atomActionDTO2, WishlistTileKey wishlistTileKey, SelectionProductsTileKey selectionProductsTileKey, long j12, Kebab kebab, TileGrid2DTO.OverlayItem overlayItem, UgcRatingMolecule ugcRatingMolecule, CountButtonVO countButtonVO, @NotNull TileThemeConfigVO theme, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(accesibilityTileID, "accesibilityTileID");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        Intrinsics.checkNotNullParameter(galleryModel, "galleryModel");
        Intrinsics.checkNotNullParameter(contentElements, "contentElements");
        Intrinsics.checkNotNullParameter(buttonMode, "buttonMode");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.id = j11;
        this.accesibilityTileID = accesibilityTileID;
        this.tileId = tileId;
        this.galleryModel = galleryModel;
        this.leftBottomBadge = badgeDTO;
        this.secondLeftBottomBadge = badgeDTO2;
        this.topRightButtons = list;
        this.contentElements = contentElements;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.badgeOnboarding = badgeOnboardingVO;
        this.brandLogo = str;
        this.testInfo = testInfo;
        this.backgroundColor = str2;
        this.islandBackgroundColor = str3;
        this.badgesInCorner = z11;
        this.isSingleTopRight = z12;
        this.buttonMode = buttonMode;
        this.index = i11;
        this.topMargin = i12;
        this.recShelfAction = atomActionDTO2;
        this.wishlistKey = wishlistTileKey;
        this.selectionKey = selectionProductsTileKey;
        this.tileWidgetId = j12;
        this.kebab = kebab;
        this.overlayItem = overlayItem;
        this.ratingMolecule = ugcRatingMolecule;
        this.countButton = countButtonVO;
        this.theme = theme;
        this.isCheckboxTile = z13;
        this.topRightButtonsAnimationEnabled = z14;
    }

    public static /* synthetic */ TileGrid2VO copy$default(TileGrid2VO tileGrid2VO, long j11, String str, String str2, TileGrid2GalleryModel tileGrid2GalleryModel, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, List list, List list2, AtomActionDTO atomActionDTO, Map map, BadgeOnboardingVO badgeOnboardingVO, String str3, TestInfo testInfo, String str4, String str5, boolean z11, boolean z12, ButtonMode buttonMode, int i11, int i12, AtomActionDTO atomActionDTO2, WishlistTileKey wishlistTileKey, SelectionProductsTileKey selectionProductsTileKey, long j12, Kebab kebab, TileGrid2DTO.OverlayItem overlayItem, UgcRatingMolecule ugcRatingMolecule, CountButtonVO countButtonVO, TileThemeConfigVO tileThemeConfigVO, boolean z13, boolean z14, int i13, Object obj) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ButtonMode buttonMode2;
        int i14;
        int i15;
        AtomActionDTO atomActionDTO3;
        WishlistTileKey wishlistTileKey2;
        String str6;
        SelectionProductsTileKey selectionProductsTileKey2;
        long j13;
        Kebab kebab2;
        UgcRatingMolecule ugcRatingMolecule2;
        CountButtonVO countButtonVO2;
        TileThemeConfigVO tileThemeConfigVO2;
        TileGrid2VO tileGrid2VO2;
        TileGrid2DTO.OverlayItem overlayItem2;
        String str7;
        String str8;
        String str9;
        TileGrid2GalleryModel tileGrid2GalleryModel2;
        BadgeDTO badgeDTO3;
        BadgeDTO badgeDTO4;
        List list3;
        List list4;
        AtomActionDTO atomActionDTO4;
        Map map2;
        BadgeOnboardingVO badgeOnboardingVO2;
        String str10;
        TestInfo testInfo2;
        long j14;
        long j15 = (i13 & 1) != 0 ? tileGrid2VO.id : j11;
        String str11 = (i13 & 2) != 0 ? tileGrid2VO.accesibilityTileID : str;
        String str12 = (i13 & 4) != 0 ? tileGrid2VO.tileId : str2;
        TileGrid2GalleryModel tileGrid2GalleryModel3 = (i13 & 8) != 0 ? tileGrid2VO.galleryModel : tileGrid2GalleryModel;
        BadgeDTO badgeDTO5 = (i13 & 16) != 0 ? tileGrid2VO.leftBottomBadge : badgeDTO;
        BadgeDTO badgeDTO6 = (i13 & 32) != 0 ? tileGrid2VO.secondLeftBottomBadge : badgeDTO2;
        List list5 = (i13 & 64) != 0 ? tileGrid2VO.topRightButtons : list;
        List list6 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tileGrid2VO.contentElements : list2;
        AtomActionDTO atomActionDTO5 = (i13 & 256) != 0 ? tileGrid2VO.action : atomActionDTO;
        Map map3 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tileGrid2VO.trackingInfo : map;
        BadgeOnboardingVO badgeOnboardingVO3 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tileGrid2VO.badgeOnboarding : badgeOnboardingVO;
        String str13 = (i13 & 2048) != 0 ? tileGrid2VO.brandLogo : str3;
        TestInfo testInfo3 = (i13 & 4096) != 0 ? tileGrid2VO.testInfo : testInfo;
        long j16 = j15;
        String str14 = (i13 & 8192) != 0 ? tileGrid2VO.backgroundColor : str4;
        String str15 = (i13 & 16384) != 0 ? tileGrid2VO.islandBackgroundColor : str5;
        boolean z19 = (i13 & 32768) != 0 ? tileGrid2VO.badgesInCorner : z11;
        boolean z21 = (i13 & 65536) != 0 ? tileGrid2VO.isSingleTopRight : z12;
        ButtonMode buttonMode3 = (i13 & 131072) != 0 ? tileGrid2VO.buttonMode : buttonMode;
        int i16 = (i13 & 262144) != 0 ? tileGrid2VO.index : i11;
        int i17 = (i13 & 524288) != 0 ? tileGrid2VO.topMargin : i12;
        AtomActionDTO atomActionDTO6 = (i13 & 1048576) != 0 ? tileGrid2VO.recShelfAction : atomActionDTO2;
        WishlistTileKey wishlistTileKey3 = (i13 & 2097152) != 0 ? tileGrid2VO.wishlistKey : wishlistTileKey;
        SelectionProductsTileKey selectionProductsTileKey3 = (i13 & 4194304) != 0 ? tileGrid2VO.selectionKey : selectionProductsTileKey;
        String str16 = str14;
        long j17 = (i13 & 8388608) != 0 ? tileGrid2VO.tileWidgetId : j12;
        Kebab kebab3 = (i13 & 16777216) != 0 ? tileGrid2VO.kebab : kebab;
        TileGrid2DTO.OverlayItem overlayItem3 = (i13 & 33554432) != 0 ? tileGrid2VO.overlayItem : overlayItem;
        Kebab kebab4 = kebab3;
        UgcRatingMolecule ugcRatingMolecule3 = (i13 & 67108864) != 0 ? tileGrid2VO.ratingMolecule : ugcRatingMolecule;
        CountButtonVO countButtonVO3 = (i13 & 134217728) != 0 ? tileGrid2VO.countButton : countButtonVO;
        TileThemeConfigVO tileThemeConfigVO3 = (i13 & 268435456) != 0 ? tileGrid2VO.theme : tileThemeConfigVO;
        boolean z22 = (i13 & 536870912) != 0 ? tileGrid2VO.isCheckboxTile : z13;
        if ((i13 & 1073741824) != 0) {
            z16 = z22;
            z15 = tileGrid2VO.topRightButtonsAnimationEnabled;
            z17 = z19;
            z18 = z21;
            buttonMode2 = buttonMode3;
            i14 = i16;
            i15 = i17;
            atomActionDTO3 = atomActionDTO6;
            wishlistTileKey2 = wishlistTileKey3;
            selectionProductsTileKey2 = selectionProductsTileKey3;
            j13 = j17;
            kebab2 = kebab4;
            ugcRatingMolecule2 = ugcRatingMolecule3;
            countButtonVO2 = countButtonVO3;
            tileThemeConfigVO2 = tileThemeConfigVO3;
            tileGrid2VO2 = tileGrid2VO;
            overlayItem2 = overlayItem3;
            str7 = str15;
            str8 = str11;
            str9 = str12;
            tileGrid2GalleryModel2 = tileGrid2GalleryModel3;
            badgeDTO3 = badgeDTO5;
            list3 = list5;
            list4 = list6;
            atomActionDTO4 = atomActionDTO5;
            map2 = map3;
            badgeOnboardingVO2 = badgeOnboardingVO3;
            str10 = str13;
            testInfo2 = testInfo3;
            j14 = j16;
            str6 = str16;
            badgeDTO4 = badgeDTO6;
        } else {
            z15 = z14;
            z16 = z22;
            z17 = z19;
            z18 = z21;
            buttonMode2 = buttonMode3;
            i14 = i16;
            i15 = i17;
            atomActionDTO3 = atomActionDTO6;
            wishlistTileKey2 = wishlistTileKey3;
            str6 = str16;
            selectionProductsTileKey2 = selectionProductsTileKey3;
            j13 = j17;
            kebab2 = kebab4;
            ugcRatingMolecule2 = ugcRatingMolecule3;
            countButtonVO2 = countButtonVO3;
            tileThemeConfigVO2 = tileThemeConfigVO3;
            tileGrid2VO2 = tileGrid2VO;
            overlayItem2 = overlayItem3;
            str7 = str15;
            str8 = str11;
            str9 = str12;
            tileGrid2GalleryModel2 = tileGrid2GalleryModel3;
            badgeDTO3 = badgeDTO5;
            badgeDTO4 = badgeDTO6;
            list3 = list5;
            list4 = list6;
            atomActionDTO4 = atomActionDTO5;
            map2 = map3;
            badgeOnboardingVO2 = badgeOnboardingVO3;
            str10 = str13;
            testInfo2 = testInfo3;
            j14 = j16;
        }
        return tileGrid2VO2.copy(j14, str8, str9, tileGrid2GalleryModel2, badgeDTO3, badgeDTO4, list3, list4, atomActionDTO4, map2, badgeOnboardingVO2, str10, testInfo2, str6, str7, z17, z18, buttonMode2, i14, i15, atomActionDTO3, wishlistTileKey2, selectionProductsTileKey2, j13, kebab2, overlayItem2, ugcRatingMolecule2, countButtonVO2, tileThemeConfigVO2, z16, z15);
    }

    @NotNull
    public final TileGrid2VO copy(long id2, @NotNull String accesibilityTileID, @NotNull String tileId, @NotNull TileGrid2GalleryModel galleryModel, BadgeDTO leftBottomBadge, BadgeDTO secondLeftBottomBadge, List<? extends Object> topRightButtons, @NotNull List<? extends TileContentItem> contentElements, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, BadgeOnboardingVO badgeOnboarding, String brandLogo, TestInfo testInfo, String backgroundColor, String islandBackgroundColor, boolean badgesInCorner, boolean isSingleTopRight, @NotNull ButtonMode buttonMode, int index, int topMargin, AtomActionDTO recShelfAction, WishlistTileKey wishlistKey, SelectionProductsTileKey selectionKey, long tileWidgetId, Kebab kebab, TileGrid2DTO.OverlayItem overlayItem, UgcRatingMolecule ratingMolecule, CountButtonVO countButton, @NotNull TileThemeConfigVO theme, boolean isCheckboxTile, boolean topRightButtonsAnimationEnabled) {
        Intrinsics.checkNotNullParameter(accesibilityTileID, "accesibilityTileID");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        Intrinsics.checkNotNullParameter(galleryModel, "galleryModel");
        Intrinsics.checkNotNullParameter(contentElements, "contentElements");
        Intrinsics.checkNotNullParameter(buttonMode, "buttonMode");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new TileGrid2VO(id2, accesibilityTileID, tileId, galleryModel, leftBottomBadge, secondLeftBottomBadge, topRightButtons, contentElements, action, trackingInfo, badgeOnboarding, brandLogo, testInfo, backgroundColor, islandBackgroundColor, badgesInCorner, isSingleTopRight, buttonMode, index, topMargin, recShelfAction, wishlistKey, selectionKey, tileWidgetId, kebab, overlayItem, ratingMolecule, countButton, theme, isCheckboxTile, topRightButtonsAnimationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileGrid2VO)) {
            return false;
        }
        TileGrid2VO tileGrid2VO = (TileGrid2VO) other;
        return this.id == tileGrid2VO.id && Intrinsics.d(this.accesibilityTileID, tileGrid2VO.accesibilityTileID) && Intrinsics.d(this.tileId, tileGrid2VO.tileId) && Intrinsics.d(this.galleryModel, tileGrid2VO.galleryModel) && Intrinsics.d(this.leftBottomBadge, tileGrid2VO.leftBottomBadge) && Intrinsics.d(this.secondLeftBottomBadge, tileGrid2VO.secondLeftBottomBadge) && Intrinsics.d(this.topRightButtons, tileGrid2VO.topRightButtons) && Intrinsics.d(this.contentElements, tileGrid2VO.contentElements) && Intrinsics.d(this.action, tileGrid2VO.action) && Intrinsics.d(this.trackingInfo, tileGrid2VO.trackingInfo) && Intrinsics.d(this.badgeOnboarding, tileGrid2VO.badgeOnboarding) && Intrinsics.d(this.brandLogo, tileGrid2VO.brandLogo) && Intrinsics.d(this.testInfo, tileGrid2VO.testInfo) && Intrinsics.d(this.backgroundColor, tileGrid2VO.backgroundColor) && Intrinsics.d(this.islandBackgroundColor, tileGrid2VO.islandBackgroundColor) && this.badgesInCorner == tileGrid2VO.badgesInCorner && this.isSingleTopRight == tileGrid2VO.isSingleTopRight && this.buttonMode == tileGrid2VO.buttonMode && this.index == tileGrid2VO.index && this.topMargin == tileGrid2VO.topMargin && Intrinsics.d(this.recShelfAction, tileGrid2VO.recShelfAction) && Intrinsics.d(this.wishlistKey, tileGrid2VO.wishlistKey) && Intrinsics.d(this.selectionKey, tileGrid2VO.selectionKey) && this.tileWidgetId == tileGrid2VO.tileWidgetId && Intrinsics.d(this.kebab, tileGrid2VO.kebab) && Intrinsics.d(this.overlayItem, tileGrid2VO.overlayItem) && Intrinsics.d(this.ratingMolecule, tileGrid2VO.ratingMolecule) && Intrinsics.d(this.countButton, tileGrid2VO.countButton) && Intrinsics.d(this.theme, tileGrid2VO.theme) && this.isCheckboxTile == tileGrid2VO.isCheckboxTile && this.topRightButtonsAnimationEnabled == tileGrid2VO.topRightButtonsAnimationEnabled;
    }

    @NotNull
    public final String getAccesibilityTileID() {
        return this.accesibilityTileID;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.BackgroundDecorated
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeOnboardingVO getBadgeOnboarding() {
        return this.badgeOnboarding;
    }

    public final boolean getBadgesInCorner() {
        return this.badgesInCorner;
    }

    public final String getBrandLogo() {
        return this.brandLogo;
    }

    @NotNull
    public final ButtonMode getButtonMode() {
        return this.buttonMode;
    }

    @NotNull
    public final List<TileContentItem> getContentElements() {
        return this.contentElements;
    }

    public final CountButtonVO getCountButton() {
        return this.countButton;
    }

    @NotNull
    public final TileGrid2GalleryModel getGalleryModel() {
        return this.galleryModel;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.BackgroundDecorated
    public int getIndex() {
        return this.index;
    }

    public final String getIslandBackgroundColor() {
        return this.islandBackgroundColor;
    }

    public final Kebab getKebab() {
        return this.kebab;
    }

    public final BadgeDTO getLeftBottomBadge() {
        return this.leftBottomBadge;
    }

    public final TileGrid2DTO.OverlayItem getOverlayItem() {
        return this.overlayItem;
    }

    public final UgcRatingMolecule getRatingMolecule() {
        return this.ratingMolecule;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    public final BadgeDTO getSecondLeftBottomBadge() {
        return this.secondLeftBottomBadge;
    }

    public final SelectionProductsTileKey getSelectionKey() {
        return this.selectionKey;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TileThemeConfigVO getTheme() {
        return this.theme;
    }

    @NotNull
    public final String getTileId() {
        return this.tileId;
    }

    public final long getTileWidgetId() {
        return this.tileWidgetId;
    }

    @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.BackgroundDecorated
    public int getTopMargin() {
        return this.topMargin;
    }

    public final List<Object> getTopRightButtons() {
        return this.topRightButtons;
    }

    public final boolean getTopRightButtonsAnimationEnabled() {
        return this.topRightButtonsAnimationEnabled;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final WishlistTileKey getWishlistKey() {
        return this.wishlistKey;
    }

    public int hashCode() {
        int hashCode = (this.galleryModel.hashCode() + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.accesibilityTileID), 31, this.tileId)) * 31;
        BadgeDTO badgeDTO = this.leftBottomBadge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.secondLeftBottomBadge;
        int hashCode3 = (hashCode2 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        List<Object> list = this.topRightButtons;
        int b11 = g.b((hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.contentElements);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        BadgeOnboardingVO badgeOnboardingVO = this.badgeOnboarding;
        int hashCode6 = (hashCode5 + (badgeOnboardingVO == null ? 0 : badgeOnboardingVO.hashCode())) * 31;
        String str = this.brandLogo;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode8 = (hashCode7 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.islandBackgroundColor;
        int a11 = C2454a.a(this.topMargin, C2454a.a(this.index, (this.buttonMode.hashCode() + C3532b.a(C3532b.a((hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.badgesInCorner), 31, this.isSingleTopRight)) * 31, 31), 31);
        AtomActionDTO atomActionDTO2 = this.recShelfAction;
        int hashCode10 = (a11 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        WishlistTileKey wishlistTileKey = this.wishlistKey;
        int hashCode11 = (hashCode10 + (wishlistTileKey == null ? 0 : wishlistTileKey.hashCode())) * 31;
        SelectionProductsTileKey selectionProductsTileKey = this.selectionKey;
        int a12 = Pk0.c.a((hashCode11 + (selectionProductsTileKey == null ? 0 : selectionProductsTileKey.hashCode())) * 31, 31, this.tileWidgetId);
        Kebab kebab = this.kebab;
        int hashCode12 = (a12 + (kebab == null ? 0 : kebab.hashCode())) * 31;
        TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
        int hashCode13 = (hashCode12 + (overlayItem == null ? 0 : overlayItem.hashCode())) * 31;
        UgcRatingMolecule ugcRatingMolecule = this.ratingMolecule;
        int hashCode14 = (hashCode13 + (ugcRatingMolecule == null ? 0 : ugcRatingMolecule.hashCode())) * 31;
        CountButtonVO countButtonVO = this.countButton;
        return Boolean.hashCode(this.topRightButtonsAnimationEnabled) + C3532b.a((this.theme.hashCode() + ((hashCode14 + (countButtonVO != null ? countButtonVO.hashCode() : 0)) * 31)) * 31, 31, this.isCheckboxTile);
    }

    /* renamed from: isCheckboxTile, reason: from getter */
    public final boolean getIsCheckboxTile() {
        return this.isCheckboxTile;
    }

    /* renamed from: isSingleTopRight, reason: from getter */
    public final boolean getIsSingleTopRight() {
        return this.isSingleTopRight;
    }

    public void setScrollWidgetKey(int i11) {
        this.scrollWidgetKey = i11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.accesibilityTileID;
        String str2 = this.tileId;
        TileGrid2GalleryModel tileGrid2GalleryModel = this.galleryModel;
        BadgeDTO badgeDTO = this.leftBottomBadge;
        BadgeDTO badgeDTO2 = this.secondLeftBottomBadge;
        List<Object> list = this.topRightButtons;
        List<TileContentItem> list2 = this.contentElements;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        BadgeOnboardingVO badgeOnboardingVO = this.badgeOnboarding;
        String str3 = this.brandLogo;
        TestInfo testInfo = this.testInfo;
        String str4 = this.backgroundColor;
        String str5 = this.islandBackgroundColor;
        boolean z11 = this.badgesInCorner;
        boolean z12 = this.isSingleTopRight;
        ButtonMode buttonMode = this.buttonMode;
        int i11 = this.index;
        int i12 = this.topMargin;
        AtomActionDTO atomActionDTO2 = this.recShelfAction;
        WishlistTileKey wishlistTileKey = this.wishlistKey;
        SelectionProductsTileKey selectionProductsTileKey = this.selectionKey;
        long j12 = this.tileWidgetId;
        Kebab kebab = this.kebab;
        TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
        UgcRatingMolecule ugcRatingMolecule = this.ratingMolecule;
        CountButtonVO countButtonVO = this.countButton;
        TileThemeConfigVO tileThemeConfigVO = this.theme;
        boolean z13 = this.isCheckboxTile;
        boolean z14 = this.topRightButtonsAnimationEnabled;
        StringBuilder c11 = C2436a.c(j11, "TileGrid2VO(id=", ", accesibilityTileID=", str);
        c11.append(", tileId=");
        c11.append(str2);
        c11.append(", galleryModel=");
        c11.append(tileGrid2GalleryModel);
        c11.append(", leftBottomBadge=");
        c11.append(badgeDTO);
        c11.append(", secondLeftBottomBadge=");
        c11.append(badgeDTO2);
        C2860c.g(", topRightButtons=", ", contentElements=", c11, list, list2);
        c11.append(", action=");
        c11.append(atomActionDTO);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(", badgeOnboarding=");
        c11.append(badgeOnboardingVO);
        c11.append(", brandLogo=");
        c11.append(str3);
        c11.append(", testInfo=");
        c11.append(testInfo);
        c11.append(", backgroundColor=");
        c11.append(str4);
        D40.a.g(", islandBackgroundColor=", str5, ", badgesInCorner=", c11, z11);
        c11.append(", isSingleTopRight=");
        c11.append(z12);
        c11.append(", buttonMode=");
        c11.append(buttonMode);
        A0.c(i11, i12, ", index=", ", topMargin=", c11);
        c11.append(", recShelfAction=");
        c11.append(atomActionDTO2);
        c11.append(", wishlistKey=");
        c11.append(wishlistTileKey);
        c11.append(", selectionKey=");
        c11.append(selectionProductsTileKey);
        c11.append(", tileWidgetId=");
        c11.append(j12);
        c11.append(", kebab=");
        c11.append(kebab);
        c11.append(", overlayItem=");
        c11.append(overlayItem);
        c11.append(", ratingMolecule=");
        c11.append(ugcRatingMolecule);
        c11.append(", countButton=");
        c11.append(countButtonVO);
        c11.append(", theme=");
        c11.append(tileThemeConfigVO);
        C2436a.e(", isCheckboxTile=", ", topRightButtonsAnimationEnabled=", c11, z13, z14);
        c11.append(")");
        return c11.toString();
    }
}
