package kotlin.collections;

import androidx.appcompat.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {
    public c(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i5, int i10, int i11) {
        if (i5 >= 0 && i10 <= i11) {
            if (i5 > i10) {
                throw new IllegalArgumentException(c1.j(i5, "startIndex: ", " > endIndex: ", i10));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i5 + ", endIndex: " + i10 + ", size: " + i11);
    }

    public static void b(int i5, int i10) {
        if (i5 < 0 || i5 >= i10) {
            throw new IndexOutOfBoundsException(c1.j(i5, "index: ", ", size: ", i10));
        }
    }

    public static void c(int i5, int i10) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(c1.j(i5, "index: ", ", size: ", i10));
        }
    }

    public static void d(int i5, int i10, int i11) {
        if (i5 >= 0 && i10 <= i11) {
            if (i5 > i10) {
                throw new IllegalArgumentException(c1.j(i5, "fromIndex: ", " > toIndex: ", i10));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i5 + ", toIndex: " + i10 + ", size: " + i11);
    }

    public static int e(int i5, int i10) {
        int i11 = i5 + (i5 >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        return i11 - 2147483639 > 0 ? i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i11;
    }
}
