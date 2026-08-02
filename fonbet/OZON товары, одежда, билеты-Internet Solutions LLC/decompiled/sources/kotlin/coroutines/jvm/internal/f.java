package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {
    public static final StackTraceElement a(@NotNull a aVar) {
        int i11;
        String str;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        e eVar = (e) aVar.getClass().getAnnotation(e.class);
        if (eVar == null) {
            return null;
        }
        int v11 = eVar.v();
        if (v11 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v11 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i11 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i11 = -1;
        }
        int i12 = i11 >= 0 ? eVar.l()[i11] : -1;
        g.f71776a.getClass();
        String a11 = g.a(aVar);
        if (a11 == null) {
            str = eVar.c();
        } else {
            str = a11 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i12);
    }
}
