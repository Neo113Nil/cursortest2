package ru.ozon.app.android.switchUser.loader;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.switchUser.loader.LoaderEventBus;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/switchUser/loader/LoaderEventBus$Event;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.switchUser.loader.LoaderConfigurator$onComposerInitialized$1", f = "LoaderConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class LoaderConfigurator$onComposerInitialized$1 extends j implements Function2<LoaderEventBus.Event, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7851b $controller;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoaderConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoaderConfigurator$onComposerInitialized$1(LoaderConfigurator loaderConfigurator, InterfaceC7851b interfaceC7851b, d<? super LoaderConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = loaderConfigurator;
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        LoaderConfigurator$onComposerInitialized$1 loaderConfigurator$onComposerInitialized$1 = new LoaderConfigurator$onComposerInitialized$1(this.this$0, this.$controller, dVar);
        loaderConfigurator$onComposerInitialized$1.L$0 = obj;
        return loaderConfigurator$onComposerInitialized$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.onLoaderEvent((LoaderEventBus.Event) this.L$0, this.$controller);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LoaderEventBus.Event event, d<? super Unit> dVar) {
        return ((LoaderConfigurator$onComposerInitialized$1) create(event, dVar)).invokeSuspend(Unit.f71690a);
    }
}
