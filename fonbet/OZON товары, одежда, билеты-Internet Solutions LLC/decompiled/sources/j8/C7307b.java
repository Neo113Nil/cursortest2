package j8;

import S7.r;
import com.google.crypto.tink.internal.H;

/* renamed from: j8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7307b {

    /* renamed from: a, reason: collision with root package name */
    private final C7306a f69505a;

    private C7307b(C7306a c7306a) {
        this.f69505a = c7306a;
    }

    public static C7307b a(byte[] bArr, r rVar) {
        if (rVar != null) {
            return new C7307b(C7306a.b(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static C7307b b(int i11) {
        return new C7307b(C7306a.b(H.a(i11)));
    }

    public final int c() {
        return this.f69505a.c();
    }

    public final byte[] d(r rVar) {
        if (rVar != null) {
            return this.f69505a.d();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
