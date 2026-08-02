package com.google.android.gms.cast.framework.media;

import android.os.Looper;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.cast.internal.zzav;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzfk;
import com.ironsource.Ua;
import defpackage.cbn;
import defpackage.nhn;
import defpackage.scg;
import defpackage.sx2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class RemoteMediaClient implements Cast.MessageReceivedCallback {
    public static final Logger k = new Logger("RemoteMediaClient", null);
    public final zzar c;
    public final sx2 d;
    public final MediaQueue e;
    public com.google.android.gms.cast.zzq f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final Object a = new Object();
    public final zzfk b = new zzfk(Looper.getMainLooper());

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface Listener {
        void b();

        void g();

        void h();

        void i();

        void j();

        void l();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface MediaChannelResult extends Result {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface ParseAdsInfoCallback {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface ProgressListener {
        void b(long j, long j2);
    }

    static {
        String str = zzar.z;
    }

    public RemoteMediaClient(zzar zzarVar) {
        sx2 sx2Var = new sx2();
        sx2Var.c = this;
        sx2Var.b = new AtomicLong((CastUtils.b.nextLong() & 65535) * Ua.s);
        this.d = sx2Var;
        this.c = zzarVar;
        zzarVar.h = new g(this);
        zzarVar.c = sx2Var;
        this.e = new MediaQueue(this);
    }

    public static b F() {
        b bVar = new b(null);
        bVar.a(new a(bVar, new Status(17, null, null, null)));
        return bVar;
    }

    public static final void I(e eVar) {
        try {
            eVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            eVar.a(new d(eVar, new Status(2100, null, null, null)));
        }
    }

    public final boolean A() {
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = h();
        return h != null && h.e == 5;
    }

    public final boolean B() {
        Preconditions.e("Must be called from the main thread.");
        if (!m()) {
            return true;
        }
        MediaStatus h = h();
        return (h == null || !h.a1(2L) || h.u == null) ? false : true;
    }

    public final int C() {
        MediaQueueItem e;
        if (f() != null && k()) {
            if (l()) {
                return 6;
            }
            if (p()) {
                return 3;
            }
            if (o()) {
                return 2;
            }
            if (n() && (e = e()) != null && e.a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final boolean D() {
        if (!k()) {
            return false;
        }
        MediaStatus h = h();
        Preconditions.i(h);
        if (h.a1(128L) || h.p != 0) {
            return true;
        }
        Integer num = (Integer) h.x.get(h.c);
        return num != null && num.intValue() > 0;
    }

    public final boolean E() {
        if (!k()) {
            return false;
        }
        MediaStatus h = h();
        Preconditions.i(h);
        if (h.a1(64L) || h.p != 0) {
            return true;
        }
        Integer num = (Integer) h.x.get(h.c);
        return num != null && num.intValue() < h.q.size() + (-1);
    }

    public final boolean G() {
        return this.f != null;
    }

    public final void H(Set set) {
        MediaInfo mediaInfo;
        HashSet hashSet = new HashSet(set);
        if (p() || o() || l() || A()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((ProgressListener) it.next()).b(d(), j());
            }
        } else {
            if (!n()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ProgressListener) it2.next()).b(0L, 0L);
                }
                return;
            }
            MediaQueueItem e = e();
            if (e == null || (mediaInfo = e.a) == null) {
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((ProgressListener) it3.next()).b(0L, mediaInfo.e);
            }
        }
    }

    @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
    public final void a(String str) {
        this.c.e(str);
    }

    public final void b(ProgressListener progressListener, long j) {
        Preconditions.e("Must be called from the main thread.");
        if (progressListener != null) {
            ConcurrentHashMap concurrentHashMap = this.i;
            if (concurrentHashMap.containsKey(progressListener)) {
                return;
            }
            Long valueOf = Long.valueOf(j);
            ConcurrentHashMap concurrentHashMap2 = this.j;
            h hVar = (h) concurrentHashMap2.get(valueOf);
            if (hVar == null) {
                hVar = new h(this, j);
                concurrentHashMap2.put(valueOf, hVar);
            }
            hVar.a.add(progressListener);
            concurrentHashMap.put(progressListener, hVar);
            if (k()) {
                RemoteMediaClient remoteMediaClient = hVar.e;
                zzfk zzfkVar = remoteMediaClient.b;
                scg scgVar = hVar.c;
                zzfkVar.removeCallbacks(scgVar);
                hVar.d = true;
                remoteMediaClient.b.postDelayed(scgVar, hVar.b);
            }
        }
    }

    public final long c() {
        long j;
        MediaStatus mediaStatus;
        AdBreakStatus adBreakStatus;
        synchronized (this.a) {
            Preconditions.e("Must be called from the main thread.");
            zzar zzarVar = this.c;
            j = 0;
            if (zzarVar.e != 0 && (mediaStatus = zzarVar.f) != null && (adBreakStatus = mediaStatus.s) != null) {
                double d = mediaStatus.d;
                if (d == 0.0d) {
                    d = 1.0d;
                }
                if (mediaStatus.e != 2) {
                    d = 0.0d;
                }
                j = zzarVar.g(d, adBreakStatus.b, 0L);
            }
        }
        return j;
    }

    public final long d() {
        long l;
        synchronized (this.a) {
            Preconditions.e("Must be called from the main thread.");
            l = this.c.l();
        }
        return l;
    }

    public final MediaQueueItem e() {
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = h();
        if (h == null) {
            return null;
        }
        return h.Z0(h.l);
    }

    public final MediaInfo f() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            Preconditions.e("Must be called from the main thread.");
            MediaStatus mediaStatus = this.c.f;
            mediaInfo = mediaStatus == null ? null : mediaStatus.a;
        }
        return mediaInfo;
    }

    public final MediaQueue g() {
        MediaQueue mediaQueue;
        synchronized (this.a) {
            Preconditions.e("Must be called from the main thread.");
            mediaQueue = this.e;
        }
        return mediaQueue;
    }

    public final MediaStatus h() {
        MediaStatus mediaStatus;
        synchronized (this.a) {
            Preconditions.e("Must be called from the main thread.");
            mediaStatus = this.c.f;
        }
        return mediaStatus;
    }

    public final int i() {
        int i;
        synchronized (this.a) {
            try {
                Preconditions.e("Must be called from the main thread.");
                MediaStatus h = h();
                i = h != null ? h.e : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final long j() {
        long j;
        synchronized (this.a) {
            Preconditions.e("Must be called from the main thread.");
            MediaStatus mediaStatus = this.c.f;
            MediaInfo mediaInfo = mediaStatus == null ? null : mediaStatus.a;
            j = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j;
    }

    public final boolean k() {
        Preconditions.e("Must be called from the main thread.");
        return l() || A() || p() || o() || n();
    }

    public final boolean l() {
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = h();
        return h != null && h.e == 4;
    }

    public final boolean m() {
        Preconditions.e("Must be called from the main thread.");
        MediaInfo f = f();
        return f != null && f.b == 2;
    }

    public final boolean n() {
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = h();
        return (h == null || h.l == 0) ? false : true;
    }

    public final boolean o() {
        int i;
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = h();
        if (h == null) {
            return false;
        }
        if (h.e == 3) {
            return true;
        }
        if (!m()) {
            return false;
        }
        synchronized (this.a) {
            try {
                Preconditions.e("Must be called from the main thread.");
                MediaStatus h2 = h();
                i = h2 != null ? h2.f : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i == 2;
    }

    public final boolean p() {
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = h();
        return h != null && h.e == 2;
    }

    public final boolean q() {
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = h();
        return h != null && h.r;
    }

    public final void r() {
        Preconditions.e("Must be called from the main thread.");
        if (G()) {
            I(new cbn(this, 1, false));
        } else {
            F();
        }
    }

    public final void s() {
        Preconditions.e("Must be called from the main thread.");
        if (G()) {
            I(new cbn(this, 0, false));
        } else {
            F();
        }
    }

    public final void t(Callback callback) {
        Preconditions.e("Must be called from the main thread.");
        if (callback != null) {
            this.h.add(callback);
        }
    }

    public final void u(ProgressListener progressListener) {
        Preconditions.e("Must be called from the main thread.");
        h hVar = (h) this.i.remove(progressListener);
        if (hVar != null) {
            HashSet hashSet = hVar.a;
            hashSet.remove(progressListener);
            if (hashSet.isEmpty()) {
                this.j.remove(Long.valueOf(hVar.b));
                hVar.e.b.removeCallbacks(hVar.c);
                hVar.d = false;
            }
        }
    }

    public final BasePendingResult v(long j) {
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.a = j;
        return w(new MediaSeekOptions(j, builder.b));
    }

    public final BasePendingResult w(MediaSeekOptions mediaSeekOptions) {
        Preconditions.e("Must be called from the main thread.");
        if (!G()) {
            return F();
        }
        nhn nhnVar = new nhn(this, mediaSeekOptions, 1);
        I(nhnVar);
        return nhnVar;
    }

    public final void x() {
        Preconditions.e("Must be called from the main thread.");
        int i = i();
        if (i == 4 || i == 2) {
            Preconditions.e("Must be called from the main thread.");
            if (G()) {
                I(new cbn(this, 3, false));
                return;
            } else {
                F();
                return;
            }
        }
        Preconditions.e("Must be called from the main thread.");
        if (G()) {
            I(new cbn(this, 5, false));
        } else {
            F();
        }
    }

    public final void y(zzbm zzbmVar) {
        zzar zzarVar = this.c;
        sx2 sx2Var = this.d;
        com.google.android.gms.cast.zzq zzqVar = this.f;
        if (zzqVar == zzbmVar) {
            return;
        }
        if (zzqVar != null) {
            List list = zzarVar.d;
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzav) it.next()).e(2002);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzarVar.j();
            this.e.a();
            Preconditions.e("Must be called from the main thread.");
            zzqVar.a(zzarVar.b);
            sx2Var.a = null;
            this.b.removeCallbacksAndMessages(null);
        }
        this.f = zzbmVar;
        if (zzbmVar != null) {
            sx2Var.a = zzbmVar;
        }
    }

    public final void z() {
        com.google.android.gms.cast.zzq zzqVar = this.f;
        if (zzqVar == null) {
            return;
        }
        Preconditions.e("Must be called from the main thread.");
        zzqVar.c(this.c.b, this);
        Preconditions.e("Must be called from the main thread.");
        if (G()) {
            I(new cbn(this, 7));
        } else {
            F();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Callback {
        public void g() {
        }

        public void h() {
        }

        public void i() {
        }

        public void j() {
        }

        public void l() {
        }

        public void w() {
        }

        public void q(int[] iArr) {
        }

        public void s(int[] iArr) {
        }

        public void t(int[] iArr) {
        }

        public void u(MediaQueueItem[] mediaQueueItemArr) {
        }

        public void r(int i, int[] iArr) {
        }

        public void v(int i, ArrayList arrayList, ArrayList arrayList2) {
        }

        public void p(long j, long j2, long j3, String str, int i) {
        }
    }
}
