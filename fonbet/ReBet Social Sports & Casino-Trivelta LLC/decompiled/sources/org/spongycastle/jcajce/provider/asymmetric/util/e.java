package org.spongycastle.jcajce.provider.asymmetric.util;

import Li.g;
import Qi.u;
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.InterfaceC5927e;

/* loaded from: classes5.dex */
public abstract class e {
    public static byte[] a(g gVar) {
        try {
            return gVar.b(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(Qi.a aVar, InterfaceC5927e interfaceC5927e) {
        try {
            return a(new g(aVar, interfaceC5927e.toASN1Primitive()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] c(Qi.a aVar, InterfaceC5927e interfaceC5927e) {
        try {
            return d(new u(aVar, interfaceC5927e));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(u uVar) {
        try {
            return uVar.b(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }
}
