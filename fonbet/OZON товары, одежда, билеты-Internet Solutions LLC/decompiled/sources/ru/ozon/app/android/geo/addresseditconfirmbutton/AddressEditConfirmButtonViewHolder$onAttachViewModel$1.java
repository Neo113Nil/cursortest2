package ru.ozon.app.android.geo.addresseditconfirmbutton;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherActionObserver;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditConfirmButtonViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<PvzSearcherViewModel.Action, Unit> {
    final /* synthetic */ AddressEditConfirmButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditConfirmButtonViewHolder$onAttachViewModel$1(AddressEditConfirmButtonViewHolder addressEditConfirmButtonViewHolder) {
        super(1);
        this.this$0 = addressEditConfirmButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PvzSearcherViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PvzSearcherViewModel.Action action) {
        PvzSearcherActionObserver pvzSearcherActionObserver;
        pvzSearcherActionObserver = this.this$0.pvzSearcherActionObserver;
        Intrinsics.f(action);
        pvzSearcherActionObserver.handleAction(action);
    }
}
