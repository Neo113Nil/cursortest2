package p3;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements InterfaceC8846f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8846f f80136a;

    /* renamed from: b, reason: collision with root package name */
    private final q3.b f80137b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f80138c;

    /* renamed from: d, reason: collision with root package name */
    private long f80139d;

    public y(InterfaceC8846f interfaceC8846f, q3.b bVar) {
        this.f80136a = interfaceC8846f;
        bVar.getClass();
        this.f80137b = bVar;
    }

    @Override // p3.InterfaceC8846f
    public final void addTransferListener(z zVar) {
        zVar.getClass();
        this.f80136a.addTransferListener(zVar);
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws IOException {
        q3.b bVar = this.f80137b;
        try {
            this.f80136a.close();
        } finally {
            if (this.f80138c) {
                this.f80138c = false;
                bVar.a();
            }
        }
    }

    @Override // p3.InterfaceC8846f
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f80136a.getResponseHeaders();
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f80136a.getUri();
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws IOException {
        long open = this.f80136a.open(iVar);
        this.f80139d = open;
        if (open == 0) {
            return 0L;
        }
        if (iVar.f80072g == -1 && open != -1) {
            iVar = iVar.d(0L, open);
        }
        this.f80138c = true;
        this.f80137b.c(iVar);
        return this.f80139d;
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        if (this.f80139d == 0) {
            return -1;
        }
        int read = this.f80136a.read(bArr, i11, i12);
        if (read > 0) {
            this.f80137b.e(bArr, i11, read);
            long j11 = this.f80139d;
            if (j11 != -1) {
                this.f80139d = j11 - read;
            }
        }
        return read;
    }
}
