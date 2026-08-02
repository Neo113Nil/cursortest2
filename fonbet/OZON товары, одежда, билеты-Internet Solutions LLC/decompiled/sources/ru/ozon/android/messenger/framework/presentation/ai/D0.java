package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.ai.O;

/* loaded from: classes10.dex */
final class D0 extends AbstractC7737t implements Function2<W, O, W> {

    /* renamed from: b, reason: collision with root package name */
    public static final D0 f89236b = new D0(2);

    @Override // kotlin.jvm.functions.Function2
    public final W invoke(W w11, O o11) {
        W state = w11;
        O mutation = o11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mutation, "mutation");
        if (mutation instanceof O.a) {
            return W.a(state, ((O.a) mutation).a());
        }
        throw new Sc.o();
    }
}
