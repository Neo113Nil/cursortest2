package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes13.dex */
public final class U implements InterfaceC4679zg {
    private final String a;
    private final InterfaceC4439m9 b;
    private final boolean c;

    public static final class a extends Lambda implements gzs<IronSourceError> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.r();
        }
    }

    public static final class b extends Lambda implements gzs<IronSourceError> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.o();
        }
    }

    public static final class c extends Lambda implements gzs<IronSourceError> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.n();
        }
    }

    public static final class d extends Lambda implements gzs<IronSourceError> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.q();
        }
    }

    public static final class e extends Lambda implements gzs<IronSourceError> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.o();
        }
    }

    public static final class f extends Lambda implements gzs<IronSourceError> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.g();
        }
    }

    public U(String str, InterfaceC4439m9 interfaceC4439m9, boolean z) {
        this.a = str;
        this.b = interfaceC4439m9;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC4679zg
    public void a() throws C4533re {
        a(this.c, a.a);
        a(this.b != null, b.a);
        InterfaceC4439m9 interfaceC4439m9 = this.b;
        if (interfaceC4439m9 != null) {
            if (interfaceC4439m9.f() == EnumC4493p9.NonBidder) {
                a(this.a.length() == 0, c.a);
            }
            if (interfaceC4439m9.f() == EnumC4493p9.Bidder) {
                a(this.a.length() > 0, d.a);
            }
            a(interfaceC4439m9.f() != EnumC4493p9.NotSupported, e.a);
            a(interfaceC4439m9.e().length() > 0, f.a);
        }
    }
}
