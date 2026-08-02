package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation;

import WZ.t;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.data.SplitDetailV2DTO;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.di.SplitDetailV2Component;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R2\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR2\u0010#\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/di/SplitDetailV2Component;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/di/SplitDetailV2Component;)V", "", "stateId", "dto", "mapToViewObject", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO;)Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split$QuantityControl;", "", "widgetId", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split$QuantityControl;J)Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/di/SplitDetailV2Component;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitDetailV2ViewMapper extends WidgetViewMapper<SplitDetailV2DTO, SplitDetailV2VO> {

    @NotNull
    private final SplitDetailV2Component component;

    @NotNull
    private final Function2<View, ComposerReferences, k<SplitDetailV2VO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<SplitDetailV2DTO, d, List<SplitDetailV2VO>> mapper;
    public static final int $stable = 8;

    public SplitDetailV2ViewMapper(@NotNull SplitDetailV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = new SplitDetailV2ViewMapper$mapper$1(this);
        this.layout = R$layout.widget_split_details_v2;
        this.holderProducer = new SplitDetailV2ViewMapper$holderProducer$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SplitDetailV2VO mapToViewObject(String stateId, SplitDetailV2DTO dto) {
        ArrayList arrayList;
        TextAtom textAtom;
        t tVar;
        SplitDetailV2DTO.VerticalType.Settings settings;
        long hashCode = stateId.hashCode();
        TextAtom header = dto.getHeader();
        if (dto.getHorizontal() == null || dto.getHorizontal().getSplits().isEmpty()) {
            if (dto.getVertical() == null || dto.getVertical().getSplits().isEmpty()) {
                throw new IllegalArgumentException("Rfbs Split Error: One of the types must be implemented");
            }
            List<SplitDetailV2DTO.VerticalType.Split> splits = dto.getVertical().getSplits();
            arrayList = new ArrayList(C7714v.z(splits, 10));
            Iterator it = splits.iterator();
            while (it.hasNext()) {
                SplitDetailV2DTO.VerticalType.Split split = (SplitDetailV2DTO.VerticalType.Split) it.next();
                String image = split.getImage();
                Price price = split.getPrice();
                Price premiumPrice = split.getPremiumPrice();
                TextAtom title = split.getTitle();
                TextAtom quantity = split.getQuantity();
                TextAtom pricePerItem = split.getPricePerItem();
                DisclaimerAtom annotation = split.getAnnotation();
                IconDTO promoIcon = split.getPromoIcon();
                PromoIconPosition promoIconPosition = split.getPromoIconPosition();
                if (promoIconPosition == null) {
                    promoIconPosition = PromoIconPosition.BOTTOM_LEFT;
                }
                Map<String, TokenizedTrackingInfo> trackingInfo = split.getTrackingInfo();
                Iterator it2 = it;
                if (trackingInfo != null) {
                    textAtom = header;
                    tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
                } else {
                    textAtom = header;
                    tVar = null;
                }
                SplitDetailV2DTO.VerticalType.Split.QuantityControl quantityControl = split.getQuantityControl();
                arrayList.add(new SplitDetailV2VO.Split.Vertical(image, price, premiumPrice, title, quantity, pricePerItem, annotation, promoIcon, promoIconPosition, tVar, quantityControl != null ? toVO(quantityControl, hashCode) : null));
                it = it2;
                header = textAtom;
            }
        } else {
            List<SplitDetailV2DTO.HorizontalType.Split> splits2 = dto.getHorizontal().getSplits();
            arrayList = new ArrayList(C7714v.z(splits2, 10));
            for (SplitDetailV2DTO.HorizontalType.Split split2 : splits2) {
                TextAtom title2 = split2.getTitle();
                List<SplitDetailV2DTO.HorizontalType.Split.ProductImage> carousel = split2.getCarousel();
                ArrayList arrayList2 = new ArrayList(C7714v.z(carousel, 10));
                for (SplitDetailV2DTO.HorizontalType.Split.ProductImage productImage : carousel) {
                    String image2 = productImage.getImage();
                    IconDTO promoIcon2 = productImage.getPromoIcon();
                    PromoIconPosition promoIconPosition2 = productImage.getPromoIconPosition();
                    if (promoIconPosition2 == null) {
                        promoIconPosition2 = PromoIconPosition.BOTTOM_LEFT;
                    }
                    arrayList2.add(new SplitDetailV2VO.Split.Horizontal.ProductImage(image2, promoIcon2, promoIconPosition2));
                }
                arrayList.add(new SplitDetailV2VO.Split.Horizontal(title2, arrayList2));
            }
        }
        TextAtom textAtom2 = header;
        ArrayList arrayList3 = arrayList;
        SplitDetailV2DTO.VerticalType vertical = dto.getVertical();
        SplitDetailV2VO.Split.Settings settings2 = new SplitDetailV2VO.Split.Settings((vertical == null || (settings = vertical.getSettings()) == null) ? null : settings.getTopPadding());
        Map<String, TokenizedTrackingInfo> trackingInfo2 = dto.getTrackingInfo();
        return new SplitDetailV2VO(hashCode, textAtom2, arrayList3, settings2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null);
    }

    private final SplitDetailV2VO.Split.Vertical.QuantityControl toVO(SplitDetailV2DTO.VerticalType.Split.QuantityControl quantityControl, long j11) {
        int minimum = quantityControl.getMinimum();
        int maximum = quantityControl.getMaximum();
        int current = quantityControl.getCurrent();
        Integer debounceDelay = quantityControl.getDebounceDelay();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(quantityControl.getAction(), null);
        Map<String, TokenizedTrackingInfo> incrementTrackingInfo = quantityControl.getIncrementTrackingInfo();
        t mapToTokenizedEvent$default = incrementTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(incrementTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> decrementTrackingInfo = quantityControl.getDecrementTrackingInfo();
        return new SplitDetailV2VO.Split.Vertical.QuantityControl(minimum, maximum, current, debounceDelay, atomAction, mapToTokenizedEvent$default, decrementTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(decrementTrackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SplitDetailV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SplitDetailV2DTO, d, List<SplitDetailV2VO>> getMapper() {
        return this.mapper;
    }
}
