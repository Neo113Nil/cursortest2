package g6;

import R5.a;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0488a {

    /* renamed from: a, reason: collision with root package name */
    private final W5.d f63884a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.b f63885b;

    public b(W5.b bVar, W5.d dVar) {
        this.f63884a = dVar;
        this.f63885b = bVar;
    }

    @NonNull
    public final Bitmap a(int i11, int i12, @NonNull Bitmap.Config config) {
        return this.f63884a.d(i11, i12, config);
    }

    @NonNull
    public final byte[] b(int i11) {
        W5.b bVar = this.f63885b;
        return bVar == null ? new byte[i11] : (byte[]) bVar.b(i11, byte[].class);
    }

    @NonNull
    public final int[] c(int i11) {
        W5.b bVar = this.f63885b;
        return bVar == null ? new int[i11] : (int[]) bVar.b(i11, int[].class);
    }

    public final void d(@NonNull Bitmap bitmap) {
        this.f63884a.c(bitmap);
    }

    public final void e(@NonNull byte[] bArr) {
        W5.b bVar = this.f63885b;
        if (bVar == null) {
            return;
        }
        bVar.a(bArr);
    }

    public final void f(@NonNull int[] iArr) {
        W5.b bVar = this.f63885b;
        if (bVar == null) {
            return;
        }
        bVar.a(iArr);
    }
}
