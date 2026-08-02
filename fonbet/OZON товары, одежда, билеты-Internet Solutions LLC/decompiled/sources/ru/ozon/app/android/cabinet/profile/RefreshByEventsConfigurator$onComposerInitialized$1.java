package ru.ozon.app.android.cabinet.profile;

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

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cabinet.profile.RefreshByEventsConfigurator$onComposerInitialized$1", f = "RefreshByEventsConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class RefreshByEventsConfigurator$onComposerInitialized$1 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ RefreshByEventsConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshByEventsConfigurator$onComposerInitialized$1(RefreshByEventsConfigurator refreshByEventsConfigurator, d<? super RefreshByEventsConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = refreshByEventsConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RefreshByEventsConfigurator$onComposerInitialized$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC7851b controller;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references != null && (controller = references.getController()) != null) {
            InterfaceC7851b.a.a(controller, null, null, null, null, 15);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((RefreshByEventsConfigurator$onComposerInitialized$1) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
