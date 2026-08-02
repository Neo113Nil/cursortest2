package ye;

import kotlin.Unit;
import xe.C10737n;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f106582a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f106583b;

    public e(C10737n c10737n, f fVar) {
        this.f106582a = c10737n;
        this.f106583b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106582a.F(this.f106583b, Unit.f71690a);
    }
}
