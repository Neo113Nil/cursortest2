package ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator;

import A00.a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator$onComposerInitialized$1", f = "EdgeConfigurator.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class EdgeConfigurator$onComposerInitialized$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ EdgeConfigurator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EdgeConfigurator$onComposerInitialized$1(EdgeConfigurator<T> edgeConfigurator, d<? super EdgeConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = edgeConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EdgeConfigurator$onComposerInitialized$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC7851b controller;
        InterfaceC2395h<a> eventsFlow;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ConfiguratorReferences references = this.this$0.getReferences();
            if (references != null && (controller = references.getController()) != null && (eventsFlow = controller.getEventsFlow()) != null) {
                final EdgeConfigurator<T> edgeConfigurator = this.this$0;
                InterfaceC2397i<? super a> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator$onComposerInitialized$1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((a) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(a aVar2, d<? super Unit> dVar) {
                        boolean z11 = aVar2 instanceof a.o;
                        if (z11 && !((a.o) aVar2).f().d().isEmpty()) {
                            ((EdgeConfigurator) edgeConfigurator).needToApplyWindowSettings = true;
                            edgeConfigurator.tryToApplyWindowSettings();
                        } else if (z11 && ((ArrayList) ((a.o) aVar2).f().d()).isEmpty()) {
                            ((EdgeConfigurator) edgeConfigurator).needToApplyWindowSettings = false;
                            edgeConfigurator.tryToRestoreWindowSettings();
                        } else if (aVar2 instanceof a.p) {
                            ((EdgeConfigurator) edgeConfigurator).needToApplyWindowSettings = false;
                            edgeConfigurator.tryToRestoreWindowSettings();
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (eventsFlow.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EdgeConfigurator$onComposerInitialized$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
