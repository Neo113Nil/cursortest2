package defpackage;

import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yq4 {
    public static final vvf s;
    public final kij a;
    public final iij b;
    public final zz0 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final lv9 p;
    public final ConcurrentHashMap q;
    public long r;

    static {
        av9 av9Var = hv9.b;
        Object[] objArr = {U3.i.b, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset"};
        qha.p(6, objArr);
        s = hv9.r(6, objArr);
    }

    public yq4(zz0 zz0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, int i9, boolean z3, Map map) {
        a(i5, 0, "bufferForPlaybackMs", "0");
        a(i6, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i8, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(i, i5, "minBufferMs", "bufferForPlaybackMs");
        a(i2, i6, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i8, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(i3, i, "maxBufferMs", "minBufferMs");
        a(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(i9, 0, "backBufferDurationMs", "0");
        this.a = new kij();
        this.b = new iij();
        this.c = zz0Var;
        this.d = nik.T(i);
        this.e = nik.T(i2);
        this.f = nik.T(i3);
        this.g = nik.T(i4);
        this.h = nik.T(i5);
        this.i = nik.T(i6);
        this.j = nik.T(i7);
        this.k = nik.T(i8);
        this.l = z;
        this.m = z2;
        this.n = nik.T(i9);
        this.o = z3;
        this.q = new ConcurrentHashMap();
        this.p = lv9.f(map);
        this.r = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        z1a.u(i >= i2, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(ifb ifbVar) {
        int i;
        boolean z;
        long j;
        float f;
        cse cseVar = ifbVar.a;
        long j2 = ifbVar.d;
        wq4 wq4Var = (wq4) this.q.get(cseVar);
        wq4Var.getClass();
        wq4 wq4Var2 = (wq4) this.q.get(cseVar);
        wq4Var2.getClass();
        synchronized (wq4Var2) {
            i = wq4Var2.d;
        }
        this.c.getClass();
        int i2 = i * C.DEFAULT_BUFFER_SEGMENT_SIZE;
        wq4 wq4Var3 = (wq4) this.q.get(cseVar);
        wq4Var3.getClass();
        boolean z2 = i2 >= wq4Var3.c;
        if (cseVar.equals(cse.c)) {
            return !z2;
        }
        mij mijVar = ifbVar.b;
        v5c v5cVar = mijVar.m(mijVar.g(ifbVar.c.a, this.b).c, this.a, 0L).b.b;
        if (v5cVar != null) {
            String scheme = v5cVar.a.getScheme();
            if (TextUtils.isEmpty(scheme) || s.contains(scheme)) {
                z = true;
                j = !z ? this.e : this.d;
                long j3 = !z ? this.g : this.f;
                f = ifbVar.e;
                if (f > 1.0f) {
                    j = Math.min(nik.C(j, f), j3);
                }
                if (j2 >= Math.max(j, 500000L)) {
                    boolean z3 = (z ? this.m : this.l) || !z2;
                    wq4Var.b = z3;
                    if (!z3 && j2 < 500000) {
                        tgj.d0("Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (j2 >= j3 || z2) {
                    wq4Var.b = false;
                }
                return wq4Var.b;
            }
        }
        z = false;
        if (!z) {
        }
        if (!z) {
        }
        f = ifbVar.e;
        if (f > 1.0f) {
        }
        if (j2 >= Math.max(j, 500000L)) {
        }
        return wq4Var.b;
    }

    public final void c() {
        boolean isEmpty = this.q.isEmpty();
        zz0 zz0Var = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (zz0Var) {
                zz0Var.a0(0);
            }
        } else {
            Iterator it = this.q.values().iterator();
            while (it.hasNext()) {
                i += ((wq4) it.next()).c;
            }
            zz0Var.a0(i);
        }
    }
}
