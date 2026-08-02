package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import androidx.media3.datasource.e;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import xsna.ahn;
import xsna.evk;
import xsna.fxc0;
import xsna.gqg0;
import xsna.mjp0;
import xsna.tuk;
import xsna.y2r0;

/* compiled from: DefaultDataSource.java */
/* loaded from: classes12.dex */
public final class c implements androidx.media3.datasource.a {
    public final Context a;
    public final ArrayList b;
    public final androidx.media3.datasource.a c;

    @Nullable
    public FileDataSource d;

    @Nullable
    public AssetDataSource e;

    @Nullable
    public ContentDataSource f;

    @Nullable
    public androidx.media3.datasource.a g;

    @Nullable
    public UdpDataSource h;

    @Nullable
    public tuk i;

    @Nullable
    public RawResourceDataSource j;

    @Nullable
    public androidx.media3.datasource.a k;

    /* compiled from: DefaultDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0045a {
        public final Context a;
        public final a.InterfaceC0045a b;

        public a(Context context) {
            this(context, new e.a());
        }

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            return new c(this.a, this.b.createDataSource());
        }

        public a(Context context, a.InterfaceC0045a interfaceC0045a) {
            this.a = context.getApplicationContext();
            this.b = interfaceC0045a;
        }
    }

    public c(Context context, androidx.media3.datasource.a aVar) {
        this.a = context.getApplicationContext();
        aVar.getClass();
        this.c = aVar;
        this.b = new ArrayList();
    }

    public static void c(@Nullable androidx.media3.datasource.a aVar, mjp0 mjp0Var) {
        if (aVar != null) {
            aVar.addTransferListener(mjp0Var);
        }
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        this.c.addTransferListener(mjp0Var);
        this.b.add(mjp0Var);
        c(this.d, mjp0Var);
        c(this.e, mjp0Var);
        c(this.f, mjp0Var);
        c(this.g, mjp0Var);
        c(this.h, mjp0Var);
        c(this.i, mjp0Var);
        c(this.j, mjp0Var);
    }

    public final void b(androidx.media3.datasource.a aVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            aVar.addTransferListener((mjp0) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws IOException {
        androidx.media3.datasource.a aVar = this.k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        androidx.media3.datasource.a aVar = this.k;
        return aVar == null ? Collections.EMPTY_MAP : aVar.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        androidx.media3.datasource.a aVar = this.k;
        if (aVar == null) {
            return null;
        }
        return aVar.getUri();
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws IOException {
        fxc0.z(this.k == null);
        Uri uri = evkVar.a;
        String scheme = uri.getScheme();
        String str = y2r0.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || Objects.equals(scheme2, X3.i.b)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    FileDataSource fileDataSource = new FileDataSource(false);
                    this.d = fileDataSource;
                    b(fileDataSource);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.e = assetDataSource;
                    b(assetDataSource);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.e = assetDataSource2;
                b(assetDataSource2);
            }
            this.k = this.e;
        } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
            if (this.f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f = contentDataSource;
                b(contentDataSource);
            }
            this.k = this.f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            androidx.media3.datasource.a aVar = this.c;
            if (equals) {
                if (this.g == null) {
                    try {
                        int i = gqg0.t;
                        androidx.media3.datasource.a aVar2 = (androidx.media3.datasource.a) gqg0.class.getConstructor(null).newInstance(null);
                        this.g = aVar2;
                        b(aVar2);
                    } catch (ClassNotFoundException unused) {
                        ahn.F("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = aVar;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.h = udpDataSource;
                    b(udpDataSource);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    tuk tukVar = new tuk(false);
                    this.i = tukVar;
                    b(tukVar);
                }
                this.k = this.i;
            } else if (com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.j = rawResourceDataSource;
                    b(rawResourceDataSource);
                }
                this.k = this.j;
            } else {
                this.k = aVar;
            }
        }
        return this.k.open(evkVar);
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        androidx.media3.datasource.a aVar = this.k;
        aVar.getClass();
        return aVar.read(bArr, i, i2);
    }
}
