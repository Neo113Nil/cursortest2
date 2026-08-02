package io.sentry.transport;

/* loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        private final int f68549a;

        a(int i11) {
            this.f68549a = i11;
        }

        @Override // io.sentry.transport.o
        public final int a() {
            return this.f68549a;
        }

        @Override // io.sentry.transport.o
        public final boolean b() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends o {

        /* renamed from: a, reason: collision with root package name */
        static final b f68550a = new b();

        @Override // io.sentry.transport.o
        public final int a() {
            return -1;
        }

        @Override // io.sentry.transport.o
        public final boolean b() {
            return true;
        }
    }

    public abstract int a();

    public abstract boolean b();
}
