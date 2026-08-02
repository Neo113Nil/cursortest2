package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzaw implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public zzaw(zzax zzaxVar, Context context, String str, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.a;
        AlertDialog.Builder zzN = zzs.zzN(context);
        zzN.setMessage(this.b);
        if (this.c) {
            zzN.setTitle("Error");
        } else {
            zzN.setTitle("Info");
        }
        if (this.d) {
            zzN.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzN.setPositiveButton("Learn More", new zzav(this, context));
            zzN.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzN.create().show();
    }
}
