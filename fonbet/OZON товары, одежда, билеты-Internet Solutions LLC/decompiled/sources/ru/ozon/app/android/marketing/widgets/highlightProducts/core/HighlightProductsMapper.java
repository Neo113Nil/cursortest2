package ru.ozon.app.android.marketing.widgets.highlightProducts.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.highlightProducts.data.HighlightProductsDTO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.HighlightProductsVO;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperProgressText;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/core/HighlightProductsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;Ll20/d;)Ljava/util/List;", "", "id", "mapDto", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;J)Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightProductsMapper implements Function2<HighlightProductsDTO, d, List<? extends HighlightProductsVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/core/HighlightProductsMapper$Companion;", "", "<init>", "()V", "PROGRESS_TEXT_MAX_LINES", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final HighlightProductsVO mapDto(@NotNull HighlightProductsDTO state, long id2) {
        ArrayList arrayList;
        HighlightsWrapperProgressText highlightsWrapperProgressText;
        Intrinsics.checkNotNullParameter(state, "state");
        List<HighlightProductsDTO.HighlightProduct> mainProducts = state.getMainProducts();
        ArrayList arrayList2 = new ArrayList(C7714v.z(mainProducts, 10));
        Iterator<T> it = mainProducts.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HighlightProductsDTO.HighlightProduct highlightProduct = (HighlightProductsDTO.HighlightProduct) it.next();
            HighlightProductsDTO.ProductIcon icon = highlightProduct.getIcon();
            HighlightProductsVO.ProductIcon productIcon = icon != null ? new HighlightProductsVO.ProductIcon(icon.getIcon(), icon.getTintColor()) : null;
            HighlightProductsDTO.ProductBadge badge = highlightProduct.getBadge();
            HighlightProductsVO.ProductBadge productBadge = badge != null ? new HighlightProductsVO.ProductBadge(badge.getImage(), badge.getTintColor(), badge.getBackgroundColor()) : null;
            String image = highlightProduct.getImage();
            AtomActionDTO action = highlightProduct.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, highlightProduct.getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = highlightProduct.getTrackingInfo();
            if (trackingInfo != null) {
                r6 = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null);
            }
            arrayList2.add(new HighlightProductsVO.HighlightProduct(image, productIcon, atomAction, r6, productBadge));
        }
        List<HighlightProductsDTO.HighlightProduct> subProducts = state.getSubProducts();
        if (subProducts != null) {
            List<HighlightProductsDTO.HighlightProduct> list = subProducts;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (HighlightProductsDTO.HighlightProduct highlightProduct2 : list) {
                HighlightProductsDTO.ProductIcon icon2 = highlightProduct2.getIcon();
                HighlightProductsVO.ProductIcon productIcon2 = icon2 != null ? new HighlightProductsVO.ProductIcon(icon2.getIcon(), icon2.getTintColor()) : null;
                HighlightProductsDTO.ProductBadge badge2 = highlightProduct2.getBadge();
                HighlightProductsVO.ProductBadge productBadge2 = badge2 != null ? new HighlightProductsVO.ProductBadge(badge2.getImage(), badge2.getTintColor(), badge2.getBackgroundColor()) : null;
                String image2 = highlightProduct2.getImage();
                AtomActionDTO action2 = highlightProduct2.getAction();
                AtomAction atomAction2 = action2 != null ? AtomActionMapperKt.toAtomAction(action2, highlightProduct2.getTrackingInfo()) : null;
                Map<String, TokenizedTrackingInfo> trackingInfo2 = highlightProduct2.getTrackingInfo();
                arrayList.add(new HighlightProductsVO.HighlightProduct(image2, productIcon2, atomAction2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(id2), null, 2, null) : null, productBadge2));
            }
        } else {
            arrayList = null;
        }
        HighlightsWrapperProgressText miniProgressText = state.getMiniProgressText();
        if (miniProgressText != null) {
            TextAtom text = miniProgressText.getText();
            Integer maxLines = miniProgressText.getText().getMaxLines();
            highlightsWrapperProgressText = HighlightsWrapperProgressText.copy$default(miniProgressText, TextAtom.copy$default(text, null, null, null, Integer.valueOf(maxLines != null ? maxLines.intValue() : 2), null, null, null, 119, null), null, 2, null);
        } else {
            highlightsWrapperProgressText = null;
        }
        TextAtom title = state.getTitle();
        TextAtom subtitle = state.getSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo3 = state.getTrackingInfo();
        return new HighlightProductsVO(id2, title, arrayList2, arrayList, trackingInfo3 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(id2), null, 2, null) : null, subtitle, state.getCurrentMiniWidget(), highlightsWrapperProgressText);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HighlightProductsVO> invoke(@NotNull HighlightProductsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapDto(state, widgetInfo.d().hashCode()));
    }
}
