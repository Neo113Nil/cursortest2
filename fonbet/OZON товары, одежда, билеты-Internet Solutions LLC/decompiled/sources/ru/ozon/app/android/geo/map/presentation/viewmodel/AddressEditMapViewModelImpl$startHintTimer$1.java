package ru.ozon.app.android.geo.map.presentation.viewmodel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl$startHintTimer$1", f = "AddressEditMapViewModel.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressEditMapViewModelImpl$startHintTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $hintDelayMs;
    int label;
    final /* synthetic */ AddressEditMapViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewModelImpl$startHintTimer$1(long j11, AddressEditMapViewModelImpl addressEditMapViewModelImpl, d<? super AddressEditMapViewModelImpl$startHintTimer$1> dVar) {
        super(2, dVar);
        this.$hintDelayMs = j11;
        this.this$0 = addressEditMapViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressEditMapViewModelImpl$startHintTimer$1(this.$hintDelayMs, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long j11 = this.$hintDelayMs;
            this.label = 1;
            if (Y.b(j11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.getBannerState().postValue(AddressEditMapViewModel.BannerState.SHOW_HINT);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressEditMapViewModelImpl$startHintTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
