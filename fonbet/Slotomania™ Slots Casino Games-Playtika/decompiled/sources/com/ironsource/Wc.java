package com.ironsource;

import com.ironsource.InterfaceC2595p7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Wc implements InterfaceC2595p7, InterfaceC2595p7.a {
    private final InterfaceC2592p4 a;
    private final I7 b;
    private final Map<String, Vc> c;

    public Wc(InterfaceC2592p4 currentTimeProvider, I7 repository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.a = currentTimeProvider;
        this.b = repository;
        this.c = new LinkedHashMap();
    }

    public final Map<String, Vc> a() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC2595p7.a
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.c.get(identifier) == null) {
            return;
        }
        this.b.a(this.a.a(), identifier);
    }

    private final boolean a(Vc vc, String str) {
        Long a = this.b.a(str);
        return a != null && this.a.a() - a.longValue() < vc.a();
    }

    @Override // com.ironsource.InterfaceC2595p7
    public G3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Vc vc = this.c.get(identifier);
        if (vc == null) {
            return new G3(false, null, 2, null);
        }
        if (a(vc, identifier)) {
            return new G3(true, I3.Pacing);
        }
        return new G3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC2595p7.a
    public Object a(String identifier, I3 cappingType, InterfaceC2559n7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object b = cappingConfig.b();
        if (Result.m11187isSuccessimpl(b)) {
            Vc vc = (Vc) b;
            if (vc != null) {
                this.c.put(identifier, vc);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(Unit.INSTANCE);
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(b);
        if (m11183exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m11180constructorimpl(Unit.INSTANCE);
    }
}
