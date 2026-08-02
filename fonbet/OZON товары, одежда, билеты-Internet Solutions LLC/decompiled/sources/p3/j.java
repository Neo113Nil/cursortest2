package p3;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m3.N;
import p3.InterfaceC8846f;
import p3.k;
import ru.ozon.app.android.video.player.CacheObserver;

/* loaded from: classes.dex */
public final class j implements InterfaceC8846f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f80084a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f80085b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8846f f80086c;

    /* renamed from: d, reason: collision with root package name */
    private n f80087d;

    /* renamed from: e, reason: collision with root package name */
    private C8841a f80088e;

    /* renamed from: f, reason: collision with root package name */
    private C8844d f80089f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC8846f f80090g;

    /* renamed from: h, reason: collision with root package name */
    private C8840A f80091h;

    /* renamed from: i, reason: collision with root package name */
    private C8845e f80092i;

    /* renamed from: j, reason: collision with root package name */
    private w f80093j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC8846f f80094k;

    public static final class a implements InterfaceC8846f.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f80095a;

        /* renamed from: b, reason: collision with root package name */
        private final p f80096b;

        /* renamed from: c, reason: collision with root package name */
        private CacheObserver f80097c;

        public a(Context context) {
            this(context, new k.a());
        }

        public final void a(CacheObserver cacheObserver) {
            this.f80097c = cacheObserver;
        }

        @Override // p3.InterfaceC8846f.a
        public final InterfaceC8846f createDataSource() {
            j jVar = new j(this.f80095a, this.f80096b.createDataSource());
            CacheObserver cacheObserver = this.f80097c;
            if (cacheObserver != null) {
                jVar.addTransferListener(cacheObserver);
            }
            return jVar;
        }

        public a(Context context, p pVar) {
            this.f80095a = context.getApplicationContext();
            pVar.getClass();
            this.f80096b = pVar;
        }
    }

    public j(Context context, InterfaceC8846f interfaceC8846f) {
        this.f80084a = context.getApplicationContext();
        interfaceC8846f.getClass();
        this.f80086c = interfaceC8846f;
        this.f80085b = new ArrayList();
    }

    private void i(InterfaceC8846f interfaceC8846f) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f80085b;
            if (i11 >= arrayList.size()) {
                return;
            }
            interfaceC8846f.addTransferListener((z) arrayList.get(i11));
            i11++;
        }
    }

    private static void j(InterfaceC8846f interfaceC8846f, z zVar) {
        if (interfaceC8846f != null) {
            interfaceC8846f.addTransferListener(zVar);
        }
    }

    @Override // p3.InterfaceC8846f
    public final void addTransferListener(z zVar) {
        zVar.getClass();
        this.f80086c.addTransferListener(zVar);
        this.f80085b.add(zVar);
        j(this.f80087d, zVar);
        j(this.f80088e, zVar);
        j(this.f80089f, zVar);
        j(this.f80090g, zVar);
        j(this.f80091h, zVar);
        j(this.f80092i, zVar);
        j(this.f80093j, zVar);
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws IOException {
        InterfaceC8846f interfaceC8846f = this.f80094k;
        if (interfaceC8846f != null) {
            try {
                interfaceC8846f.close();
            } finally {
                this.f80094k = null;
            }
        }
    }

    @Override // p3.InterfaceC8846f
    public final Map<String, List<String>> getResponseHeaders() {
        InterfaceC8846f interfaceC8846f = this.f80094k;
        return interfaceC8846f == null ? Collections.EMPTY_MAP : interfaceC8846f.getResponseHeaders();
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        InterfaceC8846f interfaceC8846f = this.f80094k;
        if (interfaceC8846f == null) {
            return null;
        }
        return interfaceC8846f.getUri();
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws IOException {
        G10.a.h(this.f80094k == null);
        String scheme = iVar.f80066a.getScheme();
        int i11 = N.f74289a;
        Uri uri = iVar.f80066a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f80084a;
        if (isEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f80087d == null) {
                    n nVar = new n(false);
                    this.f80087d = nVar;
                    i(nVar);
                }
                this.f80094k = this.f80087d;
            } else {
                if (this.f80088e == null) {
                    C8841a c8841a = new C8841a(context);
                    this.f80088e = c8841a;
                    i(c8841a);
                }
                this.f80094k = this.f80088e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f80088e == null) {
                C8841a c8841a2 = new C8841a(context);
                this.f80088e = c8841a2;
                i(c8841a2);
            }
            this.f80094k = this.f80088e;
        } else if ("content".equals(scheme)) {
            if (this.f80089f == null) {
                C8844d c8844d = new C8844d(context);
                this.f80089f = c8844d;
                i(c8844d);
            }
            this.f80094k = this.f80089f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            InterfaceC8846f interfaceC8846f = this.f80086c;
            if (equals) {
                if (this.f80090g == null) {
                    try {
                        InterfaceC8846f interfaceC8846f2 = (InterfaceC8846f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f80090g = interfaceC8846f2;
                        i(interfaceC8846f2);
                    } catch (ClassNotFoundException unused) {
                        m3.s.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e11) {
                        throw new RuntimeException("Error instantiating RTMP extension", e11);
                    }
                    if (this.f80090g == null) {
                        this.f80090g = interfaceC8846f;
                    }
                }
                this.f80094k = this.f80090g;
            } else if ("udp".equals(scheme)) {
                if (this.f80091h == null) {
                    C8840A c8840a = new C8840A();
                    this.f80091h = c8840a;
                    i(c8840a);
                }
                this.f80094k = this.f80091h;
            } else if ("data".equals(scheme)) {
                if (this.f80092i == null) {
                    C8845e c8845e = new C8845e();
                    this.f80092i = c8845e;
                    i(c8845e);
                }
                this.f80094k = this.f80092i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f80093j == null) {
                    w wVar = new w(context);
                    this.f80093j = wVar;
                    i(wVar);
                }
                this.f80094k = this.f80093j;
            } else {
                this.f80094k = interfaceC8846f;
            }
        }
        return this.f80094k.open(iVar);
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        InterfaceC8846f interfaceC8846f = this.f80094k;
        interfaceC8846f.getClass();
        return interfaceC8846f.read(bArr, i11, i12);
    }
}
