package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.concurrent.futures.b;
import b0.C5495a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import u.C9887a;
import v.E1;
import v.P1;
import v.S;
import x.C10571a;
import z.C10961s;
import z.C10964v;
import z.C10966x;
import z.C10967y;

/* loaded from: classes8.dex */
final class U0 implements W0 {

    /* renamed from: a, reason: collision with root package name */
    final Object f101084a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f101085b;

    /* renamed from: c, reason: collision with root package name */
    private final c f101086c;

    /* renamed from: d, reason: collision with root package name */
    E1.a f101087d;

    /* renamed from: e, reason: collision with root package name */
    E1 f101088e;

    /* renamed from: f, reason: collision with root package name */
    androidx.camera.core.impl.O0 f101089f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f101090g;

    /* renamed from: h, reason: collision with root package name */
    List<androidx.camera.core.impl.W> f101091h;

    /* renamed from: i, reason: collision with root package name */
    b f101092i;

    /* renamed from: j, reason: collision with root package name */
    com.google.common.util.concurrent.m<Void> f101093j;

    /* renamed from: k, reason: collision with root package name */
    b.a<Void> f101094k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    private HashMap f101095l;

    /* renamed from: m, reason: collision with root package name */
    private final C10964v f101096m;

    /* renamed from: n, reason: collision with root package name */
    private final C10967y f101097n;

    /* renamed from: o, reason: collision with root package name */
    private final C10961s f101098o;

    /* renamed from: p, reason: collision with root package name */
    private final x.c f101099p;

    /* renamed from: q, reason: collision with root package name */
    private final C10966x f101100q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f101101r;

    final class a implements I.c<Void> {
        a() {
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            synchronized (U0.this.f101084a) {
                try {
                    ((O1) U0.this.f101087d).w();
                    int ordinal = U0.this.f101092i.ordinal();
                    if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th2 instanceof CancellationException)) {
                        C.S.l("CaptureSession", "Opening session with fail " + U0.this.f101092i, th2);
                        U0.this.o();
                    }
                } finally {
                }
            }
        }

        @Override // I.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CLOSED;
        public static final b GET_SURFACE;
        public static final b INITIALIZED;
        public static final b OPENED;
        public static final b OPENING;
        public static final b RELEASED;
        public static final b RELEASING;
        public static final b UNINITIALIZED;

        static {
            b bVar = new b("UNINITIALIZED", 0);
            UNINITIALIZED = bVar;
            b bVar2 = new b("INITIALIZED", 1);
            INITIALIZED = bVar2;
            b bVar3 = new b("GET_SURFACE", 2);
            GET_SURFACE = bVar3;
            b bVar4 = new b("OPENING", 3);
            OPENING = bVar4;
            b bVar5 = new b("OPENED", 4);
            OPENED = bVar5;
            b bVar6 = new b("CLOSED", 5);
            CLOSED = bVar6;
            b bVar7 = new b("RELEASING", 6);
            RELEASING = bVar7;
            b bVar8 = new b("RELEASED", 7);
            RELEASED = bVar8;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    final class c extends E1.c {
        c() {
        }

        @Override // v.E1.c
        public final void k(@NonNull E1 e12) {
            synchronized (U0.this.f101084a) {
                try {
                    switch (U0.this.f101092i.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + U0.this.f101092i);
                        case 3:
                        case 5:
                        case 6:
                            U0.this.o();
                            break;
                        case 7:
                            C.S.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    C.S.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + U0.this.f101092i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.E1.c
        public final void l(@NonNull E1 e12) {
            synchronized (U0.this.f101084a) {
                try {
                    switch (U0.this.f101092i.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + U0.this.f101092i);
                        case 3:
                            U0 u02 = U0.this;
                            u02.f101092i = b.OPENED;
                            u02.f101088e = e12;
                            C.S.a("CaptureSession", "Attempting to send capture request onConfigured");
                            U0 u03 = U0.this;
                            u03.t(u03.f101089f);
                            U0.this.s();
                            break;
                        case 5:
                            U0.this.f101088e = e12;
                            break;
                        case 6:
                            ((O1) e12).close();
                            break;
                    }
                    C.S.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + U0.this.f101092i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.E1.c
        public final void m(@NonNull E1 e12) {
            synchronized (U0.this.f101084a) {
                try {
                    if (U0.this.f101092i.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + U0.this.f101092i);
                    }
                    C.S.a("CaptureSession", "CameraCaptureSession.onReady() " + U0.this.f101092i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // v.E1.c
        public final void n(@NonNull E1 e12) {
            synchronized (U0.this.f101084a) {
                try {
                    if (U0.this.f101092i == b.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + U0.this.f101092i);
                    }
                    C.S.a("CaptureSession", "onSessionFinished()");
                    U0.this.o();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    U0(@NonNull x.c cVar, boolean z11) {
        this(cVar, new androidx.camera.core.impl.I0(Collections.EMPTY_LIST), z11);
    }

    public static /* synthetic */ void i(U0 u02) {
        synchronized (u02.f101084a) {
            if (u02.f101085b.isEmpty()) {
                return;
            }
            try {
                u02.r(u02.f101085b);
            } finally {
                u02.f101085b.clear();
            }
        }
    }

    public static com.google.common.util.concurrent.m j(U0 u02, androidx.camera.core.impl.O0 o02, CameraDevice cameraDevice, List list) {
        synchronized (u02.f101084a) {
            try {
                int ordinal = u02.f101092i.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        u02.f101090g.clear();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            u02.f101090g.put(u02.f101091h.get(i11), (Surface) list.get(i11));
                        }
                        u02.f101092i = b.OPENING;
                        C.S.a("CaptureSession", "Opening capture session.");
                        P1 p12 = new P1(Arrays.asList(u02.f101086c, new P1.a(o02.l())));
                        C9887a c9887a = new C9887a(o02.f());
                        Q.a j11 = Q.a.j(o02.k());
                        HashMap hashMap = new HashMap();
                        if (u02.f101101r && Build.VERSION.SDK_INT >= 35) {
                            hashMap = n(q(o02.h()), u02.f101090g);
                        }
                        ArrayList arrayList = new ArrayList();
                        String str = (String) c9887a.s().c(C9887a.f99594M, null);
                        Iterator it = ((ArrayList) o02.h()).iterator();
                        while (it.hasNext()) {
                            O0.f fVar = (O0.f) it.next();
                            x.g gVar = (!u02.f101101r || Build.VERSION.SDK_INT < 35) ? null : (x.g) hashMap.get(fVar);
                            if (gVar == null) {
                                gVar = u02.p(fVar, u02.f101090g, str);
                                if (u02.f101095l.containsKey(fVar.f())) {
                                    gVar.h(((Long) u02.f101095l.get(fVar.f())).longValue());
                                }
                            }
                            arrayList.add(gVar);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            x.g gVar2 = (x.g) it2.next();
                            if (!arrayList2.contains(gVar2.d())) {
                                arrayList2.add(gVar2.d());
                                arrayList3.add(gVar2);
                            }
                        }
                        E1.a aVar = u02.f101087d;
                        int m11 = o02.m();
                        K1 k12 = (K1) aVar;
                        k12.f100962f = p12;
                        x.m mVar = new x.m(m11, arrayList3, k12.f100960d, new L1((O1) k12));
                        if (o02.p() == 5 && o02.g() != null) {
                            mVar.f(x.f.b(o02.g()));
                        }
                        try {
                            CaptureRequest d11 = A0.d(j11.h(), cameraDevice, u02.f101100q);
                            if (d11 != null) {
                                mVar.g(d11);
                            }
                            return ((O1) u02.f101087d).t(cameraDevice, mVar, u02.f101091h);
                        } catch (CameraAccessException e11) {
                            return I.k.f(e11);
                        }
                    }
                    if (ordinal != 4) {
                        return I.k.f(new CancellationException("openCaptureSession() not execute in state: " + u02.f101092i));
                    }
                }
                return I.k.f(new IllegalStateException("openCaptureSession() should not be possible in state: " + u02.f101092i));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static CameraCaptureSession.CaptureCallback m(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback aVar;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5111p abstractC5111p = (AbstractC5111p) it.next();
            if (abstractC5111p == null) {
                aVar = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Q0.a(abstractC5111p, arrayList2);
                aVar = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new S.a(arrayList2);
            }
            arrayList.add(aVar);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new S.a(arrayList);
    }

    @NonNull
    private static HashMap n(@NonNull HashMap hashMap, @NonNull HashMap hashMap2) {
        HashMap hashMap3 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (O0.f fVar : (List) hashMap.get(num)) {
                SurfaceUtil.a a11 = SurfaceUtil.a((Surface) hashMap2.get(fVar.f()));
                if (i11 == 0) {
                    i11 = a11.f38393a;
                }
                C5495a.b();
                int i12 = a11.f38394b;
                int i13 = a11.f38395c;
                String d11 = fVar.d();
                Objects.requireNonNull(d11);
                arrayList.add(u3.K.a(i12, i13, d11));
            }
            if (i11 == 0 || arrayList.isEmpty()) {
                StringBuilder f7 = P4.f.f(i11, "Skips to create instances for multi-resolution output. imageFormat: ", ", streamInfos size: ");
                f7.append(arrayList.size());
                C.S.c("CaptureSession", f7.toString());
            } else {
                List list = null;
                try {
                    list = (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, arrayList, Integer.valueOf(i11));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                    C.S.c("CaptureSession", "Failed to create instances for multi-resolution output, " + e11.getMessage());
                }
                if (list != null) {
                    for (O0.f fVar2 : (List) hashMap.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) list.remove(0);
                        outputConfiguration.addSurface((Surface) hashMap2.get(fVar2.f()));
                        hashMap3.put(fVar2, new x.g(outputConfiguration));
                    }
                }
            }
        }
        return hashMap3;
    }

    @NonNull
    private x.g p(@NonNull O0.f fVar, @NonNull HashMap hashMap, String str) {
        long j11;
        DynamicRangeProfiles d11;
        Surface surface = (Surface) hashMap.get(fVar.f());
        x2.i.e(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        x.g gVar = new x.g(fVar.g(), surface);
        if (str != null) {
            gVar.g(str);
        } else {
            gVar.g(fVar.d());
        }
        if (fVar.c() == 0) {
            gVar.f(1);
        } else if (fVar.c() == 1) {
            gVar.f(2);
        }
        if (!fVar.e().isEmpty()) {
            gVar.b();
            Iterator<androidx.camera.core.impl.W> it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) hashMap.get(it.next());
                x2.i.e(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                gVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (d11 = this.f101099p.d()) != null) {
            C.A b11 = fVar.b();
            Long a11 = C10571a.a(b11, d11);
            if (a11 != null) {
                j11 = a11.longValue();
                gVar.e(j11);
                return gVar;
            }
            C.S.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b11);
        }
        j11 = 1;
        gVar.e(j11);
        return gVar;
    }

    @NonNull
    private static HashMap q(@NonNull List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O0.f fVar = (O0.f) it.next();
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List list2 = (List) hashMap.get(Integer.valueOf(fVar.g()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(Integer.valueOf(fVar.g()), list2);
                }
                list2.add(fVar);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    @Override // v.W0
    public final void a(@NonNull HashMap hashMap) {
        synchronized (this.f101084a) {
            this.f101095l = hashMap;
        }
    }

    @Override // v.W0
    public final androidx.camera.core.impl.O0 b() {
        androidx.camera.core.impl.O0 o02;
        synchronized (this.f101084a) {
            o02 = this.f101089f;
        }
        return o02;
    }

    @Override // v.W0
    @NonNull
    public final com.google.common.util.concurrent.m<Void> c(@NonNull final androidx.camera.core.impl.O0 o02, @NonNull final CameraDevice cameraDevice, @NonNull E1.a aVar) {
        synchronized (this.f101084a) {
            try {
                if (this.f101092i.ordinal() != 1) {
                    C.S.c("CaptureSession", "Open not allowed in state: " + this.f101092i);
                    return I.k.f(new IllegalStateException("open() should not allow the state: " + this.f101092i));
                }
                this.f101092i = b.GET_SURFACE;
                ArrayList arrayList = new ArrayList(o02.o());
                this.f101091h = arrayList;
                this.f101087d = aVar;
                I.d b11 = I.d.b(((O1) aVar).v(arrayList));
                I.a aVar2 = new I.a() { // from class: v.S0
                    @Override // I.a, qc.o
                    public final com.google.common.util.concurrent.m apply(Object obj) {
                        androidx.camera.core.impl.O0 o03 = o02;
                        return U0.j(U0.this, o03, cameraDevice, (List) obj);
                    }
                };
                Executor executor = ((K1) this.f101087d).f100960d;
                b11.getClass();
                I.d dVar = (I.d) I.k.n(b11, aVar2, executor);
                I.k.b(dVar, new a(), ((K1) this.f101087d).f100960d);
                return I.k.i(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.W0
    public final void close() {
        synchronized (this.f101084a) {
            try {
                int ordinal = this.f101092i.ordinal();
                if (ordinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f101092i);
                }
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        x2.i.e(this.f101087d, "The Opener shouldn't null in state:" + this.f101092i);
                        ((O1) this.f101087d).w();
                    } else if (ordinal == 3 || ordinal == 4) {
                        x2.i.e(this.f101087d, "The Opener shouldn't null in state:" + this.f101092i);
                        ((O1) this.f101087d).w();
                        this.f101092i = b.CLOSED;
                        this.f101098o.d();
                        this.f101089f = null;
                    }
                }
                this.f101092i = b.RELEASED;
            } finally {
            }
        }
    }

    @Override // v.W0
    public final void d(androidx.camera.core.impl.O0 o02) {
        synchronized (this.f101084a) {
            try {
                switch (this.f101092i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f101092i);
                    case 1:
                    case 2:
                    case 3:
                        this.f101089f = o02;
                        break;
                    case 4:
                        this.f101089f = o02;
                        if (o02 != null) {
                            if (!this.f101090g.keySet().containsAll(o02.o())) {
                                C.S.c("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                C.S.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                t(this.f101089f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // v.W0
    public final void e(@NonNull List<androidx.camera.core.impl.Q> list) {
        synchronized (this.f101084a) {
            try {
                switch (this.f101092i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f101092i);
                    case 1:
                    case 2:
                    case 3:
                        this.f101085b.addAll(list);
                        break;
                    case 4:
                        this.f101085b.addAll(list);
                        s();
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // v.W0
    public final boolean f() {
        boolean z11;
        synchronized (this.f101084a) {
            try {
                b bVar = this.f101092i;
                z11 = bVar == b.OPENED || bVar == b.OPENING;
            } finally {
            }
        }
        return z11;
    }

    @Override // v.W0
    public final void g() {
        ArrayList<androidx.camera.core.impl.Q> arrayList;
        synchronized (this.f101084a) {
            try {
                if (this.f101085b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f101085b);
                    this.f101085b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.Q q11 : arrayList) {
                Iterator<AbstractC5111p> it = q11.b().iterator();
                while (it.hasNext()) {
                    it.next().a(q11.e());
                }
            }
        }
    }

    @Override // v.W0
    @NonNull
    public final List<androidx.camera.core.impl.Q> h() {
        List<androidx.camera.core.impl.Q> unmodifiableList;
        synchronized (this.f101084a) {
            unmodifiableList = Collections.unmodifiableList(this.f101085b);
        }
        return unmodifiableList;
    }

    final void k() {
        synchronized (this.f101084a) {
            if (this.f101092i != b.OPENED) {
                C.S.c("CaptureSession", "Unable to abort captures. Incorrect state:" + this.f101092i);
            } else {
                try {
                    this.f101088e.d();
                } catch (CameraAccessException e11) {
                    C.S.d("CaptureSession", "Unable to abort captures.", e11);
                }
            }
        }
    }

    final void o() {
        b bVar = this.f101092i;
        b bVar2 = b.RELEASED;
        if (bVar == bVar2) {
            C.S.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f101092i = bVar2;
        this.f101088e = null;
        b.a<Void> aVar = this.f101094k;
        if (aVar != null) {
            aVar.c(null);
            this.f101094k = null;
        }
    }

    final int r(ArrayList arrayList) {
        H0 h02;
        ArrayList arrayList2;
        boolean z11;
        synchronized (this.f101084a) {
            try {
                if (this.f101092i != b.OPENED) {
                    C.S.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (arrayList.isEmpty()) {
                    return -1;
                }
                try {
                    h02 = new H0();
                    arrayList2 = new ArrayList();
                    C.S.a("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    z11 = false;
                    while (it.hasNext()) {
                        androidx.camera.core.impl.Q q11 = (androidx.camera.core.impl.Q) it.next();
                        if (q11.h().isEmpty()) {
                            C.S.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator<androidx.camera.core.impl.W> it2 = q11.h().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    androidx.camera.core.impl.W next = it2.next();
                                    if (!this.f101090g.containsKey(next)) {
                                        C.S.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                        break;
                                    }
                                } else {
                                    if (q11.j() == 2) {
                                        z11 = true;
                                    }
                                    Q.a j11 = Q.a.j(q11);
                                    if (q11.j() == 5 && q11.c() != null) {
                                        j11.o(q11.c());
                                    }
                                    androidx.camera.core.impl.O0 o02 = this.f101089f;
                                    if (o02 != null) {
                                        j11.e(o02.k().f());
                                    }
                                    j11.e(q11.f());
                                    CaptureRequest c11 = A0.c(j11.h(), ((K1) this.f101088e).r(), this.f101090g, false, this.f101100q);
                                    if (c11 == null) {
                                        C.S.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator<AbstractC5111p> it3 = q11.b().iterator();
                                    while (it3.hasNext()) {
                                        Q0.a(it3.next(), arrayList3);
                                    }
                                    h02.a(c11, arrayList3);
                                    arrayList2.add(c11);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e11) {
                    C.S.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    C.S.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f101096m.a(arrayList2, z11)) {
                    ((K1) this.f101088e).a();
                    h02.f100943b = new T0(this);
                }
                if (this.f101097n.b(arrayList2, z11)) {
                    h02.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new V0(this)));
                }
                return ((O1) this.f101088e).y(arrayList2, h02);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.W0
    @NonNull
    public final com.google.common.util.concurrent.m release() {
        synchronized (this.f101084a) {
            try {
                switch (this.f101092i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("release() should not be possible in state: " + this.f101092i);
                    case 2:
                        x2.i.e(this.f101087d, "The Opener shouldn't null in state:" + this.f101092i);
                        ((O1) this.f101087d).w();
                    case 1:
                        this.f101092i = b.RELEASED;
                        return I.k.h(null);
                    case 4:
                    case 5:
                        E1 e12 = this.f101088e;
                        if (e12 != null) {
                            ((O1) e12).close();
                        }
                    case 3:
                        this.f101092i = b.RELEASING;
                        this.f101098o.d();
                        x2.i.e(this.f101087d, "The Opener shouldn't null in state:" + this.f101092i);
                        if (((O1) this.f101087d).w()) {
                            o();
                            return I.k.h(null);
                        }
                    case 6:
                        if (this.f101093j == null) {
                            this.f101093j = androidx.concurrent.futures.b.a(new b.c() { // from class: v.R0
                                @Override // androidx.concurrent.futures.b.c
                                public final Object c(b.a aVar) {
                                    String str;
                                    U0 u02 = U0.this;
                                    synchronized (u02.f101084a) {
                                        x2.i.f("Release completer expected to be null", u02.f101094k == null);
                                        u02.f101094k = aVar;
                                        str = "Release[session=" + u02 + "]";
                                    }
                                    return str;
                                }
                            });
                        }
                        return this.f101093j;
                    default:
                        return I.k.h(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void s() {
        this.f101098o.c().a(new RunnableC10071B(this, 1), H.c.b());
    }

    final int t(androidx.camera.core.impl.O0 o02) {
        synchronized (this.f101084a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (o02 == null) {
                C.S.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f101092i != b.OPENED) {
                C.S.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            androidx.camera.core.impl.Q k11 = o02.k();
            if (k11.h().isEmpty()) {
                C.S.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    ((K1) this.f101088e).a();
                } catch (CameraAccessException e11) {
                    C.S.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C.S.a("CaptureSession", "Issuing request for session.");
                CaptureRequest c11 = A0.c(k11, ((K1) this.f101088e).r(), this.f101090g, true, this.f101100q);
                if (c11 == null) {
                    C.S.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return ((O1) this.f101088e).A(c11, this.f101098o.b(m(k11.b(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e12) {
                C.S.c("CaptureSession", "Unable to access camera: " + e12.getMessage());
                Thread.dumpStack();
            }
            throw th2;
        }
    }

    final void u() {
        synchronized (this.f101084a) {
            if (this.f101092i != b.OPENED) {
                C.S.c("CaptureSession", "Unable to stop repeating. Incorrect state:" + this.f101092i);
            } else {
                try {
                    this.f101088e.a();
                } catch (CameraAccessException e11) {
                    C.S.d("CaptureSession", "Unable to stop repeating.", e11);
                }
            }
        }
    }

    U0(@NonNull x.c cVar, @NonNull androidx.camera.core.impl.I0 i02, boolean z11) {
        this.f101084a = new Object();
        this.f101085b = new ArrayList();
        this.f101090g = new HashMap();
        this.f101091h = Collections.EMPTY_LIST;
        this.f101092i = b.UNINITIALIZED;
        this.f101095l = new HashMap();
        this.f101096m = new C10964v();
        this.f101097n = new C10967y();
        this.f101092i = b.INITIALIZED;
        this.f101099p = cVar;
        this.f101086c = new c();
        this.f101098o = new C10961s(i02.a(CaptureNoResponseQuirk.class));
        this.f101100q = new C10966x(i02);
        this.f101101r = z11;
    }
}
