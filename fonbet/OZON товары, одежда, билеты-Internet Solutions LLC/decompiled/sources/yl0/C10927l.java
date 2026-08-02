package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yl0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10927l extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10916a f106787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10927l(C10916a c10916a, Throwable th2) {
        super(0);
        this.f106787b = c10916a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f106787b.b().onComplete();
        return Unit.f71690a;
    }
}
