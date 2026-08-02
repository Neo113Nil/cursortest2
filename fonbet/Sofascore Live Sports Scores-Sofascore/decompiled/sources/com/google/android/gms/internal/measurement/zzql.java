package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.k0p;
import defpackage.xto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzql extends BroadcastReceiver {
    public static volatile xto a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        k0p k0pVar;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            new StringBuilder(stringExtra.length() + 68);
            return;
        }
        xto xtoVar = a;
        if (xtoVar == null || (k0pVar = (k0p) ((zzpe) xtoVar.b).a.get(stringExtra)) == null) {
            return;
        }
        k0pVar.a.b();
    }
}
