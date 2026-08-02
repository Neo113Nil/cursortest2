package t60;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import s90.C9635d;
import s90.InterfaceC9636e;

/* loaded from: classes3.dex */
public final class b {
    public static final kotlin.reflect.d<? extends InterfaceC9636e> a(@NotNull String str) {
        Class cls;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -567451565) {
            if (hashCode != 93166550) {
                if (hashCode != 1272354024 || !lowerCase.equals("notifications")) {
                    return null;
                }
                cls = C9635d.class;
            } else {
                if (!lowerCase.equals("audio")) {
                    return null;
                }
                cls = s90.h.class;
            }
        } else {
            if (!lowerCase.equals("contacts")) {
                return null;
            }
            cls = s90.f.class;
        }
        return N.b(cls);
    }
}
