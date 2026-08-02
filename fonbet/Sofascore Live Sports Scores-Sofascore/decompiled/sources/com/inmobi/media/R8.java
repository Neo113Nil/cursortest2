package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class R8 {
    public final WeakHashMap a;
    public final WeakHashMap b;
    public final C3310b8 c;
    public final String d;
    public final Handler e;
    public final Q8 f;
    public final long g;
    public final C3852w7 h;

    public R8(AdConfig.ViewabilityConfig viewabilityConfig, C3310b8 c3310b8, C3852w7 c3852w7) {
        viewabilityConfig.getClass();
        c3310b8.getClass();
        c3852w7.getClass();
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = weakHashMap;
        this.b = weakHashMap2;
        this.c = c3310b8;
        this.d = "R8";
        this.g = viewabilityConfig.getImpressionPollIntervalMillis();
        O8 o8 = new O8(this);
        InterfaceC3880x9 interfaceC3880x9 = c3310b8.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        c3310b8.h = o8;
        this.e = handler;
        this.f = new Q8(this);
        this.h = c3852w7;
    }

    public final void a(View view) {
        view.getClass();
        this.a.remove(view);
        this.b.remove(view);
        this.c.a(view);
    }
}
