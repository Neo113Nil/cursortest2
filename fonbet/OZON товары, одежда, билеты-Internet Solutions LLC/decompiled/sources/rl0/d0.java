package rl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 extends AbstractC7737t implements Function1<wl0.c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm0.e<Unit> f83675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(lm0.e<Unit> eVar) {
        super(1);
        this.f83675b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(wl0.c cVar) {
        wl0.c error = cVar;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f83675b.a(error);
        return Unit.f71690a;
    }
}
