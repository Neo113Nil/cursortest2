package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.qlb0;
import xsna.zcl;

/* renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4308f3 implements InterfaceC4437m7 {

    /* renamed from: com.ironsource.f3$a */
    public static final class a extends AbstractC4308f3 {
        private final b a;

        public a(b bVar) {
            super(null);
            this.a = bVar;
        }

        public final a a(b bVar) {
            return new a(bVar);
        }

        public final b d() {
            return this.a;
        }

        public final b e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "First(firstReason=" + this.a + ")";
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = aVar.a;
            }
            return aVar.a(bVar);
        }
    }

    /* renamed from: com.ironsource.f3$b */
    public static abstract class b implements InterfaceC4437m7 {

        /* renamed from: com.ironsource.f3$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$b$b, reason: collision with other inner class name */
        public static final class C0217b extends b {
            public static final C0217b a = new C0217b();

            private C0217b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$b$c */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(zcl zclVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC4437m7
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C0217b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new NoWhenBranchMatchedException();
        }

        private b() {
        }
    }

    /* renamed from: com.ironsource.f3$c */
    public static final class c extends AbstractC4308f3 {
        private final long a;
        private final d b;

        public c(long j, d dVar) {
            super(null);
            this.a = j;
            this.b = dVar;
        }

        public final c a(long j, d dVar) {
            return new c(j, dVar);
        }

        public final long d() {
            return this.a;
        }

        public final d e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final d f() {
            return this.b;
        }

        public final long g() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public String toString() {
            return "Recurring(reloadDuration=" + this.a + ", recurringReason=" + this.b + ")";
        }

        public static /* synthetic */ c a(c cVar, long j, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                j = cVar.a;
            }
            if ((i & 2) != 0) {
                dVar = cVar.b;
            }
            return cVar.a(j, dVar);
        }
    }

    /* renamed from: com.ironsource.f3$d */
    public static abstract class d implements InterfaceC4437m7 {

        /* renamed from: com.ironsource.f3$d$a */
        public static final class a extends d {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$b */
        public static final class b extends d {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$c */
        public static final class c extends d {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$d, reason: collision with other inner class name */
        public static final class C0218d extends d {
            public static final C0218d a = new C0218d();

            private C0218d() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$e */
        public static final class e extends d {
            public static final e a = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$f */
        public static final class f extends d {
            private final long a;

            public f(long j) {
                super(null);
                this.a = j;
            }

            public final f a(long j) {
                return new f(j);
            }

            public final long c() {
                return this.a;
            }

            public final long d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public int hashCode() {
                return Long.hashCode(this.a);
            }

            public String toString() {
                return qlb0.a(this.a, "ResumeVisibility(notVisibleDuration=", ")");
            }

            public static /* synthetic */ f a(f fVar, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = fVar.a;
                }
                return fVar.a(j);
            }
        }

        /* renamed from: com.ironsource.f3$d$g */
        public static final class g extends d {
            public static final g a = new g();

            private g() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$h */
        public static final class h extends d {
            public static final h a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(zcl zclVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC4437m7
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C0218d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC4308f3(zcl zclVar) {
        this();
    }

    @Override // com.ironsource.InterfaceC4437m7
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC4308f3() {
    }
}
