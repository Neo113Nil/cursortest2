package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzez;
import com.google.android.gms.internal.play_billing.zzfa;
import defpackage.eao;
import defpackage.lnb;
import defpackage.qoo;
import defpackage.vp2;
import defpackage.z8o;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfa<MessageType extends zzfa<MessageType, BuilderType>, BuilderType extends zzez<MessageType, BuilderType>> implements zzhr {
    protected transient int zza = 0;

    public final byte[] b() {
        try {
            zzgp zzgpVar = (zzgp) this;
            int zzn = zzgpVar.zzn();
            byte[] bArr = new byte[zzn];
            eao eaoVar = new eao(bArr, zzn);
            zzgpVar.a(eaoVar);
            eaoVar.a();
            return bArr;
        } catch (IOException e) {
            vp2.e(lnb.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public int c(qoo qooVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final z8o zzj() {
        try {
            zzgp zzgpVar = (zzgp) this;
            int zzn = zzgpVar.zzn();
            z8o z8oVar = zzfp.b;
            byte[] bArr = new byte[zzn];
            eao eaoVar = new eao(bArr, zzn);
            zzgpVar.a(eaoVar);
            eaoVar.a();
            return new z8o(bArr);
        } catch (IOException e) {
            vp2.e(lnb.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
