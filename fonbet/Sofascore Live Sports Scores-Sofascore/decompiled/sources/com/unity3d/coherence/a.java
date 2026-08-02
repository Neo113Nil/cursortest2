package com.unity3d.coherence;

import android.content.Context;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a {
    public static volatile a c;
    public final b a;
    public final long b;

    public a(Context context) {
        long init = CoherenceBridge.init(new Coherence(context, context.getSharedPreferences("com.unity3d.coherence.prefs", 0)), "0.1.0", 2);
        if (init == 0) {
            a70.r("unity_coherence_library_init returned null (source=2)");
            throw null;
        }
        this.b = init;
        this.a = new b(this);
    }
}
