package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.WidevineUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oo4 implements xb5 {
    public final List a;
    public final rf6 b;
    public final z41 c;
    public final sz8 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final at3 h;
    public final it7 i;
    public final cse j;
    public final l2a k;
    public final UUID l;
    public final Looper m;
    public final gl0 n;
    public final Object o;
    public int p;
    public int q;
    public HandlerThread r;
    public mo4 s;
    public nr8 t;
    public wb5 u;
    public byte[] v;
    public byte[] w;
    public pf6 x;
    public dja y;
    public qf6 z;

    public oo4(UUID uuid, rf6 rf6Var, z41 z41Var, sz8 sz8Var, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, l2a l2aVar, Looper looper, it7 it7Var, cse cseVar) {
        this.l = uuid;
        this.c = z41Var;
        this.d = sz8Var;
        this.b = rf6Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = l2aVar;
        this.h = new at3();
        this.i = it7Var;
        this.j = cseVar;
        this.p = 2;
        this.m = looper;
        this.n = new gl0(this, looper, 2);
        this.o = new Object();
    }

    @Override // defpackage.xb5
    public final UUID a() {
        m();
        return this.l;
    }

    @Override // defpackage.xb5
    public final boolean b() {
        m();
        return this.e;
    }

    @Override // defpackage.xb5
    public final nr8 c() {
        m();
        return this.t;
    }

    @Override // defpackage.xb5
    public final void d(cc5 cc5Var) {
        m();
        int i = this.q;
        if (i <= 0) {
            tgj.z("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            gl0 gl0Var = this.n;
            String str = nik.a;
            gl0Var.removeCallbacksAndMessages(null);
            mo4 mo4Var = this.s;
            synchronized (mo4Var) {
                mo4Var.removeCallbacksAndMessages(null);
                mo4Var.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            synchronized (this.o) {
                this.y = null;
            }
            this.z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.closeSession(bArr);
                this.v = null;
            }
        }
        if (cc5Var != null) {
            at3 at3Var = this.h;
            synchronized (at3Var.a) {
                try {
                    Integer num = (Integer) at3Var.b.get(cc5Var);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(at3Var.d);
                        arrayList.remove(cc5Var);
                        at3Var.d = Collections.unmodifiableList(arrayList);
                        int intValue = num.intValue();
                        HashMap hashMap = at3Var.b;
                        if (intValue == 1) {
                            hashMap.remove(cc5Var);
                            HashSet hashSet = new HashSet(at3Var.c);
                            hashSet.remove(cc5Var);
                            at3Var.c = Collections.unmodifiableSet(hashSet);
                        } else {
                            hashMap.put(cc5Var, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.h.a(cc5Var) == 0) {
                cc5Var.e();
            }
        }
        sz8 sz8Var = this.d;
        int i3 = this.q;
        so4 so4Var = (so4) sz8Var.b;
        if (i3 == 1 && so4Var.o > 0 && so4Var.k != C.TIME_UNSET) {
            so4Var.n.add(this);
            Handler handler = so4Var.t;
            handler.getClass();
            handler.postAtTime(new wb3(this, 9), this, SystemClock.uptimeMillis() + so4Var.k);
        } else if (i3 == 0) {
            so4Var.l.remove(this);
            if (so4Var.q == this) {
                so4Var.q = null;
            }
            if (so4Var.r == this) {
                so4Var.r = null;
            }
            z41 z41Var = so4Var.h;
            HashSet hashSet2 = (HashSet) z41Var.b;
            hashSet2.remove(this);
            if (((oo4) z41Var.c) == this) {
                z41Var.c = null;
                if (!hashSet2.isEmpty()) {
                    oo4 oo4Var = (oo4) hashSet2.iterator().next();
                    z41Var.c = oo4Var;
                    qf6 provisionRequest = oo4Var.b.getProvisionRequest();
                    oo4Var.z = provisionRequest;
                    mo4 mo4Var2 = oo4Var.s;
                    String str2 = nik.a;
                    provisionRequest.getClass();
                    mo4Var2.getClass();
                    mo4Var2.obtainMessage(1, new no4(lfb.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
                }
            }
            if (so4Var.k != C.TIME_UNSET) {
                Handler handler2 = so4Var.t;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                so4Var.n.remove(this);
            }
        }
        so4Var.k();
    }

    @Override // defpackage.xb5
    public final void e(cc5 cc5Var) {
        m();
        if (this.q < 0) {
            tgj.z("Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (cc5Var != null) {
            at3 at3Var = this.h;
            synchronized (at3Var.a) {
                try {
                    ArrayList arrayList = new ArrayList(at3Var.d);
                    arrayList.add(cc5Var);
                    at3Var.d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) at3Var.b.get(cc5Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(at3Var.c);
                        hashSet.add(cc5Var);
                        at3Var.c = Collections.unmodifiableSet(hashSet);
                    }
                    at3Var.b.put(cc5Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            z1a.E(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new mo4(this, this.r.getLooper());
            if (k()) {
                g(true);
            }
        } else if (cc5Var != null && h() && this.h.a(cc5Var) == 1) {
            cc5Var.c(this.p);
        }
        so4 so4Var = (so4) this.d.b;
        if (so4Var.k != C.TIME_UNSET) {
            so4Var.n.remove(this);
            Handler handler = so4Var.t;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.xb5
    public final boolean f(String str) {
        m();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.f(str, bArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[Catch: NumberFormatException -> 0x0077, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0077, blocks: (B:47:0x006b, B:49:0x0073), top: B:46:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z) {
        long min;
        long j;
        String str;
        String str2;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str3 = nik.a;
        boolean z2 = true;
        if (this.w == null) {
            l(bArr, 1, z);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.restoreKeys(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                i(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (yc2.d.equals(this.l)) {
            m();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map queryKeyStatus = bArr2 == null ? null : this.b.queryKeyStatus(bArr2);
            if (queryKeyStatus != null) {
                long j2 = C.TIME_UNSET;
                try {
                    str2 = (String) queryKeyStatus.get(WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING);
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j);
                    str = (String) queryKeyStatus.get(WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING);
                    if (str != null) {
                        j2 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j2));
                }
                j = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j);
                str = (String) queryKeyStatus.get(WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING);
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j2));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            tgj.y("Offline license has expired or will expire soon. Remaining seconds: " + min);
            l(bArr, 2, z);
            return;
        }
        if (min <= 0) {
            i(2, new vja());
            return;
        }
        this.p = 4;
        at3 at3Var = this.h;
        synchronized (at3Var.a) {
            set = at3Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((cc5) it.next()).b();
        }
    }

    @Override // defpackage.xb5
    public final wb5 getError() {
        m();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.xb5
    public final int getState() {
        m();
        return this.p;
    }

    public final boolean h() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    public final void i(int i, Throwable th) {
        int i2;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = nik.A(nik.B(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !tgj.Q(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof cdk) {
                        i2 = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
                    } else if (th instanceof qo4) {
                        i2 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                    } else if (th instanceof vja) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            ilg.c();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new wb5(i2, th);
        tgj.A("DRM session error", th);
        if (th instanceof Exception) {
            at3 at3Var = this.h;
            synchronized (at3Var.a) {
                set = at3Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((cc5) it.next()).d((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            sw9.m("Unexpected Throwable subclass", th);
            return;
        } else if (!tgj.R(th) && !tgj.Q(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void j(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || tgj.Q(th)) {
            this.c.v(this);
        } else {
            i(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k() {
        Set set;
        if (h()) {
            return true;
        }
        try {
            byte[] openSession = this.b.openSession();
            this.v = openSession;
            this.b.c(openSession, this.j);
            this.t = this.b.d(this.v);
            this.p = 3;
            at3 at3Var = this.h;
            synchronized (at3Var.a) {
                set = at3Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((cc5) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.v(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (tgj.Q(e)) {
                i(1, e);
                return false;
            }
            this.c.v(this);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (tgj.Q(e)) {
            }
        }
    }

    public final void l(byte[] bArr, int i, boolean z) {
        try {
            synchronized (this.o) {
                try {
                    this.y = new dja();
                    List list = this.a;
                    if (list != null) {
                        hv9.v(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pf6 e = this.b.e(bArr, this.a, i, this.g);
            this.x = e;
            mo4 mo4Var = this.s;
            String str = nik.a;
            e.getClass();
            mo4Var.getClass();
            mo4Var.obtainMessage(2, new no4(lfb.g.getAndIncrement(), z, SystemClock.elapsedRealtime(), e)).sendToTarget();
        } catch (Exception | NoSuchMethodError e2) {
            j(e2, true);
        }
    }

    public final void m() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            tgj.e0("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
