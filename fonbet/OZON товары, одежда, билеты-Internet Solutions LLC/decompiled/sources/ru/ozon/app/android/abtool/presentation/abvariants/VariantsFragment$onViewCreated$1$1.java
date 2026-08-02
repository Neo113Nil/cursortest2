package ru.ozon.app.android.abtool.presentation.abvariants;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.AddVariantItem;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.ClearVariantsItem;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantsAdapter;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/abtool/presentation/abvariants/UiState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.presentation.abvariants.VariantsFragment$onViewCreated$1$1", f = "VariantsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class VariantsFragment$onViewCreated$1$1 extends j implements Function2<UiState, d<? super Unit>, Object> {
    final /* synthetic */ VariantsAdapter $adapter;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariantsFragment$onViewCreated$1$1(VariantsAdapter variantsAdapter, d<? super VariantsFragment$onViewCreated$1$1> dVar) {
        super(2, dVar);
        this.$adapter = variantsAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VariantsFragment$onViewCreated$1$1 variantsFragment$onViewCreated$1$1 = new VariantsFragment$onViewCreated$1$1(this.$adapter, dVar);
        variantsFragment$onViewCreated$1$1.L$0 = obj;
        return variantsFragment$onViewCreated$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        UiState uiState = (UiState) this.L$0;
        AddVariantItem addVariantItem = new AddVariantItem(null, uiState.getVariantsInput(), uiState.getIsValidVariantsInput(), 1, null);
        ClearVariantsItem clearVariantsItem = new ClearVariantsItem(null, 1, null);
        this.$adapter.submitList(C7714v.p0(C7714v.a0(clearVariantsItem), C7714v.p0(uiState.getItems(), C7714v.a0(addVariantItem))));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiState uiState, d<? super Unit> dVar) {
        return ((VariantsFragment$onViewCreated$1$1) create(uiState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
