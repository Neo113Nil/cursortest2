package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajm;
import com.google.android.gms.internal.p002firebaseauthapi.zzajo;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class zzajm<MessageType extends zzajm<MessageType, BuilderType>, BuilderType extends zzajo<MessageType, BuilderType>> implements zzamm {
    protected int zza = 0;

    public int zza(zzanb zzanbVar) {
        int zzi = zzi();
        if (zzi != -1) {
            return zzi;
        }
        int zza = zzanbVar.zza(this);
        zzb(zza);
        return zza;
    }

    public void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    public int zzi() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamm
    public final zzajv zzj() {
        try {
            zzake zzc = zzajv.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzakn zzb = zzakn.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzakn zza = zzakn.zza(outputStream, zzakn.zze(zzl()));
        zza(zza);
        zza.zzc();
    }
}
