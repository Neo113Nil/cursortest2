package com.fyber.inneractive.sdk.util;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class i1 {
    public static String a(String str, int i) {
        return (i <= 0 || str.length() <= i) ? str : str.substring(0, i - 3).concat("...");
    }
}
