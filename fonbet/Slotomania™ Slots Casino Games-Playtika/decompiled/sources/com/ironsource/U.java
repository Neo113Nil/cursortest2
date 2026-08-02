package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class U implements InterfaceC2675tg {
    private final String a;
    private final InterfaceC2525l9 b;
    private final boolean c;

    static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.r();
        }
    }

    static final class b extends Lambda implements Function0<IronSourceError> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.o();
        }
    }

    static final class c extends Lambda implements Function0<IronSourceError> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.n();
        }
    }

    static final class d extends Lambda implements Function0<IronSourceError> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.q();
        }
    }

    static final class e extends Lambda implements Function0<IronSourceError> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.o();
        }
    }

    static final class f extends Lambda implements Function0<IronSourceError> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.g();
        }
    }

    public U(String adm, InterfaceC2525l9 interfaceC2525l9, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.a = adm;
        this.b = interfaceC2525l9;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC2675tg
    public void a() throws C2637re {
        a(this.c, a.a);
        a(this.b != null, b.a);
        InterfaceC2525l9 interfaceC2525l9 = this.b;
        if (interfaceC2525l9 != null) {
            if (interfaceC2525l9.f() == EnumC2579o9.NonBidder) {
                a(this.a.length() == 0, c.a);
            }
            if (interfaceC2525l9.f() == EnumC2579o9.Bidder) {
                a(this.a.length() > 0, d.a);
            }
            a(interfaceC2525l9.f() != EnumC2579o9.NotSupported, e.a);
            a(interfaceC2525l9.e().length() > 0, f.a);
        }
    }
}
