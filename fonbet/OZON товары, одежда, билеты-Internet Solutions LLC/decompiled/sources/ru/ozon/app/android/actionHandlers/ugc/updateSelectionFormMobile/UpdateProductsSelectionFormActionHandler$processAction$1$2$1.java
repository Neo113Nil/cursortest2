package ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile;

import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductPickerDTO;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductsUpdateActionResponse;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.UpdateProductsSelectionFormActionHandler$processAction$1$2$1", f = "UpdateProductsSelectionFormActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class UpdateProductsSelectionFormActionHandler$processAction$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ProductsUpdateActionResponse $response;
    int label;
    final /* synthetic */ UpdateProductsSelectionFormActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateProductsSelectionFormActionHandler$processAction$1$2$1(ProductsUpdateActionResponse productsUpdateActionResponse, UpdateProductsSelectionFormActionHandler updateProductsSelectionFormActionHandler, CustomActionHandler.HandlerReferences handlerReferences, d<? super UpdateProductsSelectionFormActionHandler$processAction$1$2$1> dVar) {
        super(2, dVar);
        this.$response = productsUpdateActionResponse;
        this.this$0 = updateProductsSelectionFormActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UpdateProductsSelectionFormActionHandler$processAction$1$2$1(this.$response, this.this$0, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationModelWrapper notification;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ProductsUpdateActionResponse productsUpdateActionResponse = this.$response;
        AtomActionDTO action = productsUpdateActionResponse != null ? productsUpdateActionResponse.getAction() : null;
        if (action != null) {
            ProductPickerDTO productPicker = this.$response.getProductPicker();
            if (productPicker != null) {
                ((ProductPickerViewModel) new z0(this.$handlerRefs.getRefs().getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.UpdateProductsSelectionFormActionHandler$processAction$1$2$1$invokeSuspend$lambda$2$$inlined$createViewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        return new ProductPickerViewModel();
                    }
                }).a(ProductPickerViewModel.class)).updateProductPickerModel(productPicker);
            }
            this.this$0.handleAction(AtomActionMapperKt.toAtomAction(action, null), this.$handlerRefs);
        } else {
            ProductsUpdateActionResponse productsUpdateActionResponse2 = this.$response;
            if (productsUpdateActionResponse2 != null && (notification = productsUpdateActionResponse2.getNotification()) != null) {
                UpdateProductsSelectionFormActionHandler updateProductsSelectionFormActionHandler = this.this$0;
                CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                if (notification instanceof NotificationDTO) {
                    updateProductsSelectionFormActionHandler.showNotification((NotificationDTO) notification, handlerReferences.getRefs());
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UpdateProductsSelectionFormActionHandler$processAction$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
