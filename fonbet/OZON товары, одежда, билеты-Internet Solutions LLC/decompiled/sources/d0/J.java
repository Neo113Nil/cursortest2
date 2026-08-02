package d0;

import B90.C2600b;
import B90.C2618u;
import B90.d0;
import B90.g0;
import W.o0;
import Y.c;
import aM.RunnableC4975a;
import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.core.impl.Y0;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.concurrent.futures.b;
import d0.InterfaceC5999j;
import d0.J;
import e0.C6244a;
import f0.C6394e;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class J implements InterfaceC5999j {

    /* renamed from: E, reason: collision with root package name */
    private static final Range<Long> f60789E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: D, reason: collision with root package name */
    private ScheduledFuture f60793D;

    /* renamed from: a, reason: collision with root package name */
    final String f60794a;

    /* renamed from: c, reason: collision with root package name */
    final boolean f60796c;

    /* renamed from: d, reason: collision with root package name */
    private final MediaFormat f60797d;

    /* renamed from: e, reason: collision with root package name */
    final MediaCodec f60798e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC5999j.b f60799f;

    /* renamed from: g, reason: collision with root package name */
    private final Q f60800g;

    /* renamed from: h, reason: collision with root package name */
    final Executor f60801h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f60802i;

    /* renamed from: j, reason: collision with root package name */
    private final b.a<Void> f60803j;

    /* renamed from: p, reason: collision with root package name */
    final Y0 f60809p;

    /* renamed from: t, reason: collision with root package name */
    b f60813t;

    /* renamed from: b, reason: collision with root package name */
    final Object f60795b = new Object();

    /* renamed from: k, reason: collision with root package name */
    final ArrayDeque f60804k = new ArrayDeque();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayDeque f60805l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    private final HashSet f60806m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    final HashSet f60807n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    final ArrayDeque f60808o = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    final Z.r f60810q = new Z.r();

    /* renamed from: r, reason: collision with root package name */
    InterfaceC6000k f60811r = InterfaceC6000k.f60919a;

    /* renamed from: s, reason: collision with root package name */
    Executor f60812s = H.c.b();

    /* renamed from: u, reason: collision with root package name */
    Range<Long> f60814u = f60789E;

    /* renamed from: v, reason: collision with root package name */
    long f60815v = 0;

    /* renamed from: w, reason: collision with root package name */
    boolean f60816w = false;

    /* renamed from: x, reason: collision with root package name */
    Long f60817x = null;

    /* renamed from: y, reason: collision with root package name */
    ScheduledFuture f60818y = null;

    /* renamed from: z, reason: collision with root package name */
    private c f60819z = null;

    /* renamed from: A, reason: collision with root package name */
    private boolean f60790A = false;

    /* renamed from: B, reason: collision with root package name */
    private boolean f60791B = false;

    /* renamed from: C, reason: collision with root package name */
    boolean f60792C = false;

    class a implements InterfaceC5999j.a {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedHashMap f60820a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        private c.a f60821b = c.a.INACTIVE;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f60822c = new ArrayList();

        a() {
        }

        public static void g(a aVar, InterfaceC5129y0.a aVar2, Executor executor) {
            LinkedHashMap linkedHashMap = aVar.f60820a;
            aVar2.getClass();
            executor.getClass();
            linkedHashMap.put(aVar2, executor);
            executor.execute(new M2.c(2, aVar2, aVar.f60821b));
        }

        public static void h(a aVar, InterfaceC5129y0.a aVar2) {
            LinkedHashMap linkedHashMap = aVar.f60820a;
            aVar2.getClass();
            linkedHashMap.remove(aVar2);
        }

        public static /* synthetic */ void j(final a aVar, b.a aVar2) {
            c.a aVar3 = aVar.f60821b;
            if (aVar3 == c.a.ACTIVE) {
                J j11 = J.this;
                final com.google.common.util.concurrent.m<S> o11 = j11.o();
                I.k.j(aVar2, o11);
                aVar2.a(new Runnable() { // from class: d0.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.a aVar4 = J.a.this;
                        aVar4.getClass();
                        com.google.common.util.concurrent.m mVar = o11;
                        if (mVar.cancel(true)) {
                            return;
                        }
                        x2.i.f(null, mVar.isDone());
                        try {
                            ((S) mVar.get()).cancel();
                        } catch (InterruptedException | CancellationException | ExecutionException e11) {
                            C.S.k(J.this.f60794a, "Unable to cancel the input buffer: " + e11);
                        }
                    }
                }, H.c.b());
                aVar.f60822c.add(o11);
                o11.a(new Runnable() { // from class: d0.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.a.this.f60822c.remove(o11);
                    }
                }, j11.f60801h);
                return;
            }
            if (aVar3 == c.a.INACTIVE) {
                aVar2.e(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar2.e(new IllegalStateException("Unknown state: " + aVar.f60821b));
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0
        @NonNull
        public final com.google.common.util.concurrent.m<c.a> b() {
            return androidx.concurrent.futures.b.a(new b.c() { // from class: d0.B
                @Override // androidx.concurrent.futures.b.c
                public final Object c(final b.a aVar) {
                    final J.a aVar2 = J.a.this;
                    J.this.f60801h.execute(new Runnable() { // from class: d0.E
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVar.c(J.a.this.f60821b);
                        }
                    });
                    return "fetchData";
                }
            });
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0
        public final void c(@NonNull final Executor executor, @NonNull final InterfaceC5129y0.a<? super c.a> aVar) {
            J.this.f60801h.execute(new Runnable() { // from class: d0.C
                @Override // java.lang.Runnable
                public final void run() {
                    J.a.g(J.a.this, aVar, executor);
                }
            });
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0
        public final void d(@NonNull final InterfaceC5129y0.a<? super c.a> aVar) {
            J.this.f60801h.execute(new Runnable() { // from class: d0.F
                @Override // java.lang.Runnable
                public final void run() {
                    J.a.h(J.a.this, aVar);
                }
            });
        }

        @Override // Y.c
        @NonNull
        public final com.google.common.util.concurrent.m<S> e() {
            return androidx.concurrent.futures.b.a(new b.c() { // from class: d0.D
                @Override // androidx.concurrent.futures.b.c
                public final Object c(final b.a aVar) {
                    final J.a aVar2 = J.a.this;
                    J.this.f60801h.execute(new Runnable() { // from class: d0.G
                        @Override // java.lang.Runnable
                        public final void run() {
                            J.a.j(J.a.this, aVar);
                        }
                    });
                    return "acquireBuffer";
                }
            });
        }

        final void k(boolean z11) {
            c.a aVar = z11 ? c.a.ACTIVE : c.a.INACTIVE;
            if (this.f60821b == aVar) {
                return;
            }
            this.f60821b = aVar;
            if (aVar == c.a.INACTIVE) {
                ArrayList arrayList = this.f60822c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.google.common.util.concurrent.m) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.f60820a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new L2.c(4, entry, aVar));
                } catch (RejectedExecutionException e11) {
                    C.S.d(J.this.f60794a, "Unable to post to the supplied executor.", e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CONFIGURED;
        public static final b ERROR;
        public static final b PAUSED;
        public static final b PENDING_RELEASE;
        public static final b PENDING_START;
        public static final b PENDING_START_PAUSED;
        public static final b RELEASED;
        public static final b STARTED;
        public static final b STOPPING;

        static {
            b bVar = new b("CONFIGURED", 0);
            CONFIGURED = bVar;
            b bVar2 = new b("STARTED", 1);
            STARTED = bVar2;
            b bVar3 = new b("PAUSED", 2);
            PAUSED = bVar3;
            b bVar4 = new b("STOPPING", 3);
            STOPPING = bVar4;
            b bVar5 = new b("PENDING_START", 4);
            PENDING_START = bVar5;
            b bVar6 = new b("PENDING_START_PAUSED", 5);
            PENDING_START_PAUSED = bVar6;
            b bVar7 = new b("PENDING_RELEASE", 6);
            PENDING_RELEASE = bVar7;
            b bVar8 = new b("ERROR", 7);
            ERROR = bVar8;
            b bVar9 = new b("RELEASED", 8);
            RELEASED = bVar9;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
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

    class c extends MediaCodec.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final C6394e f60824a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f60825b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f60826c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f60827d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f60828e = false;

        /* renamed from: f, reason: collision with root package name */
        private long f60829f = 0;

        /* renamed from: g, reason: collision with root package name */
        private long f60830g = 0;

        /* renamed from: h, reason: collision with root package name */
        private boolean f60831h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f60832i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f60833j = false;

        final class a implements I.c<Void> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5998i f60835a;

            a(C5998i c5998i) {
                this.f60835a = c5998i;
            }

            @Override // I.c
            public final void onFailure(@NonNull Throwable th2) {
                c cVar = c.this;
                J.this.f60807n.remove(this.f60835a);
                boolean z11 = th2 instanceof MediaCodec.CodecException;
                J j11 = J.this;
                if (!z11) {
                    j11.s(0, th2.getMessage(), th2);
                    return;
                }
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th2;
                j11.getClass();
                j11.s(1, codecException.getMessage(), codecException);
            }

            @Override // I.c
            public final void onSuccess(Void r22) {
                J.this.f60807n.remove(this.f60835a);
            }
        }

        c() {
            this.f60825b = true;
            if (J.this.f60796c) {
                this.f60824a = new C6394e(J.this.f60810q, J.this.f60809p, (CameraUseInconsistentTimebaseQuirk) androidx.camera.video.internal.compat.quirk.a.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f60824a = null;
            }
            if (((CodecStuckOnFlushQuirk) androidx.camera.video.internal.compat.quirk.a.b(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(J.this.f60797d.getString("mime"))) {
                return;
            }
            this.f60825b = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0211 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0325  */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0181 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(c cVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i11) {
            InterfaceC6000k interfaceC6000k;
            Executor executor;
            boolean z11;
            boolean z12;
            MediaCodec.BufferInfo bufferInfo2;
            Executor executor2;
            InterfaceC6000k interfaceC6000k2;
            if (cVar.f60833j) {
                C.S.k(J.this.f60794a, "Receives frame after codec is reset.");
                return;
            }
            switch (J.this.f60813t.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    synchronized (J.this.f60795b) {
                        J j11 = J.this;
                        interfaceC6000k = j11.f60811r;
                        executor = j11.f60812s;
                    }
                    if (!cVar.f60826c) {
                        cVar.f60826c = true;
                        try {
                            Objects.requireNonNull(interfaceC6000k);
                            executor.execute(new L3.p(interfaceC6000k, 2));
                        } catch (RejectedExecutionException e11) {
                            C.S.d(J.this.f60794a, "Unable to post to the supplied executor.", e11);
                        }
                    }
                    try {
                        if (cVar.f60828e) {
                            C.S.a(J.this.f60794a, "Drop buffer by already reach end of stream.");
                        } else if (bufferInfo.size <= 0) {
                            C.S.a(J.this.f60794a, "Drop buffer by invalid buffer size.");
                        } else if ((bufferInfo.flags & 2) != 0) {
                            C.S.a(J.this.f60794a, "Drop buffer by codec config.");
                        } else {
                            C6394e c6394e = cVar.f60824a;
                            if (c6394e != null) {
                                bufferInfo.presentationTimeUs = c6394e.a(bufferInfo.presentationTimeUs);
                            }
                            long j12 = bufferInfo.presentationTimeUs;
                            if (j12 <= cVar.f60829f) {
                                C.S.a(J.this.f60794a, "Drop buffer by out of order buffer from MediaCodec.");
                            } else {
                                cVar.f60829f = j12;
                                if (J.this.f60814u.contains((Range<Long>) Long.valueOf(j12))) {
                                    J j13 = J.this;
                                    long j14 = bufferInfo.presentationTimeUs;
                                    while (true) {
                                        ArrayDeque arrayDeque = j13.f60808o;
                                        if (!arrayDeque.isEmpty()) {
                                            Range range = (Range) arrayDeque.getFirst();
                                            if (j14 > ((Long) range.getUpper()).longValue()) {
                                                arrayDeque.removeFirst();
                                                long longValue = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + j13.f60815v;
                                                j13.f60815v = longValue;
                                                C.S.a(j13.f60794a, "Total paused duration = ".concat(Y.d.a(longValue)));
                                            }
                                        }
                                    }
                                    J j15 = J.this;
                                    long j16 = bufferInfo.presentationTimeUs;
                                    Iterator it = j15.f60808o.iterator();
                                    while (it.hasNext()) {
                                        Range range2 = (Range) it.next();
                                        if (range2.contains((Range) Long.valueOf(j16))) {
                                            z11 = true;
                                            z12 = cVar.f60831h;
                                            if (z12 && z11) {
                                                C.S.a(J.this.f60794a, "Switch to pause state");
                                                cVar.f60831h = true;
                                                synchronized (J.this.f60795b) {
                                                    J j17 = J.this;
                                                    executor2 = j17.f60812s;
                                                    interfaceC6000k2 = j17.f60811r;
                                                }
                                                Objects.requireNonNull(interfaceC6000k2);
                                                executor2.execute(new L3.p(interfaceC6000k2, 2));
                                                J j18 = J.this;
                                                if (j18.f60813t == b.PAUSED && ((j18.f60796c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!J.this.f60796c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                                                    InterfaceC5999j.b bVar = J.this.f60799f;
                                                    if (bVar instanceof a) {
                                                        ((a) bVar).k(false);
                                                    }
                                                    J j19 = J.this;
                                                    j19.getClass();
                                                    Bundle bundle = new Bundle();
                                                    bundle.putInt("drop-input-frames", 1);
                                                    j19.f60798e.setParameters(bundle);
                                                }
                                                J.this.f60817x = Long.valueOf(bufferInfo.presentationTimeUs);
                                                J j21 = J.this;
                                                if (j21.f60816w) {
                                                    ScheduledFuture scheduledFuture = j21.f60818y;
                                                    if (scheduledFuture != null) {
                                                        scheduledFuture.cancel(true);
                                                    }
                                                    J.this.A();
                                                    J.this.f60816w = false;
                                                }
                                            } else if (z12 && !z11) {
                                                C.S.a(J.this.f60794a, "Switch to resume state");
                                                cVar.f60831h = false;
                                                if (J.this.f60796c && (bufferInfo.flags & 1) == 0) {
                                                    cVar.f60832i = true;
                                                }
                                            }
                                            if (cVar.f60831h) {
                                                C.S.a(J.this.f60794a, "Drop buffer by pause.");
                                            } else {
                                                J j22 = J.this;
                                                long j23 = j22.f60815v;
                                                if ((j23 > 0 ? bufferInfo.presentationTimeUs - j23 : bufferInfo.presentationTimeUs) > cVar.f60830g) {
                                                    boolean z13 = cVar.f60827d;
                                                    if (!z13 && !cVar.f60832i && j22.f60796c) {
                                                        cVar.f60832i = true;
                                                    }
                                                    if (cVar.f60832i) {
                                                        if ((bufferInfo.flags & 1) != 0) {
                                                            cVar.f60832i = false;
                                                        } else {
                                                            C.S.a(j22.f60794a, "Drop buffer by not a key frame.");
                                                            J.this.x();
                                                        }
                                                    }
                                                    if (!z13) {
                                                        cVar.f60827d = true;
                                                        C.S.a(j22.f60794a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + J.this.f60809p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                                                    }
                                                    long j24 = J.this.f60815v;
                                                    long j25 = j24 > 0 ? bufferInfo.presentationTimeUs - j24 : bufferInfo.presentationTimeUs;
                                                    if (bufferInfo.presentationTimeUs == j25) {
                                                        bufferInfo2 = bufferInfo;
                                                    } else {
                                                        x2.i.f(null, j25 > cVar.f60830g);
                                                        bufferInfo2 = new MediaCodec.BufferInfo();
                                                        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j25, bufferInfo.flags);
                                                    }
                                                    cVar.f60830g = bufferInfo2.presentationTimeUs;
                                                    try {
                                                        cVar.e(new C5998i(mediaCodec, i11, bufferInfo2), interfaceC6000k, executor);
                                                        if (cVar.f60828e) {
                                                            if ((bufferInfo.flags & 4) == 0) {
                                                                if (!cVar.f60825b) {
                                                                    return;
                                                                }
                                                                J j26 = J.this;
                                                                if (!j26.f60792C || bufferInfo.presentationTimeUs <= j26.f60814u.getUpper().longValue()) {
                                                                    return;
                                                                }
                                                            }
                                                            cVar.d();
                                                            return;
                                                        }
                                                        return;
                                                    } catch (MediaCodec.CodecException e12) {
                                                        J j27 = J.this;
                                                        j27.getClass();
                                                        j27.s(1, e12.getMessage(), e12);
                                                        return;
                                                    }
                                                }
                                                C.S.a(j22.f60794a, "Drop buffer by adjusted time is less than the last sent time.");
                                                if (J.this.f60796c && (bufferInfo.flags & 1) != 0) {
                                                    cVar.f60832i = true;
                                                }
                                            }
                                        } else if (j16 < ((Long) range2.getLower()).longValue()) {
                                            z11 = false;
                                            z12 = cVar.f60831h;
                                            if (z12) {
                                            }
                                            if (z12) {
                                                C.S.a(J.this.f60794a, "Switch to resume state");
                                                cVar.f60831h = false;
                                                if (J.this.f60796c) {
                                                    cVar.f60832i = true;
                                                }
                                            }
                                            if (cVar.f60831h) {
                                            }
                                        }
                                    }
                                    z11 = false;
                                    z12 = cVar.f60831h;
                                    if (z12) {
                                    }
                                    if (z12) {
                                    }
                                    if (cVar.f60831h) {
                                    }
                                } else {
                                    C.S.a(J.this.f60794a, "Drop buffer by not in start-stop range.");
                                    J j28 = J.this;
                                    if (j28.f60816w && bufferInfo.presentationTimeUs >= j28.f60814u.getUpper().longValue()) {
                                        ScheduledFuture scheduledFuture2 = J.this.f60818y;
                                        if (scheduledFuture2 != null) {
                                            scheduledFuture2.cancel(true);
                                        }
                                        J.this.f60817x = Long.valueOf(bufferInfo.presentationTimeUs);
                                        J.this.A();
                                        J.this.f60816w = false;
                                    }
                                }
                            }
                        }
                        J.this.f60798e.releaseOutputBuffer(i11, false);
                        if (cVar.f60828e) {
                        }
                    } catch (MediaCodec.CodecException e13) {
                        J j29 = J.this;
                        j29.getClass();
                        j29.s(1, e13.getMessage(), e13);
                        return;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown state: " + J.this.f60813t);
            }
        }

        public static /* synthetic */ void b(c cVar, MediaFormat mediaFormat) {
            InterfaceC6000k interfaceC6000k;
            Executor executor;
            if (cVar.f60833j) {
                C.S.k(J.this.f60794a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (J.this.f60813t.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    synchronized (J.this.f60795b) {
                        J j11 = J.this;
                        interfaceC6000k = j11.f60811r;
                        executor = j11.f60812s;
                    }
                    try {
                        executor.execute(new Z.f(1, interfaceC6000k, mediaFormat));
                        return;
                    } catch (RejectedExecutionException e11) {
                        C.S.d(J.this.f60794a, "Unable to post to the supplied executor.", e11);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + J.this.f60813t);
            }
        }

        public static /* synthetic */ void c(c cVar, int i11) {
            boolean z11 = cVar.f60833j;
            J j11 = J.this;
            if (z11) {
                C.S.k(j11.f60794a, "Receives input frame after codec is reset.");
                return;
            }
            switch (j11.f60813t.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    j11.f60804k.offer(Integer.valueOf(i11));
                    j11.t();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + j11.f60813t);
            }
        }

        private void e(@NonNull C5998i c5998i, @NonNull InterfaceC6000k interfaceC6000k, @NonNull Executor executor) {
            J j11 = J.this;
            j11.f60807n.add(c5998i);
            I.k.b(c5998i.c(), new a(c5998i), j11.f60801h);
            try {
                executor.execute(new P(0, interfaceC6000k, c5998i));
            } catch (RejectedExecutionException e11) {
                C.S.d(j11.f60794a, "Unable to post to the supplied executor.", e11);
                c5998i.close();
            }
        }

        final void d() {
            J j11;
            final InterfaceC6000k interfaceC6000k;
            final Executor executor;
            if (this.f60828e) {
                return;
            }
            this.f60828e = true;
            if (J.this.f60793D != null) {
                J.this.f60793D.cancel(false);
                J.this.f60793D = null;
            }
            synchronized (J.this.f60795b) {
                j11 = J.this;
                interfaceC6000k = j11.f60811r;
                executor = j11.f60812s;
            }
            j11.C(new Runnable() { // from class: d0.O
                @Override // java.lang.Runnable
                public final void run() {
                    Executor executor2 = executor;
                    InterfaceC6000k interfaceC6000k2 = interfaceC6000k;
                    J j12 = J.this;
                    if (j12.f60813t == J.b.ERROR) {
                        return;
                    }
                    try {
                        Objects.requireNonNull(interfaceC6000k2);
                        executor2.execute(new Ec0.b(interfaceC6000k2, 5));
                    } catch (RejectedExecutionException e11) {
                        C.S.d(j12.f60794a, "Unable to post to the supplied executor.", e11);
                    }
                }
            });
        }

        final void f() {
            this.f60833j = true;
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(@NonNull MediaCodec mediaCodec, @NonNull final MediaCodec.CodecException codecException) {
            J.this.f60801h.execute(new Runnable() { // from class: d0.M
                @Override // java.lang.Runnable
                public final void run() {
                    J j11 = J.this;
                    switch (j11.f60813t.ordinal()) {
                        case 0:
                        case 7:
                        case 8:
                            return;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            MediaCodec.CodecException codecException2 = codecException;
                            j11.s(1, codecException2.getMessage(), codecException2);
                            return;
                        default:
                            throw new IllegalStateException("Unknown state: " + j11.f60813t);
                    }
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(@NonNull MediaCodec mediaCodec, final int i11) {
            J.this.f60801h.execute(new Runnable() { // from class: d0.K
                @Override // java.lang.Runnable
                public final void run() {
                    J.c.c(J.c.this, i11);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(@NonNull final MediaCodec mediaCodec, final int i11, @NonNull final MediaCodec.BufferInfo bufferInfo) {
            J.this.f60801h.execute(new Runnable() { // from class: d0.L
                @Override // java.lang.Runnable
                public final void run() {
                    J.c.a(J.c.this, bufferInfo, mediaCodec, i11);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(@NonNull MediaCodec mediaCodec, @NonNull final MediaFormat mediaFormat) {
            J.this.f60801h.execute(new Runnable() { // from class: d0.N
                @Override // java.lang.Runnable
                public final void run() {
                    J.c.b(J.c.this, mediaFormat);
                }
            });
        }
    }

    class d implements InterfaceC5999j.c {

        /* renamed from: b, reason: collision with root package name */
        private Surface f60838b;

        /* renamed from: d, reason: collision with root package name */
        private o0 f60840d;

        /* renamed from: e, reason: collision with root package name */
        private Executor f60841e;

        /* renamed from: a, reason: collision with root package name */
        private final Object f60837a = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final HashSet f60839c = new HashSet();

        d() {
        }

        @Override // d0.InterfaceC5999j.c
        public final void a(@NonNull Executor executor, @NonNull o0 o0Var) {
            Surface surface;
            synchronized (this.f60837a) {
                this.f60840d = o0Var;
                executor.getClass();
                this.f60841e = executor;
                surface = this.f60838b;
            }
            if (surface != null) {
                try {
                    executor.execute(new Cm.c(4, o0Var, surface));
                } catch (RejectedExecutionException e11) {
                    C.S.d(J.this.f60794a, "Unable to post to the supplied executor.", e11);
                }
            }
        }

        final void b() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f60837a) {
                surface = this.f60838b;
                this.f60838b = null;
                hashSet = new HashSet(this.f60839c);
                this.f60839c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        @SuppressLint({"NewApi"})
        final void c() {
            Surface createInputSurface;
            o0 o0Var;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f60837a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.f60838b == null) {
                            createInputSurface = MediaCodec.createPersistentInputSurface();
                            this.f60838b = createInputSurface;
                        } else {
                            createInputSurface = null;
                        }
                        J.this.f60798e.setInputSurface(this.f60838b);
                    } else {
                        Surface surface = this.f60838b;
                        if (surface != null) {
                            this.f60839c.add(surface);
                        }
                        createInputSurface = J.this.f60798e.createInputSurface();
                        this.f60838b = createInputSurface;
                    }
                    o0Var = this.f60840d;
                    executor = this.f60841e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (createInputSurface == null || o0Var == null || executor == null) {
                return;
            }
            try {
                executor.execute(new Cm.c(4, o0Var, createInputSurface));
            } catch (RejectedExecutionException e11) {
                C.S.d(J.this.f60794a, "Unable to post to the supplied executor.", e11);
            }
        }
    }

    public J(@NonNull Executor executor, @NonNull InterfaceC6001l interfaceC6001l) throws U {
        executor.getClass();
        interfaceC6001l.getClass();
        int i11 = C6244a.f61726b;
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(interfaceC6001l.a());
            this.f60798e = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            this.f60801h = H.c.g(executor);
            MediaFormat c11 = interfaceC6001l.c();
            this.f60797d = c11;
            Y0 b11 = interfaceC6001l.b();
            this.f60809p = b11;
            if (interfaceC6001l instanceof AbstractC5990a) {
                this.f60794a = "AudioEncoder";
                this.f60796c = false;
                this.f60799f = new a();
                C5991b c5991b = new C5991b(codecInfo, interfaceC6001l.a());
                Objects.requireNonNull(c5991b.f60859a.getAudioCapabilities());
                this.f60800g = c5991b;
            } else {
                if (!(interfaceC6001l instanceof W)) {
                    throw new U("Unknown encoder config type");
                }
                this.f60794a = "VideoEncoder";
                this.f60796c = true;
                this.f60799f = new d();
                a0 a0Var = new a0(codecInfo, interfaceC6001l.a());
                if (c11.containsKey("bitrate")) {
                    int integer = c11.getInteger("bitrate");
                    int intValue = a0Var.c().clamp(Integer.valueOf(integer)).intValue();
                    if (integer != intValue) {
                        c11.setInteger("bitrate", intValue);
                        C.S.a("VideoEncoder", "updated bitrate from " + integer + " to " + intValue);
                    }
                }
                this.f60800g = a0Var;
            }
            C.S.a(this.f60794a, "mInputTimebase = " + b11);
            C.S.a(this.f60794a, "mMediaFormat = " + c11);
            try {
                y();
                AtomicReference atomicReference = new AtomicReference();
                this.f60802i = I.k.i(androidx.concurrent.futures.b.a(new C2600b(atomicReference)));
                b.a<Void> aVar = (b.a) atomicReference.get();
                aVar.getClass();
                this.f60803j = aVar;
                z(b.CONFIGURED);
            } catch (MediaCodec.CodecException e11) {
                throw new U(e11);
            }
        } catch (IOException | IllegalArgumentException e12) {
            throw new U(e12);
        }
    }

    public static /* synthetic */ void d(J j11, long j12) {
        switch (j11.f60813t.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
            case 7:
                return;
            case 1:
                C.S.a(j11.f60794a, "Pause on ".concat(Y.d.a(j12)));
                j11.f60808o.addLast(Range.create(Long.valueOf(j12), Long.MAX_VALUE));
                j11.z(b.PAUSED);
                return;
            case 4:
                j11.z(b.PENDING_START_PAUSED);
                return;
            case 6:
            case 8:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + j11.f60813t);
        }
    }

    public static /* synthetic */ void f(J j11) {
        j11.f60791B = true;
        if (j11.f60790A) {
            j11.f60798e.stop();
            j11.y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void g(final J j11, long j12, long j13) {
        switch (j11.f60813t.ordinal()) {
            case 0:
            case 3:
            case 7:
                return;
            case 1:
            case 2:
                b bVar = j11.f60813t;
                j11.z(b.STOPPING);
                Long lower = j11.f60814u.getLower();
                long longValue = lower.longValue();
                if (longValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                String str = j11.f60794a;
                if (j12 != -1) {
                    if (j12 < longValue) {
                        C.S.k(str, "The expected stop time is less than the start time. Use current time as stop time.");
                    }
                    if (j12 >= longValue) {
                        throw new AssertionError("The start time should be before the stop time.");
                    }
                    j11.f60814u = Range.create(lower, Long.valueOf(j12));
                    C.S.a(str, "Stop on ".concat(Y.d.a(j12)));
                    if (bVar == b.PAUSED && j11.f60817x != null) {
                        j11.A();
                        return;
                    } else {
                        j11.f60816w = true;
                        j11.f60818y = H.c.e().schedule(new Runnable() { // from class: d0.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                final J j14 = J.this;
                                j14.f60801h.execute(new Runnable() { // from class: d0.p
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        J j15 = J.this;
                                        if (j15.f60816w) {
                                            C.S.k(j15.f60794a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                                            j15.f60817x = null;
                                            j15.A();
                                            j15.f60816w = false;
                                        }
                                    }
                                });
                            }
                        }, 1000L, TimeUnit.MILLISECONDS);
                        return;
                    }
                }
                j12 = j13;
                if (j12 >= longValue) {
                }
                break;
            case 4:
            case 5:
                j11.z(b.CONFIGURED);
                return;
            case 6:
            case 8:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + j11.f60813t);
        }
    }

    public static void h(J j11, long j12) {
        int ordinal = j11.f60813t.ordinal();
        MediaCodec mediaCodec = j11.f60798e;
        InterfaceC5999j.b bVar = j11.f60799f;
        String str = j11.f60794a;
        switch (ordinal) {
            case 0:
                j11.f60817x = null;
                C.S.a(str, "Start on ".concat(Y.d.a(j12)));
                try {
                    if (j11.f60790A) {
                        j11.y();
                    }
                    j11.f60814u = Range.create(Long.valueOf(j12), Long.MAX_VALUE);
                    mediaCodec.start();
                    if (bVar instanceof a) {
                        ((a) bVar).k(true);
                    }
                    j11.z(b.STARTED);
                    return;
                } catch (MediaCodec.CodecException e11) {
                    j11.s(1, e11.getMessage(), e11);
                    return;
                }
            case 1:
            case 4:
            case 7:
                return;
            case 2:
                j11.f60817x = null;
                ArrayDeque arrayDeque = j11.f60808o;
                Range range = (Range) arrayDeque.removeLast();
                x2.i.f("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                Long l11 = (Long) range.getLower();
                long longValue = l11.longValue();
                arrayDeque.addLast(Range.create(l11, Long.valueOf(j12)));
                C.S.a(str, "Resume on " + Y.d.a(j12) + "\nPaused duration = " + Y.d.a(j12 - longValue));
                boolean z11 = j11.f60796c;
                if ((z11 || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!z11 || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("drop-input-frames", 0);
                    mediaCodec.setParameters(bundle);
                    if (bVar instanceof a) {
                        ((a) bVar).k(true);
                    }
                }
                if (z11) {
                    j11.x();
                }
                j11.z(b.STARTED);
                return;
            case 3:
            case 5:
                j11.z(b.PENDING_START);
                return;
            case 6:
            case 8:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + j11.f60813t);
        }
    }

    public static void j(J j11, ArrayList arrayList, Runnable runnable) {
        if (j11.f60813t != b.ERROR) {
            if (!arrayList.isEmpty()) {
                C.S.a(j11.f60794a, "encoded data and input buffers are returned");
            }
            boolean z11 = j11.f60799f instanceof d;
            MediaCodec mediaCodec = j11.f60798e;
            if (z11 && !j11.f60791B && androidx.camera.video.internal.compat.quirk.a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                mediaCodec.flush();
                j11.f60790A = true;
            } else {
                mediaCodec.stop();
            }
        }
        runnable.run();
        b bVar = j11.f60813t;
        if (bVar == b.PENDING_RELEASE) {
            j11.w();
            return;
        }
        if (!j11.f60790A) {
            j11.y();
        }
        j11.z(b.CONFIGURED);
        if (bVar == b.PENDING_START || bVar == b.PENDING_START_PAUSED) {
            j11.start();
            if (bVar == b.PENDING_START_PAUSED) {
                j11.pause();
            }
        }
    }

    public static /* synthetic */ void k(J j11) {
        switch (j11.f60813t.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 7:
                j11.w();
                return;
            case 3:
            case 4:
            case 5:
                j11.z(b.PENDING_RELEASE);
                return;
            case 6:
            case 8:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + j11.f60813t);
        }
    }

    private void w() {
        boolean z11 = this.f60790A;
        MediaCodec mediaCodec = this.f60798e;
        if (z11) {
            mediaCodec.stop();
            this.f60790A = false;
        }
        mediaCodec.release();
        InterfaceC5999j.b bVar = this.f60799f;
        if (bVar instanceof d) {
            ((d) bVar).b();
        }
        z(b.RELEASED);
        this.f60803j.c(null);
    }

    private void y() {
        this.f60814u = f60789E;
        this.f60815v = 0L;
        this.f60808o.clear();
        this.f60804k.clear();
        ArrayDeque arrayDeque = this.f60805l;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((b.a) it.next()).d();
        }
        arrayDeque.clear();
        MediaCodec mediaCodec = this.f60798e;
        mediaCodec.reset();
        this.f60790A = false;
        this.f60791B = false;
        this.f60792C = false;
        this.f60816w = false;
        ScheduledFuture scheduledFuture = this.f60818y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f60818y = null;
        }
        ScheduledFuture scheduledFuture2 = this.f60793D;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f60793D = null;
        }
        c cVar = this.f60819z;
        if (cVar != null) {
            cVar.f();
        }
        c cVar2 = new c();
        this.f60819z = cVar2;
        mediaCodec.setCallback(cVar2);
        mediaCodec.configure(this.f60797d, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC5999j.b bVar = this.f60799f;
        if (bVar instanceof d) {
            ((d) bVar).c();
        }
    }

    private void z(b bVar) {
        if (this.f60813t == bVar) {
            return;
        }
        C.S.a(this.f60794a, "Transitioning encoder internal state: " + this.f60813t + " --> " + bVar);
        this.f60813t = bVar;
    }

    final void A() {
        C.S.a(this.f60794a, "signalCodecStop");
        InterfaceC5999j.b bVar = this.f60799f;
        boolean z11 = bVar instanceof a;
        final Executor executor = this.f60801h;
        if (z11) {
            ((a) bVar).k(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f60806m.iterator();
            while (it.hasNext()) {
                arrayList.add(((S) it.next()).b());
            }
            I.k.l(arrayList).a(new Runnable() { // from class: d0.n
                @Override // java.lang.Runnable
                public final void run() {
                    J j11 = J.this;
                    I.k.b(j11.o(), new C5981A(j11), j11.f60801h);
                }
            }, executor);
            return;
        }
        if (bVar instanceof d) {
            try {
                if (androidx.camera.video.internal.compat.quirk.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    final c cVar = this.f60819z;
                    ScheduledFuture scheduledFuture = this.f60793D;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f60793D = H.c.e().schedule(new Runnable() { // from class: d0.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            final J.c cVar2 = cVar;
                            Objects.requireNonNull(cVar2);
                            executor.execute(new Runnable() { // from class: d0.s
                                @Override // java.lang.Runnable
                                public final void run() {
                                    J.c.this.d();
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                }
                this.f60798e.signalEndOfInputStream();
                this.f60792C = true;
            } catch (MediaCodec.CodecException e11) {
                s(1, e11.getMessage(), e11);
            }
        }
    }

    public final void B() {
        this.f60801h.execute(new g0(this, 5));
    }

    final void C(Runnable runnable) {
        String str = this.f60794a;
        C.S.a(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f60807n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C5998i) it.next()).c());
        }
        HashSet hashSet2 = this.f60806m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((S) it2.next()).b());
        }
        if (!arrayList.isEmpty()) {
            C.S.a(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        I.k.l(arrayList).a(new RunnableC6011w(this, arrayList, runnable, 0), this.f60801h);
    }

    @Override // d0.InterfaceC5999j
    public final void a(@NonNull InterfaceC6000k interfaceC6000k, @NonNull Executor executor) {
        synchronized (this.f60795b) {
            this.f60811r = interfaceC6000k;
            this.f60812s = executor;
        }
    }

    @Override // d0.InterfaceC5999j
    public final void b() {
        this.f60801h.execute(new Runnable() { // from class: d0.q
            @Override // java.lang.Runnable
            public final void run() {
                J j11 = J.this;
                int ordinal = j11.f60813t.ordinal();
                if (ordinal == 1) {
                    j11.x();
                } else if (ordinal == 6 || ordinal == 8) {
                    throw new IllegalStateException("Encoder is released");
                }
            }
        });
    }

    @Override // d0.InterfaceC5999j
    public final int c() {
        MediaFormat mediaFormat = this.f60797d;
        if (mediaFormat.containsKey("bitrate")) {
            return mediaFormat.getInteger("bitrate");
        }
        return 0;
    }

    @NonNull
    final com.google.common.util.concurrent.m<S> o() {
        switch (this.f60813t.ordinal()) {
            case 0:
                return I.k.f(new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                com.google.common.util.concurrent.m<S> a11 = androidx.concurrent.futures.b.a(new B90.Z(atomicReference, 2));
                b.a aVar = (b.a) atomicReference.get();
                aVar.getClass();
                this.f60805l.offer(aVar);
                aVar.a(new RunnableC4975a(1, this, aVar), this.f60801h);
                t();
                return a11;
            case 7:
                return I.k.f(new IllegalStateException("Encoder is in error state."));
            case 8:
                return I.k.f(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f60813t);
        }
    }

    @NonNull
    public final Q p() {
        return this.f60800g;
    }

    @Override // d0.InterfaceC5999j
    public final void pause() {
        this.f60810q.getClass();
        final long c11 = Z.r.c();
        this.f60801h.execute(new Runnable() { // from class: d0.m
            @Override // java.lang.Runnable
            public final void run() {
                J.d(J.this, c11);
            }
        });
    }

    @NonNull
    public final InterfaceC5999j.b q() {
        return this.f60799f;
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Void> r() {
        return this.f60802i;
    }

    final void s(final int i11, final String str, final Throwable th2) {
        switch (this.f60813t.ordinal()) {
            case 0:
                u(i11, str, th2);
                y();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z(b.ERROR);
                C(new Runnable() { // from class: d0.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.this.u(i11, str, th2);
                    }
                });
                break;
            case 7:
                C.S.l(this.f60794a, C2618u.f(i11, "Get more than one error: ", str, "(", ")"), th2);
                break;
        }
    }

    @Override // d0.InterfaceC5999j
    public final void start() {
        this.f60810q.getClass();
        final long c11 = Z.r.c();
        this.f60801h.execute(new Runnable() { // from class: d0.t
            @Override // java.lang.Runnable
            public final void run() {
                J.h(J.this, c11);
            }
        });
    }

    @Override // d0.InterfaceC5999j
    public final void stop(final long j11) {
        this.f60810q.getClass();
        final long c11 = Z.r.c();
        this.f60801h.execute(new Runnable() { // from class: d0.x
            @Override // java.lang.Runnable
            public final void run() {
                J.g(J.this, j11, c11);
            }
        });
    }

    final void t() {
        while (true) {
            ArrayDeque arrayDeque = this.f60805l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f60804k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            b.a aVar = (b.a) arrayDeque.poll();
            Objects.requireNonNull(aVar);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                final T t2 = new T(this.f60798e, num.intValue());
                if (aVar.c(t2)) {
                    this.f60806m.add(t2);
                    t2.b().a(new Runnable() { // from class: d0.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            J.this.f60806m.remove(t2);
                        }
                    }, this.f60801h);
                } else {
                    t2.cancel();
                }
            } catch (MediaCodec.CodecException e11) {
                s(1, e11.getMessage(), e11);
                return;
            }
        }
    }

    final void u(final int i11, final String str, final Throwable th2) {
        final InterfaceC6000k interfaceC6000k;
        Executor executor;
        synchronized (this.f60795b) {
            interfaceC6000k = this.f60811r;
            executor = this.f60812s;
        }
        try {
            executor.execute(new Runnable(i11, str, th2) { // from class: d0.v

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f60936b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Throwable f60937c;

                {
                    this.f60936b = str;
                    this.f60937c = th2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6000k.this.b(new C5996g(this.f60936b, this.f60937c));
                }
            });
        } catch (RejectedExecutionException e11) {
            C.S.d(this.f60794a, "Unable to post to the supplied executor.", e11);
        }
    }

    public final void v() {
        this.f60801h.execute(new d0(this, 2));
    }

    final void x() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f60798e.setParameters(bundle);
    }
}
