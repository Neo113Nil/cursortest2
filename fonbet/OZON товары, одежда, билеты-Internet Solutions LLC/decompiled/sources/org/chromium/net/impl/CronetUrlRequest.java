package org.chromium.net.impl;

import Ra.g;
import android.os.Process;
import androidx.annotation.NonNull;
import internal.org.jni_zero.CalledByNative;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.C;
import org.chromium.net.impl.I;

/* loaded from: classes6.dex */
public final class CronetUrlRequest extends org.chromium.net.k {

    /* renamed from: A, reason: collision with root package name */
    private int f78738A;

    /* renamed from: B, reason: collision with root package name */
    private int f78739B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f78740C;

    /* renamed from: D, reason: collision with root package name */
    private h f78741D;

    /* renamed from: a, reason: collision with root package name */
    private long f78742a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f78743b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f78744c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f78745d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f78746e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final CronetUrlRequestContext f78747f;

    /* renamed from: g, reason: collision with root package name */
    private final Va.a f78748g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f78749h;

    /* renamed from: i, reason: collision with root package name */
    private final i0 f78750i;

    /* renamed from: j, reason: collision with root package name */
    private final String f78751j;

    /* renamed from: k, reason: collision with root package name */
    private final int f78752k;

    /* renamed from: l, reason: collision with root package name */
    private final int f78753l;

    /* renamed from: m, reason: collision with root package name */
    private final String f78754m;

    /* renamed from: n, reason: collision with root package name */
    private final List<Map.Entry<String, String>> f78755n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f78756o;

    /* renamed from: p, reason: collision with root package name */
    private final g0 f78757p;

    /* renamed from: q, reason: collision with root package name */
    private final String f78758q;

    /* renamed from: r, reason: collision with root package name */
    private final long f78759r;

    /* renamed from: s, reason: collision with root package name */
    private final I f78760s;

    /* renamed from: t, reason: collision with root package name */
    private final CronetUploadDataStream f78761t;

    /* renamed from: u, reason: collision with root package name */
    private c0 f78762u;

    /* renamed from: v, reason: collision with root package name */
    private int f78763v;

    /* renamed from: w, reason: collision with root package name */
    private org.chromium.net.f f78764w;

    /* renamed from: x, reason: collision with root package name */
    private L f78765x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f78766y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f78767z;

    /* loaded from: classes10.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CronetUrlRequest.this.f78761t.r();
            synchronized (CronetUrlRequest.this.f78746e) {
                try {
                    if (CronetUrlRequest.this.y()) {
                        return;
                    }
                    CronetUrlRequest.this.f78761t.m(CronetUrlRequest.this.f78742a);
                    CronetUrlRequest.t(CronetUrlRequest.this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* loaded from: classes10.dex */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f78769a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78770b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CronetUrlRequest f78771c;

        b(CronetUrlRequest cronetUrlRequest, c0 c0Var, String str) {
            this.f78769a = c0Var;
            this.f78770b = str;
            this.f78771c = cronetUrlRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f78771c.v();
            synchronized (this.f78771c.f78746e) {
                try {
                    if (this.f78771c.y()) {
                        return;
                    }
                    this.f78771c.f78744c = true;
                    try {
                        this.f78771c.f78750i.d(this.f78771c, this.f78769a, this.f78770b);
                    } catch (Exception e11) {
                        CronetUrlRequest.s(this.f78771c, e11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CronetUrlRequest.this.v();
            synchronized (CronetUrlRequest.this.f78746e) {
                try {
                    if (CronetUrlRequest.this.y()) {
                        return;
                    }
                    CronetUrlRequest.this.f78745d = true;
                    try {
                        i0 i0Var = CronetUrlRequest.this.f78750i;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        i0Var.e(cronetUrlRequest, cronetUrlRequest.f78762u);
                    } catch (Exception e11) {
                        CronetUrlRequest.s(CronetUrlRequest.this, e11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (CronetUrlRequest.this.f78746e) {
                try {
                    if (CronetUrlRequest.this.y()) {
                        return;
                    }
                    CronetUrlRequest.this.w(0);
                    try {
                        i0 i0Var = CronetUrlRequest.this.f78750i;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        i0Var.f(cronetUrlRequest, cronetUrlRequest.f78762u);
                    } catch (Exception e11) {
                        CronetUrlRequest.r(CronetUrlRequest.this, "onSucceeded", e11);
                    }
                    CronetUrlRequest.q(CronetUrlRequest.this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
            try {
                cronetUrlRequest.f78750i.a(cronetUrlRequest, cronetUrlRequest.f78762u);
            } catch (Exception e11) {
                CronetUrlRequest.r(cronetUrlRequest, "onCanceled", e11);
            }
            CronetUrlRequest.q(cronetUrlRequest);
        }
    }

    /* loaded from: classes10.dex */
    final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener f78775a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f78776b;

        f(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i11) {
            this.f78775a = versionSafeCallbacks$UrlRequestStatusListener;
            this.f78776b = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            switch (this.f78776b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f78775a.getClass();
                    throw null;
                case 5:
                default:
                    throw new IllegalArgumentException("No request status found.");
            }
        }
    }

    /* loaded from: classes10.dex */
    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
            vf.c.c("CronetUrlRequest#onNativeAdapterDestroyed running callback");
            try {
                cronetUrlRequest.f78750i.b(cronetUrlRequest, cronetUrlRequest.f78762u, cronetUrlRequest.f78764w);
            } catch (Exception e11) {
                CronetUrlRequest.r(cronetUrlRequest, "onFailed", e11);
            }
            CronetUrlRequest.q(cronetUrlRequest);
        }
    }

    private final class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        ByteBuffer f78778a;

        h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CronetUrlRequest.this.v();
            ByteBuffer byteBuffer = this.f78778a;
            this.f78778a = null;
            try {
                synchronized (CronetUrlRequest.this.f78746e) {
                    try {
                        if (CronetUrlRequest.this.y()) {
                            return;
                        }
                        CronetUrlRequest.this.f78745d = true;
                        i0 i0Var = CronetUrlRequest.this.f78750i;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        i0Var.c(cronetUrlRequest, cronetUrlRequest.f78762u, byteBuffer);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                CronetUrlRequest.s(CronetUrlRequest.this, e11);
            }
        }
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i11, C.b bVar, Va.a aVar, boolean z11, g.d dVar, long j11, String str2, ArrayList arrayList, org.chromium.net.A a11, Va.a aVar2, @NonNull String str3) {
        ArrayList arrayList2 = new ArrayList();
        this.f78749h = arrayList2;
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(bVar, "Listener is required");
        Objects.requireNonNull(aVar, "Executor is required");
        Objects.requireNonNull(str3, "Dictionary ID is expect to be an empty string if not specified");
        this.f78747f = cronetUrlRequestContext;
        this.f78760s = cronetUrlRequestContext.h();
        this.f78751j = str;
        arrayList2.add(str);
        int i12 = 1;
        if (i11 != 0) {
            if (i11 == 1) {
                i12 = 2;
            } else if (i11 != 2) {
                i12 = 4;
                if (i11 == 4) {
                    i12 = 5;
                }
            } else {
                i12 = 3;
            }
        }
        this.f78752k = i12;
        this.f78750i = new i0(bVar);
        this.f78748g = aVar;
        this.f78756o = z11;
        this.f78757p = dVar != null ? new g0(dVar) : null;
        this.f78758q = str3;
        this.f78753l = 0;
        this.f78759r = j11;
        this.f78754m = str2;
        this.f78755n = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f78761t = a11 != null ? new CronetUploadDataStream(a11, aVar2, this) : null;
    }

    private void A(final Runnable runnable, final String str) {
        vf.c.c("CronetUrlRequest#postTaskToExecutor ".concat(str));
        try {
            this.f78748g.execute(new Runnable() { // from class: org.chromium.net.impl.N
                @Override // java.lang.Runnable
                public final void run() {
                    vf.c.c("CronetUrlRequest#postTaskToExecutor " + str + " running callback");
                    runnable.run();
                }
            });
        } catch (RejectedExecutionException e11) {
            int i11 = CronetUrlRequestContext.f78781r;
            org.chromium.base.j.b("CronetUrlRequestContext", "Exception posting task to executor", e11);
            x(new F("Exception posting task to executor", e11));
        }
    }

    private c0 B(int i11, String str, String[] strArr, boolean z11, String str2, String str3, long j11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < strArr.length; i12 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i12], strArr[i12 + 1]));
        }
        return new c0(new ArrayList(this.f78749h), i11, str, arrayList, z11, str2, str3, j11);
    }

    @CalledByNative
    private void onCanceled() {
        A(new e(), "onCanceled");
    }

    @CalledByNative
    private void onError(int i11, int i12, int i13, int i14, String str, long j11) {
        c0 c0Var = this.f78762u;
        if (c0Var != null) {
            c0Var.i(j11);
        }
        if (i11 == 10 || i13 != 0) {
            x(new Y(Nk.a.b("Exception in CronetUrlRequest: ", str), i11, i12, i13, i14));
            return;
        }
        switch (i11) {
            case 1:
                i11 = 1;
                break;
            case 2:
                i11 = 2;
                break;
            case 3:
                i11 = 3;
                break;
            case 4:
                i11 = 4;
                break;
            case 5:
                i11 = 5;
                break;
            case 6:
                i11 = 6;
                break;
            case 7:
                i11 = 7;
                break;
            case 8:
                i11 = 8;
                break;
            case 9:
                i11 = 9;
                break;
            case 10:
                i11 = 10;
                break;
            case 11:
                i11 = 11;
                break;
            default:
                int i15 = CronetUrlRequestContext.f78781r;
                org.chromium.base.j.a("CronetUrlRequestContext", "Unknown error code: " + i11);
                break;
        }
        x(new W(Nk.a.b("Exception in CronetUrlRequest: ", str), i11, i12));
    }

    @CalledByNative
    private void onMetricsCollected(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, boolean z11, long j25, long j26, boolean z12, boolean z13) {
        if (this.f78765x != null) {
            throw new IllegalStateException("Metrics collection should only happen once.");
        }
        this.f78765x = new L(j11, j12, j13, j14, j15, j16, j17, j18, j19, j23, j24, z11, j25, j26);
        this.f78766y = z12;
        this.f78767z = z13;
    }

    @CalledByNative
    private void onNativeAdapterDestroyed() {
        vf.c.c("CronetUrlRequest#onNativeAdapterDestroyed");
        synchronized (this.f78746e) {
            try {
                if (this.f78764w == null) {
                    return;
                }
                g gVar = new g();
                vf.c.c("CronetUrlRequest#onNativeAdapterDestroyed scheduling callback");
                try {
                    this.f78748g.execute(gVar);
                } catch (RejectedExecutionException e11) {
                    int i11 = CronetUrlRequestContext.f78781r;
                    org.chromium.base.j.b("CronetUrlRequestContext", "Exception posting task to executor", e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i11, int i12, int i13, long j11) {
        this.f78762u.i(j11);
        if (byteBuffer.position() != i12 || byteBuffer.limit() != i13) {
            x(new F("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.f78741D == null) {
            this.f78741D = new h();
        }
        h hVar = this.f78741D;
        hVar.f78778a = byteBuffer;
        A(hVar, "onReadCompleted");
    }

    @CalledByNative
    private void onRedirectReceived(String str, int i11, String str2, String[] strArr, boolean z11, String str3, String str4, long j11) {
        c0 B11 = B(i11, str2, strArr, z11, str3, str4, j11);
        this.f78749h.add(str);
        A(new b(this, B11, str), "onRedirectReceived");
    }

    @CalledByNative
    private void onResponseStarted(int i11, String str, String[] strArr, boolean z11, String str2, String str3, long j11) {
        this.f78762u = B(i11, str, strArr, z11, str2, str3, j11);
        A(new c(), "onResponseStarted");
    }

    @CalledByNative
    private void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i11) {
        A(new f(versionSafeCallbacks$UrlRequestStatusListener, i11), "onStatus");
    }

    @CalledByNative
    private void onSucceeded(long j11) {
        this.f78762u.i(j11);
        A(new d(), "onSucceeded");
    }

    static void q(CronetUrlRequest cronetUrlRequest) {
        CronetUrlRequestContext cronetUrlRequestContext = cronetUrlRequest.f78747f;
        Z z11 = new Z(new A10.c(cronetUrlRequest, 1));
        try {
            if (cronetUrlRequest.f78765x == null) {
                return;
            }
            try {
                cronetUrlRequest.f78760s.e(cronetUrlRequestContext.j(), cronetUrlRequest.u());
            } catch (RuntimeException e11) {
                int i11 = CronetUrlRequestContext.f78781r;
                org.chromium.base.j.b("CronetUrlRequestContext", "Error while trying to log CronetTrafficInfo: ", e11);
            }
            cronetUrlRequestContext.p(new a0(cronetUrlRequest.f78765x, cronetUrlRequest.f78763v, cronetUrlRequest.f78762u, cronetUrlRequest.f78764w), z11, cronetUrlRequest.f78757p);
        } finally {
            z11.a();
        }
    }

    static void r(CronetUrlRequest cronetUrlRequest, String str, Exception exc) {
        cronetUrlRequest.f78740C = true;
        int i11 = CronetUrlRequestContext.f78781r;
        org.chromium.base.j.b("CronetUrlRequestContext", "Exception in " + str + " method", exc);
    }

    static void s(CronetUrlRequest cronetUrlRequest, Exception exc) {
        cronetUrlRequest.f78739B++;
        C c11 = new C("Exception received from UrlRequest.Callback", exc);
        int i11 = CronetUrlRequestContext.f78781r;
        org.chromium.base.j.b("CronetUrlRequestContext", "Exception in CalledByNative method", exc);
        cronetUrlRequest.x(c11);
    }

    static void t(CronetUrlRequest cronetUrlRequest) {
        cronetUrlRequest.getClass();
        new T();
        internal.J.N.MabZ5m6r(cronetUrlRequest.f78742a, cronetUrlRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private I.e u() {
        Map<String, List<String>> map;
        String str;
        boolean z11;
        int i11;
        long j11;
        long max;
        long j12;
        long j13;
        long j14;
        long max2;
        I.e.a aVar;
        int i12;
        int b11;
        int i13;
        int i14;
        I.e.b bVar;
        c0 c0Var = this.f78762u;
        if (c0Var != null) {
            map = c0Var.a();
            str = this.f78762u.d();
            int b12 = this.f78762u.b();
            z11 = this.f78762u.h();
            i11 = b12;
        } else {
            map = Collections.EMPTY_MAP;
            str = "";
            z11 = false;
            i11 = 0;
        }
        String str2 = str;
        long longValue = this.f78765x.o().longValue();
        if (z11 && longValue == 0) {
            max = 0;
            j11 = 0;
        } else {
            List<Map.Entry<String, String>> list = this.f78755n;
            if (list == null) {
                j11 = 0;
            } else {
                j11 = 0;
                for (Map.Entry<String, String> entry : list) {
                    if (entry.getKey() != null) {
                        j11 += r13.length();
                    }
                    if (entry.getValue() != null) {
                        j11 += entry.getValue().length();
                    }
                }
            }
            max = Math.max(0L, longValue - j11);
        }
        long longValue2 = this.f78765x.m().longValue();
        if (z11 && longValue2 == 0) {
            j14 = max;
            max2 = 0;
            j12 = 0;
        } else {
            if (map == null) {
                j12 = 0;
            } else {
                j12 = 0;
                for (Map.Entry<String, List<String>> entry2 : map.entrySet()) {
                    if (entry2.getKey() != null) {
                        j13 = max;
                        j12 += r8.length();
                    } else {
                        j13 = max;
                    }
                    if (entry2.getValue() != null) {
                        while (entry2.getValue().iterator().hasNext()) {
                            j12 += r2.next().length();
                        }
                    }
                    max = j13;
                }
            }
            j14 = max;
            max2 = Math.max(0L, longValue2 - j12);
        }
        Duration ofSeconds = (this.f78765x.n() == null || this.f78765x.f() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.f78765x.f().getTime() - this.f78765x.n().getTime());
        Duration ofSeconds2 = (this.f78765x.n() == null || this.f78765x.e() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.f78765x.e().getTime() - this.f78765x.n().getTime());
        I.e.a aVar2 = I.e.a.UNKNOWN;
        org.chromium.net.f fVar = this.f78764w;
        if (fVar instanceof W) {
            i12 = ((W) fVar).f78895b;
            aVar = I.e.a.NETWORK;
        } else {
            if (fVar instanceof Y) {
                Y y11 = (Y) fVar;
                int d11 = y11.d();
                int e11 = y11.e();
                i12 = d11;
                b11 = y11.b();
                i13 = e11;
                aVar = I.e.a.NETWORK;
                boolean z12 = this.f78766y;
                boolean z13 = this.f78767z;
                i14 = this.f78763v;
                if (i14 != 0) {
                    bVar = I.e.b.SUCCEEDED;
                } else if (i14 == 1) {
                    bVar = I.e.b.ERROR;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException(Ej.b.a(i14, "Invalid finished reason while producing request terminal state: "));
                    }
                    bVar = I.e.b.CANCELLED;
                }
                int i15 = this.f78739B;
                int i16 = this.f78738A;
                CronetUploadDataStream cronetUploadDataStream = this.f78761t;
                return new I.e(j11, j14, j12, max2, i11, ofSeconds, ofSeconds2, str2, z12, z13, bVar, i15, i16, cronetUploadDataStream != null ? 0 : cronetUploadDataStream.q(), this.f78740C, Process.myUid(), i12, i13, b11, aVar, this.f78765x.i(), ImplVersion.getCronetVersion(), this.f78747f.i());
            }
            if (fVar != null) {
                aVar2 = I.e.a.OTHER;
            }
            aVar = aVar2;
            i12 = 0;
        }
        i13 = 0;
        b11 = 0;
        boolean z122 = this.f78766y;
        boolean z132 = this.f78767z;
        i14 = this.f78763v;
        if (i14 != 0) {
        }
        int i152 = this.f78739B;
        int i162 = this.f78738A;
        CronetUploadDataStream cronetUploadDataStream2 = this.f78761t;
        return new I.e(j11, j14, j12, max2, i11, ofSeconds, ofSeconds2, str2, z122, z132, bVar, i152, i162, cronetUploadDataStream2 != null ? 0 : cronetUploadDataStream2.q(), this.f78740C, Process.myUid(), i12, i13, b11, aVar, this.f78765x.i(), ImplVersion.getCronetVersion(), this.f78747f.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(int i11) {
        this.f78763v = i11;
        if (this.f78742a == 0) {
            return;
        }
        this.f78747f.m();
        new T();
        internal.J.N.M4znfYdB(this.f78742a, this, i11 == 2);
        this.f78742a = 0L;
    }

    private void x(org.chromium.net.f fVar) {
        synchronized (this.f78746e) {
            try {
                if (y()) {
                    return;
                }
                this.f78764w = fVar;
                w(1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        return this.f78743b && this.f78742a == 0;
    }

    @Override // org.chromium.net.C
    public final void a() {
        vf.c.c("CronetUrlRequest#cancel");
        synchronized (this.f78746e) {
            try {
                if (!y() && this.f78743b) {
                    w(2);
                }
            } finally {
            }
        }
    }

    @Override // org.chromium.net.C
    public final void b() {
        vf.c.c("CronetUrlRequest#followRedirect");
        synchronized (this.f78746e) {
            try {
                if (!this.f78744c) {
                    throw new IllegalStateException("No redirect to follow.");
                }
                this.f78744c = false;
                if (y()) {
                    return;
                }
                new T();
                internal.J.N.Mhp54Oqs(this.f78742a, this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.chromium.net.C
    public final boolean c() {
        boolean y11;
        synchronized (this.f78746e) {
            y11 = y();
        }
        return y11;
    }

    @Override // org.chromium.net.C
    public final void d(ByteBuffer byteBuffer) {
        Throwable th2;
        vf.c.c("CronetUrlRequest#read");
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        synchronized (this.f78746e) {
            try {
                try {
                    if (!this.f78745d) {
                        throw new IllegalStateException("Unexpected read attempt.");
                    }
                    this.f78745d = false;
                    if (y()) {
                        try {
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        new T();
                        if (internal.J.N.MfCxA8r3(this.f78742a, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                            this.f78738A++;
                        } else {
                            this.f78745d = true;
                            throw new IllegalArgumentException("Unable to call native read");
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // org.chromium.net.C
    public final void e() {
        vf.c.c("CronetUrlRequest#start");
        synchronized (this.f78746e) {
            try {
                synchronized (this.f78746e) {
                    if (this.f78743b || y()) {
                        throw new IllegalStateException("Request is already started.");
                    }
                }
                try {
                    new T();
                    boolean z11 = false;
                    this.f78742a = internal.J.N.MuOIsMvf(this, this.f78747f.k(), this.f78751j, this.f78752k, this.f78756o, false, false, 0, false, 0, this.f78753l, null, null, 0, 0, this.f78758q, this.f78759r);
                    this.f78747f.o();
                    new T();
                    if (!internal.J.N.M51RPBJe(this.f78742a, this, this.f78754m)) {
                        throw new IllegalArgumentException("Invalid http method " + this.f78754m);
                    }
                    for (Map.Entry<String, String> entry : this.f78755n) {
                        if (entry.getKey().equalsIgnoreCase("Content-Type") && !entry.getValue().isEmpty()) {
                            z11 = true;
                        }
                        new T();
                        if (!internal.J.N.MvHusd1J(this.f78742a, this, entry.getKey(), entry.getValue())) {
                            throw new IllegalArgumentException("Invalid header with headername: " + entry.getKey());
                        }
                    }
                    CronetUploadDataStream cronetUploadDataStream = this.f78761t;
                    if (cronetUploadDataStream == null) {
                        this.f78743b = true;
                        new T();
                        internal.J.N.MabZ5m6r(this.f78742a, this);
                    } else {
                        if (!z11) {
                            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                        }
                        this.f78743b = true;
                        cronetUploadDataStream.t(new a(), "CronetUrlRequest#start");
                    }
                } catch (RuntimeException e11) {
                    w(1);
                    this.f78747f.n();
                    throw e11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void v() {
        if (this.f78747f.l(Thread.currentThread())) {
            throw new org.chromium.net.n();
        }
    }

    final void z(Throwable th2) {
        C c11 = new C("Exception received from UploadDataProvider", th2);
        int i11 = CronetUrlRequestContext.f78781r;
        org.chromium.base.j.b("CronetUrlRequestContext", "Exception in upload method", th2);
        x(c11);
    }
}
