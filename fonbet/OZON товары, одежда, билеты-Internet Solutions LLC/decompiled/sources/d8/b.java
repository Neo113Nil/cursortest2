package d8;

import S7.q;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f61274a;

    private b(int i11) {
        this.f61274a = i11;
    }

    public static b b(int i11) throws GeneralSecurityException {
        if (i11 == 16 || i11 == 32) {
            return new b(i11);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i11 * 8)));
    }

    @Override // S7.q
    public final boolean a() {
        return false;
    }

    public final int c() {
        return this.f61274a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f61274a == this.f61274a;
    }

    public final int hashCode() {
        return Objects.hash(b.class, Integer.valueOf(this.f61274a));
    }

    public final String toString() {
        return K00.b.e(this.f61274a, "-byte key)", new StringBuilder("AesCmac PRF Parameters ("));
    }
}
