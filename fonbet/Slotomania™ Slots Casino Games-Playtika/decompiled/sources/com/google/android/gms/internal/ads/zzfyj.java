package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.PlaybackException;
import com.vungle.ads.internal.protos.Sdk;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfyj {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfyk zzc;
    private final zzfwq zzd;
    private final zzfwl zze;
    private final boolean zzf;
    private zzfxy zzg;
    private final Object zzh = new Object();

    public zzfyj(Context context, zzfyk zzfykVar, zzfwq zzfwqVar, zzfwl zzfwlVar, boolean z) {
        this.zzb = context;
        this.zzc = zzfykVar;
        this.zzd = zzfwqVar;
        this.zze = zzfwlVar;
        this.zzf = z;
    }

    private final synchronized Class zzd(zzfxz zzfxzVar) throws zzfyi {
        if (zzfxzVar.zza() == null) {
            throw new zzfyi(4010, "mc");
        }
        String zza2 = zzfxzVar.zza().zza();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zza2);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfxzVar.zzb())) {
                throw new zzfyi(2026, "VM did not pass signature verification");
            }
            try {
                File zzc = zzfxzVar.zzc();
                if (!zzc.exists()) {
                    zzc.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfxzVar.zzb().getAbsolutePath(), zzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zza2, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfyi(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfyi(2026, e2);
        }
    }

    public final boolean zza(zzfxz zzfxzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfxy zzfxyVar = new zzfxy(zzd(zzfxzVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfxzVar.zzd(), null, new Bundle(), 2), zzfxzVar, this.zzc, this.zzd, this.zzf);
                if (!zzfxyVar.zzf()) {
                    throw new zzfyi(Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, "init failed");
                }
                int zzh = zzfxyVar.zzh();
                if (zzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(zzh);
                    throw new zzfyi(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfxy zzfxyVar2 = this.zzg;
                    if (zzfxyVar2 != null) {
                        try {
                            zzfxyVar2.zzg();
                        } catch (zzfyi e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzg = zzfxyVar;
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfyi(2004, e2);
            }
        } catch (zzfyi e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }

    public final zzfwt zzb() {
        zzfxy zzfxyVar;
        synchronized (this.zzh) {
            zzfxyVar = this.zzg;
        }
        return zzfxyVar;
    }

    public final zzfxz zzc() {
        synchronized (this.zzh) {
            zzfxy zzfxyVar = this.zzg;
            if (zzfxyVar == null) {
                return null;
            }
            return zzfxyVar.zze();
        }
    }
}
