package androidx.media3.exoplayer.source;

import android.net.Uri;
import e1.AbstractC4134a;
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.source.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2222x implements InterfaceC4411g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4411g f21883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21884b;

    /* renamed from: c, reason: collision with root package name */
    public final a f21885c;

    /* renamed from: d, reason: collision with root package name */
    public int f21886d;
    private final byte[] metadataLengthByteHolder;

    /* renamed from: androidx.media3.exoplayer.source.x$a */
    public interface a {
        void b(e1.J j10);
    }

    public C2222x(InterfaceC4411g interfaceC4411g, int i10, a aVar) {
        AbstractC4134a.a(i10 > 0);
        this.f21883a = interfaceC4411g;
        this.f21884b = i10;
        this.f21885c = aVar;
        this.metadataLengthByteHolder = new byte[1];
        this.f21886d = i10;
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        throw new UnsupportedOperationException();
    }

    @Override // h1.InterfaceC4411g
    public void c(InterfaceC4403F interfaceC4403F) {
        AbstractC4134a.e(interfaceC4403F);
        this.f21883a.c(interfaceC4403F);
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // h1.InterfaceC4411g
    public Map f() {
        return this.f21883a.f();
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return this.f21883a.getUri();
    }

    public final boolean o() {
        if (this.f21883a.read(this.metadataLengthByteHolder, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.metadataLengthByteHolder[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f21883a.read(bArr, i12, i11);
            if (read == -1) {
                return false;
            }
            i12 += read;
            i11 -= read;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f21885c.b(new e1.J(bArr, i10));
        }
        return true;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f21886d == 0) {
            if (!o()) {
                return -1;
            }
            this.f21886d = this.f21884b;
        }
        int read = this.f21883a.read(bArr, i10, Math.min(this.f21886d, i11));
        if (read != -1) {
            this.f21886d -= read;
        }
        return read;
    }
}
