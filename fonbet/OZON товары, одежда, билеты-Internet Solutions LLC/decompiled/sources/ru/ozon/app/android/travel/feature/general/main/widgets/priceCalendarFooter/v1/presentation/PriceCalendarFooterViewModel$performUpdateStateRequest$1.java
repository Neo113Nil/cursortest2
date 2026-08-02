package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterMapper;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "kotlin.jvm.PlatformType", "dto", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterDTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceCalendarFooterViewModel$performUpdateStateRequest$1 extends AbstractC7737t implements Function1<PriceCalendarFooterDTO, PriceCalendarFooterVO> {
    final /* synthetic */ Map<String, Object> $request;
    final /* synthetic */ PriceCalendarFooterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarFooterViewModel$performUpdateStateRequest$1(PriceCalendarFooterViewModel priceCalendarFooterViewModel, Map<String, ? extends Object> map) {
        super(1);
        this.this$0 = priceCalendarFooterViewModel;
        this.$request = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PriceCalendarFooterVO invoke(PriceCalendarFooterDTO dto) {
        PriceCalendarFooterMapper priceCalendarFooterMapper;
        PriceCalendarFooterVO priceCalendarFooterVO;
        AtomActionDTO action;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(dto, "dto");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = this.$request;
        ButtonV3Atom.LargeButton confirmButton = dto.getConfirmButton();
        if (confirmButton != null && (action = confirmButton.getAction()) != null && (params = action.getParams()) != null) {
            linkedHashMap.putAll(params);
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue().toString()));
        }
        U.p(linkedHashMap, arrayList);
        priceCalendarFooterMapper = this.this$0.mapper;
        priceCalendarFooterVO = this.this$0.lastVo;
        ButtonV3Atom.LargeButton largeButton = null;
        if (priceCalendarFooterVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        PriceCalendarFooterVO mapFooter = priceCalendarFooterMapper.mapFooter(dto, priceCalendarFooterVO.getId());
        ButtonV3Atom.LargeButton confirmButton2 = dto.getConfirmButton();
        if (confirmButton2 != null) {
            AtomActionDTO action2 = dto.getConfirmButton().getAction();
            largeButton = ButtonV3Atom.LargeButton.copy$default(confirmButton2, null, null, null, null, null, action2 != null ? AtomActionDTO.copy$default(action2, null, null, null, linkedHashMap, null, 23, null) : null, null, null, null, 479, null);
        }
        return PriceCalendarFooterVO.copy$default(mapFooter, 0L, null, null, null, largeButton, null, null, 111, null);
    }
}
