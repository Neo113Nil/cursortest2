package hh;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f10821a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Options f10822b;

    static {
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f10822b = companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe0000"), companion2.decodeHex("fffe"), companion2.decodeHex("0000feff"));
    }

    public static final void a(long j, long j6, long j10) {
        if ((j6 | j10) < 0 || j6 > j || j - j6 < j10) {
            StringBuilder p10 = k.p(j, "length=", ", offset=");
            p10.append(j6);
            p10.append(", count=");
            p10.append(j6);
            throw new ArrayIndexOutOfBoundsException(p10.toString());
        }
    }

    public static final void b(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final int c(int i5, String str, String delimiters, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i5 < i10) {
            if (StringsKt.B(delimiters, str.charAt(i5))) {
                return i5;
            }
            i5++;
        }
        return i10;
    }

    public static final int d(String str, char c2, int i5, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i5 < i10) {
            if (str.charAt(i5) == c2) {
                return i5;
            }
            i5++;
        }
        return i10;
    }

    public static final boolean e(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return i5;
            }
        }
        return -1;
    }

    public static final int g(int i5, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i5 < i10) {
            char charAt = str.charAt(i5);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i5;
            }
            i5++;
        }
        return i10;
    }

    public static final int h(int i5, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = i10 - 1;
        if (i5 <= i11) {
            while (true) {
                char charAt = str.charAt(i11);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i5) {
                    break;
                }
                i11--;
            }
        }
        return i5;
    }

    public static final String[] i(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i5]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i5++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return z.j(name, "Authorization", true) || z.j(name, "Cookie", true) || z.j(name, "Proxy-Authorization", true) || z.j(name, "Set-Cookie", true);
    }

    public static final int k(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int l(BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    public static final int m(int i5, String str) {
        if (str == null) {
            return i5;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i5;
        }
    }

    public static final String n(int i5, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int g10 = g(i5, i10, str);
        String substring = str.substring(g10, h(g10, i10, str));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
