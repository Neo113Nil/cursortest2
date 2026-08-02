package kotlin.collections;

import io.appmetrica.analytics.impl.C0118e5;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class p extends o {
    public static ArrayList A(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i5 : iArr) {
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList;
    }

    public static Set B(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return g0.f19206a;
        }
        if (length == 1) {
            return u0.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.a(objArr.length));
        x(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean n(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (i5 == iArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    public static boolean o(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (j == jArr[i5]) {
                break;
            }
            i5++;
        }
        return i5 >= 0;
    }

    public static boolean p(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return s(objArr, obj) >= 0;
    }

    public static ArrayList q(Object[] objArr) {
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

    public static Object r(int i5, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i5 < 0 || i5 >= objArr.length) {
            return null;
        }
        return objArr[i5];
    }

    public static int s(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i5 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i5 < length) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i5 < length2) {
            if (Intrinsics.areEqual(obj, objArr[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static String t(Object[] objArr, String separator, Function1 function1) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i5 = 0;
        for (Object obj : objArr) {
            i5++;
            if (i5 > 1) {
                buffer.append((CharSequence) separator);
            }
            kotlin.text.s.a(buffer, obj, function1);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public static String u(byte[] bArr, String separator, f1.a aVar, int i5) {
        if ((i5 & 1) != 0) {
            separator = ", ";
        }
        String prefix = (i5 & 2) != 0 ? "" : "[";
        String postfix = (i5 & 4) == 0 ? "]" : "";
        int i10 = (i5 & 8) != 0 ? -1 : 32;
        if ((i5 & 32) != 0) {
            aVar = null;
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
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (aVar != null) {
                buffer.append((CharSequence) aVar.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append((CharSequence) String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append((CharSequence) "...");
        }
        buffer.append((CharSequence) postfix);
        return buffer.toString();
    }

    public static /* synthetic */ String v(Object[] objArr, C0118e5 c0118e5, int i5) {
        if ((i5 & 32) != 0) {
            c0118e5 = null;
        }
        return t(objArr, ", ", c0118e5);
    }

    public static char w(char[] cArr) {
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

    public static final void x(Object[] objArr, AbstractSet destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
    }

    public static List y(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? A(iArr) : t.c(Integer.valueOf(iArr[0])) : e0.f19204a;
    }

    public static List z(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return e0.f19204a;
        }
        if (length == 1) {
            return t.c(objArr[0]);
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(new j(objArr, false));
    }
}
