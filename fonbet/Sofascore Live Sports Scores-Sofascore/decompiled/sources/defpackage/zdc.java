package defpackage;

import com.ironsource.C4427z5;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zdc {
    public static final Regex e = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Regex f = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public zdc(String str, String str2, String[] strArr, String str3) {
        me4.p(str, str2, str3);
        strArr.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Charset a(zdc zdcVar) {
        String str;
        String[] strArr = zdcVar.d;
        int i = 0;
        int v = vha.v(0, strArr.length - 1, 2);
        if (v >= 0) {
            while (!c.o(strArr[i], C4427z5.N, true)) {
                if (i != v) {
                    i += 2;
                }
            }
            str = strArr[i + 1];
            if (str != null) {
                return null;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zdc) && Intrinsics.c(((zdc) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
