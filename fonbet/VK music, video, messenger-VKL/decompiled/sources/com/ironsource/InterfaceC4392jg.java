package com.ironsource;

import com.ironsource.C4428lg;

/* renamed from: com.ironsource.jg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4392jg {

    /* renamed from: com.ironsource.jg$a */
    public interface a {
        void a();
    }

    /* renamed from: com.ironsource.jg$b */
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

    /* renamed from: com.ironsource.jg$c */
    public interface c {
        InterfaceC4392jg a(b bVar);
    }

    /* renamed from: com.ironsource.jg$d */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC4392jg.c
        public InterfaceC4392jg a(b bVar) {
            return new e(new C4428lg(bVar.b()));
        }
    }

    /* renamed from: com.ironsource.jg$e */
    public static final class e implements InterfaceC4392jg {
        private final C4428lg a;

        /* renamed from: com.ironsource.jg$e$a */
        public static final class a implements C4428lg.a {
            final /* synthetic */ a a;

            public a(a aVar) {
                this.a = aVar;
            }

            @Override // com.ironsource.C4428lg.a
            public void a() {
                this.a.a();
            }
        }

        public e(C4428lg c4428lg) {
            this.a = c4428lg;
        }

        @Override // com.ironsource.InterfaceC4392jg
        public void a(a aVar) {
            this.a.a((C4428lg.a) new a(aVar));
        }

        @Override // com.ironsource.InterfaceC4392jg
        public void cancel() {
            this.a.e();
        }
    }

    void a(a aVar);

    void cancel();
}
