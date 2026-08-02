package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ն, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0433 extends AbstractC0475 implements InterfaceC0823 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public String f1240;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f1241;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f1242;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Map f1243;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1239 = StringFog.decrypt("a3GjKIlCpwl8f4ELjl2iNXY=\n", "GBTXbvwuy1o=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1238 = StringFog.decrypt("EumYeN/5lh4QzLt/wPyqFCj/qg==\n", "e5reDbOVxXo=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1237 = StringFog.decrypt("dQYqwiewSFc=\n", "EmNegUvROyQ=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1236 = StringFog.decrypt("Fgrv\n", "f2SbF3tB4Yk=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1235 = StringFog.decrypt("1xno/w==\n", "u3aGmEe1dnw=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f1234 = StringFog.decrypt("Ef516rOh\n", "dZEAiN/Evqk=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f1233 = StringFog.decrypt("EQl2i8Y=\n", "d2UZ6rI2UQI=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f1232 = StringFog.decrypt("LU3Pig==\n", "TyKg5gtPHkQ=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f1231 = StringFog.decrypt("HpB5Mw==\n", "ffgYQX7C/48=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f1230 = StringFog.decrypt("u+KAXg==\n", "2Zv0O4lZPLs=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1229 = StringFog.decrypt("nIeeNA==\n", "6uj3UD8kbaw=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1228 = StringFog.decrypt("dBoFJkE=\n", "B3JqVDWu3jA=\n");

    public AbstractC0433(String str) {
        this.f1242 = str;
    }

    /* renamed from: ﻏ */
    public boolean mo219() {
        return this instanceof C0389;
    }

    /* renamed from: ﻐ */
    public boolean mo216() {
        return this instanceof C0405;
    }

    /* renamed from: ﻛ */
    public abstract String mo115();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m268() {
        try {
            if (!TextUtils.isEmpty(this.f1240)) {
                if (this.f1240.equals(StringFog.decrypt("A+YIvKZuLQ==\n", "RqhJ/uoraR8=\n"))) {
                }
            }
            this.f1240 = mo115();
        } catch (Throwable th) {
            throw th;
        }
        return this.f1240;
    }

    /* renamed from: ﾇ */
    public abstract HashMap mo116();

    /* renamed from: ﾒ */
    public abstract Class mo117(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.ironsource.adqualitysdk.sdk.i.Ն] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.ironsource.adqualitysdk.sdk.i.Ն] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Class] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class m269(String str, boolean z) {
        try {
            if (str.contains(StringFog.decrypt("rA==\n", "gjeDVx3286Q=\n"))) {
                String str2 = AbstractC0816.f2624;
                try {
                    this = Class.forName(str);
                    return this;
                } catch (Throwable th) {
                    if (z) {
                        AbstractC0962.m595(AbstractC0816.f2624, StringFog.decrypt("qBou1xta\n", "63ZPpGh6MEY=\n") + str + StringFog.decrypt("bKBOgv0LRzwiqg==\n", "TM4h9t1tKEk=\n"), th, null);
                    }
                    return null;
                }
            }
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals(f1234)) {
                        return Double.TYPE;
                    }
                    break;
                case 104431:
                    if (str.equals(f1236)) {
                        return Integer.TYPE;
                    }
                    break;
                case 3029738:
                    if (str.equals(f1232)) {
                        return Boolean.TYPE;
                    }
                    break;
                case 3039496:
                    if (str.equals(f1230)) {
                        return Byte.TYPE;
                    }
                    break;
                case 3052374:
                    if (str.equals(f1231)) {
                        return Character.TYPE;
                    }
                    break;
                case 3327612:
                    if (str.equals(f1235)) {
                        return Long.TYPE;
                    }
                    break;
                case 3625364:
                    if (str.equals(f1229)) {
                        return Void.TYPE;
                    }
                    break;
                case 97526364:
                    if (str.equals(f1233)) {
                        return Float.TYPE;
                    }
                    break;
                case 109413500:
                    if (str.equals(f1228)) {
                        return Short.TYPE;
                    }
                    break;
            }
            return mo117(str);
        } catch (Throwable th2) {
            if (z) {
                AbstractC0962.m595(this.f1242, AbstractC1133.m662("3eomQ4nwSn2T4A==\n", "/YRJN6mWJQg=\n", AbstractC1072.m642("QkfM0GYs\n", "ASutoxUM05s=\n", new StringBuilder(), str)), th2, null);
            }
            return null;
        }
    }

    /* renamed from: ﾒ */
    public String mo118() {
        String str = this.f1241;
        return str != null ? str : m268();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0823
    /* renamed from: ﾒ */
    public final Object mo55(C1102 c1102, String str, ArrayList arrayList, C0683 c0683, C0950 c0950) {
        InterfaceC0435 interfaceC0435 = (InterfaceC0435) this.f1243.get(str);
        try {
        } catch (Exception e) {
            String str2 = this.f1242;
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("1ivSA4jLaGD6NcVMn5N6a+YtyQKdyw==\n", "k1mgbPrrHwg=\n"));
            sb.append(this.f1242);
            AbstractC0962.m595(str2, AbstractC1133.m662("hA==\n", "o2HEUmgUNxU=\n", AbstractC1072.m642("B7w=\n", "J5ttMlIlZIg=\n", sb, str)), e, null);
        }
        if (interfaceC0435 != null) {
            return interfaceC0435.mo114(arrayList, c0683);
        }
        new C0315(c1102, c0950, this.f1242, str).m277(this.f1242);
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m270(InterfaceC0873 interfaceC0873, C0683 c0683, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, interfaceC0873);
            C1102.m648(c0683.f2325, str, true, false, arrayList);
            C1102 c1102 = c0683.f2325;
            C0720 c0720 = new C0720(c0683, str, false, arrayList);
            c1102.getClass();
            try {
                AbstractC1008.m614(c0720);
            } catch (Throwable unused) {
            }
            C1102 c11022 = c0683.f2325;
            C0720 c07202 = new C0720(c0683, str, true, arrayList);
            c11022.getClass();
            try {
                AbstractC1008.m612(new C0582(c07202));
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            AbstractC0962.m595(this.f1242, StringFog.decrypt("+wkoaw2cPjme\n", "vntaBH+8V1c=\n") + this, th, null);
        }
    }
}
