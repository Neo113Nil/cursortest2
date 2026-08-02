package com.ironsource;

import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4051e5 {
    private long a = new Date().getTime();

    public static long a(C4051e5 c4051e5) {
        if (c4051e5 == null) {
            return 0L;
        }
        return new Date().getTime() - c4051e5.a;
    }
}
