package fe;

import Sd.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L {
    @NotNull
    public static final Sd.b a(@NotNull Pd.c cVar, int i11) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return b.a.a(cVar.a(i11), cVar.b(i11));
    }

    @NotNull
    public static final Sd.f b(@NotNull Pd.c cVar, int i11) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Sd.f e11 = Sd.f.e(cVar.getString(i11));
        Intrinsics.checkNotNullExpressionValue(e11, "guessByFirstCharacter(...)");
        return e11;
    }
}
