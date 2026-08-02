package Cc;

import android.content.Context;
import c.Z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public e() {
    }

    public final Z a(Context context) {
        Z z10;
        Intrinsics.checkNotNullParameter(context, "context");
        Z z11 = Z.f26510d;
        if (z11 != null) {
            return z11;
        }
        synchronized (this) {
            z10 = Z.f26510d;
            if (z10 == null) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                z10 = new Z(applicationContext);
                Z.f26510d = z10;
            }
        }
        return z10;
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
