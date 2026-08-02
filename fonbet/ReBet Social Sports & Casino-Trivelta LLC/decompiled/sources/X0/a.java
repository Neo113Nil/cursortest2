package X0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0276a f13373b = new C0276a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f13374a = new LinkedHashMap();

    /* renamed from: X0.a$a, reason: collision with other inner class name */
    public static final class C0276a {
        public /* synthetic */ C0276a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0276a() {
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final b f13375c = new b();

        @Override // X0.a
        public Object a(c key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.f13374a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && Intrinsics.areEqual(this.f13374a, ((a) obj).f13374a);
    }

    public int hashCode() {
        return this.f13374a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f13374a + ')';
    }
}
