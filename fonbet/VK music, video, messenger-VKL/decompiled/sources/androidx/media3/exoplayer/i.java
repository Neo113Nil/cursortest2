package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.ahn;
import xsna.dvf;
import xsna.ewo0;
import xsna.fxc0;

/* compiled from: PlayerMessage.java */
/* loaded from: classes12.dex */
public final class i {
    public final b a;
    public final a b;
    public final dvf c;
    public final ewo0 d;
    public int e;

    @Nullable
    public Object f;
    public Looper g;
    public int h;
    public long i = C.TIME_UNSET;
    public boolean j = true;
    public boolean k;
    public boolean l;

    /* compiled from: PlayerMessage.java */
    public interface a {
    }

    /* compiled from: PlayerMessage.java */
    public interface b {
        void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public i(a aVar, b bVar, ewo0 ewo0Var, int i, dvf dvfVar, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.d = ewo0Var;
        this.g = looper;
        this.c = dvfVar;
        this.h = i;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        fxc0.z(!this.k);
        if (this.i == C.TIME_UNSET) {
            fxc0.p(this.j);
        }
        this.k = true;
        d dVar = (d) this.b;
        if (!dVar.L && dVar.k.getThread().isAlive()) {
            dVar.i.obtainMessage(14, this).b();
        } else {
            ahn.F("Ignoring messages sent after release.");
            a(false);
        }
    }
}
