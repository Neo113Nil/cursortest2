package x1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class K implements Function1<Boolean, Unit> {

    /* renamed from: a, reason: collision with root package name */
    private G f104832a;

    public final void a(G g10) {
        this.f104832a = g10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        G g10 = this.f104832a;
        if (g10 != null) {
            g10.b(booleanValue);
        }
        return Unit.f71690a;
    }
}
