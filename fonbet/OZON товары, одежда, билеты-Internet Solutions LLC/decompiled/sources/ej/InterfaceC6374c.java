package ej;

import We.B;
import We.InterfaceC4875q;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: ej.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC6374c {

    /* renamed from: ej.c$a */
    public interface a {
        Boolean isCommonNetworkClientEnabled();

        Boolean isHostSpecificDomainEnabled();
    }

    /* renamed from: ej.c$b */
    public interface b {

        /* renamed from: ej.c$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private static final C0980a f62361a = new C0980a();

            /* renamed from: ej.c$b$a$a, reason: collision with other inner class name */
            public static final class C0980a implements b {
                @Override // ej.InterfaceC6374c.b
                public final String getUserAgent() {
                    return "";
                }

                @Override // ej.InterfaceC6374c.b
                public final String getXO3AppName() {
                    return "";
                }

                @Override // ej.InterfaceC6374c.b
                public final String getXO3AppVersion() {
                    return "";
                }
            }

            @NotNull
            public static C0980a a() {
                return f62361a;
            }
        }

        @NotNull
        String getUserAgent();

        @NotNull
        String getXO3AppName();

        @NotNull
        String getXO3AppVersion();
    }

    /* renamed from: ej.c$c, reason: collision with other inner class name */
    public interface InterfaceC0981c {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: ej.c$c$a */
        public static final class a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a GOOGLE_PLAY;
            public static final a OTHER;

            static {
                a aVar = new a("GOOGLE_PLAY", 0);
                GOOGLE_PLAY = aVar;
                a aVar2 = new a("OTHER", 1);
                OTHER = aVar2;
                a[] aVarArr = {aVar, aVar2};
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
    }

    @NotNull
    String getApkName();

    @NotNull
    Fb0.e getBaseDomain();

    @NotNull
    InterfaceC4875q getCookieJar();

    a getFeatureFlags();

    @NotNull
    List<B> getInterceptors();

    @NotNull
    List<B> getNetworkInterceptors();

    @NotNull
    b getRequiredHeaders();

    InterfaceC0981c getUiData();
}
