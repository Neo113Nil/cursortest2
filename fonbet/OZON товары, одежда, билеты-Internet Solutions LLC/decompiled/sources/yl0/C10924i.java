package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yl0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10924i extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10918c f106782b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10924i(InterfaceC10918c interfaceC10918c, Throwable th2) {
        super(0);
        this.f106782b = interfaceC10918c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f106782b.onComplete();
        return Unit.f71690a;
    }
}
