package com.vk.clips.editor.templates.impl.player;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.templates.impl.player.VideoScale;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import xsna.ag30;
import xsna.b4t0;
import xsna.bv9;
import xsna.cgr;
import xsna.cms0;
import xsna.dap;
import xsna.deb0;
import xsna.eap;
import xsna.ewo0;
import xsna.ftk;
import xsna.fxc0;
import xsna.iv1;
import xsna.ja3;
import xsna.jk80;
import xsna.kf3;
import xsna.l2t;
import xsna.o3i0;
import xsna.ocr;
import xsna.psm0;
import xsna.r8l;
import xsna.rhh0;
import xsna.rt4;
import xsna.sht0;
import xsna.tn9;
import xsna.tnf;
import xsna.to2;
import xsna.u12;
import xsna.um80;
import xsna.wn80;
import xsna.x9v;
import xsna.xgp0;
import xsna.xk80;
import xsna.xqc;
import xsna.y2r0;
import xsna.y6b0;
import xsna.y8d;
import xsna.yds0;
import xsna.zfd;

/* compiled from: ClipsVideoView.java */
@Deprecated
/* loaded from: classes16.dex */
public final class a extends l2t {
    public static int T;
    public l A;
    public g B;
    public k C;
    public h D;
    public rt4 E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public boolean L;
    public float M;

    @Nullable
    public androidx.media3.datasource.cache.c N;

    @Nullable
    public um80 O;
    public List<yds0> P;
    public boolean Q;
    public VideoSourceType R;

    @Nullable
    public String S;
    public final m m;
    public final Handler n;
    public cgr o;
    public final e p;
    public a.InterfaceC0045a q;
    public final AtomicReference<OneVideoPlayer> r;
    public final b4t0 s;
    public final VideoScale t;
    public sht0 u;
    public y6b0 v;
    public Surface w;
    public int x;
    public int y;
    public int z;

    /* compiled from: ClipsVideoView.java */
    /* renamed from: com.vk.clips.editor.templates.impl.player.a$a, reason: collision with other inner class name */
    public class C0581a {
        public C0581a() {
        }
    }

    /* compiled from: ClipsVideoView.java */
    public class b {
        public b() {
        }
    }

    /* compiled from: ClipsVideoView.java */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[VideoSourceType.values().length];
            a = iArr;
            try {
                iArr[VideoSourceType.HLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[VideoSourceType.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[VideoSourceType.DASH_WEBM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[VideoSourceType.MP4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: ClipsVideoView.java */
    public final class e implements one.video.player.f {
        public e() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, @NonNull OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
            if (discontinuityReason == OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION || discontinuityReason == OneVideoPlayer.DiscontinuityReason.SEEK) {
                a.this.t();
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(@NonNull BaseVideoPlayer baseVideoPlayer, @Nullable one.video.player.tracks.c cVar) {
            int i;
            int i2;
            a aVar = a.this;
            if (aVar.r()) {
                return;
            }
            if (cVar != null) {
                cms0 cms0Var = (cms0) cVar.c;
                i2 = cms0Var.e;
                i = cms0Var.f;
            } else {
                i = 0;
                i2 = 0;
            }
            m mVar = aVar.m;
            int i3 = m.b;
            mVar.getClass();
            mVar.sendMessage(Message.obtain(mVar, 5, i2, i, 0));
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(@NonNull OneVideoPlayer oneVideoPlayer) {
            a aVar = a.this;
            if (aVar.r()) {
                return;
            }
            a.m(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[EDGE_INSN: B:20:0x006b->B:21:0x006b BREAK  A[LOOP:0: B:10:0x0035->B:13:0x0065], SYNTHETIC] */
        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void q(@NonNull OneVideoPlaybackException oneVideoPlaybackException, @NonNull sht0 sht0Var, @NonNull OneVideoPlayer oneVideoPlayer) {
            int i;
            String str;
            int length;
            int i2;
            int codePointAt;
            a aVar = a.this;
            if (aVar.getContext() != null) {
                Point z = y2r0.z(aVar.getContext());
                if (aVar.y * aVar.z > z.x * z.y) {
                    aVar.z();
                    i = 8;
                    str = aVar.S;
                    if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.SOURCE && str != null) {
                        length = str.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                break;
                            }
                            codePointAt = str.codePointAt(i2);
                            if (Character.isWhitespace(codePointAt)) {
                                i2 += Character.charCount(codePointAt);
                            } else if (!sht0Var.b.toString().contains(str)) {
                                aVar.y(sht0Var.b.buildUpon().authority(str).build(), false, aVar.getCurrentPosition(), true);
                                return;
                            }
                        }
                    }
                    aVar.setCurrentState(-1);
                    m mVar = aVar.m;
                    int i3 = m.b;
                    mVar.getClass();
                    mVar.sendMessage(Message.obtain(mVar, 6, i, 0, oneVideoPlaybackException));
                }
            }
            i = -1;
            str = aVar.S;
            if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.SOURCE) {
                length = str.length();
                i2 = 0;
                while (true) {
                    if (i2 < length) {
                    }
                    i2 += Character.charCount(codePointAt);
                }
            }
            aVar.setCurrentState(-1);
            m mVar2 = aVar.m;
            int i32 = m.b;
            mVar2.getClass();
            mVar2.sendMessage(Message.obtain(mVar2, 6, i, 0, oneVideoPlaybackException));
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(@NonNull OneVideoPlayer oneVideoPlayer) {
            a aVar = a.this;
            if (aVar.r()) {
                return;
            }
            a.n(aVar);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void v(@NonNull OneVideoPlayer oneVideoPlayer) {
            a aVar = a.this;
            if (aVar.r()) {
                return;
            }
            a.l(aVar);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void x(@NonNull OneVideoPlayer oneVideoPlayer) {
            a aVar = a.this;
            if (aVar.r()) {
                return;
            }
            m mVar = aVar.m;
            int i = m.b;
            mVar.getClass();
            mVar.sendMessage(Message.obtain(mVar, 4));
        }
    }

    /* compiled from: ClipsVideoView.java */
    public interface f {
    }

    /* compiled from: ClipsVideoView.java */
    public interface g {
        void b();
    }

    /* compiled from: ClipsVideoView.java */
    public interface h {
        void b(PlayerError playerError, @Nullable Exception exc);
    }

    /* compiled from: ClipsVideoView.java */
    public interface i {
    }

    /* compiled from: ClipsVideoView.java */
    public interface j {
    }

    /* compiled from: ClipsVideoView.java */
    public interface k {
        void c(long j);
    }

    /* compiled from: ClipsVideoView.java */
    public interface l {
    }

    /* compiled from: ClipsVideoView.java */
    public static class m extends Handler {
        public static final /* synthetic */ int b = 0;
        public final WeakReference<a> a;

        public m(a aVar) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(aVar);
        }

        public final void a() {
            if (hasMessages(7)) {
                return;
            }
            sendEmptyMessageDelayed(7, 15L);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            WeakReference<a> weakReference = this.a;
            a aVar = weakReference != null ? weakReference.get() : null;
            if (aVar == null) {
                return;
            }
            switch (message.what) {
                case 0:
                    l lVar = aVar.A;
                    if (lVar != null) {
                        ((y8d) ((kf3) lVar).c).b();
                        break;
                    }
                    break;
                case 1:
                    int i = a.T;
                    break;
                case 2:
                    int i2 = a.T;
                    break;
                case 3:
                    g gVar = aVar.B;
                    if (gVar != null) {
                        gVar.b();
                        break;
                    }
                    break;
                case 4:
                    int i3 = a.T;
                    break;
                case 5:
                    Object obj = message.obj;
                    int intValue = obj != null ? ((Integer) obj).intValue() : 0;
                    if (intValue % 180 == 90) {
                        aVar.y = message.arg2;
                        aVar.z = message.arg1;
                    } else {
                        aVar.y = message.arg1;
                        aVar.z = message.arg2;
                    }
                    aVar.t.f = intValue;
                    aVar.w();
                    break;
                case 6:
                    h hVar = aVar.D;
                    if (hVar != null) {
                        Object obj2 = message.obj;
                        Exception exc = obj2 instanceof Exception ? (Exception) obj2 : null;
                        PlayerError.a aVar2 = PlayerError.Companion;
                        int i4 = message.arg1;
                        aVar2.getClass();
                        hVar.b(PlayerError.a.a(i4), exc);
                        break;
                    }
                    break;
                case 7:
                    aVar.t();
                    if (aVar.s()) {
                        a();
                        break;
                    }
                    break;
            }
        }
    }

    public a(Context context) {
        super(context);
        this.m = new m(this);
        this.n = new Handler(Looper.getMainLooper());
        this.p = new e();
        this.q = new androidx.media3.datasource.d(getContext(), (String) null, (jk80.a) null);
        this.r = new AtomicReference<>();
        this.s = new b4t0(new C0581a());
        VideoScale.ScaleType scaleType = VideoScale.ScaleType.FIT_CENTER;
        VideoScale videoScale = new VideoScale();
        videoScale.a = scaleType;
        this.t = videoScale;
        this.w = null;
        this.x = 0;
        this.F = 3;
        this.G = false;
        this.H = false;
        this.L = true;
        this.M = 1.0f;
        new b();
        setSurfaceTextureListener(new c());
    }

    public static void d(a aVar, boolean z) {
        aVar.H = z;
        if (aVar.getPlayer() == null) {
            return;
        }
        if (z) {
            aVar.u();
            return;
        }
        OneVideoPlayer player = aVar.getPlayer();
        if (player != null) {
            player.pause();
            m mVar = aVar.m;
            int i2 = m.b;
            mVar.removeMessages(7);
        }
    }

    public static void e(a aVar) {
        OneVideoPlayer player = aVar.getPlayer();
        if (player != null) {
            player.c0(aVar.p);
            player.stop();
            player.clearVideoSurface();
            rt4 rt4Var = aVar.E;
            if (rt4Var != null) {
                player.B(rt4Var);
            }
            player.release();
            aVar.setCurrentState(0);
            aVar.setPlayer(null);
            L.e("a", "player released!");
        }
        aVar.getAudioManager().abandonAudioFocus(aVar.s);
    }

    public static void f(a aVar, long j2) {
        y6b0 y6b0Var;
        OneVideoPlayer player;
        List<yds0> list = aVar.P;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (aVar.N != null) {
            a.b bVar = new a.b();
            bVar.a = aVar.N;
            bVar.e = aVar.q;
            aVar.q = bVar;
        }
        if (aVar.Q) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < aVar.P.size(); i2++) {
                yds0 yds0Var = aVar.P.get(i2);
                ag30 ag30Var = new ag30(yds0Var.a);
                long j3 = yds0Var.f * 1000;
                long j4 = yds0Var.g;
                arrayList.add(new zfd(ag30Var, j3, j4 > 0 ? j4 * 1000 : Long.MIN_VALUE));
            }
            aVar.v = new y6b0(arrayList);
        } else {
            Uri uri = aVar.P.get(0).a;
            int i3 = d.a[aVar.R.ordinal()];
            if (i3 == 1) {
                aVar.u = new x9v(uri);
            } else if (i3 == 2 || i3 == 3) {
                aVar.u = new ftk(uri);
            } else {
                aVar.u = new ag30(uri);
            }
        }
        if (aVar.G && (player = aVar.getPlayer()) != null) {
            player.R(RepeatMode.ALL);
        }
        OneVideoPlayer player2 = aVar.getPlayer();
        if (player2 instanceof xk80) {
            xk80 xk80Var = (xk80) player2;
            xk80Var.B0(aVar.q);
            if (j2 == 0) {
                j2 = aVar.I;
                if (j2 == 0) {
                    j2 = aVar.J;
                }
            }
            OneVideoPlayer player3 = aVar.getPlayer();
            if (player3 != null) {
                if (!aVar.Q || (y6b0Var = aVar.v) == null) {
                    sht0 sht0Var = aVar.u;
                    if (sht0Var != null) {
                        if (aVar.H) {
                            player3.n0(sht0Var, j2);
                        } else {
                            player3.C(sht0Var, j2);
                        }
                    }
                } else {
                    if (aVar.H) {
                        player3.A(y6b0Var, aVar.q(j2));
                    } else {
                        player3.I(y6b0Var, aVar.q(j2));
                    }
                    k kVar = aVar.C;
                    if (kVar != null) {
                        kVar.c(j2);
                    }
                }
            }
            aVar.A();
            cgr cgrVar = aVar.o;
            aVar.C(cgrVar != null ? cgrVar.getSurfaceTexture() : aVar.getSurfaceTexture());
            if (aVar.K > 0) {
                um80 u0 = xk80Var.u0(new tn9(aVar, 3), aVar.n.getLooper());
                u0.c(aVar.K);
                u0.b();
                u0.a.b();
                aVar.O = u0;
            }
        }
    }

    public static /* synthetic */ void g(a aVar, long j2) {
        OneVideoPlayer player = aVar.getPlayer();
        if (player != null) {
            try {
                player.h0(aVar.q(j2));
                aVar.t();
            } catch (Exception e2) {
                L.i(e2);
            }
        }
    }

    private AudioManager getAudioManager() {
        return (AudioManager) getContext().getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public OneVideoPlayer getPlayer() {
        return this.r.get();
    }

    public static /* synthetic */ void h(a aVar, float f2) {
        OneVideoPlayer player = aVar.getPlayer();
        if (player != null) {
            player.setVolume(f2);
        }
    }

    public static /* synthetic */ void i(a aVar) {
        AudioManager audioManager = aVar.getAudioManager();
        b4t0 b4t0Var = aVar.s;
        if (audioManager.requestAudioFocus(b4t0Var, aVar.F, 2) == 1) {
            b4t0Var.onAudioFocusChange(2);
        } else {
            b4t0Var.onAudioFocusChange(-1);
        }
    }

    public static void j(a aVar) {
        Surface surface;
        if (aVar.getPlayer() != null) {
            return;
        }
        Context context = aVar.getContext();
        int i2 = wn80.a;
        xk80 xk80Var = new xk80(context.getApplicationContext(), null, null, null, null, false, new rhh0(8), xgp0.j, wn80.e, new r8l(false, false, 7), 2000L, null, null, false, new o3i0(0L, 0L), new psm0(0));
        xk80Var.d0(aVar.p);
        xk80Var.setVolume(aVar.M);
        rt4 rt4Var = aVar.E;
        if (rt4Var != null) {
            xk80Var.e0(rt4Var);
        }
        L.e("a", "initPlayer complete");
        aVar.setPlayer(xk80Var);
        OneVideoPlayer player = aVar.getPlayer();
        if (player == null || (surface = aVar.w) == null || !surface.isValid()) {
            return;
        }
        player.setVideoSurface(aVar.w);
    }

    public static /* synthetic */ void k(a aVar) {
        OneVideoPlayer player = aVar.getPlayer();
        if (player != null) {
            player.stop();
        }
    }

    public static void l(a aVar) {
        if (4 != aVar.getCurrentState()) {
            aVar.setCurrentState(4);
            m mVar = aVar.m;
            int i2 = m.b;
            mVar.getClass();
            mVar.sendMessage(Message.obtain(mVar, 1));
        }
    }

    public static void m(a aVar) {
        if (3 == aVar.getCurrentState()) {
            return;
        }
        aVar.setCurrentState(3);
        m mVar = aVar.m;
        int i2 = m.b;
        mVar.getClass();
        mVar.sendMessage(Message.obtain(mVar, 3));
    }

    public static void n(a aVar) {
        m mVar = aVar.m;
        if (2 != aVar.getCurrentState()) {
            aVar.setCurrentState(2);
            aVar.B();
            int i2 = m.b;
            mVar.getClass();
            mVar.sendMessage(Message.obtain(mVar, 2));
            mVar.sendMessage(Message.obtain(mVar, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setCurrentState(int i2) {
        this.x = i2;
    }

    private synchronized void setPlayer(OneVideoPlayer oneVideoPlayer) {
        try {
            this.r.set(oneVideoPlayer);
            if (oneVideoPlayer != null) {
                T++;
            } else {
                T--;
            }
            L.e("Count SimpleExoPlayer: " + T);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void A() {
        cgr cgrVar = this.o;
        m mVar = this.m;
        if (cgrVar == null || this.P == null) {
            if (cgrVar != null) {
                cgrVar.e();
            }
            if (s()) {
                return;
            }
            int i2 = m.b;
            mVar.removeMessages(7);
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i3 = 0; i3 < this.P.size(); i3++) {
            ocr ocrVar = this.P.get(i3).b;
            ocrVar.getClass();
            if (ocrVar.h) {
                z = true;
            }
            arrayList.add(ocrVar);
        }
        if (z) {
            this.o.e();
            return;
        }
        this.o.e();
        if (s()) {
            return;
        }
        int i4 = m.b;
        mVar.removeMessages(7);
    }

    public final void B() {
        OneVideoPlayer player = getPlayer();
        if (!(player instanceof xk80) || this.K <= 0) {
            um80 um80Var = this.O;
            if (um80Var != null) {
                um80Var.a();
                return;
            }
            return;
        }
        xk80 xk80Var = (xk80) player;
        um80 um80Var2 = this.O;
        if (um80Var2 != null) {
            um80Var2.a();
        }
        deb0 q = q(this.K);
        um80 u0 = xk80Var.u0(new xqc(this, 2), this.n.getLooper());
        androidx.media3.exoplayer.i iVar = u0.a;
        int i2 = q.a;
        long j2 = q.b;
        ewo0 ewo0Var = iVar.d;
        fxc0.z(!iVar.k);
        fxc0.p(j2 != C.TIME_UNSET);
        if (i2 < 0 || (!ewo0Var.p() && i2 >= ewo0Var.o())) {
            throw new IllegalSeekPositionException(ewo0Var, i2, j2);
        }
        iVar.h = i2;
        iVar.i = j2;
        u0.b();
        iVar.b();
        this.O = u0;
    }

    public final void C(SurfaceTexture surfaceTexture) {
        Surface surface;
        L.e("updateSurface, current surface=" + this.w);
        if (getPlayer() == null || surfaceTexture == null) {
            return;
        }
        Surface surface2 = this.w;
        if (surface2 == null || !surface2.isValid()) {
            Surface surface3 = this.w;
            if (surface3 != null) {
                surface3.release();
                this.w = null;
            }
            Surface surface4 = new Surface(surfaceTexture);
            if (!surface4.isValid()) {
                L.e("updateSurface, surface is not valid");
                surface4.release();
                return;
            }
            L.e("updateSurface, new surface=" + surface4);
            this.w = surface4;
            OneVideoPlayer player = getPlayer();
            if (player == null || (surface = this.w) == null || !surface.isValid()) {
                return;
            }
            player.setVideoSurface(this.w);
        }
    }

    @Override // xsna.l2t
    public final void b() {
        cgr cgrVar = this.o;
        if (cgrVar != null) {
            cgrVar.a();
        }
    }

    public int getCurrentIndex() {
        OneVideoPlayer player = getPlayer();
        if (player == null) {
            return -1;
        }
        return player.m0();
    }

    public long getCurrentPosition() {
        OneVideoPlayer player = getPlayer();
        long j2 = 0;
        if (player == null) {
            return 0L;
        }
        List<yds0> list = this.P;
        if (list == null || list.size() <= 1) {
            return player.getCurrentPosition();
        }
        int i2 = 0;
        while (true) {
            if (i2 >= player.m0()) {
                break;
            }
            if (this.P.size() <= i2) {
                L.l("a", "player's mediaSource list is shorter than videoDataList");
                break;
            }
            j2 += this.P.get(i2).b();
            i2++;
        }
        return player.getCurrentPosition() + j2;
    }

    public synchronized int getCurrentState() {
        return this.x;
    }

    @Nullable
    public yds0 getCurrentVideoItem() {
        int currentIndex;
        if (getPlayer() == null || (currentIndex = getCurrentIndex()) == -1 || this.P.size() < currentIndex) {
            return null;
        }
        return this.P.get(currentIndex);
    }

    public long getDuration() {
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            return player.getDuration();
        }
        return 0L;
    }

    public long getEndOnTimeMs() {
        return this.K;
    }

    @Nullable
    public cgr getFiltersRender() {
        return this.o;
    }

    public f getOnBufferingEventsListener() {
        return null;
    }

    public g getOnEndListener() {
        return this.B;
    }

    public h getOnErrorListener() {
        return this.D;
    }

    public i getOnFirstFrameRenderedListener() {
        return null;
    }

    public j getOnIndexChangedListener() {
        return null;
    }

    public k getOnPositionChangedListener() {
        return this.C;
    }

    public l getOnPreparedListener() {
        return this.A;
    }

    public float getSoundVolume() {
        return this.M;
    }

    public long getStartTimeMs() {
        return this.J;
    }

    @NonNull
    public List<yds0> getVideoDataList() {
        return new ArrayList(this.P);
    }

    public int getVideoHeight() {
        return this.z;
    }

    public float getVideoSpeed() {
        OneVideoPlayer player = getPlayer();
        return player != null ? player.b() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public int getVideoWidth() {
        return this.y;
    }

    @Override // xsna.l2t, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (s()) {
            int i2 = m.b;
            this.m.a();
        }
    }

    @Override // xsna.l2t, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = m.b;
        this.m.removeMessages(7);
    }

    public final deb0 q(long j2) {
        if (getPlayer() == null || this.P == null) {
            return deb0.d;
        }
        int i2 = 0;
        if (this.v == null) {
            return new deb0(0, j2, null);
        }
        long j3 = 0;
        while (i2 < this.P.size() - 1) {
            yds0 yds0Var = this.P.get(i2);
            if (yds0Var.b() + j3 >= j2) {
                break;
            }
            j3 += yds0Var.b();
            i2++;
        }
        return new deb0(i2, j2 - j3, null);
    }

    public final boolean r() {
        return this.r.get() == null;
    }

    public final boolean s() {
        cgr cgrVar = this.o;
        return (cgrVar != null && cgrVar.b()) || this.C != null;
    }

    public void setAudioProcessor(@Nullable rt4 rt4Var) {
        this.E = rt4Var;
    }

    public void setDataSourceFactory(a.InterfaceC0045a interfaceC0045a) {
        this.q = interfaceC0045a;
    }

    public void setFailoverHost(String str) {
        this.S = str;
    }

    public void setFiltersRenderer(cgr cgrVar) {
        if (cgrVar != null) {
            setSurfaceTextureListener(this);
            setEGLContextFactory(new eap());
            setEGLConfigChooser(new dap());
            this.o = cgrVar;
            cgrVar.h();
            this.o.i();
            setRenderer(this.o);
            L.e("a", "setFiltersRenderer: renderer=" + cgrVar);
        }
    }

    public void setFitVideo(boolean z) {
        this.t.a = z ? VideoScale.ScaleType.FIT_CENTER : VideoScale.ScaleType.CENTER_CROP;
        w();
    }

    public void setLoop(boolean z) {
        this.G = z;
    }

    public void setMute(boolean z) {
        setSoundVolume(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
    }

    public void setNeedRequestAudioFocus(boolean z) {
        this.L = z;
    }

    public void setOnEndListener(g gVar) {
        this.B = gVar;
    }

    public void setOnErrorListener(h hVar) {
        this.D = hVar;
    }

    public void setOnPositionChangedListener(k kVar) {
        this.C = kVar;
    }

    public void setOnPreparedListener(l lVar) {
        this.A = lVar;
    }

    public void setPlayWhenReady(final boolean z) {
        v(new Runnable() { // from class: xsna.rnf
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.clips.editor.templates.impl.player.a.d(com.vk.clips.editor.templates.impl.player.a.this, z);
            }
        });
    }

    public void setScaleType(@NonNull VideoScale.ScaleType scaleType) {
        this.t.a = scaleType;
        w();
    }

    public void setSoundVolume(final float f2) {
        v(new Runnable() { // from class: xsna.qnf
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.clips.editor.templates.impl.player.a.h(com.vk.clips.editor.templates.impl.player.a.this, f2);
            }
        });
        float f3 = this.M;
        if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.L && f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            v(new to2(this, 4));
        }
        this.M = f2;
    }

    public void setStreamType(int i2) {
        this.F = i2;
    }

    public void setVideoDataForFilter(@NonNull List<yds0> list) {
        List<yds0> list2 = this.P;
        if (list2 == null || !list2.equals(list)) {
            x(list, true, 0L, true);
        } else {
            this.P = list;
            A();
        }
    }

    public void setVideoSourceType(VideoSourceType videoSourceType) {
        this.R = videoSourceType;
    }

    public void setVideoSpeed(float f2) {
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            player.setPlaybackSpeed(f2);
        }
    }

    public void setVideoUri(Uri uri) {
        y(uri, true, 0L, true);
    }

    public final void t() {
        OneVideoPlayer player = getPlayer();
        if (player == null) {
            return;
        }
        cgr cgrVar = this.o;
        if (cgrVar != null) {
            player.m0();
            cgrVar.j();
            cgr cgrVar2 = this.o;
            getCurrentPosition();
            cgrVar2.g();
        }
        k kVar = this.C;
        if (kVar != null) {
            kVar.c(getCurrentPosition());
        }
    }

    public final void u() {
        OneVideoPlayer player = getPlayer();
        if (this.w == null || player == null) {
            return;
        }
        L.e("a", "play surface=" + this.w + ", player=" + player);
        boolean z = this.H;
        m mVar = this.m;
        if (z) {
            player.resume();
            if (s()) {
                int i2 = m.b;
                mVar.a();
                return;
            }
            return;
        }
        OneVideoPlayer player2 = getPlayer();
        if (player2 != null) {
            player2.pause();
            int i3 = m.b;
            mVar.removeMessages(7);
        }
    }

    public final void v(Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.n;
        if (myLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final void w() {
        Matrix matrix;
        float f2;
        float f3;
        float f4;
        int i2 = this.y;
        int i3 = this.z;
        int i4 = i3 * i2;
        VideoScale videoScale = this.t;
        if (i4 == 0) {
            videoScale.getClass();
            return;
        }
        videoScale.c = i3;
        videoScale.b = i2;
        videoScale.d = getWidth();
        videoScale.e = getHeight();
        int i5 = VideoScale.a.a[videoScale.a.ordinal()];
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = 1.0f;
        Matrix matrix2 = null;
        try {
            switch (i5) {
                case 1:
                    matrix2 = videoScale.a();
                    break;
                case 2:
                    matrix = new Matrix();
                    int i6 = videoScale.d;
                    int i7 = videoScale.e;
                    float f7 = videoScale.b;
                    float f8 = i6;
                    float f9 = f7 / f8;
                    float f10 = videoScale.c;
                    float f11 = i7;
                    float f12 = f10 / f11;
                    float f13 = f8 - (f7 / f12);
                    float f14 = f11 - (f10 / f9);
                    if (f9 < f12) {
                        f4 = (1.0f / f9) * f12;
                    } else {
                        f4 = 1.0f;
                        f6 = (1.0f / f12) * f9;
                        f14 = 0.0f;
                        f5 = f13;
                    }
                    matrix.setScale(f6, f4);
                    matrix.postTranslate(f5 / 2.0f, f14 / 2.0f);
                    videoScale.b(matrix, i6, i7);
                    matrix2 = matrix;
                    break;
                case 3:
                    matrix = new Matrix();
                    matrix.setScale(videoScale.b / videoScale.d, videoScale.c / videoScale.e);
                    matrix2 = matrix;
                    break;
                case 4:
                    matrix = new Matrix();
                    matrix.setScale(1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 5:
                    try {
                        matrix = new Matrix();
                        int i8 = videoScale.d;
                        float f15 = videoScale.b / i8;
                        float f16 = videoScale.c / videoScale.e;
                        if (f15 > f16) {
                            f3 = (1.0f / f15) * f16;
                        } else {
                            f3 = 1.0f;
                            f6 = (1.0f / f16) * f15;
                        }
                        matrix.setScale(f6, f3);
                        matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        matrix2 = matrix;
                        break;
                    } catch (NumberFormatException e2) {
                        L.g("can't scale", e2);
                        break;
                    }
                case 6:
                    try {
                        matrix = new Matrix();
                        int i9 = videoScale.d;
                        int i10 = videoScale.e;
                        float f17 = videoScale.b;
                        float f18 = i9;
                        float f19 = f17 / f18;
                        float f20 = videoScale.c;
                        float f21 = i10;
                        float f22 = f20 / f21;
                        float f23 = f18 - (f17 / f22);
                        float f24 = f21 - (f20 / f19);
                        if (f19 > f22) {
                            f2 = (1.0f / f19) * f22;
                        } else {
                            f24 = 0.0f;
                            f5 = f23;
                            f2 = 1.0f;
                            f6 = (1.0f / f22) * f19;
                        }
                        matrix.setScale(f6, f2);
                        matrix.postTranslate(f5, f24);
                        matrix2 = matrix;
                        break;
                    } catch (NumberFormatException e3) {
                        L.g("error: ", e3);
                        break;
                    }
                case 7:
                    matrix = new Matrix();
                    int i11 = videoScale.d;
                    int i12 = videoScale.e;
                    matrix.setScale(videoScale.b / i11, videoScale.c / i12);
                    matrix.postTranslate((i11 - r6) / 2.0f, (i12 - r3) / 2.0f);
                    matrix2 = matrix;
                    break;
                case 8:
                    matrix = new Matrix();
                    int i13 = videoScale.d;
                    int i14 = videoScale.e;
                    float f25 = videoScale.b / i13;
                    float f26 = videoScale.c / i14;
                    if (f25 <= 1.0f && f26 <= 1.0f) {
                        matrix.setScale(f25, f26);
                        matrix.postTranslate((i13 - r7) / 2.0f, (i14 - r9) / 2.0f);
                        matrix2 = matrix;
                        break;
                    }
                    matrix2 = videoScale.a();
                    break;
            }
        } catch (NumberFormatException unused) {
        }
        if (matrix2 != null) {
            setTransform(matrix2);
            postInvalidate();
        }
    }

    public final void x(List list, boolean z, final long j2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List<yds0> list2 = this.P;
        Uri uri = (list2 == null || list2.isEmpty()) ? null : this.P.get(0).a;
        List<yds0> list3 = this.P;
        L.e("setVideoUri: uris=(count=" + (list3 != null ? list3.size() : 0) + ",first=" + uri + ") -> (count=" + list.size() + ",first=" + ((yds0) list.get(0)).a + ")");
        this.P = new ArrayList(list);
        this.Q = z2;
        if (z) {
            this.I = 0L;
        }
        setCurrentState(1);
        L.e("a", "initPlayer");
        if (r()) {
            v(new bv9(this, 2));
        }
        this.y = 0;
        this.z = 0;
        um80 um80Var = this.O;
        if (um80Var != null) {
            um80Var.a();
            this.O = null;
        }
        v(new Runnable() { // from class: xsna.snf
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.clips.editor.templates.impl.player.a.f(com.vk.clips.editor.templates.impl.player.a.this, j2);
            }
        });
    }

    public final void y(Uri uri, boolean z, long j2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new yds0(uri, ocr.j.getSTUB(), 0, 0, 0L, 0L, 0L, 992));
        x(arrayList, z, j2, false);
    }

    public final void z() {
        setCurrentState(0);
        this.y = 0;
        this.z = 0;
        v(new u12(this, 5));
    }

    /* compiled from: ClipsVideoView.java */
    public class c implements TextureView.SurfaceTextureListener {
        public c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = a.T;
            StringBuilder sb = new StringBuilder("onSurfaceTextureAvailable: surfaceTexture=");
            sb.append(surfaceTexture);
            sb.append(", res=");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append(", state=");
            a aVar = a.this;
            sb.append(aVar.getCurrentState());
            L.e("a", sb.toString());
            aVar.v(new ja3(3, this, surfaceTexture));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i = a.T;
            L.e("a", "onSurfaceTextureDestroyed: surfaceTexture=" + surfaceTexture);
            a.this.v(new iv1(this, 3));
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = a.T;
            L.e("a", "onSurfaceTextureSizeChanged: surfaceTexture=" + surfaceTexture + ", res=" + i + "x" + i2);
            a.this.v(new tnf(this, 0));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public void setOnBufferingEventsListener(f fVar) {
    }

    public void setOnFirstFrameRenderedListener(i iVar) {
    }

    public void setOnIndexChangedListener(j jVar) {
    }

    public void setRawSourceLink(@Nullable String str) {
    }
}
