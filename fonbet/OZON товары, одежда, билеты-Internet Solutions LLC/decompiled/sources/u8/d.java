package u8;

/* JADX WARN: Method from annotation default annotation not found: intEncoding */
/* loaded from: classes9.dex */
public @interface d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a DEFAULT;
        public static final a FIXED;
        public static final a SIGNED;

        static {
            a aVar = new a("DEFAULT", 0);
            DEFAULT = aVar;
            a aVar2 = new a("SIGNED", 1);
            SIGNED = aVar2;
            a aVar3 = new a("FIXED", 2);
            FIXED = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }
}
