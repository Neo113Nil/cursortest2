package ru.ozon.app.android.fresh.chat.viewModels;

import Ae.x0;
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
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel$setLoading$1", f = "FreshAISharedViewModel.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshAISharedViewModel$setLoading$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Long $delayMillis;
    final /* synthetic */ boolean $isLoading;
    int label;
    final /* synthetic */ FreshAISharedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshAISharedViewModel$setLoading$1(Long l11, FreshAISharedViewModel freshAISharedViewModel, boolean z11, d<? super FreshAISharedViewModel$setLoading$1> dVar) {
        super(2, dVar);
        this.$delayMillis = l11;
        this.this$0 = freshAISharedViewModel;
        this.$isLoading = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FreshAISharedViewModel$setLoading$1(this.$delayMillis, this.this$0, this.$isLoading, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        x0 x0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Long l11 = this.$delayMillis;
            if (l11 == null) {
                x0Var = this.this$0._loadingStateFlow;
                x0Var.setValue(Boolean.valueOf(this.$isLoading));
                return Unit.f71690a;
            }
            long longValue = l11.longValue();
            this.label = 1;
            if (Y.b(longValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        x0Var2 = this.this$0._loadingStateFlow;
        x0Var2.setValue(Boolean.valueOf(this.$isLoading));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshAISharedViewModel$setLoading$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
