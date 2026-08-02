package oh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function1<Unit, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f78354b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f78355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, boolean z11) {
        super(1);
        this.f78354b = jVar;
        this.f78355c = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        this.f78354b.f78359d = this.f78355c;
        return Unit.f71690a;
    }
}
