package ru.ozon.app.android.abtool.presentation.debug;

import Sc.s;
import Wc.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.data.repository.AbVariantsDataStoreRepository;
import ru.ozon.app.android.abtool.utils.AbVariantUtils;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.presentation.debug.AbDebugViewModel$replaceVariants$1", f = "AbDebugViewModel.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbDebugViewModel$replaceVariants$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbDebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbDebugViewModel$replaceVariants$1(AbDebugViewModel abDebugViewModel, d<? super AbDebugViewModel$replaceVariants$1> dVar) {
        super(2, dVar);
        this.this$0 = abDebugViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbDebugViewModel$replaceVariants$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbVariantsDataStoreRepository abVariantsDataStoreRepository;
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            abVariantsDataStoreRepository = this.this$0.variantsRepository;
            AbVariantUtils abVariantUtils = AbVariantUtils.INSTANCE;
            str = this.this$0.variantsParam;
            Set<String> splitToSet = abVariantUtils.splitToSet(str);
            this.label = 1;
            if (abVariantsDataStoreRepository.setVariants(splitToSet, this) == aVar) {
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
        return ((AbDebugViewModel$replaceVariants$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
