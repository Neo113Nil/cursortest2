package ru.ozon.app.android.abtool.presentation.debug;

import Sc.s;
import Wc.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.abtool.data.repository.AbVariantsDataStoreRepository;
import ru.ozon.app.android.abtool.utils.AbVariantUtils;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.presentation.debug.AbDebugViewModel$removeVariants$1", f = "AbDebugViewModel.kt", l = {51, 53}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbDebugViewModel$removeVariants$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbDebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbDebugViewModel$removeVariants$1(AbDebugViewModel abDebugViewModel, d<? super AbDebugViewModel$removeVariants$1> dVar) {
        super(2, dVar);
        this.this$0 = abDebugViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbDebugViewModel$removeVariants$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.clear(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r5.removeVariants(r1, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        AbVariantsDataStoreRepository abVariantsDataStoreRepository;
        String str2;
        AbVariantsDataStoreRepository abVariantsDataStoreRepository2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            str = this.this$0.variantsParam;
            if (h.K(str)) {
                abVariantsDataStoreRepository2 = this.this$0.variantsRepository;
                this.label = 1;
            } else {
                abVariantsDataStoreRepository = this.this$0.variantsRepository;
                AbVariantUtils abVariantUtils = AbVariantUtils.INSTANCE;
                str2 = this.this$0.variantsParam;
                String[] strArr = (String[]) abVariantUtils.splitToSet(str2).toArray(new String[0]);
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                this.label = 2;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AbDebugViewModel$removeVariants$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
