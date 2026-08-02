package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2475ic {
    public static final a e = new a(null);
    private static volatile C2475ic f;
    private Ld a;
    private final AtomicBoolean b;
    private String c;
    private N3 d;

    /* renamed from: com.ironsource.ic$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final C2475ic a() {
            C2475ic c2475ic;
            C2475ic c2475ic2 = C2475ic.f;
            if (c2475ic2 != null) {
                return c2475ic2;
            }
            synchronized (this) {
                c2475ic = C2475ic.f;
                if (c2475ic == null) {
                    c2475ic = new C2475ic(null);
                    a aVar = C2475ic.e;
                    C2475ic.f = c2475ic;
                }
            }
            return c2475ic;
        }

        private a() {
        }

        public final InterfaceC2428g1 a(IronSource.a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C2475ic c2475ic = C2475ic.f;
            N3 b = c2475ic != null ? c2475ic.b() : null;
            C2475ic c2475ic2 = C2475ic.f;
            Ld e = c2475ic2 != null ? c2475ic2.e() : null;
            if (b != null && e != null) {
                return new C2501k3(b, e, adFormat);
            }
            return new C2468i5();
        }
    }

    public /* synthetic */ C2475ic(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final C2475ic d() {
        return e.a();
    }

    public final N3 b() {
        return this.d;
    }

    public final AtomicBoolean c() {
        return this.b;
    }

    public final Ld e() {
        return this.a;
    }

    public final String f() {
        return this.c;
    }

    public final void g() {
        this.b.set(true);
    }

    private C2475ic() {
        this.b = new AtomicBoolean(false);
        this.c = "";
    }

    public final void a(Ld ld) {
        this.a = ld;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(N3 n3) {
        this.d = n3;
    }
}
