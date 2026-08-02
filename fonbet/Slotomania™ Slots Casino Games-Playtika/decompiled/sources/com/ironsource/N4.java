package com.ironsource;

import com.ironsource.InterfaceC2595p7;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class N4 implements InterfaceC2595p7, InterfaceC2595p7.a {
    private final ConcurrentHashMap<String, K4> a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC2595p7
    public G3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        K4 k4 = this.a.get(identifier);
        return (k4 == null || k4.a()) ? new G3(false, null, 2, null) : new G3(true, I3.Delivery);
    }

    @Override // com.ironsource.InterfaceC2595p7.a
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC2595p7.a
    public Object a(String identifier, I3 cappingType, InterfaceC2559n7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object a = cappingConfig.a();
        if (Result.m11187isSuccessimpl(a)) {
            K4 k4 = (K4) a;
            if (k4 != null) {
                this.a.put(identifier, k4);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(Unit.INSTANCE);
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a);
        if (m11183exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m11180constructorimpl(Unit.INSTANCE);
    }
}
