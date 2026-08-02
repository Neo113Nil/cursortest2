package L0;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f6750a;

        public a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f6750a = name;
        }

        public final String a() {
            return this.f6750a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.areEqual(this.f6750a, ((a) obj).f6750a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6750a.hashCode();
        }

        public String toString() {
            return this.f6750a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract boolean b(a aVar);

    public abstract Object c(a aVar);

    public final c d() {
        return new c(MapsKt.toMutableMap(a()), false);
    }

    public final f e() {
        return new c(MapsKt.toMutableMap(a()), true);
    }
}
