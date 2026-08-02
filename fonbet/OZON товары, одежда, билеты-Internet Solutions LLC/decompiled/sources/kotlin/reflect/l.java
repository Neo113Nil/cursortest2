package kotlin.reflect;

import nd.R0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface l extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a EXTENSION_RECEIVER;
        public static final a INSTANCE;
        public static final a VALUE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            a aVar2 = new a("EXTENSION_RECEIVER", 1);
            EXTENSION_RECEIVER = aVar2;
            a aVar3 = new a("VALUE", 2);
            VALUE = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
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

    boolean a();

    int getIndex();

    @NotNull
    a getKind();

    String getName();

    @NotNull
    R0 getType();

    boolean j();
}
