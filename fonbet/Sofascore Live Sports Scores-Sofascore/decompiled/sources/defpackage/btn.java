package defpackage;

import com.google.android.gms.internal.ads.zzini;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class btn implements zzini {
    public final ByteBuffer a;

    public btn(ByteBuffer byteBuffer) {
        this.a = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzini
    public final int S0(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzini
    public final ByteBuffer a(long j, long j2) {
        ByteBuffer byteBuffer = this.a;
        int position = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer slice = byteBuffer.slice();
        slice.limit((int) j2);
        byteBuffer.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.zzini
    public final void l(long j) {
        this.a.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzini
    public final long zzb() {
        return this.a.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzini
    public final long zzc() {
        return this.a.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
