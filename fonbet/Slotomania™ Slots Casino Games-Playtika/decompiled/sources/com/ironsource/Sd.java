package com.ironsource;

import com.ironsource.C2676u;
import com.ironsource.N7;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Sd {
    private final C2688ub a;
    private final Map<String, C2676u.d> b;
    private final Map<String, C2676u.d> c;

    public Sd(C2688ub tools, Map<String, C2676u.d> map, Map<String, C2676u.d> map2) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        this.a = tools;
        this.b = map;
        this.c = map2;
    }

    private final void b(N7.a aVar, String str, String str2, Integer num) {
        Object a = a(str2, num);
        if (Result.m11187isSuccessimpl(a)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a);
        if (m11183exceptionOrNullimpl != null) {
            this.a.b(str, 3004, m11183exceptionOrNullimpl.getMessage());
        }
    }

    public final void a(N7.a rewardService) {
        Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        Map<String, C2676u.d> map = this.c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C2676u.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Qd f = entry.getValue().f();
                if (f != null) {
                    b(rewardService, key, f.b(), f.a());
                }
            }
        }
        Map<String, C2676u.d> map2 = this.b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C2676u.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Qd a = entry2.getValue().a();
            if (a != null) {
                a(rewardService, key2, a.b(), a.a());
            }
        }
    }

    private final void a(N7.a aVar, String str, String str2, Integer num) {
        Object a = a(str2, num);
        if (Result.m11187isSuccessimpl(a)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(a);
        if (m11183exceptionOrNullimpl != null) {
            this.a.b(str, 3004, m11183exceptionOrNullimpl.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(Unit.INSTANCE);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
