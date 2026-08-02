package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c extends a {
    private static volatile c t;

    private c() {
    }

    public static c n() {
        if (t == null) {
            synchronized (c.class) {
                try {
                    if (t == null) {
                        t = new c();
                    }
                } finally {
                }
            }
        }
        return t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }
}
