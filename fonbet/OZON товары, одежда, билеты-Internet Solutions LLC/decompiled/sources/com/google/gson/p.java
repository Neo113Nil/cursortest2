package com.google.gson;

/* loaded from: classes9.dex */
public interface p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ALLOW;
        public static final a BLOCK_ALL;
        public static final a BLOCK_INACCESSIBLE;
        public static final a INDECISIVE;

        static {
            a aVar = new a("ALLOW", 0);
            ALLOW = aVar;
            a aVar2 = new a("INDECISIVE", 1);
            INDECISIVE = aVar2;
            a aVar3 = new a("BLOCK_INACCESSIBLE", 2);
            BLOCK_INACCESSIBLE = aVar3;
            a aVar4 = new a("BLOCK_ALL", 3);
            BLOCK_ALL = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
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

    a a();
}
