package nf;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes10.dex */
public final class f {
    public static final boolean a(@NotNull C9681g c9681g) {
        C9681g c9681g2;
        int i11;
        Intrinsics.checkNotNullParameter(c9681g, "<this>");
        try {
            c9681g2 = new C9681g();
            long size = c9681g.size();
            long j11 = 64;
            if (size <= 64) {
                j11 = size;
            }
            c9681g.k(c9681g2, 0L, j11);
        } catch (EOFException unused) {
        }
        for (i11 = 0; i11 < 16; i11++) {
            if (c9681g2.m()) {
                return true;
            }
            int L11 = c9681g2.L();
            if (Character.isISOControl(L11) && !Character.isWhitespace(L11)) {
                return false;
            }
        }
        return true;
    }
}
