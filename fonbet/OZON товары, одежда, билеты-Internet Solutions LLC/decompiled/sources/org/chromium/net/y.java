package org.chromium.net;

import java.util.Date;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public abstract class y {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f78961a;

        public a(Executor executor) {
            if (executor == null) {
                throw new IllegalStateException("Executor must not be null");
            }
            this.f78961a = executor;
        }

        public Executor a() {
            return this.f78961a;
        }
    }

    public static abstract class b {
        public abstract Date a();

        public abstract Date b();

        public abstract Date c();

        public abstract Date d();

        public abstract Date e();

        public abstract Date f();

        public abstract Date g();

        public abstract Date h();

        public abstract boolean i();

        public abstract Date j();

        public abstract Date k();

        public abstract Long l();
    }
}
