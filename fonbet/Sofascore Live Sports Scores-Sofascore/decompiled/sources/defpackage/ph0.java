package defpackage;

import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class ph0 extends mh0 {
    public static Object A(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static IntRange B(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static int C(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int D(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static Integer E(int i, int[] iArr) {
        iArr.getClass();
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object F(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int G(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void H(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            cii.a(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static String I(byte[] bArr, String str, dt dtVar, int i) {
        String str2 = (i & 2) != 0 ? "" : U3.j.d;
        String str3 = (i & 4) == 0 ? U3.j.e : "";
        if ((i & 32) != 0) {
            dtVar = null;
        }
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (dtVar != null) {
                sb.append((CharSequence) dtVar.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String J(char[] cArr, String str, sx0 sx0Var, int i) {
        if ((i & 32) != 0) {
            sx0Var = null;
        }
        cArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (sx0Var != null) {
                sb.append((CharSequence) sx0Var.invoke(Character.valueOf(c)));
            } else {
                sb.append(c);
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String K(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        H(objArr, sb, str4, str5, str6, "...", function1);
        return sb.toString();
    }

    public static int L(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[iArr.length - 1];
        }
        ogj.m("Array is empty.");
        return 0;
    }

    public static Object M(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        ogj.m("Array is empty.");
        return null;
    }

    public static int N(Object obj, Object[] objArr) {
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static void O(Object[] objArr) {
        objArr.getClass();
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = objArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Object obj = objArr[i];
            objArr[i] = objArr[length2];
            objArr[length2] = obj;
            length2--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static char P(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            ogj.m("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        a70.p("Array has more than one element.");
        return (char) 0;
    }

    public static Object Q(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            ogj.m("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        a70.p("Array has more than one element.");
        return null;
    }

    public static List R(Comparator comparator, Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static final void S(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List T(double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return km5.a;
        }
        if (length == 1) {
            return a.c(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List U(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return km5.a;
        }
        if (length == 1) {
            return a.c(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List V(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return km5.a;
        }
        int i = 0;
        if (length == 1) {
            return a.c(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length2 = iArr.length;
        while (i < length2) {
            i = lnb.f(iArr[i], arrayList, i, 1);
        }
        return arrayList;
    }

    public static List W(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return km5.a;
        }
        if (length == 1) {
            return a.c(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List X(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return km5.a;
        }
        if (length == 1) {
            return a.c(objArr[0]);
        }
        List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static List Y(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return km5.a;
        }
        if (length == 1) {
            return a.c(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList Z(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new qg0(objArr, false));
    }

    public static Set a0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return rm5.a;
        }
        if (length == 1) {
            return w9h.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(sub.c(objArr.length));
        S(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList b0(Object[] objArr, Iterable iterable) {
        objArr.getClass();
        iterable.getClass();
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(k13.r(iterable, 10), length));
        int i = 0;
        for (Object obj : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new Pair(objArr[i], obj));
            i++;
        }
        return arrayList;
    }

    public static ArrayList c0(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static Sequence r(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? qm5.a : new oh0(objArr, 0);
    }

    public static boolean s(int i, int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean t(byte[] bArr, byte b) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (b == bArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static boolean u(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static boolean v(Object[] objArr, Object obj) {
        objArr.getClass();
        return G(obj, objArr) >= 0;
    }

    public static List w(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0) {
            ogj.h(lnb.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            ogj.h(lnb.k(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return km5.a;
        }
        int length2 = objArr.length;
        return length >= length2 ? X(objArr) : length == 1 ? a.c(objArr[length2 - 1]) : mh0.c(mh0.l(length2 - length, length2, objArr));
    }

    public static List x(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int y(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        ogj.m("Array is empty.");
        return 0;
    }

    public static Object z(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        ogj.m("Array is empty.");
        return null;
    }
}
