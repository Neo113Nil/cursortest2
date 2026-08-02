package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmptyStateView$bindOrGoneWithPaddingsRefresh$1 extends AbstractC7737t implements Function1<String, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EmptyStateView$bindOrGoneWithPaddingsRefresh$1(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<AtomAction, Unit> function1 = this.$onAction;
        if (function1 != null) {
            function1.invoke(new AtomAction.Move(it, null, null, null, 10, null));
        }
        return Boolean.TRUE;
    }
}
