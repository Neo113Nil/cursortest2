package fd0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fd0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6515c extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6514b f63099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6515c(C6514b c6514b) {
        super(1);
        this.f63099b = c6514b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        C6514b.u(this.f63099b).s0();
        return Unit.f71690a;
    }
}
