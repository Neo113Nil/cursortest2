package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;
import defpackage.ewm;
import defpackage.kco;
import defpackage.slo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgdv {
    public static kco a(Task task) {
        kco kcoVar = new kco();
        kcoVar.h = task;
        task.addOnCompleteListener(slo.a, new ewm(kcoVar, 26));
        return kcoVar;
    }
}
