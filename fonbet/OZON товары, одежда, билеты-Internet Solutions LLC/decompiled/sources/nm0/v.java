package nm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v extends AbstractC7737t implements Function1<wl0.c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm0.e<Unit> f77425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(lm0.e<Unit> eVar) {
        super(1);
        this.f77425b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(wl0.c cVar) {
        wl0.c error = cVar;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f77425b.a(error);
        return Unit.f71690a;
    }
}
