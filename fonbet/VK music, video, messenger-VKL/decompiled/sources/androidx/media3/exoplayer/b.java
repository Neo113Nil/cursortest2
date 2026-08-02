package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ahn;
import xsna.d7q;
import xsna.ewo0;
import xsna.fxc0;
import xsna.kr10;
import xsna.vu1;
import xsna.x1b0;
import xsna.xu1;
import xsna.y2r0;
import xsna.z9l;

/* compiled from: DefaultLoadControl.java */
/* loaded from: classes12.dex */
public final class b implements e {
    public static final com.google.common.collect.g s = ImmutableList.t(X3.i.b, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset");
    public final ewo0.c a;
    public final ewo0.b b;
    public final z9l c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final ImmutableMap<String, Integer> p;
    public final ConcurrentHashMap<x1b0, c> q;
    public long r;

    /* compiled from: DefaultLoadControl.java */
    public static final class a {
        public final HashMap<String, Integer> a;

        @Nullable
        public z9l b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public final int k;
        public boolean l;
        public boolean m;
        public int n;
        public boolean o;

        @Nullable
        public Boolean p;

        public a() {
            HashMap<String, Integer> hashMap = new HashMap<>();
            this.a = hashMap;
            hashMap.put(x1b0.d.a, 144179200);
            this.c = 50000;
            this.d = 1000;
            this.e = 50000;
            this.f = 50000;
            this.g = 1000;
            this.h = 1000;
            this.i = 2000;
            this.j = 1000;
            this.k = -1;
            this.l = false;
            this.m = true;
            this.n = 0;
        }

        public final b a() {
            fxc0.z(!this.o);
            this.o = true;
            if (this.b == null) {
                this.b = new z9l(65536);
            }
            Boolean bool = this.p;
            if (bool != null && bool.booleanValue()) {
                this.d = this.c;
                this.f = this.e;
                this.h = this.g;
                this.j = this.i;
                this.m = this.l;
            }
            return new b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.a);
        }

        public final void b(int i, int i2, int i3, int i4) {
            fxc0.z(!this.o);
            b.i(i3, 0, "bufferForPlaybackMs", "0");
            b.i(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            b.i(i, i3, "minBufferMs", "bufferForPlaybackMs");
            b.i(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            b.i(i2, i, "maxBufferMs", "minBufferMs");
            this.c = i;
            this.e = i2;
            this.g = i3;
            this.i = i4;
            this.d = i;
            this.f = i2;
            this.h = i3;
            this.j = i4;
            if (this.p == null) {
                this.p = Boolean.TRUE;
            }
        }

        public final void c(boolean z) {
            fxc0.z(!this.o);
            this.l = z;
            this.m = z;
            if (this.p == null) {
                this.p = Boolean.TRUE;
            }
        }
    }

    /* compiled from: DefaultLoadControl.java */
    /* renamed from: androidx.media3.exoplayer.b$b, reason: collision with other inner class name */
    public final class C0050b implements xu1 {
        public final HashMap<vu1, x1b0> a = new HashMap<>();
        public final x1b0 b;

        public C0050b(x1b0 x1b0Var) {
            this.b = x1b0Var;
        }

        @Override // xsna.xu1
        public final synchronized void a(vu1 vu1Var) {
            b.this.c.a(vu1Var);
            c(vu1Var);
        }

        @Override // xsna.xu1
        public final synchronized vu1 allocate() {
            vu1 allocate;
            allocate = b.this.c.allocate();
            this.a.put(allocate, this.b);
            c cVar = b.this.q.get(this.b);
            if (cVar != null) {
                synchronized (cVar) {
                    cVar.d++;
                }
            }
            return allocate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [xsna.xu1$a] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v4, types: [androidx.media3.exoplayer.source.o$a] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        @Override // xsna.xu1
        public final synchronized void b(@Nullable xu1.a aVar) {
            b.this.c.b(aVar);
            while (aVar != 0) {
                vu1 vu1Var = aVar.c;
                vu1Var.getClass();
                c(vu1Var);
                aVar = aVar.d;
                if (aVar == 0 || aVar.c == null) {
                    aVar = 0;
                }
            }
        }

        public final void c(vu1 vu1Var) {
            x1b0 remove = this.a.remove(vu1Var);
            remove.getClass();
            c cVar = b.this.q.get(remove);
            if (cVar != null) {
                synchronized (cVar) {
                    cVar.d--;
                }
            }
        }

        @Override // xsna.xu1
        public final synchronized int getIndividualAllocationLength() {
            return b.this.c.b;
        }

        @Override // xsna.xu1
        public final synchronized void trim() {
            b.this.c.trim();
        }
    }

    /* compiled from: DefaultLoadControl.java */
    public static class c {
        public int a = 1;
        public boolean b;
        public int c;
        public int d;
    }

    public b(z9l z9lVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, int i10, Map map) {
        i(i5, 0, "bufferForPlaybackMs", "0");
        i(i6, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        i(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(i8, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        i(i, i5, "minBufferMs", "bufferForPlaybackMs");
        i(i2, i6, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        i(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(i2, i8, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        i(i3, i, "maxBufferMs", "minBufferMs");
        i(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        i(i10, 0, "backBufferDurationMs", "0");
        this.a = new ewo0.c();
        this.b = new ewo0.b();
        this.c = z9lVar;
        this.d = y2r0.S(i);
        this.e = y2r0.S(i2);
        this.f = y2r0.S(i3);
        this.g = y2r0.S(i4);
        this.h = y2r0.S(i5);
        this.i = y2r0.S(i6);
        this.j = y2r0.S(i7);
        this.k = y2r0.S(i8);
        this.l = i9;
        this.m = z;
        this.n = z2;
        this.o = y2r0.S(i10);
        this.q = new ConcurrentHashMap<>();
        this.p = ImmutableMap.a(map);
        this.r = -1L;
    }

    public static void i(int i, int i2, String str, String str2) {
        fxc0.r(i >= i2, "%s cannot be less than %s", str, str2);
    }

    @Override // androidx.media3.exoplayer.e
    public final boolean a(e.a aVar) {
        int i;
        x1b0 x1b0Var = aVar.a;
        long j = aVar.d;
        c cVar = this.q.get(x1b0Var);
        cVar.getClass();
        c cVar2 = this.q.get(x1b0Var);
        cVar2.getClass();
        synchronized (cVar2) {
            i = cVar2.d;
        }
        int i2 = i * this.c.b;
        c cVar3 = this.q.get(x1b0Var);
        cVar3.getClass();
        boolean z = i2 >= cVar3.c;
        if (x1b0Var.equals(x1b0.d)) {
            return !z;
        }
        boolean j2 = j(aVar);
        long j3 = j2 ? this.e : this.d;
        long j4 = j2 ? this.g : this.f;
        float f = aVar.e;
        if (f > 1.0f) {
            j3 = Math.min(y2r0.D(j3, f), j4);
        }
        if (j < Math.max(j3, 500000L)) {
            boolean z2 = (j2 ? this.n : this.m) || !z;
            cVar.b = z2;
            if (!z2 && j < 500000) {
                ahn.F("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j4 || z) {
            cVar.b = false;
        }
        return cVar.b;
    }

    @Override // androidx.media3.exoplayer.e
    public final boolean b() {
        Iterator<c> it = this.q.values().iterator();
        while (it.hasNext()) {
            if (it.next().b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.e
    public final void c(e.a aVar, d7q[] d7qVarArr) {
        x1b0 x1b0Var = aVar.a;
        Integer num = this.p.get(x1b0Var.a);
        int intValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        c cVar = this.q.get(x1b0Var);
        cVar.getClass();
        if (intValue == -1) {
            boolean j = j(aVar);
            int length = d7qVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i < length) {
                    d7q d7qVar = d7qVarArr[i];
                    if (d7qVar != null) {
                        switch (d7qVar.getTrackGroup().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = j ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    intValue = y2r0.j(i2, C.DEFAULT_VIDEO_BUFFER_SIZE, 210239488);
                }
            }
        }
        cVar.c = intValue;
        k();
    }

    @Override // androidx.media3.exoplayer.e
    public final void d(x1b0 x1b0Var) {
        ConcurrentHashMap<x1b0, c> concurrentHashMap = this.q;
        c cVar = concurrentHashMap.get(x1b0Var);
        if (cVar != null) {
            int i = cVar.a - 1;
            cVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(x1b0Var);
                k();
            }
        }
    }

    @Override // androidx.media3.exoplayer.e
    public final xu1 e(x1b0 x1b0Var) {
        return new C0050b(x1b0Var);
    }

    @Override // androidx.media3.exoplayer.e
    public final boolean f(e.a aVar) {
        int i;
        boolean j = j(aVar);
        x1b0 x1b0Var = aVar.a;
        long G = y2r0.G(aVar.d, aVar.e);
        long j2 = aVar.f ? j ? this.k : this.j : j ? this.i : this.h;
        long j3 = aVar.g;
        if (j3 != C.TIME_UNSET) {
            j2 = Math.min(j3 / 2, j2);
        }
        if (j2 <= 0 || G >= j2) {
            return true;
        }
        if (j ? this.n : this.m) {
            return false;
        }
        c cVar = this.q.get(x1b0Var);
        cVar.getClass();
        synchronized (cVar) {
            i = cVar.d;
        }
        int i2 = i * this.c.b;
        c cVar2 = this.q.get(x1b0Var);
        cVar2.getClass();
        return i2 >= cVar2.c;
    }

    @Override // androidx.media3.exoplayer.e
    public final void g(x1b0 x1b0Var) {
        long id = Thread.currentThread().getId();
        long j = this.r;
        fxc0.A(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.r = id;
        ConcurrentHashMap<x1b0, c> concurrentHashMap = this.q;
        c cVar = concurrentHashMap.get(x1b0Var);
        if (cVar == null) {
            concurrentHashMap.put(x1b0Var, new c());
        } else {
            cVar.a++;
        }
        c cVar2 = concurrentHashMap.get(x1b0Var);
        cVar2.getClass();
        Integer num = this.p.get(x1b0Var.a);
        int intValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        if (intValue == -1) {
            intValue = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        cVar2.c = intValue;
        cVar2.b = false;
    }

    @Override // androidx.media3.exoplayer.e
    public final long getBackBufferDurationUs() {
        return this.o;
    }

    @Override // androidx.media3.exoplayer.e
    public final void h(x1b0 x1b0Var) {
        ConcurrentHashMap<x1b0, c> concurrentHashMap = this.q;
        c cVar = concurrentHashMap.get(x1b0Var);
        if (cVar != null) {
            int i = cVar.a - 1;
            cVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(x1b0Var);
                k();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.r = -1L;
        }
    }

    public final boolean j(e.a aVar) {
        ewo0 ewo0Var = aVar.b;
        kr10.f fVar = ewo0Var.m(ewo0Var.g(aVar.c.a, this.b).c, this.a, 0L).c.b;
        if (fVar == null) {
            return false;
        }
        String scheme = fVar.a.getScheme();
        return TextUtils.isEmpty(scheme) || s.contains(scheme);
    }

    public final void k() {
        z9l z9lVar = this.c;
        ConcurrentHashMap<x1b0, c> concurrentHashMap = this.q;
        int i = 0;
        if (concurrentHashMap.isEmpty()) {
            synchronized (z9lVar) {
                if (z9lVar.a) {
                    z9lVar.c(0);
                }
            }
        } else {
            Iterator<c> it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += it.next().c;
            }
            z9lVar.c(i);
        }
    }

    @Override // androidx.media3.exoplayer.e
    public final boolean retainBackBufferFromKeyframe() {
        return false;
    }
}
