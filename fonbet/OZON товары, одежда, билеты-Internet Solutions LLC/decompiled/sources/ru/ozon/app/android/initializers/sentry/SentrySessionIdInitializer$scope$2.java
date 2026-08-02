package ru.ozon.app.android.initializers.sentry;

import He.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10720e0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxe/M;", "invoke", "()Lxe/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SentrySessionIdInitializer$scope$2 extends AbstractC7737t implements Function0<M> {
    public static final SentrySessionIdInitializer$scope$2 INSTANCE = new SentrySessionIdInitializer$scope$2();

    SentrySessionIdInitializer$scope$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final M invoke() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return N.a(b.f10879b.plus(X0.b()));
    }
}
