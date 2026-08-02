package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import defpackage.mz1;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʃ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0283 {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final List f513;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f514;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f515;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final Pattern f516;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final Pattern f517;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final Pattern f518;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final Pattern f519;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final Pattern f520;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final Pattern f521;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final Pattern f522;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Pattern f523;

    static {
        StringFog.decrypt("p63TaWc=\n", "68irDBUSQ9Q=\n");
        f515 = StringFog.decrypt("1Xj2WA==\n", "oQqDPZ7I1sw=\n");
        f514 = StringFog.decrypt("FnXTBts=\n", "cBS/db6pisc=\n");
        f523 = Pattern.compile(StringFog.decrypt("KjpMg2rElz5QPnD1cajAJVk7HYMpoeU5Xg==\n", "dGEtrhCFumQ=\n"));
        f522 = Pattern.compile(StringFog.decrypt("r92gq5MKXvaNpNa29H8o9g==\n", "8f+IlKlWAtQ=\n"));
        f521 = Pattern.compile(StringFog.decrypt("FVaEC6YSuCw3KvITwWfOLA==\n", "S3GsNJxO5As=\n"));
        f520 = Pattern.compile(StringFog.decrypt("dYEcAwsOvNUFgRwDCw68\n", "K9osLjJTl4k=\n"));
        f519 = Pattern.compile(StringFog.decrypt("3d7bRd9Fww==\n", "g4XraOYY6EY=\n"));
        f518 = Pattern.compile(StringFog.decrypt("L4HusuDZPYhVhdLE+7Vqk1yAv7KjvE/8LPDTsfn0caEC8rC+xrA5\n", "cdqPn5qYENI=\n"));
        f517 = Pattern.compile(StringFog.decrypt("LpbV\n", "cLDzZX3TeUU=\n"));
        f516 = Pattern.compile(StringFog.decrypt("aOrbEu4=\n", "NranTpKBwSs=\n"));
        f513 = Arrays.asList(StringFog.decrypt("ulE=\n", "0zf85xr29lo=\n"), StringFog.decrypt("/LMgOw==\n", "md9TXmLTF6I=\n"), StringFog.decrypt("xMJL8Q==\n", "qrcnnYfjG2M=\n"), StringFog.decrypt("Fd+zjpOm\n", "Z7rH++HIXeI=\n"), StringFog.decrypt("ekChoIQ=\n", "CTXRxfaGEjk=\n"), StringFog.decrypt("kHwV\n", "5A5s2tMzyEw=\n"), StringFog.decrypt("z7VV44Q=\n", "rNQhgOzAP60=\n"));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x004c. Please report as an issue. */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m169(String str, String str2, String str3) {
        int length;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str3.length()) {
            int i2 = i + 1;
            char charAt = i2 < str3.length() ? str3.charAt(i2) : (char) 0;
            char charAt2 = str3.charAt(i);
            if (charAt2 != '\n') {
                if (charAt2 != '%' && charAt2 != '[' && charAt2 != ']' && charAt2 != '{' && charAt2 != '}') {
                    if (charAt2 != '!') {
                        if (charAt2 != '\"') {
                            switch (charAt2) {
                                case '\'':
                                    String m168 = m168(f521, str3, i);
                                    if (m168 != null) {
                                        String h = wv8.h(1, 1, m168);
                                        if (h.length() == 1) {
                                            arrayList.add(new C0640(EnumC0742.f2462, String.valueOf((int) h.charAt(0))));
                                        } else {
                                            arrayList.add(new C0640(EnumC0742.f2463, h));
                                        }
                                        i = mz1.d(2, i, h);
                                        break;
                                    } else {
                                        String e = ceo.e("Jiv4A0jk\n", "ak6AZjrLWXQ=\n", str);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(StringFog.decrypt("YZJHRIGRYhBWk1xFlJFhBVaJW0zT0GZRVI9GQofYfR8E\n", "JOA1K/OxEnE=\n"));
                                        sb.append(i);
                                        AbstractC0962.m595(e, AbstractC0424.m255("3NG2Xw==\n", "/LjYf+1WFg8=\n", sb, str2), null, null);
                                        break;
                                    }
                                case '(':
                                case ')':
                                case '*':
                                case ',':
                                case '.':
                                    break;
                                case '+':
                                    if (charAt != '+') {
                                        arrayList.add(new C0640(EnumC0742.f2464, "" + str3.charAt(i)));
                                        break;
                                    } else {
                                        arrayList.add(new C0640(EnumC0742.f2464, StringFog.decrypt("7Kw=\n", "x4cd+eQgb4c=\n")));
                                        i += 2;
                                        break;
                                    }
                                case '-':
                                    if (charAt != '-') {
                                        break;
                                    } else {
                                        arrayList.add(new C0640(EnumC0742.f2464, StringFog.decrypt("JRg=\n", "CDV37Si0ucI=\n")));
                                        i += 2;
                                        break;
                                    }
                                case '/':
                                    arrayList.add(new C0640(EnumC0742.f2464, "" + str3.charAt(i)));
                                    break;
                                default:
                                    switch (charAt2) {
                                        case ':':
                                        case ';':
                                        case '?':
                                            break;
                                        case '<':
                                        case '=':
                                        case '>':
                                            break;
                                        default:
                                            if (!Character.isWhitespace(str3.charAt(i))) {
                                                EnumC0742 enumC0742 = EnumC0742.f2459;
                                                String m1682 = m168(f518, str3, i);
                                                if (TextUtils.isEmpty(m1682)) {
                                                    enumC0742 = EnumC0742.f2465;
                                                    m1682 = m168(f523, str3, i);
                                                    if (!TextUtils.isEmpty(m1682)) {
                                                        if (m1682.equals(f515) || m1682.equals(f514)) {
                                                            enumC0742 = EnumC0742.f2460;
                                                        } else if (f513.contains(m1682)) {
                                                            enumC0742 = EnumC0742.f2466;
                                                        }
                                                    }
                                                }
                                                if (TextUtils.isEmpty(m1682)) {
                                                    enumC0742 = EnumC0742.f2461;
                                                    m1682 = m168(f520, str3, i);
                                                }
                                                if (TextUtils.isEmpty(m1682)) {
                                                    enumC0742 = EnumC0742.f2462;
                                                    m1682 = m168(f519, str3, i);
                                                }
                                                if (TextUtils.isEmpty(m1682)) {
                                                    enumC0742 = EnumC0742.f2464;
                                                    m1682 = m168(f516, str3, i);
                                                }
                                                if (TextUtils.isEmpty(m1682)) {
                                                    enumC0742 = EnumC0742.f2464;
                                                    m1682 = m168(f517, str3, i);
                                                }
                                                if (!TextUtils.isEmpty(m1682)) {
                                                    arrayList.add(new C0640(enumC0742, m1682));
                                                    length = m1682.length();
                                                    i += length;
                                                    break;
                                                } else {
                                                    String e2 = ceo.e("jhpFbq6g\n", "wn89C9yPJZc=\n", str);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(StringFog.decrypt("KkyNsN14g6cWWJqxnnSMqA0C\n", "fyL/1b4X5Mk=\n"));
                                                    sb2.append(str3.charAt(i));
                                                    sb2.append(StringFog.decrypt("FbRpov7/EOZBvHLsrg==\n", "NdUdgo6QY48=\n"));
                                                    sb2.append(i);
                                                    AbstractC0962.m595(e2, AbstractC0424.m255("m1U1eg==\n", "uzxbWj3/kz8=\n", sb2, str2), null, null);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                            break;
                                    }
                            }
                        } else {
                            String m1683 = m168(f522, str3, i);
                            if (m1683 == null) {
                                String e3 = ceo.e("8NJukLFg\n", "vLcW9cNPrxI=\n", str);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(StringFog.decrypt("bXK9aQ+CFeNac6ZoGoIW9lppoWFdwxGiWG+8bwnLCuwI\n", "KADPBn2iZYI=\n"));
                                sb3.append(i);
                                AbstractC0962.m595(e3, AbstractC0424.m255("qFOW2Q==\n", "iDr4+WaWRM0=\n", sb3, str2), null, null);
                            } else {
                                String h2 = wv8.h(1, 1, m1683);
                                arrayList.add(new C0640(EnumC0742.f2463, h2));
                                length = h2.length() + 2;
                                i += length;
                            }
                        }
                    }
                    if (charAt == '=') {
                        EnumC0742 enumC07422 = EnumC0742.f2464;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str3.charAt(i));
                        arrayList.add(new C0640(enumC07422, AbstractC1133.m662("ug==\n", "h/yN2vrNGlk=\n", sb4)));
                        i += 2;
                    } else {
                        arrayList.add(new C0640(EnumC0742.f2464, "" + str3.charAt(i)));
                    }
                }
                arrayList.add(new C0640(EnumC0742.f2464, "" + str3.charAt(i)));
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m168(Pattern pattern, String str, int i) {
        Matcher matcher = pattern.matcher(str);
        matcher.region(i, str.length());
        if (matcher.find()) {
            return str.substring(matcher.start(), matcher.end());
        }
        return null;
    }
}
