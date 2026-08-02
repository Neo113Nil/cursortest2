package f8;

import com.google.crypto.tink.shaded.protobuf.C5919z;

/* renamed from: f8.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6443A implements C5919z.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final C5919z.b<EnumC6443A> internalValueMap = new a();
    private final int value;

    /* renamed from: f8.A$a */
    final class a implements C5919z.b<EnumC6443A> {
    }

    EnumC6443A(int i11) {
        this.value = i11;
    }

    public static EnumC6443A a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_HASH;
        }
        if (i11 == 1) {
            return SHA1;
        }
        if (i11 == 2) {
            return SHA384;
        }
        if (i11 == 3) {
            return SHA256;
        }
        if (i11 == 4) {
            return SHA512;
        }
        if (i11 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
