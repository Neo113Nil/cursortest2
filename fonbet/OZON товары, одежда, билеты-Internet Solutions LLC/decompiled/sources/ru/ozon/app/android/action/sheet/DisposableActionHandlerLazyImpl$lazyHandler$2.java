package ru.ozon.app.android.action.sheet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DisposableActionHandlerLazyImpl$lazyHandler$2 extends AbstractC7737t implements Function0<DisposableActionHandler> {
    final /* synthetic */ Function0<DisposableActionHandler> $disposableActionHandlerProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DisposableActionHandlerLazyImpl$lazyHandler$2(Function0<? extends DisposableActionHandler> function0) {
        super(0);
        this.$disposableActionHandlerProvider = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DisposableActionHandler invoke() {
        return this.$disposableActionHandlerProvider.invoke();
    }
}
