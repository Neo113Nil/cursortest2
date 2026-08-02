package fd0;

import androidx.lifecycle.x0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10720e0;
import xe.J;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function0<CoroutineContext> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f63106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(n nVar) {
        super(0);
        this.f63106b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CoroutineContext invoke() {
        J j11;
        n nVar = this.f63106b;
        CoroutineContext coroutineContext = x0.a(nVar).getCoroutineContext();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext plus = coroutineContext.plus(He.b.f10879b);
        j11 = nVar.f63124g;
        return plus.plus(j11);
    }
}
