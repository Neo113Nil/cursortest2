package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes9.dex */
final class zzhq implements DialogInterface.OnClickListener {
    final /* synthetic */ zzhr zza;

    zzhq(zzhr zzhrVar) {
        this.zza = zzhrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        Context context;
        Context context2;
        Context context3;
        context = this.zza.zza;
        String packageName = context.getPackageName();
        context2 = this.zza.zza;
        Intent launchIntentForPackage = context2.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            String valueOf = String.valueOf(packageName);
            zzhl.zze(valueOf.length() != 0 ? "No launch activity found for package name: ".concat(valueOf) : new String("No launch activity found for package name: "));
        } else {
            String valueOf2 = String.valueOf(packageName);
            zzhl.zzc(valueOf2.length() != 0 ? "Invoke the launch activity for package name: ".concat(valueOf2) : new String("Invoke the launch activity for package name: "));
            context3 = this.zza.zza;
            context3.startActivity(launchIntentForPackage);
        }
    }
}
