package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.zzabh;
import com.google.android.gms.internal.pal.zzabi;
import defpackage.acn;
import defpackage.e3c;
import defpackage.h8n;
import defpackage.kcn;
import defpackage.lnb;
import defpackage.r7n;
import defpackage.vp2;
import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzabi<MessageType extends zzabi<MessageType, BuilderType>, BuilderType extends zzabh<MessageType, BuilderType>> implements zzaef {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.pal.zzaef
    public final byte[] A() {
        try {
            zzacz zzaczVar = (zzacz) this;
            int k = zzaczVar.k();
            byte[] bArr = new byte[k];
            Logger logger = zzach.b;
            h8n h8nVar = new h8n(bArr, k);
            kcn a = acn.c.a(zzaczVar.getClass());
            e3c e3cVar = h8nVar.a;
            if (e3cVar == null) {
                e3cVar = new e3c(h8nVar);
            }
            a.e(zzaczVar, e3cVar);
            if (h8nVar.e - h8nVar.f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            vp2.e(lnb.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final r7n a() {
        try {
            zzacz zzaczVar = (zzacz) this;
            int k = zzaczVar.k();
            r7n r7nVar = zzaby.b;
            byte[] bArr = new byte[k];
            Logger logger = zzach.b;
            h8n h8nVar = new h8n(bArr, k);
            kcn a = acn.c.a(zzaczVar.getClass());
            e3c e3cVar = h8nVar.a;
            if (e3cVar == null) {
                e3cVar = new e3c(h8nVar);
            }
            a.e(zzaczVar, e3cVar);
            if (h8nVar.e - h8nVar.f == 0) {
                return new r7n(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            vp2.e(lnb.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public int b() {
        throw null;
    }

    public void c(int i) {
        throw null;
    }
}
