package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.r;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntConsumer;
import xsna.ahn;
import xsna.ahp0;
import xsna.ako0;
import xsna.b8;
import xsna.b9;
import xsna.by1;
import xsna.c0;
import xsna.chp0;
import xsna.d7q;
import xsna.d9;
import xsna.dg1;
import xsna.dip0;
import xsna.dr;
import xsna.dvf;
import xsna.ehp0;
import xsna.et;
import xsna.ewo0;
import xsna.fi20;
import xsna.fih0;
import xsna.fk6;
import xsna.fq1;
import xsna.fwa0;
import xsna.fxc0;
import xsna.g6m;
import xsna.g8l;
import xsna.gms0;
import xsna.h8;
import xsna.hal;
import xsna.ihz;
import xsna.izf0;
import xsna.jeb0;
import xsna.jpx0;
import xsna.ju1;
import xsna.jwa0;
import xsna.jxj0;
import xsna.jza0;
import xsna.kf3;
import xsna.kj9;
import xsna.kkk0;
import xsna.kr10;
import xsna.l4;
import xsna.lh3;
import xsna.lq;
import xsna.lx5;
import xsna.n8l;
import xsna.nc4;
import xsna.nr10;
import xsna.nx5;
import xsna.nz;
import xsna.o3i0;
import xsna.o6q;
import xsna.otu;
import xsna.p06;
import xsna.p6q;
import xsna.pb;
import xsna.pi0;
import xsna.qfp0;
import xsna.qj4;
import xsna.qzf;
import xsna.rj4;
import xsna.rzf;
import xsna.s4q0;
import xsna.ss9;
import xsna.ssm0;
import xsna.szs;
import xsna.tc4;
import xsna.ty10;
import xsna.ui20;
import xsna.ukk;
import xsna.v20;
import xsna.vnr;
import xsna.vr10;
import xsna.wwi;
import xsna.wyf0;
import xsna.x1b0;
import xsna.xab;
import xsna.xgt0;
import xsna.y2r0;
import xsna.y8x0;
import xsna.yh1;
import xsna.yi2;
import xsna.z7;
import xsna.z8;
import xsna.zw1;

/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes12.dex */
public final class c extends fk6 implements ExoPlayer {
    public final y8x0 A;
    public final jpx0 B;
    public final long C;
    public final nx5<Integer> D;
    public final ssm0 E;

    @Nullable
    public final e F;
    public final a G;
    public final a H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;

    @Nullable
    public ImmutableSet<Integer> N;
    public final fih0 O;
    public o3i0 P;
    public r Q;
    public final ExoPlayer.c R;
    public boolean S;
    public jza0.a T;
    public vr10 U;

    @Nullable
    public Object V;

    @Nullable
    public Surface W;

    @Nullable
    public SurfaceHolder X;

    @Nullable
    public kkk0 Y;
    public boolean Z;

    @Nullable
    public TextureView a0;
    public final int b0;
    public final ehp0 c;
    public jxj0 c0;
    public final jza0.a d;

    @Nullable
    public g8l d0;
    public final wwi e = new wwi();
    public nc4 e0;
    public final Context f;
    public float f0;
    public final jza0 g;
    public boolean g0;
    public final j[] h;
    public ukk h0;
    public final j[] i;
    public final boolean i0;
    public final chp0 j;
    public boolean j0;
    public final otu k;
    public final int k0;
    public final fq1 l;

    @Nullable
    public PriorityTaskManager l0;
    public final androidx.media3.exoplayer.d m;
    public boolean m0;
    public final ihz<jza0.b> n;
    public boolean n0;
    public final CopyOnWriteArraySet<ExoPlayer.a> o;
    public vr10 o0;
    public final ewo0.b p;
    public fwa0 p0;
    public final ArrayList q;
    public int q0;
    public final boolean r;
    public long r0;
    public final i.a s;
    public final zw1 t;
    public final Looper u;
    public final p06 v;
    public final dvf w;
    public final b x;
    public final C0051c y;
    public final tc4 z;

    /* compiled from: ExoPlayerImpl.java */
    public final class a {
        public final HashMap a = new HashMap();
        public qzf b = qzf.b;

        public static void a(a aVar, qzf qzfVar) {
            aVar.getClass();
            for (Map.Entry entry : new HashMap(aVar.a).entrySet()) {
                rzf rzfVar = (rzf) entry.getKey();
                List list = (List) entry.getValue();
                if (!b(qzfVar, list).equals(b(aVar.b, list))) {
                    rzfVar.a();
                }
            }
            aVar.b = qzfVar;
        }

        public static qzf b(qzf qzfVar, List list) {
            qzfVar.getClass();
            Map<String, Object> map = qzfVar.a;
            HashMap hashMap = new HashMap(map);
            HashSet hashSet = new HashSet(list);
            for (String str : map.keySet()) {
                if (!hashSet.contains(str)) {
                    hashMap.remove(str);
                }
            }
            return new qzf(hashMap);
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    /* renamed from: androidx.media3.exoplayer.c$c, reason: collision with other inner class name */
    public static final class C0051c implements gms0, kj9, i.b {

        @Nullable
        public gms0 b;

        @Nullable
        public kj9 c;

        @Nullable
        public gms0 d;

        @Nullable
        public kj9 e;

        @Override // xsna.gms0
        public final void a(long j, long j2, androidx.media3.common.a aVar, @Nullable MediaFormat mediaFormat) {
            long j3;
            long j4;
            androidx.media3.common.a aVar2;
            MediaFormat mediaFormat2;
            gms0 gms0Var = this.d;
            if (gms0Var != null) {
                gms0Var.a(j, j2, aVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                aVar2 = aVar;
                j4 = j2;
                j3 = j;
            } else {
                j3 = j;
                j4 = j2;
                aVar2 = aVar;
                mediaFormat2 = mediaFormat;
            }
            gms0 gms0Var2 = this.b;
            if (gms0Var2 != null) {
                gms0Var2.a(j3, j4, aVar2, mediaFormat2);
            }
        }

        @Override // androidx.media3.exoplayer.i.b
        public final void handleMessage(int i, @Nullable Object obj) {
            if (i == 7) {
                this.b = (gms0) obj;
                return;
            }
            if (i == 8) {
                this.c = (kj9) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            kkk0 kkk0Var = (kkk0) obj;
            if (kkk0Var == null) {
                this.d = null;
                this.e = null;
            } else {
                this.d = kkk0Var.getVideoFrameMetadataListener();
                this.e = kkk0Var.getCameraMotionListener();
            }
        }

        @Override // xsna.kj9
        public final void onCameraMotion(long j, float[] fArr) {
            kj9 kj9Var = this.e;
            if (kj9Var != null) {
                kj9Var.onCameraMotion(j, fArr);
            }
            kj9 kj9Var2 = this.c;
            if (kj9Var2 != null) {
                kj9Var2.onCameraMotion(j, fArr);
            }
        }

        @Override // xsna.kj9
        public final void onCameraMotionReset() {
            kj9 kj9Var = this.e;
            if (kj9Var != null) {
                kj9Var.onCameraMotionReset();
            }
            kj9 kj9Var2 = this.c;
            if (kj9Var2 != null) {
                kj9Var2.onCameraMotionReset();
            }
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    public static final class d implements ty10 {
        public final Object a;
        public ewo0 b;

        public d(Object obj, androidx.media3.exoplayer.source.g gVar) {
            this.a = obj;
            this.b = gVar.o;
        }

        @Override // xsna.ty10
        public final ewo0 a() {
            return this.b;
        }

        @Override // xsna.ty10
        public final Object getUid() {
            return this.a;
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    public final class e {
        public final WeakReference<Context> a;
        public final o6q b;

        /* JADX WARN: Type inference failed for: r0v1, types: [xsna.o6q] */
        public e(Context context) {
            this.a = new WeakReference<>(context);
            ?? r0 = new IntConsumer() { // from class: xsna.o6q
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    androidx.media3.exoplayer.c cVar = androidx.media3.exoplayer.c.this;
                    if (cVar.n0) {
                        return;
                    }
                    cVar.L(1, 19, Integer.valueOf(i));
                }
            };
            this.b = r0;
            context.registerDeviceIdChangeListener(new p6q(c.this.w.createHandler(c.this.u, null)), r0);
        }
    }

    static {
        nr10.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0329 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x0017, B:6:0x0095, B:7:0x009e, B:9:0x00a3, B:11:0x00b2, B:14:0x00ec, B:16:0x014b, B:18:0x0158, B:20:0x0160, B:21:0x016a, B:22:0x0183, B:24:0x0189, B:26:0x019f, B:28:0x0286, B:29:0x029d, B:31:0x02de, B:33:0x02e2, B:35:0x02e6, B:39:0x02ee, B:42:0x0303, B:45:0x0311, B:48:0x031d, B:50:0x0329, B:51:0x032f, B:56:0x0316, B:58:0x02fc), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0316 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x0017, B:6:0x0095, B:7:0x009e, B:9:0x00a3, B:11:0x00b2, B:14:0x00ec, B:16:0x014b, B:18:0x0158, B:20:0x0160, B:21:0x016a, B:22:0x0183, B:24:0x0189, B:26:0x019f, B:28:0x0286, B:29:0x029d, B:31:0x02de, B:33:0x02e2, B:35:0x02e6, B:39:0x02ee, B:42:0x0303, B:45:0x0311, B:48:0x031d, B:50:0x0329, B:51:0x032f, B:56:0x0316, B:58:0x02fc), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02fc A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x0017, B:6:0x0095, B:7:0x009e, B:9:0x00a3, B:11:0x00b2, B:14:0x00ec, B:16:0x014b, B:18:0x0158, B:20:0x0160, B:21:0x016a, B:22:0x0183, B:24:0x0189, B:26:0x019f, B:28:0x0286, B:29:0x029d, B:31:0x02de, B:33:0x02e2, B:35:0x02e6, B:39:0x02ee, B:42:0x0303, B:45:0x0311, B:48:0x031d, B:50:0x0329, B:51:0x032f, B:56:0x0316, B:58:0x02fc), top: B:2:0x0017 }] */
    @SuppressLint({"HandlerLeak"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(ExoPlayer.b bVar, @Nullable l lVar) {
        e eVar;
        boolean z;
        y8x0 y8x0Var;
        jpx0 jpx0Var;
        boolean z2;
        try {
            ahn.u("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.3] [" + y2r0.a + X3.j.e);
            Context context = bVar.a;
            this.f = context.getApplicationContext();
            et etVar = bVar.h;
            dvf dvfVar = bVar.b;
            etVar.getClass();
            this.t = new hal(dvfVar);
            this.k0 = bVar.j;
            this.l0 = null;
            this.e0 = bVar.k;
            this.b0 = bVar.l;
            this.g0 = false;
            this.C = bVar.r;
            b bVar2 = new b();
            this.x = bVar2;
            this.y = new C0051c();
            Handler handler = new Handler(bVar.i);
            izf0 izf0Var = bVar.c.get();
            j[] a2 = izf0Var.a(handler, bVar2, bVar2, bVar2, bVar2);
            this.h = a2;
            fxc0.z(a2.length > 0);
            this.i = new j[a2.length];
            int i = 0;
            while (true) {
                j[] jVarArr = this.i;
                if (i >= jVarArr.length) {
                    break;
                }
                izf0Var.b(this.h[i]);
                jVarArr[i] = null;
                i++;
            }
            this.j = bVar.e.get();
            this.s = bVar.d.get();
            this.v = bVar.g.get();
            this.r = bVar.m;
            this.P = bVar.n;
            this.O = bVar.o;
            this.S = false;
            Looper looper = bVar.i;
            this.u = looper;
            dvf dvfVar2 = bVar.b;
            this.w = dvfVar2;
            this.g = lVar == 0 ? this : lVar;
            this.n = new ihz<>(new CopyOnWriteArraySet(), looper, looper.getThread(), dvfVar2, new l4(this, 18), true);
            this.o = new CopyOnWriteArraySet<>();
            this.q = new ArrayList();
            this.Q = new r.a();
            this.R = ExoPlayer.c.a;
            j[] jVarArr2 = this.h;
            this.c = new ehp0(new wyf0[jVarArr2.length], new d7q[jVarArr2.length], dip0.b, null);
            this.p = new ewo0.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i2 = 0; i2 < 20; i2++) {
                int i3 = iArr[i2];
                fxc0.z(!false);
                sparseBooleanArray.append(i3, true);
            }
            if (this.j.d()) {
                fxc0.z(!false);
                sparseBooleanArray.append(29, true);
            }
            fxc0.z(!false);
            vnr vnrVar = new vnr(sparseBooleanArray);
            SparseBooleanArray sparseBooleanArray2 = vnrVar.a;
            this.d = new jza0.a(vnrVar);
            SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
            for (int i4 = 0; i4 < sparseBooleanArray2.size(); i4++) {
                fxc0.s(i4, sparseBooleanArray2.size());
                int keyAt = sparseBooleanArray2.keyAt(i4);
                fxc0.z(!false);
                sparseBooleanArray3.append(keyAt, true);
            }
            fxc0.z(!false);
            sparseBooleanArray3.append(4, true);
            fxc0.z(!false);
            sparseBooleanArray3.append(10, true);
            fxc0.z(!false);
            this.T = new jza0.a(new vnr(sparseBooleanArray3));
            this.k = this.w.createHandler(this.u, null);
            fq1 fq1Var = new fq1(this, 15);
            this.l = fq1Var;
            this.p0 = fwa0.k(this.c);
            this.t.O(this.g, this.u);
            final x1b0 x1b0Var = new x1b0(bVar.z);
            androidx.media3.exoplayer.d dVar = new androidx.media3.exoplayer.d(this.f, this.h, this.i, this.j, this.c, bVar.f.get(), this.v, this.I, this.t, this.P, bVar.p, bVar.q, this.S, this.u, this.w, fq1Var, x1b0Var, bVar.x, this.R, this.y, bVar.A);
            otu otuVar = dVar.i;
            this.m = dVar;
            Looper looper2 = dVar.k;
            this.f0 = 1.0f;
            this.I = 0;
            vr10 vr10Var = vr10.B;
            this.U = vr10Var;
            this.o0 = vr10Var;
            this.q0 = -1;
            this.h0 = ukk.c;
            this.i0 = true;
            c(this.t);
            this.v.b(new Handler(this.u), this.t);
            this.o.add(this.x);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                final Context context2 = this.f;
                final boolean z3 = bVar.w;
                dvf dvfVar3 = this.w;
                Looper looper3 = dVar.k;
                eVar = null;
                dvfVar3.createHandler(looper3, null).post(new Runnable() { // from class: xsna.l6q
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlaybackSession createPlaybackSession;
                        ps10 ps10Var;
                        LogSessionId sessionId;
                        boolean equals;
                        LogSessionId unused;
                        Context context3 = context2;
                        boolean z4 = z3;
                        androidx.media3.exoplayer.c cVar = this;
                        x1b0 x1b0Var2 = x1b0Var;
                        MediaMetricsManager a3 = lc9.a(context3.getSystemService("media_metrics"));
                        if (a3 == null) {
                            ps10Var = null;
                        } else {
                            createPlaybackSession = a3.createPlaybackSession();
                            ps10Var = new ps10(context3, createPlaybackSession);
                        }
                        if (ps10Var == null) {
                            ahn.F("MediaMetricsService unavailable.");
                            return;
                        }
                        if (z4) {
                            cVar.t.G(ps10Var);
                        }
                        sessionId = ps10Var.e.getSessionId();
                        synchronized (x1b0Var2) {
                            x1b0.a aVar = x1b0Var2.b;
                            aVar.getClass();
                            LogSessionId logSessionId = aVar.a;
                            unused = LogSessionId.LOG_SESSION_ID_NONE;
                            equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                            fxc0.z(equals);
                            aVar.a = sessionId;
                        }
                    }
                });
            } else {
                eVar = null;
            }
            nx5<Integer> nx5Var = new nx5<>(0, looper2, this.u, this.w, new h8(this, 16));
            this.D = nx5Var;
            nx5Var.b(new xab(this, 2));
            tc4 tc4Var = new tc4(bVar.a, looper2, bVar.i, this.x, this.w);
            this.z = tc4Var;
            tc4Var.a();
            if (bVar.s != Integer.MAX_VALUE && bVar.t != Integer.MAX_VALUE && bVar.u != Integer.MAX_VALUE && bVar.v != Integer.MAX_VALUE) {
                z = 1;
                y8x0Var = new y8x0(context, looper2, this.w);
                this.A = y8x0Var;
                if (y8x0Var.d == z) {
                    y8x0Var.d = z;
                    y8x0Var.a(z, y8x0Var.e);
                }
                jpx0Var = new jpx0(context, looper2, this.w);
                this.B = jpx0Var;
                z2 = z != 2;
                if (jpx0Var.d == z2) {
                    jpx0Var.d = z2;
                    jpx0Var.a(z2, jpx0Var.e);
                }
                int i6 = g6m.c;
                xgt0 xgt0Var = xgt0.d;
                this.c0 = jxj0.c;
                this.F = i5 >= 34 ? new e(context) : eVar;
                this.G = new a();
                this.H = new a();
                this.E = new ssm0(this, this.x, this.w, bVar.s, bVar.t, bVar.u, bVar.v);
                otuVar.obtainMessage(38, this.O).b();
                otuVar.obtainMessage(31, 0, 0, this.e0).b();
                L(1, 3, this.e0);
                L(2, 4, Integer.valueOf(this.b0));
                L(2, 5, 0);
                L(1, 9, Boolean.valueOf(this.g0));
                L(6, 8, this.y);
                L(-1, 16, Integer.valueOf(this.k0));
                this.e.f();
            }
            z = 0;
            y8x0Var = new y8x0(context, looper2, this.w);
            this.A = y8x0Var;
            if (y8x0Var.d == z) {
            }
            jpx0Var = new jpx0(context, looper2, this.w);
            this.B = jpx0Var;
            if (z != 2) {
            }
            if (jpx0Var.d == z2) {
            }
            int i62 = g6m.c;
            xgt0 xgt0Var2 = xgt0.d;
            this.c0 = jxj0.c;
            this.F = i5 >= 34 ? new e(context) : eVar;
            this.G = new a();
            this.H = new a();
            this.E = new ssm0(this, this.x, this.w, bVar.s, bVar.t, bVar.u, bVar.v);
            otuVar.obtainMessage(38, this.O).b();
            otuVar.obtainMessage(31, 0, 0, this.e0).b();
            L(1, 3, this.e0);
            L(2, 4, Integer.valueOf(this.b0));
            L(2, 5, 0);
            L(1, 9, Boolean.valueOf(this.g0));
            L(6, 8, this.y);
            L(-1, 16, Integer.valueOf(this.k0));
            this.e.f();
        } catch (Throwable th) {
            this.e.f();
            throw th;
        }
    }

    public static long F(fwa0 fwa0Var) {
        ewo0.c cVar = new ewo0.c();
        ewo0.b bVar = new ewo0.b();
        fwa0Var.a.g(fwa0Var.b.a, bVar);
        long j = fwa0Var.c;
        return j == C.TIME_UNSET ? fwa0Var.a.m(bVar.c, cVar, 0L).l : bVar.e + j;
    }

    public static fwa0 G(fwa0 fwa0Var, int i) {
        fwa0 h = fwa0Var.h(i);
        return (i == 1 || i == 4) ? h.b(false) : h;
    }

    public final i A(i.b bVar) {
        int D = D(this.p0);
        ewo0 ewo0Var = this.p0.a;
        if (D == -1) {
            D = 0;
        }
        dvf dvfVar = this.w;
        androidx.media3.exoplayer.d dVar = this.m;
        return new i(dVar, bVar, ewo0Var, D, dvfVar, dVar.k);
    }

    public final long B(fwa0 fwa0Var) {
        i.b bVar = fwa0Var.b;
        long j = fwa0Var.c;
        ewo0 ewo0Var = fwa0Var.a;
        if (!bVar.b()) {
            return y2r0.j0(C(fwa0Var));
        }
        Object obj = fwa0Var.b.a;
        ewo0.b bVar2 = this.p;
        ewo0Var.g(obj, bVar2);
        if (j == C.TIME_UNSET) {
            return y2r0.j0(ewo0Var.m(D(fwa0Var), this.b, 0L).l);
        }
        return y2r0.j0(j) + y2r0.j0(bVar2.e);
    }

    public final long C(fwa0 fwa0Var) {
        if (fwa0Var.a.p()) {
            return y2r0.S(this.r0);
        }
        long l = fwa0Var.p ? fwa0Var.l() : fwa0Var.s;
        if (fwa0Var.b.b()) {
            return l;
        }
        ewo0 ewo0Var = fwa0Var.a;
        Object obj = fwa0Var.b.a;
        ewo0.b bVar = this.p;
        ewo0Var.g(obj, bVar);
        return l + bVar.e;
    }

    public final int D(fwa0 fwa0Var) {
        return fwa0Var.a.p() ? this.q0 : fwa0Var.a.g(fwa0Var.b.a, this.p).c;
    }

    public final jwa0 E() {
        X();
        return this.p0.o;
    }

    public final fwa0 H(fwa0 fwa0Var, ewo0 ewo0Var, @Nullable Pair<Object, Long> pair) {
        List<fi20> list;
        fxc0.p(ewo0Var.p() || pair != null);
        ewo0 ewo0Var2 = fwa0Var.a;
        long B = B(fwa0Var);
        fwa0 j = fwa0Var.j(ewo0Var);
        if (ewo0Var.p()) {
            i.b bVar = fwa0.u;
            long S = y2r0.S(this.r0);
            fwa0 c = j.d(bVar, S, S, S, 0L, qfp0.d, this.c, com.google.common.collect.g.f).c(bVar);
            c.q = c.s;
            return c;
        }
        Object obj = j.b.a;
        boolean equals = obj.equals(pair.first);
        i.b bVar2 = !equals ? new i.b(pair.first) : j.b;
        long longValue = ((Long) pair.second).longValue();
        long S2 = y2r0.S(B);
        if (!ewo0Var2.p()) {
            S2 -= ewo0Var2.g(obj, this.p).e;
            if (equals && S2 - longValue == 1 && S2 == ewo0Var2.g(obj, this.p).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            i.b bVar3 = bVar2;
            fxc0.z(!bVar3.b());
            qfp0 qfp0Var = !equals ? qfp0.d : j.h;
            ehp0 ehp0Var = !equals ? this.c : j.i;
            if (equals) {
                list = j.j;
            } else {
                ImmutableList.b bVar4 = ImmutableList.c;
                list = com.google.common.collect.g.f;
            }
            fwa0 c2 = j.d(bVar3, longValue, longValue, longValue, 0L, qfp0Var, ehp0Var, list).c(bVar3);
            c2.q = longValue;
            return c2;
        }
        if (longValue != S2) {
            i.b bVar5 = bVar2;
            fxc0.z(!bVar5.b());
            long max = Math.max(0L, j.r - (longValue - S2));
            long j2 = j.q;
            if (j.k.equals(j.b)) {
                j2 = longValue + max;
            }
            fwa0 d2 = j.d(bVar5, longValue, longValue, longValue, max, j.h, j.i, j.j);
            d2.q = j2;
            return d2;
        }
        int b2 = ewo0Var.b(j.k.a);
        if (b2 != -1 && ewo0Var.f(b2, this.p, false).c == ewo0Var.g(bVar2.a, this.p).c) {
            return j;
        }
        ewo0Var.g(bVar2.a, this.p);
        long a2 = bVar2.b() ? this.p.a(bVar2.b, bVar2.c) : this.p.d;
        i.b bVar6 = bVar2;
        fwa0 c3 = j.d(bVar6, j.s, j.s, j.d, a2 - j.s, j.h, j.i, j.j).c(bVar6);
        c3.q = a2;
        return c3;
    }

    @Nullable
    public final Pair<Object, Long> I(ewo0 ewo0Var, int i, long j) {
        if (ewo0Var.p()) {
            this.q0 = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.r0 = j;
            return null;
        }
        if (i == -1 || i >= ewo0Var.o()) {
            i = ewo0Var.a(false);
            j = y2r0.j0(ewo0Var.m(i, this.b, 0L).l);
        }
        return ewo0Var.i(this.b, this.p, i, y2r0.S(j));
    }

    public final void J(final int i, final int i2) {
        jxj0 jxj0Var = this.c0;
        if (i == jxj0Var.a && i2 == jxj0Var.b) {
            return;
        }
        this.c0 = new jxj0(i, i2);
        this.n.f(24, new ihz.a() { // from class: xsna.h6q
            @Override // xsna.ihz.a
            public final void invoke(Object obj) {
                ((jza0.b) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        L(2, 14, new jxj0(i, i2));
    }

    public final void K() {
        kkk0 kkk0Var = this.Y;
        b bVar = this.x;
        if (kkk0Var != null) {
            i A = A(this.y);
            fxc0.z(!A.k);
            A.e = 10000;
            fxc0.z(!A.k);
            A.f = null;
            A.b();
            this.Y.b.remove(bVar);
            this.Y = null;
        }
        TextureView textureView = this.a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != bVar) {
                ahn.F("SurfaceTextureListener already unset or replaced.");
            } else {
                this.a0.setSurfaceTextureListener(null);
            }
            this.a0 = null;
        }
        SurfaceHolder surfaceHolder = this.X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(bVar);
            this.X = null;
        }
    }

    public final void L(int i, int i2, @Nullable Object obj) {
        for (j jVar : this.h) {
            if (i == -1 || jVar.getTrackType() == i) {
                i A = A(jVar);
                fxc0.z(!A.k);
                A.e = i2;
                fxc0.z(!A.k);
                A.f = obj;
                A.b();
            }
        }
        for (j jVar2 : this.i) {
            if (jVar2 != null && (i == -1 || jVar2.getTrackType() == i)) {
                i A2 = A(jVar2);
                fxc0.z(!A2.k);
                A2.e = i2;
                fxc0.z(!A2.k);
                A2.f = obj;
                A2.b();
            }
        }
    }

    public final void M(androidx.media3.exoplayer.source.i iVar) {
        X();
        List singletonList = Collections.singletonList(iVar);
        X();
        N(-1, C.TIME_UNSET, singletonList, true);
    }

    public final void N(int i, long j, List list, boolean z) {
        long j2;
        int i2;
        int D = D(this.p0);
        long currentPosition = getCurrentPosition();
        this.J++;
        ArrayList arrayList = this.q;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            h.c cVar = new h.c((androidx.media3.exoplayer.source.i) list.get(i3), this.r);
            arrayList2.add(cVar);
            arrayList.add(i3, new d(cVar.b, cVar.a));
        }
        this.Q = this.Q.b(arrayList2.size());
        jeb0 jeb0Var = new jeb0(arrayList, this.Q);
        boolean p = jeb0Var.p();
        int i4 = jeb0Var.e;
        if (!p && i >= i4) {
            throw new IllegalSeekPositionException(jeb0Var, i, j);
        }
        if (z) {
            int a2 = jeb0Var.a(false);
            j2 = C.TIME_UNSET;
            i2 = a2;
        } else if (i == -1) {
            i2 = D;
            j2 = currentPosition;
        } else {
            j2 = j;
            i2 = i;
        }
        fwa0 H = H(this.p0, jeb0Var, I(jeb0Var, i2, j2));
        int i5 = H.e;
        if (i5 == 1) {
            i5 = 1;
        } else {
            if (!jeb0Var.p()) {
                if (i2 != -1) {
                    if (i2 < i4) {
                        i5 = 2;
                    }
                }
            }
            i5 = 4;
        }
        fwa0 G = G(H, i5);
        this.m.i.obtainMessage(17, new d.b(arrayList2, this.Q, i2, y2r0.S(j2))).b();
        V(G, 0, (this.p0.b.a.equals(G.b.a) || this.p0.a.p()) ? false : true, 4, C(G), -1);
    }

    public final void O(jwa0 jwa0Var) {
        X();
        if (this.p0.o.equals(jwa0Var)) {
            return;
        }
        fwa0 g = this.p0.g(jwa0Var);
        this.J++;
        this.m.i.obtainMessage(4, jwa0Var).b();
        V(g, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final void P(final int i) {
        X();
        if (this.I != i) {
            this.I = i;
            this.m.i.obtainMessage(11, i, 0).b();
            ihz.a<jza0.b> aVar = new ihz.a() { // from class: xsna.g6q
                @Override // xsna.ihz.a
                public final void invoke(Object obj) {
                    ((jza0.b) obj).onRepeatModeChanged(i);
                }
            };
            ihz<jza0.b> ihzVar = this.n;
            ihzVar.c(8, aVar);
            T();
            ihzVar.b();
        }
    }

    public final void Q(@Nullable Surface surface) {
        Object obj = this.V;
        boolean z = true;
        boolean z2 = (obj == null || obj == surface) ? false : true;
        long j = z2 ? this.C : -9223372036854775807L;
        androidx.media3.exoplayer.d dVar = this.m;
        if (!dVar.L && dVar.k.getThread().isAlive()) {
            wwi wwiVar = new wwi(dVar.r);
            dVar.i.obtainMessage(30, new Pair(surface, wwiVar)).b();
            if (j != C.TIME_UNSET) {
                z = wwiVar.c(j);
            }
        }
        if (z2) {
            Object obj2 = this.V;
            Surface surface2 = this.W;
            if (obj2 == surface2) {
                surface2.release();
                this.W = null;
            }
        }
        this.V = surface;
        if (z) {
            return;
        }
        S(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
    }

    public final void R(@Nullable Surface surface) {
        X();
        K();
        Q(surface);
        int i = surface == null ? 0 : -1;
        J(i, i);
    }

    public final void S(@Nullable ExoPlaybackException exoPlaybackException) {
        fwa0 fwa0Var = this.p0;
        fwa0 c = fwa0Var.c(fwa0Var.b);
        c.q = c.s;
        c.r = 0L;
        fwa0 G = G(c, 1);
        if (exoPlaybackException != null) {
            G = G.f(exoPlaybackException);
        }
        this.J++;
        this.m.i.obtainMessage(6).b();
        V(G, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final void T() {
        jza0.a aVar = this.T;
        String str = y2r0.a;
        jza0 jza0Var = this.g;
        boolean isPlayingAd = jza0Var.isPlayingAd();
        boolean m = jza0Var.m();
        boolean h = jza0Var.h();
        boolean d2 = jza0Var.d();
        boolean e2 = jza0Var.e();
        boolean o = jza0Var.o();
        boolean p = jza0Var.getCurrentTimeline().p();
        jza0.a.C3154a c3154a = new jza0.a.C3154a();
        SparseBooleanArray sparseBooleanArray = this.d.a.a;
        vnr.a aVar2 = c3154a.a;
        aVar2.getClass();
        boolean z = false;
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            fxc0.s(i, sparseBooleanArray.size());
            aVar2.a(sparseBooleanArray.keyAt(i));
        }
        boolean z2 = !isPlayingAd;
        c3154a.a(4, z2);
        c3154a.a(5, m && !isPlayingAd);
        c3154a.a(6, h && !isPlayingAd);
        c3154a.a(7, !p && (h || !e2 || m) && !isPlayingAd);
        c3154a.a(8, d2 && !isPlayingAd);
        c3154a.a(9, !p && (d2 || (e2 && o)) && !isPlayingAd);
        c3154a.a(10, z2);
        c3154a.a(11, m && !isPlayingAd);
        if (m && !isPlayingAd) {
            z = true;
        }
        c3154a.a(12, z);
        jza0.a aVar3 = new jza0.a(aVar2.b());
        this.T = aVar3;
        if (aVar3.equals(aVar)) {
            return;
        }
        this.n.c(13, new ju1(this, 24));
    }

    public final void U(int i, boolean z) {
        int i2 = this.M ? 4 : (this.p0.n != 1 || z) ? 0 : 1;
        fwa0 fwa0Var = this.p0;
        if (fwa0Var.l == z && fwa0Var.n == i2 && fwa0Var.m == i) {
            return;
        }
        this.J++;
        if (fwa0Var.p) {
            fwa0Var = fwa0Var.a();
        }
        fwa0 e2 = fwa0Var.e(i, i2, z);
        this.m.i.obtainMessage(1, z ? 1 : 0, i | (i2 << 4)).b();
        V(e2, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final void V(final fwa0 fwa0Var, final int i, boolean z, final int i2, long j, int i3) {
        Pair pair;
        int i4;
        final kr10 kr10Var;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        Object obj;
        kr10 kr10Var2;
        Object obj2;
        long j2;
        long j3;
        long j4;
        long F;
        Object obj3;
        kr10 kr10Var3;
        Object obj4;
        fwa0 fwa0Var2 = this.p0;
        this.p0 = fwa0Var;
        boolean equals = fwa0Var2.a.equals(fwa0Var.a);
        ewo0.c cVar = this.b;
        ewo0.b bVar = this.p;
        ewo0 ewo0Var = fwa0Var2.a;
        i.b bVar2 = fwa0Var2.b;
        ewo0 ewo0Var2 = fwa0Var.a;
        i.b bVar3 = fwa0Var.b;
        if (ewo0Var2.p() && ewo0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (ewo0Var2.p() != ewo0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (ewo0Var.m(ewo0Var.g(bVar2.a, bVar).c, cVar, 0L).a.equals(ewo0Var2.m(ewo0Var2.g(bVar3.a, bVar).c, cVar, 0L).a)) {
            pair = (z && i2 == 0 && bVar2.d < bVar3.d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (equals) {
                    throw new IllegalStateException();
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            kr10Var = !fwa0Var.a.p() ? fwa0Var.a.m(fwa0Var.a.g(fwa0Var.b.a, this.p).c, this.b, 0L).c : null;
            this.o0 = vr10.B;
        } else {
            kr10Var = null;
        }
        if (booleanValue || !fwa0Var2.j.equals(fwa0Var.j)) {
            vr10.a a2 = this.o0.a();
            List<fi20> list = fwa0Var.j;
            for (int i7 = 0; i7 < list.size(); i7++) {
                fi20 fi20Var = list.get(i7);
                int i8 = 0;
                while (true) {
                    fi20.a[] aVarArr = fi20Var.a;
                    if (i8 < aVarArr.length) {
                        aVarArr[i8].c(a2);
                        i8++;
                    }
                }
            }
            this.o0 = new vr10(a2);
        }
        vr10 y = y();
        boolean equals2 = y.equals(this.U);
        this.U = y;
        boolean z5 = fwa0Var2.l != fwa0Var.l;
        boolean z6 = fwa0Var2.e != fwa0Var.e;
        if (z6 || z5) {
            W();
        }
        boolean z7 = fwa0Var2.g;
        boolean z8 = fwa0Var.g;
        boolean z9 = z7 != z8;
        if (z9) {
            int i9 = this.k0;
            PriorityTaskManager priorityTaskManager = this.l0;
            if (priorityTaskManager != null) {
                if (z8 && !this.m0) {
                    priorityTaskManager.a(i9);
                    this.m0 = true;
                } else if (!z8 && this.m0) {
                    priorityTaskManager.d(i9);
                    this.m0 = false;
                }
            }
        }
        if (!equals) {
            this.n.c(0, new ihz.a() { // from class: xsna.e6q
                @Override // xsna.ihz.a
                public final void invoke(Object obj5) {
                    ((jza0.b) obj5).z(fwa0.this.a, i);
                }
            });
        }
        if (z) {
            ewo0.b bVar4 = new ewo0.b();
            if (fwa0Var2.a.p()) {
                z2 = booleanValue;
                z3 = equals2;
                z4 = z6;
                i5 = i3;
                i6 = i5;
                obj = null;
                kr10Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = fwa0Var2.b.a;
                fwa0Var2.a.g(obj5, bVar4);
                int i10 = bVar4.c;
                int b2 = fwa0Var2.a.b(obj5);
                z2 = booleanValue;
                z3 = equals2;
                z4 = z6;
                obj = fwa0Var2.a.m(i10, this.b, 0L).a;
                kr10Var2 = this.b.c;
                obj2 = obj5;
                i5 = i10;
                i6 = b2;
            }
            if (i2 == 0) {
                if (fwa0Var2.b.b()) {
                    i.b bVar5 = fwa0Var2.b;
                    j4 = bVar4.a(bVar5.b, bVar5.c);
                    F = F(fwa0Var2);
                } else if (fwa0Var2.b.e != -1) {
                    j4 = F(this.p0);
                    F = j4;
                } else {
                    j2 = bVar4.e;
                    j3 = bVar4.d;
                    j4 = j2 + j3;
                    F = j4;
                }
            } else if (fwa0Var2.b.b()) {
                j4 = fwa0Var2.s;
                F = F(fwa0Var2);
            } else {
                j2 = bVar4.e;
                j3 = fwa0Var2.s;
                j4 = j2 + j3;
                F = j4;
            }
            long j0 = y2r0.j0(j4);
            long j02 = y2r0.j0(F);
            i.b bVar6 = fwa0Var2.b;
            final jza0.c cVar2 = new jza0.c(obj, i5, kr10Var2, obj2, i6, j0, j02, bVar6.b, bVar6.c);
            ewo0.c cVar3 = this.b;
            int s = s();
            int currentPeriodIndex = getCurrentPeriodIndex();
            if (this.p0.a.p()) {
                obj3 = null;
                kr10Var3 = null;
                obj4 = null;
            } else {
                fwa0 fwa0Var3 = this.p0;
                Object obj6 = fwa0Var3.b.a;
                fwa0Var3.a.g(obj6, this.p);
                currentPeriodIndex = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(s, cVar3, 0L).a;
                kr10Var3 = cVar3.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i11 = currentPeriodIndex;
            long j03 = y2r0.j0(j);
            long j04 = this.p0.b.b() ? y2r0.j0(F(this.p0)) : j03;
            i.b bVar7 = this.p0.b;
            final jza0.c cVar4 = new jza0.c(obj3, s, kr10Var3, obj4, i11, j03, j04, bVar7.b, bVar7.c);
            this.n.c(11, new ihz.a() { // from class: xsna.j6q
                @Override // xsna.ihz.a
                public final void invoke(Object obj8) {
                    jza0.b bVar8 = (jza0.b) obj8;
                    bVar8.getClass();
                    bVar8.D(i2, cVar2, cVar4);
                }
            });
        } else {
            z2 = booleanValue;
            z3 = equals2;
            z4 = z6;
        }
        if (z2) {
            this.n.c(1, new ihz.a() { // from class: xsna.k6q
                @Override // xsna.ihz.a
                public final void invoke(Object obj8) {
                    ((jza0.b) obj8).f0(kr10.this, intValue);
                }
            });
        }
        if (fwa0Var2.f != fwa0Var.f) {
            this.n.c(10, new yh1(fwa0Var, 17));
            if (fwa0Var.f != null) {
                this.n.c(10, new nz(fwa0Var, 18));
            }
        }
        ehp0 ehp0Var = fwa0Var2.i;
        ehp0 ehp0Var2 = fwa0Var.i;
        if (ehp0Var != ehp0Var2) {
            this.j.e(ehp0Var2.e);
            this.n.c(2, new dg1(fwa0Var, 18));
        }
        if (!z3) {
            this.n.c(14, new z7(this.U, 24));
        }
        if (z9) {
            this.n.c(3, new v20(fwa0Var, 20));
        }
        if (z4 || z5) {
            this.n.c(-1, new b8(fwa0Var, 20));
        }
        if (z4) {
            this.n.c(4, new yi2(fwa0Var, 16));
        }
        if (z5 || fwa0Var2.m != fwa0Var.m) {
            this.n.c(5, new lh3(fwa0Var, 16));
        }
        if (fwa0Var2.n != fwa0Var.n) {
            this.n.c(6, new pb(fwa0Var, 17));
        }
        if (fwa0Var2.m() != fwa0Var.m()) {
            this.n.c(7, new kf3(fwa0Var, 16));
        }
        if (!fwa0Var2.o.equals(fwa0Var.o)) {
            this.n.c(12, new pi0(fwa0Var, 22));
        }
        T();
        this.n.b();
        if (fwa0Var2.p != fwa0Var.p) {
            Iterator<ExoPlayer.a> it = this.o.iterator();
            while (it.hasNext()) {
                it.next().h();
            }
        }
    }

    public final void W() {
        int playbackState = getPlaybackState();
        jpx0 jpx0Var = this.B;
        y8x0 y8x0Var = this.A;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                X();
                boolean z2 = this.p0.p;
                if (getPlayWhenReady() && !z2) {
                    z = true;
                }
                y8x0Var.b(z);
                jpx0Var.b(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        y8x0Var.b(false);
        jpx0Var.b(false);
    }

    public final void X() {
        this.e.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.u;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = y2r0.a;
            Locale locale = Locale.US;
            String a2 = ss9.a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.i0) {
                throw new IllegalStateException(a2);
            }
            ahn.G(a2, this.j0 ? null : new IllegalStateException());
            this.j0 = true;
        }
    }

    @Override // xsna.jza0
    public final long a() {
        X();
        return y2r0.j0(this.p0.r);
    }

    @Override // xsna.jza0
    public final void c(jza0.b bVar) {
        bVar.getClass();
        this.n.a(bVar);
    }

    @Override // xsna.jza0
    public final void f(List list) {
        X();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.s.d((kr10) list.get(i)));
        }
        X();
        N(-1, C.TIME_UNSET, arrayList, true);
    }

    @Override // xsna.jza0
    public final int g() {
        X();
        return this.p0.n;
    }

    @Override // xsna.jza0
    public final long getBufferedPosition() {
        X();
        if (isPlayingAd()) {
            fwa0 fwa0Var = this.p0;
            return fwa0Var.k.equals(fwa0Var.b) ? y2r0.j0(this.p0.q) : getDuration();
        }
        X();
        if (this.p0.a.p()) {
            return this.r0;
        }
        fwa0 fwa0Var2 = this.p0;
        long j = 0;
        if (fwa0Var2.k.d != fwa0Var2.b.d) {
            return y2r0.j0(fwa0Var2.a.m(s(), this.b, 0L).m);
        }
        long j2 = fwa0Var2.q;
        if (this.p0.k.b()) {
            fwa0 fwa0Var3 = this.p0;
            fwa0Var3.a.g(fwa0Var3.k.a, this.p).d(this.p0.k.b);
        } else {
            j = j2;
        }
        fwa0 fwa0Var4 = this.p0;
        ewo0 ewo0Var = fwa0Var4.a;
        Object obj = fwa0Var4.k.a;
        ewo0.b bVar = this.p;
        ewo0Var.g(obj, bVar);
        return y2r0.j0(j + bVar.e);
    }

    @Override // xsna.jza0
    public final long getContentPosition() {
        X();
        return B(this.p0);
    }

    @Override // xsna.jza0
    public final int getCurrentAdGroupIndex() {
        X();
        if (isPlayingAd()) {
            return this.p0.b.b;
        }
        return -1;
    }

    @Override // xsna.jza0
    public final int getCurrentAdIndexInAdGroup() {
        X();
        if (isPlayingAd()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override // xsna.jza0
    public final int getCurrentPeriodIndex() {
        X();
        if (!this.p0.a.p()) {
            fwa0 fwa0Var = this.p0;
            return fwa0Var.a.b(fwa0Var.b.a);
        }
        int i = this.q0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // xsna.jza0
    public final long getCurrentPosition() {
        X();
        return y2r0.j0(C(this.p0));
    }

    @Override // xsna.jza0
    public final ewo0 getCurrentTimeline() {
        X();
        return this.p0.a;
    }

    @Override // xsna.jza0
    public final long getDuration() {
        X();
        if (!isPlayingAd()) {
            ewo0 currentTimeline = getCurrentTimeline();
            return currentTimeline.p() ? C.TIME_UNSET : y2r0.j0(currentTimeline.m(s(), this.b, 0L).m);
        }
        fwa0 fwa0Var = this.p0;
        i.b bVar = fwa0Var.b;
        ewo0 ewo0Var = fwa0Var.a;
        Object obj = bVar.a;
        ewo0.b bVar2 = this.p;
        ewo0Var.g(obj, bVar2);
        return y2r0.j0(bVar2.a(bVar.b, bVar.c));
    }

    @Override // xsna.jza0
    public final boolean getPlayWhenReady() {
        X();
        return this.p0.l;
    }

    @Override // xsna.jza0
    public final int getPlaybackState() {
        X();
        return this.p0.e;
    }

    @Override // xsna.jza0
    public final int getRepeatMode() {
        X();
        return this.I;
    }

    @Override // xsna.jza0
    public final void getShuffleModeEnabled() {
        X();
    }

    @Override // xsna.jza0
    public final float getVolume() {
        X();
        return this.f0;
    }

    @Override // xsna.jza0
    @Nullable
    /* renamed from: i */
    public final ExoPlaybackException b() {
        X();
        return this.p0.f;
    }

    @Override // xsna.jza0
    public final boolean isPlayingAd() {
        X();
        return this.p0.b.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        X();
        return this.M;
    }

    @Override // xsna.jza0
    public final dip0 j() {
        X();
        return this.p0.i.d;
    }

    @Override // xsna.jza0
    public final void k() {
        int i;
        int i2;
        Pair<Object, Long> I;
        X();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        int min = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || min == 0) {
            return;
        }
        fwa0 fwa0Var = this.p0;
        int D = D(fwa0Var);
        long B = B(fwa0Var);
        ewo0 ewo0Var = fwa0Var.a;
        this.J++;
        for (int i3 = min - 1; i3 >= 0; i3--) {
            arrayList.remove(i3);
        }
        this.Q = this.Q.a(0, min);
        jeb0 jeb0Var = new jeb0(arrayList, this.Q);
        if (ewo0Var.p() || jeb0Var.p()) {
            i = 0;
            i2 = -1;
            boolean z = !ewo0Var.p() && jeb0Var.p();
            int i4 = z ? -1 : D;
            if (z) {
                B = -9223372036854775807L;
            }
            I = I(jeb0Var, i4, B);
        } else {
            Pair<Object, Long> i5 = ewo0Var.i(this.b, this.p, D, y2r0.S(B));
            Object obj = i5.first;
            if (jeb0Var.b(obj) != -1) {
                I = i5;
                i = 0;
                i2 = -1;
            } else {
                i = 0;
                i2 = -1;
                int V = androidx.media3.exoplayer.d.V(this.b, this.p, this.I, false, obj, ewo0Var, jeb0Var);
                if (V != -1) {
                    ewo0.c cVar = this.b;
                    jeb0Var.m(V, cVar, 0L);
                    I = I(jeb0Var, V, y2r0.j0(cVar.l));
                } else {
                    I = I(jeb0Var, -1, C.TIME_UNSET);
                }
            }
        }
        fwa0 H = H(fwa0Var, jeb0Var, I);
        int i6 = H.e;
        if (i6 != 1 && i6 != 4 && D >= 0 && D < min) {
            if (androidx.media3.exoplayer.d.V(this.b, this.p, this.I, false, fwa0Var.b.a, ewo0Var, jeb0Var) == i2) {
                H = G(H, 4);
            }
        }
        this.m.i.obtainMessage(20, i, min, this.Q).b();
        V(H, 0, !H.b.a.equals(this.p0.b.a), 4, C(H), -1);
    }

    @Override // xsna.jza0
    public final void l(jza0.b bVar) {
        X();
        bVar.getClass();
        this.n.e(bVar);
    }

    @Override // xsna.jza0
    public final jza0.a p() {
        X();
        return this.T;
    }

    @Override // xsna.jza0
    public final void prepare() {
        X();
        fwa0 fwa0Var = this.p0;
        if (fwa0Var.e != 1) {
            return;
        }
        fwa0 f = fwa0Var.f(null);
        fwa0 G = G(f, f.a.p() ? 4 : 2);
        this.J++;
        this.m.i.obtainMessage(29).b();
        V(G, 1, false, 5, C.TIME_UNSET, -1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void q(by1 by1Var) {
        X();
        by1Var.getClass();
        this.t.C(by1Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void r(androidx.media3.exoplayer.source.i iVar) {
        X();
        List singletonList = Collections.singletonList(iVar);
        X();
        X();
        N(-1, C.TIME_UNSET, singletonList, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        String str;
        boolean z;
        Context context;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.9.3] [");
        sb.append(y2r0.a);
        sb.append("] [");
        HashSet<String> hashSet = nr10.a;
        synchronized (nr10.class) {
            str = nr10.b;
        }
        sb.append(str);
        sb.append(X3.j.e);
        ahn.u(sb.toString());
        X();
        this.z.a();
        this.A.b(false);
        this.B.b(false);
        e eVar = this.F;
        if (eVar != null && Build.VERSION.SDK_INT >= 34 && (context = eVar.a.get()) != null) {
            context.unregisterDeviceIdChangeListener(eVar.b);
        }
        ssm0 ssm0Var = this.E;
        ssm0Var.f.a();
        ssm0Var.a.l(ssm0Var.b);
        androidx.media3.exoplayer.d dVar = this.m;
        if (dVar.L || !dVar.k.getThread().isAlive()) {
            z = true;
        } else {
            dVar.L = true;
            wwi wwiVar = new wwi(dVar.r);
            dVar.i.obtainMessage(7, wwiVar).b();
            z = wwiVar.c(dVar.w);
        }
        if (!z) {
            this.n.f(10, new lq(16));
        }
        this.n.d();
        this.k.a();
        this.v.c(this.t);
        fwa0 fwa0Var = this.p0;
        if (fwa0Var.p) {
            this.p0 = fwa0Var.a();
        }
        fwa0 G = G(this.p0, 1);
        this.p0 = G;
        fwa0 c = G.c(G.b);
        this.p0 = c;
        c.q = c.s;
        this.p0.r = 0L;
        this.t.release();
        K();
        Surface surface = this.W;
        if (surface != null) {
            surface.release();
            this.W = null;
        }
        if (this.m0) {
            PriorityTaskManager priorityTaskManager = this.l0;
            priorityTaskManager.getClass();
            priorityTaskManager.d(this.k0);
            this.m0 = false;
        }
        this.h0 = ukk.c;
        this.n0 = true;
    }

    @Override // xsna.jza0
    public final int s() {
        X();
        int D = D(this.p0);
        if (D == -1) {
            return 0;
        }
        return D;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(@Nullable ImageOutput imageOutput) {
        X();
        L(4, 15, imageOutput);
    }

    @Override // xsna.jza0
    public final void setPlayWhenReady(boolean z) {
        X();
        U(1, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        ahp0 a2;
        X();
        if (z == this.M) {
            return;
        }
        this.M = z;
        fih0 fih0Var = this.O;
        if (!fih0Var.a.isEmpty()) {
            chp0 chp0Var = this.j;
            if (chp0Var.d()) {
                ahp0 a3 = chp0Var.a();
                if (z) {
                    this.N = a3.x;
                    ImmutableSet<Integer> immutableSet = fih0Var.a;
                    ahp0.b a4 = a3.a();
                    s4q0<Integer> it = immutableSet.iterator();
                    while (it.hasNext()) {
                        a4.h(it.next().intValue(), true);
                    }
                    a2 = a4.a();
                } else {
                    a2 = a3.a().e(this.N).a();
                    this.N = null;
                }
                if (!a2.equals(a3)) {
                    chp0Var.i(a2);
                }
            }
        }
        this.m.i.obtainMessage(36, Boolean.valueOf(z)).b();
        fwa0 fwa0Var = this.p0;
        U(fwa0Var.m, fwa0Var.l);
    }

    @Override // xsna.jza0
    public final void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        X();
        boolean z = surfaceView instanceof kkk0;
        b bVar = this.x;
        if (!z) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            X();
            if (holder == null) {
                z();
                return;
            }
            K();
            this.Z = true;
            this.X = holder;
            holder.addCallback(bVar);
            Surface surface = holder.getSurface();
            if (surface == null || !surface.isValid()) {
                Q(null);
                J(0, 0);
                return;
            } else {
                Q(surface);
                Rect surfaceFrame = holder.getSurfaceFrame();
                J(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
        }
        K();
        this.Y = (kkk0) surfaceView;
        i A = A(this.y);
        fxc0.z(!A.k);
        A.e = 10000;
        kkk0 kkk0Var = this.Y;
        fxc0.z(true ^ A.k);
        A.f = kkk0Var;
        A.b();
        this.Y.b.add(bVar);
        Q(this.Y.getVideoSurface());
        SurfaceHolder holder2 = surfaceView.getHolder();
        this.Z = false;
        this.X = holder2;
        holder2.addCallback(bVar);
        Surface surface2 = this.X.getSurface();
        if (surface2 == null || !surface2.isValid()) {
            J(0, 0);
        } else {
            Rect surfaceFrame2 = this.X.getSurfaceFrame();
            J(surfaceFrame2.width(), surfaceFrame2.height());
        }
    }

    @Override // xsna.jza0
    public final void setVideoTextureView(@Nullable TextureView textureView) {
        X();
        if (textureView == null) {
            z();
            return;
        }
        K();
        this.a0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ahn.F("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            Q(null);
            J(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            Q(surface);
            this.W = surface;
            J(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // xsna.jza0
    public final void setVolume(float f) {
        X();
        final float i = y2r0.i(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.f0 == i) {
            return;
        }
        this.f0 = i;
        this.m.i.obtainMessage(32, Float.valueOf(i)).b();
        this.n.f(22, new ihz.a() { // from class: xsna.f6q
            @Override // xsna.ihz.a
            public final void invoke(Object obj) {
                ((jza0.b) obj).onVolumeChanged(i);
            }
        });
    }

    @Override // xsna.jza0
    public final void stop() {
        X();
        S(null);
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        long j = this.p0.s;
        this.h0 = new ukk(gVar);
    }

    @Override // xsna.fk6
    public final void v(int i, int i2, long j) {
        X();
        if (i == -1) {
            return;
        }
        fxc0.p(i >= 0);
        ewo0 ewo0Var = this.p0.a;
        if (ewo0Var.p() || i < ewo0Var.o()) {
            this.t.V();
            this.J++;
            if (isPlayingAd()) {
                ahn.F("seekTo ignored because an ad is playing");
                d.e eVar = new d.e(this.p0);
                eVar.a(1);
                c cVar = (c) this.l.c;
                cVar.k.post(new c0(3, cVar, eVar));
                return;
            }
            fwa0 fwa0Var = this.p0;
            int i3 = fwa0Var.e;
            if (i3 == 3 || (i3 == 4 && !ewo0Var.p())) {
                fwa0Var = this.p0.h(2);
            }
            int s = s();
            fwa0 H = H(fwa0Var, ewo0Var, I(ewo0Var, i, j));
            this.m.i.obtainMessage(3, new d.g(ewo0Var, i, y2r0.S(j))).b();
            V(H, 0, true, 1, C(H), s);
        }
    }

    public final vr10 y() {
        ewo0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return this.o0;
        }
        kr10 kr10Var = currentTimeline.m(s(), this.b, 0L).c;
        vr10.a a2 = this.o0.a();
        vr10 vr10Var = kr10Var.e;
        if (vr10Var != null) {
            ImmutableList<String> immutableList = vr10Var.A;
            byte[] bArr = vr10Var.f;
            CharSequence charSequence = vr10Var.a;
            if (charSequence != null) {
                a2.a = charSequence;
            }
            CharSequence charSequence2 = vr10Var.b;
            if (charSequence2 != null) {
                a2.b = charSequence2;
            }
            CharSequence charSequence3 = vr10Var.c;
            if (charSequence3 != null) {
                a2.c = charSequence3;
            }
            CharSequence charSequence4 = vr10Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = vr10Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = vr10Var.g;
                a2.f = bArr == null ? null : (byte[]) bArr.clone();
                a2.g = num;
            }
            Integer num2 = vr10Var.h;
            if (num2 != null) {
                a2.h = num2;
            }
            Integer num3 = vr10Var.i;
            if (num3 != null) {
                a2.i = num3;
            }
            Integer num4 = vr10Var.j;
            if (num4 != null) {
                a2.j = num4;
            }
            Boolean bool = vr10Var.k;
            if (bool != null) {
                a2.k = bool;
            }
            Integer num5 = vr10Var.l;
            if (num5 != null) {
                a2.l = num5;
            }
            Integer num6 = vr10Var.m;
            if (num6 != null) {
                a2.l = num6;
            }
            Integer num7 = vr10Var.n;
            if (num7 != null) {
                a2.m = num7;
            }
            Integer num8 = vr10Var.o;
            if (num8 != null) {
                a2.n = num8;
            }
            Integer num9 = vr10Var.p;
            if (num9 != null) {
                a2.o = num9;
            }
            Integer num10 = vr10Var.q;
            if (num10 != null) {
                a2.p = num10;
            }
            Integer num11 = vr10Var.r;
            if (num11 != null) {
                a2.q = num11;
            }
            CharSequence charSequence6 = vr10Var.s;
            if (charSequence6 != null) {
                a2.r = charSequence6;
            }
            CharSequence charSequence7 = vr10Var.t;
            if (charSequence7 != null) {
                a2.s = charSequence7;
            }
            CharSequence charSequence8 = vr10Var.u;
            if (charSequence8 != null) {
                a2.t = charSequence8;
            }
            Integer num12 = vr10Var.v;
            if (num12 != null) {
                a2.u = num12;
            }
            Integer num13 = vr10Var.w;
            if (num13 != null) {
                a2.v = num13;
            }
            CharSequence charSequence9 = vr10Var.x;
            if (charSequence9 != null) {
                a2.w = charSequence9;
            }
            CharSequence charSequence10 = vr10Var.y;
            if (charSequence10 != null) {
                a2.x = charSequence10;
            }
            Integer num14 = vr10Var.z;
            if (num14 != null) {
                a2.y = num14;
            }
            if (!immutableList.isEmpty()) {
                a2.z = ImmutableList.m(immutableList);
            }
        }
        return new vr10(a2);
    }

    public final void z() {
        X();
        K();
        Q(null);
        J(0, 0);
    }

    /* compiled from: ExoPlayerImpl.java */
    public final class b implements androidx.media3.exoplayer.video.g, androidx.media3.exoplayer.audio.b, ako0, ui20, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, kkk0.b, tc4.b, ExoPlayer.a, ssm0.a {
        public b() {
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void a(final int i) {
            nx5<Integer> nx5Var = c.this.D;
            szs szsVar = new szs() { // from class: xsna.m6q
                @Override // xsna.szs
                public final Object apply(Object obj) {
                    return Integer.valueOf(i);
                }
            };
            nx5Var.getClass();
            fxc0.z(Looper.myLooper() == nx5Var.b.getLooper());
            nx5Var.f++;
            nx5Var.b(new lx5(0, nx5Var, szsVar));
            Integer num = nx5Var.d;
            nx5Var.c(Integer.valueOf(i));
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void b(long j, Object obj) {
            c cVar = c.this;
            cVar.t.b(j, obj);
            if (cVar.V == obj) {
                cVar.n.f(26, new dr(15));
            }
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void c(Exception exc) {
            c.this.t.c(exc);
        }

        @Override // xsna.ako0
        public final void d(ukk ukkVar) {
            c cVar = c.this;
            cVar.h0 = ukkVar;
            cVar.n.f(27, new z8(ukkVar, 15));
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void e(g8l g8lVar) {
            c cVar = c.this;
            cVar.d0 = g8lVar;
            cVar.t.e(g8lVar);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void f(g8l g8lVar) {
            c cVar = c.this;
            cVar.t.f(g8lVar);
            cVar.d0 = null;
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void g(androidx.media3.common.a aVar, @Nullable n8l n8lVar) {
            c.this.t.g(aVar, n8lVar);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public final void h() {
            c.this.W();
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void i(int i, long j, long j2) {
            c.this.t.i(i, j, j2);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void j(String str) {
            c.this.t.j(str);
        }

        @Override // xsna.ui20
        public final void k(fi20 fi20Var) {
            c cVar = c.this;
            ihz<jza0.b> ihzVar = cVar.n;
            vr10.a a = cVar.o0.a();
            int i = 0;
            while (true) {
                fi20.a[] aVarArr = fi20Var.a;
                if (i >= aVarArr.length) {
                    break;
                }
                aVarArr[i].c(a);
                i++;
            }
            cVar.o0 = new vr10(a);
            vr10 y = cVar.y();
            if (!y.equals(cVar.U)) {
                cVar.U = y;
                ihzVar.c(14, new qj4(this, 13));
            }
            ihzVar.c(28, new b9(fi20Var, 17));
            ihzVar.b();
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void l(String str) {
            c.this.t.l(str);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void m(int i, long j) {
            c.this.t.m(i, j);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void n(g8l g8lVar) {
            c.this.t.n(g8lVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void o(AudioSink.a aVar) {
            c.this.t.o(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onAudioDecoderInitialized(String str, long j, long j2) {
            c.this.t.onAudioDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void onDroppedFrames(int i, long j) {
            c.this.t.onDroppedFrames(i, j);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void onSkipSilenceEnabledChanged(final boolean z) {
            c cVar = c.this;
            if (cVar.g0 == z) {
                return;
            }
            cVar.g0 = z;
            cVar.n.f(23, new ihz.a() { // from class: xsna.n6q
                @Override // xsna.ihz.a
                public final void invoke(Object obj) {
                    ((jza0.b) obj).onSkipSilenceEnabledChanged(z);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface surface = new Surface(surfaceTexture);
            c cVar = c.this;
            cVar.Q(surface);
            cVar.W = surface;
            cVar.J(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            c cVar = c.this;
            cVar.Q(null);
            cVar.J(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            c.this.J(i, i2);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void onVideoDecoderInitialized(String str, long j, long j2) {
            c.this.t.onVideoDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void onVideoSizeChanged(xgt0 xgt0Var) {
            c.this.n.f(25, new d9(xgt0Var, 13));
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void p(AudioSink.a aVar) {
            c.this.t.p(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void q(Exception exc) {
            c.this.t.q(exc);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void r(long j) {
            c.this.t.r(j);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void s(g8l g8lVar) {
            c.this.t.s(g8lVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            c.this.J(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            c cVar = c.this;
            if (cVar.Z) {
                cVar.Q(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            c cVar = c.this;
            if (cVar.Z) {
                cVar.Q(null);
            }
            cVar.J(0, 0);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void t(Exception exc) {
            c.this.t.t(exc);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void u(androidx.media3.common.a aVar, @Nullable n8l n8lVar) {
            c.this.t.u(aVar, n8lVar);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void v(qzf qzfVar) {
            a.a(c.this.H, qzfVar);
        }

        @Override // androidx.media3.exoplayer.audio.b
        public final void w(qzf qzfVar) {
            a.a(c.this.G, qzfVar);
        }

        @Override // xsna.kkk0.b
        public final void x(Surface surface) {
            c.this.Q(surface);
        }

        @Override // xsna.ako0
        public final void y(com.google.common.collect.g gVar) {
            c.this.n.f(27, new rj4(gVar, 12));
        }

        @Override // xsna.kkk0.b
        public final void z() {
            c.this.Q(null);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
