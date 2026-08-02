package com.ironsource;

import com.ironsource.C2425fg;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.dg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2389dg {

    /* renamed from: com.ironsource.dg$a */
    public interface a {
        void a();
    }

    /* renamed from: com.ironsource.dg$b */
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

    /* renamed from: com.ironsource.dg$c */
    public interface c {
        InterfaceC2389dg a(b bVar);
    }

    /* renamed from: com.ironsource.dg$d */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC2389dg.c
        public InterfaceC2389dg a(b timerConfig) {
            Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new e(new C2425fg(timerConfig.b()));
        }
    }

    /* renamed from: com.ironsource.dg$e */
    private static final class e implements InterfaceC2389dg {
        private final C2425fg a;

        /* renamed from: com.ironsource.dg$e$a */
        public static final class a implements C2425fg.a {
            final /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            @Override // com.ironsource.C2425fg.a
            public void a() {
                this.a.a();
            }
        }

        public e(C2425fg timer) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.a = timer;
        }

        @Override // com.ironsource.InterfaceC2389dg
        public void a(a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.a.a((C2425fg.a) new a(callback));
        }

        @Override // com.ironsource.InterfaceC2389dg
        public void cancel() {
            this.a.e();
        }
    }

    void a(a aVar);

    void cancel();
}
