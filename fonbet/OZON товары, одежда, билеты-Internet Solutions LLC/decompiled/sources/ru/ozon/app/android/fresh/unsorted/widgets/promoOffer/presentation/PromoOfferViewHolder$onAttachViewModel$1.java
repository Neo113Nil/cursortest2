package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewModel;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewHolder$onAttachViewModel$1", f = "PromoOfferViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PromoOfferViewHolder$onAttachViewModel$1 extends j implements Function2<PromoOfferViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PromoOfferViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoOfferViewHolder$onAttachViewModel$1(PromoOfferViewHolder promoOfferViewHolder, d<? super PromoOfferViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = promoOfferViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PromoOfferViewHolder$onAttachViewModel$1 promoOfferViewHolder$onAttachViewModel$1 = new PromoOfferViewHolder$onAttachViewModel$1(this.this$0, dVar);
        promoOfferViewHolder$onAttachViewModel$1.L$0 = obj;
        return promoOfferViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        NotificationDTO notification;
        NotificationDTO errorNotificationDTO;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PromoOfferViewModel.Action action = (PromoOfferViewModel.Action) this.L$0;
        if (Intrinsics.d(action, PromoOfferViewModel.Action.AddToCartError.INSTANCE)) {
            PromoOfferViewHolder promoOfferViewHolder = this.this$0;
            errorNotificationDTO = promoOfferViewHolder.getErrorNotificationDTO();
            promoOfferViewHolder.showNotification(errorNotificationDTO);
        } else {
            if (!Intrinsics.d(action, PromoOfferViewModel.Action.AddToCartSuccess.INSTANCE)) {
                throw new o();
            }
            PromoOfferVO boundedData = this.this$0.getBoundedData();
            if (boundedData != null && (notification = boundedData.getNotification()) != null) {
                this.this$0.showNotification(notification);
            }
            composerReferences = this.this$0.refs;
            InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PromoOfferViewModel.Action action, d<? super Unit> dVar) {
        return ((PromoOfferViewHolder$onAttachViewModel$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
