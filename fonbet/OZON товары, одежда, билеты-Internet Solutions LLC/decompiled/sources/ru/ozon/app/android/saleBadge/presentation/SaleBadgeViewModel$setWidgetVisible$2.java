package ru.ozon.app.android.saleBadge.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.saleBadge.presentation.SaleBadgeViewModel$setWidgetVisible$2", f = "SaleBadgeViewModel.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SaleBadgeViewModel$setWidgetVisible$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SaleBadgeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaleBadgeViewModel$setWidgetVisible$2(SaleBadgeViewModel saleBadgeViewModel, d<? super SaleBadgeViewModel$setWidgetVisible$2> dVar) {
        super(2, dVar);
        this.this$0 = saleBadgeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaleBadgeViewModel$setWidgetVisible$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0._isStartAnimation;
            this.label = 1;
            if (w0Var.emit(null, this) == aVar) {
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
        return ((SaleBadgeViewModel$setWidgetVisible$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
