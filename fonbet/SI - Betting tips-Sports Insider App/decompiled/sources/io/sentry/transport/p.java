package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends AbstractQueuedSynchronizer {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17143a = 0;
    private static final long serialVersionUID = 5970133580157457018L;

    public p() {
        setState(0);
    }

    public static int a(p pVar) {
        return pVar.getState();
    }

    public static void b(p pVar) {
        int state;
        do {
            state = pVar.getState();
        } while (!pVar.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i5) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i5) {
        int state;
        int i10;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i10 = state - 1;
        } while (!compareAndSetState(state, i10));
        return i10 == 0;
    }
}
