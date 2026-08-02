package p3;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import m3.N;

/* renamed from: p3.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8845e extends AbstractC8842b {

    /* renamed from: a, reason: collision with root package name */
    private i f80055a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f80056b;

    /* renamed from: c, reason: collision with root package name */
    private int f80057c;

    /* renamed from: d, reason: collision with root package name */
    private int f80058d;

    public C8845e() {
        super(false);
    }

    @Override // p3.InterfaceC8846f
    public final void close() {
        if (this.f80056b != null) {
            this.f80056b = null;
            transferEnded();
        }
        this.f80055a = null;
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        i iVar = this.f80055a;
        if (iVar != null) {
            return iVar.f80066a;
        }
        return null;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws IOException {
        transferInitializing(iVar);
        this.f80055a = iVar;
        Uri normalizeScheme = iVar.f80066a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        G10.a.b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i11 = N.f74289a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw j3.v.b("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f80056b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e11) {
                throw j3.v.b("Error while parsing Base64 encoded string: " + str, e11);
            }
        } else {
            this.f80056b = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f80056b;
        long length = bArr.length;
        long j11 = iVar.f80071f;
        if (j11 > length) {
            this.f80056b = null;
            throw new C8847g(2008);
        }
        int i12 = (int) j11;
        this.f80057c = i12;
        int length2 = bArr.length - i12;
        this.f80058d = length2;
        long j12 = iVar.f80072g;
        if (j12 != -1) {
            this.f80058d = (int) Math.min(length2, j12);
        }
        transferStarted(iVar);
        return j12 != -1 ? j12 : this.f80058d;
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f80058d;
        if (i13 == 0) {
            return -1;
        }
        int min = Math.min(i12, i13);
        byte[] bArr2 = this.f80056b;
        int i14 = N.f74289a;
        System.arraycopy(bArr2, this.f80057c, bArr, i11, min);
        this.f80057c += min;
        this.f80058d -= min;
        bytesTransferred(min);
        return min;
    }
}
