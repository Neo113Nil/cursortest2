package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.ShowMessageEvent;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/ShowMessageEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder$onAttach$2", f = "SellerTransparencyV3ViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SellerTransparencyV3ViewHolder$onAttach$2 extends j implements Function2<ShowMessageEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SellerTransparencyV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerTransparencyV3ViewHolder$onAttach$2(SellerTransparencyV3ViewHolder sellerTransparencyV3ViewHolder, d<? super SellerTransparencyV3ViewHolder$onAttach$2> dVar) {
        super(2, dVar);
        this.this$0 = sellerTransparencyV3ViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SellerTransparencyV3ViewHolder$onAttach$2 sellerTransparencyV3ViewHolder$onAttach$2 = new SellerTransparencyV3ViewHolder$onAttach$2(this.this$0, dVar);
        sellerTransparencyV3ViewHolder$onAttach$2.L$0 = obj;
        return sellerTransparencyV3ViewHolder$onAttach$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SellerTransparencyV3VO boundData;
        NotificationModelWrapper defaultNotification;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ShowMessageEvent showMessageEvent = (ShowMessageEvent) this.L$0;
        if (showMessageEvent instanceof ShowMessageEvent.SuccessfulEvent) {
            this.this$0.showNotification(((ShowMessageEvent.SuccessfulEvent) showMessageEvent).getNotification());
        } else if ((showMessageEvent instanceof ShowMessageEvent.ErrorEvent) && (boundData = this.this$0.getBoundData()) != null && (defaultNotification = boundData.getDefaultNotification()) != null) {
            this.this$0.showNotification(defaultNotification);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShowMessageEvent showMessageEvent, d<? super Unit> dVar) {
        return ((SellerTransparencyV3ViewHolder$onAttach$2) create(showMessageEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
