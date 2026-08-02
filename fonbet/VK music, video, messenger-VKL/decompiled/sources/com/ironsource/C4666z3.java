package com.ironsource;

import kotlin.Result;
import xsna.epx;
import xsna.zcl;

/* renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4666z3 implements InterfaceC4473o7 {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public C4666z3(Boolean bool, Integer num, H3 h3) {
        this.a = bool;
        this.b = num;
        this.c = h3;
    }

    private final Object a(H3 h3) {
        return new A3(this.a, this.b, h3).a();
    }

    @Override // com.ironsource.InterfaceC4473o7
    public Object b() {
        Integer num;
        H3 h3 = H3.Second;
        Throwable a = Result.a(a(h3));
        if (a != null) {
            return new Result.Failure(a);
        }
        if (!epx.f(this.a, Boolean.TRUE) || (num = this.b) == null) {
            return null;
        }
        return new Wc(h3.a(num), null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4473o7
    public Object c() {
        Integer num;
        Throwable a = Result.a(a(this.c));
        if (a != null) {
            return new Result.Failure(a);
        }
        if (!epx.f(this.a, Boolean.TRUE) || (num = this.b) == null) {
            return null;
        }
        int intValue = num.intValue();
        H3 h3 = this.c;
        if (h3 != null) {
            return new C4570tf(intValue, h3);
        }
        return null;
    }

    public final Boolean d() {
        return this.a;
    }

    public final Integer e() {
        return this.b;
    }

    public final H3 f() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4473o7
    public Object a() {
        Throwable a = Result.a(new L4(this.a).a());
        if (a != null) {
            return new Result.Failure(a);
        }
        Boolean bool = this.a;
        if (bool != null) {
            return new K4(bool.booleanValue());
        }
        return null;
    }

    public /* synthetic */ C4666z3(Boolean bool, Integer num, H3 h3, int i, zcl zclVar) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : h3);
    }
}
