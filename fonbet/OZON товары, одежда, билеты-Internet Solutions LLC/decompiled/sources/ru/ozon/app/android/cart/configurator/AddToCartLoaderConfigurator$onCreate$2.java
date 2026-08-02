package ru.ozon.app.android.cart.configurator;

import An.C2439a;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import l10.InterfaceC7851b;
import ru.ozon.app.android.cart.common.domain.AddToCartRequestState;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/cart/common/domain/AddToCartRequestState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.configurator.AddToCartLoaderConfigurator$onCreate$2", f = "AddToCartLoaderConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AddToCartLoaderConfigurator$onCreate$2 extends j implements Function2<AddToCartRequestState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToCartLoaderConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartLoaderConfigurator$onCreate$2(AddToCartLoaderConfigurator addToCartLoaderConfigurator, d<? super AddToCartLoaderConfigurator$onCreate$2> dVar) {
        super(2, dVar);
        this.this$0 = addToCartLoaderConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToCartLoaderConfigurator$onCreate$2 addToCartLoaderConfigurator$onCreate$2 = new AddToCartLoaderConfigurator$onCreate$2(this.this$0, dVar);
        addToCartLoaderConfigurator$onCreate$2.L$0 = obj;
        return addToCartLoaderConfigurator$onCreate$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        String redirectLink;
        InterfaceC7851b controller2;
        InterfaceC7851b controller3;
        InterfaceC7851b controller4;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddToCartRequestState addToCartRequestState = (AddToCartRequestState) this.L$0;
        if (addToCartRequestState instanceof AddToCartRequestState.Loading) {
            ConfiguratorReferences references2 = this.this$0.getReferences();
            if (references2 != null && (controller4 = references2.getController()) != null) {
                C2439a.b(0L, null, 3, controller4);
            }
        } else if (addToCartRequestState instanceof AddToCartRequestState.Error) {
            ConfiguratorReferences references3 = this.this$0.getReferences();
            if (references3 != null && (controller3 = references3.getController()) != null) {
                controller3.hideLoader();
            }
        } else if ((addToCartRequestState instanceof AddToCartRequestState.Success) && (redirectLink = ((AddToCartRequestState.Success) addToCartRequestState).getRedirectLink()) != null && !h.K(redirectLink)) {
            ConfiguratorReferences references4 = this.this$0.getReferences();
            if (references4 != null && (controller2 = references4.getController()) != null) {
                controller2.hideLoader();
            }
        } else if ((addToCartRequestState instanceof AddToCartRequestState.HideLoading) && (references = this.this$0.getReferences()) != null && (controller = references.getController()) != null) {
            controller.hideLoader();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddToCartRequestState addToCartRequestState, d<? super Unit> dVar) {
        return ((AddToCartLoaderConfigurator$onCreate$2) create(addToCartRequestState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
