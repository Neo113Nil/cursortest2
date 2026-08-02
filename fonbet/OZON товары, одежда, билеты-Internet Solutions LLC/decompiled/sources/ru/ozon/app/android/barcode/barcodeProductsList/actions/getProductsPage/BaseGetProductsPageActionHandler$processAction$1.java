package ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage;

import Sc.s;
import W10.c;
import Wc.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage.BaseGetProductsPageActionHandler$processAction$1", f = "BaseGetProductsPageActionHandler.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseGetProductsPageActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ ActionType $actionType;
    final /* synthetic */ ComposerReferences $composerRefs;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ String $widgetId;
    int label;
    final /* synthetic */ BaseGetProductsPageActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseGetProductsPageActionHandler$processAction$1(BaseGetProductsPageActionHandler baseGetProductsPageActionHandler, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, ComposerReferences composerReferences, String str, ActionType actionType, d<? super BaseGetProductsPageActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = baseGetProductsPageActionHandler;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
        this.$composerRefs = composerReferences;
        this.$widgetId = str;
        this.$actionType = actionType;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseGetProductsPageActionHandler$processAction$1(this.this$0, this.$action, this.$handlerRefs, this.$composerRefs, this.$widgetId, this.$actionType, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        LinkedHashMap linkedHashMap;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            String actionName = ((AtomAction.ComposerAction) this.$action).getActionName();
            Map<String, String> params = ((AtomAction.ComposerAction) this.$action).getParams();
            if (params != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    if (!Intrinsics.d(entry.getKey(), "getProductPageID")) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashMap = null;
            }
            ActionV2Request actionV2Request = new ActionV2Request(linkedHashMap, actionName, false, 4, null);
            c trackingData = this.$handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            this.label = 1;
            obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, GetProductsPageResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        ActionV2Response actionV2Response = (ActionV2Response) obj;
        ComposerReferences composerReferences = this.$composerRefs;
        String str = this.$widgetId;
        ActionType actionType = this.$actionType;
        Object data = actionV2Response.getData();
        if (data != null) {
            GetProductsPageResponse getProductsPageResponse = (GetProductsPageResponse) data;
            composerReferences.getController().update(new GetProductsPageUpdateKey(str, actionType, getProductsPageResponse.getProducts(), getProductsPageResponse.getButton()));
        } else if (actionV2Response.getError() != null) {
            RestrictionsUtilsKt.showNotification$default(composerReferences.getContainer(), StringProvider.getString(R$string.common_universal_network_error), NotificationDTO.Preset.WARNING, false, 4, null);
        } else {
            RestrictionsUtilsKt.showNotification$default(composerReferences.getContainer(), StringProvider.getString(R$string.common_universal_network_error), NotificationDTO.Preset.WARNING, false, 4, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BaseGetProductsPageActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
