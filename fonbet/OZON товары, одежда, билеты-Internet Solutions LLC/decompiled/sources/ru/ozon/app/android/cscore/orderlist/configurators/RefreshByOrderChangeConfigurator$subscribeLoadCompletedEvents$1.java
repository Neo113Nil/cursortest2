package ru.ozon.app.android.cscore.orderlist.configurators;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class RefreshByOrderChangeConfigurator$subscribeLoadCompletedEvents$1 extends C7719a implements Function2<a.o<?>, d<? super Unit>, Object> {
    RefreshByOrderChangeConfigurator$subscribeLoadCompletedEvents$1(Object obj) {
        super(2, obj, RefreshByOrderChangeConfigurator.class, "cachePage", "cachePage(Lru/ozon/composer/event/ComposerEvent$LoadCompleted;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.o<?> oVar, d<? super Unit> dVar) {
        Object subscribeLoadCompletedEvents$cachePage;
        subscribeLoadCompletedEvents$cachePage = RefreshByOrderChangeConfigurator.subscribeLoadCompletedEvents$cachePage((RefreshByOrderChangeConfigurator) this.receiver, oVar, dVar);
        return subscribeLoadCompletedEvents$cachePage;
    }
}
