package l90;

/* renamed from: l90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7901a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l90.a$a, reason: collision with other inner class name */
    public static final class EnumC1227a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1227a[] $VALUES;
        public static final EnumC1227a OZON_UPDATE_SDK;
        public static final EnumC1227a UPDATE_ERROR;

        static {
            EnumC1227a enumC1227a = new EnumC1227a("OZON_UPDATE_SDK", 0);
            OZON_UPDATE_SDK = enumC1227a;
            EnumC1227a enumC1227a2 = new EnumC1227a("UPDATE_ERROR", 1);
            UPDATE_ERROR = enumC1227a2;
            EnumC1227a[] enumC1227aArr = {enumC1227a, enumC1227a2};
            $VALUES = enumC1227aArr;
            $ENTRIES = Xc.b.a(enumC1227aArr);
        }

        private EnumC1227a() {
            throw null;
        }

        public static EnumC1227a valueOf(String str) {
            return (EnumC1227a) Enum.valueOf(EnumC1227a.class, str);
        }

        public static EnumC1227a[] values() {
            return (EnumC1227a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l90.a$b */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ERROR;
        public static final b UPDATE_AVAILABLE;
        public static final b UPDATE_NOT_AVAILABLE;

        static {
            b bVar = new b("UPDATE_AVAILABLE", 0);
            UPDATE_AVAILABLE = bVar;
            b bVar2 = new b("UPDATE_NOT_AVAILABLE", 1);
            UPDATE_NOT_AVAILABLE = bVar2;
            b bVar3 = new b("ERROR", 2);
            ERROR = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }
}
