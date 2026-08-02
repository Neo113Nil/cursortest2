package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel$collectLatestIn$1", f = "FreshTileViewModel.kt", l = {327}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshTileViewModel$collectLatestIn$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function2<T, d<? super Unit>, Object> $collector;
    final /* synthetic */ InterfaceC2395h<T> $this_collectLatestIn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FreshTileViewModel$collectLatestIn$1(InterfaceC2395h<? extends T> interfaceC2395h, Function2<? super T, ? super d<? super Unit>, ? extends Object> function2, d<? super FreshTileViewModel$collectLatestIn$1> dVar) {
        super(2, dVar);
        this.$this_collectLatestIn = interfaceC2395h;
        this.$collector = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FreshTileViewModel$collectLatestIn$1(this.$this_collectLatestIn, this.$collector, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<T> interfaceC2395h = this.$this_collectLatestIn;
            Function2<T, d<? super Unit>, Object> function2 = this.$collector;
            this.label = 1;
            if (C2399j.h(interfaceC2395h, function2, this) == aVar) {
                return aVar;
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
        return ((FreshTileViewModel$collectLatestIn$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
