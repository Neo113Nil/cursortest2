package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e3a extends mu2 {
    public final l72 j;
    public z41 k;
    public long l;
    public volatile boolean m;

    public e3a(re4 re4Var, xe4 xe4Var, b bVar, int i, Object obj, l72 l72Var) {
        super(re4Var, xe4Var, 2, bVar, i, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.j = l72Var;
    }

    @Override // defpackage.yfb
    public final void cancelLoad() {
        this.m = true;
    }

    @Override // defpackage.yfb
    public final void load() {
        if (this.l == 0) {
            this.j.b(this.k, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            xe4 b = this.b.b(this.l);
            tei teiVar = this.i;
            bp4 bp4Var = new bp4(teiVar, b.f, teiVar.b(b));
            while (!this.m) {
                try {
                    int b2 = this.j.a.b(bp4Var, l72.j);
                    boolean z = false;
                    z1a.E(b2 != 1);
                    if (b2 == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.l = bp4Var.d - this.b.f;
                    this.j.a();
                }
            }
        } finally {
            qx9.w(this.i);
        }
    }
}
