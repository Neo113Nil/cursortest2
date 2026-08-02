package ru.ozon.app.android.abtool.data.repository;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.data.local.LocalDataSource;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "LSc/r;", "", "Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.data.repository.AbVariantsRepository$getExperiments$2", f = "AbVariantsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AbVariantsRepository$getExperiments$2 extends j implements Function2<M, d<? super r<? extends List<? extends ExperimentEntity>>>, Object> {
    int label;
    final /* synthetic */ AbVariantsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbVariantsRepository$getExperiments$2(AbVariantsRepository abVariantsRepository, d<? super AbVariantsRepository$getExperiments$2> dVar) {
        super(2, dVar);
        this.this$0 = abVariantsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbVariantsRepository$getExperiments$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends List<? extends ExperimentEntity>>> dVar) {
        return invoke2(m11, (d<? super r<? extends List<ExperimentEntity>>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LocalDataSource localDataSource;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        localDataSource = this.this$0.localDataSource;
        return r.a(localDataSource.m448getAbVariantsd1pmJ48());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<? extends List<ExperimentEntity>>> dVar) {
        return ((AbVariantsRepository$getExperiments$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
