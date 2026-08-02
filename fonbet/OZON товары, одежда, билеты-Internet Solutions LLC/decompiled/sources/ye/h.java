package ye;

import De.s;
import android.view.Choreographer;
import xe.C10720e0;
import xe.C10737n;

/* loaded from: classes10.dex */
public final /* synthetic */ class h implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C10737n f106588a;

    public /* synthetic */ h(C10737n c10737n) {
        this.f106588a = c10737n;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f106588a.F(s.f6650a, Long.valueOf(j11));
    }
}
