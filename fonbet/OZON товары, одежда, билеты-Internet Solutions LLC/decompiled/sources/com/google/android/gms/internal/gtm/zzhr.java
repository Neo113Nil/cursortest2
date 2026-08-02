package com.google.android.gms.internal.gtm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tagmanager.impl.R;

/* loaded from: classes9.dex */
public final class zzhr {
    private final Context zza;
    private final Context zzb;
    private final Intent zzc;
    private final zzje zzd;

    public zzhr(Intent intent, Context context, Context context2, zzje zzjeVar) {
        this.zza = context;
        this.zzb = context2;
        this.zzc = intent;
        this.zzd = zzjeVar;
    }

    public final void zzb() {
        try {
            this.zzd.zzn(this.zzc.getData());
            String string = this.zzb.getResources().getString(R.string.tagmanager_preview_dialog_title);
            String string2 = this.zzb.getResources().getString(R.string.tagmanager_preview_dialog_message);
            String string3 = this.zzb.getResources().getString(R.string.tagmanager_preview_dialog_button);
            AlertDialog create = new AlertDialog.Builder(this.zza).create();
            create.setTitle(string);
            create.setMessage(string2);
            create.setButton(-1, string3, new zzhq(this));
            create.show();
        } catch (Exception e11) {
            String valueOf = String.valueOf(e11.getMessage());
            zzhl.zza(valueOf.length() != 0 ? "Calling preview threw an exception: ".concat(valueOf) : new String("Calling preview threw an exception: "));
        }
    }
}
