package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2770z3 implements InterfaceC2559n7 {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public C2770z3(Boolean bool, Integer num, H3 h3) {
        this.a = bool;
        this.b = num;
        this.c = h3;
    }

    private final Object a(H3 h3) {
        return new A3(this.a, this.b, h3).a();
    }

    @Override // com.ironsource.InterfaceC2559n7
    public Object b() {
        H3 h3 = H3.Second;
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a(h3));
        if (m11183exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
        }
        Vc vc = (!Intrinsics.areEqual(this.a, Boolean.TRUE) || this.b == null) ? null : new Vc(h3.a(this.b), null, 2, null);
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m11180constructorimpl(vc);
    }

    @Override // com.ironsource.InterfaceC2559n7
    public Object c() {
        C2674tf c2674tf;
        Integer num;
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a(this.c));
        if (m11183exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
        }
        if (Intrinsics.areEqual(this.a, Boolean.TRUE) && (num = this.b) != null) {
            int intValue = num.intValue();
            H3 h3 = this.c;
            if (h3 != null) {
                c2674tf = new C2674tf(intValue, h3);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m11180constructorimpl(c2674tf);
            }
        }
        c2674tf = null;
        Result.Companion companion22 = Result.INSTANCE;
        return Result.m11180constructorimpl(c2674tf);
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

    @Override // com.ironsource.InterfaceC2559n7
    public Object a() {
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(new L4(this.a).a());
        if (m11183exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
        }
        Result.Companion companion2 = Result.INSTANCE;
        Boolean bool = this.a;
        return Result.m11180constructorimpl(bool != null ? new K4(bool.booleanValue()) : null);
    }

    public /* synthetic */ C2770z3(Boolean bool, Integer num, H3 h3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : h3);
    }
}
