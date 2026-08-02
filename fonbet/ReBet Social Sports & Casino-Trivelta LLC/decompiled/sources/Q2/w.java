package Q2;

import Q2.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends M {

    /* renamed from: e, reason: collision with root package name */
    public static final b f9316e = new b(null);

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return (w) new a(workerClass).a();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a builder) {
        super(builder.d(), builder.g(), builder.e());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public static final w e(Class cls) {
        return f9316e.a(cls);
    }

    public static final class a extends M.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // Q2.M.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public w b() {
            if (c() && g().constraints.j()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new w(this);
        }

        @Override // Q2.M.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a f() {
            return this;
        }
    }
}
