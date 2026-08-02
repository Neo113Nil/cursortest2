package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d2.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6061s extends AbstractC7737t implements Function1<B1.B, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6034K f61073b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6061s(C6034K c6034k) {
        super(1);
        this.f61073b = c6034k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(B1.B b11) {
        B1.B w11 = b11.w();
        Intrinsics.f(w11);
        this.f61073b.o(w11);
        return Unit.f71690a;
    }
}
