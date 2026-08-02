package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes4.dex */
public final class L4 implements InterfaceC2577o7 {
    private final Boolean a;

    public L4(Boolean bool) {
        this.a = bool;
    }

    @Override // com.ironsource.InterfaceC2577o7
    public Object a() {
        Boolean bool = this.a;
        if (bool == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m11180constructorimpl(bool);
    }
}
