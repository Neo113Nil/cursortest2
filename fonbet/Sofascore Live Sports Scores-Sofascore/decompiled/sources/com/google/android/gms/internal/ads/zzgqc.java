package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgqc {
    public final Set a;
    public final zzgqt b;

    public zzgqc(zzgqt zzgqtVar, Set set) {
        this.a = set;
        this.b = zzgqtVar;
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgqe) it.next()).c(hashMap);
        }
        return hashMap;
    }

    public final HashMap b(Context context, View view) {
        HashMap hashMap = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgqe) it.next()).a(hashMap, context, view);
        }
        return hashMap;
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgqe) it.next()).b(hashMap);
        }
        return hashMap;
    }
}
