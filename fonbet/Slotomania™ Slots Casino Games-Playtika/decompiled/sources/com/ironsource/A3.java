package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes5.dex */
public final class A3 implements InterfaceC2577o7 {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public A3(Boolean bool, Integer num, H3 h3) {
        this.a = bool;
        this.b = num;
        this.c = h3;
    }

    @Override // com.ironsource.InterfaceC2577o7
    public Object a() {
        Boolean bool = this.a;
        if (bool == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(Boolean.FALSE);
        }
        Integer num = this.b;
        if (num == null || num.intValue() <= 0) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("limit flag is not provided or invalid")));
        }
        if (this.c == null) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("unit flag is not provided or invalid")));
        }
        Result.Companion companion5 = Result.INSTANCE;
        return Result.m11180constructorimpl(Boolean.TRUE);
    }
}
