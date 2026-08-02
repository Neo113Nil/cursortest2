package zb0;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes7.dex */
public abstract class e {

    @NotNull
    private static final b Companion = new b();

    @NotNull
    private final a attributes = new a();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private Date f107499a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f107500b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f107501c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f107502d;

        public a() {
            long currentTimeMillis = System.currentTimeMillis();
            b.Companion companion = kotlin.time.b.INSTANCE;
            this.f107499a = new Date(kotlin.time.b.h(kotlin.time.c.g(365, EnumC10311b.DAYS)) + currentTimeMillis);
            this.f107502d = true;
        }

        @NotNull
        public final Date a() {
            return this.f107499a;
        }

        public final boolean b() {
            return this.f107502d;
        }

        public final boolean c() {
            return this.f107501c;
        }

        public final boolean d() {
            return this.f107500b;
        }

        public final void e() {
            this.f107502d = false;
        }

        public final void f() {
            this.f107501c = true;
        }

        public final void g(boolean z11) {
            this.f107500b = z11;
        }
    }

    private static final class b {
    }

    public boolean equals(Object obj) {
        e eVar = obj instanceof e ? (e) obj : null;
        return Intrinsics.d(eVar != null ? eVar.getName() : null, getName());
    }

    @NotNull
    public final a getAttributes() {
        return this.attributes;
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract String getValue();

    public int hashCode() {
        return getName().hashCode();
    }
}
