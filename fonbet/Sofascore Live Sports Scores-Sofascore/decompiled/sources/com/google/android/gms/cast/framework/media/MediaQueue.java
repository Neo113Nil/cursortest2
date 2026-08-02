package com.google.android.gms.cast.framework.media;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzfk;
import defpackage.cbn;
import defpackage.fvo;
import defpackage.mto;
import defpackage.scg;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MediaQueue {
    public long b;
    public final RemoteMediaClient c;
    public ArrayList d;
    public final SparseIntArray e;
    public final mto f;
    public final ArrayList g;
    public final ArrayDeque h;
    public final zzfk i;
    public final scg j;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = Collections.synchronizedSet(new HashSet());
    public final Logger a = new Logger("MediaQueue", null);

    public MediaQueue(RemoteMediaClient remoteMediaClient) {
        this.c = remoteMediaClient;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new zzfk(Looper.getMainLooper());
        this.j = new scg(this, 7);
        remoteMediaClient.t(new zzn(this));
        this.f = new mto(this);
        this.b = d();
        b();
    }

    public final void a() {
        e();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        this.i.removeCallbacks(this.j);
        this.h.clear();
        BasePendingResult basePendingResult = this.l;
        if (basePendingResult != null) {
            basePendingResult.d();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.d();
            this.k = null;
        }
        g();
        f();
    }

    public final void b() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        Preconditions.e("Must be called from the main thread.");
        if (this.b != 0 && (basePendingResult = this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.d();
                this.l = null;
            }
            BasePendingResult basePendingResult3 = this.k;
            if (basePendingResult3 != null) {
                basePendingResult3.d();
                this.k = null;
            }
            RemoteMediaClient remoteMediaClient = this.c;
            remoteMediaClient.getClass();
            Preconditions.e("Must be called from the main thread.");
            if (remoteMediaClient.G()) {
                cbn cbnVar = new cbn(remoteMediaClient, 2);
                RemoteMediaClient.I(cbnVar);
                basePendingResult2 = cbnVar;
            } else {
                basePendingResult2 = RemoteMediaClient.F();
            }
            this.l = basePendingResult2;
            basePendingResult2.i(new fvo(this, 1));
        }
    }

    public final /* synthetic */ void c() {
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        for (int i = 0; i < this.d.size(); i++) {
            sparseIntArray.put(((Integer) this.d.get(i)).intValue(), i);
        }
    }

    public final long d() {
        MediaStatus h = this.c.h();
        if (h == null) {
            return 0L;
        }
        MediaInfo mediaInfo = h.a;
        int i = mediaInfo == null ? -1 : mediaInfo.b;
        int i2 = h.e;
        int i3 = h.f;
        int i4 = h.l;
        if (i2 == 1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return 0L;
                    }
                } else if (i != 2) {
                    return 0L;
                }
            }
            if (i4 == 0) {
                return 0L;
            }
        }
        return h.b;
    }

    public final void e() {
        Set set = this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        Set set = this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Set set = this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        Set set = this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Callback {
        public void a() {
        }
    }
}
