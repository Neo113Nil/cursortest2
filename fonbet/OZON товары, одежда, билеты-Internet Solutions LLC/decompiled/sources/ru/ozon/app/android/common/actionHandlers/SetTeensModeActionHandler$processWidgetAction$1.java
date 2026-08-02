package ru.ozon.app.android.common.actionHandlers;

import Sc.r;
import Sc.s;
import Tg.b;
import Vg.f;
import W10.c;
import Wc.a;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.common.actionHandlers.setTeensMode.SetTeensModeActionResponse;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.SetTeensModeActionHandler$processWidgetAction$1", f = "SetTeensModeActionHandler.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SetTeensModeActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ C7475g $widgetComponentStorage;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ SetTeensModeActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetTeensModeActionHandler$processWidgetAction$1(SetTeensModeActionHandler setTeensModeActionHandler, ActionV2Request actionV2Request, f.a aVar, b bVar, C7475g c7475g, d<? super SetTeensModeActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = setTeensModeActionHandler;
        this.$request = actionV2Request;
        this.$widgetInfo = aVar;
        this.$action = bVar;
        this.$widgetComponentStorage = c7475g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SetTeensModeActionHandler$processWidgetAction$1(this.this$0, this.$request, this.$widgetInfo, this.$action, this.$widgetComponentStorage, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        OzonPushManager ozonPushManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c n11 = this.$widgetInfo.c().n();
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, n11, SetTeensModeActionResponse.class, this);
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
        b bVar = this.$action;
        SetTeensModeActionHandler setTeensModeActionHandler = this.this$0;
        C7475g c7475g = this.$widgetComponentStorage;
        r.Companion companion = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b)) {
            ActionV2Response actionV2Response = (ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A;
            Map<String, String> params = ((AtomAction.Click) bVar).getParams();
            if (params != null && params.containsKey("teensMode")) {
                ozonPushManager = setTeensModeActionHandler.ozonPushManager;
                ozonPushManager.onNotificationStateChanged();
                SetTeensModeActionResponse setTeensModeActionResponse = (SetTeensModeActionResponse) actionV2Response.getData();
                setTeensModeActionHandler.setTeensModeCookie(setTeensModeActionResponse != null ? setTeensModeActionResponse.getRedirectLink() : null, params, c7475g);
            }
        }
        SetTeensModeActionHandler setTeensModeActionHandler2 = this.this$0;
        f.a aVar2 = this.$widgetInfo;
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            setTeensModeActionHandler2.showErrorNotification(aVar2.a());
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SetTeensModeActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
