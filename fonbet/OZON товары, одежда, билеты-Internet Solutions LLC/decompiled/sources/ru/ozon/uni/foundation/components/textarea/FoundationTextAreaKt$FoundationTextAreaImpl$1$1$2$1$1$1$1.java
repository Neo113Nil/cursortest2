package ru.ozon.uni.foundation.components.textarea;

import Q1.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class FoundationTextAreaKt$FoundationTextAreaImpl$1$1$2$1$1$1$1 extends C7735q implements Function1<K, Unit> {
    FoundationTextAreaKt$FoundationTextAreaImpl$1$1$2$1$1$1$1(Object obj) {
        super(1, obj, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(K k11) {
        invoke2(k11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(K p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((Function1) this.receiver).invoke(p02);
    }
}
