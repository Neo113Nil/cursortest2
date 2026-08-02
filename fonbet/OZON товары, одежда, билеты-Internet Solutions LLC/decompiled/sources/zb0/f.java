package zb0;

import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Cb0.j f107503a;

    @InterfaceC3999a
    /* loaded from: classes7.dex */
    public interface a {
        void a(@NotNull f fVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC3999a
    /* loaded from: classes7.dex */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Login;
        public static final b Logout;
        public static final b SwitchUser;

        @InterfaceC3999a
        public static final b TokenUpdate;

        static {
            b bVar = new b("Login", 0);
            Login = bVar;
            b bVar2 = new b("Logout", 1);
            Logout = bVar2;
            b bVar3 = new b("SwitchUser", 2);
            SwitchUser = bVar3;
            b bVar4 = new b("TokenUpdate", 3);
            TokenUpdate = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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

    public f(@NotNull Cb0.j config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f107503a = config;
    }

    @NotNull
    public final AbstractC11017b a() {
        return this.f107503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f107503a.equals(((f) obj).f107503a);
    }

    public final int hashCode() {
        return this.f107503a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "OzonIdCookieEvent(config=" + this.f107503a + ")";
    }
}
