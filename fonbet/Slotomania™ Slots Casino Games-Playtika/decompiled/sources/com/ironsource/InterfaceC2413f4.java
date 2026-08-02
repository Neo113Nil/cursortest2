package com.ironsource;

import com.ironsource.InterfaceC2326a7;
import com.ironsource.InterfaceC2389dg;
import com.ironsource.X6;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2413f4 {
    public static final c a = c.a;

    /* renamed from: com.ironsource.f4$a */
    public static final class a implements InterfaceC2413f4 {
        private final W6 b;
        private final InterfaceC2389dg c;
        private final AtomicBoolean d;

        /* renamed from: com.ironsource.f4$a$a, reason: collision with other inner class name */
        public static final class C0208a implements InterfaceC2389dg.a {
            final /* synthetic */ d a;
            final /* synthetic */ a b;

            C0208a(d dVar, a aVar) {
                this.a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.InterfaceC2389dg.a
            public void a() {
                this.a.a(new InterfaceC2326a7.a(new X6.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(W6 config, InterfaceC2389dg timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.b = config;
            this.c = timer;
            this.d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC2413f4
        public synchronized void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new C0208a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC2413f4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* renamed from: com.ironsource.f4$b */
    public static final class b implements InterfaceC2413f4 {
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC2413f4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC2413f4
        public void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* renamed from: com.ironsource.f4$d */
    public interface d {
        void a(InterfaceC2326a7 interfaceC2326a7);
    }

    @JvmStatic
    static InterfaceC2413f4 a(Y6 y6) {
        return a.a(y6);
    }

    void a();

    void a(d dVar);

    /* renamed from: com.ironsource.f4$c */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        @JvmStatic
        public final InterfaceC2413f4 a(Y6 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.b;
            }
            V6 v6 = new V6(featureFlag);
            InterfaceC2389dg.b bVar = new InterfaceC2389dg.b();
            bVar.b(v6.a());
            bVar.a(v6.a());
            return new a(v6, new InterfaceC2389dg.d().a(bVar));
        }

        public final InterfaceC2413f4 a() {
            return b.b;
        }
    }
}
