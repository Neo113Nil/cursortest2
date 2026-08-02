package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s6c implements sv {
    public int A;
    public boolean B;
    public final Context a;
    public final xr4 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public dke o;
    public b10 p;
    public b10 q;
    public b10 r;
    public b s;
    public b t;
    public b u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = dy0.u();
    public final kij f = new kij();
    public final iij g = new iij();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public s6c(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        xr4 xr4Var = new xr4();
        this.c = xr4Var;
        xr4Var.d = this;
    }

    public static s6c b(Context context) {
        MediaMetricsManager f = i3c.f(context.getSystemService("media_metrics"));
        if (f == null) {
            return null;
        }
        return new s6c(context, f.createPlaybackSession());
    }

    public final boolean a(b10 b10Var) {
        String str;
        if (b10Var == null) {
            return false;
        }
        String str2 = (String) b10Var.d;
        xr4 xr4Var = this.c;
        synchronized (xr4Var) {
            str = xr4Var.f;
        }
        return str2.equals(str);
    }

    public final void c() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new yq5(27, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final LogSessionId d() {
        return this.d.getSessionId();
    }

    public final /* synthetic */ void e(PlaybackMetrics playbackMetrics) {
        this.d.reportPlaybackMetrics(playbackMetrics);
    }

    public final /* synthetic */ void f(NetworkEvent networkEvent) {
        this.d.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void g(PlaybackErrorEvent playbackErrorEvent) {
        this.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void h(PlaybackStateEvent playbackStateEvent) {
        this.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void i(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void j(mij mijVar, scc sccVar) {
        int b;
        PlaybackMetrics.Builder builder = this.k;
        if (sccVar == null || (b = mijVar.b(sccVar.a)) == -1) {
            return;
        }
        iij iijVar = this.g;
        int i = 0;
        mijVar.f(b, iijVar, false);
        int i2 = iijVar.c;
        kij kijVar = this.f;
        mijVar.n(i2, kijVar);
        v5c v5cVar = kijVar.b.b;
        if (v5cVar != null) {
            int L = nik.L(v5cVar.a, v5cVar.b);
            i = L != 0 ? L != 1 ? L != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (kijVar.l != C.TIME_UNSET && !kijVar.j && !kijVar.h && !kijVar.a()) {
            builder.setMediaDurationMillis(nik.h0(kijVar.l));
        }
        builder.setPlaybackType(kijVar.a() ? 2 : 1);
        this.B = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0665 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0581  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(ale aleVar, f4a f4aVar) {
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
        b10 b10Var;
        boolean z2;
        s6c s6cVar;
        b bVar;
        DrmInitData drmInitData;
        int i12;
        if (((j78) f4aVar.b).a.size() == 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            boolean z3 = true;
            if (i13 >= ((j78) f4aVar.b).a.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray = ((j78) f4aVar.b).a;
            z1a.v(i13, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i13);
            qv qvVar = (qv) ((SparseArray) f4aVar.c).get(keyAt);
            qvVar.getClass();
            xr4 xr4Var = this.c;
            if (keyAt == 0) {
                synchronized (xr4Var) {
                    try {
                        xr4Var.d.getClass();
                        mij mijVar = xr4Var.e;
                        xr4Var.e = qvVar.b;
                        Iterator it = xr4Var.c.values().iterator();
                        while (it.hasNext()) {
                            vr4 vr4Var = (vr4) it.next();
                            if (vr4Var.b(mijVar, xr4Var.e) && !vr4Var.a(qvVar)) {
                            }
                            it.remove();
                            if (vr4Var.a.equals(xr4Var.f)) {
                                xr4Var.a(vr4Var);
                            }
                            if (vr4Var.e) {
                                xr4Var.d.m(qvVar, vr4Var.a);
                            }
                        }
                        xr4Var.d(qvVar);
                    } finally {
                    }
                }
            } else if (keyAt == 11) {
                int i14 = this.l;
                synchronized (xr4Var) {
                    try {
                        xr4Var.d.getClass();
                        if (i14 != 0) {
                            z3 = false;
                        }
                        Iterator it2 = xr4Var.c.values().iterator();
                        while (it2.hasNext()) {
                            vr4 vr4Var2 = (vr4) it2.next();
                            if (vr4Var2.a(qvVar)) {
                                it2.remove();
                                boolean equals = vr4Var2.a.equals(xr4Var.f);
                                if (equals) {
                                    xr4Var.a(vr4Var2);
                                }
                                if (vr4Var2.e) {
                                    if (z3 && equals) {
                                        boolean z4 = vr4Var2.f;
                                    }
                                    xr4Var.d.m(qvVar, vr4Var2.a);
                                }
                            }
                        }
                        xr4Var.d(qvVar);
                    } finally {
                    }
                }
            } else {
                xr4Var.e(qvVar);
            }
            i13++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f4aVar.e(0)) {
            qv qvVar2 = (qv) ((SparseArray) f4aVar.c).get(0);
            qvVar2.getClass();
            if (this.k != null) {
                j(qvVar2.b, qvVar2.d);
            }
        }
        if (f4aVar.e(2) && this.k != null) {
            av9 listIterator = aleVar.i().a.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                suj sujVar = (suj) listIterator.next();
                for (int i15 = 0; i15 < sujVar.a; i15++) {
                    if (sujVar.e[i15] && (drmInitData = sujVar.b.d[i15].s) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = this.k;
                String str = nik.a;
                int i16 = 0;
                while (true) {
                    if (i16 >= drmInitData.d) {
                        i12 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.a[i16].b;
                    if (uuid.equals(yc2.d)) {
                        i12 = 3;
                        break;
                    } else if (uuid.equals(yc2.e)) {
                        i12 = 2;
                        break;
                    } else {
                        if (uuid.equals(yc2.c)) {
                            i12 = 6;
                            break;
                        }
                        i16++;
                    }
                }
                builder.setDrmType(i12);
            }
        }
        if (f4aVar.e(1011)) {
            this.A++;
        }
        dke dkeVar = this.o;
        if (dkeVar == null) {
            i10 = 1;
            i2 = 8;
            i6 = 13;
            i3 = 7;
            i4 = 6;
            i5 = 9;
        } else {
            int i17 = dkeVar.a;
            Context context = this.a;
            boolean z5 = this.w == 4;
            if (i17 == 1001) {
                uifVar = new uif(20, 0, 5);
            } else {
                if (dkeVar instanceof tf6) {
                    tf6 tf6Var = (tf6) dkeVar;
                    z = tf6Var.c == 1;
                    i = tf6Var.g;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = dkeVar.getCause();
                cause.getClass();
                int i18 = 27;
                if (!(cause instanceof IOException)) {
                    i2 = 8;
                    i3 = 7;
                    i4 = 6;
                    i5 = 9;
                    if (z && (i == 0 || i == 1)) {
                        uifVar = new uif(35, 0, 5);
                    } else if (z && i == 3) {
                        uifVar = new uif(15, 0, 5);
                    } else if (z && i == 2) {
                        uifVar = new uif(23, 0, 5);
                    } else {
                        if (cause instanceof d3c) {
                            i6 = 13;
                            uifVar = new uif(13, nik.B(((d3c) cause).d), 5);
                        } else {
                            i6 = 13;
                            if (cause instanceof x2c) {
                                uifVar = new uif(14, ((x2c) cause).a, 5);
                            } else if (cause instanceof OutOfMemoryError) {
                                uifVar = new uif(14, 0, 5);
                            } else if (cause instanceof vo0) {
                                uifVar = new uif(17, 0, 5);
                            } else if (cause instanceof yo0) {
                                uifVar = new uif(18, ((yo0) cause).a, 5);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (nik.A(errorCode)) {
                                    case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                        i18 = 24;
                                        break;
                                    case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                        i18 = 28;
                                        break;
                                    case 6004:
                                        i18 = 25;
                                        break;
                                    case 6005:
                                        i18 = 26;
                                        break;
                                }
                                uifVar = new uif(i18, errorCode, 5);
                            } else {
                                uifVar = new uif(22, 0, 5);
                            }
                        }
                        this.b.execute(new yq5(26, this, pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(dkeVar).build()));
                        i10 = 1;
                        this.B = true;
                        this.o = null;
                    }
                    i6 = 13;
                    this.b.execute(new yq5(26, this, pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(dkeVar).build()));
                    i10 = 1;
                    this.B = true;
                    this.o = null;
                } else if (cause instanceof si9) {
                    uifVar = new uif(5, ((si9) cause).c, 5);
                } else {
                    if ((cause instanceof qi9) || (cause instanceof s9e)) {
                        i7 = 9;
                        i8 = 6;
                        i2 = 8;
                        i9 = 7;
                        uifVar = new uif(z5 ? 10 : 11, 0, 5);
                    } else {
                        boolean z6 = cause instanceof oi9;
                        if (z6 || (cause instanceof x8k)) {
                            i7 = 9;
                            if (nbd.b(context).f() == 1) {
                                uifVar = new uif(3, 0, 5);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    uifVar = new uif(6, 0, 5);
                                    i5 = 9;
                                    i4 = 6;
                                    i2 = 8;
                                    i6 = 13;
                                    i3 = 7;
                                    this.b.execute(new yq5(26, this, pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(dkeVar).build()));
                                    i10 = 1;
                                    this.B = true;
                                    this.o = null;
                                } else {
                                    i8 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i9 = 7;
                                        uifVar = new uif(7, 0, 5);
                                    } else {
                                        i9 = 7;
                                        if (z6 && ((oi9) cause).b == 1) {
                                            uifVar = new uif(4, 0, 5);
                                        } else {
                                            i2 = 8;
                                            uifVar = new uif(8, 0, 5);
                                        }
                                    }
                                    i5 = 9;
                                    i4 = 6;
                                    i3 = i9;
                                    i2 = 8;
                                    i6 = 13;
                                    this.b.execute(new yq5(26, this, pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(dkeVar).build()));
                                    i10 = 1;
                                    this.B = true;
                                    this.o = null;
                                }
                            }
                        } else if (i17 == 1002) {
                            uifVar = new uif(21, 0, 5);
                        } else if (cause instanceof wb5) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int B = nik.B(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (nik.A(B)) {
                                    case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                        i18 = 24;
                                        break;
                                    case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                        i18 = 28;
                                        break;
                                    case 6004:
                                        i18 = 25;
                                        break;
                                    case 6005:
                                        i18 = 26;
                                        break;
                                }
                                uifVar = new uif(i18, B, 5);
                            } else {
                                uifVar = cause3 instanceof MediaDrmResetException ? new uif(27, 0, 5) : cause3 instanceof NotProvisionedException ? new uif(24, 0, 5) : cause3 instanceof DeniedByServerException ? new uif(29, 0, 5) : cause3 instanceof cdk ? new uif(23, 0, 5) : cause3 instanceof qo4 ? new uif(28, 0, 5) : new uif(30, 0, 5);
                            }
                        } else if ((cause instanceof o08) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            uifVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new uif(32, 0, 5) : new uif(31, 0, 5);
                        } else {
                            i7 = 9;
                            uifVar = new uif(9, 0, 5);
                        }
                        i5 = i7;
                        i2 = 8;
                        i6 = 13;
                        i3 = 7;
                        i4 = 6;
                        this.b.execute(new yq5(26, this, pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(dkeVar).build()));
                        i10 = 1;
                        this.B = true;
                        this.o = null;
                    }
                    i5 = i7;
                    i4 = i8;
                    i3 = i9;
                    i6 = 13;
                    this.b.execute(new yq5(26, this, pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(dkeVar).build()));
                    i10 = 1;
                    this.B = true;
                    this.o = null;
                }
            }
            i2 = 8;
            i6 = 13;
            i3 = 7;
            i4 = 6;
            i5 = 9;
            this.b.execute(new yq5(26, this, pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(uifVar.b).setSubErrorCode(uifVar.c).setException(dkeVar).build()));
            i10 = 1;
            this.B = true;
            this.o = null;
        }
        if (f4aVar.e(2)) {
            uuj i19 = aleVar.i();
            boolean a = i19.a(2);
            boolean a2 = i19.a(i10);
            boolean a3 = i19.a(3);
            if (a || a2 || a3) {
                if (a) {
                    bVar = null;
                } else {
                    bVar = null;
                    if (!Objects.equals(this.s, null)) {
                        int i20 = this.s == null ? 1 : 0;
                        this.s = null;
                        i11 = 10;
                        n(1, elapsedRealtime, null, i20);
                        if (!a2 && !Objects.equals(this.t, bVar)) {
                            int i21 = this.t != null ? 1 : 0;
                            this.t = bVar;
                            n(0, elapsedRealtime, bVar, i21);
                        }
                        if (!a3 && !Objects.equals(this.u, bVar)) {
                            int i22 = this.u != null ? 1 : 0;
                            this.u = bVar;
                            n(2, elapsedRealtime, bVar, i22);
                        }
                        b10Var = bVar;
                        if (a(this.p)) {
                            b10 b10Var2 = this.p;
                            b bVar2 = (b) b10Var2.c;
                            if (bVar2.w != -1) {
                                int i23 = b10Var2.b;
                                if (!Objects.equals(this.s, bVar2)) {
                                    int i24 = (this.s == null && i23 == 0) ? 1 : i23;
                                    this.s = bVar2;
                                    n(1, elapsedRealtime, bVar2, i24);
                                }
                                this.p = b10Var;
                            }
                        }
                        if (a(this.q)) {
                            b10 b10Var3 = this.q;
                            b bVar3 = (b) b10Var3.c;
                            int i25 = b10Var3.b;
                            if (!Objects.equals(this.t, bVar3)) {
                                int i26 = (this.t == null && i25 == 0) ? 1 : i25;
                                this.t = bVar3;
                                n(0, elapsedRealtime, bVar3, i26);
                            }
                            this.q = b10Var;
                        }
                        if (a(this.r)) {
                            b10 b10Var4 = this.r;
                            b bVar4 = (b) b10Var4.c;
                            int i27 = b10Var4.b;
                            if (!Objects.equals(this.u, bVar4)) {
                                int i28 = (this.u == null && i27 == 0) ? 1 : i27;
                                this.u = bVar4;
                                n(2, elapsedRealtime, bVar4, i28);
                            }
                            this.r = b10Var;
                        }
                        switch (nbd.b(this.a).f()) {
                            case 0:
                                i2 = 0;
                                break;
                            case 1:
                                i2 = i5;
                                break;
                            case 2:
                                i2 = 2;
                                break;
                            case 3:
                                i2 = 4;
                                break;
                            case 4:
                                i2 = 5;
                                break;
                            case 5:
                                i2 = i4;
                                break;
                            case 6:
                            case 8:
                            default:
                                i2 = 1;
                                break;
                            case 7:
                                i2 = 3;
                                break;
                            case 9:
                                break;
                            case 10:
                                i2 = i3;
                                break;
                        }
                        if (i2 != this.n) {
                            this.n = i2;
                            this.b.execute(new yq5(25, this, pz.b().setNetworkType(i2).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (aleVar.getPlaybackState() != 2) {
                            this.v = false;
                        }
                        if (aleVar.h() == null) {
                            this.x = false;
                        } else if (f4aVar.e(i11)) {
                            this.x = true;
                        }
                        int playbackState = aleVar.getPlaybackState();
                        if (this.v) {
                            i11 = 5;
                        } else {
                            if (!this.x) {
                                if (playbackState == 4) {
                                    z2 = true;
                                    i11 = 11;
                                } else {
                                    int i29 = 2;
                                    if (playbackState == 2) {
                                        int i30 = this.m;
                                        if (i30 != 0 && i30 != 2 && i30 != 12) {
                                            if (!aleVar.getPlayWhenReady()) {
                                                i11 = i3;
                                            } else if (aleVar.m() == 0) {
                                                i11 = i4;
                                            }
                                        }
                                        i11 = i29;
                                    } else {
                                        i29 = 3;
                                        if (playbackState != 3) {
                                            z2 = true;
                                            i11 = (playbackState != 1 || this.m == 0) ? this.m : 12;
                                        } else if (aleVar.getPlayWhenReady()) {
                                            if (aleVar.m() != 0) {
                                                i11 = i5;
                                            }
                                            i11 = i29;
                                        } else {
                                            i11 = 4;
                                        }
                                    }
                                }
                                if (this.m != i11) {
                                    this.m = i11;
                                    this.B = z2;
                                    this.b.execute(new yq5(28, this, pz.e().setState(this.m).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                                }
                                if (f4aVar.e(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                                    return;
                                }
                                xr4 xr4Var2 = this.c;
                                qv qvVar3 = (qv) ((SparseArray) f4aVar.c).get(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
                                qvVar3.getClass();
                                synchronized (xr4Var2) {
                                    try {
                                        String str2 = xr4Var2.f;
                                        if (str2 != null) {
                                            vr4 vr4Var3 = (vr4) xr4Var2.c.get(str2);
                                            vr4Var3.getClass();
                                            xr4Var2.a(vr4Var3);
                                        }
                                        Iterator it3 = xr4Var2.c.values().iterator();
                                        while (it3.hasNext()) {
                                            vr4 vr4Var4 = (vr4) it3.next();
                                            it3.remove();
                                            if (vr4Var4.e && (s6cVar = xr4Var2.d) != null) {
                                                s6cVar.m(qvVar3, vr4Var4.a);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                return;
                            }
                            i11 = i6;
                        }
                        z2 = true;
                        if (this.m != i11) {
                        }
                        if (f4aVar.e(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                        }
                    }
                }
                i11 = 10;
                if (!a2) {
                    if (this.t != null) {
                    }
                    this.t = bVar;
                    n(0, elapsedRealtime, bVar, i21);
                }
                if (!a3) {
                    if (this.u != null) {
                    }
                    this.u = bVar;
                    n(2, elapsedRealtime, bVar, i22);
                }
                b10Var = bVar;
                if (a(this.p)) {
                }
                if (a(this.q)) {
                }
                if (a(this.r)) {
                }
                switch (nbd.b(this.a).f()) {
                }
                if (i2 != this.n) {
                }
                if (aleVar.getPlaybackState() != 2) {
                }
                if (aleVar.h() == null) {
                }
                int playbackState2 = aleVar.getPlaybackState();
                if (this.v) {
                }
                z2 = true;
                if (this.m != i11) {
                }
                if (f4aVar.e(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                }
            }
        }
        i11 = 10;
        b10Var = 0;
        if (a(this.p)) {
        }
        if (a(this.q)) {
        }
        if (a(this.r)) {
        }
        switch (nbd.b(this.a).f()) {
        }
        if (i2 != this.n) {
        }
        if (aleVar.getPlaybackState() != 2) {
        }
        if (aleVar.h() == null) {
        }
        int playbackState22 = aleVar.getPlaybackState();
        if (this.v) {
        }
        z2 = true;
        if (this.m != i11) {
        }
        if (f4aVar.e(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
        }
    }

    public final void l(qv qvVar, String str) {
        scc sccVar = qvVar.d;
        if (sccVar == null || !sccVar.b()) {
            c();
            this.j = str;
            this.k = pz.d().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            j(qvVar.b, sccVar);
        }
    }

    public final void m(qv qvVar, String str) {
        scc sccVar = qvVar.d;
        if ((sccVar == null || !sccVar.b()) && str.equals(this.j)) {
            c();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void n(int i, long j, b bVar, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (bVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = bVar.n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = bVar.o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = bVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = bVar.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = bVar.v;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = bVar.w;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = bVar.G;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = bVar.H;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = bVar.d;
            if (str4 != null) {
                String str5 = nik.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = bVar.z;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new yq5(24, this, timeSinceCreatedMillis.build()));
    }
}
