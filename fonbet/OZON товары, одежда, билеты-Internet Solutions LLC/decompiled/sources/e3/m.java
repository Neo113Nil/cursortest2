package e3;

import S0.M;
import androidx.lifecycle.J;

/* loaded from: classes8.dex */
public final class m implements M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J f61929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f61930b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M f61931c;

    public m(J j11, l lVar, kotlin.jvm.internal.M m11) {
        this.f61929a = j11;
        this.f61930b = lVar;
        this.f61931c = m11;
    }

    @Override // S0.M
    public final void dispose() {
        this.f61929a.getLifecycle().e(this.f61930b);
        q qVar = (q) this.f61931c.f71787a;
        if (qVar != null) {
            qVar.runStopOrDisposeEffect();
        }
    }
}
