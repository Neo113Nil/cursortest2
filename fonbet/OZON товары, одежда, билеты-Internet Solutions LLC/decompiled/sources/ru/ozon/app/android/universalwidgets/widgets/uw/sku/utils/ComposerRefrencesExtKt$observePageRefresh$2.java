package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class ComposerRefrencesExtKt$observePageRefresh$2 extends C7735q implements Function2<a, d<? super Unit>, Object> {
    ComposerRefrencesExtKt$observePageRefresh$2(Object obj) {
        super(2, obj, Intrinsics.a.class, "suspendConversion0", "observePageRefresh$suspendConversion0(Lkotlin/jvm/functions/Function1;Lru/ozon/composer/event/ComposerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        Object observePageRefresh$suspendConversion0;
        observePageRefresh$suspendConversion0 = ComposerRefrencesExtKt.observePageRefresh$suspendConversion0((Function1) this.receiver, aVar, dVar);
        return observePageRefresh$suspendConversion0;
    }
}
