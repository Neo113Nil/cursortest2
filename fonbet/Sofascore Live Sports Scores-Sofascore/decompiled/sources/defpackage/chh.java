package defpackage;

import android.net.Uri;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class chh extends b51 {
    public static final b j;
    public static final h6c k;
    public static final byte[] l;
    public final long h;
    public h6c i;

    static {
        v5c v5cVar;
        qm8 qm8Var = new qm8();
        qm8Var.n = sjc.p(MimeTypes.AUDIO_RAW);
        qm8Var.F = 2;
        qm8Var.G = 44100;
        qm8Var.H = 2;
        b bVar = new b(qm8Var);
        j = bVar;
        b78 b78Var = new b78();
        p5c p5cVar = new p5c(0);
        List list = Collections.EMPTY_LIST;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        s5c s5cVar = new s5c();
        z5c z5cVar = z5c.a;
        Uri uri = Uri.EMPTY;
        z1a.E(((Uri) p5cVar.c) == null || ((UUID) p5cVar.b) != null);
        if (uri != null) {
            v5cVar = new v5c(uri, bVar.o, ((UUID) p5cVar.b) != null ? new q5c(p5cVar) : null, null, list, null, vvfVar, C.TIME_UNSET);
        } else {
            v5cVar = null;
        }
        k = new h6c("SilenceMediaSource", new m5c(b78Var), v5cVar, new u5c(s5cVar), q6c.D, z5cVar);
        l = new byte[4096];
    }

    public chh(long j2, h6c h6cVar) {
        z1a.s(j2 >= 0);
        this.h = j2;
        this.i = h6cVar;
    }

    @Override // defpackage.vcc
    public final synchronized h6c a() {
        return this.i;
    }

    @Override // defpackage.vcc
    public final synchronized void b(h6c h6cVar) {
        this.i = h6cVar;
    }

    @Override // defpackage.vcc
    public final w6c c(scc sccVar, l2a l2aVar, long j2) {
        return new ahh(this.h);
    }

    @Override // defpackage.b51
    public final void m(tn4 tn4Var) {
        h6c a = a();
        long j2 = this.h;
        n(new dih(C.TIME_UNSET, C.TIME_UNSET, j2, j2, 0L, 0L, true, false, false, null, a, null));
    }

    @Override // defpackage.vcc
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // defpackage.b51
    public final void p() {
    }

    @Override // defpackage.vcc
    public final void f(w6c w6cVar) {
    }
}
