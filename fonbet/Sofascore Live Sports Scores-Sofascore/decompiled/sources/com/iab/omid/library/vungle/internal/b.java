package com.iab.omid.library.vungle.internal;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b extends d {
    private static b d = new b();

    private b() {
    }

    public static b g() {
        return d;
    }

    @Override // com.iab.omid.library.vungle.internal.d
    public void b(boolean z) {
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().a(z);
        }
    }

    @Override // com.iab.omid.library.vungle.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View e = it.next().e();
            if (e != null && e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
