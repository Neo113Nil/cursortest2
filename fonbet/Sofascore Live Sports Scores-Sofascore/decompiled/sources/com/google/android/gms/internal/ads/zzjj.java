package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.j5o;
import defpackage.jso;
import defpackage.mio;
import defpackage.njo;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjj implements zzmc {
    public static final s p;
    public final zzbe a;
    public final zzbd b;
    public final zzabv c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final zzgxp m;
    public final ConcurrentHashMap n;
    public long o;

    static {
        mio mioVar = zzgxm.b;
        Object[] objArr = {U3.i.b, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset"};
        zzgzf.a(6, objArr);
        p = zzgxm.z(6, objArr);
    }

    public zzjj() {
        zzabv zzabvVar = new zzabv();
        njo njoVar = njo.g;
        j(1000, 0, "bufferForPlaybackMs", "0");
        j(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        j(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        j(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "minBufferMs", "bufferForPlaybackMs");
        j(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        j(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        j(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        j(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        j(0, 0, "backBufferDurationMs", "0");
        this.a = new zzbe();
        this.b = new zzbd();
        this.c = zzabvVar;
        long u = zzfm.u(50000L);
        this.d = u;
        long u2 = zzfm.u(1000L);
        this.e = u2;
        this.f = u;
        this.g = u;
        this.h = u2;
        this.i = u2;
        this.j = zzfm.u(2000L);
        this.k = u2;
        this.l = zzfm.u(0L);
        this.n = new ConcurrentHashMap();
        this.m = zzgxp.a(njoVar);
        this.o = -1L;
    }

    public static void j(int i, int i2, String str, String str2) {
        if (i >= i2) {
            return;
        }
        a70.p(zzgvb.a("%s cannot be less than %s", str, str2));
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void a(zzmb zzmbVar, zzabe[] zzabeVarArr) {
        zzqj zzqjVar = zzmbVar.a;
        Integer num = (Integer) this.m.get(zzqjVar.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        jso jsoVar = (jso) this.n.get(zzqjVar);
        jsoVar.getClass();
        if (intValue == -1) {
            boolean i = i(zzmbVar);
            int length = zzabeVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i2 >= length) {
                    break;
                }
                zzabe zzabeVar = zzabeVarArr[i2];
                if (zzabeVar != null) {
                    int i5 = zzabeVar.zza().c;
                    if (i5 != -1) {
                        if (i5 == 0) {
                            i4 = 144310272;
                        } else if (i5 != 1) {
                            i4 = i5 != 2 ? i5 != 4 ? 131072 : 26214400 : i ? 19660800 : 131072000;
                        }
                    }
                    i3 += i4;
                }
                i2++;
            }
            String str = zzfm.a;
            intValue = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, Math.min(i3, 210239488));
        }
        jsoVar.c = intValue;
        h();
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean b(zzmb zzmbVar) {
        int i;
        long j;
        boolean z;
        boolean z2;
        int i2;
        ConcurrentHashMap concurrentHashMap = this.n;
        zzqj zzqjVar = zzmbVar.a;
        jso jsoVar = (jso) concurrentHashMap.get(zzqjVar);
        jsoVar.getClass();
        jso jsoVar2 = (jso) this.n.get(zzqjVar);
        jsoVar2.getClass();
        synchronized (jsoVar2) {
            i = jsoVar2.d;
        }
        int i3 = i * C.DEFAULT_BUFFER_SEGMENT_SIZE;
        jso jsoVar3 = (jso) this.n.get(zzqjVar);
        jsoVar3.getClass();
        int i4 = jsoVar3.c;
        if (zzqjVar.equals(zzqj.c)) {
            return i3 < i4;
        }
        boolean i5 = i(zzmbVar);
        long j2 = i5 ? this.e : this.d;
        long j3 = i5 ? this.g : this.f;
        float f = zzmbVar.e;
        if (f > 1.0f) {
            j2 = Math.min(zzfm.y(j2, f), j3);
        }
        long j4 = zzmbVar.d;
        if (j4 < Math.max(j2, 500000L)) {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= maxMemory) {
                long freeMemory = runtime.freeMemory();
                zzabv zzabvVar = this.c;
                synchronized (zzabvVar) {
                    i2 = zzabvVar.c * C.DEFAULT_BUFFER_SEGMENT_SIZE;
                }
                j = 500000;
                if (freeMemory + i2 < maxMemory / 25) {
                    z = false;
                    z2 = i5 ? i3 < i4 : !(!z && i3 >= i4);
                    jsoVar.b = z2;
                    if (!z2 && i5 && !z) {
                        zzeh.b("Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                    }
                    if (!jsoVar.b && j4 < j) {
                        zzeh.c("Target buffer size reached with less than 500ms of buffered media data.");
                    }
                }
            } else {
                j = 500000;
            }
            z = true;
            if (i5) {
            }
            jsoVar.b = z2;
            if (!z2) {
                zzeh.b("Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!jsoVar.b) {
                zzeh.c("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= j3 || i3 >= i4) {
            jsoVar.b = false;
        }
        return jsoVar.b;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final zzabp c(zzqj zzqjVar) {
        return new j5o(this, zzqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void d(zzqj zzqjVar) {
        long id = Thread.currentThread().getId();
        long j = this.o;
        zzguk.g("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.o = id;
        ConcurrentHashMap concurrentHashMap = this.n;
        jso jsoVar = (jso) concurrentHashMap.get(zzqjVar);
        if (jsoVar == null) {
            jso jsoVar2 = new jso();
            jsoVar2.a = 1;
            concurrentHashMap.put(zzqjVar, jsoVar2);
        } else {
            jsoVar.a++;
        }
        jso jsoVar3 = (jso) concurrentHashMap.get(zzqjVar);
        jsoVar3.getClass();
        Integer num = (Integer) this.m.get(zzqjVar.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (intValue == -1) {
            intValue = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        jsoVar3.c = intValue;
        jsoVar3.b = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void e(zzqj zzqjVar) {
        ConcurrentHashMap concurrentHashMap = this.n;
        jso jsoVar = (jso) concurrentHashMap.get(zzqjVar);
        if (jsoVar != null) {
            int i = jsoVar.a - 1;
            jsoVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(zzqjVar);
                h();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void f(zzqj zzqjVar) {
        ConcurrentHashMap concurrentHashMap = this.n;
        jso jsoVar = (jso) concurrentHashMap.get(zzqjVar);
        if (jsoVar != null) {
            int i = jsoVar.a - 1;
            jsoVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(zzqjVar);
                h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean g(zzmb zzmbVar) {
        long j;
        boolean z;
        int i;
        boolean z2 = zzmbVar.f;
        long j2 = zzmbVar.d;
        float f = zzmbVar.e;
        boolean i2 = i(zzmbVar);
        String str = zzfm.a;
        if (f != 1.0f) {
            j2 = Math.round(j2 / f);
        }
        if (z2) {
            if (i2) {
                j = this.k;
                z = true;
            } else {
                j = this.j;
                z = false;
            }
        } else if (i2) {
            j = this.i;
            z = true;
        } else {
            j = this.h;
            z = false;
        }
        long j3 = zzmbVar.g;
        if (j3 != C.TIME_UNSET) {
            j = Math.min(j3 / 2, j);
        }
        if (j > 0 && j2 < j) {
            if (!z) {
                zzqj zzqjVar = zzmbVar.a;
                jso jsoVar = (jso) this.n.get(zzqjVar);
                jsoVar.getClass();
                synchronized (jsoVar) {
                    i = jsoVar.d;
                }
                int i3 = i * C.DEFAULT_BUFFER_SEGMENT_SIZE;
                jso jsoVar2 = (jso) this.n.get(zzqjVar);
                jsoVar2.getClass();
                if (i3 >= jsoVar2.c) {
                }
            }
            return false;
        }
        return true;
    }

    public final void h() {
        ConcurrentHashMap concurrentHashMap = this.n;
        boolean isEmpty = concurrentHashMap.isEmpty();
        zzabv zzabvVar = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (zzabvVar) {
                zzabvVar.b(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((jso) it.next()).c;
            }
            zzabvVar.b(i);
        }
    }

    public final boolean i(zzmb zzmbVar) {
        zzbf zzbfVar = zzmbVar.b;
        zzag zzagVar = zzbfVar.b(zzbfVar.o(zzmbVar.c.a, this.b).c, this.a, 0L).b.b;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.a.getScheme();
        return TextUtils.isEmpty(scheme) || p.contains(scheme);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final long zzf() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzj() {
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            if (((jso) it.next()).b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzg() {
    }
}
