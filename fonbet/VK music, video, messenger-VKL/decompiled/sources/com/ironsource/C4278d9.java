package com.ironsource;

import com.ironsource.C4260c9;
import com.ironsource.InterfaceC4488p4;
import com.ironsource.Mb;
import xsna.zcl;

/* renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4278d9 {
    private final InterfaceC4488p4 a;
    private final Mb.a b;
    private Long c;
    private Long d;
    private Mb e;
    private C4260c9 f;

    /* JADX WARN: Multi-variable type inference failed */
    public C4278d9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final C4260c9 a() {
        return this.f;
    }

    public final C4260c9 b() {
        Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.c;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (this.e == null) {
                    return null;
                }
                long a = this.a.a();
                Mb mb = this.b.get();
                C4260c9 c4260c9 = new C4260c9(a - longValue, new C4260c9.a(Math.max(0L, mb.d() - r1.d()), Math.max(0L, mb.e() - r1.e()), Math.max(0L, mb.f() - r1.f())), longValue2 / 1024);
                this.f = c4260c9;
                return c4260c9;
            }
        }
        return null;
    }

    public C4278d9(InterfaceC4488p4 interfaceC4488p4, Mb.a aVar) {
        this.a = interfaceC4488p4;
        this.b = aVar;
    }

    public final void a(String str) {
        this.c = Long.valueOf(str.length());
        this.e = this.b.get();
        this.d = Long.valueOf(this.a.a());
    }

    public /* synthetic */ C4278d9(InterfaceC4488p4 interfaceC4488p4, Mb.a aVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? new InterfaceC4488p4.a() : interfaceC4488p4, (i & 2) != 0 ? new Mb.a.C0203a() : aVar);
    }
}
