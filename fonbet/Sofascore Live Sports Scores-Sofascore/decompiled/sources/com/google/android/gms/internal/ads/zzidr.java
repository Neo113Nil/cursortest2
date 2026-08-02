package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzidq;
import com.google.android.gms.internal.ads.zzidr;
import defpackage.bf3;
import defpackage.mpo;
import defpackage.nqo;
import defpackage.ppo;
import defpackage.qpo;
import defpackage.vp2;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzidr<MessageType extends zzidr<MessageType, BuilderType>, BuilderType extends zzidq<MessageType, BuilderType>> implements zzigw {
    protected transient int zzq = 0;

    @Override // com.google.android.gms.internal.ads.zzigw
    public final void b(OutputStream outputStream) {
        zzifm zzifmVar = (zzifm) this;
        int k = zzifmVar.k(null);
        if (k > 4096) {
            k = 4096;
        }
        qpo qpoVar = new qpo(outputStream, k);
        zzifmVar.c(qpoVar);
        if (qpoVar.d > 0) {
            qpoVar.F();
        }
    }

    public final byte[] d() {
        try {
            int k = ((zzifm) this).k(null);
            byte[] bArr = new byte[k];
            ppo ppoVar = new ppo(bArr, k);
            ((zzifm) this).c(ppoVar);
            ppoVar.d();
            return bArr;
        } catch (IOException e) {
            vp2.e(l("byte array"), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final zziei e() {
        try {
            int k = ((zzifm) this).k(null);
            mpo mpoVar = zziei.b;
            byte[] bArr = new byte[k];
            ppo ppoVar = new ppo(bArr, k);
            ((zzifm) this).c(ppoVar);
            ppoVar.d();
            return new mpo(bArr);
        } catch (IOException e) {
            vp2.e(l("ByteString"), e);
            return null;
        }
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int k(nqo nqoVar) {
        return h();
    }

    public final String l(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        bf3.v(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
