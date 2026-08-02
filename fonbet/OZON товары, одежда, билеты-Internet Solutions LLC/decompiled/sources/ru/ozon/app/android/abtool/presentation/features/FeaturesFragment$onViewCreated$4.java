package ru.ozon.app.android.abtool.presentation.features;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.presentation.features.recycler.AbToggleAdapter;
import ru.ozon.app.android.abtool.presentation.features.recycler.ListItem;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.presentation.features.FeaturesFragment$onViewCreated$4", f = "FeaturesFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class FeaturesFragment$onViewCreated$4 extends j implements Function2<List<? extends ListItem>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FeaturesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeaturesFragment$onViewCreated$4(FeaturesFragment featuresFragment, d<? super FeaturesFragment$onViewCreated$4> dVar) {
        super(2, dVar);
        this.this$0 = featuresFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FeaturesFragment$onViewCreated$4 featuresFragment$onViewCreated$4 = new FeaturesFragment$onViewCreated$4(this.this$0, dVar);
        featuresFragment$onViewCreated$4.L$0 = obj;
        return featuresFragment$onViewCreated$4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbToggleAdapter abToggleAdapter;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List list = (List) this.L$0;
        abToggleAdapter = this.this$0.adapter;
        abToggleAdapter.submitList(list);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends ListItem> list, d<? super Unit> dVar) {
        return ((FeaturesFragment$onViewCreated$4) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
