package qf0;

import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes7.dex */
public abstract class d {

    /* loaded from: classes3.dex */
    public static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f82076c = new a();

        /* renamed from: d, reason: collision with root package name */
        private static final long f82077d;

        /* renamed from: e, reason: collision with root package name */
        private static final long f82078e;

        static {
            b.Companion companion = kotlin.time.b.INSTANCE;
            EnumC10311b enumC10311b = EnumC10311b.SECONDS;
            f82077d = kotlin.time.c.g(0, enumC10311b);
            f82078e = kotlin.time.c.g(0, enumC10311b);
        }

        @Override // qf0.d.b
        public final long a() {
            return f82078e;
        }

        @Override // qf0.d.b
        public final long b() {
            return f82077d;
        }
    }

    public static abstract class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final long f82079a;

        /* renamed from: b, reason: collision with root package name */
        private final long f82080b;

        /* loaded from: classes3.dex */
        public static final class a extends b {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final a f82081c = new a();
        }

        public b() {
            b.Companion companion = kotlin.time.b.INSTANCE;
            EnumC10311b enumC10311b = EnumC10311b.SECONDS;
            this.f82079a = kotlin.time.c.g(5, enumC10311b);
            this.f82080b = kotlin.time.c.g(2, enumC10311b);
        }

        public long a() {
            return this.f82079a;
        }

        public long b() {
            return this.f82080b;
        }
    }
}
