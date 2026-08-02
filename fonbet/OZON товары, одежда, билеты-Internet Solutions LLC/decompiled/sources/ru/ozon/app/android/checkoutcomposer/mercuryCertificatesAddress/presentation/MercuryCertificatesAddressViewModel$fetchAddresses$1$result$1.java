package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data.SearchMercuryAddressResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/action/v2/models/ActionV2Response;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.MercuryCertificatesAddressViewModel$fetchAddresses$1$result$1", f = "MercuryCertificatesAddressViewModel.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MercuryCertificatesAddressViewModel$fetchAddresses$1$result$1 extends j implements Function2<M, d<? super ActionV2Response<SearchMercuryAddressResponse>>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ MercuryCertificatesAddressViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MercuryCertificatesAddressViewModel$fetchAddresses$1$result$1(AtomAction atomAction, Map<String, String> map, MercuryCertificatesAddressViewModel mercuryCertificatesAddressViewModel, d<? super MercuryCertificatesAddressViewModel$fetchAddresses$1$result$1> dVar) {
        super(2, dVar);
        this.$action = atomAction;
        this.$params = map;
        this.this$0 = mercuryCertificatesAddressViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MercuryCertificatesAddressViewModel$fetchAddresses$1$result$1(this.$action, this.$params, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            String id2 = ((AtomAction.Click) this.$action).getId();
            if (id2 == null) {
                return null;
            }
            Map<String, String> map = this.$params;
            MercuryCertificatesAddressViewModel mercuryCertificatesAddressViewModel = this.this$0;
            ActionV2Request actionV2Request = new ActionV2Request(map, id2, false, 4, null);
            actionV2Repository = mercuryCertificatesAddressViewModel.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, SearchMercuryAddressResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return (ActionV2Response) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ActionV2Response<SearchMercuryAddressResponse>> dVar) {
        return ((MercuryCertificatesAddressViewModel$fetchAddresses$1$result$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
