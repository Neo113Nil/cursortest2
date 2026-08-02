package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzoz;
import com.google.android.gms.internal.consent_sdk.zzpa;
import defpackage.c2p;
import defpackage.d2p;
import defpackage.g5p;
import defpackage.lnb;
import defpackage.v1p;
import defpackage.vp2;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzpa<MessageType extends zzpa<MessageType, BuilderType>, BuilderType extends zzoz<MessageType, BuilderType>> implements zzrq {
    protected int zza = 0;

    public final void b(OutputStream outputStream) {
        zzqm zzqmVar = (zzqm) this;
        int zzn = zzqmVar.zzn();
        Logger logger = zzpv.b;
        if (zzn > 4096) {
            zzn = 4096;
        }
        d2p d2pVar = new d2p(outputStream, zzn);
        zzqmVar.a(d2pVar);
        if (d2pVar.f > 0) {
            d2pVar.A();
        }
    }

    public int c(g5p g5pVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final v1p zzk() {
        try {
            zzqm zzqmVar = (zzqm) this;
            int zzn = zzqmVar.zzn();
            v1p v1pVar = zzpm.b;
            byte[] bArr = new byte[zzn];
            Logger logger = zzpv.b;
            c2p c2pVar = new c2p(bArr, zzn);
            zzqmVar.a(c2pVar);
            if (c2pVar.e - c2pVar.f == 0) {
                return new v1p(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            vp2.e(lnb.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
