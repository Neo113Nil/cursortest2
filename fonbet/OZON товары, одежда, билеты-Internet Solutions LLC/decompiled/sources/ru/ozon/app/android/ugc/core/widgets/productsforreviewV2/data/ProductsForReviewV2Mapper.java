package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data;

import Sc.o;
import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVOKt;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data.ProductsForReviewV2DTO;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductForReviewV2VI;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u0000  2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001 B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge;", "toVI", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "LZ1/h;", "getSpacerAboveAspectHeight-u2uoSUM", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;)F", "getSpacerAboveAspectHeight", "", "widgetId", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;", "swipeToVI", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;J)Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;", "", "", "calculateScreenFraction", "(I)F", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;Ll20/d;)Ljava/util/List;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewV2Mapper implements Function2<ProductsForReviewV2DTO, d, List<? extends ProductForReviewV2VI>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2Mapper$Companion;", "", "<init>", "()V", "SINGLE_ACTION_MAX_WIDTH", "", "DOUBLE_ACTION_MAX_WIDTH", "TRIPLE_ACTION_MAX_WIDTH", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final float calculateScreenFraction(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? 1.0f : 0.7f;
        }
        return 0.55f;
    }

    /* renamed from: getSpacerAboveAspectHeight-u2uoSUM, reason: not valid java name */
    private final float m1489getSpacerAboveAspectHeightu2uoSUM(ProductsForReviewV2DTO.ProductDTO product) {
        Integer maxLines = product.getTitle().getMaxLines();
        return ((maxLines == null || maxLines.intValue() > 1) ? Paddings.PADDING_200 : Paddings.PADDING_100).m1867getDpD9Ej5fM();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    private final ProductVI.SwipeActionsVI swipeToVI(ProductsForReviewV2DTO.ProductDTO productDTO, long j11) {
        ?? r12;
        List<ProductsForReviewV2DTO.SwipeAction> swipeActions = productDTO.getSwipeActions();
        if (swipeActions != null) {
            List<ProductsForReviewV2DTO.SwipeAction> list = swipeActions;
            r12 = new ArrayList(C7714v.z(list, 10));
            for (ProductsForReviewV2DTO.SwipeAction swipeAction : list) {
                String background = swipeAction.getBackground();
                if (background == null) {
                    background = UniColors.BG_SECONDARY.getToken();
                }
                AtomAction atomAction = swipeAction.getCommon().toAtomAction();
                TextDTO title = swipeAction.getTitle();
                Boolean bool = Boolean.FALSE;
                String icon = swipeAction.getIcon();
                String iconTint = swipeAction.getIconTint();
                if (iconTint == null) {
                    iconTint = UniColors.GRAPHIC_TERTIARY.getToken();
                }
                r12.add(new ProductVI.SwipeAction(new IconDTO(null, bool, null, null, new CommonAtomIconDTO(icon, iconTint), null, null, null, null, null, null, null, null, null, null, null, 65517, null), background, atomAction, title));
            }
        } else {
            r12 = K.f71697a;
        }
        List list2 = r12;
        float calculateScreenFraction = calculateScreenFraction(list2.size());
        Map<String, TokenizedTrackingInfo> swipeTrackingInfo = productDTO.getSwipeTrackingInfo();
        return new ProductVI.SwipeActionsVI(list2, swipeTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(swipeTrackingInfo, Long.valueOf(j11), null, 2, null) : null, calculateScreenFraction, false, 8, null);
    }

    private final List<ProductVI.Badge> toVI(List<? extends ProductsForReviewV2DTO.Badge> list) {
        ProductVI.Badge timerContentVI;
        List<? extends ProductsForReviewV2DTO.Badge> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (ProductsForReviewV2DTO.Badge badge : list2) {
            if (badge instanceof ProductsForReviewV2DTO.Badge.BadgeContentDTO) {
                ProductsForReviewV2DTO.Badge.BadgeContentDTO badgeContentDTO = (ProductsForReviewV2DTO.Badge.BadgeContentDTO) badge;
                BadgeDTO badge2 = badgeContentDTO.getBadge();
                Boolean isFullWidth = badgeContentDTO.isFullWidth();
                timerContentVI = new ProductVI.Badge.BadgeContentVI(badge2, isFullWidth != null ? isFullWidth.booleanValue() : false);
            } else {
                if (!(badge instanceof ProductsForReviewV2DTO.Badge.TimerContentDTO)) {
                    throw new o();
                }
                ProductsForReviewV2DTO.Badge.TimerContentDTO timerContentDTO = (ProductsForReviewV2DTO.Badge.TimerContentDTO) badge;
                TimerVO vo = TimerVOKt.toVo(timerContentDTO.getTimer());
                Boolean isFullWidth2 = timerContentDTO.isFullWidth();
                timerContentVI = new ProductVI.Badge.TimerContentVI(vo, isFullWidth2 != null ? isFullWidth2.booleanValue() : false);
            }
            arrayList.add(timerContentVI);
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductForReviewV2VI> invoke(@NotNull ProductsForReviewV2DTO state, @NotNull d widgetInfo) {
        AtomActionDTO action;
        List<ProductVI.Badge> list;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action2;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ProductsForReviewV2DTO.ItemDTO> items = state.getItems();
        if (items == null) {
            return K.f71697a;
        }
        List<ProductsForReviewV2DTO.ItemDTO> list2 = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ProductsForReviewV2DTO.ItemDTO itemDTO = (ProductsForReviewV2DTO.ItemDTO) obj;
            ProductsForReviewV2DTO.ProductDTO product = itemDTO.getProduct();
            long hashCode = itemDTO.hashCode();
            CommonControlSettings productCommon = itemDTO.getProductCommon();
            CommonControlSettings productCommon2 = itemDTO.getProductCommon();
            t tokenizedEvent$default = (productCommon2 == null || (trackingInfo2 = productCommon2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null);
            CommonControlSettings productCommon3 = itemDTO.getProductCommon();
            AtomAction atomAction = (productCommon3 == null || (action2 = productCommon3.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action2, itemDTO.getProductCommon().getTrackingInfo());
            AtomAction.Move move = atomAction instanceof AtomAction.Move ? (AtomAction.Move) atomAction : null;
            CommonControlSettings productCommon4 = itemDTO.getProductCommon();
            if (productCommon4 == null || (action = productCommon4.getAction()) == null) {
                CommonControlSettings common = itemDTO.getProduct().getRating().getCommon();
                action = common != null ? common.getAction() : null;
            }
            AtomAction atomAction2 = action != null ? AtomActionMapperKt.toAtomAction(action, itemDTO.getProduct().getRating().getTrackingInfo()) : null;
            AtomAction.Move move2 = atomAction2 instanceof AtomAction.Move ? (AtomAction.Move) atomAction2 : null;
            CommonControlSettings common2 = itemDTO.getProduct().getRating().getCommon();
            if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            t tVar2 = tVar;
            long id2 = product.getId();
            ImageDTO image = product.getImage();
            List<ProductsForReviewV2DTO.Badge> badges = product.getBadges();
            if (badges == null || (list = toVI(badges)) == null) {
                list = K.f71697a;
            }
            List<ProductVI.Badge> list3 = list;
            Paddings badgesLeftPadding = product.getBadgesLeftPadding();
            if (badgesLeftPadding == null) {
                badgesLeftPadding = Paddings.PADDING_200;
            }
            Paddings paddings = badgesLeftPadding;
            TextDTO title = product.getTitle();
            float m1489getSpacerAboveAspectHeightu2uoSUM = m1489getSpacerAboveAspectHeightu2uoSUM(product);
            TextDTO aspectText = product.getAspectText();
            RatingDTO rating = product.getRating();
            CornerRadius cornerRadius = product.getCornerRadius();
            if (cornerRadius == null) {
                cornerRadius = CornerRadius.RADIUS_600;
            }
            CornerRadius cornerRadius2 = cornerRadius;
            String backgroundColor = product.getBackgroundColor();
            if (backgroundColor == null) {
                backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
            }
            arrayList.add(new ProductForReviewV2VI(hashCode, new ProductVI(id2, image, list3, paddings, title, m1489getSpacerAboveAspectHeightu2uoSUM, aspectText, rating, cornerRadius2, backgroundColor, i11 == C7714v.P(state.getItems()), i11 == 0, swipeToVI(product, hashCode), null), productCommon, tokenizedEvent$default, move, move2, tVar2));
            i11 = i12;
        }
        return arrayList;
    }
}
