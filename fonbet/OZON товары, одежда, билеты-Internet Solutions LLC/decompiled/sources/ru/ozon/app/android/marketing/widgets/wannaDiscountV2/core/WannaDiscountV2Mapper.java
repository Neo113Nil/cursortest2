package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core;

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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2DTO;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/core/WannaDiscountV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO;J)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "mapDiscount", "(Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO;Ll20/d;)Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountV2Mapper implements Function2<WannaDiscountV2DTO, d, List<? extends WannaDiscountV2VO>> {
    private final WannaDiscountV2VO.Discount mapDiscount(TagV3Atom.TagAtom tagAtom) {
        Map<String, String> params;
        AtomActionDTO action = tagAtom.getAction();
        String str = (action == null || (params = action.getParams()) == null) ? null : params.get("discountPrice");
        if (str == null) {
            str = "";
        }
        return new WannaDiscountV2VO.Discount(tagAtom, str);
    }

    private final WannaDiscountV2VO toVO(WannaDiscountV2DTO wannaDiscountV2DTO, long j11) {
        TextAtom title = wannaDiscountV2DTO.getTitle();
        TextAtom subtitle = wannaDiscountV2DTO.getSubtitle();
        ButtonV3Atom.SmallIconButton infoButton = wannaDiscountV2DTO.getInfoButton();
        ButtonV3Atom.LargeButton sendButton = wannaDiscountV2DTO.getSendButton();
        WannaDiscountV2DTO.PriceBlock priceBlock = wannaDiscountV2DTO.getPriceBlock();
        List<TagV3Atom.TagAtom> discounts = wannaDiscountV2DTO.getDiscounts();
        ArrayList arrayList = new ArrayList(C7714v.z(discounts, 10));
        Iterator<T> it = discounts.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDiscount((TagV3Atom.TagAtom) it.next()));
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon seller = wannaDiscountV2DTO.getSeller();
        WannaDiscountV2DTO.PriceInputBlock priceInput = wannaDiscountV2DTO.getPriceInput();
        WannaDiscountV2DTO.QuantityInputBlock quantityInput = wannaDiscountV2DTO.getQuantityInput();
        Map<String, TokenizedTrackingInfo> trackingInfo = wannaDiscountV2DTO.getTrackingInfo();
        return new WannaDiscountV2VO(j11, title, subtitle, infoButton, sendButton, priceBlock, arrayList, seller, priceInput, quantityInput, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<WannaDiscountV2VO> invoke(@NotNull WannaDiscountV2DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto, widgetInfo.d().hashCode()));
    }
}
