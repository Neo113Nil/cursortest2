package J0;

import I0.C1339d;
import I0.InterfaceC1340e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements InterfaceC1340e {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5876a;

    public b(Function1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f5876a = produceNewData;
    }

    @Override // I0.InterfaceC1340e
    public Object a(C1339d c1339d, Continuation continuation) {
        return this.f5876a.invoke(c1339d);
    }
}
