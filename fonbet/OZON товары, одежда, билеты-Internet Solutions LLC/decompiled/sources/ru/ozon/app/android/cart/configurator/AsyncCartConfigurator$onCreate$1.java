package ru.ozon.app.android.cart.configurator;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.configurator.AsyncCartConfigurator$onCreate$1", f = "AsyncCartConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AsyncCartConfigurator$onCreate$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AsyncCartConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncCartConfigurator$onCreate$1(AsyncCartConfigurator asyncCartConfigurator, d<? super AsyncCartConfigurator$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = asyncCartConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AsyncCartConfigurator$onCreate$1 asyncCartConfigurator$onCreate$1 = new AsyncCartConfigurator$onCreate$1(this.this$0, dVar);
        asyncCartConfigurator$onCreate$1.Z$0 = ((Boolean) obj).booleanValue();
        return asyncCartConfigurator$onCreate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.Z$0 && (references = this.this$0.getReferences()) != null && (controller = references.getController()) != null) {
            controller.update(StartAsyncProcessing.INSTANCE);
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((AsyncCartConfigurator$onCreate$1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
