package c;

import android.util.Base64;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2454m {

    /* renamed from: a, reason: collision with root package name */
    public static final Ac.e f26625a = new Ac.e(null);

    /* renamed from: b, reason: collision with root package name */
    public static final C2454m f26626b;

    @NotNull
    private final byte[] publicKeyDER;

    static {
        byte[] decode = Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEC/GF9rnL0Opab4tY9S+X3Co+PlzrVIhQFV0VewgS10eI0dn//1rSfRosYV/iKo9bBoBaI5inp4oOQWnChgW0NQ==", 2);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        f26626b = new C2454m(decode);
    }

    public C2454m(byte[] publicKeyDER) {
        Intrinsics.checkNotNullParameter(publicKeyDER, "publicKeyDER");
        this.publicKeyDER = publicKeyDER;
    }

    public final byte[] a() {
        return this.publicKeyDER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2454m) && Intrinsics.areEqual(this.publicKeyDER, ((C2454m) obj).publicKeyDER);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.publicKeyDER);
    }

    public final String toString() {
        return "TransitCredentials(publicKeyDER=" + Arrays.toString(this.publicKeyDER) + ')';
    }
}
