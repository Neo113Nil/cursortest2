package p3;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements InterfaceC8846f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8846f f80132a;

    /* renamed from: b, reason: collision with root package name */
    private long f80133b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f80134c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f80135d;

    public x(InterfaceC8846f interfaceC8846f) {
        interfaceC8846f.getClass();
        this.f80132a = interfaceC8846f;
        this.f80134c = Uri.EMPTY;
        this.f80135d = Collections.EMPTY_MAP;
    }

    @Override // p3.InterfaceC8846f
    public final void addTransferListener(z zVar) {
        zVar.getClass();
        this.f80132a.addTransferListener(zVar);
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws IOException {
        this.f80132a.close();
    }

    @Override // p3.InterfaceC8846f
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f80132a.getResponseHeaders();
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f80132a.getUri();
    }

    public final long i() {
        return this.f80133b;
    }

    public final Uri j() {
        return this.f80134c;
    }

    public final Map<String, List<String>> k() {
        return this.f80135d;
    }

    public final void l() {
        this.f80133b = 0L;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws IOException {
        InterfaceC8846f interfaceC8846f = this.f80132a;
        this.f80134c = iVar.f80066a;
        this.f80135d = Collections.EMPTY_MAP;
        try {
            return interfaceC8846f.open(iVar);
        } finally {
            Uri uri = interfaceC8846f.getUri();
            if (uri != null) {
                this.f80134c = uri;
            }
            this.f80135d = interfaceC8846f.getResponseHeaders();
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int read = this.f80132a.read(bArr, i11, i12);
        if (read != -1) {
            this.f80133b += read;
        }
        return read;
    }
}
