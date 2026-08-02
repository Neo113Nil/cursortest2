package com.vungle.ads.internal.task;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a {
    public static f a(String str) {
        f fVar = new f("CleanupJob");
        fVar.e = 0;
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("AD_ID_KEY", str);
        }
        f a = fVar.a(bundle);
        a.b = str == null;
        return a;
    }
}
