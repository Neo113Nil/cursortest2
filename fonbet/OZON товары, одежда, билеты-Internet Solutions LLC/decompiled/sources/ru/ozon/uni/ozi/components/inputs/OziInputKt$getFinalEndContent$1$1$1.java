package ru.ozon.uni.ozi.components.inputs;

import K1.C3422b;
import Q1.X;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziInputKt$getFinalEndContent$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<String, Unit> $copyTextAction;
    final /* synthetic */ String $value;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziInputKt$getFinalEndContent$1$1$1(X x11, String str, Function1<? super String, Unit> function1) {
        super(0);
        this.$visualTransformation = x11;
        this.$value = str;
        this.$copyTextAction = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$copyTextAction.invoke(this.$visualTransformation.filter(new C3422b(6, this.$value, null)).b().h());
    }
}
