package com.ironsource;

import kotlin.Result;

/* loaded from: classes13.dex */
public final class L4 implements InterfaceC4491p7 {
    private final Boolean a;

    public L4(Boolean bool) {
        this.a = bool;
    }

    @Override // com.ironsource.InterfaceC4491p7
    public Object a() {
        Boolean bool = this.a;
        return bool == null ? new Result.Failure(new Exception("enabled flag is not provided or invalid")) : bool;
    }
}
