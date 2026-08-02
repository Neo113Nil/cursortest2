package defpackage;

import android.os.Handler;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uoe implements vsj {
    public final hpg a;
    public final fp4 b = new fp4(23, false);
    public final wic c = new wic(1);
    public long d = C.TIME_UNSET;
    public final /* synthetic */ voe e;

    public uoe(voe voeVar, l2a l2aVar) {
        this.e = voeVar;
        this.a = new hpg(l2aVar, null, null);
    }

    @Override // defpackage.vsj
    public final void a(long j, int i, int i2, int i3, tsj tsjVar) {
        long i4;
        long j2;
        this.a.a(j, i, i2, i3, tsjVar);
        while (this.a.z(false)) {
            wic wicVar = this.c;
            wicVar.A();
            if (this.a.E(this.b, wicVar, 0, false) == -4) {
                wicVar.D();
            } else {
                wicVar = null;
            }
            if (wicVar != null) {
                long j3 = wicVar.k;
                ric k = this.e.c.k(wicVar);
                if (k != null) {
                    s36 s36Var = (s36) k.a[0];
                    String str = s36Var.a;
                    String str2 = s36Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = nik.W(nik.r(s36Var.e));
                        } catch (s9e unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != C.TIME_UNSET) {
                            toe toeVar = new toe(j3, j2);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, toeVar));
                        }
                    }
                }
            }
        }
        hpg hpgVar = this.a;
        cpg cpgVar = hpgVar.a;
        synchronized (hpgVar) {
            int i5 = hpgVar.s;
            i4 = i5 == 0 ? -1L : hpgVar.i(i5);
        }
        cpgVar.a(i4);
    }

    @Override // defpackage.vsj
    public final void b(j9e j9eVar, int i, int i2) {
        this.a.b(j9eVar, i, 0);
    }

    @Override // defpackage.vsj
    public final void d(b bVar) {
        this.a.d(bVar);
    }

    @Override // defpackage.vsj
    public final int e(ge4 ge4Var, int i, boolean z) {
        return this.a.e(ge4Var, i, z);
    }
}
