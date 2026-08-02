package rg0;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rg0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC9269a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9269a[] $VALUES;

    @NotNull
    public static final C1426a Companion;
    public static final EnumC9269a SEND_STG_FATAL;
    public static final EnumC9269a SEND_STG_NONFATAL;

    @NotNull
    private final String path;

    /* renamed from: rg0.a$a, reason: collision with other inner class name */
    public static final class C1426a {
        public static EnumC9269a a(@NotNull String pathToFind) {
            Object obj;
            Intrinsics.checkNotNullParameter(pathToFind, "pathToFind");
            Iterator<E> it = EnumC9269a.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((EnumC9269a) obj).b(), pathToFind)) {
                    break;
                }
            }
            return (EnumC9269a) obj;
        }
    }

    static {
        EnumC9269a enumC9269a = new EnumC9269a("SEND_STG_FATAL", 0, "sendStgFatal");
        SEND_STG_FATAL = enumC9269a;
        EnumC9269a enumC9269a2 = new EnumC9269a("SEND_STG_NONFATAL", 1, "sendStgNonfatal");
        SEND_STG_NONFATAL = enumC9269a2;
        EnumC9269a[] enumC9269aArr = {enumC9269a, enumC9269a2};
        $VALUES = enumC9269aArr;
        $ENTRIES = Xc.b.a(enumC9269aArr);
        Companion = new C1426a();
    }

    private EnumC9269a(String str, int i11, String str2) {
        this.path = str2;
    }

    @NotNull
    public static Xc.a<EnumC9269a> a() {
        return $ENTRIES;
    }

    public static EnumC9269a valueOf(String str) {
        return (EnumC9269a) Enum.valueOf(EnumC9269a.class, str);
    }

    public static EnumC9269a[] values() {
        return (EnumC9269a[]) $VALUES.clone();
    }

    @NotNull
    public final String b() {
        return this.path;
    }
}
