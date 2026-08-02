package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.xka;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class U implements InterfaceC4384wg {

    @NotNull
    private final String a;

    @Nullable
    private final InterfaceC4198m9 b;
    private final boolean c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function0<IronSourceError> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4301s5.a.r();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends xka implements Function0<IronSourceError> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4301s5.a.o();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends xka implements Function0<IronSourceError> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4301s5.a.n();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d extends xka implements Function0<IronSourceError> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4301s5.a.q();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class e extends xka implements Function0<IronSourceError> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4301s5.a.o();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class f extends xka implements Function0<IronSourceError> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4301s5.a.g();
        }
    }

    public U(@NotNull String str, @Nullable InterfaceC4198m9 interfaceC4198m9, boolean z) {
        str.getClass();
        this.a = str;
        this.b = interfaceC4198m9;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC4384wg
    public void a() throws C4257pe {
        a(this.c, a.a);
        a(this.b != null, b.a);
        InterfaceC4198m9 interfaceC4198m9 = this.b;
        if (interfaceC4198m9 != null) {
            if (interfaceC4198m9.f() == EnumC4252p9.NonBidder) {
                a(this.a.length() == 0, c.a);
            }
            if (interfaceC4198m9.f() == EnumC4252p9.Bidder) {
                a(this.a.length() > 0, d.a);
            }
            a(interfaceC4198m9.f() != EnumC4252p9.NotSupported, e.a);
            a(interfaceC4198m9.e().length() > 0, f.a);
        }
    }
}
