package ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe;

import I0.C3173b;
import Lm0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SubscribeQuantViewModel$onSubscribeClick$2 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ long $productId;
    final /* synthetic */ SubscribeQuantViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribeQuantViewModel$onSubscribeClick$2(SubscribeQuantViewModel subscribeQuantViewModel, long j11) {
        super(1);
        this.this$0 = subscribeQuantViewModel;
        this.$productId = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        SingleLiveEvent singleLiveEvent;
        singleLiveEvent = this.this$0._action;
        singleLiveEvent.setValue(SubscribeQuantViewModel.QuantAction.Error.INSTANCE);
        a.f17149a.e(th2, C3173b.b(this.$productId, "subscribeToItemAvailabilityChange "), new Object[0]);
    }
}
