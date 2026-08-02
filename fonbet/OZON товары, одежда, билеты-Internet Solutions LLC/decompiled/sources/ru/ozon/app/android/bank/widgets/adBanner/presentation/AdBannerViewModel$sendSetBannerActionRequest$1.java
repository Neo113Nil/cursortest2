package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.bank.widgets.adBanner.data.SetBannerActionRequest;
import ru.ozon.app.android.bank.widgets.adBanner.data.SetBannerActionType;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewModel$sendSetBannerActionRequest$1", f = "AdBannerViewModel.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdBannerViewModel$sendSetBannerActionRequest$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AdBannerItemVO $adBannerItemVO;
    final /* synthetic */ SetBannerActionType $setBannerActionType;
    int label;
    final /* synthetic */ AdBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdBannerViewModel$sendSetBannerActionRequest$1(AdBannerViewModel adBannerViewModel, SetBannerActionType setBannerActionType, AdBannerItemVO adBannerItemVO, d<? super AdBannerViewModel$sendSetBannerActionRequest$1> dVar) {
        super(2, dVar);
        this.this$0 = adBannerViewModel;
        this.$setBannerActionType = setBannerActionType;
        this.$adBannerItemVO = adBannerItemVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdBannerViewModel$sendSetBannerActionRequest$1(this.this$0, this.$setBannerActionType, this.$adBannerItemVO, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(new SetBannerActionRequest(this.$setBannerActionType.name(), this.$adBannerItemVO.getAdTraceID(), this.$adBannerItemVO.getSlug(), this.$adBannerItemVO.getPlacementSlug()), "setBannerAction", false, 4, null);
            this.label = 1;
            if (actionV2Repository.callActionSuspend(actionV2Request, Object.class, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdBannerViewModel$sendSetBannerActionRequest$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
