package qj0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: qj0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9078h extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C9073c, Unit> f82258b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9073c f82259c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f82260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C9078h(Function1<? super C9073c, Unit> function1, C9073c c9073c, InterfaceC3978p0<String> interfaceC3978p0) {
        super(0);
        this.f82258b = function1;
        this.f82259c = c9073c;
        this.f82260d = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f82260d.setValue("");
        this.f82258b.invoke(this.f82259c);
        return Unit.f71690a;
    }
}
