package ru.ozon.uni.ozi.components.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziExpandableTextBlockItemImplKt$ExpandableTextBlockItemWrapper$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ Function0<Unit> $onExpand;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OziExpandableTextBlockItemImplKt$ExpandableTextBlockItemWrapper$2(boolean z11, Function0<Unit> function0) {
        super(0);
        this.$isExpanded = z11;
        this.$onExpand = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isExpanded) {
            return;
        }
        this.$onExpand.invoke();
    }
}
