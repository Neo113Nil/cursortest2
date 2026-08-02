package qf0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class c {

    /* loaded from: classes3.dex */
    public static abstract class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C1390a f82070b = new C1390a();

        /* renamed from: a, reason: collision with root package name */
        private final int f82071a;

        /* renamed from: qf0.c$a$a, reason: collision with other inner class name */
        public static final class C1390a extends a {
        }

        public a() {
            super(0);
            this.f82071a = 80;
        }

        @Override // qf0.c
        public int a() {
            return this.f82071a;
        }

        @NotNull
        public final String toString() {
            return "http";
        }
    }

    public static abstract class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f82072b = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f82073a;

        public static final class a extends b {
        }

        public b() {
            super(0);
            this.f82073a = 443;
        }

        @Override // qf0.c
        public int a() {
            return this.f82073a;
        }

        @NotNull
        public final String toString() {
            return "https";
        }
    }

    /* renamed from: qf0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC1391c extends c {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f82074b = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f82075a;

        /* renamed from: qf0.c$c$a */
        public static final class a extends AbstractC1391c {
        }

        public AbstractC1391c() {
            super(0);
            this.f82075a = 80;
        }

        @Override // qf0.c
        public int a() {
            return this.f82075a;
        }

        @NotNull
        public final String toString() {
            return "tcp";
        }
    }

    public c(int i11) {
    }

    public abstract int a();
}
