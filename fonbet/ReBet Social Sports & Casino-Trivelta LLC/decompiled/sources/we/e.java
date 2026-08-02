package we;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f67680b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f67681a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ e c(a aVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = Unit.INSTANCE;
            }
            return aVar.b(obj);
        }

        public final e a(d error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new e(error, null);
        }

        public final e b(Object obj) {
            return new e(obj, null);
        }

        public a() {
        }
    }

    public /* synthetic */ e(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    public static final e a(d dVar) {
        return f67680b.a(dVar);
    }

    public static final e e(Object obj) {
        return f67680b.b(obj);
    }

    public final Object b() {
        Object obj = this.f67681a;
        if ((obj instanceof d) || obj == null) {
            return null;
        }
        return obj;
    }

    public final d c() {
        Object obj = this.f67681a;
        if (obj instanceof d) {
            return (d) obj;
        }
        return null;
    }

    public final boolean d() {
        return !(this.f67681a instanceof d);
    }

    public e(Object obj) {
        this.f67681a = obj;
    }
}
