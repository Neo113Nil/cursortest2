package k7;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.y4;
import io.appmetrica.analytics.impl.C0122e9;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile b6.o f18843b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f18842a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f18844c = new z0("id");

    /* renamed from: d, reason: collision with root package name */
    public static final z0 f18845d = new z0("type");

    public static int a(int i5, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i5 / i10;
        int i12 = i5 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i5 ^ i10) >> 31) | 1;
        switch (m0.f18896a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i12);
                int abs2 = abs - (Math.abs(i10) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (abs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static int b(o oVar) {
        Iterator it = oVar.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5 += next != null ? next.hashCode() : 0;
        }
        return i5;
    }

    public static androidx.appcompat.app.v0 c(AbstractSafeParcelable abstractSafeParcelable) {
        return new androidx.appcompat.app.v0(abstractSafeParcelable.getClass().getSimpleName(), 27);
    }

    public static String d(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e7) {
                    String m6 = r4.k.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m6), (Throwable) e7);
                    str2 = "<" + m6 + " threw " + e7.getClass().getName() + ">";
                }
            }
            objArr[i10] = str2;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i5 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i5]);
            i5++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i5 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i5]);
            for (int i12 = i5 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String e(r0 r0Var) {
        StringBuilder sb2 = new StringBuilder(r0Var.d());
        for (int i5 = 0; i5 < r0Var.d(); i5++) {
            byte a7 = r0Var.a(i5);
            if (a7 == 34) {
                sb2.append("\\\"");
            } else if (a7 == 39) {
                sb2.append("\\'");
            } else if (a7 != 92) {
                switch (a7) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (a7 < 32 || a7 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a7 >>> 6) & 3) + 48));
                            sb2.append((char) (((a7 >>> 3) & 7) + 48));
                            sb2.append((char) ((a7 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a7);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void f(int i5, int i10) {
        String d10;
        if (i5 < 0 || i5 >= i10) {
            if (i5 < 0) {
                d10 = d("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i10, "negative size: "));
                }
                d10 = d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(d10);
        }
    }

    public static void g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(androidx.appcompat.widget.c1.n("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void h(StringBuilder sb2, Iterator it, m3.f fVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(m3.f.v(entry.getKey()));
            sb2.append(" : ");
            sb2.append(m3.f.v(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(m3.f.v(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(m3.f.v(entry2.getValue()));
            }
        }
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean j(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = u.f18923b;
            }
        } else {
            if (!(collection instanceof b0)) {
                return false;
            }
            obj = ((s) ((b0) collection)).f18916d;
        }
        return comparator.equals(obj);
    }

    public static byte[] k(byte[]... bArr) {
        int i5 = 0;
        int i10 = 0;
        while (true) {
            if (i5 >= bArr.length) {
                break;
            }
            i10 += bArr[i5].length;
            i5++;
        }
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length);
            i11 += length;
        }
        return bArr2;
    }

    public static final b1 l(d1 d1Var) {
        try {
            c1 r5 = d1Var.r();
            if (r5 == null) {
                throw new w0("Parser being asked to parse an empty input stream");
            }
            try {
                try {
                    byte b10 = r5.f18848a;
                    byte b11 = r5.f18849b;
                    int i5 = 0;
                    if (b10 == Byte.MIN_VALUE) {
                        long c2 = d1Var.c();
                        if (c2 > 1000) {
                            throw new w0("Parser being asked to read a large CBOR array");
                        }
                        m(b11, c2);
                        b1[] b1VarArr = new b1[(int) c2];
                        while (i5 < c2) {
                            b1VarArr[i5] = l(d1Var);
                            i5++;
                        }
                        return new t0(m.i(b1VarArr));
                    }
                    if (b10 != -96) {
                        if (b10 == -64) {
                            throw new w0("Tags are currently unsupported");
                        }
                        if (b10 == -32) {
                            return new u0(d1Var.t());
                        }
                        if (b10 == 0 || b10 == 32) {
                            long k6 = d1Var.k();
                            m(b11, k6 > 0 ? k6 : ~k6);
                            return new x0(k6);
                        }
                        if (b10 == 64) {
                            d1Var.z((byte) 64);
                            byte[] J = d1Var.J();
                            int length = J.length;
                            m(b11, length);
                            return new v0(r0.h(length, J));
                        }
                        if (b10 == 96) {
                            d1Var.z((byte) 96);
                            String str = new String(d1Var.J(), StandardCharsets.UTF_8);
                            m(b11, str.length());
                            return new z0(str);
                        }
                        throw new w0("Unidentifiable major type: " + ((b10 >> 5) & 7));
                    }
                    long n9 = d1Var.n();
                    if (n9 > 1000) {
                        throw new w0("Parser being asked to read a large CBOR map");
                    }
                    m(b11, n9);
                    int i10 = (int) n9;
                    io.sentry.internal.debugmeta.c[] cVarArr = new io.sentry.internal.debugmeta.c[i10];
                    b1 b1Var = null;
                    int i11 = 0;
                    while (i11 < n9) {
                        b1 l6 = l(d1Var);
                        if (b1Var != null && l6.compareTo(b1Var) <= 0) {
                            throw new y4("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + b1Var.toString() + "\nCurrent key: " + l6.toString());
                        }
                        cVarArr[i11] = new io.sentry.internal.debugmeta.c(11, l6, l(d1Var));
                        i11++;
                        b1Var = l6;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i5 < i10) {
                        io.sentry.internal.debugmeta.c cVar = cVarArr[i5];
                        if (treeMap.containsKey((b1) cVar.f16517b)) {
                            throw new y4("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((b1) cVar.f16517b, (b1) cVar.f16518c);
                        i5++;
                    }
                    return new y0(r.c(treeMap));
                } catch (IOException | RuntimeException e7) {
                    e = e7;
                    throw new w0(e);
                }
            } catch (RuntimeException e9) {
                e = e9;
                throw new w0(e);
            }
        } catch (IOException e10) {
            throw new w0(e10);
        }
    }

    public static final void m(byte b10, long j) {
        switch (b10) {
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                if (j >= 24) {
                    return;
                }
                throw new y4("Integer value " + j + " after add info could have been represented in 0 additional bytes, but used 1");
            case C0122e9.F /* 25 */:
                if (j >= 256) {
                    return;
                }
                throw new y4("Integer value " + j + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case C0122e9.G /* 26 */:
                if (j >= 65536) {
                    return;
                }
                throw new y4("Integer value " + j + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case C0122e9.H /* 27 */:
                if (j >= 4294967296L) {
                    return;
                }
                throw new y4("Integer value " + j + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }

    public static void n(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? o(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? o(i10, i11, "end index") : d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static String o(int i5, int i10, String str) {
        if (i5 < 0) {
            return d("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i10, "negative size: "));
    }
}
