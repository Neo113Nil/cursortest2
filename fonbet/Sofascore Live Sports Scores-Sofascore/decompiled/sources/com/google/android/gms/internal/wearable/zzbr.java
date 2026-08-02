package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzbq;
import com.google.android.gms.internal.wearable.zzbr;
import defpackage.rtn;
import defpackage.s6o;
import defpackage.vp2;
import defpackage.wt3;
import defpackage.zrn;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbr<MessageType extends zzbr<MessageType, BuilderType>, BuilderType extends zzbq<MessageType, BuilderType>> implements zzel {
    protected transient int zza = 0;

    public int b(s6o s6oVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final zzcg zzH() {
        try {
            zzdg zzdgVar = (zzdg) this;
            int zzT = zzdgVar.zzT();
            zrn zrnVar = zzcg.b;
            byte[] bArr = new byte[zzT];
            boolean z = zzcn.b;
            rtn rtnVar = new rtn(bArr, zzT);
            zzdgVar.a(rtnVar);
            if (rtnVar.u() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (rtnVar.u() >= 0) {
                return new zrn(bArr);
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            vp2.e(wt3.m("Serializing ", name, new StringBuilder(name.length() + 72), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
