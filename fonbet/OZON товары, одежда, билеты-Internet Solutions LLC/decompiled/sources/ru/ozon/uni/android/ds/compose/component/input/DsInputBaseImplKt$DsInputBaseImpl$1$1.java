package ru.ozon.uni.android.ds.compose.component.input;

import S0.A1;
import Sc.s;
import Wc.a;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.uni.android.ds.compose.component.input.DsInputBaseImplKt$DsInputBaseImpl$1$1", f = "DsInputBaseImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class DsInputBaseImplKt$DsInputBaseImpl$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ A1<Boolean> $isFocused$delegate;
    final /* synthetic */ Function1<DsInputStatus, Unit> $onStatusChanged;
    final /* synthetic */ DsInputState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsInputBaseImplKt$DsInputBaseImpl$1$1(DsInputState dsInputState, Function1<? super DsInputStatus, Unit> function1, r rVar, A1<Boolean> a12, d<? super DsInputBaseImplKt$DsInputBaseImpl$1$1> dVar) {
        super(2, dVar);
        this.$state = dsInputState;
        this.$onStatusChanged = function1;
        this.$focusRequester = rVar;
        this.$isFocused$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DsInputBaseImplKt$DsInputBaseImpl$1$1(this.$state, this.$onStatusChanged, this.$focusRequester, this.$isFocused$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean DsInputBaseImpl_oiW5flc$lambda$1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.$state.isActive$uni_release()) {
            this.$onStatusChanged.invoke(DsInputStatus.NEUTRAL);
            this.$focusRequester.d();
        } else if (this.$state.isDisabled$uni_release()) {
            DsInputBaseImpl_oiW5flc$lambda$1 = DsInputBaseImplKt.DsInputBaseImpl_oiW5flc$lambda$1(this.$isFocused$delegate);
            if (DsInputBaseImpl_oiW5flc$lambda$1) {
                this.$focusRequester.e();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DsInputBaseImplKt$DsInputBaseImpl$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
