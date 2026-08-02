package com.google.android.gms.internal.ads;

import defpackage.wgo;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgs {
    public final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r9.h(8) == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgs(zzgw zzgwVar, zzgv zzgvVar) {
        int i = zzgvVar.a;
        ByteBuffer byteBuffer = zzgvVar.b;
        boolean z = false;
        zzguk.a(i == 6 || i == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, min);
        if (zzgwVar.a) {
            throw new wgo();
        }
        if (!zzetVar.g()) {
            int h = zzetVar.h(2);
            boolean g = zzetVar.g();
            if (zzgwVar.b) {
                throw new wgo();
            }
            if (g) {
                boolean g2 = (h == 3 || h == 0) ? true : zzetVar.g();
                zzetVar.e();
                if (!zzgwVar.d) {
                    throw new wgo();
                }
                if (zzetVar.g()) {
                    if (!zzgwVar.e) {
                        throw new wgo();
                    }
                    zzetVar.e();
                }
                if (zzgwVar.c) {
                    throw new wgo();
                }
                if (h != 3) {
                    zzetVar.e();
                }
                zzetVar.f(zzgwVar.f);
                if (h != 2 && h != 0 && !g2) {
                    zzetVar.f(3);
                }
                if (h != 3) {
                    if (h != 0) {
                    }
                }
            }
            z = true;
        }
        this.a = z;
    }
}
