package tg;

import Cg.C2778b;
import Qg.c;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.C9692a;

/* renamed from: tg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9872a {
    public static final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        c a11 = C2778b.a(packageName);
        if (a11 != null) {
            return a11.buildUuid();
        }
        String b11 = C9692a.b(context, "tracer_mapping_uuid");
        if (b11 == null || b11.equals("00000000-0000-0000-0000-000000000000")) {
            return null;
        }
        return b11;
    }
}
