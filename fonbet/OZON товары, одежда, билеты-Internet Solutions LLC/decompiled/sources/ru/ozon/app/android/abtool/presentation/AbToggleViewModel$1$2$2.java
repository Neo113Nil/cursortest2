package ru.ozon.app.android.abtool.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.AbToolImpl;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;
import ru.ozon.app.android.abtool.presentation.features.recycler.FeatureItem;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "features", "", "Lru/ozon/app/android/abtool/domain/FeatureDebugModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1$2$2", f = "AbToggleViewModel.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbToggleViewModel$1$2$2 extends j implements Function2<List<? extends FeatureDebugModel>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbToggleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToggleViewModel$1$2$2(AbToggleViewModel abToggleViewModel, d<? super AbToggleViewModel$1$2$2> dVar) {
        super(2, dVar);
        this.this$0 = abToggleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AbToggleViewModel$1$2$2 abToggleViewModel$1$2$2 = new AbToggleViewModel$1$2$2(this.this$0, dVar);
        abToggleViewModel$1$2$2.L$0 = obj;
        return abToggleViewModel$1$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends FeatureDebugModel> list, d<? super Unit> dVar) {
        return invoke2((List<FeatureDebugModel>) list, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbToolImpl abToolImpl;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            List<FeatureDebugModel> list = (List) this.L$0;
            AbToggleViewModel abToggleViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (FeatureDebugModel featureDebugModel : list) {
                abToolImpl = abToggleViewModel.abTool;
                arrayList.add(new FeatureItem(featureDebugModel, null, abToolImpl.getFeatureServiceConfig().getIsPlatformOverridesEnabled(), 2, null));
            }
            x0 x0Var = this.this$0.featureItems;
            this.label = 1;
            if (x0Var.emit(arrayList, this) == aVar) {
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<FeatureDebugModel> list, d<? super Unit> dVar) {
        return ((AbToggleViewModel$1$2$2) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
