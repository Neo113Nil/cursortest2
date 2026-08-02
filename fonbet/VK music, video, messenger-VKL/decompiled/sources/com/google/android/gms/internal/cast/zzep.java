package com.google.android.gms.internal.cast;

import android.hardware.display.DisplayManager;
import android.os.RemoteException;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzep extends zzeo {
    final /* synthetic */ zzer zza;
    private final zzew zzb;

    public zzep(zzer zzerVar, zzew zzewVar) {
        Objects.requireNonNull(zzerVar);
        this.zza = zzerVar;
        this.zzb = zzewVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.zzeo, com.google.android.gms.internal.cast.zzey
    public final void zzb(int i, int i2, Surface surface, @Nullable ApiMetadata apiMetadata) {
        o100 o100Var;
        o100 o100Var2;
        o100 o100Var3;
        o100 o100Var4;
        o100 o100Var5;
        o100Var = zzet.zzb;
        o100Var.a("onConnected", new Object[0]);
        zzew zzewVar = this.zzb;
        DisplayManager displayManager = (DisplayManager) zzewVar.getContext().getSystemService("display");
        if (displayManager == null) {
            o100Var5 = zzet.zzb;
            Log.e(o100Var5.a, o100Var5.c("Unable to get the display manager", new Object[0]));
            this.zza.setResult((zzer) new zzes(Status.h));
            return;
        }
        zzer zzerVar = this.zza;
        zzet zzetVar = zzerVar.zzc;
        zzetVar.zza();
        zzetVar.zze(displayManager.createVirtualDisplay("private_display", i, i2, ((i < i2 ? i : i2) * 320) / 1080, surface, 2));
        if (zzetVar.zzd() == null) {
            o100Var4 = zzet.zzb;
            Log.e(o100Var4.a, o100Var4.c("Unable to create virtual display", new Object[0]));
            zzerVar.setResult((zzer) new zzes(Status.h));
        } else if (zzetVar.zzd().getDisplay() == null) {
            o100Var3 = zzet.zzb;
            Log.e(o100Var3.a, o100Var3.c("Virtual display does not have a display", new Object[0]));
            zzerVar.setResult((zzer) new zzes(Status.h));
        } else {
            try {
                ((zzez) zzewVar.getService()).zzh(this, zzetVar.zzd().getDisplay().getDisplayId(), zzff.zza(zzewVar.getContext()));
            } catch (RemoteException | IllegalStateException unused) {
                o100Var2 = zzet.zzb;
                Log.e(o100Var2.a, o100Var2.c("Unable to provision the route's new virtual Display", new Object[0]));
                this.zza.setResult((zzer) new zzes(Status.h));
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzeo, com.google.android.gms.internal.cast.zzey
    public final void zzc(@Nullable ApiMetadata apiMetadata) {
        o100 o100Var;
        o100 o100Var2;
        o100 o100Var3;
        o100Var = zzet.zzb;
        o100Var.a("onConnectedWithDisplay", new Object[0]);
        zzer zzerVar = this.zza;
        zzet zzetVar = zzerVar.zzc;
        if (zzetVar.zzd() == null) {
            o100Var3 = zzet.zzb;
            Log.e(o100Var3.a, o100Var3.c("There is no virtual display", new Object[0]));
            zzerVar.setResult((zzer) new zzes(Status.h));
            return;
        }
        Display display = zzetVar.zzd().getDisplay();
        if (display != null) {
            zzerVar.setResult((zzer) new zzes(display));
            return;
        }
        o100Var2 = zzet.zzb;
        Log.e(o100Var2.a, o100Var2.c("Virtual display no longer has a display", new Object[0]));
        zzerVar.setResult((zzer) new zzes(Status.h));
    }

    @Override // com.google.android.gms.internal.cast.zzeo, com.google.android.gms.internal.cast.zzey
    public final void zzd(int i, @Nullable ApiMetadata apiMetadata) throws RemoteException {
        o100 o100Var;
        int i2 = zzet.zza;
        Object[] objArr = {Integer.valueOf(i)};
        o100Var = zzet.zzb;
        o100Var.a("onError: %d", objArr);
        zzer zzerVar = this.zza;
        zzerVar.zzc.zza();
        zzerVar.setResult((zzer) new zzes(Status.h));
    }
}
