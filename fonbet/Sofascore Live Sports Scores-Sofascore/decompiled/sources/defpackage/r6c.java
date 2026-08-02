package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r6c implements rv {
    public boolean A;
    public final Context a;
    public final wr4 b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public sf6 n;
    public wj9 o;
    public wj9 p;
    public wj9 q;
    public sm8 r;
    public sm8 s;
    public sm8 t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final jij e = new jij();
    public final hij f = new hij();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public r6c(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        wr4 wr4Var = new wr4();
        this.b = wr4Var;
        wr4Var.d = this;
    }

    public final boolean a(wj9 wj9Var) {
        String str;
        if (wj9Var == null) {
            return false;
        }
        String str2 = (String) wj9Var.b;
        wr4 wr4Var = this.b;
        synchronized (wr4Var) {
            str = wr4Var.f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = (Long) this.g.get(this.i);
            this.j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            this.j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.j.build());
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public final void c(lij lijVar, rcc rccVar) {
        int b;
        PlaybackMetrics.Builder builder = this.j;
        if (rccVar == null || (b = lijVar.b(rccVar.a)) == -1) {
            return;
        }
        hij hijVar = this.f;
        int i = 0;
        lijVar.f(b, hijVar, false);
        int i2 = hijVar.c;
        jij jijVar = this.e;
        lijVar.n(i2, jijVar);
        x5c x5cVar = jijVar.b.b;
        if (x5cVar != null) {
            int u = lik.u(x5cVar.a);
            i = u != 0 ? u != 1 ? u != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (jijVar.l != C.TIME_UNSET && !jijVar.j && !jijVar.g && !jijVar.a()) {
            builder.setMediaDurationMillis(lik.F(jijVar.l));
        }
        builder.setPlaybackType(jijVar.a() ? 2 : 1);
        this.A = true;
    }

    public final void d(zke zkeVar, f4a f4aVar) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        uif uifVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r6c r6cVar;
        sm8 sm8Var;
        DrmInitData drmInitData;
        int i17;
        if (((i78) f4aVar.b).a.size() == 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            boolean z2 = true;
            if (i18 >= ((i78) f4aVar.b).a.size()) {
                break;
            }
            int a = ((i78) f4aVar.b).a(i18);
            pv pvVar = (pv) ((SparseArray) f4aVar.c).get(a);
            pvVar.getClass();
            wr4 wr4Var = this.b;
            if (a == 0) {
                synchronized (wr4Var) {
                    try {
                        wr4Var.d.getClass();
                        lij lijVar = wr4Var.e;
                        wr4Var.e = pvVar.b;
                        Iterator it = wr4Var.c.values().iterator();
                        while (it.hasNext()) {
                            ur4 ur4Var = (ur4) it.next();
                            if (ur4Var.b(lijVar, wr4Var.e) && !ur4Var.a(pvVar)) {
                            }
                            it.remove();
                            if (ur4Var.e) {
                                if (ur4Var.a.equals(wr4Var.f)) {
                                    wr4Var.f = null;
                                }
                                wr4Var.d.f(pvVar, ur4Var.a);
                            }
                        }
                        wr4Var.c(pvVar);
                    } finally {
                    }
                }
            } else if (a == 11) {
                int i19 = this.k;
                synchronized (wr4Var) {
                    try {
                        wr4Var.d.getClass();
                        if (i19 != 0) {
                            z2 = false;
                        }
                        Iterator it2 = wr4Var.c.values().iterator();
                        while (it2.hasNext()) {
                            ur4 ur4Var2 = (ur4) it2.next();
                            if (ur4Var2.a(pvVar)) {
                                it2.remove();
                                if (ur4Var2.e) {
                                    boolean equals = ur4Var2.a.equals(wr4Var.f);
                                    if (z2 && equals) {
                                        boolean z3 = ur4Var2.f;
                                    }
                                    if (equals) {
                                        wr4Var.f = null;
                                    }
                                    wr4Var.d.f(pvVar, ur4Var2.a);
                                }
                            }
                        }
                        wr4Var.c(pvVar);
                    } finally {
                    }
                }
            } else {
                wr4Var.d(pvVar);
            }
            i18++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f4aVar.e(0)) {
            pv pvVar2 = (pv) ((SparseArray) f4aVar.c).get(0);
            pvVar2.getClass();
            if (this.j != null) {
                c(pvVar2.b, pvVar2.d);
            }
        }
        if (f4aVar.e(2) && this.j != null) {
            av9 listIterator = ((ug6) zkeVar).k().a.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                ruj rujVar = (ruj) listIterator.next();
                for (int i20 = 0; i20 < rujVar.a; i20++) {
                    if (rujVar.e[i20] && (drmInitData = rujVar.b.d[i20].o) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = this.j;
                int i21 = lik.a;
                int i22 = 0;
                while (true) {
                    if (i22 >= drmInitData.d) {
                        i17 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.a[i22].b;
                    if (uuid.equals(nc2.c)) {
                        i17 = 3;
                        break;
                    } else if (uuid.equals(nc2.d)) {
                        i17 = 2;
                        break;
                    } else {
                        if (uuid.equals(nc2.b)) {
                            i17 = 6;
                            break;
                        }
                        i22++;
                    }
                }
                builder.setDrmType(i17);
            }
        }
        if (f4aVar.e(1011)) {
            this.z++;
        }
        sf6 sf6Var = this.n;
        if (sf6Var == null) {
            i13 = 2;
            i6 = 13;
            i2 = 8;
            i3 = 7;
            i4 = 6;
            i5 = 9;
            i12 = 1;
        } else {
            int i23 = sf6Var.a;
            Context context = this.a;
            boolean z4 = this.v == 4;
            if (i23 == 1001) {
                uifVar = new uif(20, 0, 4);
            } else {
                if (sf6Var instanceof sf6) {
                    z = sf6Var.c == 1;
                    i = sf6Var.g;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = sf6Var.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i24 = 28;
                    i2 = 8;
                    i3 = 7;
                    i4 = 6;
                    i5 = 9;
                    if (z && (i == 0 || i == 1)) {
                        uifVar = new uif(35, 0, 4);
                    } else if (z && i == 3) {
                        uifVar = new uif(15, 0, 4);
                    } else if (z && i == 2) {
                        uifVar = new uif(23, 0, 4);
                    } else {
                        if (cause instanceof c3c) {
                            i6 = 13;
                            uifVar = new uif(13, lik.m(((c3c) cause).d), 4);
                        } else {
                            i6 = 13;
                            if (cause instanceof w2c) {
                                uifVar = new uif(14, lik.m(((w2c) cause).a), 4);
                            } else if (cause instanceof OutOfMemoryError) {
                                uifVar = new uif(14, 0, 4);
                            } else if (cause instanceof uo0) {
                                uifVar = new uif(17, ((uo0) cause).a, 4);
                            } else if (cause instanceof xo0) {
                                uifVar = new uif(18, ((xo0) cause).a, 4);
                            } else if (lik.a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                uifVar = new uif(22, 0, 4);
                            } else {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (lik.l(errorCode)) {
                                    case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                        i24 = 24;
                                        break;
                                    case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                        break;
                                    case 6004:
                                        i24 = 25;
                                        break;
                                    case 6005:
                                        i24 = 26;
                                        break;
                                    default:
                                        i24 = 27;
                                        break;
                                }
                                uifVar = new uif(i24, errorCode, 4);
                            }
                        }
                        this.c.reportPlaybackErrorEvent(pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(sf6Var).build());
                        i12 = 1;
                        this.A = true;
                        this.n = null;
                        i13 = 2;
                    }
                    i6 = 13;
                    this.c.reportPlaybackErrorEvent(pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(sf6Var).build());
                    i12 = 1;
                    this.A = true;
                    this.n = null;
                    i13 = 2;
                } else if (cause instanceof ri9) {
                    uifVar = new uif(5, ((ri9) cause).c, 4);
                } else {
                    if ((cause instanceof pi9) || (cause instanceof r9e)) {
                        i7 = 9;
                        i8 = 8;
                        i9 = 6;
                        i10 = 7;
                        uifVar = new uif(z4 ? 10 : 11, 0, 4);
                    } else {
                        boolean z5 = cause instanceof ni9;
                        if (z5 || (cause instanceof w8k)) {
                            i7 = 9;
                            if (mbd.b(context).c() == 1) {
                                uifVar = new uif(3, 0, 4);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    uifVar = new uif(6, 0, 4);
                                    i5 = 9;
                                    i4 = 6;
                                    i6 = 13;
                                    i2 = 8;
                                    i3 = 7;
                                } else {
                                    i9 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i10 = 7;
                                        uifVar = new uif(7, 0, 4);
                                    } else {
                                        i10 = 7;
                                        if (z5 && ((ni9) cause).b == 1) {
                                            uifVar = new uif(4, 0, 4);
                                        } else {
                                            i8 = 8;
                                            uifVar = new uif(8, 0, 4);
                                        }
                                    }
                                    i5 = 9;
                                    i4 = 6;
                                    i3 = i10;
                                    i6 = 13;
                                    i2 = 8;
                                }
                                this.c.reportPlaybackErrorEvent(pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(sf6Var).build());
                                i12 = 1;
                                this.A = true;
                                this.n = null;
                                i13 = 2;
                            }
                        } else if (i23 == 1002) {
                            uifVar = new uif(21, 0, 4);
                        } else if (cause instanceof vb5) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i25 = lik.a;
                            if (i25 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                uifVar = (i25 < 23 || !(cause3 instanceof MediaDrmResetException)) ? (i25 < 18 || !(cause3 instanceof NotProvisionedException)) ? (i25 < 18 || !(cause3 instanceof DeniedByServerException)) ? cause3 instanceof bdk ? new uif(23, 0, 4) : cause3 instanceof po4 ? new uif(28, 0, 4) : new uif(30, 0, 4) : new uif(29, 0, 4) : new uif(24, 0, 4) : new uif(27, 0, 4);
                            } else {
                                int m = lik.m(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (lik.l(m)) {
                                    case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                        i11 = 24;
                                        break;
                                    case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                        i11 = 28;
                                        break;
                                    case 6004:
                                        i11 = 25;
                                        break;
                                    case 6005:
                                        i11 = 26;
                                        break;
                                    default:
                                        i11 = 27;
                                        break;
                                }
                                uifVar = new uif(i11, m, 4);
                            }
                        } else if ((cause instanceof n08) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            uifVar = (lik.a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new uif(32, 0, 4) : new uif(31, 0, 4);
                        } else {
                            i7 = 9;
                            uifVar = new uif(9, 0, 4);
                        }
                        i5 = i7;
                        i6 = 13;
                        i2 = 8;
                        i3 = 7;
                        i4 = 6;
                        this.c.reportPlaybackErrorEvent(pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(sf6Var).build());
                        i12 = 1;
                        this.A = true;
                        this.n = null;
                        i13 = 2;
                    }
                    i5 = i7;
                    i2 = i8;
                    i4 = i9;
                    i3 = i10;
                    i6 = 13;
                    this.c.reportPlaybackErrorEvent(pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(sf6Var).build());
                    i12 = 1;
                    this.A = true;
                    this.n = null;
                    i13 = 2;
                }
            }
            i6 = 13;
            i2 = 8;
            i3 = 7;
            i4 = 6;
            i5 = 9;
            this.c.reportPlaybackErrorEvent(pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(sf6Var).build());
            i12 = 1;
            this.A = true;
            this.n = null;
            i13 = 2;
        }
        if (f4aVar.e(i13)) {
            tuj k = ((ug6) zkeVar).k();
            boolean a2 = k.a(i13);
            boolean a3 = k.a(i12);
            boolean a4 = k.a(3);
            if (a2 || a3 || a4) {
                if (a2) {
                    sm8Var = null;
                } else {
                    sm8Var = null;
                    if (!lik.a(this.r, null)) {
                        this.r = null;
                        g(1, elapsedRealtime, null);
                    }
                }
                if (!a3 && !lik.a(this.s, sm8Var)) {
                    this.s = sm8Var;
                    g(0, elapsedRealtime, sm8Var);
                }
                if (!a4 && !lik.a(this.t, sm8Var)) {
                    this.t = sm8Var;
                    g(2, elapsedRealtime, sm8Var);
                }
            }
        }
        if (a(this.o)) {
            sm8 sm8Var2 = (sm8) this.o.c;
            if (sm8Var2.r != -1) {
                if (!lik.a(this.r, sm8Var2)) {
                    this.r = sm8Var2;
                    g(1, elapsedRealtime, sm8Var2);
                }
                this.o = null;
            }
        }
        if (a(this.p)) {
            sm8 sm8Var3 = (sm8) this.p.c;
            if (!lik.a(this.s, sm8Var3)) {
                this.s = sm8Var3;
                g(0, elapsedRealtime, sm8Var3);
            }
            this.p = null;
        }
        if (a(this.q)) {
            sm8 sm8Var4 = (sm8) this.q.c;
            if (!lik.a(this.t, sm8Var4)) {
                this.t = sm8Var4;
                g(2, elapsedRealtime, sm8Var4);
            }
            this.q = null;
        }
        switch (mbd.b(this.a).c()) {
            case 0:
                i14 = 0;
                break;
            case 1:
                i14 = i5;
                break;
            case 2:
                i14 = 2;
                break;
            case 3:
                i14 = 4;
                break;
            case 4:
                i14 = 5;
                break;
            case 5:
                i14 = i4;
                break;
            case 6:
            case 8:
            default:
                i14 = 1;
                break;
            case 7:
                i14 = 3;
                break;
            case 9:
                i14 = i2;
                break;
            case 10:
                i14 = i3;
                break;
        }
        if (i14 != this.m) {
            this.m = i14;
            this.c.reportNetworkEvent(pz.b().setNetworkType(i14).setTimeSinceCreatedMillis(elapsedRealtime - this.d).build());
        }
        ug6 ug6Var = (ug6) zkeVar;
        if (ug6Var.o() != 2) {
            this.u = false;
        }
        ug6Var.T();
        if (ug6Var.i0.f == null) {
            this.w = false;
            i15 = 10;
        } else {
            i15 = 10;
            if (f4aVar.e(10)) {
                this.w = true;
            }
        }
        int o = ug6Var.o();
        if (this.u) {
            i16 = 5;
        } else if (this.w) {
            i16 = i6;
        } else if (o == 4) {
            i16 = 11;
        } else {
            int i26 = 2;
            if (o == 2) {
                int i27 = this.l;
                if (i27 != 0 && i27 != 2) {
                    if (ug6Var.n()) {
                        ug6Var.T();
                        i16 = ug6Var.i0.m != 0 ? i15 : i4;
                    } else {
                        i16 = i3;
                    }
                }
                i16 = i26;
            } else {
                i26 = 3;
                if (o != 3) {
                    i16 = (o != 1 || this.l == 0) ? this.l : 12;
                } else if (ug6Var.n()) {
                    ug6Var.T();
                    if (ug6Var.i0.m != 0) {
                        i16 = i5;
                    }
                    i16 = i26;
                } else {
                    i16 = 4;
                }
            }
        }
        if (this.l != i16) {
            this.l = i16;
            this.A = true;
            this.c.reportPlaybackStateEvent(pz.e().setState(this.l).setTimeSinceCreatedMillis(elapsedRealtime - this.d).build());
        }
        if (f4aVar.e(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            wr4 wr4Var2 = this.b;
            pv pvVar3 = (pv) ((SparseArray) f4aVar.c).get(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
            pvVar3.getClass();
            synchronized (wr4Var2) {
                wr4Var2.f = null;
                Iterator it3 = wr4Var2.c.values().iterator();
                while (it3.hasNext()) {
                    ur4 ur4Var3 = (ur4) it3.next();
                    it3.remove();
                    if (ur4Var3.e && (r6cVar = wr4Var2.d) != null) {
                        r6cVar.f(pvVar3, ur4Var3.a);
                    }
                }
            }
        }
    }

    public final void e(pv pvVar, String str) {
        rcc rccVar = pvVar.d;
        if (rccVar == null || !rccVar.a()) {
            b();
            this.i = str;
            this.j = pz.d().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.2");
            c(pvVar.b, rccVar);
        }
    }

    public final void f(pv pvVar, String str) {
        rcc rccVar = pvVar.d;
        if ((rccVar == null || !rccVar.a()) && str.equals(this.i)) {
            b();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final void g(int i, long j, sm8 sm8Var) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.d);
        if (sm8Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(2);
            String str = sm8Var.k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = sm8Var.l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = sm8Var.i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i2 = sm8Var.h;
            if (i2 != -1) {
                timeSinceCreatedMillis.setBitrate(i2);
            }
            int i3 = sm8Var.q;
            if (i3 != -1) {
                timeSinceCreatedMillis.setWidth(i3);
            }
            int i4 = sm8Var.r;
            if (i4 != -1) {
                timeSinceCreatedMillis.setHeight(i4);
            }
            int i5 = sm8Var.y;
            if (i5 != -1) {
                timeSinceCreatedMillis.setChannelCount(i5);
            }
            int i6 = sm8Var.z;
            if (i6 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i6);
            }
            String str4 = sm8Var.c;
            if (str4 != null) {
                int i7 = lik.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = sm8Var.s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
