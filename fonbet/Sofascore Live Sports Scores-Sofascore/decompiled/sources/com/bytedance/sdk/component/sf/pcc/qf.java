package com.bytedance.sdk.component.sf.pcc;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.a70;
import defpackage.is8;
import defpackage.mz1;
import defpackage.wt3;
import defpackage.yhk;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qf {
    private static final char[] oo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final int gm;
    private final List<String> kj;
    private final String ork;
    final String pcc;
    private final List<String> qf;
    final String sf;
    private final String vj;
    private final String vy;
    private final String wh;

    public qf(pcc pccVar) {
        this.pcc = pccVar.pcc;
        this.vj = pcc(pccVar.sf, false);
        this.wh = pcc(pccVar.gm, false);
        this.sf = pccVar.oo;
        this.gm = pccVar.pcc();
        this.qf = pcc(pccVar.wh, false);
        List<String> list = pccVar.qf;
        this.kj = list != null ? pcc(list, true) : null;
        String str = pccVar.kj;
        this.vy = str != null ? pcc(str, false) : null;
        this.ork = pccVar.toString();
    }

    public static void pcc(com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    pccVar.pcc(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !pcc(str, i, i2)))))) {
                    if (pccVar2 == null) {
                        pccVar2 = new com.bytedance.sdk.component.sf.pcc.sf.pcc();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.sf.pcc.sf.vy.pcc)) {
                        pccVar2.pcc(codePointAt);
                    } else {
                        pccVar2.pcc(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!pccVar2.pcc()) {
                        byte sf = pccVar2.sf();
                        int i3 = sf & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        pccVar.sf(37);
                        char[] cArr = oo;
                        pccVar.sf((int) cArr[(i3 >> 4) & 15]);
                        pccVar.sf((int) cArr[sf & 15]);
                    }
                } else {
                    pccVar.pcc(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static List<String> sf(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof qf) && ((qf) obj).ork.equals(this.ork);
    }

    public String gm() {
        if (this.wh.isEmpty()) {
            return "";
        }
        return this.ork.substring(this.ork.indexOf(58, this.pcc.length() + 3) + 1, this.ork.indexOf(64));
    }

    public int hashCode() {
        return this.ork.hashCode();
    }

    public List<String> oo() {
        int indexOf = this.ork.indexOf(47, this.pcc.length() + 3);
        String str = this.ork;
        int pcc2 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < pcc2) {
            int i = indexOf + 1;
            int pcc3 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(this.ork, i, pcc2, '/');
            arrayList.add(this.ork.substring(i, pcc3));
            indexOf = pcc3;
        }
        return arrayList;
    }

    public String toString() {
        return this.ork;
    }

    public String vj() {
        if (this.kj == null) {
            return null;
        }
        int indexOf = this.ork.indexOf(63) + 1;
        String str = this.ork;
        return this.ork.substring(indexOf, com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, indexOf, str.length(), '#'));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        String kj;
        String oo;
        String pcc;
        List<String> qf;
        final List<String> wh;
        String sf = "";
        String gm = "";
        int vj = -1;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.bytedance.sdk.component.sf.pcc.qf$pcc$pcc, reason: collision with other inner class name */
        public enum EnumC0052pcc {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public pcc() {
            ArrayList arrayList = new ArrayList();
            this.wh = arrayList;
            arrayList.add("");
        }

        private void gm() {
            if (!this.wh.remove(r0.size() - 1).isEmpty() || this.wh.isEmpty()) {
                this.wh.add("");
            } else {
                this.wh.set(r2.size() - 1, "");
            }
        }

        private static int oo(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static int sf(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private boolean vj(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean wh(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public EnumC0052pcc pcc(qf qfVar, String str) {
            int pcc;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int pcc2 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str4, 0, str4.length());
            int sf = com.bytedance.sdk.component.sf.pcc.sf.vy.sf(str4, pcc2, str4.length());
            if (sf(str4, pcc2, sf) != -1) {
                if (str4.regionMatches(true, pcc2, "https:", 0, 6)) {
                    this.pcc = HttpRequest.DEFAULT_SCHEME;
                    pcc2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, pcc2, "http:", 0, 5)) {
                        return EnumC0052pcc.UNSUPPORTED_SCHEME;
                    }
                    this.pcc = "http";
                    pcc2 += 5;
                }
            } else {
                if (qfVar == null) {
                    return EnumC0052pcc.MISSING_SCHEME;
                }
                this.pcc = qfVar.pcc;
            }
            int gm = gm(str4, pcc2, sf);
            char c = '#';
            if (gm >= 2 || qfVar == null || !qfVar.pcc.equals(this.pcc)) {
                int i2 = pcc2 + gm;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    pcc = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str4, i2, sf, "@/\\?#");
                    char charAt = pcc != sf ? str4.charAt(pcc) : (char) 65535;
                    if (charAt == 65535 || charAt == c || charAt == '/' || charAt == '\\' || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z) {
                            i = pcc;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.gm);
                            sb.append("%40");
                            str3 = str;
                            sb.append(qf.pcc(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.gm = sb.toString();
                        } else {
                            int pcc3 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str4, i2, pcc, ':');
                            String pcc4 = qf.pcc(str, i2, pcc3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                pcc4 = wt3.m(this.sf, "%40", new StringBuilder(), pcc4);
                            }
                            this.sf = pcc4;
                            if (pcc3 != pcc) {
                                i = pcc;
                                this.gm = qf.pcc(str, pcc3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = pcc;
                            }
                            str3 = str;
                            z2 = true;
                        }
                        i2 = i + 1;
                        str4 = str3;
                        c = '#';
                    }
                }
                str2 = str4;
                int i3 = i2;
                int oo = oo(str2, i3, pcc);
                int i4 = oo + 1;
                if (i4 < pcc) {
                    this.oo = vj(str2, i3, oo);
                    int wh = wh(str2, i4, pcc);
                    this.vj = wh;
                    if (wh == -1) {
                        return EnumC0052pcc.INVALID_PORT;
                    }
                } else {
                    this.oo = vj(str2, i3, oo);
                    this.vj = qf.pcc(this.pcc);
                }
                if (this.oo == null) {
                    return EnumC0052pcc.INVALID_HOST;
                }
                pcc2 = pcc;
            } else {
                this.sf = qfVar.sf();
                this.gm = qfVar.gm();
                this.oo = qfVar.sf;
                this.vj = qfVar.gm;
                this.wh.clear();
                this.wh.addAll(qfVar.oo());
                if (pcc2 == sf || str4.charAt(pcc2) == '#') {
                    oo(qfVar.vj());
                }
                str2 = str4;
            }
            int pcc5 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str2, pcc2, sf, "?#");
            pcc(str2, pcc2, pcc5);
            if (pcc5 < sf && str2.charAt(pcc5) == '?') {
                int pcc6 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str2, pcc5, sf, '#');
                this.qf = qf.sf(qf.pcc(str2, pcc5 + 1, pcc6, " \"'<>#", true, false, true, true, null));
                pcc5 = pcc6;
            }
            if (pcc5 < sf && str2.charAt(pcc5) == '#') {
                this.kj = qf.pcc(str2, pcc5 + 1, sf, "", true, false, false, false, null);
            }
            return EnumC0052pcc.SUCCESS;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.pcc);
            sb.append("://");
            if (!this.sf.isEmpty() || !this.gm.isEmpty()) {
                sb.append(this.sf);
                if (!this.gm.isEmpty()) {
                    sb.append(':');
                    sb.append(this.gm);
                }
                sb.append('@');
            }
            if (this.oo.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.oo);
                sb.append(']');
            } else {
                sb.append(this.oo);
            }
            int pcc = pcc();
            if (pcc != qf.pcc(this.pcc)) {
                sb.append(':');
                sb.append(pcc);
            }
            qf.pcc(sb, this.wh);
            if (this.qf != null) {
                sb.append('?');
                qf.sf(sb, this.qf);
            }
            if (this.kj != null) {
                sb.append('#');
                sb.append(this.kj);
            }
            return sb.toString();
        }

        private static String vj(String str, int i, int i2) {
            return com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(qf.pcc(str, i, i2, false));
        }

        public pcc oo(String str) {
            this.qf = str != null ? qf.sf(qf.pcc(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        private static int wh(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(qf.pcc(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        public pcc gm(String str) {
            if (str != null) {
                return pcc(str, true);
            }
            yhk.s("encodedPathSegments == null");
            return null;
        }

        private static int gm(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public qf sf() {
            if (this.pcc != null) {
                if (this.oo != null) {
                    return new qf(this);
                }
                a70.r("host == null");
                return null;
            }
            a70.r("scheme == null");
            return null;
        }

        public pcc sf(String str) {
            if (str != null) {
                String vj = vj(str, 0, str.length());
                if (vj != null) {
                    this.oo = vj;
                    return this;
                }
                a70.p("unexpected host: ".concat(str));
                return null;
            }
            yhk.s("host == null");
            return null;
        }

        public int pcc() {
            int i = this.vj;
            return i != -1 ? i : qf.pcc(this.pcc);
        }

        private pcc pcc(String str, boolean z) {
            boolean z2;
            pcc pccVar;
            String str2;
            boolean z3;
            int i = 0;
            while (true) {
                int pcc = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, i, str.length(), "/\\");
                if (pcc < str.length()) {
                    z2 = true;
                    str2 = str;
                    z3 = z;
                    pccVar = this;
                } else {
                    z2 = false;
                    pccVar = this;
                    str2 = str;
                    z3 = z;
                }
                pccVar.pcc(str2, i, pcc, z2, z3);
                i = pcc + 1;
                if (i > str2.length()) {
                    return pccVar;
                }
                this = pccVar;
                str = str2;
                z = z3;
            }
        }

        public pcc pcc(String str, String str2) {
            if (str != null) {
                List list = this.qf;
                if (list == null) {
                    list = new ArrayList();
                    this.qf = list;
                }
                list.add(qf.pcc(str, " \"'<>#&=", true, false, true, true));
                this.qf.add(str2 != null ? qf.pcc(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            yhk.s("encodedName == null");
            return null;
        }

        public pcc pcc(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.pcc = "http";
                    return this;
                }
                if (str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                    this.pcc = HttpRequest.DEFAULT_SCHEME;
                    return this;
                }
                a70.p("unexpected scheme: ".concat(str));
                return null;
            }
            yhk.s("scheme == null");
            return null;
        }

        private void pcc(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.wh;
                list.set(list.size() - 1, "");
            } else {
                this.wh.clear();
                this.wh.add("");
                i++;
            }
            int i3 = i;
            while (i3 < i2) {
                int pcc = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, i3, i2, "/\\");
                boolean z = pcc < i2;
                pcc pccVar = this;
                String str2 = str;
                pccVar.pcc(str2, i3, pcc, z, true);
                if (z) {
                    pcc++;
                }
                i3 = pcc;
                this = pccVar;
                str = str2;
            }
        }

        private void pcc(String str, int i, int i2, boolean z, boolean z2) {
            String pcc = qf.pcc(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (vj(pcc)) {
                return;
            }
            if (wh(pcc)) {
                gm();
                return;
            }
            boolean isEmpty = ((String) mz1.g(1, this.wh)).isEmpty();
            List<String> list = this.wh;
            if (isEmpty) {
                list.set(list.size() - 1, pcc);
            } else {
                list.add(pcc);
            }
            if (z) {
                this.wh.add("");
            }
        }
    }

    public static qf gm(String str) {
        pcc pccVar = new pcc();
        if (pccVar.pcc((qf) null, str) == pcc.EnumC0052pcc.SUCCESS) {
            return pccVar.sf();
        }
        return null;
    }

    public static void sf(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(C4427z5.U);
                sb.append(str2);
            }
        }
    }

    public String sf() {
        if (this.vj.isEmpty()) {
            return "";
        }
        int length = this.pcc.length() + 3;
        String str = this.ork;
        return this.ork.substring(length, com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, length, str.length(), ":@"));
    }

    public static int pcc(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static void pcc(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public static String pcc(String str, boolean z) {
        return pcc(str, 0, str.length(), z);
    }

    private List<String> pcc(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? pcc(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String pcc(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar = new com.bytedance.sdk.component.sf.pcc.sf.pcc();
                pccVar.pcc(str, i, i3);
                pcc(pccVar, str, i3, i2, z);
                return pccVar.gm();
            }
        }
        return str.substring(i, i2);
    }

    public static void pcc(com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int pcc2 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str.charAt(i + 1));
                int pcc3 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str.charAt(i3));
                if (pcc2 != -1 && pcc3 != -1) {
                    pccVar.sf((pcc2 << 4) + pcc3);
                    i = i3;
                }
                pccVar.pcc(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    pccVar.sf(32);
                }
                pccVar.pcc(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static boolean pcc(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str.charAt(i3)) != -1;
    }

    public static String pcc(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || pcc(str, i3, i2)))) && (codePointAt != 43 || !z3)))) {
                i3 += Character.charCount(codePointAt);
            } else {
                com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar = new com.bytedance.sdk.component.sf.pcc.sf.pcc();
                pccVar.pcc(str, i, i3);
                pcc(pccVar, str, i3, i2, str2, z, z2, z3, z4, charset);
                return pccVar.gm();
            }
        }
        return str.substring(i, i2);
    }

    public URL pcc() {
        try {
            return new URL(this.ork);
        } catch (MalformedURLException e) {
            is8.h(e);
            return null;
        }
    }

    public static String pcc(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return pcc(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
