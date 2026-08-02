package androidx.media3.transformer;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.source.i;
import androidx.media3.transformer.a;
import androidx.media3.transformer.e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import xsna.ahn;
import xsna.ako0;
import xsna.chp0;
import xsna.dip0;
import xsna.dvf;
import xsna.ewo0;
import xsna.fxc0;
import xsna.i2e0;
import xsna.io20;
import xsna.izf0;
import xsna.jza0;
import xsna.kr10;
import xsna.npl;
import xsna.rf1;
import xsna.slp0;
import xsna.sn;
import xsna.uel;
import xsna.ui20;
import xsna.y2r0;
import xsna.zhn0;

/* compiled from: ExoPlayerAssetLoader.java */
/* loaded from: classes12.dex */
public final class s implements androidx.media3.transformer.a {
    public final Context a;
    public final m b;
    public final androidx.media3.transformer.c c;
    public final androidx.media3.exoplayer.c d;
    public int e;

    /* compiled from: ExoPlayerAssetLoader.java */
    public static final class a implements a.b {
        public final Context a;
        public final e.a b;
        public final dvf c;

        @Nullable
        public final LogSessionId d;

        public a(Context context, j jVar, dvf dvfVar, @Nullable LogSessionId logSessionId) {
            this.a = context;
            this.b = jVar;
            this.c = dvfVar;
            this.d = logSessionId;
        }

        @Override // androidx.media3.transformer.a.b
        public final androidx.media3.transformer.a a(m mVar, Looper looper, a.c cVar, a.C0070a c0070a) {
            uel uelVar = new uel();
            mVar.getClass();
            androidx.media3.exoplayer.source.e eVar = new androidx.media3.exoplayer.source.e(this.a, uelVar);
            npl.d.a aVar = new npl.d.a();
            aVar.v = true;
            aVar.C = false;
            rf1 rf1Var = new rf1(new npl.d(aVar), 24);
            b.a aVar2 = new b.a();
            aVar2.b(50000, 50000, 100, 200);
            aVar2.c(false);
            androidx.media3.exoplayer.b a = aVar2.a();
            return new s(this.a, mVar, eVar, this.b, c0070a.a, looper, cVar, this.c, rf1Var, this.d, a);
        }
    }

    /* compiled from: ExoPlayerAssetLoader.java */
    public final class b implements jza0.b {
        public final a.c b;

        public b(a.c cVar) {
            this.b = cVar;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
        @Override // xsna.jza0.b
        public final void N(dip0 dip0Var) {
            a.c cVar = this.b;
            boolean z = true;
            try {
                ?? a = dip0Var.a(1);
                int i = a;
                if (dip0Var.a(2)) {
                    i = a + 1;
                }
                for (int i2 = 0; i2 < dip0Var.a.size(); i2++) {
                    int i3 = dip0Var.a.get(i2).b.c;
                    if (i3 != 1 && i3 != 2) {
                        sn.d(i3, "Unsupported track type: ");
                    }
                }
                s sVar = s.this;
                if (i > 0) {
                    cVar.e(i);
                    sVar.d.setPlayWhenReady(true);
                    return;
                }
                String b = c0.b(sVar.a, sVar.b.a);
                if (b == null || !io20.n(b)) {
                    z = false;
                }
                cVar.a(ExportException.a(1001, new IllegalStateException(z ? "The asset loader has no audio or video track to output. Try setting an image duration on input image MediaItems." : "The asset loader has no audio or video track to output.")));
            } catch (RuntimeException e) {
                cVar.a(ExportException.a(1000, e));
            }
        }

        @Override // xsna.jza0.b
        public final void onPlayerError(PlaybackException playbackException) {
            Throwable cause = playbackException.getCause();
            if ((cause instanceof ExoTimeoutException) && ((ExoTimeoutException) cause).timeoutOperation == 1) {
                ahn.o("ExoPlayerAssetLoader", "Releasing the player timed out.", playbackException);
            } else {
                Object obj = ExportException.b.get(playbackException.d());
                this.b.a(ExportException.a(((Integer) (obj != null ? obj : 1000)).intValue(), playbackException));
            }
        }

        @Override // xsna.jza0.b
        public final void z(ewo0 ewo0Var, int i) {
            int i2;
            a.c cVar = this.b;
            s sVar = s.this;
            try {
                if (sVar.e != 1) {
                    return;
                }
                ewo0.c cVar2 = new ewo0.c();
                ewo0Var.n(0, cVar2);
                if (cVar2.k) {
                    return;
                }
                long j = cVar2.m;
                if (j > 0 && j != C.TIME_UNSET) {
                    i2 = 2;
                    sVar.e = i2;
                    cVar.f(j);
                }
                i2 = 3;
                sVar.e = i2;
                cVar.f(j);
            } catch (RuntimeException e) {
                cVar.a(ExportException.a(1000, e));
            }
        }
    }

    /* compiled from: ExoPlayerAssetLoader.java */
    public static final class c implements izf0 {
        public final slp0 a = new slp0();
        public final boolean b;
        public final boolean c;
        public final androidx.media3.transformer.c d;
        public final int e;
        public final a.c f;

        @Nullable
        public final LogSessionId g;

        public c(boolean z, boolean z2, androidx.media3.transformer.c cVar, int i, a.c cVar2, @Nullable LogSessionId logSessionId) {
            this.b = z;
            this.c = z2;
            this.d = cVar;
            this.e = i;
            this.f = cVar2;
            this.g = logSessionId;
        }

        @Override // xsna.izf0
        public final androidx.media3.exoplayer.j[] a(Handler handler, androidx.media3.exoplayer.video.g gVar, androidx.media3.exoplayer.audio.b bVar, ako0 ako0Var, ui20 ui20Var) {
            ArrayList arrayList = new ArrayList();
            boolean z = this.b;
            a.c cVar = this.f;
            androidx.media3.transformer.c cVar2 = this.d;
            if (!z) {
                arrayList.add(new p(cVar2, this.a, cVar, this.g));
            }
            if (!this.c) {
                arrayList.add(new r(cVar2, this.e, this.a, cVar, this.g));
            }
            return (androidx.media3.exoplayer.j[]) arrayList.toArray(new androidx.media3.exoplayer.j[0]);
        }
    }

    public s(Context context, m mVar, final i.a aVar, e.a aVar2, int i, Looper looper, a.c cVar, dvf dvfVar, chp0.a aVar3, LogSessionId logSessionId, androidx.media3.exoplayer.e eVar) {
        this.a = context;
        this.b = mVar;
        androidx.media3.transformer.c cVar2 = new androidx.media3.transformer.c(aVar2);
        this.c = cVar2;
        npl.d dVar = (npl.d) ((rf1) aVar3).c;
        npl nplVar = new npl(context);
        nplVar.i(dVar);
        ExoPlayer.b bVar = new ExoPlayer.b(context, new c(mVar.b, mVar.c, cVar2, i, cVar, logSessionId));
        fxc0.z(!bVar.y);
        bVar.d = new zhn0() { // from class: xsna.r5q
            @Override // xsna.zhn0
            public final Object get() {
                return i.a.this;
            }
        };
        bVar.d(nplVar);
        bVar.b(eVar);
        bVar.c(looper);
        fxc0.z(!bVar.y);
        bVar.s = Integer.MAX_VALUE;
        fxc0.z(!bVar.y);
        bVar.t = Integer.MAX_VALUE;
        fxc0.z(!bVar.y);
        bVar.u = Integer.MAX_VALUE;
        fxc0.z(!bVar.y);
        bVar.w = false;
        if (aVar2 instanceof j) {
            ((j) aVar2).getClass();
            fxc0.z(!bVar.y);
        }
        if (dvfVar != dvf.a) {
            fxc0.z(!bVar.y);
            bVar.b = dvfVar;
        }
        androidx.media3.exoplayer.c a2 = bVar.a();
        this.d = a2;
        a2.n.a(new b(cVar));
        this.e = 0;
    }

    @Override // androidx.media3.transformer.a
    public final int c(i2e0 i2e0Var) {
        if (this.e == 2) {
            androidx.media3.exoplayer.c cVar = this.d;
            long duration = cVar.getDuration();
            i2e0Var.a = y2r0.X(Math.min(cVar.getCurrentPosition(), duration), duration);
        }
        return this.e;
    }

    @Override // androidx.media3.transformer.a
    public final ImmutableMap<Integer, String> g() {
        ImmutableMap.a aVar = new ImmutableMap.a(4);
        androidx.media3.transformer.c cVar = this.c;
        String str = cVar.b;
        if (str != null) {
            aVar.d(1, str);
        }
        String str2 = cVar.c;
        if (str2 != null) {
            aVar.d(2, str2);
        }
        return aVar.a(true);
    }

    @Override // androidx.media3.transformer.a
    public final void release() {
        this.d.release();
        this.e = 0;
    }

    @Override // androidx.media3.transformer.a
    public final void start() {
        kr10 kr10Var = this.b.a;
        androidx.media3.exoplayer.c cVar = this.d;
        cVar.getClass();
        cVar.f(ImmutableList.p(kr10Var));
        cVar.prepare();
        this.e = 1;
    }
}
