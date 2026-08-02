package ru.ozon.uni.foundation.components.textarea;

import j1.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj1/v;", "it", "", "invoke", "(Lj1/v;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1 extends AbstractC7737t implements Function1<v, Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$onFocusChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(v vVar) {
        invoke2(vVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onFocusChanged.invoke(Boolean.valueOf(it.a()));
    }
}
