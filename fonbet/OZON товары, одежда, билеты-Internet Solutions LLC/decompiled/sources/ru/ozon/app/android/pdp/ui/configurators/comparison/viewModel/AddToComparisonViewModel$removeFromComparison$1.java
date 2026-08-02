package ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel;

import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.comparison.RemoveFromComparisonResponse;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "Lru/ozon/app/android/comparison/RemoveFromComparisonResponse;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.AddToComparisonViewModel$removeFromComparison$1", f = "AddToComparisonViewModel.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER, DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToComparisonViewModel$removeFromComparison$1 extends j implements Function2<InterfaceC2397i<? super RemoveFromComparisonResponse>, d<? super Unit>, Object> {
    final /* synthetic */ String $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToComparisonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToComparisonViewModel$removeFromComparison$1(AddToComparisonViewModel addToComparisonViewModel, String str, d<? super AddToComparisonViewModel$removeFromComparison$1> dVar) {
        super(2, dVar);
        this.this$0 = addToComparisonViewModel;
        this.$params = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToComparisonViewModel$removeFromComparison$1 addToComparisonViewModel$removeFromComparison$1 = new AddToComparisonViewModel$removeFromComparison$1(this.this$0, this.$params, dVar);
        addToComparisonViewModel$removeFromComparison$1.L$0 = obj;
        return addToComparisonViewModel$removeFromComparison$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super RemoveFromComparisonResponse> interfaceC2397i, d<? super Unit> dVar) {
        return ((AddToComparisonViewModel$removeFromComparison$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        ComparisonRepository comparisonRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            comparisonRepository = this.this$0.comparisonRepository;
            String str = this.$params;
            this.L$0 = interfaceC2397i;
            this.label = 1;
            obj = comparisonRepository.removeFromComparison(str, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            Object value = ((Result.Success) result).getValue();
            this.L$0 = null;
            this.label = 2;
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            Lm0.a.f17149a.e(((Result.Failure) result).getThrowable());
        }
        return Unit.f71690a;
    }
}
