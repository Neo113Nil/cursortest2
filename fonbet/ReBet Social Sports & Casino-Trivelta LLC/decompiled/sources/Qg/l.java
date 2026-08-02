package Qg;

import Ph.C0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class l extends Lambda implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0 f9743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0 c02) {
        super(1);
        this.f9743d = c02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th2) {
        if (th2 == null) {
            return;
        }
        this.f9743d.cancel(new CancellationException(th2.getMessage()));
    }
}
