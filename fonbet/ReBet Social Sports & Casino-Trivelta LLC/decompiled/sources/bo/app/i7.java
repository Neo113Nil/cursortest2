package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i7 {
    public static String a(y8 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = bc.f25298j;
        Intrinsics.checkNotNullParameter(event, "event");
        k1 k1Var = (k1) event;
        String string = k1Var.f25633b.getString("cid");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return k1Var.f25632a + string;
    }
}
