package nf;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes10.dex */
public final class e {
    public static final boolean a(@NotNull C9681g isProbablyUtf8) {
        C9681g c9681g;
        int i11;
        Intrinsics.checkNotNullParameter(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            c9681g = new C9681g();
            long size = isProbablyUtf8.size();
            long j11 = 64;
            if (size <= 64) {
                j11 = size;
            }
            isProbablyUtf8.k(c9681g, 0L, j11);
        } catch (EOFException unused) {
        }
        for (i11 = 0; i11 < 16; i11++) {
            if (c9681g.m()) {
                return true;
            }
            int L11 = c9681g.L();
            if (Character.isISOControl(L11) && !Character.isWhitespace(L11)) {
                return false;
            }
        }
        return true;
    }
}
