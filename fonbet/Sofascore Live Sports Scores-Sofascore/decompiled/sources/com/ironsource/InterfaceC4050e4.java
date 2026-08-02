package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4050e4 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.e4$a */
    public static final class a implements InterfaceC4050e4 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.ironsource.InterfaceC4050e4
        public void a() {
            C4322t8.a(C4096ge.x, new C4233o8().a(C4427z5.y, Boolean.valueOf(this.a)).a());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.e4$b */
    public static final class b implements InterfaceC4050e4 {
        private final boolean a;
        private final long b;

        @NotNull
        private final InterfaceC4193m4 c;

        public b(boolean z, long j, @NotNull InterfaceC4193m4 interfaceC4193m4) {
            interfaceC4193m4.getClass();
            this.a = z;
            this.b = j;
            this.c = interfaceC4193m4;
        }

        @Override // com.ironsource.InterfaceC4050e4
        public void a() {
            C4233o8 a = new C4233o8().a(C4427z5.y, Boolean.valueOf(this.a));
            if (this.b > 0) {
                a.a(C4427z5.B, Long.valueOf(this.c.a() - this.b));
            }
            C4322t8.a(C4096ge.w, a.a());
        }

        @NotNull
        public final InterfaceC4193m4 b() {
            return this.c;
        }
    }

    void a();
}
