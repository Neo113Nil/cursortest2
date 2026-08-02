package io.sentry.transport;

/* loaded from: classes3.dex */
public abstract class B {

    public static final class b extends B {

        /* renamed from: a, reason: collision with root package name */
        public final int f52712a;

        public b(int i10) {
            super();
            this.f52712a = i10;
        }

        @Override // io.sentry.transport.B
        public int c() {
            return this.f52712a;
        }

        @Override // io.sentry.transport.B
        public boolean d() {
            return false;
        }
    }

    public static final class c extends B {

        /* renamed from: a, reason: collision with root package name */
        public static final c f52713a = new c();

        public c() {
            super();
        }

        @Override // io.sentry.transport.B
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.B
        public boolean d() {
            return true;
        }
    }

    public static B a() {
        return b(-1);
    }

    public static B b(int i10) {
        return new b(i10);
    }

    public static B e() {
        return c.f52713a;
    }

    public abstract int c();

    public abstract boolean d();

    public B() {
    }
}
