package db0;

import eb0.C6340a;
import eb0.c;
import eb0.d;
import eb0.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: db0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6135a {

    /* renamed from: db0.a$a, reason: collision with other inner class name */
    public static final class C0956a implements InterfaceC6135a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<d> f61448a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<C6340a> f61449b;

        /* renamed from: c, reason: collision with root package name */
        private final c f61450c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final g f61451d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f61452e;

        public C0956a(@NotNull List<d> textBlocks, @NotNull List<C6340a> environments, c cVar, @NotNull g resetConfig, boolean z11) {
            Intrinsics.checkNotNullParameter(textBlocks, "textBlocks");
            Intrinsics.checkNotNullParameter(environments, "environments");
            Intrinsics.checkNotNullParameter(resetConfig, "resetConfig");
            this.f61448a = textBlocks;
            this.f61449b = environments;
            this.f61450c = cVar;
            this.f61451d = resetConfig;
            this.f61452e = z11;
        }

        public final c a() {
            return this.f61450c;
        }

        @NotNull
        public final List<C6340a> b() {
            return this.f61449b;
        }

        @NotNull
        public final g c() {
            return this.f61451d;
        }

        @NotNull
        public final List<d> d() {
            return this.f61448a;
        }

        public final boolean e() {
            return this.f61452e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0956a)) {
                return false;
            }
            C0956a c0956a = (C0956a) obj;
            return Intrinsics.d(this.f61448a, c0956a.f61448a) && Intrinsics.d(this.f61449b, c0956a.f61449b) && Intrinsics.d(this.f61450c, c0956a.f61450c) && Intrinsics.d(this.f61451d, c0956a.f61451d) && this.f61452e == c0956a.f61452e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f61452e) + ((this.f61451d.hashCode() + ((G.g.b(this.f61448a.hashCode() * 31, 31, this.f61449b) + (this.f61450c == null ? 0 : 157077371)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Idle(textBlocks=");
            sb2.append(this.f61448a);
            sb2.append(", environments=");
            sb2.append(this.f61449b);
            sb2.append(", badge=");
            sb2.append(this.f61450c);
            sb2.append(", resetConfig=");
            sb2.append(this.f61451d);
            sb2.append(", isNetworkProd=");
            return Pk0.a.a(")", sb2, this.f61452e);
        }
    }

    /* renamed from: db0.a$b */
    public static final class b implements InterfaceC6135a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f61453a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -902235913;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }
}
