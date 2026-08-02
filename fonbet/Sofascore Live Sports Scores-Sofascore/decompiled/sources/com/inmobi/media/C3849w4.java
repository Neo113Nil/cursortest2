package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.w4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3849w4 {
    public final String a = "w4";

    public final Il a(C3562l2 c3562l2, C3797u4 c3797u4) {
        Integer num;
        c3562l2.getClass();
        c3797u4.getClass();
        int b = c3562l2.b();
        Config config = c3797u4.b;
        if (b != 200) {
            String str = this.a;
            if (b != 304) {
                str.getClass();
                b += 1000;
            } else {
                str.getClass();
                c3797u4.b.getType();
            }
        } else {
            try {
                Config a = c3562l2.a();
                if (a == null) {
                    this.a.getClass();
                    num = 3;
                } else if (a.isValid()) {
                    num = null;
                } else {
                    this.a.getClass();
                    num = 4;
                }
                if (num != null) {
                    b = num.intValue();
                } else {
                    if (a == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = a;
                }
            } catch (IllegalArgumentException unused) {
                b = 2;
            }
        }
        return new Il(b, config);
    }
}
