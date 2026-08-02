package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xz2 {
    public static final Set a;
    public static final Set b;
    public static final ArrayList c;
    public static final ArrayList d;

    static {
        Character valueOf = Character.valueOf(C4427z5.U);
        ArrayList w0 = CollectionsKt.w0(new np2('0', '9'), CollectionsKt.u0(new np2('a', 'z'), new np2('A', 'Z')));
        ArrayList arrayList = new ArrayList(k13.r(w0, 10));
        Iterator it = w0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        a = CollectionsKt.W0(arrayList);
        b = CollectionsKt.W0(CollectionsKt.w0(new np2('0', '9'), CollectionsKt.u0(new np2('a', 'z'), new np2('A', 'Z'))));
        CollectionsKt.W0(CollectionsKt.w0(new np2('0', '9'), CollectionsKt.u0(new np2('a', 'f'), new np2('A', 'F'))));
        Set a0 = ph0.a0(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', valueOf, '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(k13.r(a0, 10));
        Iterator it2 = a0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        c = arrayList2;
        ph0.a0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', valueOf, '-', '.', '_', '~'});
        y9h.f(b, ph0.a0(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List j = b.j('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(k13.r(j, 10));
        Iterator it3 = j.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        d = arrayList3;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' > c2 || c2 >= 'g') {
            return -1;
        }
        return c2 - 'W';
    }

    public static final String b(int i, int i2, String str, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (z && charAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char charAt2 = str.charAt(i3);
                    if (z && charAt2 == '+') {
                        sb.append(' ');
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str.subSequence(i3, str.length()).toString());
                                sb2.append(", in ");
                                sb2.append((Object) str);
                                throw new wo0(me4.g(i3, " at ", sb2));
                            }
                            int i7 = i3 + 1;
                            int a2 = a(str.charAt(i7));
                            int a3 = a(str.charAt(i6));
                            if (a2 == -1 || a3 == -1) {
                                throw new wo0("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((a2 * 16) + a3);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(c.l(0, i5, 4, bArr));
                    } else {
                        sb.append(charAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            i3++;
        }
        return (i == 0 && i2 == str.length()) ? str.toString() : str.substring(i, i2);
    }

    public static String c(String str) {
        int length = str.length();
        Charset charset = Charsets.UTF_8;
        str.getClass();
        charset.getClass();
        return b(0, length, str, false);
    }

    public static String d(int i, int i2, int i3, String str) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = Charsets.UTF_8;
        str.getClass();
        charset.getClass();
        return b(i, i2, str, z);
    }

    public static final String e(String str, boolean z) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = Charsets.UTF_8.newEncoder();
        newEncoder.getClass();
        f(ao2.x(newEncoder, str, 0, str.length()), new sx0(sb, z, 1));
        return sb.toString();
    }

    public static final void f(w52 w52Var, Function1 function1) {
        while (!w52Var.w()) {
            while (!w52Var.w()) {
                function1.invoke(Byte.valueOf(w52Var.readByte()));
            }
        }
    }

    public static final String g(byte b2) {
        int i = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        int i2 = b2 & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }
}
