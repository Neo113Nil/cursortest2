package ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel;

import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.comparison.AddToComparisonResponse;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "Lru/ozon/app/android/comparison/AddToComparisonResponse;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.AddToComparisonViewModel$addToComparison$1", f = "AddToComparisonViewModel.kt", l = {19, 20}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToComparisonViewModel$addToComparison$1 extends j implements Function2<InterfaceC2397i<? super AddToComparisonResponse>, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToComparisonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToComparisonViewModel$addToComparison$1(AddToComparisonViewModel addToComparisonViewModel, Map<String, String> map, d<? super AddToComparisonViewModel$addToComparison$1> dVar) {
        super(2, dVar);
        this.this$0 = addToComparisonViewModel;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToComparisonViewModel$addToComparison$1 addToComparisonViewModel$addToComparison$1 = new AddToComparisonViewModel$addToComparison$1(this.this$0, this.$params, dVar);
        addToComparisonViewModel$addToComparison$1.L$0 = obj;
        return addToComparisonViewModel$addToComparison$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super AddToComparisonResponse> interfaceC2397i, d<? super Unit> dVar) {
        return ((AddToComparisonViewModel$addToComparison$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
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
            Map<String, String> map = this.$params;
            this.L$0 = interfaceC2397i;
            this.label = 1;
            obj = comparisonRepository.addToComparison(map, this);
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
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                throw ((Result.Failure) result).getThrowable();
            }
            throw new o();
        }
        Object value = ((Result.Success) result).getValue();
        this.L$0 = null;
        this.label = 2;
    }
}
