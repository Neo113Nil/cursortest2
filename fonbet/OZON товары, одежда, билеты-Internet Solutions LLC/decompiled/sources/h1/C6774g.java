package h1;

import E0.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6774g extends AbstractC7737t implements Function1<C6769b, InterfaceC6776i> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C6769b, Boolean> f64607b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S0 f64608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6774g(Function1 function1, S0 s02) {
        super(1);
        this.f64607b = function1;
        this.f64608c = s02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC6776i invoke(C6769b c6769b) {
        if (this.f64607b.invoke(c6769b).booleanValue()) {
            return this.f64608c;
        }
        return null;
    }
}
