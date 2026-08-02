package r;

import android.os.Build;
import androidx.annotation.NonNull;
import r.o;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9089b {
    static int a(@NonNull o.d dVar, o.c cVar) {
        return dVar.a() != 0 ? dVar.a() : cVar != null ? 15 : 255;
    }

    static boolean b(int i11) {
        return (i11 & 32768) != 0;
    }

    static boolean c(int i11) {
        if (i11 == 15 || i11 == 255) {
            return true;
        }
        if (i11 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i11 != 32783) {
            return i11 == 33023 || i11 == 0;
        }
        int i12 = Build.VERSION.SDK_INT;
        return i12 < 28 || i12 > 29;
    }

    static boolean d(int i11) {
        return (i11 & 255) == 255;
    }
}
