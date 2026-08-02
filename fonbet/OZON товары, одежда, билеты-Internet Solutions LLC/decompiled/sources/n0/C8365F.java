package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: n0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8365F extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f76071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8365F(String str) {
        super(1);
        this.f76071b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        I1.z.i(d12, this.f76071b);
        I1.z.q(d12, 5);
        return Unit.f71690a;
    }
}
