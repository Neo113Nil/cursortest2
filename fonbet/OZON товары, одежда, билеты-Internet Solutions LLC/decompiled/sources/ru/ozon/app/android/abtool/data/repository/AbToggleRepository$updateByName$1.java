package ru.ozon.app.android.abtool.data.repository;

import Sc.s;
import Wc.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.data.repository.AbToggleRepository$updateByName$1", f = "AbToggleRepository.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbToggleRepository$updateByName$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ String $value;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbToggleRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToggleRepository$updateByName$1(AbToggleRepository abToggleRepository, String str, String str2, d<? super AbToggleRepository$updateByName$1> dVar) {
        super(2, dVar);
        this.this$0 = abToggleRepository;
        this.$name = str;
        this.$value = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbToggleRepository$updateByName$1(this.this$0, this.$name, this.$value, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FeatureRepository featureRepository;
        String str;
        AbToggleRepository abToggleRepository;
        Iterator it;
        FeatureRepository featureRepository2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            featureRepository = this.this$0.featureRepository;
            List<FeatureEntity> featuresByName$abzone_release = featureRepository.getFeaturesByName$abzone_release(this.$name);
            AbToggleRepository abToggleRepository2 = this.this$0;
            str = this.$value;
            abToggleRepository = abToggleRepository2;
            it = featuresByName$abzone_release.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            str = (String) this.L$1;
            abToggleRepository = (AbToggleRepository) this.L$0;
            s.b(obj);
        }
        while (it.hasNext()) {
            FeatureEntity featureEntity = (FeatureEntity) it.next();
            featureRepository2 = abToggleRepository.featureRepository;
            String id2 = featureEntity.getId();
            this.L$0 = abToggleRepository;
            this.L$1 = str;
            this.L$2 = it;
            this.label = 1;
            if (featureRepository2.updateFeatureCache(id2, str, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AbToggleRepository$updateByName$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
