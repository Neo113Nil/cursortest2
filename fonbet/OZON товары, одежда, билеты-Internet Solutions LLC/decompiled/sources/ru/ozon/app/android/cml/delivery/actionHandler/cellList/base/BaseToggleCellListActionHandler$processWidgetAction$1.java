package ru.ozon.app.android.cml.delivery.actionHandler.cellList.base;

import Sc.s;
import Tg.b;
import Vg.f;
import W10.c;
import Wc.a;
import a00.C4911f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.ButtonLoaderUpdateKey;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.actionHandler.cellList.base.BaseToggleCellListActionHandler$processWidgetAction$1", f = "BaseToggleCellListActionHandler.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseToggleCellListActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ long $itemId;
    final /* synthetic */ f.a $widgetInfo;
    Object L$0;
    int label;
    final /* synthetic */ BaseToggleCellListActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseToggleCellListActionHandler$processWidgetAction$1(b bVar, InterfaceC7851b interfaceC7851b, BaseToggleCellListActionHandler baseToggleCellListActionHandler, f.a aVar, long j11, C4911f c4911f, d<? super BaseToggleCellListActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.$action = bVar;
        this.$controller = interfaceC7851b;
        this.this$0 = baseToggleCellListActionHandler;
        this.$widgetInfo = aVar;
        this.$itemId = j11;
        this.$container = c4911f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseToggleCellListActionHandler$processWidgetAction$1(this.$action, this.$controller, this.this$0, this.$widgetInfo, this.$itemId, this.$container, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ActionV2Repository actionV2Repository;
        LinkedHashMap linkedHashMap;
        String str2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Map<String, String> params = ((AtomAction.ComposerAction) this.$action).getParams();
            if (params == null || (str = params.get("button_id")) == null) {
                return Unit.f71690a;
            }
            this.$controller.update(new ButtonLoaderUpdateKey(str, true));
            actionV2Repository = this.this$0.actionV2Repository;
            String actionName = ((AtomAction.ComposerAction) this.$action).getActionName();
            Map<String, String> params2 = ((AtomAction.ComposerAction) this.$action).getParams();
            if (params2 != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : params2.entrySet()) {
                    if (!Intrinsics.d(entry.getKey(), "button_id")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            ActionV2Request actionV2Request = new ActionV2Request(linkedHashMap, actionName, false, 4, null);
            c n11 = this.$widgetInfo.c().n();
            this.L$0 = str;
            this.label = 1;
            Object callActionWithTrackingSuspend = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, n11, ToggleCellListResponse.class, this);
            if (callActionWithTrackingSuspend == aVar) {
                return aVar;
            }
            str2 = str;
            obj = callActionWithTrackingSuspend;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$0;
            s.b(obj);
        }
        ActionV2Response actionV2Response = (ActionV2Response) obj;
        BaseToggleCellListActionHandler baseToggleCellListActionHandler = this.this$0;
        InterfaceC7851b interfaceC7851b = this.$controller;
        long j11 = this.$itemId;
        C4911f c4911f = this.$container;
        Object data = actionV2Response.getData();
        if (data != null) {
            baseToggleCellListActionHandler.handleSuccess(interfaceC7851b, (ToggleCellListResponse) data, j11);
        } else {
            actionV2Response.getError();
            baseToggleCellListActionHandler.handleFailure(c4911f, interfaceC7851b, str2);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BaseToggleCellListActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
