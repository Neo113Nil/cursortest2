package fd0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f63109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(n nVar) {
        super(0);
        this.f63109b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        n nVar = this.f63109b;
        nVar.getClass();
        td0.f.b(nVar, null, new i(nVar, null));
        return Unit.f71690a;
    }
}
