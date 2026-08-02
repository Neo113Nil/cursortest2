package d70;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BEFORE_LOAD_URL;
        public static final a LOAD_URL_IO_ERROR;
        public static final a NATIVE_BRIDGE;
        public static final a PAGE_LOADED_DELAY;
        public static final a TEST;

        static {
            a aVar = new a("BEFORE_LOAD_URL", 0);
            BEFORE_LOAD_URL = aVar;
            a aVar2 = new a("LOAD_URL_IO_ERROR", 1);
            LOAD_URL_IO_ERROR = aVar2;
            a aVar3 = new a("NATIVE_BRIDGE", 2);
            NATIVE_BRIDGE = aVar3;
            a aVar4 = new a("TEST", 3);
            TEST = aVar4;
            a aVar5 = new a("PAGE_LOADED_DELAY", 4);
            PAGE_LOADED_DELAY = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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

    long a();

    void b();

    void c(boolean z11);

    void d();

    void e(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z11, boolean z12);

    void f();

    void g(boolean z11, @NotNull a aVar);

    boolean h();

    boolean i();

    boolean isConnected();

    void j(W60.a aVar);

    void onSaveInstanceState(@NotNull Bundle bundle);
}
