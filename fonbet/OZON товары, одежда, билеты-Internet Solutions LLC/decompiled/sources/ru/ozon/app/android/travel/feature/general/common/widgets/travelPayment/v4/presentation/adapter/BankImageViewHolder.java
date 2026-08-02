package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view.ImageBankCardView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/BankImageViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/adapter/TravelPaymentV4CardViewHolder;", "view", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/ImageBankCardView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/ImageBankCardView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BankImageViewHolder extends TravelPaymentV4CardViewHolder {

    @NotNull
    private final ImageBankCardView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankImageViewHolder(@NotNull ImageBankCardView view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view, onAction);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.adapter.TravelPaymentV4CardViewHolder
    public void bind(@NotNull TravelPaymentV4VO.PaymentMethod item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof TravelPaymentV4VO.BankImageMethodVO) {
            TravelPaymentV4VO.BankImageMethodVO bankImageMethodVO = (TravelPaymentV4VO.BankImageMethodVO) item;
            setAction(bankImageMethodVO.getAction());
            this.view.bind(bankImageMethodVO);
            this.view.setContentDescription(buildContentDescription(bankImageMethodVO.getTestInfo(), "BankImage"));
        }
    }
}
