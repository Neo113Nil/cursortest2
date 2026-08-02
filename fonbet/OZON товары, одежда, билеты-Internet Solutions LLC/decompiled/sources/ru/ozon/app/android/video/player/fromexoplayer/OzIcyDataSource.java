package ru.ozon.app.android.video.player.fromexoplayer;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import m3.C8050C;
import p3.InterfaceC8846f;
import p3.i;
import p3.z;

/* loaded from: classes2.dex */
public final class OzIcyDataSource implements InterfaceC8846f {
    private int bytesUntilMetadata;
    private final Listener listener;
    private final int metadataIntervalBytes;
    private final byte[] metadataLengthByteHolder;
    private final InterfaceC8846f upstream;

    /* loaded from: classes7.dex */
    public interface Listener {
        void onIcyMetadata(C8050C c8050c);
    }

    public OzIcyDataSource(InterfaceC8846f interfaceC8846f, int i11, Listener listener) {
        G10.a.c(i11 > 0);
        this.upstream = interfaceC8846f;
        this.metadataIntervalBytes = i11;
        this.listener = listener;
        this.metadataLengthByteHolder = new byte[1];
        this.bytesUntilMetadata = i11;
    }

    private boolean readMetadata() throws IOException {
        if (this.upstream.read(this.metadataLengthByteHolder, 0, 1) != -1) {
            int i11 = (this.metadataLengthByteHolder[0] & 255) << 4;
            if (i11 != 0) {
                byte[] bArr = new byte[i11];
                int i12 = i11;
                int i13 = 0;
                while (i12 > 0) {
                    int read = this.upstream.read(bArr, i13, i12);
                    if (read != -1) {
                        i13 += read;
                        i12 -= read;
                    }
                }
                while (i11 > 0 && bArr[i11 - 1] == 0) {
                    i11--;
                }
                if (i11 > 0) {
                    this.listener.onIcyMetadata(new C8050C(i11, bArr));
                }
            }
            return true;
        }
        return false;
    }

    @Override // p3.InterfaceC8846f
    public void addTransferListener(z zVar) {
        zVar.getClass();
        this.upstream.addTransferListener(zVar);
    }

    @Override // p3.InterfaceC8846f
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p3.InterfaceC8846f
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // p3.InterfaceC8846f
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // p3.InterfaceC8846f
    public long open(i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // j3.InterfaceC7268j
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (this.bytesUntilMetadata == 0) {
            if (!readMetadata()) {
                return -1;
            }
            this.bytesUntilMetadata = this.metadataIntervalBytes;
        }
        int read = this.upstream.read(bArr, i11, Math.min(this.bytesUntilMetadata, i12));
        if (read != -1) {
            this.bytesUntilMetadata -= read;
        }
        return read;
    }
}
