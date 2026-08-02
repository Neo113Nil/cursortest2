package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ase;
import defpackage.e9p;
import defpackage.fc6;
import defpackage.jyo;
import defpackage.mho;
import defpackage.t9p;
import defpackage.v9p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzvz extends zzja {
    public final ArrayDeque A;
    public final zzud B;
    public final AtomicInteger C;
    public zzv D;
    public zzv E;
    public zzul F;
    public zzul G;
    public zznd H;
    public float I;
    public float J;
    public zzvp K;
    public zzv L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque P;
    public zzvv Q;
    public zzvs R;
    public boolean S;
    public boolean T;
    public long U;
    public long V;
    public int W;
    public int X;
    public ByteBuffer Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public long j0;
    public long k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public zzje o0;
    public v9p p0;
    public long q0;
    public boolean r0;
    public boolean s0;
    public final Context t;
    public boolean t0;
    public final zzvh u;
    public long u0;
    public final zziy v;
    public final zzjc v0;
    public final zziy w;
    public zzjc w0;
    public final zziy x;
    public final t x0;
    public final e9p y;
    public final MediaCodec.BufferInfo z;

    public zzvz(Context context, int i, zzvh zzvhVar) {
        super(i);
        this.t = context.getApplicationContext();
        this.u = zzvhVar;
        this.C = new AtomicInteger();
        this.v = new zziy(0);
        this.w = new zziy(0);
        this.x = new zziy(2);
        e9p e9pVar = new e9p(2);
        e9pVar.j = 32;
        this.y = e9pVar;
        this.z = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.A = new ArrayDeque();
        this.p0 = v9p.g;
        e9pVar.d(0);
        e9pVar.d.order(ByteOrder.nativeOrder());
        this.B = new zzud();
        this.O = -1.0f;
        this.d0 = 0;
        this.W = -1;
        this.X = -1;
        this.V = C.TIME_UNSET;
        this.j0 = C.TIME_UNSET;
        this.k0 = C.TIME_UNSET;
        this.q0 = C.TIME_UNSET;
        this.U = C.TIME_UNSET;
        this.e0 = 0;
        this.f0 = 0;
        this.o0 = new zzje();
        this.t0 = false;
        this.u0 = 0L;
        int i2 = zzgxw.c;
        this.x0 = t.j;
        zzjc zzjcVar = zzjc.b;
        this.v0 = zzjcVar;
        this.w0 = zzjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public void C(float f, float f2) {
        this.I = f;
        this.J = f2;
        r0(this.L);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final long F(long j, long j2) {
        return b0(j, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0283 A[Catch: zzvv -> 0x029d, TryCatch #3 {zzvv -> 0x029d, blocks: (B:126:0x0251, B:128:0x0283, B:130:0x0290, B:132:0x029a, B:133:0x02b4, B:138:0x02bc, B:139:0x02be, B:140:0x029f, B:184:0x02c2, B:186:0x02c3, B:189:0x02ca, B:190:0x02cb, B:191:0x02d5, B:203:0x02d8), top: B:25:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029a A[Catch: zzvv -> 0x029d, TryCatch #3 {zzvv -> 0x029d, blocks: (B:126:0x0251, B:128:0x0283, B:130:0x0290, B:132:0x029a, B:133:0x02b4, B:138:0x02bc, B:139:0x02be, B:140:0x029f, B:184:0x02c2, B:186:0x02c3, B:189:0x02ca, B:190:0x02cb, B:191:0x02d5, B:203:0x02d8), top: B:25:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029f A[Catch: zzvv -> 0x029d, TryCatch #3 {zzvv -> 0x029d, blocks: (B:126:0x0251, B:128:0x0283, B:130:0x0290, B:132:0x029a, B:133:0x02b4, B:138:0x02bc, B:139:0x02be, B:140:0x029f, B:184:0x02c2, B:186:0x02c3, B:189:0x02ca, B:190:0x02cb, B:191:0x02d5, B:203:0x02d8), top: B:25:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028d  */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.gms.internal.ads.zzja] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        zzv zzvVar;
        boolean z;
        ?? r17;
        zzvz zzvzVar;
        Exception exc;
        zzvv zzvvVar;
        ArrayDeque arrayDeque;
        zzvz zzvzVar2;
        zzv zzvVar2;
        float c0;
        int i;
        long j;
        LogSessionId logSessionId;
        LogSessionId logSessionId2;
        long zzb;
        zzvz zzvzVar3 = this;
        t tVar = zzvzVar3.x0;
        e9p e9pVar = zzvzVar3.y;
        if (zzvzVar3.K != null || zzvzVar3.Z || (zzvVar = zzvzVar3.D) == null) {
            return;
        }
        ?? r9 = 1;
        boolean z2 = true;
        if (zzvzVar3.G == null && zzvzVar3.Y(zzvVar)) {
            zzvzVar3.Z = false;
            zzvzVar3.o0();
            String str = zzvVar.o;
            if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                e9pVar.j = 32;
            } else {
                e9pVar.j = 1;
            }
            zzvzVar3.Z = true;
            return;
        }
        zzvzVar3.F = zzvzVar3.G;
        try {
            zzv zzvVar3 = zzvzVar3.D;
            ArrayDeque arrayDeque2 = null;
            try {
                if (zzvVar3 == null) {
                    throw null;
                }
                if (zzvzVar3.P == null) {
                    try {
                        ArrayList X = zzvzVar3.X(zzvVar3);
                        X.isEmpty();
                        zzvzVar3.P = new ArrayDeque();
                        if (!X.isEmpty()) {
                            zzvzVar3.P.add((zzvs) X.get(0));
                        }
                        zzvzVar3.Q = null;
                    } catch (zzwd e) {
                        throw new zzvv(zzvVar3, e, -49998);
                    }
                }
                if (zzvzVar3.P.isEmpty()) {
                    throw new zzvv(zzvVar3, null, -49999);
                }
                ArrayDeque arrayDeque3 = zzvzVar3.P;
                if (arrayDeque3 == null) {
                    throw null;
                }
                while (zzvzVar3.K == null) {
                    zzvs zzvsVar = (zzvs) arrayDeque3.peekFirst();
                    if (zzvsVar == null) {
                        throw arrayDeque2;
                    }
                    zzvzVar3.S(zzvVar3);
                    if (!zzvzVar3.L(zzvsVar)) {
                        return;
                    }
                    try {
                        zzvzVar3.R = zzvsVar;
                        zzvVar2 = zzvzVar3.D;
                    } catch (Exception e2) {
                        e = e2;
                        z = z2;
                        r17 = arrayDeque2;
                    }
                    if (zzvVar2 == null) {
                        throw arrayDeque2;
                    }
                    String str2 = zzvsVar.a;
                    float f = zzvzVar3.J;
                    try {
                        zzv[] zzvVarArr = zzvzVar3.j;
                        zzvVarArr.getClass();
                        c0 = zzvzVar3.c0(f, zzvVar2, zzvVarArr);
                        if (c0 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            c0 = -1.0f;
                        }
                        zzdp zzdpVar = zzvzVar3.g;
                        zzdpVar.getClass();
                        long zzb2 = zzdpVar.zzb();
                        z = z2;
                        try {
                            zzvm Z = zzvzVar3.Z(zzvsVar, zzvVar2, c0);
                            i = Build.VERSION.SDK_INT;
                            r17 = arrayDeque2;
                            if (i >= 31) {
                                try {
                                    zzqj zzqjVar = zzvzVar3.f;
                                    zzqjVar.getClass();
                                    synchronized (zzqjVar) {
                                        j = zzb2;
                                        ase aseVar = zzqjVar.b;
                                        if (aseVar == null) {
                                            throw r17;
                                        }
                                        logSessionId = aseVar.a;
                                    }
                                    logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
                                    if (!logSessionId.equals(logSessionId2)) {
                                        Z.b.setString("log-session-id", logSessionId.getStringId());
                                    }
                                } catch (Exception e3) {
                                    exc = e3;
                                    zzvzVar = zzvzVar3;
                                    r17 = r17;
                                    zzeh.d("Failed to initialize decoder: ".concat(zzvsVar.a), exc);
                                    arrayDeque3.removeFirst();
                                    String str3 = zzvsVar.a;
                                    int length = str3.length();
                                    String zzvVar4 = zzvVar3.toString();
                                    zzvv zzvvVar2 = new zzvv(fc6.o(new StringBuilder(length + 23 + zzvVar4.length()), "Decoder init failed: ", str3, ", ", zzvVar4), exc, zzvVar3.o, zzvsVar, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                    zzvzVar.f0(zzvvVar2);
                                    zzvvVar = zzvzVar.Q;
                                    if (zzvvVar == null) {
                                    }
                                    if (arrayDeque3.isEmpty()) {
                                    }
                                }
                            } else {
                                j = zzb2;
                            }
                            try {
                                try {
                                    StringBuilder sb = new StringBuilder(str2.length() + 12);
                                    sb.append("createCodec:");
                                    sb.append(str2);
                                    Trace.beginSection(sb.toString());
                                    zzvp a = zzvzVar3.u.a(Z);
                                    zzvzVar3.K = a;
                                    a.A(new t9p(zzvzVar3));
                                    try {
                                        Trace.endSection();
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    zzvzVar2 = Z;
                                    arrayDeque = r17;
                                    exc = e;
                                    zzvzVar = zzvzVar2;
                                    r17 = arrayDeque;
                                    zzeh.d("Failed to initialize decoder: ".concat(zzvsVar.a), exc);
                                    arrayDeque3.removeFirst();
                                    String str32 = zzvsVar.a;
                                    int length2 = str32.length();
                                    String zzvVar42 = zzvVar3.toString();
                                    zzvv zzvvVar22 = new zzvv(fc6.o(new StringBuilder(length2 + 23 + zzvVar42.length()), "Decoder init failed: ", str32, ", ", zzvVar42), exc, zzvVar3.o, zzvsVar, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                    zzvzVar.f0(zzvvVar22);
                                    zzvvVar = zzvzVar.Q;
                                    if (zzvvVar == null) {
                                        zzvzVar.Q = zzvvVar22;
                                    } else {
                                        zzvzVar.Q = new zzvv(zzvvVar.getMessage(), zzvvVar.getCause(), zzvvVar.a, zzvvVar.b, zzvvVar.c);
                                    }
                                    if (arrayDeque3.isEmpty()) {
                                        throw zzvzVar.Q;
                                    }
                                    zzvzVar3 = zzvzVar;
                                    z2 = z;
                                    arrayDeque2 = r17;
                                }
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            zzvzVar2 = zzvzVar3;
                            arrayDeque = arrayDeque2;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        z = z2;
                        r17 = arrayDeque2;
                    }
                    try {
                        zzdp zzdpVar2 = zzvzVar3.g;
                        zzdpVar2.getClass();
                        zzb = zzdpVar2.zzb();
                        if (!zzvsVar.b(zzvzVar3.t, zzvVar2)) {
                            String c = zzv.c(zzvVar2);
                            String str4 = zzfm.a;
                            Locale locale = Locale.US;
                            zzeh.c("Format exceeds selected codec's capabilities [" + c + ", " + str2 + U3.j.e);
                        }
                        zzvzVar3.O = c0;
                        zzvzVar3.L = zzvVar2;
                        zzvzVar3.S = (i == 29 && "c2.android.aac.decoder".equals(str2)) ? z : false;
                        String str5 = zzvsVar.a;
                        zzvzVar3.T = ((i > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str5) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str5) || "OMX.bcm.vdec.avc.tunnel".equals(str5) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str5) || "OMX.bcm.vdec.hevc.tunnel".equals(str5) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && !("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzvsVar.f)) ? false : z;
                    } catch (Exception e8) {
                        e = e8;
                        zzvzVar2 = zzvzVar3;
                        arrayDeque = r17;
                        exc = e;
                        zzvzVar = zzvzVar2;
                        r17 = arrayDeque;
                        zzeh.d("Failed to initialize decoder: ".concat(zzvsVar.a), exc);
                        arrayDeque3.removeFirst();
                        String str322 = zzvsVar.a;
                        int length22 = str322.length();
                        String zzvVar422 = zzvVar3.toString();
                        zzvv zzvvVar222 = new zzvv(fc6.o(new StringBuilder(length22 + 23 + zzvVar422.length()), "Decoder init failed: ", str322, ", ", zzvVar422), exc, zzvVar3.o, zzvsVar, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                        zzvzVar.f0(zzvvVar222);
                        zzvvVar = zzvzVar.Q;
                        if (zzvvVar == null) {
                        }
                        if (arrayDeque3.isEmpty()) {
                        }
                    }
                    if (zzvzVar3.K == null) {
                        throw r17;
                    }
                    if (zzvzVar3.h == 2) {
                        zzdp zzdpVar3 = zzvzVar3.g;
                        zzdpVar3.getClass();
                        zzvzVar3.V = zzdpVar3.zzb() + 1000;
                    }
                    zzvzVar3.o0.a++;
                    long j2 = zzb - j;
                    if (i >= 31 && !tVar.isEmpty()) {
                        zzvp zzvpVar = zzvzVar3.K;
                        if (zzvpVar == null) {
                            throw r17;
                        }
                        zzvpVar.a(new ArrayList(tVar));
                    }
                    zzvzVar3.d0(zzb, j2, str2);
                    zzvzVar = zzvzVar3;
                    zzvzVar3 = zzvzVar;
                    z2 = z;
                    arrayDeque2 = r17;
                }
                zzvzVar3.P = arrayDeque2;
            } catch (zzvv e9) {
                e = e9;
                throw r9.q(e, zzvVar, false, 4001);
            }
        } catch (zzvv e10) {
            e = e10;
            r9 = zzvzVar3;
            throw r9.q(e, zzvVar, false, 4001);
        }
    }

    public boolean L(zzvs zzvsVar) {
        return true;
    }

    public final void M() {
        try {
            zzvp zzvpVar = this.K;
            if (zzvpVar != null) {
                zzvpVar.zzl();
                this.o0.b++;
                zzvs zzvsVar = this.R;
                if (zzvsVar == null) {
                    throw null;
                }
                e0(zzvsVar.a);
            }
            this.K = null;
            this.F = null;
            Q();
        } catch (Throwable th) {
            this.K = null;
            this.F = null;
            Q();
            throw th;
        }
    }

    public boolean N() {
        int i = this.f0;
        if (i == 3 || (this.S && !this.i0)) {
            return true;
        }
        if (i == 2) {
            try {
                zzul zzulVar = this.G;
                zzulVar.getClass();
                this.F = zzulVar;
                this.e0 = 0;
                this.f0 = 0;
            } catch (zzjn e) {
                zzeh.d("Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    public boolean O() {
        return true;
    }

    public void P() {
        this.W = -1;
        this.w.d = null;
        this.X = -1;
        this.Y = null;
        this.j0 = C.TIME_UNSET;
        this.k0 = C.TIME_UNSET;
        v0().f = C.TIME_UNSET;
        this.q0 = C.TIME_UNSET;
        this.V = C.TIME_UNSET;
        this.h0 = false;
        this.U = C.TIME_UNSET;
        this.g0 = false;
        this.e0 = 0;
        this.f0 = 0;
        this.d0 = this.c0 ? 1 : 0;
        this.t0 = false;
        this.u0 = 0L;
    }

    public final void Q() {
        P();
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.i0 = false;
        this.O = -1.0f;
        this.S = false;
        this.T = false;
        this.c0 = false;
        this.d0 = 0;
    }

    public zzvr R(IllegalStateException illegalStateException, zzvs zzvsVar) {
        return new zzvr(illegalStateException, zzvsVar);
    }

    public int U(zziy zziyVar) {
        return 0;
    }

    public boolean V(zziy zziyVar) {
        return false;
    }

    public abstract int W(zzv zzvVar);

    public abstract ArrayList X(zzv zzvVar);

    public boolean Y(zzv zzvVar) {
        return false;
    }

    public abstract zzvm Z(zzvs zzvsVar, zzv zzvVar, float f);

    public zzjf a0(zzvs zzvsVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        throw null;
    }

    public long b0(long j, long j2) {
        return super.F(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final int c(zzv zzvVar) {
        try {
            return W(zzvVar);
        } catch (zzwd e) {
            throw this.q(e, zzvVar, false, 4002);
        }
    }

    public float c0(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void d0(long j, long j2, String str) {
        throw null;
    }

    public void e0(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzmz
    public void f(int i, Object obj) {
        if (i != 11) {
            return;
        }
        zznd zzndVar = (zznd) obj;
        zzndVar.getClass();
        this.H = zzndVar;
    }

    public void f0(Exception exc) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public void g(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.A;
        if (!arrayDeque.isEmpty()) {
            this.p0 = (v9p) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.l0 = false;
            this.m0 = false;
            if (this.Z) {
                o0();
            } else if (this.K != null) {
                if (N()) {
                    M();
                    K();
                } else if (O()) {
                    v();
                } else {
                    this.t0 = true;
                }
            }
            if (this.p0.d.b() > 0) {
                this.n0 = true;
            }
            zzfi zzfiVar = this.p0.d;
            synchronized (zzfiVar) {
                zzfiVar.c = 0;
                zzfiVar.d = 0;
                Arrays.fill(zzfiVar.b, (Object) null);
            }
            this.p0.e = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (java.util.Objects.equals(r2, com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (s0() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d1, code lost:
    
        if (s0() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00df, code lost:
    
        if (s0() == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzjf g0(zzma zzmaVar) {
        int i;
        Pair b;
        String str;
        this.n0 = true;
        zzv zzvVar = zzmaVar.b;
        zzvVar.getClass();
        String str2 = zzvVar.o;
        if (str2 == null) {
            throw q(new IllegalArgumentException("Sample MIME type is null."), zzvVar, false, 4005);
        }
        if (!str2.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) && !str2.equals(MimeTypes.VIDEO_VP9)) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = zzdr.a;
                if (str2.equals("video/dolby-vision") && (b = zzdr.b(zzvVar)) != null) {
                    int intValue = ((Integer) b.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = "video/hevc";
                    } else if (intValue == 512) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                    }
                }
                str = null;
            }
            zzv zzvVar2 = zzvVar;
            this.G = zzmaVar.a;
            this.D = zzvVar2;
            if (!this.Z) {
                this.b0 = true;
                return null;
            }
            zzvp zzvpVar = this.K;
            if (zzvpVar == null) {
                this.P = null;
                K();
                return null;
            }
            zzvs zzvsVar = this.R;
            zzvsVar.getClass();
            zzv zzvVar3 = this.L;
            zzvVar3.getClass();
            zzul zzulVar = this.F;
            zzul zzulVar2 = this.G;
            if (zzulVar != zzulVar2) {
                if (this.g0) {
                    this.e0 = 1;
                    this.f0 = 3;
                } else {
                    M();
                    K();
                }
                return new zzjf(zzvsVar.a, zzvVar3, zzvVar2, 0, 128);
            }
            zzjf a0 = a0(zzvsVar, zzvVar3, zzvVar2, v0().e);
            int i2 = a0.d;
            if (i2 != 0) {
                if (i2 == 1) {
                    r0(zzvVar2);
                    this.L = zzvVar2;
                    if (zzulVar2 == zzulVar) {
                        if (this.g0) {
                            this.e0 = 1;
                            if (N()) {
                                this.f0 = 3;
                                i = 2;
                            } else {
                                this.f0 = 1;
                            }
                        }
                    }
                } else if (i2 != 2) {
                    r0(zzvVar2);
                    this.L = zzvVar2;
                    if (zzulVar2 != zzulVar) {
                    }
                } else {
                    r0(zzvVar2);
                    this.c0 = true;
                    this.d0 = 1;
                    this.L = zzvVar2;
                    if (zzulVar2 != zzulVar) {
                    }
                }
                return (i2 != 0 || (this.K == zzvpVar && this.f0 != 3)) ? a0 : new zzjf(zzvsVar.a, zzvVar3, zzvVar2, 0, i);
            }
            if (this.g0) {
                this.e0 = 1;
                this.f0 = 3;
            } else {
                M();
                K();
            }
            i = 0;
            if (i2 != 0) {
            }
        }
        if (!zzvVar.r.isEmpty()) {
            zzt zztVar = new zzt(zzvVar);
            zztVar.q = null;
            zzvVar = new zzv(zztVar);
        }
        zzv zzvVar22 = zzvVar;
        this.G = zzmaVar.a;
        this.D = zzvVar22;
        if (!this.Z) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public boolean h() {
        return this.m0;
    }

    public void h0(zzv zzvVar, MediaFormat mediaFormat) {
        throw null;
    }

    public abstract boolean j0(long j, long j2, zzvp zzvpVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar);

    public abstract void k0(zzjc zzjcVar);

    @Override // com.google.android.gms.internal.ads.zzja
    public void l() {
        this.D = null;
        u0(v9p.g);
        this.A.clear();
        if (this.Z) {
            this.Z = false;
            o0();
        } else {
            if (this.K == null) {
                return;
            }
            if (N()) {
                M();
            } else if (O()) {
                v();
            } else {
                this.t0 = true;
            }
        }
    }

    public void l0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public void m() {
        try {
            this.Z = false;
            o0();
            M();
        } finally {
            this.G = null;
        }
    }

    public void n0(zziy zziyVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void o() {
        v0();
    }

    public final void o0() {
        this.j0 = C.TIME_UNSET;
        this.k0 = C.TIME_UNSET;
        v0().f = C.TIME_UNSET;
        this.q0 = C.TIME_UNSET;
        this.b0 = false;
        this.y.c();
        this.x.c();
        this.a0 = false;
        ByteBuffer byteBuffer = zzcp.a;
        zzud zzudVar = this.B;
        zzudVar.a = byteBuffer;
        zzudVar.c = 0;
        zzudVar.b = 2;
    }

    public void p0(long j) {
        this.q0 = Math.max(j, this.q0);
        while (true) {
            ArrayDeque arrayDeque = this.A;
            if (arrayDeque.isEmpty() || j < ((v9p) arrayDeque.peek()).a) {
                return;
            }
            v9p v9pVar = (v9p) arrayDeque.poll();
            v9pVar.getClass();
            u0(v9pVar);
            i0();
        }
    }

    public final void q0(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.v0.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    public final void r0(zzv zzvVar) {
        if (this.K == null || this.f0 == 3 || this.h == 0) {
            return;
        }
        float f = this.J;
        zzvVar.getClass();
        zzv[] zzvVarArr = this.j;
        zzvVarArr.getClass();
        float c0 = c0(f, zzvVar, zzvVarArr);
        float f2 = this.O;
        if (f2 == c0 || c0 == -1.0f) {
            return;
        }
        if (f2 != -1.0f || c0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", c0);
            zzvp zzvpVar = this.K;
            zzvpVar.getClass();
            zzvpVar.j(bundle);
            this.O = c0;
        }
    }

    public final boolean s0() {
        if (this.g0) {
            this.e0 = 1;
            if (N()) {
                this.f0 = 3;
                return false;
            }
            this.f0 = 2;
            return true;
        }
        zzul zzulVar = this.G;
        zzulVar.getClass();
        this.F = zzulVar;
        this.e0 = 0;
        this.f0 = 0;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public void t(boolean z, boolean z2) {
        this.o0 = new zzje();
    }

    public final void t0() {
        int i = this.f0;
        if (i == 1) {
            v();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.m0 = true;
                l0();
                return;
            } else {
                M();
                K();
                return;
            }
        }
        v();
        zzul zzulVar = this.G;
        zzulVar.getClass();
        this.F = zzulVar;
        this.e0 = 0;
        this.f0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(zzv[] zzvVarArr, long j, long j2, zzxo zzxoVar) {
        this.i.getClass();
        if (this.p0.c == C.TIME_UNSET) {
            u0(new v9p(C.TIME_UNSET, j, j2));
            if (this.s0) {
                i0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.A;
        if (arrayDeque.isEmpty()) {
            long j3 = this.j0;
            if (j3 != C.TIME_UNSET) {
                long j4 = this.q0;
                if (j4 != C.TIME_UNSET) {
                }
            }
            u0(new v9p(C.TIME_UNSET, j, j2));
            if (this.p0.c != C.TIME_UNSET) {
                i0();
                return;
            }
            return;
        }
        arrayDeque.add(new v9p(this.j0, j, j2));
    }

    public final void u0(v9p v9pVar) {
        this.p0 = v9pVar;
        long j = v9pVar.c;
        if (j != C.TIME_UNSET) {
            this.r0 = true;
            m0(j);
        }
    }

    public final void v() {
        try {
            zzvp zzvpVar = this.K;
            if (zzvpVar == null) {
                throw null;
            }
            zzvpVar.zzk();
        } finally {
            P();
        }
    }

    public final v9p v0() {
        ArrayDeque arrayDeque = this.A;
        return !arrayDeque.isEmpty() ? (v9p) arrayDeque.getLast() : this.p0;
    }

    public final boolean w(int i) {
        zzma zzmaVar = this.c;
        zzmaVar.a = null;
        zzmaVar.b = null;
        zziy zziyVar = this.v;
        zziyVar.c();
        int r = r(zzmaVar, zziyVar, i | 4);
        if (r == -5) {
            g0(zzmaVar);
            return true;
        }
        if (r != -4 || !zziyVar.b(4)) {
            return false;
        }
        this.l0 = true;
        t0();
        return false;
    }

    public final boolean w0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.E;
        return zzvVar == null || !Objects.equals(zzvVar.o, MimeTypes.AUDIO_OPUS) || j - j2 > 80000;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public boolean x() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:308:0x0339, code lost:
    
        t0();
        r3 = -1;
        r27 = r10;
        r25 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x038d, code lost:
    
        if (r2 != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x01f9, code lost:
    
        r30.a0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x008b, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05a8 A[Catch: CryptoException -> 0x052f, IllegalStateException -> 0x0595, TryCatch #4 {CryptoException -> 0x052f, blocks: (B:24:0x0670, B:247:0x0649, B:252:0x0523, B:181:0x0533, B:183:0x0537, B:185:0x053d, B:187:0x0544, B:191:0x054c, B:193:0x0554, B:195:0x055a, B:196:0x055f, B:198:0x0563, B:200:0x056d, B:202:0x0577, B:204:0x0578, B:206:0x0586, B:209:0x059a, B:210:0x05a2, B:212:0x05a8, B:215:0x05b3, B:216:0x05be, B:218:0x05c9, B:219:0x05cc, B:221:0x05d0, B:223:0x05d6, B:224:0x05e0, B:225:0x05e6, B:229:0x05f7, B:230:0x0611, B:232:0x05ff, B:234:0x060a, B:236:0x0622, B:271:0x0637, B:285:0x0648, B:299:0x064f, B:364:0x0653, B:370:0x0656, B:21:0x0657, B:23:0x066d), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05c9 A[Catch: CryptoException -> 0x052f, IllegalStateException -> 0x0595, TryCatch #4 {CryptoException -> 0x052f, blocks: (B:24:0x0670, B:247:0x0649, B:252:0x0523, B:181:0x0533, B:183:0x0537, B:185:0x053d, B:187:0x0544, B:191:0x054c, B:193:0x0554, B:195:0x055a, B:196:0x055f, B:198:0x0563, B:200:0x056d, B:202:0x0577, B:204:0x0578, B:206:0x0586, B:209:0x059a, B:210:0x05a2, B:212:0x05a8, B:215:0x05b3, B:216:0x05be, B:218:0x05c9, B:219:0x05cc, B:221:0x05d0, B:223:0x05d6, B:224:0x05e0, B:225:0x05e6, B:229:0x05f7, B:230:0x0611, B:232:0x05ff, B:234:0x060a, B:236:0x0622, B:271:0x0637, B:285:0x0648, B:299:0x064f, B:364:0x0653, B:370:0x0656, B:21:0x0657, B:23:0x066d), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05d0 A[Catch: CryptoException -> 0x052f, IllegalStateException -> 0x0595, TryCatch #4 {CryptoException -> 0x052f, blocks: (B:24:0x0670, B:247:0x0649, B:252:0x0523, B:181:0x0533, B:183:0x0537, B:185:0x053d, B:187:0x0544, B:191:0x054c, B:193:0x0554, B:195:0x055a, B:196:0x055f, B:198:0x0563, B:200:0x056d, B:202:0x0577, B:204:0x0578, B:206:0x0586, B:209:0x059a, B:210:0x05a2, B:212:0x05a8, B:215:0x05b3, B:216:0x05be, B:218:0x05c9, B:219:0x05cc, B:221:0x05d0, B:223:0x05d6, B:224:0x05e0, B:225:0x05e6, B:229:0x05f7, B:230:0x0611, B:232:0x05ff, B:234:0x060a, B:236:0x0622, B:271:0x0637, B:285:0x0648, B:299:0x064f, B:364:0x0653, B:370:0x0656, B:21:0x0657, B:23:0x066d), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05ff A[Catch: CryptoException -> 0x052f, IllegalStateException -> 0x0595, TryCatch #4 {CryptoException -> 0x052f, blocks: (B:24:0x0670, B:247:0x0649, B:252:0x0523, B:181:0x0533, B:183:0x0537, B:185:0x053d, B:187:0x0544, B:191:0x054c, B:193:0x0554, B:195:0x055a, B:196:0x055f, B:198:0x0563, B:200:0x056d, B:202:0x0577, B:204:0x0578, B:206:0x0586, B:209:0x059a, B:210:0x05a2, B:212:0x05a8, B:215:0x05b3, B:216:0x05be, B:218:0x05c9, B:219:0x05cc, B:221:0x05d0, B:223:0x05d6, B:224:0x05e0, B:225:0x05e6, B:229:0x05f7, B:230:0x0611, B:232:0x05ff, B:234:0x060a, B:236:0x0622, B:271:0x0637, B:285:0x0648, B:299:0x064f, B:364:0x0653, B:370:0x0656, B:21:0x0657, B:23:0x066d), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0154 A[Catch: IllegalStateException -> 0x00af, CryptoException -> 0x00b4, TRY_ENTER, TryCatch #2 {IllegalStateException -> 0x00af, blocks: (B:406:0x021c, B:394:0x00ac, B:395:0x00bf, B:397:0x00c3, B:402:0x00d2, B:407:0x00e2, B:408:0x00f1, B:478:0x00fe, B:480:0x0104, B:454:0x0204, B:456:0x020a, B:457:0x020d, B:459:0x0213, B:461:0x0217, B:412:0x0113, B:475:0x011a, B:414:0x0127, B:416:0x0137, B:419:0x0146, B:420:0x014e, B:423:0x0154, B:425:0x0158, B:427:0x0162, B:429:0x016c, B:430:0x0193, B:432:0x019b, B:433:0x019c, B:435:0x01a3, B:437:0x01ab, B:439:0x01b3, B:440:0x01ba, B:444:0x01cb, B:445:0x01d7, B:448:0x01ee, B:453:0x01f9, B:468:0x01de, B:483:0x01fc, B:18:0x0231, B:39:0x0268, B:41:0x026e, B:43:0x0278, B:46:0x0280, B:47:0x028b, B:49:0x0294, B:52:0x02a0, B:78:0x02b1, B:72:0x02b9, B:67:0x02c1, B:61:0x02c9, B:55:0x02d1, B:85:0x02d9, B:87:0x02e8, B:88:0x02ed, B:92:0x02f8, B:94:0x02f9, B:96:0x02fd, B:98:0x0301, B:100:0x0305, B:101:0x0308, B:103:0x030e, B:105:0x031e), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x01f5 A[LOOP:5: B:408:0x00f1->B:450:0x01f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01de A[Catch: IllegalStateException -> 0x00af, CryptoException -> 0x00b4, TryCatch #2 {IllegalStateException -> 0x00af, blocks: (B:406:0x021c, B:394:0x00ac, B:395:0x00bf, B:397:0x00c3, B:402:0x00d2, B:407:0x00e2, B:408:0x00f1, B:478:0x00fe, B:480:0x0104, B:454:0x0204, B:456:0x020a, B:457:0x020d, B:459:0x0213, B:461:0x0217, B:412:0x0113, B:475:0x011a, B:414:0x0127, B:416:0x0137, B:419:0x0146, B:420:0x014e, B:423:0x0154, B:425:0x0158, B:427:0x0162, B:429:0x016c, B:430:0x0193, B:432:0x019b, B:433:0x019c, B:435:0x01a3, B:437:0x01ab, B:439:0x01b3, B:440:0x01ba, B:444:0x01cb, B:445:0x01d7, B:448:0x01ee, B:453:0x01f9, B:468:0x01de, B:483:0x01fc, B:18:0x0231, B:39:0x0268, B:41:0x026e, B:43:0x0278, B:46:0x0280, B:47:0x028b, B:49:0x0294, B:52:0x02a0, B:78:0x02b1, B:72:0x02b9, B:67:0x02c1, B:61:0x02c9, B:55:0x02d1, B:85:0x02d9, B:87:0x02e8, B:88:0x02ed, B:92:0x02f8, B:94:0x02f9, B:96:0x02fd, B:98:0x0301, B:100:0x0305, B:101:0x0308, B:103:0x030e, B:105:0x031e), top: B:16:0x0033 }] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.google.android.gms.internal.ads.zzul, com.google.android.gms.internal.ads.zzv, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, com.google.android.gms.internal.ads.zzul, com.google.android.gms.internal.ads.zzv, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzvz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.google.android.gms.internal.ads.zzne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(long j, long j2) {
        boolean z;
        ?? r6;
        boolean z2;
        boolean z3;
        zzma zzmaVar;
        zziy zziyVar;
        ?? r2;
        boolean z4;
        zzma zzmaVar2;
        zziy zziyVar2;
        int i;
        char c;
        zzv zzvVar;
        boolean z5;
        boolean z6;
        zzma zzmaVar3;
        zziy zziyVar3;
        int i2;
        Throwable th;
        ?? r15;
        zziy zziyVar4;
        zzma zzmaVar4;
        int i3;
        int i4;
        t tVar = this.x0;
        boolean z7 = true;
        try {
            try {
                if (this.m0) {
                    l0();
                    return;
                }
                int i5 = 2;
                if (this.D == null && !w(2)) {
                    return;
                }
                K();
                z = this.Z;
                ?? r62 = 268435456;
                char c2 = 0;
                r6 = 268435456;
                char c3 = 0;
                zzma zzmaVar5 = this.c;
                char c4 = 65531;
                int i6 = 4;
                zziy zziyVar5 = this.w;
                Throwable th2 = null;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (z) {
                                        try {
                                            try {
                                                Trace.beginSection("bypassRender");
                                                while (true) {
                                                    zzguk.f(this.m0 ^ z7);
                                                    e9p e9pVar = this.y;
                                                    if (e9pVar.h()) {
                                                        ByteBuffer byteBuffer = e9pVar.d;
                                                        zzma zzmaVar6 = zzmaVar5;
                                                        int i7 = this.X;
                                                        int i8 = e9pVar.i;
                                                        zziy zziyVar6 = zziyVar5;
                                                        Throwable th3 = th2;
                                                        long j3 = e9pVar.e;
                                                        boolean w0 = w0(this.l, e9pVar.h);
                                                        boolean b = e9pVar.b(i6);
                                                        zzv zzvVar2 = this.E;
                                                        if (zzvVar2 == null) {
                                                            throw th3;
                                                        }
                                                        zziyVar = zziyVar6;
                                                        zzmaVar = zzmaVar6;
                                                        if (!j0(j, j2, null, byteBuffer, i7, 0, i8, j3, w0, b, zzvVar2)) {
                                                            z7 = true;
                                                            break;
                                                        } else {
                                                            p0(e9pVar.h);
                                                            e9pVar.c();
                                                            r2 = 0;
                                                        }
                                                    } else {
                                                        zzmaVar = zzmaVar5;
                                                        zziyVar = zziyVar5;
                                                        r2 = th2;
                                                    }
                                                    try {
                                                        if (this.l0) {
                                                            z7 = true;
                                                            this.m0 = true;
                                                            break;
                                                        }
                                                        z7 = true;
                                                        boolean z8 = this.a0;
                                                        zziy zziyVar7 = this.x;
                                                        if (z8) {
                                                            zzguk.f(e9pVar.i(zziyVar7));
                                                            z4 = false;
                                                            this.a0 = false;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (this.b0) {
                                                            if (!e9pVar.h()) {
                                                                this.Z = z4;
                                                                o0();
                                                                this.b0 = z4;
                                                                K();
                                                                if (!this.Z) {
                                                                    break;
                                                                }
                                                            } else {
                                                                zzmaVar2 = zzmaVar;
                                                                zziyVar2 = zziyVar;
                                                                i = 4;
                                                                c = 0;
                                                                th2 = r2;
                                                                zzmaVar5 = zzmaVar2;
                                                                c2 = c;
                                                                c4 = 65531;
                                                                zziyVar5 = zziyVar2;
                                                                i6 = i;
                                                                c3 = 0;
                                                            }
                                                        }
                                                        zzguk.f(!this.l0);
                                                        zzmaVar2 = zzmaVar;
                                                        zzmaVar2.a = r2;
                                                        zzmaVar2.b = r2;
                                                        zziyVar7.c();
                                                        while (true) {
                                                            zziyVar7.c();
                                                            int r = r(zzmaVar2, zziyVar7, z4 ? 1 : 0);
                                                            if (r == -5) {
                                                                zziyVar2 = zziyVar;
                                                                i = 4;
                                                                c = 0;
                                                                g0(zzmaVar2);
                                                                break;
                                                            }
                                                            if (r != -4) {
                                                                if (J()) {
                                                                    v0().f = this.j0;
                                                                }
                                                                zziyVar2 = zziyVar;
                                                                i = 4;
                                                            } else {
                                                                i = 4;
                                                                if (zziyVar7.b(4)) {
                                                                    this.l0 = true;
                                                                    v0().f = this.j0;
                                                                    zziyVar2 = zziyVar;
                                                                    break;
                                                                }
                                                                this.j0 = Math.max(this.j0, zziyVar7.e);
                                                                if (J()) {
                                                                    zziyVar2 = zziyVar;
                                                                } else {
                                                                    zziyVar2 = zziyVar;
                                                                    if (zziyVar2.b(536870912)) {
                                                                    }
                                                                    if (this.n0) {
                                                                        zzv zzvVar3 = this.D;
                                                                        if (zzvVar3 == null) {
                                                                            throw r2;
                                                                        }
                                                                        this.E = zzvVar3;
                                                                        if (Objects.equals(zzvVar3.o, MimeTypes.AUDIO_OPUS) && !this.E.r.isEmpty()) {
                                                                            byte[] bArr = (byte[]) this.E.r.get(z4 ? 1 : 0);
                                                                            int i9 = (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                                                                            zzt a = this.E.a();
                                                                            a.K = i9;
                                                                            this.E = a.a();
                                                                        }
                                                                        h0(this.E, r2);
                                                                        this.n0 = z4;
                                                                    }
                                                                    zziyVar7.f();
                                                                    zzvVar = this.E;
                                                                    if (zzvVar == null && Objects.equals(zzvVar.o, MimeTypes.AUDIO_OPUS)) {
                                                                        c = 0;
                                                                        if (zziyVar7.b(268435456)) {
                                                                            zziyVar7.b = this.E;
                                                                            n0(zziyVar7);
                                                                        }
                                                                        if (this.l - zziyVar7.e <= 80000 ? true : z4 ? 1 : 0) {
                                                                            this.B.a(zziyVar7, this.E.r);
                                                                        }
                                                                    } else {
                                                                        c = 0;
                                                                    }
                                                                    if (!e9pVar.h()) {
                                                                        long j4 = this.l;
                                                                        if (w0(j4, e9pVar.h) != w0(j4, zziyVar7.e)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (e9pVar.i(zziyVar7)) {
                                                                        break;
                                                                    } else {
                                                                        zziyVar = zziyVar2;
                                                                    }
                                                                }
                                                                v0().f = this.j0;
                                                                if (this.n0) {
                                                                }
                                                                zziyVar7.f();
                                                                zzvVar = this.E;
                                                                if (zzvVar == null) {
                                                                }
                                                                c = 0;
                                                                if (!e9pVar.h()) {
                                                                }
                                                                if (e9pVar.i(zziyVar7)) {
                                                                }
                                                            }
                                                        }
                                                        c = 0;
                                                        if (e9pVar.h()) {
                                                            e9pVar.f();
                                                        }
                                                        if (!e9pVar.h() && !this.l0 && !this.b0) {
                                                            break;
                                                        }
                                                        th2 = r2;
                                                        zzmaVar5 = zzmaVar2;
                                                        c2 = c;
                                                        c4 = 65531;
                                                        zziyVar5 = zziyVar2;
                                                        i6 = i;
                                                        c3 = 0;
                                                    } catch (IllegalStateException e) {
                                                        e = e;
                                                        z7 = true;
                                                        z = false;
                                                        r62 = z;
                                                        z = z7;
                                                        z2 = e instanceof MediaCodec.CodecException;
                                                        if (!z2) {
                                                        }
                                                        f0(e);
                                                        if (z2) {
                                                        }
                                                        if (z3) {
                                                        }
                                                        zzvr R = R(e, this.R);
                                                        throw q(R, this.D, z3, R.a == 1101 ? 4006 : 4003);
                                                    }
                                                }
                                                Trace.endSection();
                                            } catch (IllegalStateException e2) {
                                                e = e2;
                                            }
                                        } catch (MediaCodec.CryptoException e3) {
                                            e = e3;
                                            z = false;
                                            r6 = z;
                                            throw q(e, this.D, r6, zzfm.g(e.getErrorCode()));
                                        }
                                    } else {
                                        int i10 = 4;
                                        zziy zziyVar8 = zziyVar5;
                                        Throwable th4 = null;
                                        boolean z9 = false;
                                        char c5 = 0;
                                        zzma zzmaVar7 = zzmaVar5;
                                        try {
                                            if (this.K != null) {
                                                try {
                                                    zzdp zzdpVar = this.g;
                                                    zzdpVar.getClass();
                                                    zzdpVar.zzb();
                                                    Trace.beginSection("drainAndFeed");
                                                    zzma zzmaVar8 = zzmaVar7;
                                                    while (true) {
                                                        zzvp zzvpVar = this.K;
                                                        if (zzvpVar == null) {
                                                            throw th4;
                                                        }
                                                        boolean z10 = this.X >= 0 ? z7 : z9;
                                                        MediaCodec.BufferInfo bufferInfo = this.z;
                                                        try {
                                                            if (!z10) {
                                                                int u = zzvpVar.u(bufferInfo);
                                                                if (u >= 0) {
                                                                    bufferInfo.presentationTimeUs -= this.u0;
                                                                    if (bufferInfo.size == 0 && (bufferInfo.flags & i10) != 0) {
                                                                        break;
                                                                    }
                                                                    this.X = u;
                                                                    ByteBuffer p = zzvpVar.p(u);
                                                                    this.Y = p;
                                                                    if (p != null) {
                                                                        p.position(bufferInfo.offset);
                                                                        this.Y.limit(bufferInfo.offset + bufferInfo.size);
                                                                    }
                                                                    zzv zzvVar4 = (zzv) this.p0.d.d(bufferInfo.presentationTimeUs);
                                                                    if (zzvVar4 == null && this.r0 && this.M != null) {
                                                                        zzvVar4 = (zzv) this.p0.d.c();
                                                                    }
                                                                    if (zzvVar4 != null) {
                                                                        this.E = zzvVar4;
                                                                    } else if (this.N) {
                                                                        zzvVar4 = this.E;
                                                                    }
                                                                    h0(zzvVar4, this.M);
                                                                    this.N = z9;
                                                                    this.r0 = z9;
                                                                } else if (u == -2) {
                                                                    this.i0 = z7;
                                                                    zzvp zzvpVar2 = this.K;
                                                                    if (zzvpVar2 == null) {
                                                                        throw th4;
                                                                    }
                                                                    MediaFormat zzg = zzvpVar2.zzg();
                                                                    if (Build.VERSION.SDK_INT >= 29 && !tVar.isEmpty()) {
                                                                        zzjc zzjcVar = zzjc.b;
                                                                        zzjb zzjbVar = new zzjb();
                                                                        Iterator it = tVar.iterator();
                                                                        while (true) {
                                                                            mho mhoVar = (mho) it;
                                                                            if (!mhoVar.hasNext()) {
                                                                                break;
                                                                            }
                                                                            String str = (String) mhoVar.next();
                                                                            if (zzg.containsKey(str)) {
                                                                                int valueTypeForKey = zzg.getValueTypeForKey(str);
                                                                                if (valueTypeForKey == z7) {
                                                                                    zzjbVar.a(zzg.getInteger(str), str);
                                                                                } else if (valueTypeForKey == i5) {
                                                                                    zzjbVar.b(zzg.getLong(str), str);
                                                                                } else if (valueTypeForKey == 3) {
                                                                                    zzjbVar.c(str, zzg.getFloat(str));
                                                                                } else if (valueTypeForKey == i10) {
                                                                                    zzjbVar.d(str, zzg.getString(str));
                                                                                } else if (valueTypeForKey == 5) {
                                                                                    zzjbVar.e(str, zzg.getByteBuffer(str));
                                                                                }
                                                                            }
                                                                        }
                                                                        zzjc zzjcVar2 = new zzjc(zzjbVar.a);
                                                                        if (!zzjcVar2.equals(this.w0)) {
                                                                            this.w0 = zzjcVar2;
                                                                            k0(zzjcVar2);
                                                                        }
                                                                    }
                                                                    this.M = zzg;
                                                                    this.N = z7;
                                                                    th = th4;
                                                                    zziyVar3 = zziyVar8;
                                                                    zzmaVar3 = zzmaVar8;
                                                                    th4 = th;
                                                                    zzmaVar8 = zzmaVar3;
                                                                    zziyVar8 = zziyVar3;
                                                                    z7 = true;
                                                                    z9 = false;
                                                                    i5 = 2;
                                                                    c5 = 0;
                                                                } else {
                                                                    if (this.T && (this.l0 || this.e0 == i5)) {
                                                                        t0();
                                                                    }
                                                                    long j5 = this.U;
                                                                    if (j5 != C.TIME_UNSET) {
                                                                        long j6 = j5 + 100;
                                                                        zzdp zzdpVar2 = this.g;
                                                                        zzdpVar2.getClass();
                                                                        if (j6 < zzdpVar2.zza()) {
                                                                            t0();
                                                                        }
                                                                    }
                                                                    r15 = th4;
                                                                    i2 = -1;
                                                                    zziyVar3 = zziyVar8;
                                                                    zzmaVar3 = zzmaVar8;
                                                                }
                                                            }
                                                            ByteBuffer byteBuffer2 = this.Y;
                                                            int i11 = this.X;
                                                            int i12 = bufferInfo.flags;
                                                            long j7 = bufferInfo.presentationTimeUs;
                                                            zzv zzvVar5 = this.E;
                                                            if (zzvVar5 == null) {
                                                                throw null;
                                                            }
                                                            zzmaVar3 = zzmaVar8;
                                                            zziyVar3 = zziyVar8;
                                                            if (!j0(j, j2, zzvpVar, byteBuffer2, i11, i12, 1, j7, z5, z6, zzvVar5)) {
                                                                i2 = -1;
                                                                i10 = 4;
                                                                break;
                                                            }
                                                            p0(bufferInfo.presentationTimeUs);
                                                            i10 = 4;
                                                            boolean z11 = (bufferInfo.flags & 4) != 0;
                                                            if (!z11 && this.h0 && z6) {
                                                                zzdp zzdpVar3 = this.g;
                                                                zzdpVar3.getClass();
                                                                this.U = zzdpVar3.zza();
                                                            }
                                                            i2 = -1;
                                                            this.X = -1;
                                                            th = null;
                                                            r15 = 0;
                                                            this.Y = null;
                                                            if (z11) {
                                                                t0();
                                                                break;
                                                            }
                                                            th4 = th;
                                                            zzmaVar8 = zzmaVar3;
                                                            zziyVar8 = zziyVar3;
                                                            z7 = true;
                                                            z9 = false;
                                                            i5 = 2;
                                                            c5 = 0;
                                                        } catch (IllegalStateException e4) {
                                                            e = e4;
                                                            r62 = 0;
                                                            z = true;
                                                            z2 = e instanceof MediaCodec.CodecException;
                                                            if (!z2) {
                                                                StackTraceElement[] stackTrace = e.getStackTrace();
                                                                if (stackTrace.length <= 0 || !stackTrace[r62].getClassName().equals("android.media.MediaCodec")) {
                                                                    throw e;
                                                                }
                                                            }
                                                            f0(e);
                                                            z3 = (z2 || !((MediaCodec.CodecException) e).isRecoverable()) ? r62 : z;
                                                            if (z3) {
                                                                M();
                                                            }
                                                            zzvr R2 = R(e, this.R);
                                                            throw q(R2, this.D, z3, R2.a == 1101 ? 4006 : 4003);
                                                        }
                                                        z5 = (this.t0 || bufferInfo.presentationTimeUs < this.l) ? true : z9;
                                                        long j8 = this.p0.f;
                                                        z6 = j8 != C.TIME_UNSET && j8 <= bufferInfo.presentationTimeUs;
                                                    }
                                                    r15 = 0;
                                                    while (true) {
                                                        v0();
                                                        if (H() == null) {
                                                            throw r15;
                                                        }
                                                        zzvp zzvpVar3 = this.K;
                                                        if (zzvpVar3 == null || this.e0 == 2 || this.l0) {
                                                            break;
                                                        }
                                                        if (this.W < 0) {
                                                            int zze = zzvpVar3.zze();
                                                            this.W = zze;
                                                            if (zze < 0) {
                                                                break;
                                                            }
                                                            zziyVar4 = zziyVar3;
                                                            zziyVar4.d = zzvpVar3.g(zze);
                                                            zziyVar4.c();
                                                        } else {
                                                            zziyVar4 = zziyVar3;
                                                        }
                                                        z = true;
                                                        if (this.e0 == 1) {
                                                            if (!this.T) {
                                                                this.h0 = true;
                                                                zzvpVar3.B(this.W, 0, 4, 0L);
                                                                this.W = i2;
                                                                zziyVar4.d = r15;
                                                            }
                                                            this.e0 = 2;
                                                        } else {
                                                            if (this.d0 == 1) {
                                                                int i13 = 0;
                                                                while (true) {
                                                                    try {
                                                                        zzv zzvVar6 = this.L;
                                                                        if (zzvVar6 == null) {
                                                                            throw r15;
                                                                        }
                                                                        if (i13 >= zzvVar6.r.size()) {
                                                                            this.d0 = 2;
                                                                            break;
                                                                        }
                                                                        byte[] bArr2 = (byte[]) this.L.r.get(i13);
                                                                        ByteBuffer byteBuffer3 = zziyVar4.d;
                                                                        if (byteBuffer3 == null) {
                                                                            throw r15;
                                                                        }
                                                                        byteBuffer3.put(bArr2);
                                                                        i13++;
                                                                    } catch (IllegalStateException e5) {
                                                                        e = e5;
                                                                        r62 = 0;
                                                                        z2 = e instanceof MediaCodec.CodecException;
                                                                        if (!z2) {
                                                                        }
                                                                        f0(e);
                                                                        if (z2) {
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        zzvr R22 = R(e, this.R);
                                                                        throw q(R22, this.D, z3, R22.a == 1101 ? 4006 : 4003);
                                                                    }
                                                                }
                                                            }
                                                            ByteBuffer byteBuffer4 = zziyVar4.d;
                                                            if (byteBuffer4 == null) {
                                                                throw r15;
                                                            }
                                                            int position = byteBuffer4.position();
                                                            zzma zzmaVar9 = zzmaVar3;
                                                            zzmaVar9.a = r15;
                                                            zzmaVar9.b = r15;
                                                            try {
                                                            } catch (zzix e6) {
                                                                e = e6;
                                                                zzmaVar4 = zzmaVar9;
                                                                i3 = 0;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        zzvpVar3.v(new jyo(this, zzmaVar9, false, 7));
                                                                        i4 = this.C.get();
                                                                    } catch (zzix e7) {
                                                                        e = e7;
                                                                        zzmaVar4 = zzmaVar9;
                                                                        i3 = 0;
                                                                        f0(e);
                                                                        w(i3);
                                                                        v();
                                                                        zziyVar3 = zziyVar4;
                                                                        zzmaVar3 = zzmaVar4;
                                                                        i10 = 4;
                                                                    }
                                                                    if (i4 != -3) {
                                                                        if (i4 == -5) {
                                                                            try {
                                                                                if (this.d0 == 2) {
                                                                                    zziyVar4.c();
                                                                                    this.d0 = 1;
                                                                                }
                                                                                g0(zzmaVar9);
                                                                                zzmaVar4 = zzmaVar9;
                                                                            } catch (IllegalStateException e8) {
                                                                                e = e8;
                                                                                r62 = 0;
                                                                                z2 = e instanceof MediaCodec.CodecException;
                                                                                if (!z2) {
                                                                                }
                                                                                f0(e);
                                                                                if (z2) {
                                                                                }
                                                                                if (z3) {
                                                                                }
                                                                                zzvr R222 = R(e, this.R);
                                                                                throw q(R222, this.D, z3, R222.a == 1101 ? 4006 : 4003);
                                                                            }
                                                                        } else if (zziyVar4.b(i10)) {
                                                                            v9p v0 = v0();
                                                                            v0();
                                                                            v0.f = this.j0;
                                                                            if (this.d0 == 2) {
                                                                                zziyVar4.c();
                                                                                this.d0 = 1;
                                                                            }
                                                                            this.l0 = true;
                                                                            if (!this.g0) {
                                                                                t0();
                                                                            } else if (!this.T) {
                                                                                this.h0 = true;
                                                                                zzvpVar3.B(this.W, 0, 4, 0L);
                                                                                this.W = i2;
                                                                                zziyVar4.d = r15;
                                                                            }
                                                                        } else {
                                                                            if (this.g0 || zziyVar4.a()) {
                                                                                long j9 = zziyVar4.e;
                                                                                if (!V(zziyVar4)) {
                                                                                    boolean e9 = zziyVar4.e();
                                                                                    if (e9) {
                                                                                        zziyVar4.c.a(position);
                                                                                    }
                                                                                    if (this.n0) {
                                                                                        v9p v02 = v0();
                                                                                        zzfi zzfiVar = v02.d;
                                                                                        zzv zzvVar7 = this.D;
                                                                                        if (zzvVar7 == null) {
                                                                                            throw r15;
                                                                                        }
                                                                                        zzfiVar.a(zzvVar7, j9);
                                                                                        v02.e = true;
                                                                                        this.n0 = false;
                                                                                    }
                                                                                    this.j0 = Math.max(this.j0, j9);
                                                                                    long j10 = this.r;
                                                                                    if (j10 != C.TIME_UNSET) {
                                                                                        zzmaVar4 = zzmaVar9;
                                                                                        if (j9 - v0().c < j10) {
                                                                                        }
                                                                                        if (!J()) {
                                                                                            if (zziyVar4.b(536870912)) {
                                                                                            }
                                                                                            zziyVar4.f();
                                                                                            if (zziyVar4.b(268435456)) {
                                                                                                n0(zziyVar4);
                                                                                            }
                                                                                            if (this.t0) {
                                                                                                long j11 = this.j0;
                                                                                                if (j9 <= j11) {
                                                                                                    this.u0 = (j11 - j9) + 1 + this.u0;
                                                                                                }
                                                                                                this.j0 = j9;
                                                                                                this.k0 = j9;
                                                                                                this.t0 = false;
                                                                                            }
                                                                                            T(zziyVar4);
                                                                                            int U = U(zziyVar4);
                                                                                            long j12 = j9 + this.u0;
                                                                                            int i14 = this.W;
                                                                                            if (e9) {
                                                                                                zzvpVar3.b(i14, zziyVar4.c, j12, U);
                                                                                            } else {
                                                                                                ByteBuffer byteBuffer5 = zziyVar4.d;
                                                                                                if (byteBuffer5 == null) {
                                                                                                    throw r15;
                                                                                                }
                                                                                                zzvpVar3.B(i14, byteBuffer5.limit(), U, j12);
                                                                                            }
                                                                                            this.W = i2;
                                                                                            zziyVar4.d = r15;
                                                                                            this.g0 = true;
                                                                                            this.d0 = 0;
                                                                                            this.o0.c++;
                                                                                        }
                                                                                        v9p v03 = v0();
                                                                                        v0();
                                                                                        v03.f = this.j0;
                                                                                        zziyVar4.f();
                                                                                        if (zziyVar4.b(268435456)) {
                                                                                        }
                                                                                        if (this.t0) {
                                                                                        }
                                                                                        T(zziyVar4);
                                                                                        int U2 = U(zziyVar4);
                                                                                        long j122 = j9 + this.u0;
                                                                                        int i142 = this.W;
                                                                                        if (e9) {
                                                                                        }
                                                                                        this.W = i2;
                                                                                        zziyVar4.d = r15;
                                                                                        this.g0 = true;
                                                                                        this.d0 = 0;
                                                                                        this.o0.c++;
                                                                                    } else {
                                                                                        zzmaVar4 = zzmaVar9;
                                                                                    }
                                                                                    this.k0 = Math.max(this.k0, j9);
                                                                                    if (!J()) {
                                                                                    }
                                                                                    v9p v032 = v0();
                                                                                    v0();
                                                                                    v032.f = this.j0;
                                                                                    zziyVar4.f();
                                                                                    if (zziyVar4.b(268435456)) {
                                                                                    }
                                                                                    if (this.t0) {
                                                                                    }
                                                                                    T(zziyVar4);
                                                                                    int U22 = U(zziyVar4);
                                                                                    long j1222 = j9 + this.u0;
                                                                                    int i1422 = this.W;
                                                                                    if (e9) {
                                                                                    }
                                                                                    this.W = i2;
                                                                                    zziyVar4.d = r15;
                                                                                    this.g0 = true;
                                                                                    this.d0 = 0;
                                                                                    this.o0.c++;
                                                                                }
                                                                            } else {
                                                                                zziyVar4.c();
                                                                                if (this.d0 == 2) {
                                                                                    this.d0 = 1;
                                                                                }
                                                                            }
                                                                            zzmaVar4 = zzmaVar9;
                                                                        }
                                                                        zziyVar3 = zziyVar4;
                                                                        zzmaVar3 = zzmaVar4;
                                                                        i10 = 4;
                                                                    } else if (J()) {
                                                                        v9p v04 = v0();
                                                                        v0();
                                                                        v04.f = this.j0;
                                                                    }
                                                                } catch (IllegalStateException e10) {
                                                                    e = e10;
                                                                    r62 = 0;
                                                                    z = true;
                                                                    z2 = e instanceof MediaCodec.CodecException;
                                                                    if (!z2) {
                                                                    }
                                                                    f0(e);
                                                                    if (z2) {
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    zzvr R2222 = R(e, this.R);
                                                                    throw q(R2222, this.D, z3, R2222.a == 1101 ? 4006 : 4003);
                                                                }
                                                            } catch (MediaCodec.CryptoException e11) {
                                                                e = e11;
                                                                r6 = 0;
                                                                throw q(e, this.D, r6, zzfm.g(e.getErrorCode()));
                                                            }
                                                        }
                                                    }
                                                    Trace.endSection();
                                                } catch (IllegalStateException e12) {
                                                    e = e12;
                                                    r62 = z9;
                                                }
                                            } else {
                                                zzje zzjeVar = this.o0;
                                                int i15 = zzjeVar.d;
                                                zzzg zzzgVar = this.i;
                                                zzzgVar.getClass();
                                                zzjeVar.d = i15 + zzzgVar.l(j - this.k);
                                                w(1);
                                            }
                                        } catch (IllegalStateException e13) {
                                            e = e13;
                                            r62 = zzmaVar7;
                                        }
                                    }
                                    this.o0.a();
                                } catch (IllegalStateException e14) {
                                    e = e14;
                                }
                            } catch (MediaCodec.CryptoException e15) {
                                e = e15;
                            }
                        } catch (IllegalStateException e16) {
                            e = e16;
                            z = true;
                        }
                    } catch (IllegalStateException e17) {
                        e = e17;
                    }
                } catch (MediaCodec.CryptoException e18) {
                    e = e18;
                }
            } catch (MediaCodec.CryptoException e19) {
                e = e19;
                r6 = 0;
            }
        } catch (IllegalStateException e20) {
            e = e20;
            z = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzng
    public final int zzu() {
        return 8;
    }

    public void i0() {
    }

    public void S(zzv zzvVar) {
    }

    public void T(zziy zziyVar) {
    }

    public void m0(long j) {
    }
}
