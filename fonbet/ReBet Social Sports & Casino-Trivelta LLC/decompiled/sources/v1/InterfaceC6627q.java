package v1;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: v1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6627q {

    /* renamed from: v1.q$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final t f66976a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f66977b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.a f66978c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f66979d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f66980e;

        /* renamed from: f, reason: collision with root package name */
        public final C6625o f66981f;

        public a(t tVar, MediaFormat mediaFormat, androidx.media3.common.a aVar, Surface surface, MediaCrypto mediaCrypto, C6625o c6625o) {
            this.f66976a = tVar;
            this.f66977b = mediaFormat;
            this.f66978c = aVar;
            this.f66979d = surface;
            this.f66980e = mediaCrypto;
            this.f66981f = c6625o;
        }

        public static a a(t tVar, MediaFormat mediaFormat, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, C6625o c6625o) {
            return new a(tVar, mediaFormat, aVar, null, mediaCrypto, c6625o);
        }

        public static a b(t tVar, MediaFormat mediaFormat, androidx.media3.common.a aVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(tVar, mediaFormat, aVar, surface, mediaCrypto, null);
        }
    }

    /* renamed from: v1.q$b */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66982a = new C6620j();

        static b a(Context context) {
            return new C6620j(context);
        }

        InterfaceC6627q b(a aVar);
    }

    /* renamed from: v1.q$c */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: v1.q$d */
    public interface d {
        void a(InterfaceC6627q interfaceC6627q, long j10, long j11);
    }

    void a(int i10, int i11, k1.c cVar, long j10, int i12);

    void b();

    void c(int i10);

    ByteBuffer d(int i10);

    void e(Surface surface);

    void f(d dVar, Handler handler);

    void flush();

    boolean g();

    MediaFormat getOutputFormat();

    default boolean h(c cVar) {
        return false;
    }

    void i(int i10, long j10);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer l(int i10);

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void release();

    void releaseOutputBuffer(int i10, boolean z10);

    void setParameters(Bundle bundle);
}
