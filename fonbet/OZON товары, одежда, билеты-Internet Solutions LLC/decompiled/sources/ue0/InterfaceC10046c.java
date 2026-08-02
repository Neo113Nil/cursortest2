package ue0;

import org.jetbrains.annotations.NotNull;

/* renamed from: ue0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC10046c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ue0.c$a */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DEBUG;
        public static final a ERROR;
        public static final a INFO;

        static {
            a aVar = new a("DEBUG", 0);
            DEBUG = aVar;
            a aVar2 = new a("INFO", 1);
            INFO = aVar2;
            a aVar3 = new a("ERROR", 2);
            ERROR = aVar3;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ue0.c$b */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b FILE;
        public static final b FILE_AND_LOGCAT;
        public static final b LOGCAT;

        static {
            b bVar = new b("FILE", 0);
            FILE = bVar;
            b bVar2 = new b("LOGCAT", 1);
            LOGCAT = bVar2;
            b bVar3 = new b("FILE_AND_LOGCAT", 2);
            FILE_AND_LOGCAT = bVar3;
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

    void a(@NotNull String str, @NotNull String str2, Throwable th2);

    void b(@NotNull String str, @NotNull String str2);

    void c(@NotNull String str, @NotNull String str2);
}
