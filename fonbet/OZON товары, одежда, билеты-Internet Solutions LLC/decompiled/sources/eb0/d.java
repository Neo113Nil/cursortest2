package eb0;

import C.o0;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f62098a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f62099b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f62100c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f62101d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f62102a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f62103b;

        public a(@NotNull String blockLocator, @NotNull String valueLocator) {
            Intrinsics.checkNotNullParameter(blockLocator, "blockLocator");
            Intrinsics.checkNotNullParameter(valueLocator, "valueLocator");
            this.f62102a = blockLocator;
            this.f62103b = valueLocator;
        }

        @NotNull
        public final String a() {
            return this.f62102a;
        }

        @NotNull
        public final String b() {
            return this.f62103b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f62102a, aVar.f62102a) && Intrinsics.d(this.f62103b, aVar.f62103b);
        }

        public final int hashCode() {
            return this.f62103b.hashCode() + (this.f62102a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TestInfoVO(blockLocator=");
            sb2.append(this.f62102a);
            sb2.append(", valueLocator=");
            return o0.c(sb2, this.f62103b, ")");
        }
    }

    public d(@NotNull String title, @NotNull String value, boolean z11, @NotNull a testInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(testInfo, "testInfo");
        this.f62098a = title;
        this.f62099b = value;
        this.f62100c = z11;
        this.f62101d = testInfo;
    }

    @NotNull
    public final a a() {
        return this.f62101d;
    }

    @NotNull
    public final String b() {
        return this.f62098a;
    }

    @NotNull
    public final String c() {
        return this.f62099b;
    }

    public final boolean d() {
        return this.f62100c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f62098a.equals(dVar.f62098a) && Intrinsics.d(this.f62099b, dVar.f62099b) && this.f62100c == dVar.f62100c && this.f62101d.equals(dVar.f62101d);
    }

    public final int hashCode() {
        return this.f62101d.hashCode() + C3532b.a(G.g.a(this.f62098a.hashCode() * 31, 31, this.f62099b), 31, this.f62100c);
    }

    @NotNull
    public final String toString() {
        return "HostConfigTextBlockVO(title=" + this.f62098a + ", value=" + this.f62099b + ", isLast=" + this.f62100c + ", testInfo=" + this.f62101d + ")";
    }
}
