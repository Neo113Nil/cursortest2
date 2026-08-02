package eb0;

import C.o0;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: eb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6340a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f62089a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f62090b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f62091c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f62092d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C0976a f62093e;

    /* renamed from: eb0.a$a, reason: collision with other inner class name */
    public static final class C0976a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f62094a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f62095b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f62096c;

        public C0976a(@NotNull String blockLocator, @NotNull String valueLocator, @NotNull String iconLocator) {
            Intrinsics.checkNotNullParameter(blockLocator, "blockLocator");
            Intrinsics.checkNotNullParameter(valueLocator, "valueLocator");
            Intrinsics.checkNotNullParameter(iconLocator, "iconLocator");
            this.f62094a = blockLocator;
            this.f62095b = valueLocator;
            this.f62096c = iconLocator;
        }

        @NotNull
        public final String a() {
            return this.f62094a;
        }

        @NotNull
        public final String b() {
            return this.f62096c;
        }

        @NotNull
        public final String c() {
            return this.f62095b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0976a)) {
                return false;
            }
            C0976a c0976a = (C0976a) obj;
            return Intrinsics.d(this.f62094a, c0976a.f62094a) && Intrinsics.d(this.f62095b, c0976a.f62095b) && Intrinsics.d(this.f62096c, c0976a.f62096c);
        }

        public final int hashCode() {
            return this.f62096c.hashCode() + G.g.a(this.f62094a.hashCode() * 31, 31, this.f62095b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TestInfoVO(blockLocator=");
            sb2.append(this.f62094a);
            sb2.append(", valueLocator=");
            sb2.append(this.f62095b);
            sb2.append(", iconLocator=");
            return o0.c(sb2, this.f62096c, ")");
        }
    }

    public C6340a(@NotNull String title, boolean z11, boolean z12, boolean z13, @NotNull C0976a testInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(testInfo, "testInfo");
        this.f62089a = title;
        this.f62090b = z11;
        this.f62091c = z12;
        this.f62092d = z13;
        this.f62093e = testInfo;
    }

    @NotNull
    public final C0976a a() {
        return this.f62093e;
    }

    @NotNull
    public final String b() {
        return this.f62089a;
    }

    public final boolean c() {
        return this.f62092d;
    }

    public final boolean d() {
        return this.f62090b;
    }

    public final boolean e() {
        return this.f62091c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6340a)) {
            return false;
        }
        C6340a c6340a = (C6340a) obj;
        return Intrinsics.d(this.f62089a, c6340a.f62089a) && this.f62090b == c6340a.f62090b && this.f62091c == c6340a.f62091c && this.f62092d == c6340a.f62092d && Intrinsics.d(this.f62093e, c6340a.f62093e);
    }

    public final int hashCode() {
        return this.f62093e.hashCode() + C3532b.a(C3532b.a(C3532b.a(this.f62089a.hashCode() * 31, 31, this.f62090b), 31, this.f62091c), 31, this.f62092d);
    }

    @NotNull
    public final String toString() {
        return "HostAppEnvVO(title=" + this.f62089a + ", isSelected=" + this.f62090b + ", isUserValue=" + this.f62091c + ", isLast=" + this.f62092d + ", testInfo=" + this.f62093e + ")";
    }
}
