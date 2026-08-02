package com.google.android.gms.internal.ads;

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
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.cwo;
import defpackage.g2p;
import defpackage.gvo;
import defpackage.i3c;
import defpackage.jyo;
import defpackage.pz;
import defpackage.vvo;
import defpackage.yuo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqf implements zznt, zzqg {
    public final Context a;
    public final zzpy c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public zzau n;
    public gvo o;
    public gvo p;
    public gvo q;
    public zzv r;
    public zzv s;
    public zzv t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public final Executor b = zzdi.a();
    public final zzbe f = new zzbe();
    public final zzbd g = new zzbd();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public zzqf(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        zzpy zzpyVar = new zzpy(0);
        this.c = zzpyVar;
        zzpyVar.d = this;
    }

    public static zzqf p(Context context) {
        MediaMetricsManager f = i3c.f(context.getSystemService("media_metrics"));
        if (f == null) {
            return null;
        }
        return new zzqf(context, f.createPlaybackSession());
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void a(zzbv zzbvVar) {
        gvo gvoVar = this.o;
        if (gvoVar != null) {
            zzv zzvVar = (zzv) gvoVar.b;
            if (zzvVar.w == -1) {
                zzt zztVar = new zzt(zzvVar);
                zztVar.u = zzbvVar.a;
                zztVar.v = zzbvVar.b;
                this.o = new gvo(10, new zzv(zztVar), (String) gvoVar.c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void c(int i) {
        if (i == 1) {
            this.u = true;
        }
    }

    public final void e(int i, long j, zzv zzvVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzvVar.n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzvVar.j;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzvVar.v;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzvVar.w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzvVar.H;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzvVar.J;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzvVar.d;
            if (str4 != null) {
                String str5 = zzfm.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzvVar.z;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.z = true;
        this.b.execute(new vvo(5, this, timeSinceCreatedMillis.build()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r4.equals("isml") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r4.equals("ism") != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(zzbf zzbfVar, zzxo zzxoVar) {
        int e;
        int i;
        PlaybackMetrics.Builder builder = this.k;
        if (zzxoVar == null || (e = zzbfVar.e(zzxoVar.a)) == -1) {
            return;
        }
        zzbd zzbdVar = this.g;
        int i2 = 0;
        zzbfVar.d(e, zzbdVar, false);
        int i3 = zzbdVar.c;
        zzbe zzbeVar = this.f;
        zzbfVar.b(i3, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.b.b;
        if (zzagVar != null) {
            Uri uri = zzagVar.a;
            String str = zzfm.a;
            String scheme = uri.getScheme();
            if (scheme == null || !(zzgts.d(scheme, "rtsp") || zzgts.d(scheme, "rtspt"))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String a = zzgts.a(lastPathSegment.substring(lastIndexOf + 1));
                        switch (a.hashCode()) {
                            case 104579:
                                break;
                            case 108321:
                                if (a.equals("mpd")) {
                                    i = 0;
                                    break;
                                }
                                i = 4;
                                break;
                            case 3242057:
                                break;
                            case 3299913:
                                if (a.equals("m3u8")) {
                                    i = 2;
                                    break;
                                }
                                i = 4;
                                break;
                            default:
                                i = 4;
                                break;
                        }
                        if (i != 4) {
                            i2 = i;
                        }
                    }
                    Pattern pattern = zzfm.c;
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = pattern.matcher(path);
                    if (matcher.matches()) {
                        String group = matcher.group(2);
                        if (group != null) {
                            if (!group.contains("format=mpd-time-csf")) {
                                if (group.contains("format=m3u8-aapl")) {
                                    i2 = 2;
                                }
                            }
                        }
                        i2 = 1;
                    }
                }
                i2 = 4;
            } else {
                i2 = 3;
            }
            i2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i2);
        long j = zzbeVar.j;
        if (j != C.TIME_UNSET && !zzbeVar.i && !zzbeVar.g && !zzbeVar.b()) {
            builder.setMediaDurationMillis(zzfm.t(j));
        }
        builder.setPlaybackType(true != zzbeVar.b() ? 1 : 2);
        this.z = true;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void g(zznr zznrVar, int i, long j) {
        zzxo zzxoVar = zznrVar.d;
        if (zzxoVar != null) {
            String a = this.c.a(zznrVar.b, zzxoVar);
            HashMap hashMap = this.i;
            Long l = (Long) hashMap.get(a);
            HashMap hashMap2 = this.h;
            Long l2 = (Long) hashMap2.get(a);
            hashMap.put(a, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(a, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void h(zzje zzjeVar) {
        this.w += zzjeVar.g;
        this.x += zzjeVar.e;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void k(zzau zzauVar) {
        this.n = zzauVar;
    }

    public final void m() {
        PlaybackMetrics.Builder builder = this.k;
        boolean z = false;
        if (builder != null && this.z) {
            builder.setAudioUnderrunCount(this.y);
            this.k.setVideoFramesDropped(this.w);
            this.k.setVideoFramesPlayed(this.x);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new jyo(this, this.k.build(), z, 4));
        }
        this.k = null;
        this.j = null;
        this.y = 0;
        this.w = 0;
        this.x = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.z = false;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void n(zznr zznrVar, zzxk zzxkVar) {
        zzxo zzxoVar = zznrVar.d;
        if (zzxoVar == null) {
            return;
        }
        zzv zzvVar = zzxkVar.b;
        zzvVar.getClass();
        gvo gvoVar = new gvo(10, zzvVar, this.c.a(zznrVar.b, zzxoVar));
        int i = zzxkVar.a;
        if (i != 0) {
            if (i == 1) {
                this.p = gvoVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.q = gvoVar;
                return;
            }
        }
        this.o = gvoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x02af, code lost:
    
        if (r15 != 1) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020f A[PHI: r4
      0x020f: PHI (r4v37 int) = (r4v28 int), (r4v61 int) binds: [B:236:0x0301, B:162:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0213 A[PHI: r4
      0x0213: PHI (r4v36 int) = (r4v28 int), (r4v61 int) binds: [B:236:0x0301, B:162:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0217 A[PHI: r4
      0x0217: PHI (r4v35 int) = (r4v28 int), (r4v61 int) binds: [B:236:0x0301, B:162:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021b A[PHI: r4
      0x021b: PHI (r4v34 int) = (r4v28 int), (r4v61 int) binds: [B:236:0x0301, B:162:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021f A[PHI: r4
      0x021f: PHI (r4v33 int) = (r4v28 int), (r4v61 int) binds: [B:236:0x0301, B:162:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x055c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0464  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [gvo, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // com.google.android.gms.internal.ads.zznt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(zzno zznoVar, zzns zznsVar) {
        ?? r8;
        int i;
        boolean z;
        cwo cwoVar;
        int i2;
        zzqf zzqfVar;
        boolean z2;
        zzv zzvVar;
        int i3;
        int errorCode;
        zzq zzqVar;
        int i4;
        int i5;
        if (zznsVar.a.a.size() == 0) {
            return;
        }
        for (int i6 = 0; i6 < zznsVar.a.a.size(); i6++) {
            SparseBooleanArray sparseBooleanArray = zznsVar.a.a;
            zzguk.i(i6, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i6);
            zznr zznrVar = (zznr) zznsVar.b.get(keyAt);
            zznrVar.getClass();
            zzpy zzpyVar = this.c;
            if (keyAt == 0) {
                synchronized (zzpyVar) {
                    try {
                        if (zzpyVar.d == null) {
                            throw null;
                        }
                        zzbf zzbfVar = zzpyVar.e;
                        zzpyVar.e = zznrVar.b;
                        Iterator it = zzpyVar.c.values().iterator();
                        while (it.hasNext()) {
                            g2p g2pVar = (g2p) it.next();
                            if (g2pVar.a(zzbfVar, zzpyVar.e) && !g2pVar.b(zznrVar)) {
                            }
                            it.remove();
                            if (g2pVar.a.equals(zzpyVar.f)) {
                                zzpyVar.d(g2pVar);
                            }
                            if (g2pVar.e) {
                                zzpyVar.d.s(zznrVar, g2pVar.a);
                            }
                        }
                        zzpyVar.c(zznrVar);
                    } finally {
                    }
                }
            } else if (keyAt == 11) {
                synchronized (zzpyVar) {
                    try {
                        if (zzpyVar.d == null) {
                            throw null;
                        }
                        Iterator it2 = zzpyVar.c.values().iterator();
                        while (it2.hasNext()) {
                            g2p g2pVar2 = (g2p) it2.next();
                            if (g2pVar2.b(zznrVar)) {
                                it2.remove();
                                if (g2pVar2.a.equals(zzpyVar.f)) {
                                    zzpyVar.d(g2pVar2);
                                }
                                if (g2pVar2.e) {
                                    zzpyVar.d.s(zznrVar, g2pVar2.a);
                                }
                            }
                        }
                        zzpyVar.c(zznrVar);
                    } finally {
                    }
                }
            } else {
                zzpyVar.b(zznrVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zznsVar.a(0)) {
            zznr zznrVar2 = (zznr) zznsVar.b.get(0);
            zznrVar2.getClass();
            if (this.k != null) {
                f(zznrVar2.b, zznrVar2.d);
            }
        }
        int i7 = 3;
        if (zznsVar.a(2) && this.k != null) {
            zzgxm zzgxmVar = zznoVar.b().a;
            int size = zzgxmVar.size();
            int i8 = 0;
            loop3: while (true) {
                if (i8 >= size) {
                    zzqVar = null;
                    break;
                }
                zzbm zzbmVar = (zzbm) zzgxmVar.get(i8);
                int i9 = 0;
                while (true) {
                    i5 = i8 + 1;
                    if (i9 < zzbmVar.a) {
                        if (zzbmVar.e[i9] && (zzqVar = zzbmVar.b.d[i9].s) != null) {
                            break loop3;
                        } else {
                            i9++;
                        }
                    }
                }
                i8 = i5;
            }
            if (zzqVar != null) {
                PlaybackMetrics.Builder builder = this.k;
                String str = zzfm.a;
                int i10 = 0;
                while (true) {
                    if (i10 >= zzqVar.d) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = zzqVar.a[i10].b;
                    if (uuid.equals(zzg.d)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(zzg.e)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzg.c)) {
                            i4 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builder.setDrmType(i4);
            }
        }
        if (zznsVar.a(1011)) {
            this.y++;
        }
        zzau zzauVar = this.n;
        int i11 = 8;
        if (zzauVar != null) {
            Context context = this.a;
            int i12 = zzauVar.a;
            if (i12 == 1001) {
                i3 = 20;
                errorCode = 0;
            } else {
                zzjn zzjnVar = (zzjn) zzauVar;
                boolean z3 = zzjnVar.c == 1;
                int i13 = zzjnVar.g;
                Throwable cause = zzauVar.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    if (z3) {
                        i3 = 35;
                        if (i13 != 0) {
                        }
                        errorCode = 0;
                    }
                    if (z3 && i13 == 3) {
                        i3 = 15;
                    } else {
                        if (!z3 || i13 != 2) {
                            if (cause instanceof zzvv) {
                                errorCode = zzfm.k(((zzvv) cause).c);
                                i3 = 13;
                            } else {
                                i3 = 14;
                                if (cause instanceof zzvr) {
                                    errorCode = ((zzvr) cause).a;
                                } else if (!(cause instanceof OutOfMemoryError)) {
                                    if (cause instanceof zzse) {
                                        i3 = 17;
                                    } else if (cause instanceof zzsh) {
                                        errorCode = ((zzsh) cause).a;
                                        i3 = 18;
                                    } else if (cause instanceof MediaCodec.CryptoException) {
                                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        switch (zzfm.g(errorCode)) {
                                        }
                                    } else {
                                        i3 = 22;
                                    }
                                }
                            }
                        }
                        i3 = 23;
                    }
                    errorCode = 0;
                } else if (cause instanceof zzij) {
                    errorCode = ((zzij) cause).c;
                    i3 = 5;
                } else if ((cause instanceof zzii) || (cause instanceof zzat)) {
                    errorCode = 0;
                    i3 = 11;
                } else {
                    boolean z4 = cause instanceof zzih;
                    if (z4 || (cause instanceof zzir)) {
                        if (zzes.a(context).b() == 1) {
                            i3 = 3;
                        } else {
                            Throwable cause2 = cause.getCause();
                            if (cause2 instanceof UnknownHostException) {
                                errorCode = 0;
                                i3 = 6;
                            } else if (cause2 instanceof SocketTimeoutException) {
                                errorCode = 0;
                                i3 = 7;
                            } else if (z4 && ((zzih) cause).b == 1) {
                                errorCode = 0;
                                i3 = 4;
                            } else {
                                i3 = 8;
                            }
                        }
                    } else if (i12 == 1002) {
                        i3 = 21;
                    } else if (cause instanceof zzuk) {
                        Throwable cause3 = cause.getCause();
                        cause3.getClass();
                        if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                            errorCode = zzfm.k(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            switch (zzfm.g(errorCode)) {
                                case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                    i3 = 24;
                                    break;
                                case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                    i3 = 28;
                                    break;
                                case 6004:
                                    i3 = 25;
                                    break;
                                case 6005:
                                    i3 = 26;
                                    break;
                                default:
                                    i3 = 27;
                                    break;
                            }
                        } else if (cause3 instanceof MediaDrmResetException) {
                            i3 = 27;
                        } else if (cause3 instanceof NotProvisionedException) {
                            i3 = 24;
                        } else if (cause3 instanceof DeniedByServerException) {
                            i3 = 29;
                        } else {
                            if (!(cause3 instanceof zzuu)) {
                                i3 = cause3 instanceof zzuj ? 28 : 30;
                            }
                            i3 = 23;
                        }
                    } else if ((cause instanceof zzie) && (cause.getCause() instanceof FileNotFoundException)) {
                        Throwable cause4 = cause.getCause();
                        cause4.getClass();
                        Throwable cause5 = cause4.getCause();
                        i3 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                    } else {
                        i3 = 9;
                    }
                    errorCode = 0;
                }
            }
            this.b.execute(new yuo(i11, this, pz.c().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(i3).setSubErrorCode(errorCode).setException(zzauVar).build()));
            this.z = true;
            this.n = null;
        }
        if (zznsVar.a(2)) {
            zzbn b = zznoVar.b();
            boolean a = b.a(2);
            boolean a2 = b.a(1);
            boolean a3 = b.a(3);
            if (a || a2) {
                z2 = a3;
            } else if (a3) {
                z2 = true;
            }
            if (a) {
                zzvVar = null;
            } else {
                zzvVar = null;
                if (!Objects.equals(this.r, null)) {
                    int i14 = this.r == null ? 1 : 0;
                    this.r = null;
                    i = 4;
                    e(1, elapsedRealtime, null, i14);
                    if (!a2 && !Objects.equals(this.s, zzvVar)) {
                        int i15 = this.s != null ? 1 : 0;
                        this.s = zzvVar;
                        e(0, elapsedRealtime, zzvVar, i15);
                    }
                    if (!z2 && !Objects.equals(this.t, zzvVar)) {
                        int i16 = this.t != null ? 1 : 0;
                        this.t = zzvVar;
                        e(2, elapsedRealtime, zzvVar, i16);
                    }
                    r8 = zzvVar;
                    if (y(this.o)) {
                        zzv zzvVar2 = (zzv) this.o.b;
                        if (zzvVar2.w != -1) {
                            if (!Objects.equals(this.r, zzvVar2)) {
                                int i17 = this.r == null ? 1 : 0;
                                this.r = zzvVar2;
                                e(1, elapsedRealtime, zzvVar2, i17);
                            }
                            this.o = r8;
                        }
                    }
                    if (y(this.p)) {
                        zzv zzvVar3 = (zzv) this.p.b;
                        if (!Objects.equals(this.s, zzvVar3)) {
                            int i18 = this.s == null ? 1 : 0;
                            this.s = zzvVar3;
                            e(0, elapsedRealtime, zzvVar3, i18);
                        }
                        this.p = r8;
                    }
                    if (y(this.q)) {
                        zzv zzvVar4 = (zzv) this.q.b;
                        if (!Objects.equals(this.t, zzvVar4)) {
                            int i19 = this.t == null ? 1 : 0;
                            this.t = zzvVar4;
                            e(2, elapsedRealtime, zzvVar4, i19);
                        }
                        this.q = r8;
                    }
                    switch (zzes.a(this.a).b()) {
                        case 0:
                            i11 = 0;
                            break;
                        case 1:
                            i11 = 9;
                            break;
                        case 2:
                            i11 = 2;
                            break;
                        case 3:
                            i11 = i;
                            break;
                        case 4:
                            i11 = 5;
                            break;
                        case 5:
                            i11 = 6;
                            break;
                        case 6:
                        case 8:
                        default:
                            i11 = 1;
                            break;
                        case 7:
                            i11 = 3;
                            break;
                        case 9:
                            break;
                        case 10:
                            i11 = 7;
                            break;
                    }
                    if (i11 != this.m) {
                        this.m = i11;
                        z = false;
                        this.b.execute(new jyo(this, pz.b().setNetworkType(i11).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build(), z, i7));
                    } else {
                        z = false;
                    }
                    if (zznoVar.zzh() != 2) {
                        this.u = z;
                    }
                    zznoVar.c.b();
                    cwoVar = zznoVar.b;
                    cwoVar.o();
                    if (cwoVar.V.f == null) {
                        this.v = z;
                    } else if (zznsVar.a(10)) {
                        this.v = true;
                    }
                    int zzh = zznoVar.zzh();
                    if (this.u) {
                        i2 = 5;
                    } else if (this.v) {
                        i2 = 13;
                    } else if (zzh == i) {
                        i2 = 11;
                    } else {
                        i2 = 12;
                        if (zzh == 2) {
                            int i20 = this.l;
                            i2 = (i20 == 0 || i20 == 2 || i20 == 12) ? 2 : !zznoVar.zzk() ? 7 : zznoVar.zzi() != 0 ? 10 : 6;
                        } else if (zzh == 3) {
                            i2 = !zznoVar.zzk() ? i : zznoVar.zzi() != 0 ? 9 : 3;
                        } else if (zzh != 1 || this.l == 0) {
                            i2 = this.l;
                        }
                    }
                    if (this.l != i2) {
                        this.l = i2;
                        this.z = true;
                        this.b.execute(new yuo(7, this, pz.e().setState(this.l).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                    }
                    if (zznsVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                        zzpy zzpyVar2 = this.c;
                        zznr zznrVar3 = (zznr) zznsVar.b.get(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
                        zznrVar3.getClass();
                        synchronized (zzpyVar2) {
                            try {
                                String str2 = zzpyVar2.f;
                                if (str2 != null) {
                                    g2p g2pVar3 = (g2p) zzpyVar2.c.get(str2);
                                    if (g2pVar3 == null) {
                                        throw r8;
                                    }
                                    zzpyVar2.d(g2pVar3);
                                }
                                Iterator it3 = zzpyVar2.c.values().iterator();
                                while (it3.hasNext()) {
                                    g2p g2pVar4 = (g2p) it3.next();
                                    it3.remove();
                                    if (g2pVar4.e && (zzqfVar = zzpyVar2.d) != null) {
                                        zzqfVar.s(zznrVar3, g2pVar4.a);
                                    }
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            i = 4;
            if (!a2) {
                if (this.s != null) {
                }
                this.s = zzvVar;
                e(0, elapsedRealtime, zzvVar, i15);
            }
            if (!z2) {
                if (this.t != null) {
                }
                this.t = zzvVar;
                e(2, elapsedRealtime, zzvVar, i16);
            }
            r8 = zzvVar;
            if (y(this.o)) {
            }
            if (y(this.p)) {
            }
            if (y(this.q)) {
            }
            switch (zzes.a(this.a).b()) {
            }
            if (i11 != this.m) {
            }
            if (zznoVar.zzh() != 2) {
            }
            zznoVar.c.b();
            cwoVar = zznoVar.b;
            cwoVar.o();
            if (cwoVar.V.f == null) {
            }
            int zzh2 = zznoVar.zzh();
            if (this.u) {
            }
            if (this.l != i2) {
            }
            if (zznsVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            }
        }
        r8 = 0;
        i = 4;
        if (y(this.o)) {
        }
        if (y(this.p)) {
        }
        if (y(this.q)) {
        }
        switch (zzes.a(this.a).b()) {
        }
        if (i11 != this.m) {
        }
        if (zznoVar.zzh() != 2) {
        }
        zznoVar.c.b();
        cwoVar = zznoVar.b;
        cwoVar.o();
        if (cwoVar.V.f == null) {
        }
        int zzh22 = zznoVar.zzh();
        if (this.u) {
        }
        if (this.l != i2) {
        }
        if (zznsVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
        }
    }

    public final LogSessionId q() {
        return this.d.getSessionId();
    }

    public final void r(zznr zznrVar, String str) {
        zzxo zzxoVar = zznrVar.d;
        if (zzxoVar == null || !zzxoVar.b()) {
            m();
            this.j = str;
            this.k = pz.d().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            f(zznrVar.b, zzxoVar);
        }
    }

    public final void s(zznr zznrVar, String str) {
        zzxo zzxoVar = zznrVar.d;
        if ((zzxoVar == null || !zzxoVar.b()) && str.equals(this.j)) {
            m();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final /* synthetic */ void t(PlaybackErrorEvent playbackErrorEvent) {
        this.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void u(NetworkEvent networkEvent) {
        this.d.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void v(PlaybackStateEvent playbackStateEvent) {
        this.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void w(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void x(PlaybackMetrics playbackMetrics) {
        this.d.reportPlaybackMetrics(playbackMetrics);
    }

    public final boolean y(gvo gvoVar) {
        String str;
        if (gvoVar == null) {
            return false;
        }
        zzpy zzpyVar = this.c;
        String str2 = (String) gvoVar.c;
        synchronized (zzpyVar) {
            str = zzpyVar.f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void b(IOException iOException) {
    }
}
