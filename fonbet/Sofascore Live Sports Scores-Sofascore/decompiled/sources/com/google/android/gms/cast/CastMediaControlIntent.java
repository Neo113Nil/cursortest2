package com.google.android.gms.cast;

import defpackage.a70;
import defpackage.gvo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class CastMediaControlIntent {
    private CastMediaControlIntent() {
    }

    public static String a(String str) {
        Object obj = null;
        if (str != null) {
            return new gvo(13, str, obj).c();
        }
        a70.p("applicationId cannot be null");
        return null;
    }
}
