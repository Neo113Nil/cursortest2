package com.vk.music.player;

import com.vk.music.player.MusicCountDownTimer;
import com.vk.music.player.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.u2b0;
import xsna.u750;
import xsna.v550;

/* compiled from: MusicSleepTimerManager.kt */
/* loaded from: classes.dex */
public final class d {
    public static final String f;
    public final u2b0 a;
    public final u750 b;
    public final v550 c = new v550();
    public final MusicCountDownTimer d;
    public final LinkedHashSet e;

    /* compiled from: MusicSleepTimerManager.kt */
    public static final class a implements MusicCountDownTimer.a {
        public a() {
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void n0() {
            d dVar = d.this;
            u2b0 u2b0Var = dVar.a;
            if (u2b0Var.h()) {
                u2b0Var.t1(15, PauseReason.SLEEP_TIMER, dVar.c);
                dVar.b.c0();
            }
            Iterator it = dVar.e.iterator();
            while (it.hasNext()) {
                ((MusicCountDownTimer.a) it.next()).n0();
            }
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void s0(long j) {
            Iterator it = d.this.e.iterator();
            while (it.hasNext()) {
                ((MusicCountDownTimer.a) it.next()).s0(j);
            }
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void u0() {
            Iterator it = d.this.e.iterator();
            while (it.hasNext()) {
                ((MusicCountDownTimer.a) it.next()).u0();
            }
        }
    }

    /* compiled from: MusicSleepTimerManager.kt */
    public static final class b extends e.a {
        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            boolean z = false;
            if (playState != null && playState.i()) {
                z = true;
            }
            d dVar = d.this;
            if (dVar.b() && z) {
                dVar.d.a();
            }
        }
    }

    static {
        String canonicalName = d.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f = canonicalName;
    }

    public d(u2b0 u2b0Var, u750 u750Var) {
        this.a = u2b0Var;
        this.b = u750Var;
        a aVar = new a();
        b bVar = new b();
        MusicCountDownTimer musicCountDownTimer = new MusicCountDownTimer();
        musicCountDownTimer.e.add(aVar);
        this.d = musicCountDownTimer;
        this.e = new LinkedHashSet();
        u2b0Var.P0(bVar, true);
    }

    public final void a(MusicCountDownTimer.a aVar) {
        this.e.add(aVar);
    }

    public final boolean b() {
        return this.d.c == MusicCountDownTimer.State.TICKING;
    }

    public final void c(MusicCountDownTimer.a aVar) {
        this.e.remove(aVar);
    }
}
