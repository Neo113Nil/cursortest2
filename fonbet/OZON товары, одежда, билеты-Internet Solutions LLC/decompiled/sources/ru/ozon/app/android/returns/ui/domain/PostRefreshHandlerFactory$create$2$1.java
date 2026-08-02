package ru.ozon.app.android.returns.ui.domain;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PostRefreshHandlerFactory$create$2$1 extends C7735q implements Function2<a, d<? super Unit>, Object> {
    PostRefreshHandlerFactory$create$2$1(Object obj) {
        super(2, obj, Intrinsics.a.class, "suspendConversion0", "create$lambda$0$suspendConversion0(Lkotlin/jvm/functions/Function1;Lru/ozon/composer/event/ComposerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        Object create$lambda$0$suspendConversion0;
        create$lambda$0$suspendConversion0 = PostRefreshHandlerFactory.create$lambda$0$suspendConversion0((Function1) this.receiver, aVar, dVar);
        return create$lambda$0$suspendConversion0;
    }
}
