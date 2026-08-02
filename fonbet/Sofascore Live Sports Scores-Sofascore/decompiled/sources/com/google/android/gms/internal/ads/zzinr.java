package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.yhk;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzinr {
    public final LinkedHashMap a;

    public zzinr(int i) {
        this.a = new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public final void a(Object obj, zziof zziofVar) {
        if (zziofVar != null) {
            this.a.put(obj, zziofVar);
        } else {
            yhk.s(IronSourceConstants.EVENTS_PROVIDER);
        }
    }

    public void b(String str, zziof zziofVar) {
        a(str, zziofVar);
    }
}
