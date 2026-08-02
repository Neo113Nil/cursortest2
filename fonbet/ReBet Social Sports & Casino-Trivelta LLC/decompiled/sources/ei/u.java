package ei;

import fi.I;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends AbstractC4212b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C4216f configuration, gi.e module) {
        super(configuration, module, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        i();
    }

    public final void i() {
        if (Intrinsics.areEqual(a(), gi.g.a())) {
            return;
        }
        a().a(new I(f()));
    }
}
