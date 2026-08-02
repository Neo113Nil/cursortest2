package ru.ozon.android.composerCommonViewKit.emptyState.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmptyStateWidgetComponent$Companion$invoke$1$1$actionHandlersFactory$2 extends AbstractC7737t implements Function0<ActionHandlersFactory> {
    final /* synthetic */ Function1<C7475g, ActionHandlersFactory> $pActionHandlersFactory;
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EmptyStateWidgetComponent$Companion$invoke$1$1$actionHandlersFactory$2(Function1<? super C7475g, ? extends ActionHandlersFactory> function1, C7475g c7475g) {
        super(0);
        this.$pActionHandlersFactory = function1;
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ActionHandlersFactory invoke() {
        return this.$pActionHandlersFactory.invoke(this.$storage);
    }
}
