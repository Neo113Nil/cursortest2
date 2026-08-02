package qf0;

import Sc.o;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Any;
    public static final b Cellular;
    public static final b WiFi;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82069a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WiFi.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Cellular.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Any.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f82069a = iArr;
        }
    }

    static {
        b bVar = new b("WiFi", 0);
        WiFi = bVar;
        b bVar2 = new b("Cellular", 1);
        Cellular = bVar2;
        b bVar3 = new b("Any", 2);
        Any = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = Xc.b.a(bVarArr);
    }

    private b() {
        throw null;
    }

    @NotNull
    public static Xc.a<b> a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i11 = a.f82069a[ordinal()];
        if (i11 == 1) {
            return "wifi";
        }
        if (i11 == 2) {
            return "cellular";
        }
        if (i11 == 3) {
            return "any";
        }
        throw new o();
    }
}
