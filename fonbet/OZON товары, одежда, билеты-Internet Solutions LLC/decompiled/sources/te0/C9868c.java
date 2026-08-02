package te0;

import android.app.Application;
import android.content.Context;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sj.e;

/* renamed from: te0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9868c {
    public static void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            e eVar = e.f98817f;
            Intrinsics.g(eVar, "null cannot be cast to non-null type ru.ozon.android.ozonLogger.core.internal.AbstractOzonLoggerManager<*, *, *>");
            Field declaredField = e.class.getSuperclass().getDeclaredField("isInitialized");
            Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            if (declaredField.getBoolean(eVar)) {
                return;
            }
        } catch (Exception unused) {
        }
        Intrinsics.checkNotNullParameter(context, "context");
        sj.c cVar = new sj.c((Application) context, "null", "maps-sdk-selfinit");
        cVar.o();
        e.f98817f.m(cVar);
    }
}
