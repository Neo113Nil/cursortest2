package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModel$sendTypeIdsRequest$1", f = "PromoPushEnableViewModel.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoPushEnableViewModel$sendTypeIdsRequest$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionLink;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ PromoPushEnableViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPushEnableViewModel$sendTypeIdsRequest$1(String str, PromoPushEnableViewModel promoPushEnableViewModel, c cVar, Map<String, String> map, d<? super PromoPushEnableViewModel$sendTypeIdsRequest$1> dVar) {
        super(2, dVar);
        this.$actionLink = str;
        this.this$0 = promoPushEnableViewModel;
        this.$trackingData = cVar;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromoPushEnableViewModel$sendTypeIdsRequest$1(this.$actionLink, this.this$0, this.$trackingData, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String selectedTypeIds;
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Map<String, String> map = this.$params;
            PromoPushEnableViewModel promoPushEnableViewModel = this.this$0;
            Tc.d builder = new Tc.d();
            if (map != null) {
                builder.putAll(map);
            }
            selectedTypeIds = promoPushEnableViewModel.getSelectedTypeIds();
            builder.put("typeIds", selectedTypeIds);
            Intrinsics.checkNotNullParameter(builder, "builder");
            ActionV2Request actionV2Request = new ActionV2Request(builder.u(), this.$actionLink, false, 4, null);
            actionV2Repository = this.this$0.actionV2Repository;
            c cVar = this.$trackingData;
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, cVar, Object.class, this);
            if (mo480requestActionResultWithTrackingBWLJW6A == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo480requestActionResultWithTrackingBWLJW6A = ((r) obj).getF26106a();
        }
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromoPushEnableViewModel$sendTypeIdsRequest$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
