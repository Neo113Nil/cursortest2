package oj0;

import B90.C2618u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj0.InterfaceC9075e;
import rj0.InterfaceC9287a;

/* renamed from: oj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8746a<Item extends InterfaceC9287a> {

    /* renamed from: oj0.a$a, reason: collision with other inner class name */
    public static final class C1332a<Item extends InterfaceC9287a> implements InterfaceC8746a<Item> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Item> f78408a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f78409b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f78410c;

        public C1332a(@NotNull ArrayList configurations, @NotNull List menuItems, boolean z11) {
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            Intrinsics.checkNotNullParameter(configurations, "configurations");
            this.f78408a = menuItems;
            this.f78409b = configurations;
            this.f78410c = z11;
        }

        @Override // oj0.InterfaceC8746a
        @NotNull
        public final List<Item> a() {
            return this.f78408a;
        }

        @NotNull
        public final List<InterfaceC9075e<?>> b() {
            return this.f78409b;
        }

        public final boolean c() {
            return this.f78410c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1332a)) {
                return false;
            }
            C1332a c1332a = (C1332a) obj;
            return Intrinsics.d(this.f78408a, c1332a.f78408a) && this.f78409b.equals(c1332a.f78409b) && this.f78410c == c1332a.f78410c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78410c) + C2618u.b(this.f78409b, this.f78408a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Idle(menuItems=");
            sb2.append(this.f78408a);
            sb2.append(", configurations=");
            sb2.append(this.f78409b);
            sb2.append(", shouldNeedReloadApp=");
            return Pk0.a.a(")", sb2, this.f78410c);
        }
    }

    /* renamed from: oj0.a$b */
    public static final class b<Item extends InterfaceC9287a> implements InterfaceC8746a<Item> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Item> f78411a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends Item> menuItems) {
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            this.f78411a = menuItems;
        }

        @Override // oj0.InterfaceC8746a
        @NotNull
        public final List<Item> a() {
            return this.f78411a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f78411a, ((b) obj).f78411a);
        }

        public final int hashCode() {
            return this.f78411a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("Init(menuItems="), this.f78411a, ")");
        }
    }

    @NotNull
    List<Item> a();
}
