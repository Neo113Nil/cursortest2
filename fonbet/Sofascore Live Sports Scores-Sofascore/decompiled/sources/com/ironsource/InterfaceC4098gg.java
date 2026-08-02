package com.ironsource;

import com.ironsource.C4133ig;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.gg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4098gg {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.gg$a */
    public interface a {
        void a();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.gg$c */
    public interface c {
        @NotNull
        InterfaceC4098gg a(@NotNull b bVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.gg$d */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC4098gg.c
        @NotNull
        public InterfaceC4098gg a(@NotNull b bVar) {
            bVar.getClass();
            return new e(new C4133ig(bVar.b()));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.gg$e */
    public static final class e implements InterfaceC4098gg {

        @NotNull
        private final C4133ig a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.gg$e$a */
        public static final class a implements C4133ig.a {
            final /* synthetic */ a a;

            public a(a aVar) {
                this.a = aVar;
            }

            @Override // com.ironsource.C4133ig.a
            public void a() {
                this.a.a();
            }
        }

        public e(@NotNull C4133ig c4133ig) {
            c4133ig.getClass();
            this.a = c4133ig;
        }

        @Override // com.ironsource.InterfaceC4098gg
        public void a(@NotNull a aVar) {
            aVar.getClass();
            this.a.a((C4133ig.a) new a(aVar));
        }

        @Override // com.ironsource.InterfaceC4098gg
        public void cancel() {
            this.a.e();
        }
    }

    void a(@NotNull a aVar);

    void cancel();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.gg$b */
    public static final class b {
        private long a;
        private long b;

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.a;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void b(long j) {
            this.a = j;
        }
    }
}
