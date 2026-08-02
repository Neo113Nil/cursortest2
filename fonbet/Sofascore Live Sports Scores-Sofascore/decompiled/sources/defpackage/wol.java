package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class wol {
    public static final byte[] a = new byte[0];
    public static final wvd b;

    static {
        int i = wvd.c;
        gc2 gc2Var = gc2.d;
        b = wca.D(q1f.m("efbbbf"), q1f.m("feff"), q1f.m("fffe0000"), q1f.m("fffe"), q1f.m("0000feff"));
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder o = ljg.o("length=", j, ", offset=");
            o.append(j2);
            hc5.h(x5n.m(j2, ", count=", o));
        }
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void c(s18 s18Var, uae uaeVar) {
        s18Var.getClass();
        try {
            IOException iOException = null;
            for (uae uaeVar2 : s18Var.m(uaeVar)) {
                try {
                    if (s18Var.n(uaeVar2).c) {
                        c(s18Var, uaeVar2);
                    }
                    s18Var.i(uaeVar2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(h45 h45Var, uae uaeVar) {
        h45Var.getClass();
        uaeVar.getClass();
        try {
            h45Var.i(uaeVar);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        str.getClass();
        while (i < i2) {
            if (StringsKt.K(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, char c) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean g(Comparator comparator, String[] strArr, String[] strArr2) {
        strArr.getClass();
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

    public static final int h(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.d(charAt, 31) <= 0 || Intrinsics.d(charAt, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int i(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int j(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] k(Comparator comparator, String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean l(String str) {
        str.getClass();
        return c.o(str, "Authorization", true) || c.o(str, "Cookie", true) || c.o(str, "Proxy-Authorization", true) || c.o(str, "Set-Cookie", true);
    }

    public static final int m(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int n(lof lofVar) {
        return (lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static final int o(int i, String str) {
        if (str == null) {
            return i;
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
            return i;
        }
    }

    public static final String p(int i, int i2, String str) {
        str.getClass();
        int i3 = i(i, i2, str);
        return str.substring(i3, j(i3, i2, str));
    }
}
