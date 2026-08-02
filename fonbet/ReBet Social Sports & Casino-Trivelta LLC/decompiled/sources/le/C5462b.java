package le;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.zoho.livechat.android.utils.Q;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import ti.C6478h;
import ti.InterfaceC6480j;
import ti.q;

/* renamed from: le.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5462b implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0803b f55836a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f55837b;

    /* renamed from: c, reason: collision with root package name */
    public volatile a f55838c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: le.b$a */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NONE = new a("NONE", 0);
        public static final a BASIC = new a("BASIC", 1);
        public static final a HEADERS = new a("HEADERS", 2);
        public static final a BODY = new a("BODY", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{NONE, BASIC, HEADERS, BODY};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private a(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: le.b$b, reason: collision with other inner class name */
    public interface InterfaceC0803b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f55839a = a.f55841a;

        /* renamed from: b, reason: collision with root package name */
        public static final InterfaceC0803b f55840b = new a.C0804a();

        /* renamed from: le.b$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f55841a = new a();

            /* renamed from: le.b$b$a$a, reason: collision with other inner class name */
            public static final class C0804a implements InterfaceC0803b {
                @Override // le.C5462b.InterfaceC0803b
                public void log(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }
        }

        void log(String str);
    }

    public C5462b(InterfaceC0803b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f55836a = logger;
        this.f55837b = SetsKt.emptySet();
        this.f55838c = a.NONE;
    }

    public final boolean a(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || StringsKt.equals(str, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, true) || StringsKt.equals(str, "gzip", true)) ? false : true;
    }

    public final boolean b(C6478h c6478h) {
        try {
            C6478h c6478h2 = new C6478h();
            c6478h.U(c6478h2, 0L, RangesKt.coerceAtMost(c6478h.size(), 64L));
            for (int i10 = 0; i10 < 16; i10++) {
                if (c6478h2.X0()) {
                    return true;
                }
                int d22 = c6478h2.d2();
                if (Character.isISOControl(d22) && !Character.isWhitespace(d22)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f55838c = aVar;
    }

    public final void d(Headers headers, int i10) {
        String value = this.f55837b.contains(headers.name(i10)) ? "██" : headers.value(i10);
        this.f55836a.log(headers.name(i10) + ": " + value);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0107 A[LOOP:0: B:37:0x0105->B:38:0x0107, LOOP_END] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) {
        Response response;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        long j10;
        char c10;
        String sb2;
        Long l10;
        Charset charset;
        int size;
        int i10;
        Charset charset2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (Q.f44460u) {
            Charset forName = Charset.forName("UTF-8");
            a aVar = this.f55838c;
            Request request = chain.request();
            if (aVar == a.NONE) {
                return chain.proceed(request);
            }
            boolean z12 = aVar == a.BODY;
            boolean z13 = z12 || aVar == a.HEADERS;
            RequestBody body = request.body();
            Connection connection = chain.connection();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("--> ");
            sb3.append(request.method());
            sb3.append(' ');
            sb3.append(request.url());
            if (connection != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(' ');
                sb4.append(connection.protocol());
                str = sb4.toString();
            } else {
                str = "";
            }
            sb3.append(str);
            String sb5 = sb3.toString();
            if (z13 || body == null) {
                z10 = z13;
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb5);
                sb6.append(" (");
                z10 = z13;
                sb6.append(body.contentLength());
                sb6.append("-byte body)");
                sb5 = sb6.toString();
            }
            this.f55836a.log(sb5);
            if (z10) {
                Headers headers = request.headers();
                if (body != null) {
                    MediaType mediaType = body.get$mediaType();
                    if (mediaType != null && headers.get("Content-Type") == null) {
                        this.f55836a.log("Content-Type: " + mediaType);
                    }
                    if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                        InterfaceC0803b interfaceC0803b = this.f55836a;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Content-Length: ");
                        str2 = "";
                        sb7.append(body.contentLength());
                        interfaceC0803b.log(sb7.toString());
                        size = headers.size();
                        for (i10 = 0; i10 < size; i10++) {
                            d(headers, i10);
                        }
                        if (z12 || body == null) {
                            this.f55836a.log("--> END " + request.method());
                        } else if (a(request.headers())) {
                            this.f55836a.log("--> END " + request.method() + " (encoded body omitted)");
                        } else if (body.isDuplex()) {
                            this.f55836a.log("--> END " + request.method() + " (duplex request body omitted)");
                        } else if (body.isOneShot()) {
                            this.f55836a.log("--> END " + request.method() + " (one-shot body omitted)");
                        } else {
                            C6478h c6478h = new C6478h();
                            body.writeTo(c6478h);
                            MediaType mediaType2 = body.get$mediaType();
                            if (mediaType2 == null || (charset2 = mediaType2.charset(forName)) == null) {
                                Intrinsics.checkNotNull(forName);
                                charset2 = forName;
                            }
                            this.f55836a.log(str2);
                            if (b(c6478h)) {
                                this.f55836a.log(c6478h.q1(charset2));
                                this.f55836a.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                            } else {
                                this.f55836a.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                            }
                        }
                    }
                }
                str2 = "";
                size = headers.size();
                while (i10 < size) {
                }
                if (z12) {
                }
                this.f55836a.log("--> END " + request.method());
            } else {
                str2 = "";
            }
            long nanoTime = System.nanoTime();
            try {
                Response proceed = chain.proceed(request);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                ResponseBody body2 = proceed.body();
                Intrinsics.checkNotNull(body2);
                long contentLength = body2.getContentLength();
                String str3 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
                InterfaceC0803b interfaceC0803b2 = this.f55836a;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("<-- ");
                sb8.append(proceed.code());
                if (proceed.message().length() == 0) {
                    z11 = z12;
                    j10 = contentLength;
                    sb2 = str2;
                    c10 = ' ';
                } else {
                    String message = proceed.message();
                    z11 = z12;
                    StringBuilder sb9 = new StringBuilder();
                    j10 = contentLength;
                    c10 = ' ';
                    sb9.append(' ');
                    sb9.append(message);
                    sb2 = sb9.toString();
                }
                sb8.append(sb2);
                sb8.append(c10);
                sb8.append(proceed.request().url());
                sb8.append(" (");
                sb8.append(millis);
                sb8.append("ms");
                sb8.append(z10 ? str2 : ", " + str3 + " body");
                sb8.append(')');
                interfaceC0803b2.log(sb8.toString());
                if (z10) {
                    Headers headers2 = proceed.headers();
                    int size2 = headers2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        d(headers2, i11);
                    }
                    if (!z11 || !HttpHeaders.promisesBody(proceed)) {
                        this.f55836a.log("<-- END HTTP");
                    } else if (a(proceed.headers())) {
                        this.f55836a.log("<-- END HTTP (encoded body omitted)");
                    } else {
                        InterfaceC6480j source = body2.getSource();
                        source.v0(LongCompanionObject.MAX_VALUE);
                        C6478h h10 = source.h();
                        if (StringsKt.equals("gzip", headers2.get("Content-Encoding"), true)) {
                            l10 = Long.valueOf(h10.size());
                            q qVar = new q(h10.clone());
                            try {
                                h10 = new C6478h();
                                h10.Y(qVar);
                                CloseableKt.closeFinally(qVar, null);
                            } finally {
                            }
                        } else {
                            l10 = null;
                        }
                        MediaType mediaType3 = body2.get$contentType();
                        if (mediaType3 == null || (charset = mediaType3.charset(forName)) == null) {
                            Intrinsics.checkNotNull(forName);
                        } else {
                            forName = charset;
                        }
                        if (!b(h10)) {
                            this.f55836a.log(str2);
                            this.f55836a.log("<-- END HTTP (binary " + h10.size() + "-byte body omitted)");
                            return proceed;
                        }
                        if (j10 != 0) {
                            this.f55836a.log(str2);
                            this.f55836a.log(h10.clone().q1(forName));
                        }
                        if (l10 != null) {
                            this.f55836a.log("<-- END HTTP (" + h10.size() + "-byte, " + l10 + "-gzipped-byte body)");
                        } else {
                            this.f55836a.log("<-- END HTTP (" + h10.size() + "-byte body)");
                        }
                    }
                }
                response = proceed;
            } catch (Exception e10) {
                this.f55836a.log("<-- HTTP FAILED: " + e10);
                throw e10;
            }
        } else {
            response = null;
        }
        return response == null ? chain.proceed(chain.request()) : response;
    }

    public /* synthetic */ C5462b(InterfaceC0803b interfaceC0803b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? InterfaceC0803b.f55840b : interfaceC0803b);
    }
}
