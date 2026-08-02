package ru.ozon.app.android.abtool.data.repository;

import Sc.s;
import W2.b;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.M;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.data.repository.AbVariantsDataSource;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/b;", "prefs", "", "<anonymous>", "(LW2/b;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.data.repository.AbVariantsDataSource$clearVariants$2", f = "AbVariantsDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbVariantsDataSource$clearVariants$2 extends j implements Function2<b, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    AbVariantsDataSource$clearVariants$2(d<? super AbVariantsDataSource$clearVariants$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AbVariantsDataSource$clearVariants$2 abVariantsDataSource$clearVariants$2 = new AbVariantsDataSource$clearVariants$2(dVar);
        abVariantsDataSource$clearVariants$2.L$0 = obj;
        return abVariantsDataSource$clearVariants$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b bVar, d<? super Unit> dVar) {
        return ((AbVariantsDataSource$clearVariants$2) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbVariantsDataSource.Companion companion;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        b bVar = (b) this.L$0;
        companion = AbVariantsDataSource.Companion;
        bVar.i(companion.getKeyAbVariants(), M.f71699a);
        return Unit.f71690a;
    }
}
