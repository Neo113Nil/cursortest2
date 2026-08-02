package com.inmobi.media;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Yg {
    public static Xg a(String str, String str2) {
        str.getClass();
        str2.getClass();
        int hashCode = str2.hashCode();
        if (hashCode != -1084172778) {
            if (hashCode != 3213227) {
                if (hashCode == 1236050372 && str2.equals("htmlUrl")) {
                    return new C3362d8(str);
                }
            } else if (str2.equals("html")) {
                return new C3336c8(str);
            }
        } else if (str2.equals("inmobiJson")) {
            return new C3854w9(str);
        }
        a70.p("Unsupported markup type: ".concat(str2));
        return null;
    }
}
