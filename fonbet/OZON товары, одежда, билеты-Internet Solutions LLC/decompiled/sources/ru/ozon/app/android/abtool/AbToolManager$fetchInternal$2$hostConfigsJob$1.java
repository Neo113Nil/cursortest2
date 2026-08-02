package ru.ozon.app.android.abtool;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.data.repository.FeatureRepository;
import ru.ozon.app.android.abtool.domain.AbToolInteractor;
import ru.ozon.app.android.abtool.domain.ConfigsEntity;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/abtool/domain/ConfigsEntity;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/abtool/domain/ConfigsEntity;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.AbToolManager$fetchInternal$2$hostConfigsJob$1", f = "AbToolManager.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AbToolManager$fetchInternal$2$hostConfigsJob$1 extends j implements Function2<M, d<? super ConfigsEntity>, Object> {
    int label;
    final /* synthetic */ AbToolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolManager$fetchInternal$2$hostConfigsJob$1(AbToolManager abToolManager, d<? super AbToolManager$fetchInternal$2$hostConfigsJob$1> dVar) {
        super(2, dVar);
        this.this$0 = abToolManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbToolManager$fetchInternal$2$hostConfigsJob$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbToolInteractor abToolInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        abToolInteractor = this.this$0.abToolHostInteractor;
        FeatureRepository featureRepository = abToolInteractor.getFeatureRepository();
        this.label = 1;
        Object fetch = featureRepository.fetch(this);
        return fetch == aVar ? aVar : fetch;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ConfigsEntity> dVar) {
        return ((AbToolManager$fetchInternal$2$hostConfigsJob$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
