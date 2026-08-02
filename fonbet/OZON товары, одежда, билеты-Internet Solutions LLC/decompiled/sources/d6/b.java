package d6;

import V5.v;
import androidx.annotation.NonNull;
import p6.k;

/* loaded from: classes8.dex */
public final class b implements v<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f61205a;

    public b(byte[] bArr) {
        k.c(bArr, "Argument must not be null");
        this.f61205a = bArr;
    }

    @Override // V5.v
    public final void a() {
    }

    @Override // V5.v
    @NonNull
    public final Class<byte[]> b() {
        return byte[].class;
    }

    @Override // V5.v
    @NonNull
    public final byte[] get() {
        return this.f61205a;
    }

    @Override // V5.v
    public final int getSize() {
        return this.f61205a.length;
    }
}
