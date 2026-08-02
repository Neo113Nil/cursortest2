package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import B0.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcq;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class zzcq<MessageType extends zzcq<MessageType, BuilderType>, BuilderType extends zzcp<MessageType, BuilderType>> implements zzfm {
    protected int zza = 0;

    int zzB(zzge zzgeVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final zzdf zzC() {
        try {
            int zzF = zzF();
            zzdf zzdfVar = zzdf.zzb;
            byte[] bArr = new byte[zzF];
            zzdk zzdkVar = new zzdk(bArr, 0, zzF);
            zzab(zzdkVar);
            zzdkVar.zzC();
            return new zzde(bArr);
        } catch (IOException e11) {
            throw new RuntimeException(A0.b("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e11);
        }
    }

    public final byte[] zzD() {
        try {
            int zzF = zzF();
            byte[] bArr = new byte[zzF];
            zzdk zzdkVar = new zzdk(bArr, 0, zzF);
            zzab(zzdkVar);
            zzdkVar.zzC();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException(A0.b("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e11);
        }
    }
}
