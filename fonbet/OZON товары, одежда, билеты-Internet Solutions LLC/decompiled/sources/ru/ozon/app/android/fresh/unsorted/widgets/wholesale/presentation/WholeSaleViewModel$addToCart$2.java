package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WholeSaleViewModel$addToCart$2 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ WholeSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WholeSaleViewModel$addToCart$2(WholeSaleViewModel wholeSaleViewModel) {
        super(1);
        this.this$0 = wholeSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable it) {
        SingleLiveEvent singleLiveEvent;
        Intrinsics.checkNotNullParameter(it, "it");
        singleLiveEvent = this.this$0._actions;
        singleLiveEvent.postValue(WholeSaleViewModel.Action.AddToCartError.INSTANCE);
    }
}
