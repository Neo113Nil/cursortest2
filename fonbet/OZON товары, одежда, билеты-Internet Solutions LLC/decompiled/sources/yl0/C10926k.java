package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yl0.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C10926k extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10919d f106785b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f106786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10926k(InterfaceC10919d interfaceC10919d, Throwable th2) {
        super(0);
        this.f106785b = interfaceC10919d;
        this.f106786c = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f106785b.onFailure(this.f106786c);
        return Unit.f71690a;
    }
}
