package defpackage;

import android.media.AudioTrack;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fp0 {
    public final int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final Object h;
    public final Object i;

    public fp0(AudioTrack audioTrack, fjn fjnVar) {
        this.h = new cp0(audioTrack, 1);
        this.a = audioTrack.getSampleRate();
        this.i = fjnVar;
        b(0);
    }

    public void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.g = C.TIME_UNSET;
            this.c = System.nanoTime() / 1000;
            this.d = Ua.s;
            return;
        }
        if (i == 1) {
            this.d = Ua.s;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else if (i == 4) {
            this.d = 500000L;
        } else {
            zzl.s();
        }
    }

    public void b(int i) {
        this.b = i;
        long j = Ua.s;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.g = C.TIME_UNSET;
            this.c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.d = Ua.s;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }

    public fp0(AudioTrack audioTrack, j0l j0lVar) {
        this.h = new dp0(audioTrack);
        this.a = audioTrack.getSampleRate();
        this.i = j0lVar;
        a(0);
    }
}
