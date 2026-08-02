package ru.ozon.app.android.abtool.presentation.abvariants;

import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.data.repository.AbVariantsDataStoreRepository;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantItem;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.presentation.abvariants.VariantsViewModel$onRemoveVariantClick$1", f = "VariantsViewModel.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class VariantsViewModel$onRemoveVariantClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ VariantItem $variant;
    int label;
    final /* synthetic */ VariantsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariantsViewModel$onRemoveVariantClick$1(VariantsViewModel variantsViewModel, VariantItem variantItem, d<? super VariantsViewModel$onRemoveVariantClick$1> dVar) {
        super(2, dVar);
        this.this$0 = variantsViewModel;
        this.$variant = variantItem;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VariantsViewModel$onRemoveVariantClick$1(this.this$0, this.$variant, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbVariantsDataStoreRepository abVariantsDataStoreRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            abVariantsDataStoreRepository = this.this$0.variantsRepository;
            String[] strArr = {this.$variant.getId()};
            this.label = 1;
            if (abVariantsDataStoreRepository.removeVariants(strArr, this) == aVar) {
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
        return ((VariantsViewModel$onRemoveVariantClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
