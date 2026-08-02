package ru.ozon.app.android.checkoutcomposer.common.configurator;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class AddressPartsInputPageConfigurator$onComposerInitialized$1 extends C7735q implements Function1<AddressPartsInputViewModel.State, Unit> {
    AddressPartsInputPageConfigurator$onComposerInitialized$1(Object obj) {
        super(1, obj, AddressPartsInputPageConfigurator.class, "handleState", "handleState(Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressPartsInputViewModel.State state) {
        invoke2(state);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressPartsInputViewModel.State p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AddressPartsInputPageConfigurator) this.receiver).handleState(p02);
    }
}
