package ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;
import xe.H0;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxe/M;", "invoke", "()Lxe/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class DelayedActionTextWatcher$coroutineScope$2 extends AbstractC7737t implements Function0<M> {
    final /* synthetic */ DelayedActionTextWatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DelayedActionTextWatcher$coroutineScope$2(DelayedActionTextWatcher delayedActionTextWatcher) {
        super(0);
        this.this$0 = delayedActionTextWatcher;
    }

    @Override // kotlin.jvm.functions.Function0
    public final M invoke() {
        CoroutineContext d11 = CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b());
        String simpleName = this.this$0.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return N.a(d11.plus(new L(simpleName)));
    }
}
