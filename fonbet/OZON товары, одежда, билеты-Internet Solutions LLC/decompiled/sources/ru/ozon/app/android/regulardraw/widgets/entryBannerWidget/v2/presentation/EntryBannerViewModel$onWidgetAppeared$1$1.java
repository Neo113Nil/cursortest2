package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation;

import Lm0.a;
import Sc.r;
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
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerViewModel$onWidgetAppeared$1$1", f = "EntryBannerViewModel.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class EntryBannerViewModel$onWidgetAppeared$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $viewAction;
    int label;
    final /* synthetic */ EntryBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EntryBannerViewModel$onWidgetAppeared$1$1(EntryBannerViewModel entryBannerViewModel, AtomAction.ComposerAction composerAction, d<? super EntryBannerViewModel$onWidgetAppeared$1$1> dVar) {
        super(2, dVar);
        this.this$0 = entryBannerViewModel;
        this.$viewAction = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EntryBannerViewModel$onWidgetAppeared$1$1(this.this$0, this.$viewAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo479requestActionResult0E7RQCE;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionRepository;
            ActionV2Request actionV2Request = new ActionV2Request(this.$viewAction.getParams(), this.$viewAction.getActionName(), false, 4, null);
            this.label = 1;
            mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, Object.class, this);
            if (mo479requestActionResult0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
        }
        a.b bVar = Lm0.a.f17149a;
        Throwable b11 = r.b(mo479requestActionResult0E7RQCE);
        if (b11 != null) {
            bVar.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EntryBannerViewModel$onWidgetAppeared$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
