package com.mbridge.msdk.thrid.okhttp;

import defpackage.a70;
import defpackage.lnb;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r {
    private final String[] a;

    public r(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    public static void a(String str) {
        if (str == null) {
            yhk.s("name == null");
            return;
        }
        if (str.isEmpty()) {
            a70.p("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                a70.p(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    public String b(int i) {
        return this.a[(i * 2) + 1];
    }

    public List<String> c(String str) {
        int b = b();
        ArrayList arrayList = null;
        for (int i = 0; i < b; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).a, this.a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public int b() {
        return this.a.length / 2;
    }

    public String b(String str) {
        return a(this.a, str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        final List<String> a = new ArrayList(20);

        public a a(String str) {
            int indexOf = str.indexOf(":", 1);
            return indexOf != -1 ? b(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(":") ? b("", str.substring(1)) : b("", str);
        }

        public a b(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a c(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            b(str);
            b(str, str2);
            return this;
        }

        public a b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public a a(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            return b(str, str2);
        }

        public r a() {
            return new r(this);
        }
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String a(int i) {
        return this.a[i * 2];
    }

    public static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    a70.p(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                    return;
                }
            }
            return;
        }
        yhk.s(lnb.o("value for name ", str2, " == null"));
    }
}
