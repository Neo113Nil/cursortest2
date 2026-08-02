package kc0;

import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class v extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7645c f71411b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC7643a.b f71412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(C7645c c7645c, InterfaceC7643a.b bVar) {
        super(0);
        this.f71411b = c7645c;
        this.f71412c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C7629C C11 = this.f71411b.C();
        InterfaceC7643a.b bVar = this.f71412c;
        C11.M0(bVar.c(), bVar.a());
        return Unit.f71690a;
    }
}
