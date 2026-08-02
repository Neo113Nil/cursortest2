package j1;

import Ra.o;
import Ta.v;
import android.net.Uri;
import b1.AbstractC2332A;
import com.facebook.react.animated.InterpolationAnimatedNode;
import e1.AbstractC4134a;
import e1.Z;
import h1.AbstractC4406b;
import h1.AbstractC4430z;
import h1.C4415k;
import h1.C4418n;
import h1.C4426v;
import h1.C4427w;
import h1.C4428x;
import h1.C4429y;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import h1.InterfaceC4425u;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zendesk.core.Constants;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5089a extends AbstractC4406b implements InterfaceC4411g {

    /* renamed from: e, reason: collision with root package name */
    public final Call.Factory f53635e;

    /* renamed from: f, reason: collision with root package name */
    public final C4429y f53636f;

    /* renamed from: g, reason: collision with root package name */
    public final String f53637g;

    /* renamed from: h, reason: collision with root package name */
    public final CacheControl f53638h;

    /* renamed from: i, reason: collision with root package name */
    public final C4429y f53639i;

    /* renamed from: j, reason: collision with root package name */
    public final o f53640j;

    /* renamed from: k, reason: collision with root package name */
    public C4418n f53641k;

    /* renamed from: l, reason: collision with root package name */
    public Response f53642l;

    /* renamed from: m, reason: collision with root package name */
    public InputStream f53643m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f53644n;

    /* renamed from: o, reason: collision with root package name */
    public long f53645o;

    /* renamed from: p, reason: collision with root package name */
    public long f53646p;

    /* renamed from: j1.a$a, reason: collision with other inner class name */
    public class C0773a implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f53647a;

        public C0773a(v vVar) {
            this.f53647a = vVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.f53647a.y(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            this.f53647a.x(response);
        }
    }

    /* renamed from: j1.a$b */
    public static final class b implements InterfaceC4425u {

        /* renamed from: a, reason: collision with root package name */
        public final C4429y f53649a = new C4429y();

        /* renamed from: b, reason: collision with root package name */
        public final Call.Factory f53650b;

        /* renamed from: c, reason: collision with root package name */
        public String f53651c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC4403F f53652d;

        /* renamed from: e, reason: collision with root package name */
        public CacheControl f53653e;

        /* renamed from: f, reason: collision with root package name */
        public o f53654f;

        public b(Call.Factory factory) {
            this.f53650b = factory;
        }

        @Override // h1.InterfaceC4411g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5089a a() {
            C5089a c5089a = new C5089a(this.f53650b, this.f53651c, this.f53653e, this.f53649a, this.f53654f, null);
            InterfaceC4403F interfaceC4403F = this.f53652d;
            if (interfaceC4403F != null) {
                c5089a.c(interfaceC4403F);
            }
            return c5089a;
        }

        public final b c(Map map) {
            this.f53649a.a(map);
            return this;
        }

        public b d(InterfaceC4403F interfaceC4403F) {
            this.f53652d = interfaceC4403F;
            return this;
        }

        public b e(String str) {
            this.f53651c = str;
            return this;
        }
    }

    static {
        AbstractC2332A.a("media3.datasource.okhttp");
    }

    public /* synthetic */ C5089a(Call.Factory factory, String str, CacheControl cacheControl, C4429y c4429y, o oVar, C0773a c0773a) {
        this(factory, str, cacheControl, c4429y, oVar);
    }

    private void s() {
        Response response = this.f53642l;
        if (response != null) {
            ((ResponseBody) AbstractC4134a.e(response.body())).close();
        }
        this.f53643m = null;
    }

    private int v(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f53645o;
        if (j10 != -1) {
            long j11 = j10 - this.f53646p;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) Z.i(this.f53643m)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f53646p += read;
        o(read);
        return read;
    }

    private void w(long j10, C4418n c4418n) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            try {
                int read = ((InputStream) Z.i(this.f53643m)).read(bArr, 0, (int) Math.min(j10, 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new C4426v(c4418n, 2008, 1);
                }
                j10 -= read;
                o(read);
            } catch (IOException e10) {
                if (!(e10 instanceof C4426v)) {
                    throw new C4426v(c4418n, 2000, 1);
                }
                throw ((C4426v) e10);
            }
        }
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        byte[] bArr;
        this.f53641k = c4418n;
        long j10 = 0;
        this.f53646p = 0L;
        this.f53645o = 0L;
        q(c4418n);
        try {
            Response t10 = t(this.f53635e.newCall(u(c4418n)));
            this.f53642l = t10;
            ResponseBody responseBody = (ResponseBody) AbstractC4134a.e(t10.body());
            this.f53643m = responseBody.byteStream();
            int code = t10.code();
            if (!t10.isSuccessful()) {
                if (code == 416) {
                    if (c4418n.f47559f == AbstractC4430z.c(t10.headers().get("Content-Range"))) {
                        this.f53644n = true;
                        r(c4418n);
                        long j11 = c4418n.f47560g;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                try {
                    bArr = Sa.a.d((InputStream) AbstractC4134a.e(this.f53643m));
                } catch (IOException unused) {
                    bArr = Z.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr2 = bArr;
                Map<String, List<String>> multimap = t10.headers().toMultimap();
                s();
                throw new C4428x(code, t10.message(), code == 416 ? new C4415k(2008) : null, multimap, c4418n, bArr2);
            }
            MediaType mediaType = responseBody.get$contentType();
            String mediaType2 = mediaType != null ? mediaType.getMediaType() : "";
            o oVar = this.f53640j;
            if (oVar != null && !oVar.apply(mediaType2)) {
                s();
                throw new C4427w(mediaType2, c4418n);
            }
            if (code == 200) {
                long j12 = c4418n.f47559f;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            long j13 = c4418n.f47560g;
            if (j13 != -1) {
                this.f53645o = j13;
            } else {
                long contentLength = responseBody.getContentLength();
                this.f53645o = contentLength != -1 ? contentLength - j10 : -1L;
            }
            this.f53644n = true;
            r(c4418n);
            try {
                w(j10, c4418n);
                return this.f53645o;
            } catch (C4426v e10) {
                s();
                throw e10;
            }
        } catch (IOException e11) {
            throw C4426v.c(e11, c4418n, 1);
        }
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        if (this.f53644n) {
            this.f53644n = false;
            p();
            s();
        }
        this.f53642l = null;
        this.f53641k = null;
    }

    @Override // h1.InterfaceC4411g
    public Map f() {
        Response response = this.f53642l;
        return response == null ? Collections.EMPTY_MAP : response.headers().toMultimap();
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        Response response = this.f53642l;
        if (response != null) {
            return Uri.parse(response.request().url().getUrl());
        }
        C4418n c4418n = this.f53641k;
        if (c4418n != null) {
            return c4418n.f47554a;
        }
        return null;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return v(bArr, i10, i11);
        } catch (IOException e10) {
            throw C4426v.c(e10, (C4418n) Z.i(this.f53641k), 2);
        }
    }

    public final Response t(Call call) {
        v A10 = v.A();
        call.enqueue(new C0773a(A10));
        try {
            return (Response) A10.get();
        } catch (InterruptedException unused) {
            call.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final Request u(C4418n c4418n) {
        long j10 = c4418n.f47559f;
        long j11 = c4418n.f47560g;
        HttpUrl parse = HttpUrl.parse(c4418n.f47554a.toString());
        if (parse == null) {
            throw new C4426v("Malformed URL", c4418n, 1004, 1);
        }
        Request.Builder url = new Request.Builder().url(parse);
        CacheControl cacheControl = this.f53638h;
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        HashMap hashMap = new HashMap();
        C4429y c4429y = this.f53639i;
        if (c4429y != null) {
            hashMap.putAll(c4429y.b());
        }
        hashMap.putAll(this.f53636f.b());
        hashMap.putAll(c4418n.f47557d);
        for (Map.Entry entry : hashMap.entrySet()) {
            url.header((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = AbstractC4430z.a(j10, j11);
        if (a10 != null) {
            url.addHeader("Range", a10);
        }
        String str = this.f53637g;
        if (str != null) {
            url.addHeader(Constants.USER_AGENT_HEADER_KEY, str);
        }
        if (!c4418n.d(1)) {
            url.addHeader("Accept-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        }
        byte[] bArr = c4418n.httpBody;
        url.method(c4418n.b(), bArr != null ? RequestBody.create(bArr) : c4418n.f47556c == 2 ? RequestBody.create(Z.EMPTY_BYTE_ARRAY) : null);
        return url.build();
    }

    public C5089a(Call.Factory factory, String str, CacheControl cacheControl, C4429y c4429y, o oVar) {
        super(true);
        this.f53635e = (Call.Factory) AbstractC4134a.e(factory);
        this.f53637g = str;
        this.f53638h = cacheControl;
        this.f53639i = c4429y;
        this.f53640j = oVar;
        this.f53636f = new C4429y();
    }
}
