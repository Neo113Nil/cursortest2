package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.zcl;

/* renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4388jc {
    public static final a e = new a(null);
    private static volatile C4388jc f;
    private Ld a;
    private final AtomicBoolean b;
    private String c;
    private N3 d;

    /* renamed from: com.ironsource.jc$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final C4388jc a() {
            C4388jc c4388jc;
            C4388jc c4388jc2 = C4388jc.f;
            if (c4388jc2 != null) {
                return c4388jc2;
            }
            synchronized (this) {
                c4388jc = C4388jc.f;
                if (c4388jc == null) {
                    c4388jc = new C4388jc(null);
                    C4388jc.f = c4388jc;
                }
            }
            return c4388jc;
        }

        private a() {
        }

        public final InterfaceC4324g1 a(IronSource.a aVar) {
            C4388jc c4388jc = C4388jc.f;
            N3 b = c4388jc != null ? c4388jc.b() : null;
            C4388jc c4388jc2 = C4388jc.f;
            Ld e = c4388jc2 != null ? c4388jc2.e() : null;
            if (b != null && e != null) {
                return new C4397k3(b, e, aVar);
            }
            return new C4364i5();
        }
    }

    public /* synthetic */ C4388jc(zcl zclVar) {
        this();
    }

    public static final C4388jc d() {
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

    private C4388jc() {
        this.b = new AtomicBoolean(false);
        this.c = "";
    }

    public final void a(Ld ld) {
        this.a = ld;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void a(N3 n3) {
        this.d = n3;
    }
}
