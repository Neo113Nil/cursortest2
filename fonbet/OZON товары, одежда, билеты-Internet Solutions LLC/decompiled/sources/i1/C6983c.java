package i1;

import l1.J0;
import org.jetbrains.annotations.NotNull;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6983c {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull J0 j02, float f7) {
        boolean z11;
        int i11;
        if (j02 != null) {
            i11 = 0;
            z11 = true;
        } else {
            z11 = false;
            i11 = 3;
        }
        float f11 = 0;
        return ((Float.compare(f7, f11) <= 0 || Float.compare(f7, f11) <= 0) && !z11) ? eVar : androidx.compose.ui.graphics.a.a(eVar, new C6982b(f7, f7, i11, j02, z11));
    }
}
