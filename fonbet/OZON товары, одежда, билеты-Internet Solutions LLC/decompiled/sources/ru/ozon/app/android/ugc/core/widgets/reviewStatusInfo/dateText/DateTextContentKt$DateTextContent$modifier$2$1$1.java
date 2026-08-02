package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DateTextContentKt$DateTextContent$modifier$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ b $it;
    final /* synthetic */ Function1<b, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DateTextContentKt$DateTextContent$modifier$2$1$1(Function1<? super b, Unit> function1, b bVar) {
        super(0);
        this.$onAction = function1;
        this.$it = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAction.invoke(this.$it);
    }
}
