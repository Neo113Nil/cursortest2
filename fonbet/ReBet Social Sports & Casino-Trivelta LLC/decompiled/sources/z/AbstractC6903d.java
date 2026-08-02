package z;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6903d {
    public static final void a(C6901b c6901b, int i10) {
        Intrinsics.checkNotNullParameter(c6901b, "<this>");
        c6901b.i(new int[i10]);
        c6901b.h(new Object[i10]);
    }

    public static final int b(C6901b c6901b, int i10) {
        Intrinsics.checkNotNullParameter(c6901b, "<this>");
        try {
            return A.a.a(c6901b.c(), c6901b.f(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C6901b c6901b, Object obj, int i10) {
        Intrinsics.checkNotNullParameter(c6901b, "<this>");
        int f10 = c6901b.f();
        if (f10 == 0) {
            return -1;
        }
        int b10 = b(c6901b, i10);
        if (b10 < 0 || Intrinsics.areEqual(obj, c6901b.b()[b10])) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < f10 && c6901b.c()[i11] == i10) {
            if (Intrinsics.areEqual(obj, c6901b.b()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = b10 - 1; i12 >= 0 && c6901b.c()[i12] == i10; i12--) {
            if (Intrinsics.areEqual(obj, c6901b.b()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(C6901b c6901b) {
        Intrinsics.checkNotNullParameter(c6901b, "<this>");
        return c(c6901b, null, 0);
    }
}
