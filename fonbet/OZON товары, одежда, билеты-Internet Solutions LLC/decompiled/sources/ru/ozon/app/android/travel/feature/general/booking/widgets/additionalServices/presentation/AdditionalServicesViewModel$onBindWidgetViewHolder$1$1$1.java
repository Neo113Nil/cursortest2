package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$onBindWidgetViewHolder$1$1$1 extends AbstractC7737t implements Function1<AdditionalServicesVO, AdditionalServicesVO> {
    final /* synthetic */ List<AdditionalServicesCellVO> $cells;
    final /* synthetic */ AdditionalServicesVO.State.Loaded $this_with;
    final /* synthetic */ AdditionalServicesVO $vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$onBindWidgetViewHolder$1$1$1(AdditionalServicesVO additionalServicesVO, AdditionalServicesVO.State.Loaded loaded, List<AdditionalServicesCellVO> list) {
        super(1);
        this.$vo = additionalServicesVO;
        this.$this_with = loaded;
        this.$cells = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdditionalServicesVO invoke(AdditionalServicesVO setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return AdditionalServicesVO.copy$default(this.$vo, 0L, AdditionalServicesVO.State.Loaded.copy$default(this.$this_with, null, null, this.$cells, 0, null, null, 59, null), null, 5, null);
    }
}
