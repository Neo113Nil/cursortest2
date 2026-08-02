package sg;

import Cg.C2778b;
import Qg.c;
import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9692a {
    public static final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Class<?> cls = Class.forName("ru.ok.tracer.Tracer");
            Object invoke = cls.getMethod("getAppToken", new Class[0]).invoke(cls.getField("INSTANCE").get(null), new Object[0]);
            Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Exception unused) {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            c a11 = C2778b.a(packageName);
            if (a11 != null) {
                return a11.appToken();
            }
            String b11 = b(context, "tracer_app_token");
            if (b11 == null || b11.equals("0000000000000000000000000000000000000000000")) {
                return null;
            }
            return b11;
        }
    }

    public static String b(Context context, String name) throws Resources.NotFoundException {
        String defPackage = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(defPackage, "packageName");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defPackage, "defPackage");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(name, "string", defPackage);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
