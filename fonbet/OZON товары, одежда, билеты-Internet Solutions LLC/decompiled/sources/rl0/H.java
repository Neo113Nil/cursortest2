package rl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;

/* loaded from: classes8.dex */
public final class H extends AbstractC7737t implements Function1<Al0.b, AbstractC7971a<Unit>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f83614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(N n11) {
        super(1);
        this.f83614b = n11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC7971a<Unit> invoke(Al0.b bVar) {
        Al0.b dto = bVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.f83614b.f83627b.a(dto);
    }
}
