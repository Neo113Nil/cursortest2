package ru.ozon.app.android.abtool.presentation.debug;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.R$string;
import ru.ozon.app.android.abtool.databinding.FragmentAbDebugBinding;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/abtool/presentation/debug/UiState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.presentation.debug.AbDebugFragment$onViewCreated$1$2", f = "AbDebugFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbDebugFragment$onViewCreated$1$2 extends j implements Function2<UiState, d<? super Unit>, Object> {
    final /* synthetic */ FragmentAbDebugBinding $this_with;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbDebugFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbDebugFragment$onViewCreated$1$2(FragmentAbDebugBinding fragmentAbDebugBinding, AbDebugFragment abDebugFragment, d<? super AbDebugFragment$onViewCreated$1$2> dVar) {
        super(2, dVar);
        this.$this_with = fragmentAbDebugBinding;
        this.this$0 = abDebugFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AbDebugFragment$onViewCreated$1$2 abDebugFragment$onViewCreated$1$2 = new AbDebugFragment$onViewCreated$1$2(this.$this_with, this.this$0, dVar);
        abDebugFragment$onViewCreated$1$2.L$0 = obj;
        return abDebugFragment$onViewCreated$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$this_with.tvAbVariants.setText(this.this$0.getString(R$string.ab_variants_list, ((UiState) this.L$0).getVariants()));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiState uiState, d<? super Unit> dVar) {
        return ((AbDebugFragment$onViewCreated$1$2) create(uiState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
