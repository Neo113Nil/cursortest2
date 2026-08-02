package ru.ozon.app.android.ugc.widgets.productsforreview.data;

import Sc.InterfaceC4008j;
import WZ.t;
import android.content.Context;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data.ReviewProductMapper;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductVO;
import ru.ozon.app.android.ugc.utils.TextUtilsKt;
import ru.ozon.app.android.ugc.widgets.productsforreview.data.ProductsForReviewDTO;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductMapper;", "reviewProductMapper", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductMapper;Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO$HideButtonDTO;", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;", "toVO", "(Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO$HideButtonDTO;)Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/data/ReviewProductMapper;", "Landroid/content/Context;", "", "hideTitleWidth", "Ljava/lang/Integer;", "Landroid/text/TextPaint;", "textPaint$delegate", "LSc/j;", "getTextPaint", "()Landroid/text/TextPaint;", "textPaint", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewMapper implements Function2<ProductsForReviewDTO, d, List<? extends ProductForReviewVO>> {

    @NotNull
    private final Context context;
    private Integer hideTitleWidth;

    @NotNull
    private final ReviewProductMapper reviewProductMapper;

    /* renamed from: textPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textPaint;

    public ProductsForReviewMapper(@NotNull ReviewProductMapper reviewProductMapper, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(reviewProductMapper, "reviewProductMapper");
        Intrinsics.checkNotNullParameter(context, "context");
        this.reviewProductMapper = reviewProductMapper;
        this.context = context;
        this.textPaint = LazyUtilsKt.unsafeLazy(ProductsForReviewMapper$textPaint$2.INSTANCE);
    }

    private final TextPaint getTextPaint() {
        return (TextPaint) this.textPaint.getValue();
    }

    private final ProductForReviewVO.HideButtonVO toVO(ProductsForReviewDTO.HideButtonDTO hideButtonDTO) {
        int intValue;
        IconButtonV3DTO iconButton = hideButtonDTO.getIconButton();
        TextDTO title = hideButtonDTO.getTitle();
        Integer num = this.hideTitleWidth;
        if (num != null) {
            intValue = num.intValue();
        } else {
            Integer measureTextWidth = TextUtilsKt.measureTextWidth(hideButtonDTO.getTitle(), this.context, getTextPaint());
            this.hideTitleWidth = measureTextWidth;
            Unit unit = Unit.f71690a;
            intValue = measureTextWidth != null ? measureTextWidth.intValue() : 0;
        }
        return new ProductForReviewVO.HideButtonVO(iconButton, title, intValue);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductForReviewVO> invoke(@NotNull ProductsForReviewDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ProductsForReviewDTO.ItemDTO> items = state.getItems();
        ArrayList arrayList = null;
        if (items != null) {
            List<ProductsForReviewDTO.ItemDTO> list = items;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ProductsForReviewDTO.ItemDTO itemDTO = (ProductsForReviewDTO.ItemDTO) obj;
                ReviewProductVO map = this.reviewProductMapper.map(itemDTO, true);
                long id2 = map.getId();
                String rateDeeplink = itemDTO.getRateDeeplink();
                boolean z11 = i11 == 0;
                boolean z12 = i11 == C7714v.P(state.getItems());
                AtomActionDTO productTapAction = itemDTO.getProductTapAction();
                AtomAction atomAction = productTapAction != null ? AtomActionMapperKt.toAtomAction(productTapAction, itemDTO.getProductTapTracking()) : null;
                AtomAction.Move move = new AtomAction.Move(itemDTO.getRateDeeplink(), null, itemDTO.getRateTapTracking(), null, 10, null);
                Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getTrackingInfo();
                t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null) : null;
                ProductsForReviewDTO.HideButtonDTO hideButton = itemDTO.getHideButton();
                arrayList2.add(new ProductForReviewVO(id2, map, rateDeeplink, z11, z12, atomAction, move, tokenizedEvent$default, hideButton != null ? toVO(hideButton) : null));
                i11 = i12;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }
}
