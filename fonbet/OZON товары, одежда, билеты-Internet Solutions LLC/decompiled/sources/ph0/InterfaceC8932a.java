package ph0;

import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ph0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8932a {

    /* renamed from: ph0.a$a, reason: collision with other inner class name */
    public static final class C1363a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f80538a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f80539b;

        /* renamed from: ph0.a$a$a, reason: collision with other inner class name */
        public static final class C1364a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f80540a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f80541b;

            /* renamed from: c, reason: collision with root package name */
            private final int f80542c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private final EnumC1365a f80543d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: ph0.a$a$a$a, reason: collision with other inner class name */
            public static final class EnumC1365a {
                private static final /* synthetic */ Xc.a $ENTRIES;
                private static final /* synthetic */ EnumC1365a[] $VALUES;
                public static final EnumC1365a AVAILABLE;
                public static final EnumC1365a NA;
                public static final EnumC1365a NOT_AVAILABLE;

                static {
                    EnumC1365a enumC1365a = new EnumC1365a("AVAILABLE", 0);
                    AVAILABLE = enumC1365a;
                    EnumC1365a enumC1365a2 = new EnumC1365a("NOT_AVAILABLE", 1);
                    NOT_AVAILABLE = enumC1365a2;
                    EnumC1365a enumC1365a3 = new EnumC1365a("NA", 2);
                    NA = enumC1365a3;
                    EnumC1365a[] enumC1365aArr = {enumC1365a, enumC1365a2, enumC1365a3};
                    $VALUES = enumC1365aArr;
                    $ENTRIES = Xc.b.a(enumC1365aArr);
                }

                private EnumC1365a() {
                    throw null;
                }

                public static EnumC1365a valueOf(String str) {
                    return (EnumC1365a) Enum.valueOf(EnumC1365a.class, str);
                }

                public static EnumC1365a[] values() {
                    return (EnumC1365a[]) $VALUES.clone();
                }
            }

            public C1364a(@NotNull String pkg, @NotNull String versionName, int i11, @NotNull EnumC1365a serviceState) {
                Intrinsics.checkNotNullParameter(pkg, "pkg");
                Intrinsics.checkNotNullParameter(versionName, "versionName");
                Intrinsics.checkNotNullParameter(serviceState, "serviceState");
                this.f80540a = pkg;
                this.f80541b = versionName;
                this.f80542c = i11;
                this.f80543d = serviceState;
            }

            @NotNull
            public final String a() {
                return this.f80540a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1364a)) {
                    return false;
                }
                C1364a c1364a = (C1364a) obj;
                return Intrinsics.d(this.f80540a, c1364a.f80540a) && Intrinsics.d(this.f80541b, c1364a.f80541b) && this.f80542c == c1364a.f80542c && this.f80543d == c1364a.f80543d;
            }

            public final int hashCode() {
                return this.f80543d.hashCode() + ((G.g.a(this.f80540a.hashCode() * 31, 31, this.f80541b) + this.f80542c) * 31);
            }

            @NotNull
            public final String toString() {
                return "PackageInfo(pkg=" + this.f80540a + ", versionName=" + this.f80541b + ", versionCode=" + this.f80542c + ", serviceState=" + this.f80543d + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: ph0.a$a$b */
        public static final class b {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;
            public static final b OEM;
            public static final b UNIVERSAL;

            static {
                b bVar = new b("UNIVERSAL", 0);
                UNIVERSAL = bVar;
                b bVar2 = new b("OEM", 1);
                OEM = bVar2;
                b[] bVarArr = {bVar, bVar2};
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

        public C1363a(@NotNull b type, @NotNull ArrayList packagesInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(packagesInfo, "packagesInfo");
            this.f80538a = type;
            this.f80539b = packagesInfo;
        }

        @NotNull
        public final List<C1364a> a() {
            return this.f80539b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1363a)) {
                return false;
            }
            C1363a c1363a = (C1363a) obj;
            return this.f80538a == c1363a.f80538a && this.f80539b.equals(c1363a.f80539b);
        }

        public final int hashCode() {
            return this.f80539b.hashCode() + (this.f80538a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PushProviderInfo(type=");
            sb2.append(this.f80538a);
            sb2.append(", packagesInfo=");
            return Om.a(")", sb2, this.f80539b);
        }
    }

    @NotNull
    ArrayList a();
}
