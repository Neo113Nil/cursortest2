package oe0;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: oe0.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8708G extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CancellationSignal f78126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8708G(CancellationSignal cancellationSignal) {
        super(1);
        this.f78126b = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f78126b.cancel();
        return Unit.f71690a;
    }
}
