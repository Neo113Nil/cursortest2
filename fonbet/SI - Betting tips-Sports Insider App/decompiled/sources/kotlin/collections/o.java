package kotlin.collections;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class o extends n {
    public static List c(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(asList, "asList(...)");
        return asList;
    }

    public static void d(int i5, int i10, int i11, Object[] objArr, Object[] destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i10, destination, i5, i11 - i10);
    }

    public static void e(int i5, int i10, int[] iArr, int[] destination, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i10, destination, i5, i11 - i10);
    }

    public static void f(byte[] bArr, int i5, byte[] destination, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i10, destination, i5, i11 - i10);
    }

    public static /* synthetic */ void g(int i5, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i5 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        d(0, i5, i10, objArr, objArr2);
    }

    public static /* synthetic */ void h(int i5, int i10, int[] iArr, int[] iArr2) {
        if ((i10 & 8) != 0) {
            i5 = iArr.length;
        }
        e(0, 0, iArr, iArr2, i5);
    }

    public static byte[] i(byte[] bArr, int i5, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        m.a(i10, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5, i10);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] j(int i5, int i10, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        m.a(i10, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i5, i10);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void k(Object[] objArr, Object obj, int i5, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i5, i10, obj);
    }

    public static Object[] m(Object[] objArr, Object[] elements) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.checkNotNull(copyOf);
        return copyOf;
    }
}
