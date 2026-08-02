package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import xsna.evk;
import xsna.mjp0;

/* compiled from: ResolvingDataSource.java */
/* loaded from: classes12.dex */
public final class g implements androidx.media3.datasource.a {
    public final androidx.media3.datasource.a a;
    public final b b;
    public boolean c;

    /* compiled from: ResolvingDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0045a {
        public final a.InterfaceC0045a a;
        public final b b;

        public a(a.InterfaceC0045a interfaceC0045a, b bVar) {
            this.a = interfaceC0045a;
            this.b = bVar;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g createDataSource() {
            return new g(this.a.createDataSource(), this.b);
        }
    }

    public g(androidx.media3.datasource.a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        this.a.addTransferListener(mjp0Var);
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws IOException {
        if (this.c) {
            this.c = false;
            this.a.close();
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        Uri uri = this.a.getUri();
        if (uri == null) {
            return null;
        }
        return this.b.a(uri);
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws IOException {
        evk d = this.b.d(evkVar);
        this.c = true;
        return this.a.open(d);
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.a.read(bArr, i, i2);
    }

    /* compiled from: ResolvingDataSource.java */
    /* loaded from: classes.dex */
    public interface b {
        evk d(evk evkVar) throws IOException;

        default Uri a(Uri uri) {
            return uri;
        }
    }
}
