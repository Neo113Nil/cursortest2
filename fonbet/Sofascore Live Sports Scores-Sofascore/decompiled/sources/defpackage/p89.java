package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p89 {
    public static final int f;
    public static final int g;
    public final Map a;
    public final Map b;
    public final boolean c;
    public byte[] d;
    public int e;

    static {
        int length = t4d.f.length;
        f = length;
        g = length + 2;
    }

    public p89(p89 p89Var, boolean z) {
        this.c = z;
        if (p89Var == null) {
            this.a = z ? Collections.EMPTY_MAP : new HashMap();
            this.b = z ? Collections.EMPTY_MAP : new HashMap();
        } else {
            this.a = new HashMap(p89Var.a);
            this.b = new HashMap(p89Var.b);
            this.e = p89Var.e;
        }
    }

    public final void a(String str, String... strArr) {
        l89 l89Var;
        char charAt;
        if (this.c) {
            a70.i();
            return;
        }
        if (strArr.length == 0) {
            return;
        }
        List asList = Arrays.asList(strArr);
        if (str == null || str.isEmpty()) {
            a70.p("Header key cannot be null or empty.");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 < '!' || charAt2 > '~' || charAt2 == ':') {
                a70.p(bf3.i(charAt2, new StringBuilder("Header key has invalid character: 0x")));
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = asList.iterator();
        int i2 = 0;
        loop1: while (true) {
            int i3 = 3;
            if (!it.hasNext()) {
                if (i2 == 0) {
                    l89Var = null;
                } else {
                    l89Var = new l89();
                    l89Var.a = arrayList;
                    l89Var.b = i2;
                }
                if (l89Var != null) {
                    int i4 = l89Var.b;
                    ((List) this.a.computeIfAbsent(str, new mn0(i3))).addAll(l89Var.a);
                    this.e += i4;
                    Map map = this.b;
                    map.put(str, Integer.valueOf(((Integer) map.getOrDefault(str, 0)).intValue() + i4));
                    this.d = null;
                    return;
                }
                return;
            }
            String str2 = (String) it.next();
            if (str2 != null) {
                int length2 = str2.length();
                if (length2 > 0) {
                    for (int i5 = 0; i5 < length2; i5++) {
                        charAt = str2.charAt(i5);
                        if (charAt > 127 || charAt == '\n' || charAt == '\r') {
                            break loop1;
                        }
                    }
                }
                arrayList.add(str2);
                i2 += length2 + length + 3;
            }
        }
        a70.p(bf3.i(charAt, new StringBuilder("Header value has invalid character: 0x")));
    }

    public final int b(int i, byte[] bArr) {
        byte[] bArr2 = t4d.f;
        int i2 = f;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        int i3 = i + i2;
        for (Map.Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            for (String str2 : (List) entry.getValue()) {
                str.getBytes(0, str.length(), bArr, i3);
                int length = str.length() + i3;
                int i4 = length + 1;
                bArr[length] = 58;
                str2.getBytes(0, str2.length(), bArr, i4);
                int length2 = str2.length() + i4;
                bArr[length2] = 13;
                bArr[length2 + 1] = 10;
                i3 = length2 + 2;
            }
        }
        bArr[i3] = 13;
        bArr[i3 + 1] = 10;
        return this.e + g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p89) {
            return Objects.equals(this.a, ((p89) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        if (this.d == null) {
            byte[] bArr = new byte[this.e + g];
            this.d = bArr;
            b(0, bArr);
        }
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i = f;
        if (length <= i + 2) {
            return "";
        }
        StringBuilder sb = new StringBuilder((length - i) - 3);
        while (i < length - 3) {
            byte b = bArr2[i];
            if (b == 10) {
                sb.append(' ');
            } else if (b != 13) {
                sb.append((char) b);
            } else {
                sb.append(';');
            }
            i++;
        }
        return sb.toString();
    }

    public p89() {
        this(null, false);
    }
}
