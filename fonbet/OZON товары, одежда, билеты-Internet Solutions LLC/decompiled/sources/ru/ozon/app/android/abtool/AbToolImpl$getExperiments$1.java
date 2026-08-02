package ru.ozon.app.android.abtool;

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
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "Lru/ozon/app/android/abtool/Experiment;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.AbToolImpl$getExperiments$1", f = "AbToolImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbToolImpl$getExperiments$1 extends j implements Function2<M, d<? super List<? extends Experiment>>, Object> {
    final /* synthetic */ AbToolNamespace $namespace;
    int label;
    final /* synthetic */ AbToolImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolImpl$getExperiments$1(AbToolImpl abToolImpl, AbToolNamespace abToolNamespace, d<? super AbToolImpl$getExperiments$1> dVar) {
        super(2, dVar);
        this.this$0 = abToolImpl;
        this.$namespace = abToolNamespace;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbToolImpl$getExperiments$1(this.this$0, this.$namespace, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends Experiment>> dVar) {
        return invoke2(m11, (d<? super List<Experiment>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbToolManager abToolManager;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        abToolManager = this.this$0.getAbToolManager();
        List<Experiment> experiments = abToolManager.getExperiments(this.$namespace);
        ArrayList arrayList = new ArrayList(C7714v.z(experiments, 10));
        for (Experiment experiment : experiments) {
            arrayList.add(new Experiment(experiment.getId(), experiment.getVariantId(), experiment.getAlias()));
        }
        return arrayList;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<Experiment>> dVar) {
        return ((AbToolImpl$getExperiments$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
