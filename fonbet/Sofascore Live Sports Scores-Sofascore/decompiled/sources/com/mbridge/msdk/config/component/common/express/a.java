package com.mbridge.msdk.config.component.common.express;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.mbridge.msdk.config.component.common.express.node.f;
import com.mbridge.msdk.config.component.common.express.node.g;
import com.mbridge.msdk.config.component.common.express.node.h;
import com.mbridge.msdk.config.component.common.express.node.i;
import com.mbridge.msdk.config.component.common.express.node.j;
import defpackage.a70;
import defpackage.dmi;
import defpackage.mz1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class a {
    private Map<String, Integer> a;
    private List<String> b;
    private int c;

    public a() {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(U3.j.b, 0);
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry("+=", 0);
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry("-=", 0);
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry("*=", 0);
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry5 = new AbstractMap.SimpleImmutableEntry("/=", 0);
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry6 = new AbstractMap.SimpleImmutableEntry("%=", 0);
        String c = com.mbridge.msdk.config.component.common.util.c.c("883");
        Objects.requireNonNull(c);
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry7 = new AbstractMap.SimpleImmutableEntry(c, 1);
        String c2 = com.mbridge.msdk.config.component.common.util.c.c("882");
        Objects.requireNonNull(c2);
        Map.Entry[] entryArr = {simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, simpleImmutableEntry5, simpleImmutableEntry6, simpleImmutableEntry7, new AbstractMap.SimpleImmutableEntry(c2, 2), new AbstractMap.SimpleImmutableEntry("==", 3), new AbstractMap.SimpleImmutableEntry("!=", 3), new AbstractMap.SimpleImmutableEntry(">", 4), new AbstractMap.SimpleImmutableEntry("<", 4), new AbstractMap.SimpleImmutableEntry(">=", 4), new AbstractMap.SimpleImmutableEntry("<=", 4), new AbstractMap.SimpleImmutableEntry("in", 4), new AbstractMap.SimpleImmutableEntry("IN", 4), new AbstractMap.SimpleImmutableEntry("+", 5), new AbstractMap.SimpleImmutableEntry("-", 5), new AbstractMap.SimpleImmutableEntry("*", 6), new AbstractMap.SimpleImmutableEntry("/", 6), new AbstractMap.SimpleImmutableEntry("%", 6)};
        HashMap hashMap = new HashMap(21);
        for (int i = 0; i < 21; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                a70.p(mz1.m(key, "duplicate key: "));
                throw null;
            }
        }
        this.a = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x00f2, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z) {
        com.mbridge.msdk.config.component.common.express.node.d jVar;
        com.mbridge.msdk.config.component.common.express.node.e eVar;
        com.mbridge.msdk.config.component.common.express.node.d aVar;
        int i;
        if (dVar == null) {
            List<String> list = this.b;
            int i2 = this.c;
            this.c = i2 + 1;
            dVar = new i(list.get(i2));
        }
        int i3 = this.c;
        while (this.c < this.b.size()) {
            boolean z2 = true;
            String str = "";
            if (this.b.get(this.c - 1).startsWith("$") && this.c >= i3) {
                while (true) {
                    if (this.c - 1 >= this.b.size()) {
                        break;
                    }
                    String str2 = this.b.get(this.c - 1);
                    if (this.c != this.b.size() && (this.c >= this.b.size() || ("!><".indexOf(this.b.get(this.c).charAt(0)) < 0 && !this.b.get(this.c).equals(com.mbridge.msdk.config.component.common.util.c.c("883")) && !this.b.get(this.c).equals(com.mbridge.msdk.config.component.common.util.c.c("882")) && !this.b.get(this.c).equals("IN")))) {
                        String str3 = this.b.get(this.c);
                        if (this.a.containsKey(this.b.get(this.c)) || "/".indexOf(str3.charAt(0)) == 0) {
                            break;
                        }
                        if ("{[(.".indexOf(str3.charAt(0)) >= 0) {
                            this.c = i3;
                            i3++;
                            break;
                        }
                        str = dmi.q(str, str2);
                        this.c++;
                    } else {
                        break;
                    }
                }
                if (z2) {
                    this.c = i3;
                    return dVar;
                }
            } else if (this.b.get(this.c).equals(".")) {
                i3 = this.c;
                List<String> list2 = this.b;
                this.c = i3 + 2;
                String str4 = list2.get(i3 + 1);
                if (this.c >= this.b.size() || !this.b.get(this.c).equals("(")) {
                    jVar = new j(dVar, str4);
                    dVar = jVar;
                } else {
                    this.c++;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 1;
                    while (this.c < this.b.size() && i4 > 0) {
                        String str5 = this.b.get(this.c);
                        if (str5.equals("(")) {
                            i4++;
                        } else if (str5.equals(")")) {
                            i4--;
                        }
                        if (i4 > 0) {
                            if (str5.equals(BlazeDataSourcePersonalizedType.STRING_SEPARATOR) && i4 == 1) {
                                arrayList.add(new a().a(String.join(" ", arrayList2)));
                                arrayList2.clear();
                            } else {
                                arrayList2.add(str5);
                            }
                        }
                        this.c++;
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new a().a(String.join(" ", arrayList2)));
                    }
                    eVar = new com.mbridge.msdk.config.component.common.express.node.e(dVar, str4, arrayList);
                    dVar = eVar;
                }
            } else if (this.b.get(this.c - 1).equals(U3.j.d) || this.b.get(this.c).equals(U3.j.d)) {
                if (this.b.get(this.c).equals(U3.j.d)) {
                    i3 = this.c;
                    this.c = i3 + 1;
                }
                if (this.c >= this.b.size() || !this.b.get(this.c).equals("?")) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = this.c;
                    int i6 = i5 - 2;
                    if (i6 < 0 || ((i5 > 2 && this.b.get(i6).equals("(")) || ((i = this.c) > 2 && this.a.containsKey(this.b.get(i - 2))))) {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        int i7 = 1;
                        while (this.c < this.b.size() && i7 > 0) {
                            String str6 = this.b.get(this.c);
                            if (str6.equals(U3.j.d)) {
                                i7++;
                            } else if (str6.equals(U3.j.e)) {
                                i7--;
                            }
                            if (i7 > 0) {
                                if (str6.equals(BlazeDataSourcePersonalizedType.STRING_SEPARATOR) && i7 == 1) {
                                    arrayList4.add(new a().a(String.join(" ", arrayList5)));
                                    arrayList5.clear();
                                } else {
                                    arrayList5.add(str6);
                                }
                            }
                            this.c++;
                        }
                        if (!arrayList5.isEmpty()) {
                            arrayList4.add(new a().a(String.join(" ", arrayList5)));
                        }
                        aVar = new com.mbridge.msdk.config.component.common.express.node.a(arrayList4);
                    } else {
                        int i8 = 1;
                        while (this.c < this.b.size() && i8 > 0) {
                            String str7 = this.b.get(this.c);
                            if (str7.equals(U3.j.d)) {
                                i8++;
                            } else if (str7.equals(U3.j.e)) {
                                i8--;
                            }
                            if (i8 > 0) {
                                arrayList3.add(str7);
                            }
                            this.c++;
                        }
                        jVar = new f(dVar, new a().a(String.join(" ", arrayList3)));
                        dVar = jVar;
                    }
                } else {
                    this.c++;
                    ArrayList arrayList6 = new ArrayList();
                    int i9 = 1;
                    while (this.c < this.b.size() && i9 > 0) {
                        String str8 = this.b.get(this.c);
                        if (str8.equals(U3.j.d)) {
                            i9++;
                        } else if (str8.equals(U3.j.e)) {
                            i9--;
                        }
                        if (i9 > 0) {
                            arrayList6.add(str8);
                        }
                        this.c++;
                    }
                    com.mbridge.msdk.config.component.common.express.node.d a = new a().a(String.join(" ", arrayList6));
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(a);
                    aVar = new com.mbridge.msdk.config.component.common.express.node.e(dVar, com.mbridge.msdk.config.component.common.util.c.c("877"), arrayList7);
                }
                dVar = aVar;
            } else if (this.b.get(this.c - 1).equals("{") || this.b.get(this.c).equals("{")) {
                if (this.b.get(this.c).equals("{")) {
                    int i10 = this.c;
                    this.c = i10 + 1;
                    i3 = i10;
                }
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                int i11 = 1;
                while (this.c < this.b.size() && i11 > 0) {
                    String str9 = this.b.get(this.c);
                    if (str9.equals("{")) {
                        i11++;
                    } else if (str9.equals("}")) {
                        i11--;
                    }
                    if (i11 > 0) {
                        if (str9.equals(BlazeDataSourcePersonalizedType.STRING_SEPARATOR) && i11 == 1) {
                            arrayList8.add(new a().a(String.join(" ", arrayList9)));
                            arrayList9.clear();
                        } else {
                            arrayList9.add(str9);
                        }
                    }
                    this.c++;
                }
                if (!arrayList9.isEmpty()) {
                    arrayList8.add(new a().a(String.join(" ", arrayList9)));
                }
                aVar = new h(arrayList8);
                dVar = aVar;
            } else {
                boolean equals = this.b.get(this.c).equals(":");
                int i12 = this.c;
                if (equals) {
                    String str10 = this.b.get(i12 - 1);
                    int i13 = this.c;
                    List<String> list3 = this.b;
                    this.c = i13 + 2;
                    jVar = new g(new a().a(String.join(" ", str10)), new a().a(String.join(" ", list3.get(i13 + 1))));
                    i3 = i12;
                    dVar = jVar;
                } else {
                    String str11 = this.b.get(i12 - 1);
                    if (this.c < this.b.size() && this.b.get(this.c).equals("(")) {
                        i iVar = new i("");
                        this.c++;
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        int i14 = 1;
                        while (this.c < this.b.size() && i14 > 0) {
                            String str12 = this.b.get(this.c);
                            if (str12.equals("(")) {
                                i14++;
                            } else if (str12.equals(")")) {
                                i14--;
                            }
                            if (i14 > 0) {
                                if (str12.equals(BlazeDataSourcePersonalizedType.STRING_SEPARATOR) && i14 == 1) {
                                    arrayList10.add(new a().a(String.join(" ", arrayList11)));
                                    arrayList11.clear();
                                } else {
                                    arrayList11.add(str12);
                                }
                            }
                            this.c++;
                        }
                        if (!arrayList11.isEmpty()) {
                            arrayList10.add(new a().a(String.join(" ", arrayList11)));
                        }
                        eVar = new com.mbridge.msdk.config.component.common.express.node.e(iVar, str11, arrayList10);
                        i3 = i12;
                        dVar = eVar;
                    } else {
                        if (this.c >= this.b.size() || this.a.containsKey(this.b.get(this.c)) || "/".indexOf(str11.charAt(0)) == 0 || (z && ")".indexOf(this.b.get(this.c).charAt(0)) >= 0)) {
                            break;
                        }
                        this.c++;
                        i3 = i12;
                    }
                }
            }
        }
        return dVar;
    }

    private List<String> b(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '\"') {
                sb.append(charAt);
                z = !z;
            } else if (z) {
                sb.append(charAt);
            } else if (Character.isWhitespace(charAt)) {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(charAt) >= 0) {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if ((charAt == '!' || charAt == '=' || charAt == '>' || charAt == '<' || charAt == '+' || charAt == '-' || charAt == '*' || charAt == '/' || charAt == '%') && (i = i2 + 1) < length && str.charAt(i) == '=') {
                    arrayList.add(charAt + U3.j.b);
                    i2 = i;
                } else {
                    arrayList.add(String.valueOf(charAt));
                }
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.node.d c(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z) {
        if (!this.b.get(this.c).equals("(")) {
            return a(dVar, z);
        }
        this.c++;
        com.mbridge.msdk.config.component.common.express.node.d b = b(dVar, true);
        int i = this.c + 1;
        this.c = i;
        return i > this.b.size() - 1 ? b : b(b, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, int i, boolean z) {
        String str;
        Integer num;
        com.mbridge.msdk.config.component.common.express.node.d cVar;
        com.mbridge.msdk.config.component.common.express.node.d c = c(dVar, z);
        while (this.c < this.b.size() && (num = this.a.get((str = this.b.get(this.c)))) != null && num.intValue() >= i) {
            int i2 = this.c + 1;
            this.c = i2;
            if (i2 > this.b.size() - 1) {
                break;
            }
            com.mbridge.msdk.config.component.common.express.node.d a = a(dVar, num.intValue() + 1, z);
            if (str.matches("=|\\+=|-=|\\*=|/=|%=")) {
                cVar = new com.mbridge.msdk.config.component.common.express.node.b(str, c, a);
            } else {
                cVar = new com.mbridge.msdk.config.component.common.express.node.c(str, c, a);
            }
            c = cVar;
        }
        return c;
    }

    public com.mbridge.msdk.config.component.common.express.node.d a(String str) {
        this.b = b(str);
        this.c = 0;
        return b(null, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d b(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z) {
        return a(dVar, 0, z);
    }
}
