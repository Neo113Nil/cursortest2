package t2;

import c1.p;
import com.google.common.collect.AbstractC3442w;
import e1.InterfaceC4143j;

/* renamed from: t2.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6427w0 extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC3442w f65601d = new AbstractC3442w.a().f("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001).f("ERROR_CODE_IO_UNSPECIFIED", 2000).f("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001).f("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002).f("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003).f("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004).f("ERROR_CODE_IO_FILE_NOT_FOUND", 2005).f("ERROR_CODE_IO_NO_PERMISSION", 2006).f("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007).f("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008).f("ERROR_CODE_DECODER_INIT_FAILED", 3001).f("ERROR_CODE_DECODING_FAILED", 3002).f("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003).f("ERROR_CODE_ENCODER_INIT_FAILED", 4001).f("ERROR_CODE_ENCODING_FAILED", 4002).f("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003).f("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001).f("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001).f("ERROR_CODE_MUXING_FAILED", 7001).f("ERROR_CODE_MUXING_TIMEOUT", 7002).f("ERROR_CODE_MUXING_APPEND", 7003).c();

    /* renamed from: a, reason: collision with root package name */
    public final int f65602a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65603b;

    /* renamed from: c, reason: collision with root package name */
    public final a f65604c;

    /* renamed from: t2.w0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f65605a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65606b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65607c;

        /* renamed from: d, reason: collision with root package name */
        public final String f65608d;

        public a(String str, boolean z10, boolean z11, String str2) {
            this.f65605a = str;
            this.f65606b = z10;
            this.f65607c = z11;
            this.f65608d = str2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f65606b ? "Video" : "Audio");
            sb2.append(this.f65607c ? "Decoder" : "Encoder");
            return "CodecInfo{type=" + sb2.toString() + ", configurationFormat=" + this.f65605a + ", name=" + this.f65608d + '}';
        }
    }

    public C6427w0(String str, Throwable th2, int i10) {
        this(str, th2, i10, null);
    }

    public static C6427w0 a(Throwable th2, int i10) {
        return new C6427w0("Asset loader error", th2, i10);
    }

    public static C6427w0 b(p.b bVar, String str) {
        return new C6427w0("Audio error: " + str + ", audioFormat=" + bVar.f26784a, bVar, 6001);
    }

    public static C6427w0 c(Throwable th2, int i10, a aVar) {
        return new C6427w0("Codec exception: " + aVar, th2, i10, aVar);
    }

    public static C6427w0 d(Throwable th2, int i10) {
        return new C6427w0("Muxer error", th2, i10);
    }

    public static C6427w0 e(Exception exc) {
        return exc instanceof RuntimeException ? new C6427w0("Unexpected runtime error", exc, 1001) : new C6427w0("Unexpected error", exc, 1000);
    }

    public static C6427w0 f(b1.V v10) {
        return new C6427w0("Video frame processing error", v10, 5001);
    }

    public C6427w0(String str, Throwable th2, int i10, a aVar) {
        super(str, th2);
        this.f65602a = i10;
        this.f65603b = InterfaceC4143j.f45530a.b();
        this.f65604c = aVar;
    }
}
