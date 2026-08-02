package j3;

import com.google.common.collect.AbstractC5880y;
import j3.AbstractC7252H;

/* renamed from: j3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7265g implements y {

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC7252H.c f69060a = new AbstractC7252H.c();

    protected AbstractC7265g() {
    }

    private void b0(int i11) {
        f0(-9223372036854775807L, -1, false);
    }

    @Override // j3.y
    public final C7275q A() {
        AbstractC7252H G11 = G();
        if (G11.isEmpty()) {
            return null;
        }
        return G11.getWindow(R(), this.f69060a).f68948c;
    }

    @Override // j3.y
    public final void B() {
        f0(-9223372036854775807L, R(), false);
    }

    @Override // j3.y
    public final void C() {
        int previousWindowIndex;
        int previousWindowIndex2;
        if (G().isEmpty() || e()) {
            b0(7);
            return;
        }
        boolean a02 = a0();
        if (d0() && !e0()) {
            if (!a02) {
                b0(7);
                return;
            }
            AbstractC7252H G11 = G();
            if (G11.isEmpty()) {
                previousWindowIndex2 = -1;
            } else {
                int R11 = R();
                int w11 = w();
                if (w11 == 1) {
                    w11 = 0;
                }
                previousWindowIndex2 = G11.getPreviousWindowIndex(R11, w11, U());
            }
            if (previousWindowIndex2 == -1) {
                b0(7);
                return;
            } else if (previousWindowIndex2 == R()) {
                f0(-9223372036854775807L, R(), true);
                return;
            } else {
                f0(-9223372036854775807L, previousWindowIndex2, false);
                return;
            }
        }
        if (!a02 || getCurrentPosition() > p()) {
            f0(0L, R(), false);
            return;
        }
        AbstractC7252H G12 = G();
        if (G12.isEmpty()) {
            previousWindowIndex = -1;
        } else {
            int R12 = R();
            int w12 = w();
            if (w12 == 1) {
                w12 = 0;
            }
            previousWindowIndex = G12.getPreviousWindowIndex(R12, w12, U());
        }
        if (previousWindowIndex == -1) {
            b0(7);
        } else if (previousWindowIndex == R()) {
            f0(-9223372036854775807L, R(), true);
        } else {
            f0(-9223372036854775807L, previousWindowIndex, false);
        }
    }

    @Override // j3.y
    public final void I() {
        int nextWindowIndex;
        if (G().isEmpty() || e()) {
            b0(9);
            return;
        }
        if (!Z()) {
            if (d0() && c0()) {
                f0(-9223372036854775807L, R(), false);
                return;
            } else {
                b0(9);
                return;
            }
        }
        AbstractC7252H G11 = G();
        if (G11.isEmpty()) {
            nextWindowIndex = -1;
        } else {
            int R11 = R();
            int w11 = w();
            if (w11 == 1) {
                w11 = 0;
            }
            nextWindowIndex = G11.getNextWindowIndex(R11, w11, U());
        }
        if (nextWindowIndex == -1) {
            b0(9);
        } else if (nextWindowIndex == R()) {
            f0(-9223372036854775807L, R(), true);
        } else {
            f0(-9223372036854775807L, nextWindowIndex, false);
        }
    }

    @Override // j3.y
    public final void K(int i11, long j11) {
        f0(j11, i11, false);
    }

    @Override // j3.y
    public final void V() {
        long currentPosition = getCurrentPosition() + (-Y());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        f0(Math.max(currentPosition, 0L), R(), false);
    }

    public final boolean Z() {
        int nextWindowIndex;
        AbstractC7252H G11 = G();
        if (G11.isEmpty()) {
            nextWindowIndex = -1;
        } else {
            int R11 = R();
            int w11 = w();
            if (w11 == 1) {
                w11 = 0;
            }
            nextWindowIndex = G11.getNextWindowIndex(R11, w11, U());
        }
        return nextWindowIndex != -1;
    }

    public final boolean a0() {
        int previousWindowIndex;
        AbstractC7252H G11 = G();
        if (G11.isEmpty()) {
            previousWindowIndex = -1;
        } else {
            int R11 = R();
            int w11 = w();
            if (w11 == 1) {
                w11 = 0;
            }
            previousWindowIndex = G11.getPreviousWindowIndex(R11, w11, U());
        }
        return previousWindowIndex != -1;
    }

    public final boolean c0() {
        AbstractC7252H G11 = G();
        return !G11.isEmpty() && G11.getWindow(R(), this.f69060a).f68954i;
    }

    public final boolean d0() {
        AbstractC7252H G11 = G();
        return !G11.isEmpty() && G11.getWindow(R(), this.f69060a).a();
    }

    public final boolean e0() {
        AbstractC7252H G11 = G();
        return !G11.isEmpty() && G11.getWindow(R(), this.f69060a).f68953h;
    }

    protected abstract void f0(long j11, int i11, boolean z11);

    public final void g0(C7275q c7275q) {
        z(AbstractC5880y.B(c7275q));
    }

    @Override // j3.y
    public final boolean isPlaying() {
        return P() == 3 && n() && F() == 0;
    }

    @Override // j3.y
    public final boolean l(int i11) {
        return L().b(i11);
    }

    @Override // j3.y
    public final void pause() {
        D(false);
    }

    @Override // j3.y
    public final void play() {
        D(true);
    }

    @Override // j3.y
    public final long q() {
        AbstractC7252H G11 = G();
        if (G11.isEmpty()) {
            return -9223372036854775807L;
        }
        return m3.N.g0(G11.getWindow(R(), this.f69060a).f68958m);
    }

    @Override // j3.y
    public final void seekTo(long j11) {
        f0(j11, R(), false);
    }

    @Override // j3.y
    public final void y() {
        long currentPosition = getCurrentPosition() + v();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        f0(Math.max(currentPosition, 0L), R(), false);
    }
}
