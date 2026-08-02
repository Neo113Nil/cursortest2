package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async;

import Sc.r;
import Sc.s;
import Wc.a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderViewModel$fetchWidget$1", f = "DeliveryV6AsyncPlaceholderViewModel.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DeliveryV6AsyncPlaceholderViewModel$fetchWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ String $stateId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeliveryV6AsyncPlaceholderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6AsyncPlaceholderViewModel$fetchWidget$1(DeliveryV6AsyncPlaceholderViewModel deliveryV6AsyncPlaceholderViewModel, String str, String str2, d<? super DeliveryV6AsyncPlaceholderViewModel$fetchWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = deliveryV6AsyncPlaceholderViewModel;
        this.$asyncData = str;
        this.$stateId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeliveryV6AsyncPlaceholderViewModel$fetchWidget$1 deliveryV6AsyncPlaceholderViewModel$fetchWidget$1 = new DeliveryV6AsyncPlaceholderViewModel$fetchWidget$1(this.this$0, this.$asyncData, this.$stateId, dVar);
        deliveryV6AsyncPlaceholderViewModel$fetchWidget$1.L$0 = obj;
        return deliveryV6AsyncPlaceholderViewModel$fetchWidget$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        SingleLiveEvent singleLiveEvent;
        DeliveryV6AsyncDTOMapper deliveryV6AsyncDTOMapper;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Object fetchWidget$default;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                DeliveryV6AsyncPlaceholderViewModel deliveryV6AsyncPlaceholderViewModel = this.this$0;
                String str = this.$asyncData;
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = deliveryV6AsyncPlaceholderViewModel.repository;
                this.label = 1;
                fetchWidget$default = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, DeliveryDTO.class, null, this, 4, null);
                if (fetchWidget$default == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                fetchWidget$default = obj;
            }
            a11 = (ComposerAsyncWidgetResponse) fetchWidget$default;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        DeliveryV6AsyncPlaceholderViewModel deliveryV6AsyncPlaceholderViewModel2 = this.this$0;
        String str2 = this.$stateId;
        if (!(a11 instanceof r.b)) {
            ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) a11;
            DeliveryDTO deliveryDTO = (DeliveryDTO) composerAsyncWidgetResponse.getState();
            deliveryV6AsyncDTOMapper = deliveryV6AsyncPlaceholderViewModel2.deliveryV6AsyncDTOMapper;
            a11 = new DeliveryV6AsyncPlaceholderViewModel.Event.OnWidgetFetched(deliveryV6AsyncDTOMapper.map(deliveryDTO, str2), deliveryDTO.getCartButtonTexts(), deliveryDTO.isHidden(), deliveryDTO.getTabGroupId(), deliveryDTO.getDateTrackingInfo(), composerAsyncWidgetResponse.getTrackingPayloads());
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11, "Failed to load async delivery widget", new Object[0]);
        }
        Throwable b12 = r.b(a11);
        if (b12 != null) {
            a11 = new DeliveryV6AsyncPlaceholderViewModel.Event.OnWidgetFetchingFailed(b12);
        }
        singleLiveEvent = this.this$0._events;
        singleLiveEvent.postValue((DeliveryV6AsyncPlaceholderViewModel.Event) a11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeliveryV6AsyncPlaceholderViewModel$fetchWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
