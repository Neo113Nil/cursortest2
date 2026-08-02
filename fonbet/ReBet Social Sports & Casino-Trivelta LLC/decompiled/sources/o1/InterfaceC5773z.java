package o1;

import android.media.AudioDeviceInfo;
import b1.C2340I;
import b1.C2350d;
import b1.C2354h;
import e1.InterfaceC4143j;
import java.nio.ByteBuffer;
import n1.G1;

/* renamed from: o1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5773z {

    /* renamed from: o1.z$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f58885a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58886b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58887c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f58888d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f58889e;

        /* renamed from: f, reason: collision with root package name */
        public final int f58890f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f58885a = i10;
            this.f58886b = i11;
            this.f58887c = i12;
            this.f58888d = z10;
            this.f58889e = z11;
            this.f58890f = i13;
        }
    }

    /* renamed from: o1.z$d */
    public interface d {
        void a(int i10);

        void b(boolean z10);

        void c(long j10);

        void d(Exception exc);

        void e(a aVar);

        void f(a aVar);

        void g();

        void h();

        void i(int i10, long j10, long j11);

        void j();

        void k();

        void l();
    }

    /* renamed from: o1.z$e */
    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f58895a;

        /* renamed from: b, reason: collision with root package name */
        public final long f58896b;

        public e(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f58895a = j10;
            this.f58896b = j11;
        }
    }

    /* renamed from: o1.z$f */
    public static final class f extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f58897a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f58898b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.a f58899c;

        public f(int i10, androidx.media3.common.a aVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f58898b = z10;
            this.f58897a = i10;
            this.f58899c = aVar;
        }
    }

    boolean a(androidx.media3.common.a aVar);

    boolean b();

    C5759k c(androidx.media3.common.a aVar);

    C2340I d();

    void e(C2340I c2340i);

    boolean f();

    void flush();

    void g(int i10);

    void h(float f10);

    long i();

    void j(int i10);

    void k();

    boolean l(ByteBuffer byteBuffer, long j10, int i10);

    void m(androidx.media3.common.a aVar, int i10, int[] iArr);

    void n(C2350d c2350d);

    void o();

    void p(int i10, int i11);

    void pause();

    void play();

    long q(boolean z10);

    void release();

    void reset();

    void s();

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void t();

    int u(androidx.media3.common.a aVar);

    void v(C2354h c2354h);

    void w(G1 g12);

    void x(d dVar);

    void y(InterfaceC4143j interfaceC4143j);

    void z(boolean z10);

    /* renamed from: o1.z$b */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f58891a;

        public b(Throwable th2, androidx.media3.common.a aVar) {
            super(th2);
            this.f58891a = aVar;
        }

        public b(String str, androidx.media3.common.a aVar) {
            super(str);
            this.f58891a = aVar;
        }
    }

    /* renamed from: o1.z$c */
    public static final class c extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f58892a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f58893b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.a f58894c;

        public c(String str, int i10, androidx.media3.common.a aVar, boolean z10, Throwable th2) {
            super(str, th2);
            this.f58892a = i10;
            this.f58893b = z10;
            this.f58894c = aVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(int i10, int i11, int i12, int i13, int i14, androidx.media3.common.a aVar, boolean z10, Exception exc) {
            this(r0.toString(), i10, aVar, z10, exc);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(", ");
            sb2.append(i14);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(aVar);
            sb2.append(z10 ? " (recoverable)" : "");
        }
    }

    default void r(long j10) {
    }
}
