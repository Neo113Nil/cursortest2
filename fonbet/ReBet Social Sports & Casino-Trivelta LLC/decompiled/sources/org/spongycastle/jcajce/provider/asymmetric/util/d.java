package org.spongycastle.jcajce.provider.asymmetric.util;

import nj.C5745f;
import org.spongycastle.crypto.g;

/* loaded from: classes5.dex */
public abstract class d {
    public static C5745f a(g gVar, byte[] bArr) {
        if (gVar == null) {
            return new C5745f(null, null, 128);
        }
        org.spongycastle.crypto.e d10 = gVar.d();
        return (d10.getAlgorithmName().equals("DES") || d10.getAlgorithmName().equals("RC2") || d10.getAlgorithmName().equals("RC5-32") || d10.getAlgorithmName().equals("RC5-64")) ? new C5745f(null, null, 64, 64, bArr) : d10.getAlgorithmName().equals("SKIPJACK") ? new C5745f(null, null, 80, 80, bArr) : d10.getAlgorithmName().equals("GOST28147") ? new C5745f(null, null, 256, 256, bArr) : new C5745f(null, null, 128, 128, bArr);
    }
}
