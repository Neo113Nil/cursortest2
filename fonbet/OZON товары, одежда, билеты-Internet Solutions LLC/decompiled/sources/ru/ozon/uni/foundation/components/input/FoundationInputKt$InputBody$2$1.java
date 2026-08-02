package ru.ozon.uni.foundation.components.input;

import K1.K;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LK1/K;", "it", "", "invoke", "(LK1/K;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class FoundationInputKt$InputBody$2$1 extends AbstractC7737t implements Function1<K, Unit> {
    final /* synthetic */ InterfaceC3978p0<K> $textLayoutResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationInputKt$InputBody$2$1(InterfaceC3978p0<K> interfaceC3978p0) {
        super(1);
        this.$textLayoutResult = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(K k11) {
        invoke2(k11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(K it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$textLayoutResult.setValue(it);
    }
}
