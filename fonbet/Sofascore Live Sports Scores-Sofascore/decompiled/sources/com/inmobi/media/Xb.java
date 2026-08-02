package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Xb {
    public static byte a;

    public static final void a(byte b, String str, String str2) {
        str.getClass();
        if (str2 == null || b == 1 || b == 2 || b != 3) {
            return;
        }
        a(str, str2);
    }

    public static void a(String str, String str2) {
        if (str2.length() > 4000) {
            str2.substring(0, 4000);
            a(str, str2.substring(4000));
        }
    }
}
