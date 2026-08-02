package nd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;

/* renamed from: nd.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8574y implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9836b f77055a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77056b;

    public C8574y(InterfaceC9836b interfaceC9836b, int i11) {
        this.f77055a = interfaceC9836b;
        this.f77056b = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        td.p0 p0Var = this.f77055a.f().get(this.f77056b);
        Intrinsics.checkNotNullExpressionValue(p0Var, "get(...)");
        return p0Var;
    }
}
