package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2449h4 {

    /* renamed from: com.ironsource.h4$a */
    public static final class a implements InterfaceC2449h4 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.ironsource.InterfaceC2449h4
        public void a() {
            C2703v8.a(C2459he.x, new C2614q8().a(B5.y, Boolean.valueOf(this.a)).a());
        }
    }

    /* renamed from: com.ironsource.h4$b */
    public static final class b implements InterfaceC2449h4 {
        private final boolean a;
        private final long b;
        private final InterfaceC2592p4 c;

        public b(boolean z, long j, InterfaceC2592p4 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.a = z;
            this.b = j;
            this.c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC2449h4
        public void a() {
            C2614q8 a = new C2614q8().a(B5.y, Boolean.valueOf(this.a));
            if (this.b > 0) {
                a.a(B5.B, Long.valueOf(this.c.a() - this.b));
            }
            C2703v8.a(C2459he.w, a.a());
        }

        public final InterfaceC2592p4 b() {
            return this.c;
        }
    }

    void a();
}
