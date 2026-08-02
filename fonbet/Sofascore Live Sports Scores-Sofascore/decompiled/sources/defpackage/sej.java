package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.b;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sej extends n51 implements Handler.Callback {
    public tm2 A;
    public tm2 B;
    public int C;
    public final Handler D;
    public final mg6 E;
    public final fp4 F;
    public boolean G;
    public boolean H;
    public b I;
    public long J;
    public long K;
    public final zic s;
    public final im4 t;
    public p74 u;
    public final qli v;
    public boolean w;
    public int x;
    public nli y;
    public uli z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sej(mg6 mg6Var, Looper looper) {
        super(3);
        e3c e3cVar = qli.z7;
        this.E = mg6Var;
        this.D = looper == null ? null : new Handler(looper, this);
        this.v = e3cVar;
        this.s = new zic(20);
        this.t = new im4(1);
        this.F = new fp4(23, false);
        this.K = C.TIME_UNSET;
        this.J = C.TIME_UNSET;
    }

    @Override // defpackage.n51
    public final int A(b bVar) {
        boolean equals = Objects.equals(bVar.o, "application/x-media3-cues");
        String str = bVar.o;
        if (!equals) {
            e3c e3cVar = (e3c) this.v;
            e3cVar.getClass();
            if (!((zic) e3cVar.b).i(bVar) && !Objects.equals(str, MimeTypes.APPLICATION_CEA608) && !Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) && !Objects.equals(str, MimeTypes.APPLICATION_CEA708)) {
                return sjc.n(str) ? n51.a(1, 0, 0, 0) : n51.a(0, 0, 0, 0);
            }
        }
        return n51.a(bVar.P == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void D() {
        boolean z = Objects.equals(this.I.o, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.I.o, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.I.o, MimeTypes.APPLICATION_CEA708);
        String str = this.I.o;
        if (z) {
            return;
        }
        a70.r(ufa.C("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void E() {
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        G(this.J);
        o74 o74Var = new o74(vvfVar);
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, o74Var).sendToTarget();
        } else {
            I(o74Var);
        }
    }

    public final long F() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        this.A.getClass();
        if (this.C >= this.A.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.A.getEventTime(this.C);
    }

    public final long G(long j) {
        z1a.E(j != C.TIME_UNSET);
        return j - this.k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        nli mw4Var;
        char c = 1;
        this.w = true;
        b bVar = this.I;
        bVar.getClass();
        zic zicVar = (zic) ((e3c) this.v).b;
        String str = bVar.o;
        int i = bVar.L;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals(MimeTypes.APPLICATION_CEA708)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    mw4Var = new im2(str, i);
                    break;
                case 2:
                    mw4Var = new pm2(i, bVar.r);
                    break;
            }
            this.y = mw4Var;
            mw4Var.b(this.l);
        }
        if (!zicVar.i(bVar)) {
            a70.p(dmi.q("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        }
        zli g = zicVar.g(bVar);
        g.getClass().getSimpleName().concat("Decoder");
        mw4Var = new mw4(g);
        this.y = mw4Var;
        mw4Var.b(this.l);
    }

    public final void I(o74 o74Var) {
        vvf vvfVar = o74Var.a;
        mg6 mg6Var = this.E;
        mg6Var.a.m.g(27, new xm4(vvfVar, 3));
        vg6 vg6Var = mg6Var.a;
        vg6Var.e0 = o74Var;
        vg6Var.m.g(27, new kt4(o74Var, 7));
    }

    public final void J() {
        this.z = null;
        this.C = -1;
        tm2 tm2Var = this.A;
        if (tm2Var != null) {
            tm2Var.B();
            this.A = null;
        }
        tm2 tm2Var2 = this.B;
        if (tm2Var2 != null) {
            tm2Var2.B();
            this.B = null;
        }
    }

    @Override // defpackage.n51
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            I((o74) message.obj);
            return true;
        }
        zzl.s();
        return false;
    }

    @Override // defpackage.n51
    public final boolean j() {
        return this.H;
    }

    @Override // defpackage.n51
    public final boolean l() {
        b bVar = this.I;
        if (bVar != null) {
            if (Objects.equals(bVar.o, "application/x-media3-cues")) {
                p74 p74Var = this.u;
                p74Var.getClass();
                if (p74Var.e(this.J) == Long.MIN_VALUE) {
                    try {
                        jpg jpgVar = this.i;
                        jpgVar.getClass();
                        jpgVar.maybeThrowError();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.H) {
                    return false;
                }
                if (this.G) {
                    tm2 tm2Var = this.A;
                    long j = this.J;
                    if (tm2Var == null || tm2Var.getEventTimeCount() <= 0 || tm2Var.getEventTime(tm2Var.getEventTimeCount() - 1) <= j) {
                        tm2 tm2Var2 = this.B;
                        long j2 = this.J;
                        if ((tm2Var2 == null || tm2Var2.getEventTimeCount() <= 0 || tm2Var2.getEventTime(tm2Var2.getEventTimeCount() - 1) <= j2) && this.z != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.n51
    public final void m() {
        this.I = null;
        this.K = C.TIME_UNSET;
        E();
        this.J = C.TIME_UNSET;
        if (this.y != null) {
            J();
            nli nliVar = this.y;
            nliVar.getClass();
            nliVar.release();
            this.y = null;
            this.x = 0;
        }
    }

    @Override // defpackage.n51
    public final void o(long j, boolean z, boolean z2) {
        this.J = j;
        p74 p74Var = this.u;
        if (p74Var != null) {
            p74Var.clear();
        }
        E();
        this.G = false;
        this.H = false;
        this.K = C.TIME_UNSET;
        b bVar = this.I;
        if (bVar == null || Objects.equals(bVar.o, "application/x-media3-cues")) {
            return;
        }
        if (this.x == 0) {
            J();
            nli nliVar = this.y;
            nliVar.getClass();
            nliVar.flush();
            nliVar.b(this.l);
            return;
        }
        J();
        nli nliVar2 = this.y;
        nliVar2.getClass();
        nliVar2.release();
        this.y = null;
        this.x = 0;
        H();
    }

    @Override // defpackage.n51
    public final void t(b[] bVarArr, long j, long j2, scc sccVar) {
        b bVar = bVarArr[0];
        this.I = bVar;
        if (Objects.equals(bVar.o, "application/x-media3-cues")) {
            this.u = this.I.M == 1 ? new hgc() : new zl1(4);
            return;
        }
        D();
        if (this.y != null) {
            this.x = 1;
        } else {
            H();
        }
    }

    @Override // defpackage.n51
    public final void w(long j, long j2) {
        boolean z;
        boolean z2;
        long j3;
        if (this.n) {
            long j4 = this.K;
            if (j4 != C.TIME_UNSET && j >= j4) {
                J();
                this.H = true;
            }
        }
        if (this.H) {
            return;
        }
        b bVar = this.I;
        bVar.getClass();
        boolean equals = Objects.equals(bVar.o, "application/x-media3-cues");
        Handler handler = this.D;
        fp4 fp4Var = this.F;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (equals) {
            this.u.getClass();
            if (!this.G) {
                im4 im4Var = this.t;
                if (v(fp4Var, im4Var, 0) == -4) {
                    if (im4Var.i(4)) {
                        this.G = true;
                    } else {
                        im4Var.D();
                        ByteBuffer byteBuffer = im4Var.i;
                        byteBuffer.getClass();
                        long j5 = im4Var.k;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.s.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList(a.q);
                        parcelableArrayList.getClass();
                        m72 m72Var = new m72(1);
                        zu9 s = hv9.s();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle = (Bundle) parcelableArrayList.get(i);
                            bundle.getClass();
                            s.c(m72Var.apply(bundle));
                        }
                        q74 q74Var = new q74(s.g(), j5, readBundle.getLong("d"));
                        im4Var.A();
                        z3 = this.u.b(q74Var, j);
                    }
                }
            }
            long e = this.u.e(this.J);
            if (e == Long.MIN_VALUE && this.G && !z3) {
                this.H = true;
            }
            if (e != Long.MIN_VALUE && e <= j) {
                z3 = true;
            }
            if (z3) {
                hv9 c = this.u.c(j);
                long d = this.u.d(j);
                G(d);
                o74 o74Var = new o74(c);
                if (handler != null) {
                    handler.obtainMessage(1, o74Var).sendToTarget();
                } else {
                    I(o74Var);
                }
                this.u.f(d);
            }
            this.J = j;
            return;
        }
        D();
        this.J = j;
        if (this.B == null) {
            nli nliVar = this.y;
            nliVar.getClass();
            nliVar.setPositionUs(j);
            try {
                nli nliVar2 = this.y;
                nliVar2.getClass();
                this.B = (tm2) nliVar2.dequeueOutputBuffer();
            } catch (pli e2) {
                tgj.A("Subtitle decoding failed. streamFormat=" + this.I, e2);
                E();
                J();
                nli nliVar3 = this.y;
                nliVar3.getClass();
                nliVar3.release();
                this.y = null;
                this.x = 0;
                H();
                return;
            }
        }
        if (this.h != 2) {
            return;
        }
        if (this.A != null) {
            long F = F();
            z = false;
            while (F <= j) {
                this.C++;
                F = F();
                z = true;
            }
        } else {
            z = false;
        }
        tm2 tm2Var = this.B;
        boolean z4 = z;
        if (tm2Var != null) {
            z4 = z;
            if (!tm2Var.i(4)) {
                z4 = z;
                if (tm2Var.g <= j) {
                    tm2 tm2Var2 = this.A;
                    if (tm2Var2 != null) {
                        tm2Var2.B();
                    }
                    this.C = tm2Var.getNextEventTimeIndex(j);
                    this.A = tm2Var;
                    this.B = null;
                    z4 = true;
                }
            } else if (!z) {
                z4 = z;
                if (F() == Long.MAX_VALUE) {
                    if (this.x == 2) {
                        J();
                        nli nliVar4 = this.y;
                        nliVar4.getClass();
                        nliVar4.release();
                        this.y = null;
                        this.x = 0;
                        H();
                        z4 = z;
                    } else {
                        J();
                        this.H = true;
                        z4 = z;
                    }
                }
            }
        }
        if (z4) {
            this.A.getClass();
            int nextEventTimeIndex = this.A.getNextEventTimeIndex(j);
            if (nextEventTimeIndex == 0 || this.A.getEventTimeCount() == 0) {
                j3 = this.A.g;
            } else {
                tm2 tm2Var3 = this.A;
                j3 = nextEventTimeIndex == -1 ? tm2Var3.getEventTime(tm2Var3.getEventTimeCount() - 1) : tm2Var3.getEventTime(nextEventTimeIndex - 1);
            }
            G(j3);
            o74 o74Var2 = new o74(this.A.getCues(j));
            if (handler != null) {
                handler.obtainMessage(1, o74Var2).sendToTarget();
            } else {
                I(o74Var2);
            }
        }
        if (this.x == 2) {
            return;
        }
        while (!this.G) {
            try {
                uli uliVar = this.z;
                if (uliVar == null) {
                    nli nliVar5 = this.y;
                    nliVar5.getClass();
                    uliVar = (uli) nliVar5.dequeueInputBuffer();
                    if (uliVar == null) {
                        return;
                    } else {
                        this.z = uliVar;
                    }
                }
                if (this.x == 1) {
                    uliVar.b = 4;
                    nli nliVar6 = this.y;
                    nliVar6.getClass();
                    nliVar6.a(uliVar);
                    this.z = null;
                    this.x = 2;
                    return;
                }
                int v = v(fp4Var, uliVar, 0);
                if (v == -4) {
                    if (uliVar.i(4)) {
                        this.G = true;
                        this.w = false;
                        z2 = false;
                    } else {
                        b bVar2 = (b) fp4Var.c;
                        if (bVar2 == null) {
                            return;
                        }
                        uliVar.n = bVar2.t;
                        uliVar.D();
                        z2 = this.w & (!uliVar.i(1));
                        this.w = z2;
                    }
                    if (!z2) {
                        nli nliVar7 = this.y;
                        nliVar7.getClass();
                        nliVar7.a(uliVar);
                        this.z = null;
                    }
                } else if (v == -3) {
                    return;
                }
            } catch (pli e3) {
                tgj.A("Subtitle decoding failed. streamFormat=" + this.I, e3);
                E();
                J();
                nli nliVar8 = this.y;
                nliVar8.getClass();
                nliVar8.release();
                this.y = null;
                this.x = 0;
                H();
                return;
            }
        }
    }
}
