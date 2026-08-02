package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class eed extends a implements yda {
    public static final eed b = new eed(uic.g);

    @Override // defpackage.yda
    public final jt2 C(kea keaVar) {
        return ged.a;
    }

    @Override // defpackage.yda
    public final q55 H(Function1 function1, boolean z, boolean z2) {
        return ged.a;
    }

    @Override // defpackage.yda
    public final Object Z(rq3 rq3Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.yda
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.yda
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.yda
    public final CancellationException k() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.yda
    public final q55 n(Function1 function1) {
        return ged.a;
    }

    @Override // defpackage.yda
    public final boolean start() {
        return false;
    }

    @Override // defpackage.yda
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.yda
    public final void e(CancellationException cancellationException) {
    }
}
