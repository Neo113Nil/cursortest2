package j3;

import E0.C2942q;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.C5449k;
import j3.C7271m;
import java.util.List;
import java.util.Objects;
import l3.C7855a;
import l3.C7856b;

/* loaded from: classes.dex */
public interface y {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C7271m f69348a;

        /* renamed from: j3.y$a$a, reason: collision with other inner class name */
        public static final class C1130a {

            /* renamed from: a, reason: collision with root package name */
            private final C7271m.a f69349a = new C7271m.a();

            public final void a(int i11) {
                this.f69349a.a(i11);
            }

            public final void b(a aVar) {
                C7271m c7271m = aVar.f69348a;
                C7271m.a aVar2 = this.f69349a;
                aVar2.getClass();
                for (int i11 = 0; i11 < c7271m.d(); i11++) {
                    aVar2.a(c7271m.c(i11));
                }
            }

            public final void c(int... iArr) {
                C7271m.a aVar = this.f69349a;
                aVar.getClass();
                for (int i11 : iArr) {
                    aVar.a(i11);
                }
            }

            public final void d(int i11, boolean z11) {
                C7271m.a aVar = this.f69349a;
                if (z11) {
                    aVar.a(i11);
                } else {
                    aVar.getClass();
                }
            }

            public final a e() {
                return new a(this.f69349a.b());
            }
        }

        static {
            new C1130a().e();
            m3.N.L(0);
        }

        a(C7271m c7271m) {
            this.f69348a = c7271m;
        }

        public final boolean b(int i11) {
            return this.f69348a.a(i11);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f69348a.equals(((a) obj).f69348a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f69348a.hashCode();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C7271m f69350a;

        public b(C7271m c7271m) {
            this.f69350a = c7271m;
        }

        public final boolean a(int i11) {
            return this.f69350a.a(i11);
        }

        public final boolean b(int... iArr) {
            return this.f69350a.b(iArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f69350a.equals(((b) obj).f69350a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f69350a.hashCode();
        }
    }

    public interface c {
        default void D(boolean z11) {
        }

        default void E(int i11) {
        }

        @Deprecated
        default void L(int i11, boolean z11) {
        }

        default void N(boolean z11) {
        }

        default void O(int i11) {
        }

        default void Q(y yVar, b bVar) {
        }

        default void R(x xVar) {
        }

        default void T(a aVar) {
        }

        default void W(int i11, int i12) {
        }

        default void Y(w wVar) {
        }

        default void Z(boolean z11) {
        }

        default void a0(int i11, d dVar, d dVar2) {
        }

        default void c(int i11) {
        }

        default void d0(int i11) {
        }

        default void e0(s sVar) {
        }

        default void f0(C7255K c7255k) {
        }

        default void m(t tVar) {
        }

        default void onMediaItemTransition(C7275q c7275q, int i11) {
        }

        default void onPlayWhenReadyChanged(boolean z11, int i11) {
        }

        default void onPlaybackStateChanged(int i11) {
        }

        default void onPlayerError(w wVar) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onTracksChanged(C7256L c7256l) {
        }

        default void onVideoSizeChanged(Q q11) {
        }

        default void onVolumeChanged(float f7) {
        }

        default void r(boolean z11) {
        }

        @Deprecated
        default void t(List<C7855a> list) {
        }

        default void x(C7856b c7856b) {
        }
    }

    /* loaded from: classes8.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Object f69351a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69352b;

        /* renamed from: c, reason: collision with root package name */
        public final C7275q f69353c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f69354d;

        /* renamed from: e, reason: collision with root package name */
        public final int f69355e;

        /* renamed from: f, reason: collision with root package name */
        public final long f69356f;

        /* renamed from: g, reason: collision with root package name */
        public final long f69357g;

        /* renamed from: h, reason: collision with root package name */
        public final int f69358h;

        /* renamed from: i, reason: collision with root package name */
        public final int f69359i;

        static {
            Pk0.h.f(0, 1, 2, 3, 4);
            m3.N.L(5);
            m3.N.L(6);
        }

        public d(Object obj, int i11, C7275q c7275q, Object obj2, int i12, long j11, long j12, int i13, int i14) {
            this.f69351a = obj;
            this.f69352b = i11;
            this.f69353c = c7275q;
            this.f69354d = obj2;
            this.f69355e = i12;
            this.f69356f = j11;
            this.f69357g = j12;
            this.f69358h = i13;
            this.f69359i = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f69352b == dVar.f69352b && this.f69355e == dVar.f69355e && this.f69356f == dVar.f69356f && this.f69357g == dVar.f69357g && this.f69358h == dVar.f69358h && this.f69359i == dVar.f69359i && Objects.equals(this.f69353c, dVar.f69353c) && Objects.equals(this.f69351a, dVar.f69351a) && Objects.equals(this.f69354d, dVar.f69354d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f69351a, Integer.valueOf(this.f69352b), this.f69353c, this.f69354d, Integer.valueOf(this.f69355e), Long.valueOf(this.f69356f), Long.valueOf(this.f69357g), Integer.valueOf(this.f69358h), Integer.valueOf(this.f69359i));
        }

        public final String toString() {
            String str = "mediaItem=" + this.f69352b + ", period=" + this.f69355e + ", pos=" + this.f69356f;
            int i11 = this.f69358h;
            if (i11 == -1) {
                return str;
            }
            StringBuilder e11 = C2942q.e(str, ", contentPos=");
            e11.append(this.f69357g);
            e11.append(", adGroup=");
            e11.append(i11);
            e11.append(", ad=");
            e11.append(this.f69359i);
            return e11.toString();
        }
    }

    C7275q A();

    void B();

    void C();

    void D(boolean z11);

    C7856b E();

    int F();

    AbstractC7252H G();

    Looper H();

    void I();

    void J(TextureView textureView);

    void K(int i11, long j11);

    a L();

    Q M();

    void N();

    long O();

    int P();

    int R();

    void S(int i11);

    void T(SurfaceView surfaceView);

    boolean U();

    void V();

    s W();

    long Y();

    C5449k a();

    void b(x xVar);

    x d();

    boolean e();

    long f();

    void g(SurfaceView surfaceView);

    long getCurrentPosition();

    long getDuration();

    float getVolume();

    void h(C7255K c7255k);

    C7256L i();

    boolean isPlaying();

    void j(c cVar);

    int k();

    boolean l(int i11);

    C7255K m();

    boolean n();

    void o(boolean z11);

    long p();

    void pause();

    void play();

    void prepare();

    long q();

    int r();

    void s(TextureView textureView);

    void seekTo(long j11);

    void setVolume(float f7);

    void stop();

    void t(c cVar);

    int u();

    long v();

    int w();

    long x();

    void y();

    void z(List list);
}
