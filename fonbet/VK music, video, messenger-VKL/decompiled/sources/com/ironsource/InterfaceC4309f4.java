package com.ironsource;

import com.ironsource.InterfaceC4240b7;
import com.ironsource.InterfaceC4392jg;
import com.ironsource.Y6;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.f4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4309f4 {
    public static final c a = c.a;

    /* renamed from: com.ironsource.f4$a */
    public static final class a implements InterfaceC4309f4 {
        private final X6 b;
        private final InterfaceC4392jg c;
        private final AtomicBoolean d = new AtomicBoolean(false);

        /* renamed from: com.ironsource.f4$a$a, reason: collision with other inner class name */
        public static final class C0219a implements InterfaceC4392jg.a {
            final /* synthetic */ d a;
            final /* synthetic */ a b;

            public C0219a(d dVar, a aVar) {
                this.a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.InterfaceC4392jg.a
            public void a() {
                this.a.a(new InterfaceC4240b7.a(new Y6.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(X6 x6, InterfaceC4392jg interfaceC4392jg) {
            this.b = x6;
            this.c = interfaceC4392jg;
        }

        @Override // com.ironsource.InterfaceC4309f4
        public synchronized void a(d dVar) {
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new C0219a(dVar, this));
            }
        }

        @Override // com.ironsource.InterfaceC4309f4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* renamed from: com.ironsource.f4$b */
    public static final class b implements InterfaceC4309f4 {
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC4309f4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4309f4
        public void a(d dVar) {
        }
    }

    /* renamed from: com.ironsource.f4$d */
    public interface d {
        void a(InterfaceC4240b7 interfaceC4240b7);
    }

    static InterfaceC4309f4 a(Z6 z6) {
        return a.a(z6);
    }

    void a();

    void a(d dVar);

    /* renamed from: com.ironsource.f4$c */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        public final InterfaceC4309f4 a(Z6 z6) {
            if (!z6.b()) {
                return b.b;
            }
            W6 w6 = new W6(z6);
            InterfaceC4392jg.b bVar = new InterfaceC4392jg.b();
            bVar.b(w6.a());
            bVar.a(w6.a());
            return new a(w6, new InterfaceC4392jg.d().a(bVar));
        }

        public final InterfaceC4309f4 a() {
            return b.b;
        }
    }
}
