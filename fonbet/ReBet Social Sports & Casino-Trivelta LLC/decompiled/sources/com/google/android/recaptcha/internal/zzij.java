package com.google.android.recaptcha.internal;

import Ph.InterfaceC1484x;
import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzij {
    final /* synthetic */ zzja zza;

    @Nullable
    private Long zzb;

    @NotNull
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    @Nullable
    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(@NotNull String str) {
        zzek zzekVar;
        zzen zzenVar;
        zzja zzjaVar = this.zza;
        if (zzjaVar.zzq().zzb == null) {
            zzenVar = zzjaVar.zzp;
            if (zzenVar != null) {
                zzenVar.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrc zzl = zzrc.zzl(zzbt.zza(str));
        zztw zzi = zztx.zzi();
        zzi.zzf(zzl);
        zztx zztxVar = (zztx) zzi.zzk();
        zzekVar = this.zza.zzj;
        zzekVar.zze(zztxVar);
    }

    @JavascriptInterface
    public final void zzlsm(@NotNull String str) {
        zzek zzekVar;
        zzb();
        zztw zzi = zztx.zzi();
        zzi.zzq(zzrr.zzi(zzbt.zza(str)));
        zztx zztxVar = (zztx) zzi.zzk();
        zzekVar = this.zza.zzj;
        zzekVar.zze(zztxVar);
    }

    @JavascriptInterface
    public final void zzoid(@NotNull String str) {
        zzb();
        zzts zzg = zzts.zzg(zzbt.zza(str));
        zzg.zzi().name();
        if (zzg.zzi() == zztv.JS_CODE_SUCCESS) {
            this.zza.zzA().hashCode();
            if (this.zza.zzA().A0(Unit.INSTANCE)) {
                return;
            }
            this.zza.zzA().hashCode();
            return;
        }
        zzg.zzi().name();
        int i10 = zzbd.zza;
        zzbd zza = zzbc.zza(zzg.zzi());
        this.zza.zzA().hashCode();
        this.zza.zzA().k(zza);
    }

    @JavascriptInterface
    public final void zzrp(@NotNull String str) {
        zzb();
        zzfo zzfoVar = this.zza.zzb;
        if (zzfoVar == null) {
            zzfoVar = null;
        }
        zzfoVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(@NotNull String str) {
        Map map;
        zzb();
        zzsi zzi = zzsi.zzi(zzbt.zza(str));
        zzi.toString();
        map = this.zza.zze;
        InterfaceC1484x interfaceC1484x = (InterfaceC1484x) map.remove(zzi.zzk());
        if (interfaceC1484x != null) {
            interfaceC1484x.A0(zzi);
        }
    }
}
