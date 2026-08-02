package e3;

import S0.M;
import androidx.lifecycle.J;

/* loaded from: classes8.dex */
public final class j implements M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J f61920a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f61921b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M f61922c;

    public j(J j11, h hVar, kotlin.jvm.internal.M m11) {
        this.f61920a = j11;
        this.f61921b = hVar;
        this.f61922c = m11;
    }

    @Override // S0.M
    public final void dispose() {
        this.f61920a.getLifecycle().e(this.f61921b);
        n nVar = (n) this.f61922c.f71787a;
        if (nVar != null) {
            nVar.runPauseOrOnDisposeEffect();
        }
    }
}
