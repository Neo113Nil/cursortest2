package qf0;

import Sc.o;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qf0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC9053a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9053a[] $VALUES;
    public static final EnumC9053a Available;
    public static final EnumC9053a NotAvailable;
    public static final EnumC9053a Unknown;

    /* renamed from: qf0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1389a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82068a;

        static {
            int[] iArr = new int[EnumC9053a.values().length];
            try {
                iArr[EnumC9053a.Available.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9053a.NotAvailable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9053a.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f82068a = iArr;
        }
    }

    static {
        EnumC9053a enumC9053a = new EnumC9053a("Available", 0);
        Available = enumC9053a;
        EnumC9053a enumC9053a2 = new EnumC9053a("NotAvailable", 1);
        NotAvailable = enumC9053a2;
        EnumC9053a enumC9053a3 = new EnumC9053a("Unknown", 2);
        Unknown = enumC9053a3;
        EnumC9053a[] enumC9053aArr = {enumC9053a, enumC9053a2, enumC9053a3};
        $VALUES = enumC9053aArr;
        $ENTRIES = Xc.b.a(enumC9053aArr);
    }

    private EnumC9053a() {
        throw null;
    }

    public static EnumC9053a valueOf(String str) {
        return (EnumC9053a) Enum.valueOf(EnumC9053a.class, str);
    }

    public static EnumC9053a[] values() {
        return (EnumC9053a[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i11 = C1389a.f82068a[ordinal()];
        if (i11 == 1) {
            return "available";
        }
        if (i11 == 2) {
            return "notAvailable";
        }
        if (i11 == 3) {
            return "unknown";
        }
        throw new o();
    }
}
