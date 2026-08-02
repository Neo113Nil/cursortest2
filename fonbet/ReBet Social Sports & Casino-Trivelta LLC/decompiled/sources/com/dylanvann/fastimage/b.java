package com.dylanvann.fastimage;

import android.content.Context;
import com.bumptech.glide.integration.okhttp3.b;
import com.facebook.react.modules.network.OkHttpClientProvider;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ti.C6478h;
import ti.G;
import ti.InterfaceC6480j;
import ti.n;
import ti.t;

/* loaded from: classes2.dex */
public class b extends J4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0477b f30189a = new C0477b();

    public class a implements Interceptor {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f30190a;

        public a(d dVar) {
            this.f30190a = dVar;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            Response proceed = chain.proceed(request);
            return proceed.newBuilder().body(new c(request.url().getUrl(), proceed.body(), this.f30190a)).build();
        }
    }

    /* renamed from: com.dylanvann.fastimage.b$b, reason: collision with other inner class name */
    public static class C0477b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final Map f30191a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f30192b;

        @Override // com.dylanvann.fastimage.b.d
        public void a(String str, long j10, long j11) {
            com.dylanvann.fastimage.d dVar = (com.dylanvann.fastimage.d) this.f30191a.get(str);
            if (dVar == null) {
                return;
            }
            if (j11 <= j10) {
                c(str);
            }
            if (d(str, j10, j11, dVar.getGranularityPercentage())) {
                dVar.onProgress(str, j10, j11);
            }
        }

        public void b(String str, com.dylanvann.fastimage.d dVar) {
            this.f30191a.put(str, dVar);
        }

        public void c(String str) {
            this.f30191a.remove(str);
            this.f30192b.remove(str);
        }

        public final boolean d(String str, long j10, long j11, float f10) {
            if (f10 != 0.0f && j10 != 0 && j11 != j10) {
                long j12 = (long) (((j10 * 100.0f) / j11) / f10);
                Long l10 = (Long) this.f30192b.get(str);
                if (l10 != null && j12 == l10.longValue()) {
                    return false;
                }
                this.f30192b.put(str, Long.valueOf(j12));
            }
            return true;
        }

        public C0477b() {
            this.f30191a = new WeakHashMap();
            this.f30192b = new HashMap();
        }
    }

    public interface d {
        void a(String str, long j10, long j11);
    }

    public static Interceptor b(d dVar) {
        return new a(dVar);
    }

    public static void c(String str, com.dylanvann.fastimage.d dVar) {
        f30189a.b(str, dVar);
    }

    public static void d(String str) {
        f30189a.c(str);
    }

    @Override // J4.c
    public void a(Context context, com.bumptech.glide.c cVar, com.bumptech.glide.j jVar) {
        jVar.r(B4.h.class, InputStream.class, new b.a(OkHttpClientProvider.getOkHttpClient().newBuilder().addInterceptor(b(f30189a)).build()));
    }

    public static class c extends ResponseBody {

        /* renamed from: a, reason: collision with root package name */
        public final String f30193a;

        /* renamed from: b, reason: collision with root package name */
        public final ResponseBody f30194b;

        /* renamed from: c, reason: collision with root package name */
        public final d f30195c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC6480j f30196d;

        public class a extends n {

            /* renamed from: a, reason: collision with root package name */
            public long f30197a;

            public a(G g10) {
                super(g10);
                this.f30197a = 0L;
            }

            @Override // ti.n, ti.G
            public long read(C6478h c6478h, long j10) {
                long read = super.read(c6478h, j10);
                long contentLength = c.this.f30194b.getContentLength();
                if (read == -1) {
                    this.f30197a = contentLength;
                } else {
                    this.f30197a += read;
                }
                c.this.f30195c.a(c.this.f30193a, this.f30197a, contentLength);
                return read;
            }
        }

        public c(String str, ResponseBody responseBody, d dVar) {
            this.f30193a = str;
            this.f30194b = responseBody;
            this.f30195c = dVar;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.f30194b.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.f30194b.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public InterfaceC6480j getBodySource() {
            if (this.f30196d == null) {
                this.f30196d = t.d(source(this.f30194b.getBodySource()));
            }
            return this.f30196d;
        }

        public final G source(G g10) {
            return new a(g10);
        }
    }
}
