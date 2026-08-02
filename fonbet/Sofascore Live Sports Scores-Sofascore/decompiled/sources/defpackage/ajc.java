package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ajc extends n51 implements Handler.Callback {
    public ric A;
    public long B;
    public final a99 s;
    public final mg6 t;
    public final Handler u;
    public final wic v;
    public v7a w;
    public boolean x;
    public boolean y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajc(mg6 mg6Var, Looper looper) {
        super(5);
        a99 a99Var = a99.e;
        this.t = mg6Var;
        this.u = looper == null ? null : new Handler(looper, this);
        this.s = a99Var;
        this.v = new wic(1);
        this.B = C.TIME_UNSET;
    }

    @Override // defpackage.n51
    public final int A(b bVar) {
        if (this.s.B(bVar)) {
            return n51.a(bVar.P == 0 ? 4 : 2, 0, 0, 0);
        }
        return n51.a(0, 0, 0, 0);
    }

    public final void D(ric ricVar, ArrayList arrayList) {
        int i = 0;
        while (true) {
            lic[] licVarArr = ricVar.a;
            if (i >= licVarArr.length) {
                return;
            }
            b m = licVarArr[i].m();
            if (m != null) {
                a99 a99Var = this.s;
                if (a99Var.B(m)) {
                    v7a t = a99Var.t(m);
                    byte[] t2 = licVarArr[i].t();
                    t2.getClass();
                    wic wicVar = this.v;
                    wicVar.A();
                    wicVar.C(t2.length);
                    ByteBuffer byteBuffer = wicVar.i;
                    String str = nik.a;
                    byteBuffer.put(t2);
                    wicVar.D();
                    ric k = t.k(wicVar);
                    if (k != null) {
                        D(k, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(licVarArr[i]);
            i++;
        }
    }

    public final long E(long j) {
        z1a.E(j != C.TIME_UNSET);
        z1a.E(this.B != C.TIME_UNSET);
        return j - this.B;
    }

    public final void F(ric ricVar) {
        mg6 mg6Var = this.t;
        vg6 vg6Var = mg6Var.a;
        q6c q6cVar = vg6Var.n0;
        vdb vdbVar = vg6Var.m;
        o6c a = q6cVar.a();
        int i = 0;
        while (true) {
            lic[] licVarArr = ricVar.a;
            if (i >= licVarArr.length) {
                break;
            }
            licVarArr[i].u(a);
            i++;
        }
        vg6Var.n0 = new q6c(a);
        q6c N = vg6Var.N();
        if (!N.equals(vg6Var.S)) {
            vg6Var.S = N;
            vdbVar.c(14, new kt4(mg6Var, 9));
        }
        vdbVar.c(28, new kt4(ricVar, 11));
        vdbVar.b();
    }

    @Override // defpackage.n51
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            F((ric) message.obj);
            return true;
        }
        zzl.s();
        return false;
    }

    @Override // defpackage.n51
    public final boolean j() {
        return this.y;
    }

    @Override // defpackage.n51
    public final boolean l() {
        return true;
    }

    @Override // defpackage.n51
    public final void m() {
        this.A = null;
        this.w = null;
        this.B = C.TIME_UNSET;
    }

    @Override // defpackage.n51
    public final void o(long j, boolean z, boolean z2) {
        this.A = null;
        this.x = false;
        this.y = false;
    }

    @Override // defpackage.n51
    public final void t(b[] bVarArr, long j, long j2, scc sccVar) {
        this.w = this.s.t(bVarArr[0]);
        ric ricVar = this.A;
        if (ricVar != null) {
            long j3 = ricVar.b;
            long j4 = (this.B + j3) - j2;
            if (j3 != j4) {
                ricVar = new ric(j4, ricVar.a);
            }
            this.A = ricVar;
        }
        this.B = j2;
    }

    @Override // defpackage.n51
    public final void w(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.x && this.A == null) {
                wic wicVar = this.v;
                wicVar.A();
                fp4 fp4Var = this.c;
                fp4Var.j();
                int v = v(fp4Var, wicVar, 0);
                if (v == -4) {
                    if (wicVar.i(4)) {
                        this.x = true;
                    } else if (wicVar.k >= this.l) {
                        wicVar.n = this.z;
                        wicVar.D();
                        v7a v7aVar = this.w;
                        String str = nik.a;
                        ric k = v7aVar.k(wicVar);
                        if (k != null) {
                            ArrayList arrayList = new ArrayList(k.a.length);
                            D(k, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.A = new ric(E(wicVar.k), (lic[]) arrayList.toArray(new lic[0]));
                            }
                        }
                    }
                } else if (v == -5) {
                    b bVar = (b) fp4Var.c;
                    bVar.getClass();
                    this.z = bVar.t;
                }
            }
            ric ricVar = this.A;
            if (ricVar == null || ricVar.b > E(j)) {
                z = false;
            } else {
                ric ricVar2 = this.A;
                Handler handler = this.u;
                if (handler != null) {
                    handler.obtainMessage(1, ricVar2).sendToTarget();
                } else {
                    F(ricVar2);
                }
                this.A = null;
                z = true;
            }
            if (this.x && this.A == null) {
                this.y = true;
            }
        }
    }
}
