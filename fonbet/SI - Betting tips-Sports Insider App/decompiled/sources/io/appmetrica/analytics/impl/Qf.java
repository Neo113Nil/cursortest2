package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Qf {
    public static final String a(C0122e9 c0122e9) {
        String str;
        StringBuilder sb2 = new StringBuilder("Event sent: ");
        int i5 = c0122e9.f13663c;
        String str2 = c0122e9.f13664d;
        byte[] bArr = c0122e9.f13665e;
        if (i5 == 1) {
            str = "Attribution";
        } else if (i5 == 2) {
            str = "Session start";
        } else if (i5 == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb3 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, Charsets.UTF_8);
                if (!TextUtils.isEmpty(str3)) {
                    sb3.append(" with value ");
                    sb3.append(str3);
                }
            }
            str = sb3.toString();
        } else if (i5 == 5) {
            str = "Referrer";
        } else if (i5 == 7) {
            str = "Session heartbeat";
        } else if (i5 == 13) {
            str = "The very first event";
        } else if (i5 == 35) {
            str = "E-Commerce";
        } else if (i5 == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i5 == 42) {
            str = "External attribution";
        } else if (i5 == 16) {
            str = "Open";
        } else if (i5 == 17) {
            str = "Update";
        } else if (i5 == 20) {
            str = "User profile update";
        } else if (i5 != 21) {
            switch (i5) {
                case C0122e9.F /* 25 */:
                    str = "ANR";
                    break;
                case C0122e9.G /* 26 */:
                    str = androidx.appcompat.widget.c1.m("Crash: ", str2);
                    break;
                case C0122e9.H /* 27 */:
                    str = androidx.appcompat.widget.c1.m("Error: ", str2);
                    break;
                default:
                    str = androidx.appcompat.widget.c1.i(i5, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static final String a(String str, EnumC0047bb enumC0047bb, String str2, String str3) {
        if (!AbstractC0576w9.f14828d.contains(EnumC0047bb.a(enumC0047bb.f13440a))) {
            return null;
        }
        StringBuilder c2 = v.f.c(str, ": ");
        c2.append(enumC0047bb.name());
        if (AbstractC0576w9.f14830f.contains(enumC0047bb) && !TextUtils.isEmpty(str2)) {
            c2.append(" with name ");
            c2.append(str2);
        }
        if (AbstractC0576w9.f14829e.contains(enumC0047bb) && !TextUtils.isEmpty(str3)) {
            c2.append(" with value ");
            c2.append(str3);
        }
        return c2.toString();
    }
}
