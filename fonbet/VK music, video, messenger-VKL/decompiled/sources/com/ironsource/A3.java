package com.ironsource;

import kotlin.Result;

/* loaded from: classes13.dex */
public final class A3 implements InterfaceC4491p7 {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public A3(Boolean bool, Integer num, H3 h3) {
        this.a = bool;
        this.b = num;
        this.c = h3;
    }

    @Override // com.ironsource.InterfaceC4491p7
    public Object a() {
        Boolean bool = this.a;
        if (bool == null) {
            return new Result.Failure(new Exception("enabled flag is not provided or invalid"));
        }
        if (!bool.booleanValue()) {
            return Boolean.FALSE;
        }
        Integer num = this.b;
        return (num == null || num.intValue() <= 0) ? new Result.Failure(new Exception("limit flag is not provided or invalid")) : this.c == null ? new Result.Failure(new Exception("unit flag is not provided or invalid")) : Boolean.TRUE;
    }
}
