package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hd4 implements vfb {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ hd4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vfb
    public final void b(yfb yfbVar, long j, long j2, boolean z) {
        switch (this.a) {
            case 0:
                ((id4) this.b).u((x9e) yfbVar, j, j2);
                break;
        }
    }

    @Override // defpackage.vfb
    public final void d(yfb yfbVar, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 0:
                x9e x9eVar = (x9e) yfbVar;
                id4 id4Var = (id4) this.b;
                long j3 = x9eVar.a;
                xe4 xe4Var = x9eVar.b;
                tei teiVar = x9eVar.d;
                lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
                id4Var.m.getClass();
                id4Var.q.v(lfbVar, x9eVar.c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
                id4Var.K = ((Long) x9eVar.f).longValue() - j;
                id4Var.w(true);
                return;
            default:
                sz8 sz8Var = (sz8) this.b;
                synchronized (td4.g) {
                    z = td4.h;
                }
                if (z) {
                    sz8Var.w();
                    return;
                } else {
                    ((id4) sz8Var.b).v(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // defpackage.vfb
    public final r5a r(yfb yfbVar, long j, long j2, IOException iOException, int i) {
        int i2 = this.a;
        r5a r5aVar = x6k.f;
        Object obj = this.b;
        switch (i2) {
            case 0:
                x9e x9eVar = (x9e) yfbVar;
                id4 id4Var = (id4) obj;
                b10 b10Var = id4Var.q;
                long j3 = x9eVar.a;
                xe4 xe4Var = x9eVar.b;
                tei teiVar = x9eVar.d;
                b10Var.x(new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b), x9eVar.c, iOException, true);
                id4Var.m.getClass();
                id4Var.v(iOException);
                break;
            default:
                ((id4) ((sz8) obj).b).v(iOException);
                break;
        }
        return r5aVar;
    }

    private final void a(yfb yfbVar, long j, long j2, boolean z) {
    }
}
