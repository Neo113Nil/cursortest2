package com.vk.voip.ui.call_by_link.feature;

import java.util.ArrayList;
import xsna.cgw0;
import xsna.epx;
import xsna.oq;
import xsna.xl50;

/* compiled from: VoipCallByLinkPatch.kt */
/* loaded from: classes7.dex */
public abstract class c implements xl50 {

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class a extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$a$a, reason: collision with other inner class name */
        public static final class C2022a extends a {
            public static final C2022a b = new C2022a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class b extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$b$b, reason: collision with other inner class name */
        public static final class C2023b extends b {
            public final cgw0 b;

            public C2023b(cgw0 cgw0Var) {
                this.b = cgw0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2023b) && epx.f(this.b, ((C2023b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SelectGroup(group=" + this.b + ')';
            }
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    /* renamed from: com.vk.voip.ui.call_by_link.feature.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC2024c extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$c$a */
        public static final class a extends AbstractC2024c {
            public static final a b = new a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$c$b */
        public static final class b extends AbstractC2024c {
            public static final b b = new b();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$c$c, reason: collision with other inner class name */
        public static final class C2025c extends AbstractC2024c {
            public static final C2025c b = new C2025c();
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class d extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class a extends d {
            public static final a b = new a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class b extends d {
            public static final b b = new b();
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class e extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class a extends e {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class b extends e {
            public static final b b = new b();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$e$c, reason: collision with other inner class name */
        public static final class C2026c extends e {
            public final ArrayList b;

            public C2026c(ArrayList arrayList) {
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2026c) && epx.f(this.b, ((C2026c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Success(groups="), this.b);
            }
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class f extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class a extends f {
            public static final a b = new a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class b extends f {
            public static final b b = new b();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$f$c, reason: collision with other inner class name */
        public static final class C2027c extends f {
            public static final C2027c b = new C2027c();
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class g extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class a extends g {
            public static final a b = new a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class b extends g {
            public static final b b = new b();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$g$c, reason: collision with other inner class name */
        public static final class C2028c extends g {
            public static final C2028c b = new C2028c();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class d extends g {
            public static final d b = new d();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class e extends g {
            public static final e b = new e();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class f extends g {
            public static final f b = new f();
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class h extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class a extends h {
            public static final a b = new a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class b extends h {
            public static final b b = new b();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.c$h$c, reason: collision with other inner class name */
        public static final class C2029c extends h {
            public static final C2029c b = new C2029c();
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class i extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class a extends i {
            public static final a b = new a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class b extends i {
            public static final b b = new b();
        }
    }

    /* compiled from: VoipCallByLinkPatch.kt */
    public static abstract class j extends c {

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class a extends j {
            public static final a b = new a();
        }

        /* compiled from: VoipCallByLinkPatch.kt */
        public static final class b extends j {
            public static final b b = new b();
        }
    }
}
