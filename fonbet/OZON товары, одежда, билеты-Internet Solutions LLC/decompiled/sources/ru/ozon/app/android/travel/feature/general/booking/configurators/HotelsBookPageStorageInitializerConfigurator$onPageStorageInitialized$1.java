package ru.ozon.app.android.travel.feature.general.booking.configurators;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.booking.configurators.HotelsBookPageStorageInitializerConfigurator$onPageStorageInitialized$1", f = "HotelsBookPageStorageInitializerConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HotelsBookPageStorageInitializerConfigurator$onPageStorageInitialized$1 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotelsBookPageStorageInitializerConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookPageStorageInitializerConfigurator$onPageStorageInitialized$1(HotelsBookPageStorageInitializerConfigurator hotelsBookPageStorageInitializerConfigurator, d<? super HotelsBookPageStorageInitializerConfigurator$onPageStorageInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsBookPageStorageInitializerConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsBookPageStorageInitializerConfigurator$onPageStorageInitialized$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.handleEvent();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((HotelsBookPageStorageInitializerConfigurator$onPageStorageInitialized$1) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
