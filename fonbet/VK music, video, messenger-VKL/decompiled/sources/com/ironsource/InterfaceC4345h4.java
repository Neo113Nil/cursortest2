package com.ironsource;

/* renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4345h4 {

    /* renamed from: com.ironsource.h4$a */
    public static final class a implements InterfaceC4345h4 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.ironsource.InterfaceC4345h4
        public void a() {
            C4617w8.a(C4355he.x, new C4527r8().a(B5.y, Boolean.valueOf(this.a)).a());
        }
    }

    /* renamed from: com.ironsource.h4$b */
    public static final class b implements InterfaceC4345h4 {
        private final boolean a;
        private final long b;
        private final InterfaceC4488p4 c;

        public b(boolean z, long j, InterfaceC4488p4 interfaceC4488p4) {
            this.a = z;
            this.b = j;
            this.c = interfaceC4488p4;
        }

        @Override // com.ironsource.InterfaceC4345h4
        public void a() {
            C4527r8 a = new C4527r8().a(B5.y, Boolean.valueOf(this.a));
            if (this.b > 0) {
                a.a(B5.B, Long.valueOf(this.c.a() - this.b));
            }
            C4617w8.a(C4355he.w, a.a());
        }

        public final InterfaceC4488p4 b() {
            return this.c;
        }
    }

    void a();
}
