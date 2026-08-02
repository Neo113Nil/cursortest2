package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.fp4;
import defpackage.g7a;
import defpackage.kt4;
import defpackage.lg6;
import defpackage.lik;
import defpackage.m51;
import defpackage.n6c;
import defpackage.p6c;
import defpackage.qx9;
import defpackage.rd4;
import defpackage.sm8;
import defpackage.ug5;
import defpackage.ug6;
import defpackage.vic;
import defpackage.zzl;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a extends m51 implements Handler.Callback {
    public final ug5 m;
    public final lg6 n;
    public final Handler o;
    public final vic p;
    public g7a q;
    public boolean r;
    public boolean s;
    public long t;
    public Metadata u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lg6 lg6Var, Looper looper) {
        super(5);
        Handler handler;
        ug5 ug5Var = ug5.b;
        this.n = lg6Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = lik.a;
            handler = new Handler(looper, this);
        }
        this.o = handler;
        this.m = ug5Var;
        this.p = new vic(1);
        this.v = C.TIME_UNSET;
    }

    @Override // defpackage.m51
    public final String e() {
        return "MetadataRenderer";
    }

    @Override // defpackage.m51
    public final boolean g() {
        return this.s;
    }

    @Override // defpackage.m51
    public final boolean h() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            y((Metadata) message.obj);
            return true;
        }
        zzl.s();
        return false;
    }

    @Override // defpackage.m51
    public final void i() {
        this.u = null;
        this.q = null;
        this.v = C.TIME_UNSET;
    }

    @Override // defpackage.m51
    public final void k(long j, boolean z) {
        this.u = null;
        this.r = false;
        this.s = false;
    }

    @Override // defpackage.m51
    public final void o(sm8[] sm8VarArr, long j, long j2) {
        this.q = this.m.c(sm8VarArr[0]);
        Metadata metadata = this.u;
        if (metadata != null) {
            long j3 = metadata.b;
            long j4 = (this.v + j3) - j2;
            if (j3 != j4) {
                metadata = new Metadata(j4, metadata.a);
            }
            this.u = metadata;
        }
        this.v = j2;
    }

    @Override // defpackage.m51
    public final void q(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.r && this.u == null) {
                vic vicVar = this.p;
                vicVar.A();
                fp4 fp4Var = this.b;
                fp4Var.j();
                int p = p(fp4Var, vicVar, 0);
                if (p == -4) {
                    if (vicVar.i(4)) {
                        this.r = true;
                    } else {
                        vicVar.m = this.t;
                        vicVar.D();
                        g7a g7aVar = this.q;
                        int i = lik.a;
                        Metadata r = g7aVar.r(vicVar);
                        if (r != null) {
                            ArrayList arrayList = new ArrayList(r.a.length);
                            w(r, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.u = new Metadata(x(vicVar.j), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (p == -5) {
                    sm8 sm8Var = (sm8) fp4Var.c;
                    sm8Var.getClass();
                    this.t = sm8Var.p;
                }
            }
            Metadata metadata = this.u;
            if (metadata == null || metadata.b > x(j)) {
                z = false;
            } else {
                Metadata metadata2 = this.u;
                Handler handler = this.o;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    y(metadata2);
                }
                this.u = null;
                z = true;
            }
            if (this.r && this.u == null) {
                this.s = true;
            }
        }
    }

    @Override // defpackage.m51
    public final int u(sm8 sm8Var) {
        if (this.m.E(sm8Var)) {
            return m51.b(sm8Var.E == 0 ? 4 : 2, 0, 0);
        }
        return m51.b(0, 0, 0);
    }

    public final void w(Metadata metadata, ArrayList arrayList) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.a;
            if (i >= entryArr.length) {
                return;
            }
            sm8 m = entryArr[i].m();
            if (m != null) {
                ug5 ug5Var = this.m;
                if (ug5Var.E(m)) {
                    g7a c = ug5Var.c(m);
                    byte[] t = entryArr[i].t();
                    t.getClass();
                    vic vicVar = this.p;
                    vicVar.A();
                    vicVar.C(t.length);
                    ByteBuffer byteBuffer = vicVar.h;
                    int i2 = lik.a;
                    byteBuffer.put(t);
                    vicVar.D();
                    Metadata r = c.r(vicVar);
                    if (r != null) {
                        w(r, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(entryArr[i]);
            i++;
        }
    }

    public final long x(long j) {
        qx9.t(j != C.TIME_UNSET);
        qx9.t(this.v != C.TIME_UNSET);
        return j - this.v;
    }

    public final void y(Metadata metadata) {
        lg6 lg6Var = this.n;
        ug6 ug6Var = lg6Var.a;
        p6c p6cVar = ug6Var.h0;
        rd4 rd4Var = ug6Var.l;
        n6c a = p6cVar.a();
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.a;
            if (i >= entryArr.length) {
                break;
            }
            entryArr[i].e(a);
            i++;
        }
        ug6Var.h0 = new p6c(a);
        p6c a2 = ug6Var.a();
        if (!a2.equals(ug6Var.P)) {
            ug6Var.P = a2;
            rd4Var.j(14, new kt4(lg6Var, 10));
        }
        rd4Var.j(28, new kt4(metadata, 12));
        rd4Var.h();
    }
}
