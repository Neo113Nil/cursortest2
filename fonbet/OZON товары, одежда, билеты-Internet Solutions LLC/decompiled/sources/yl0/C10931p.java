package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yl0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10931p extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10919d f106794b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f106795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10931p(InterfaceC10919d interfaceC10919d, Throwable th2) {
        super(0);
        this.f106794b = interfaceC10919d;
        this.f106795c = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f106794b.onFailure(this.f106795c);
        return Unit.f71690a;
    }
}
