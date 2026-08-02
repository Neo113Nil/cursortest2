package Wg;

import ah.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j {
    public static final void a(r rVar, String key, Object obj) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            rVar.a().f(key, obj.toString());
            Unit unit = Unit.INSTANCE;
        }
    }
}
