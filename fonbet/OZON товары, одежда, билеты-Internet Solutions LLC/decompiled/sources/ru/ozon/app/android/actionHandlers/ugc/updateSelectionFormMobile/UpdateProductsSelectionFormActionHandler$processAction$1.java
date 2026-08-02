package ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile;

import Sc.r;
import Sc.s;
import Wc.a;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductsUpdateActionResponse;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.UpdateProductsSelectionFormActionHandler$processAction$1", f = "UpdateProductsSelectionFormActionHandler.kt", l = {49, 54}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class UpdateProductsSelectionFormActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpdateProductsSelectionFormActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateProductsSelectionFormActionHandler$processAction$1(InterfaceC7851b interfaceC7851b, UpdateProductsSelectionFormActionHandler updateProductsSelectionFormActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, d<? super UpdateProductsSelectionFormActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$controller = interfaceC7851b;
        this.this$0 = updateProductsSelectionFormActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UpdateProductsSelectionFormActionHandler$processAction$1 updateProductsSelectionFormActionHandler$processAction$1 = new UpdateProductsSelectionFormActionHandler$processAction$1(this.$controller, this.this$0, this.$request, this.$handlerRefs, dVar);
        updateProductsSelectionFormActionHandler$processAction$1.L$0 = obj;
        return updateProductsSelectionFormActionHandler$processAction$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        Throwable b11;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            this.$controller.e(new l.a.C1079a(0L, null, 3));
            UpdateProductsSelectionFormActionHandler updateProductsSelectionFormActionHandler = this.this$0;
            ActionV2Request actionV2Request = this.$request;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = updateProductsSelectionFormActionHandler.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, ProductsUpdateActionResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                s.b(obj);
                a11 = obj2;
                InterfaceC7851b interfaceC7851b = this.$controller;
                UpdateProductsSelectionFormActionHandler updateProductsSelectionFormActionHandler2 = this.this$0;
                CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                b11 = r.b(a11);
                if (b11 != null) {
                    interfaceC7851b.hideLoader();
                    updateProductsSelectionFormActionHandler2.showErrorNotification(handlerReferences.getRefs());
                    Lm0.a.f17149a.e(b11);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (ProductsUpdateActionResponse) ((ActionV2Response) obj).getData();
        r.Companion companion3 = r.INSTANCE;
        InterfaceC7851b interfaceC7851b2 = this.$controller;
        UpdateProductsSelectionFormActionHandler updateProductsSelectionFormActionHandler3 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        if (!(a11 instanceof r.b)) {
            interfaceC7851b2.hideLoader();
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            UpdateProductsSelectionFormActionHandler$processAction$1$2$1 updateProductsSelectionFormActionHandler$processAction$1$2$1 = new UpdateProductsSelectionFormActionHandler$processAction$1$2$1((ProductsUpdateActionResponse) a11, updateProductsSelectionFormActionHandler3, handlerReferences2, null);
            this.L$0 = a11;
            this.label = 2;
            if (C10727i.f(l02, updateProductsSelectionFormActionHandler$processAction$1$2$1, this) != aVar) {
                obj2 = a11;
                a11 = obj2;
            }
            return aVar;
        }
        InterfaceC7851b interfaceC7851b3 = this.$controller;
        UpdateProductsSelectionFormActionHandler updateProductsSelectionFormActionHandler22 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences3 = this.$handlerRefs;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UpdateProductsSelectionFormActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
