package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class g51 implements ale {
    public final kij a = new kij();

    @Override // defpackage.ale
    public long A() {
        return getCurrentPosition();
    }

    @Override // defpackage.ale
    public final void B() {
        long currentPosition = getCurrentPosition() + w();
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        M(12, Math.max(currentPosition, 0L));
    }

    @Override // defpackage.ale
    public final void C() {
        long currentPosition = getCurrentPosition() + (-E());
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        M(11, Math.max(currentPosition, 0L));
    }

    public final boolean F() {
        int e;
        mij currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            e = -1;
        } else {
            int y = y();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            e = currentTimeline.e(y, repeatMode, getShuffleModeEnabled());
        }
        return e != -1;
    }

    public final boolean G() {
        int k;
        mij currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            k = -1;
        } else {
            int y = y();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            k = currentTimeline.k(y, repeatMode, getShuffleModeEnabled());
        }
        return k != -1;
    }

    public final void H(int i) {
        L(C.TIME_UNSET, -1, false);
    }

    public final boolean I() {
        mij currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(y(), this.a, 0L).h;
    }

    public final boolean J() {
        mij currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(y(), this.a, 0L).a();
    }

    public final boolean K() {
        mij currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(y(), this.a, 0L).g;
    }

    public abstract void L(long j, int i, boolean z);

    public final void M(int i, long j) {
        L(j, y(), false);
    }

    @Override // defpackage.ale
    public final void d() {
        t();
    }

    @Override // defpackage.ale
    public final h6c e() {
        mij currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return null;
        }
        return currentTimeline.m(y(), this.a, 0L).b;
    }

    @Override // defpackage.ale
    public final void g() {
        int k;
        int k2;
        if (getCurrentTimeline().p() || isPlayingAd()) {
            H(7);
            return;
        }
        boolean G = G();
        if (J() && !K()) {
            if (!G) {
                H(7);
                return;
            }
            mij currentTimeline = getCurrentTimeline();
            if (currentTimeline.p()) {
                k2 = -1;
            } else {
                int y = y();
                int repeatMode = getRepeatMode();
                if (repeatMode == 1) {
                    repeatMode = 0;
                }
                k2 = currentTimeline.k(y, repeatMode, getShuffleModeEnabled());
            }
            if (k2 == -1) {
                H(7);
                return;
            } else if (k2 == y()) {
                L(C.TIME_UNSET, y(), true);
                return;
            } else {
                L(C.TIME_UNSET, k2, false);
                return;
            }
        }
        if (!G || getCurrentPosition() > r()) {
            M(7, 0L);
            return;
        }
        mij currentTimeline2 = getCurrentTimeline();
        if (currentTimeline2.p()) {
            k = -1;
        } else {
            int y2 = y();
            int repeatMode2 = getRepeatMode();
            if (repeatMode2 == 1) {
                repeatMode2 = 0;
            }
            k = currentTimeline2.k(y2, repeatMode2, getShuffleModeEnabled());
        }
        if (k == -1) {
            H(7);
        } else if (k == y()) {
            L(C.TIME_UNSET, y(), true);
        } else {
            L(C.TIME_UNSET, k, false);
        }
    }

    @Override // defpackage.ale
    public long getBufferedPosition() {
        return getCurrentPosition();
    }

    @Override // defpackage.ale
    public long getContentPosition() {
        return getCurrentPosition();
    }

    @Override // defpackage.ale
    public int getCurrentPeriodIndex() {
        return y();
    }

    @Override // defpackage.ale
    public long getDuration() {
        return u();
    }

    @Override // defpackage.ale
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && m() == 0;
    }

    @Override // defpackage.ale
    public final boolean k(int i) {
        return q().a.a.get(i);
    }

    @Override // defpackage.ale
    public final void l(h6c h6cVar) {
        x(hv9.z(h6cVar));
    }

    @Override // defpackage.ale
    public final void p() {
        int e;
        if (getCurrentTimeline().p() || isPlayingAd()) {
            H(9);
            return;
        }
        if (!F()) {
            if (J() && I()) {
                L(C.TIME_UNSET, y(), false);
                return;
            } else {
                H(9);
                return;
            }
        }
        mij currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            e = -1;
        } else {
            int y = y();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            e = currentTimeline.e(y, repeatMode, getShuffleModeEnabled());
        }
        if (e == -1) {
            H(9);
        } else if (e == y()) {
            L(C.TIME_UNSET, y(), true);
        } else {
            L(C.TIME_UNSET, e, false);
        }
    }

    @Override // defpackage.ale
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // defpackage.ale
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // defpackage.ale
    public final void seekTo(long j) {
        M(5, j);
    }

    @Override // defpackage.ale
    public final void seekToDefaultPosition() {
        L(C.TIME_UNSET, y(), false);
    }

    @Override // defpackage.ale
    public final long u() {
        mij currentTimeline = getCurrentTimeline();
        return currentTimeline.p() ? C.TIME_UNSET : nik.h0(currentTimeline.m(y(), this.a, 0L).l);
    }

    @Override // defpackage.ale
    public final void seekTo(int i, long j) {
        L(j, i, false);
    }
}
