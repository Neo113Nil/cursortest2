package hm0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f65634a = new a(0);
    }

    /* renamed from: hm0.b$b, reason: collision with other inner class name */
    public static final class C1076b extends b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Throwable f65635a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1076b(@NotNull Throwable e11) {
            super(0);
            Intrinsics.checkNotNullParameter(e11, "e");
            this.f65635a = e11;
        }

        @NotNull
        public final Throwable a() {
            return this.f65635a;
        }
    }

    public static final class c<T> extends b {

        /* renamed from: a, reason: collision with root package name */
        private final T f65636a;

        public c(T t2) {
            super(0);
            this.f65636a = t2;
        }

        public final T a() {
            return this.f65636a;
        }
    }

    public /* synthetic */ b(int i11) {
        this();
    }

    private b() {
    }
}
