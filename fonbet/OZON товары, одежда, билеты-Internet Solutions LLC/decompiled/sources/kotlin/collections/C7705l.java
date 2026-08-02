package kotlin.collections;

import De.C2857A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7705l extends C7712t {
    @NotNull
    public static ArrayList B(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object C(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Float D(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static Integer E(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static Object F(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    @NotNull
    public static ArrayList G(@NotNull Object[][] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i11 = 0;
        for (Object[] objArr2 : objArr) {
            i11 += objArr2.length;
        }
        ArrayList arrayList = new ArrayList(i11);
        for (Object[] objArr3 : objArr) {
            C7714v.r(arrayList, objArr3);
        }
        return arrayList;
    }

    @NotNull
    public static IntRange H(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static int I(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Integer J(@NotNull int[] iArr, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i11 < 0 || i11 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i11]);
    }

    public static Object K(int i11, @NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i11 < 0 || i11 >= objArr.length) {
            return null;
        }
        return objArr[i11];
    }

    public static int L(@NotNull int[] iArr, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (i11 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public static int M(@NotNull Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i11 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i11 < length) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i11 < length2) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static String O(byte[] bArr, String separator, Function1 function1, int i11) {
        if ((i11 & 1) != 0) {
            separator = ", ";
        }
        String prefix = (i11 & 2) != 0 ? "" : "[";
        String postfix = (i11 & 4) == 0 ? "]" : "";
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) prefix);
        int i12 = 0;
        for (byte b11 : bArr) {
            i12++;
            if (i12 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Byte.valueOf(b11)));
            } else {
                buffer.append((CharSequence) String.valueOf((int) b11));
            }
        }
        buffer.append((CharSequence) postfix);
        String sb2 = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static String P(Object[] objArr, String str, String str2, String str3, Function1 function1, int i11) {
        if ((i11 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i11 & 2) != 0 ? "" : str2;
        String postfix = (i11 & 4) != 0 ? "" : str3;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        C7712t.b(objArr, sb2, separator, prefix, postfix, function1);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static Object Q(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr[objArr.length - 1];
    }

    public static Object R(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    @NotNull
    public static byte[] S(@NotNull byte[] bArr, @NotNull byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    @NotNull
    public static int[] T(@NotNull int[] iArr, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i11;
        return copyOf;
    }

    @NotNull
    public static Object[] U(@NotNull Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    @NotNull
    public static Object[] V(@NotNull Object[] objArr, @NotNull Object[] elements) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    @NotNull
    public static int[] W(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                iArr2[length - i11] = iArr[i11];
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return iArr2;
    }

    public static char X(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object Y(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void Z(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void a0(@NotNull Object[] objArr, @NotNull Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    @NotNull
    public static List b0(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            chArr[i11] = Character.valueOf(cArr[i11]);
        }
        Character[] chArr2 = chArr;
        Intrinsics.checkNotNullParameter(chArr2, "<this>");
        if (chArr2.length > 1) {
            Arrays.sort(chArr2);
        }
        return e(chArr);
    }

    @NotNull
    public static List c0(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return K.f71697a;
        }
        if (length == 1) {
            return C7714v.a0(Float.valueOf(fArr[0]));
        }
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f7 : fArr) {
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    @NotNull
    public static Iterable d(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length == 0 ? K.f71697a : new C7710q(objArr);
    }

    @NotNull
    public static List d0(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? h0(iArr) : C7714v.a0(Integer.valueOf(iArr[0])) : K.f71697a;
    }

    @NotNull
    public static List e(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(asList, "asList(...)");
        return asList;
    }

    @NotNull
    public static List e0(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return K.f71697a;
        }
        if (length == 1) {
            return C7714v.a0(Long.valueOf(jArr[0]));
        }
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j11 : jArr) {
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    @NotNull
    public static C7708o f(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new C7708o(iArr);
    }

    @NotNull
    public static List f0(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? i0(objArr) : C7714v.a0(objArr[0]) : K.f71697a;
    }

    @NotNull
    public static Sequence g(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length == 0 ? kotlin.sequences.l.g() : new r(objArr);
    }

    @NotNull
    public static List g0(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return K.f71697a;
        }
        if (length == 1) {
            return C7714v.a0(Boolean.valueOf(zArr[0]));
        }
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z11 : zArr) {
            arrayList.add(Boolean.valueOf(z11));
        }
        return arrayList;
    }

    public static boolean h(short s11) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        Intrinsics.checkNotNullParameter(null, "<this>");
        throw null;
    }

    @NotNull
    public static ArrayList h0(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public static boolean i(@NotNull byte[] bArr, byte b11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (b11 == bArr[i11]) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    @NotNull
    public static ArrayList i0(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(new C7703j(objArr, false));
    }

    public static boolean j(@NotNull char[] cArr, char c11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (c11 == cArr[i11]) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    @NotNull
    public static Set j0(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return M.f71699a;
        }
        if (length == 1) {
            return e0.h(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.h(objArr.length));
        C7712t.c(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean k(@NotNull int[] iArr, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return L(iArr, i11) >= 0;
    }

    @NotNull
    public static O k0(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new O(new C7711s(objArr));
    }

    public static boolean l(@NotNull long[] jArr, long j11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (j11 == jArr[i11]) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    public static boolean m(@NotNull Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return M(objArr, obj) >= 0;
    }

    public static boolean n(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = objArr[i11];
                Object obj2 = objArr2[i11];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!n((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof Sc.z) && (obj2 instanceof Sc.z)) {
                            if (!Uc.a.c(((Sc.z) obj).c(), ((Sc.z) obj2).c())) {
                            }
                        } else if ((obj instanceof Sc.G) && (obj2 instanceof Sc.G)) {
                            if (!Uc.a.a()) {
                            }
                        } else if ((obj instanceof Sc.B) && (obj2 instanceof Sc.B)) {
                            if (!Uc.a.b()) {
                            }
                        } else if ((obj instanceof Sc.D) && (obj2 instanceof Sc.D)) {
                            if (!Uc.a.d()) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static void o(int i11, int i12, int i13, @NotNull byte[] bArr, @NotNull byte[] destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i12, destination, i11, i13 - i12);
    }

    @NotNull
    public static void p(int i11, int i12, @NotNull int[] iArr, @NotNull int[] destination, int i13) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i12, destination, i11, i13 - i12);
    }

    @NotNull
    public static void q(@NotNull char[] cArr, @NotNull char[] destination, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i12, destination, i11, i13 - i12);
    }

    @NotNull
    public static void r(@NotNull Object[] objArr, int i11, @NotNull Object[] destination, int i12, int i13) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i12, destination, i11, i13 - i12);
    }

    public static /* synthetic */ void s(int i11, int i12, int i13, byte[] bArr, byte[] bArr2) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        o(0, i11, i12, bArr, bArr2);
    }

    public static /* synthetic */ void t(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        p(i11, 0, iArr, iArr2, i12);
    }

    public static /* synthetic */ void u(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        int i14 = (i13 & 2) != 0 ? 0 : 1;
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        r(objArr, i14, objArr2, i11, i12);
    }

    @NotNull
    public static byte[] v(int i11, int i12, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C7706m.a(i12, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11, i12);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @NotNull
    public static Object[] w(int i11, int i12, @NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        C7706m.a(i12, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i11, i12);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void x(@NotNull Object[] objArr, C2857A c2857a, int i11, int i12) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i11, i12, c2857a);
    }

    public static void y(int[] iArr, int i11) {
        int length = iArr.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i11);
    }

    public static void z(long[] jArr) {
        int length = jArr.length;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }
}
