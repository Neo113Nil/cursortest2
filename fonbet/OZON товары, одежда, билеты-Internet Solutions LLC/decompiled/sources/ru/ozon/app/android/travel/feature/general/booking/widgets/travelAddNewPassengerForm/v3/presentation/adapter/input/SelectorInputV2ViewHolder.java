package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonSelectorInputV2View;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/SelectorInputV2ViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonSelectorInputV2View;", "inputItemView", "<init>", "(Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonSelectorInputV2View;)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "item", "", "payloads", "", "bindWithPayloads", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;Ljava/util/List;)V", "", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;Ljava/util/List;)V", "Lkotlin/Function1;", "", "onSelectorClicked", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonSelectorInputV2View;", "Lkotlin/jvm/functions/Function1;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectorInputV2ViewHolder extends BaseViewHolder<TravelAddNewPassengerFormV3VO.InputItemVO> {

    @NotNull
    private final CommonSelectorInputV2View inputItemView;
    private Function1<? super Integer, Unit> onSelectorClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorInputV2ViewHolder(@NotNull CommonSelectorInputV2View inputItemView) {
        super(inputItemView);
        Intrinsics.checkNotNullParameter(inputItemView, "inputItemView");
        this.inputItemView = inputItemView;
    }

    private final void bindWithPayloads(CommonInputV2VO.SelectorV2 item, List<?> payloads) {
        for (Object obj : payloads) {
            if (obj instanceof List) {
                bindWithPayloads(item, (List) obj);
            } else if (obj == AddNewPassengerFormInputV2Payload.CHANGE_ERROR) {
                this.inputItemView.bindError(item);
            }
        }
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO, List list) {
        bind2(inputItemVO, (List<? extends Object>) list);
    }

    public final void removeCallbacks() {
        this.onSelectorClicked = null;
    }

    public final void setupCallbacks(Function1<? super Integer, Unit> onSelectorClicked) {
        this.onSelectorClicked = onSelectorClicked;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull TravelAddNewPassengerFormV3VO.InputItemVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (item instanceof TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem) {
            if (payloads.isEmpty()) {
                CommonSelectorInputV2View.bind$default(this.inputItemView, ((TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem) item).getInput(), null, new SelectorInputV2ViewHolder$bind$1(this), 2, null);
            } else {
                bindWithPayloads(((TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem) item).getInput(), payloads);
            }
        }
    }
}
