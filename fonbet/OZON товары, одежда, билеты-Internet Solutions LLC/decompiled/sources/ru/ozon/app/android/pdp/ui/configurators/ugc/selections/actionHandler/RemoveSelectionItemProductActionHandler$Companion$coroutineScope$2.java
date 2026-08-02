package ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler.RemoveSelectionItemProductActionHandler;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxe/M;", "invoke", "()Lxe/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class RemoveSelectionItemProductActionHandler$Companion$coroutineScope$2 extends AbstractC7737t implements Function0<M> {
    public static final RemoveSelectionItemProductActionHandler$Companion$coroutineScope$2 INSTANCE = new RemoveSelectionItemProductActionHandler$Companion$coroutineScope$2();

    RemoveSelectionItemProductActionHandler$Companion$coroutineScope$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final M invoke() {
        RemoveSelectionItemProductActionHandler.Companion companion;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        companion = RemoveSelectionItemProductActionHandler.Companion;
        String simpleName = companion.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return N.a(d11.plus(new L(simpleName)).plus(new RemoveSelectionItemProductActionHandler$Companion$coroutineScope$2$invoke$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }
}
