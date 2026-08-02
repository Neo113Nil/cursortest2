package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f22981a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f22982b;

    /* renamed from: c, reason: collision with root package name */
    public final h.f f22983c;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final Object f22984d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public static Executor f22985e;

        /* renamed from: a, reason: collision with root package name */
        public Executor f22986a;

        /* renamed from: b, reason: collision with root package name */
        public Executor f22987b;

        /* renamed from: c, reason: collision with root package name */
        public final h.f f22988c;

        public a(h.f fVar) {
            this.f22988c = fVar;
        }

        public c a() {
            if (this.f22987b == null) {
                synchronized (f22984d) {
                    try {
                        if (f22985e == null) {
                            f22985e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f22987b = f22985e;
            }
            return new c(this.f22986a, this.f22987b, this.f22988c);
        }
    }

    public c(Executor executor, Executor executor2, h.f fVar) {
        this.f22981a = executor;
        this.f22982b = executor2;
        this.f22983c = fVar;
    }

    public Executor a() {
        return this.f22982b;
    }

    public h.f b() {
        return this.f22983c;
    }

    public Executor c() {
        return this.f22981a;
    }
}
