package androidx.media3.transformer;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.muxer.MuxerException;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.MuxerWrapper;
import androidx.media3.transformer.a;
import androidx.media3.transformer.a0;
import androidx.media3.transformer.b0;
import androidx.media3.transformer.e;
import androidx.media3.transformer.j;
import androidx.media3.transformer.t;
import com.google.common.collect.ImmutableList;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;
import xsna.a0m;
import xsna.a7l;
import xsna.ahn;
import xsna.ar4;
import xsna.boy0;
import xsna.c880;
import xsna.dds0;
import xsna.dvf;
import xsna.fxc0;
import xsna.g0h0;
import xsna.g7l;
import xsna.hdu;
import xsna.i2e0;
import xsna.io20;
import xsna.kms0;
import xsna.kr10;
import xsna.lhg;
import xsna.m6g;
import xsna.nr10;
import xsna.otu;
import xsna.p8p;
import xsna.t33;
import xsna.vip;
import xsna.wwi;
import xsna.y2r0;
import xsna.yzt;

/* compiled from: TransformerInternal.java */
/* loaded from: classes12.dex */
public final class b0 {
    public RuntimeException A;
    public int B;
    public int C;
    public boolean D;
    public final Context a;
    public final f b;
    public final boolean c;
    public final d d;
    public final b e;
    public final otu f;
    public final dvf g;
    public final long h;
    public final HandlerThread i;
    public final otu j;
    public final ArrayList k;
    public final Object l;
    public final a m;
    public final ArrayList n;
    public final MuxerWrapper o;
    public final wwi p;
    public final Object q;
    public final Object r;
    public final i2e0 s;
    public final Object t;
    public final ImmutableList<Integer> u;
    public final int v;
    public final boolean w;
    public boolean x;
    public long y;
    public int z;

    /* compiled from: TransformerInternal.java */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public final SparseArray<x> b;
        public final SparseArray<Boolean> c;
        public final SparseArray<Integer> d;

        /* compiled from: TransformerInternal.java */
        /* renamed from: androidx.media3.transformer.b0$a$a, reason: collision with other inner class name */
        public static final class C0071a {
            public final SparseArray<androidx.media3.common.a> a = new SparseArray<>();
            public int b = -1;
        }

        public a(f fVar) {
            for (int i = 0; i < fVar.a.size(); i++) {
                this.a.add(new C0071a());
            }
            this.b = new SparseArray<>();
            this.c = new SparseArray<>();
            this.d = new SparseArray<>();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i >= arrayList.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        C0071a c0071a = (C0071a) arrayList.get(i2);
                        if (c0071a.b == c0071a.a.size()) {
                        }
                    }
                    return true;
                }
                if (((C0071a) arrayList.get(i)).b == -1) {
                    break;
                }
                i++;
            }
        }

        public final void b(int i, x xVar) {
            SparseArray<x> sparseArray = this.b;
            fxc0.A(!y2r0.l(sparseArray, i), "Exactly one SampleExporter can be added for each track type.");
            sparseArray.put(i, xVar);
        }
    }

    /* compiled from: TransformerInternal.java */
    public interface b {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.transformer.b0, java.lang.Object] */
    public b0(Context context, f fVar, z zVar, ar4 ar4Var, kms0.b bVar, e.b bVar2, ImmutableList immutableList, int i, MuxerWrapper muxerWrapper, a0.b bVar3, u uVar, otu otuVar, g7l g7lVar, dvf dvfVar, long j, @Nullable LogSessionId logSessionId, boolean z) {
        f fVar2 = fVar;
        dvf dvfVar2 = dvfVar;
        ?? obj = new Object();
        obj.a = context;
        obj.b = fVar2;
        obj.d = new d(bVar2);
        obj.u = immutableList;
        obj.v = i;
        obj.e = bVar3;
        obj.f = otuVar;
        obj.g = dvfVar2;
        obj.h = j;
        obj.o = muxerWrapper;
        obj.w = z;
        StringBuilder a2 = t33.a("Init ", Integer.toHexString(System.identityHashCode(obj)), " [AndroidXMedia3/1.9.3] [");
        a2.append(y2r0.a);
        a2.append(X3.j.e);
        ahn.u(a2.toString());
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        obj.i = handlerThread;
        handlerThread.start();
        obj.k = new ArrayList();
        Looper looper = handlerThread.getLooper();
        obj.l = new Object();
        a aVar = new a(fVar2);
        ImmutableList<n> immutableList2 = fVar2.a;
        obj.m = aVar;
        LogSessionId logSessionId2 = logSessionId;
        g gVar = new g(context, new j(new j.a(context)), dvfVar2, logSessionId2);
        int i2 = 0;
        b0 b0Var = obj;
        while (i2 < immutableList2.size()) {
            c cVar = b0Var.new c(i2, fVar2, zVar, ar4Var, bVar, uVar, g7lVar, logSessionId2);
            b0 b0Var2 = b0Var;
            int i3 = i2;
            f fVar3 = fVar2;
            dvf dvfVar3 = dvfVar2;
            b0Var2.k.add(new y(immutableList2.get(i3), gVar, new a.C0070a(zVar.d, fVar3.e), cVar, dvfVar3, looper));
            b0Var2.z++;
            int i4 = i3 + 1;
            logSessionId2 = logSessionId;
            dvfVar2 = dvfVar3;
            b0Var = b0Var2;
            fVar2 = fVar3;
            i2 = i4;
        }
        final b0 b0Var3 = b0Var;
        dvf dvfVar4 = dvfVar2;
        b0Var3.c = b0Var3.z != immutableList2.size();
        b0Var3.q = new Object();
        b0Var3.p = new wwi();
        b0Var3.r = new Object();
        b0Var3.s = new i2e0();
        b0Var3.t = new Object();
        b0Var3.n = new ArrayList();
        b0Var3.j = dvfVar4.createHandler(looper, new Handler.Callback() { // from class: xsna.qlp0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                androidx.media3.transformer.b0 b0Var4 = androidx.media3.transformer.b0.this;
                if (!b0Var4.D || message.what == 4) {
                    try {
                        int i5 = message.what;
                        if (i5 == 1) {
                            ArrayList arrayList = b0Var4.k;
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                ((androidx.media3.transformer.y) arrayList.get(i6)).start();
                            }
                        } else {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    b0Var4.b();
                                    return true;
                                }
                                if (i5 != 4) {
                                    return false;
                                }
                                b0Var4.c(message.arg1, (ExportException) message.obj);
                                return true;
                            }
                            b0Var4.n.add((androidx.media3.transformer.x) message.obj);
                            if (!b0Var4.x) {
                                b0Var4.j.sendEmptyMessage(3);
                                b0Var4.x = true;
                                return true;
                            }
                        }
                    } catch (ExportException e) {
                        b0Var4.c(2, e);
                    } catch (RuntimeException e2) {
                        b0Var4.c(2, ExportException.d(e2));
                    }
                }
                return true;
            }
        });
    }

    public final void a() {
        synchronized (this.t) {
            try {
                if (this.D) {
                    return;
                }
                e();
                this.j.obtainMessage(4, 1, 0, null).b();
                this.g.getClass();
                this.p.b();
                this.p.d();
                RuntimeException runtimeException = this.A;
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() throws ExportException {
        int i;
        b0 b0Var = this;
        int i2 = 0;
        while (i2 < b0Var.n.size()) {
            while (true) {
                x xVar = (x) b0Var.n.get(i2);
                if (!xVar.d) {
                    androidx.media3.common.a l = xVar.l();
                    if (l != null) {
                        if (xVar.c != null) {
                            a.C0043a a2 = l.a();
                            a2.k = xVar.c;
                            l = new androidx.media3.common.a(a2);
                        }
                        if (!xVar.a.d(l.n)) {
                            String c2 = MediaCodecUtil.c(l);
                            if (xVar.a.d(c2)) {
                                a.C0043a a3 = l.a();
                                a3.m = io20.q(c2);
                                l = new androidx.media3.common.a(a3);
                            }
                        }
                        try {
                            xVar.a.a(l);
                            xVar.d = true;
                        } catch (MuxerException e) {
                            throw new ExportException("Muxer error", e, 7001, null);
                        } catch (MuxerWrapper.AppendTrackFormatException e2) {
                            throw new ExportException("Muxer error", e2, 7003, null);
                        }
                    }
                    if (xVar.m() && xVar.n()) {
                        b0Var = this;
                    }
                }
                if (xVar.m()) {
                    MuxerWrapper muxerWrapper = xVar.a;
                    int i3 = xVar.b;
                    if (muxerWrapper.f && y2r0.l(muxerWrapper.d, i3)) {
                        MuxerWrapper.b bVar = muxerWrapper.d.get(i3);
                        muxerWrapper.j = Math.max(0L, Math.min(muxerWrapper.j, bVar.c));
                        muxerWrapper.k = Math.max(muxerWrapper.k, bVar.f);
                        MuxerWrapper.a aVar = muxerWrapper.c;
                        androidx.media3.common.a aVar2 = bVar.a;
                        long j = bVar.f;
                        if (j > 0) {
                            long j2 = bVar.d;
                            if (j2 > 0) {
                                long j3 = bVar.c;
                                if (j != j3) {
                                    i = (int) y2r0.d0(j2, 8000000L, j - j3, RoundingMode.DOWN);
                                    int i4 = bVar.e;
                                    a0 a0Var = a0.this;
                                    if (i3 != 1) {
                                        t.a aVar3 = a0Var.s;
                                        aVar3.h = aVar2.n;
                                        fxc0.p(i > 0 || i == -2147483647);
                                        aVar3.d = i;
                                        int i5 = aVar2.F;
                                        if (i5 != -1) {
                                            t.a aVar4 = a0Var.s;
                                            aVar4.getClass();
                                            fxc0.p(i5 > 0 || i5 == -1);
                                            aVar4.e = i5;
                                        }
                                        int i6 = aVar2.G;
                                        if (i6 != -1) {
                                            t.a aVar5 = a0Var.s;
                                            aVar5.getClass();
                                            fxc0.p(i6 > 0 || i6 == -2147483647);
                                            aVar5.f = i6;
                                        }
                                    } else if (i3 == 2) {
                                        t.a aVar6 = a0Var.s;
                                        aVar6.o = aVar2.n;
                                        fxc0.p(i > 0 || i == -2147483647);
                                        aVar6.i = i;
                                        aVar6.j = aVar2.D;
                                        fxc0.p(i4 >= 0);
                                        aVar6.m = i4;
                                        int i7 = aVar2.v;
                                        if (i7 != -1) {
                                            t.a aVar7 = a0Var.s;
                                            aVar7.getClass();
                                            fxc0.p(i7 > 0 || i7 == -1);
                                            aVar7.k = i7;
                                        }
                                        int i8 = aVar2.u;
                                        if (i8 != -1) {
                                            t.a aVar8 = a0Var.s;
                                            aVar8.getClass();
                                            fxc0.p(i8 > 0 || i8 == -1);
                                            aVar8.l = i8;
                                        }
                                    }
                                    y2r0.H(i3);
                                    LinkedHashMap linkedHashMap = a7l.a;
                                    synchronized (a7l.class) {
                                    }
                                    if (muxerWrapper.m != 1) {
                                        muxerWrapper.d.delete(i3);
                                        if (muxerWrapper.d.size() == 0) {
                                            muxerWrapper.g = true;
                                            a7l.a();
                                        }
                                    } else if (i3 == 2) {
                                        muxerWrapper.n = true;
                                    } else if (i3 == 1) {
                                        muxerWrapper.o = true;
                                    }
                                    long j0 = y2r0.j0(muxerWrapper.k - muxerWrapper.j);
                                    if (muxerWrapper.m == 1 && muxerWrapper.n && (muxerWrapper.o || muxerWrapper.s == 1)) {
                                        MuxerWrapper.a aVar9 = muxerWrapper.c;
                                        long length = new File(muxerWrapper.a).length();
                                        ((a0.b) aVar9).a(j0, length > 0 ? length : -1L);
                                    } else if (muxerWrapper.g) {
                                        MuxerWrapper.a aVar10 = muxerWrapper.c;
                                        long length2 = new File(muxerWrapper.a).length();
                                        ((a0.b) aVar10).a(j0, length2 > 0 ? length2 : -1L);
                                    }
                                }
                            }
                        }
                        i = -2147483647;
                        int i42 = bVar.e;
                        a0 a0Var2 = a0.this;
                        if (i3 != 1) {
                        }
                        y2r0.H(i3);
                        LinkedHashMap linkedHashMap2 = a7l.a;
                        synchronized (a7l.class) {
                        }
                    }
                } else {
                    DecoderInputBuffer k = xVar.k();
                    if (k != null) {
                        try {
                            MuxerWrapper muxerWrapper2 = xVar.a;
                            int i9 = xVar.b;
                            ByteBuffer byteBuffer = k.e;
                            byteBuffer.getClass();
                            if (muxerWrapper2.e(i9, byteBuffer, k.b(1), k.g)) {
                                xVar.p();
                                b0Var = this;
                            }
                        } catch (MuxerException e3) {
                            throw new ExportException("Muxer error", e3, 7001, null);
                        }
                    }
                }
                if (xVar.m()) {
                }
            }
            i2++;
            b0Var = this;
        }
        if (!b0Var.D) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 >= b0Var.k.size()) {
                    synchronized (b0Var.r) {
                        b0Var.B = 2;
                        b0Var.C = i11 / i12;
                        break;
                    }
                }
                b0Var.b.a.get(i10).getClass();
                b0Var.s.a = 0;
                int c3 = ((y) b0Var.k.get(i10)).c(b0Var.s);
                if (c3 != 2) {
                    synchronized (b0Var.r) {
                        b0Var.B = c3;
                        b0Var.C = 0;
                    }
                    break;
                } else {
                    i11 += b0Var.s.a;
                    i12++;
                    i10++;
                }
            }
        }
        MuxerWrapper muxerWrapper3 = b0Var.o;
        if (muxerWrapper3.g) {
            return;
        }
        if (muxerWrapper3.m == 1 && muxerWrapper3.n && (muxerWrapper3.o || muxerWrapper3.s == 1)) {
            return;
        }
        b0Var.j.d(3, 10);
    }

    public final void c(int i, @Nullable ExportException exportException) {
        String str;
        ImmutableList.a aVar = new ImmutableList.a();
        int i2 = 0;
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            y yVar = (y) this.k.get(i3);
            yVar.h();
            aVar.e(yVar.i.g());
        }
        boolean z = i == 1;
        boolean z2 = this.D;
        ExportException exportException2 = null;
        if (!z2) {
            synchronized (this.t) {
                this.D = true;
            }
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
            ExportException exportException3 = null;
            for (int i4 = 0; i4 < this.n.size(); i4++) {
                try {
                    ((x) this.n.get(i4)).o();
                } catch (RuntimeException e) {
                    if (exportException3 == null) {
                        exportException3 = ExportException.d(e);
                        this.A = e;
                    }
                }
            }
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                try {
                    ((y) this.k.get(i5)).release();
                } catch (RuntimeException e2) {
                    if (exportException3 == null) {
                        exportException3 = ExportException.d(e2);
                        this.A = e2;
                    }
                }
            }
            try {
                MuxerWrapper muxerWrapper = this.o;
                if (i != 0) {
                    if (i == 1) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                        if (i != 2) {
                            throw new IllegalStateException(lhg.a(i, "Unexpected end reason "));
                        }
                    }
                }
                muxerWrapper.b(i2);
            } catch (MuxerException e3) {
                if (exportException3 == null) {
                    exportException3 = new ExportException("Muxer error", e3, 7001, null);
                }
            } catch (RuntimeException e4) {
                if (exportException3 == null) {
                    ExportException d = ExportException.d(e4);
                    this.A = e4;
                    exportException2 = d;
                }
            }
            exportException2 = exportException3;
            otu otuVar = this.j;
            HandlerThread handlerThread = this.i;
            Objects.requireNonNull(handlerThread);
            otuVar.post(new io.reactivex.rxjava3.android.a(handlerThread, 12));
        }
        if (z) {
            this.p.f();
            return;
        }
        if (exportException == null) {
            exportException = exportException2;
        }
        if (exportException == null) {
            if (z2) {
                return;
            }
            fxc0.z(this.f.post(new a0m(3, this, aVar)));
        } else if (z2) {
            ahn.G("Export error after export ended", exportException);
        } else {
            fxc0.z(this.f.post(new boy0(this, aVar, exportException, 6)));
        }
    }

    public final void d(ExportException exportException) {
        synchronized (this.t) {
            try {
                if (this.D) {
                    ahn.G("Export error after export ended", exportException);
                } else {
                    e();
                    this.j.obtainMessage(4, 2, 0, exportException).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        fxc0.A(this.i.isAlive(), "Internal thread is dead.");
    }

    /* compiled from: TransformerInternal.java */
    public final class c implements a.c {
        public final int a;
        public final m b;
        public final f c;
        public final z d;
        public final ar4 e;
        public final kms0.b f;
        public final u g;
        public final g7l h;

        @Nullable
        public final LogSessionId i;
        public long j;

        public c(int i, f fVar, z zVar, ar4 ar4Var, kms0.b bVar, u uVar, g7l g7lVar, @Nullable LogSessionId logSessionId) {
            this.a = i;
            this.b = (m) fVar.a.get(i).a.get(0);
            this.c = fVar;
            this.d = zVar;
            this.e = ar4Var;
            this.f = bVar;
            this.g = uVar;
            this.h = g7lVar;
            this.i = logSessionId;
        }

        @Override // androidx.media3.transformer.a.c
        public final void a(ExportException exportException) {
            b0.this.d(exportException);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0005, B:6:0x0010, B:9:0x0015, B:11:0x0035, B:12:0x0045, B:14:0x004b, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:24:0x0077, B:26:0x0079, B:31:0x009e, B:34:0x00ae, B:36:0x00c4, B:37:0x00cf, B:38:0x00dd, B:40:0x00e3, B:42:0x00f1, B:44:0x00f3, B:47:0x00f6, B:49:0x0104, B:50:0x0114, B:16:0x005a, B:56:0x0066), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e3 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0005, B:6:0x0010, B:9:0x0015, B:11:0x0035, B:12:0x0045, B:14:0x004b, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:24:0x0077, B:26:0x0079, B:31:0x009e, B:34:0x00ae, B:36:0x00c4, B:37:0x00cf, B:38:0x00dd, B:40:0x00e3, B:42:0x00f1, B:44:0x00f3, B:47:0x00f6, B:49:0x0104, B:50:0x0114, B:16:0x005a, B:56:0x0066), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0104 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0005, B:6:0x0010, B:9:0x0015, B:11:0x0035, B:12:0x0045, B:14:0x004b, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:24:0x0077, B:26:0x0079, B:31:0x009e, B:34:0x00ae, B:36:0x00c4, B:37:0x00cf, B:38:0x00dd, B:40:0x00e3, B:42:0x00f1, B:44:0x00f3, B:47:0x00f6, B:49:0x0104, B:50:0x0114, B:16:0x005a, B:56:0x0066), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
        @Override // androidx.media3.transformer.a.c
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g0h0 b(androidx.media3.common.a aVar) throws ExportException {
            boolean z;
            a aVar2;
            ArrayList arrayList;
            int i;
            synchronized (b0.this.l) {
                try {
                    if (!b0.this.m.a()) {
                        return null;
                    }
                    final int c = c0.c(aVar.n);
                    SparseArray<Boolean> sparseArray = b0.this.m.c;
                    fxc0.z(y2r0.l(sparseArray, c));
                    if (sparseArray.get(c).booleanValue()) {
                        a aVar3 = b0.this.m;
                        ArrayList arrayList2 = aVar3.a;
                        fxc0.A(aVar3.a(), "Primary track can only be queried after all tracks are added.");
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList2.size()) {
                                i2 = -1;
                                break;
                            }
                            if (y2r0.l(((a.C0071a) arrayList2.get(i2)).a, c)) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 == this.a) {
                            c(aVar);
                        }
                    } else {
                        g(c);
                    }
                    x xVar = b0.this.m.b.get(c);
                    if (xVar == null) {
                        return null;
                    }
                    final hdu j = xVar.j(this.b, aVar, this.a);
                    c880 c880Var = new c880() { // from class: xsna.rlp0
                        @Override // xsna.c880
                        public final void a(androidx.media3.transformer.m mVar, long j2, androidx.media3.common.a aVar4, boolean z2) {
                            b0.c cVar = b0.c.this;
                            int i3 = c;
                            hdu hduVar = j;
                            androidx.media3.transformer.b0 b0Var = androidx.media3.transformer.b0.this;
                            if (b0Var.c) {
                                synchronized (b0Var.l) {
                                    try {
                                        boolean z3 = true;
                                        if (((b0.a.C0071a) androidx.media3.transformer.b0.this.m.a.get(cVar.a)).a.size() <= 1 || i3 != 2) {
                                            cVar.c.a.get(cVar.a).getClass();
                                            fxc0.A(j2 != C.TIME_UNSET, "MediaItem duration required for sequence looping could not be extracted.");
                                            cVar.j += j2;
                                            synchronized (androidx.media3.transformer.b0.this.q) {
                                                if (z2) {
                                                    try {
                                                        androidx.media3.transformer.b0.this.z--;
                                                    } finally {
                                                    }
                                                }
                                                androidx.media3.transformer.b0 b0Var2 = androidx.media3.transformer.b0.this;
                                                if (b0Var2.z != 0) {
                                                    z3 = false;
                                                }
                                                long j3 = cVar.j;
                                                long j4 = b0Var2.y;
                                                if (j3 > j4 || z3) {
                                                    b0Var2.y = Math.max(j3, j4);
                                                    for (int i4 = 0; i4 < androidx.media3.transformer.b0.this.k.size(); i4++) {
                                                        ((androidx.media3.transformer.y) androidx.media3.transformer.b0.this.k.get(i4)).getClass();
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                            hduVar.a(mVar, j2, aVar4, z2);
                        }
                    };
                    HashMap hashMap = ((y) b0.this.k.get(this.a)).h;
                    if (c != 1 && c != 2) {
                        z = false;
                        fxc0.p(z);
                        fxc0.p(hashMap.get(Integer.valueOf(c)) != null);
                        hashMap.put(Integer.valueOf(c), c880Var);
                        SparseArray<Integer> sparseArray2 = b0.this.m.d;
                        sparseArray2.put(c, Integer.valueOf(y2r0.l(sparseArray2, c) ? 1 + sparseArray2.get(c).intValue() : 1));
                        aVar2 = b0.this.m;
                        arrayList = aVar2.a;
                        i = 0;
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (y2r0.l(((a.C0071a) arrayList.get(i3)).a, c)) {
                                i++;
                            }
                        }
                        if (aVar2.d.get(c).intValue() == i) {
                            b0.this.e();
                            b0.this.j.obtainMessage(2, xVar).b();
                        }
                        return j;
                    }
                    z = true;
                    fxc0.p(z);
                    fxc0.p(hashMap.get(Integer.valueOf(c)) != null);
                    hashMap.put(Integer.valueOf(c), c880Var);
                    SparseArray<Integer> sparseArray22 = b0.this.m.d;
                    sparseArray22.put(c, Integer.valueOf(y2r0.l(sparseArray22, c) ? 1 + sparseArray22.get(c).intValue() : 1));
                    aVar2 = b0.this.m;
                    arrayList = aVar2.a;
                    i = 0;
                    while (i3 < arrayList.size()) {
                    }
                    if (aVar2.d.get(c).intValue() == i) {
                    }
                    return j;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
        
            if (r23 > 1) goto L48;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(androidx.media3.common.a aVar) throws ExportException {
            androidx.media3.common.a aVar2;
            long j;
            boolean z;
            String str = aVar.n;
            int c = c0.c(str);
            b0 b0Var = b0.this;
            d dVar = b0Var.d;
            a aVar3 = b0Var.m;
            fxc0.z(aVar3.b.get(c) == null);
            SparseArray<androidx.media3.common.a> sparseArray = ((a.C0071a) aVar3.a.get(this.a)).a;
            fxc0.z(y2r0.l(sparseArray, c));
            androidx.media3.common.a aVar4 = sparseArray.get(c);
            boolean l = io20.l(str);
            f fVar = this.c;
            if (l) {
                aVar3.b(1, new androidx.media3.transformer.b(aVar4, aVar, this.d, this.b, fVar.c.a, this.e, dVar, b0Var.o, this.g, this.i));
                return;
            }
            if (io20.p(str)) {
                boolean z2 = this.d.d == 1;
                m6g m6gVar = aVar4.D;
                if (m6gVar == null || !m6gVar.f()) {
                    m6gVar = m6g.h;
                }
                if (z2 && m6g.h(m6gVar)) {
                    m6gVar = m6g.h;
                }
                a.C0043a a = aVar4.a();
                a.C = m6gVar;
                aVar2 = new androidx.media3.common.a(a);
            } else {
                if (!io20.n(str)) {
                    throw ExportException.d(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
                }
                a.C0043a a2 = aVar.a();
                m6g m6gVar2 = aVar.D;
                if (m6gVar2 == null || !m6gVar2.f()) {
                    m6gVar2 = m6g.h;
                }
                a2.C = m6gVar2;
                aVar2 = new androidx.media3.common.a(a2);
            }
            Context context = b0Var.a;
            dds0 dds0Var = fVar.b;
            ImmutableList<p8p> immutableList = fVar.c.b;
            MuxerWrapper muxerWrapper = b0Var.o;
            yzt yztVar = new yzt(this, 16);
            androidx.media3.common.a aVar5 = aVar2;
            long j2 = b0Var.h;
            ArrayList arrayList = aVar3.a;
            if (arrayList.size() < 2) {
                j = j2;
            } else {
                int i = 0;
                int i2 = 0;
                while (i < arrayList.size()) {
                    long j3 = j2;
                    if (y2r0.l(((a.C0071a) arrayList.get(i)).a, 2)) {
                        i2++;
                    }
                    i++;
                    j2 = j3;
                }
                j = j2;
                z = true;
            }
            z = false;
            aVar3.b(2, new e0(context, aVar5, this.d, dds0Var, immutableList, this.f, dVar, muxerWrapper, yztVar, this.g, this.h, j, z, b0Var.u, b0Var.v, this.i));
        }

        @Override // androidx.media3.transformer.a.c
        public final boolean d(int i, androidx.media3.common.a aVar) {
            boolean h;
            boolean z;
            int c = c0.c(aVar.n);
            synchronized (b0.this.l) {
                try {
                    a aVar2 = b0.this.m;
                    int i2 = this.a;
                    aVar2.getClass();
                    int c2 = c0.c(aVar.n);
                    SparseArray<androidx.media3.common.a> sparseArray = ((a.C0071a) aVar2.a.get(i2)).a;
                    boolean z2 = true;
                    fxc0.z(!y2r0.l(sparseArray, c2));
                    sparseArray.put(c2, aVar);
                    if (b0.this.m.a()) {
                        ArrayList arrayList = b0.this.m.a;
                        int i3 = 0;
                        int i4 = 0;
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            SparseArray<androidx.media3.common.a> sparseArray2 = ((a.C0071a) arrayList.get(i5)).a;
                            if (y2r0.l(sparseArray2, 1)) {
                                i3 = 1;
                            }
                            if (sparseArray2.indexOfKey(2) >= 0) {
                                i4 = 1;
                            }
                        }
                        int i6 = i3 + i4;
                        MuxerWrapper muxerWrapper = b0.this.o;
                        if (muxerWrapper.m != 2) {
                            fxc0.A(muxerWrapper.d.size() == 0, "The track count cannot be changed after adding track formats.");
                            muxerWrapper.s = i6;
                        }
                        this.g.e.set(i6);
                    }
                    h = h(i, aVar);
                    if (!h && c0.c(aVar.n) == 2) {
                        MuxerWrapper muxerWrapper2 = b0.this.o;
                        float d = c0.d(aVar, this.b.f.b);
                        if (d == 90.0f || d == 180.0f || d == 270.0f) {
                            int round = 360 - Math.round(d);
                            if (muxerWrapper2.d.size() != 0 && muxerWrapper2.r != round) {
                                z = false;
                                fxc0.A(z, "The additional rotation cannot be changed after adding track formats.");
                                muxerWrapper2.r = round;
                            }
                            z = true;
                            fxc0.A(z, "The additional rotation cannot be changed after adding track formats.");
                            muxerWrapper2.r = round;
                        }
                    }
                    SparseArray<Boolean> sparseArray3 = b0.this.m.c;
                    if (y2r0.l(sparseArray3, c)) {
                        if (h != sparseArray3.get(c).booleanValue()) {
                            z2 = false;
                        }
                        fxc0.z(z2);
                    } else {
                        sparseArray3.put(c, Boolean.valueOf(h));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return h;
        }

        @Override // androidx.media3.transformer.a.c
        public final void e(int i) {
            if (i <= 0) {
                a(ExportException.a(1001, new IllegalStateException("AssetLoader instances must provide at least 1 track.")));
                return;
            }
            synchronized (b0.this.l) {
                a aVar = b0.this.m;
                ((a.C0071a) aVar.a.get(this.a)).b = i;
            }
        }

        public final void g(int i) {
            b0 b0Var = b0.this;
            a aVar = b0Var.m;
            fxc0.z(aVar.b.get(i) == null);
            ImmutableList<n> immutableList = this.c.a;
            int i2 = this.a;
            fxc0.q(!immutableList.get(i2).a(), "Gaps can not be transmuxed.");
            SparseArray<androidx.media3.common.a> sparseArray = ((a.C0071a) aVar.a.get(i2)).a;
            fxc0.z(y2r0.l(sparseArray, i));
            aVar.b(i, new vip(sparseArray.get(i), this.d, b0Var.o, this.g, b0Var.h));
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x0156, code lost:
        
            if (r10.e == false) goto L89;
         */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x015e A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean h(int i, androidx.media3.common.a aVar) {
            boolean z;
            String str;
            z zVar;
            String str2;
            b0 b0Var = b0.this;
            boolean z2 = b0Var.w;
            d dVar = b0Var.d;
            boolean z3 = true;
            boolean z4 = false;
            boolean z5 = (i & 1) != 0;
            int c = c0.c(aVar.n);
            if (!z5) {
                return true;
            }
            if (c == 1) {
                MuxerWrapper muxerWrapper = b0Var.o;
                f fVar = this.c;
                ImmutableList<n> immutableList = fVar.a;
                z4 = true;
                if (immutableList.size() <= 1) {
                    int i2 = this.a;
                    if (immutableList.get(i2).a.e <= 1) {
                        ImmutableList<n> immutableList2 = fVar.a;
                        boolean z6 = false;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= immutableList2.size()) {
                                break;
                            }
                            if (immutableList2.get(i3).a()) {
                                z6 = true;
                                break;
                            }
                            i3++;
                        }
                        if (!z6 && !dVar.c() && (((str2 = (zVar = this.d).b) == null || str2.equals(aVar.n)) && ((zVar.b != null || muxerWrapper.d(aVar.n)) && ((m) immutableList.get(i2).a.get(0)).f.a.isEmpty() && fVar.c.a.isEmpty()))) {
                            return false;
                        }
                    }
                }
            } else if (c == 2) {
                MuxerWrapper muxerWrapper2 = b0Var.o;
                f fVar2 = this.c;
                ImmutableList<n> immutableList3 = fVar2.a;
                boolean z7 = true;
                if (immutableList3.size() <= 1) {
                    int i4 = this.a;
                    if (immutableList3.get(i4).a.e <= 1) {
                        if (!dVar.a()) {
                            z zVar2 = this.d;
                            if (zVar2.d == 0 && (((str = zVar2.c) == null || str.equals(aVar.n) || str.equals(MediaCodecUtil.c(aVar))) && ((str != null || muxerWrapper2.d(aVar.n) || muxerWrapper2.d(MediaCodecUtil.c(aVar))) && aVar.A == 1.0f))) {
                                m mVar = (m) immutableList3.get(i4).a.get(0);
                                ImmutableList.a aVar2 = new ImmutableList.a();
                                aVar2.e(mVar.f.b);
                                aVar2.e(fVar2.c.b);
                                com.google.common.collect.g g = aVar2.g();
                                if (g.isEmpty() || c0.d(aVar, g) != -1.0f) {
                                    z7 = false;
                                }
                            }
                        }
                        if (!z7) {
                            kr10 kr10Var = this.b.a;
                            if (!z2) {
                                kr10.c cVar = kr10Var.f;
                                if (cVar.a > 0) {
                                }
                            }
                            z = false;
                            if (z2 && z) {
                                z3 = false;
                            }
                            fxc0.A(z3, "Transcoding is required for track " + aVar + " but MP4 edit list trimming is enabled. Disable mp4EditListTrimEnabled or ensure this track does not require transcoding.");
                            return z;
                        }
                        z = true;
                        if (z2) {
                            z3 = false;
                        }
                        fxc0.A(z3, "Transcoding is required for track " + aVar + " but MP4 edit list trimming is enabled. Disable mp4EditListTrimEnabled or ensure this track does not require transcoding.");
                        return z;
                    }
                }
                z7 = true ^ fVar2.d;
                if (!z7) {
                }
                z = true;
                if (z2) {
                }
                fxc0.A(z3, "Transcoding is required for track " + aVar + " but MP4 edit list trimming is enabled. Disable mp4EditListTrimEnabled or ensure this track does not require transcoding.");
                return z;
            }
            return z4;
        }

        @Override // androidx.media3.transformer.a.c
        public final void f(long j) {
        }
    }
}
