package defpackage;

import android.media.AudioTrack;
import com.ironsource.Ua;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ep0 {
    public final cp0 a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public ep0(AudioTrack audioTrack) {
        if (lik.a >= 19) {
            this.a = new cp0(audioTrack, 0);
            a();
        } else {
            this.a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
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
}
