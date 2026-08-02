package ru.ozon.app.android.storefront.deeplinkhandlers;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.common.actionHandlers.setTeensMode.SetTeensModeActionResponse;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeInfo;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.deeplinkhandlers.TeensModeDeeplinkHandler$setTeensMode$1", f = "TeensModeDeeplinkHandler.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TeensModeDeeplinkHandler$setTeensMode$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ boolean $teensModeOn;
    int label;
    final /* synthetic */ TeensModeDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TeensModeDeeplinkHandler$setTeensMode$1(TeensModeDeeplinkHandler teensModeDeeplinkHandler, ActionV2Request actionV2Request, boolean z11, d<? super TeensModeDeeplinkHandler$setTeensMode$1> dVar) {
        super(2, dVar);
        this.this$0 = teensModeDeeplinkHandler;
        this.$request = actionV2Request;
        this.$teensModeOn = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TeensModeDeeplinkHandler$setTeensMode$1(this.this$0, this.$request, this.$teensModeOn, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo479requestActionResult0E7RQCE;
        OzonPushManager ozonPushManager;
        TeensModeService teensModeService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            this.label = 1;
            mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, SetTeensModeActionResponse.class, this);
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
        TeensModeDeeplinkHandler teensModeDeeplinkHandler = this.this$0;
        boolean z11 = this.$teensModeOn;
        r.Companion companion = r.INSTANCE;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
            ozonPushManager = teensModeDeeplinkHandler.ozonPushManager;
            ozonPushManager.onNotificationStateChanged();
            teensModeService = teensModeDeeplinkHandler.teensModeService;
            teensModeService.setTeensModeCookieChanged(new TeensModeInfo(z11, "ozon://home"));
        }
        Throwable b11 = r.b(mo479requestActionResult0E7RQCE);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TeensModeDeeplinkHandler$setTeensMode$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
