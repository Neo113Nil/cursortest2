package com.vk.music.player.analytics.impl.tracker.timespent;

import android.os.SystemClock;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.music.player.playback.PlayableType;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.agl0;
import xsna.ca50;
import xsna.epx;
import xsna.hr90;
import xsna.iwa0;
import xsna.jt50;
import xsna.kw40;
import xsna.q4b0;

/* compiled from: MusicTimespentTrackerImpl.kt */
/* loaded from: classes3.dex */
public final class a implements ca50 {
    public boolean a;
    public long b;
    public boolean c;
    public String d;
    public long e;
    public boolean f;
    public MusicTimespentEventType g;

    /* compiled from: MusicTimespentTrackerImpl.kt */
    /* renamed from: com.vk.music.player.analytics.impl.tracker.timespent.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1331a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayableType.values().length];
            try {
                iArr[PlayableType.SNIPPET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayableType.MUSIC_TRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.ca50
    public final void a(MusicTrack musicTrack, PlayableType playableType) {
        String str;
        int i;
        int i2 = C1331a.$EnumSwitchMapping$0[playableType.ordinal()];
        if (i2 == 1) {
            String str2 = musicTrack.y;
            if (str2 == null) {
                return;
            }
            MusicTimespentEventType musicTimespentEventType = this.g;
            MusicTimespentEventType musicTimespentEventType2 = MusicTimespentEventType.SNIPPET;
            if (musicTimespentEventType != musicTimespentEventType2) {
                h();
            }
            this.g = musicTimespentEventType2;
            f();
            g(str2);
            this.a = true;
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        e(musicTrack);
        f();
        if (!musicTrack.Wb() || (i = musicTrack.b) <= 0) {
            str = musicTrack.y;
            if (str == null) {
                str = "";
            }
        } else {
            str = String.valueOf(i);
        }
        g(str);
        this.a = true;
    }

    @Override // xsna.ca50
    public final void b() {
        if (!this.c && this.a && SystemClock.uptimeMillis() - this.b > 1000) {
            this.c = true;
            L.e("MusicTimespentTracker", "TIMESPENT START: " + this.g.h() + " - id: " + this.g.h().h());
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
            jt50.d(this.g.h());
        }
        if (this.f || !this.a || SystemClock.uptimeMillis() - this.e <= ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
            return;
        }
        this.f = true;
        L.e("MusicTimespentTracker", "INCREMENT SEND: " + this.g.i() + " - id: " + this.g.i().h());
        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView2 = jt50.a;
        jt50.a(this.g.i());
    }

    @Override // xsna.ca50
    public final void c(iwa0 iwa0Var) {
        String str;
        int i;
        q4b0 q4b0Var = iwa0Var.b.b;
        kw40 kw40Var = iwa0Var.a;
        if (kw40Var instanceof kw40.b) {
            e(q4b0Var.a);
            f();
            MusicTrack musicTrack = q4b0Var.a;
            if (!musicTrack.Wb() || (i = musicTrack.b) <= 0) {
                str = musicTrack.y;
                if (str == null) {
                    str = "";
                }
            } else {
                str = String.valueOf(i);
            }
            g(str);
            this.a = true;
            return;
        }
        if (kw40Var instanceof kw40.a) {
            hr90 hr90Var = ((kw40.a) kw40Var).b;
            if (!(hr90Var instanceof hr90.d) && !(hr90Var instanceof hr90.g) && !(hr90Var instanceof hr90.f)) {
                h();
            }
            h();
            return;
        }
        if (!(kw40Var instanceof kw40.c)) {
            throw new NoWhenBranchMatchedException();
        }
        agl0 agl0Var = ((kw40.c) kw40Var).b;
        if ((agl0Var instanceof agl0.f) || (agl0Var instanceof agl0.a) || (agl0Var instanceof agl0.c)) {
            return;
        }
        h();
    }

    @Override // xsna.ca50
    public final void d() {
        h();
    }

    public final void e(MusicTrack musicTrack) {
        MusicTimespentEventType.Companion.getClass();
        MusicTimespentEventType musicTimespentEventType = musicTrack.Vb() ? MusicTimespentEventType.PODCAST : musicTrack.Mb() ? MusicTimespentEventType.AUDIOBOOK : musicTrack.Wb() ? MusicTimespentEventType.RADIO : MusicTimespentEventType.AUDIO;
        L.e("MusicTimespentTracker", "play: track type - " + musicTimespentEventType.name());
        if (musicTimespentEventType != this.g) {
            h();
        }
        this.g = musicTimespentEventType;
    }

    public final void f() {
        if (this.a) {
            return;
        }
        L.e("MusicTimespentTracker", "timer restart: player");
        this.b = SystemClock.uptimeMillis();
    }

    public final void g(String str) {
        if (this.a && str.length() > 0 && epx.f(this.d, str)) {
            return;
        }
        this.e = SystemClock.uptimeMillis();
        L.e("MusicTimespentTracker", "timer restart: track");
        this.d = str;
        this.f = false;
    }

    public final void h() {
        if (this.a) {
            this.a = false;
            if (this.c) {
                L.e("MusicTimespentTracker", "TIMESPENT STOP: " + this.g.h() + " - id: " + this.g.h().h());
                ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                jt50.f(this.g.h());
                this.c = false;
            }
            this.f = false;
        }
    }
}
