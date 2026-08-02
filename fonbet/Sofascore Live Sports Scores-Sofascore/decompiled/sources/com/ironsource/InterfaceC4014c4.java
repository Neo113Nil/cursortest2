package com.ironsource;

import com.ironsource.InterfaceC4098gg;
import com.ironsource.U6;
import com.ironsource.X6;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4014c4 {

    @NotNull
    public static final c a = c.a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.c4$d */
    public interface d {
        void a(@NotNull X6 x6);
    }

    @NotNull
    static InterfaceC4014c4 a(@NotNull V6 v6) {
        return a.a(v6);
    }

    void a();

    void a(@NotNull d dVar);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.c4$b */
    public static final class b implements InterfaceC4014c4 {

        @NotNull
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC4014c4
        public void a(@NotNull d dVar) {
            dVar.getClass();
        }

        @Override // com.ironsource.InterfaceC4014c4
        public void a() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.c4$a */
    public static final class a implements InterfaceC4014c4 {

        @NotNull
        private final T6 b;

        @NotNull
        private final InterfaceC4098gg c;

        @NotNull
        private final AtomicBoolean d;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.c4$a$a, reason: collision with other inner class name */
        public static final class C1196a implements InterfaceC4098gg.a {
            final /* synthetic */ d a;
            final /* synthetic */ a b;

            public C1196a(d dVar, a aVar) {
                this.a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.InterfaceC4098gg.a
            public void a() {
                this.a.a(new X6.a(new U6.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(@NotNull T6 t6, @NotNull InterfaceC4098gg interfaceC4098gg) {
            t6.getClass();
            interfaceC4098gg.getClass();
            this.b = t6;
            this.c = interfaceC4098gg;
            this.d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC4014c4
        public synchronized void a(@NotNull d dVar) {
            dVar.getClass();
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new C1196a(dVar, this));
            }
        }

        @Override // com.ironsource.InterfaceC4014c4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.c4$c */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        @NotNull
        public final InterfaceC4014c4 a(@NotNull V6 v6) {
            v6.getClass();
            if (!v6.b()) {
                return b.b;
            }
            S6 s6 = new S6(v6);
            InterfaceC4098gg.b bVar = new InterfaceC4098gg.b();
            bVar.b(s6.a());
            bVar.a(s6.a());
            return new a(s6, new InterfaceC4098gg.d().a(bVar));
        }

        @NotNull
        public final InterfaceC4014c4 a() {
            return b.b;
        }
    }
}
