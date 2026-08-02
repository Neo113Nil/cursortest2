package com.ironsource;

import kotlin.Result;
import org.json.JSONObject;

/* renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4468o2 implements InterfaceC4486p2 {
    private final String a;
    private final Ed b;

    public C4468o2(String str, Ed ed) {
        this.a = str;
        this.b = ed;
    }

    @Override // com.ironsource.InterfaceC4486p2
    public Object a() {
        Object failure;
        try {
            failure = new C4512qa(new F4(this.a, C4399k5.b().c())).a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return C4432m2.h.a((JSONObject) failure, this.b.value());
        }
        C4452n4.d().a(a);
        return a instanceof IllegalArgumentException ? new Result.Failure(new C4241b8(C4578u5.a.d())) : new Result.Failure(new C4241b8(C4578u5.a.h()));
    }
}
