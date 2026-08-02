package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2572o2 implements InterfaceC2590p2 {
    private final String a;
    private final Ed b;

    public C2572o2(String encryptedAuctionResponse, Ed providerName) {
        Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.a = encryptedAuctionResponse;
        this.b = providerName;
    }

    @Override // com.ironsource.InterfaceC2590p2
    public Object a() {
        Object m11180constructorimpl;
        String c = C2503k5.b().c();
        Intrinsics.checkNotNullExpressionValue(c, "getInstance().mediationKey");
        C2598pa c2598pa = new C2598pa(new F4(this.a, c));
        try {
            Result.Companion companion = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(c2598pa.a());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl == null) {
            return C2536m2.h.a((JSONObject) m11180constructorimpl, this.b.value());
        }
        C2556n4.d().a(m11183exceptionOrNullimpl);
        if (m11183exceptionOrNullimpl instanceof IllegalArgumentException) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new C2327a8(C2682u5.a.d())));
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m11180constructorimpl(ResultKt.createFailure(new C2327a8(C2682u5.a.h())));
    }
}
