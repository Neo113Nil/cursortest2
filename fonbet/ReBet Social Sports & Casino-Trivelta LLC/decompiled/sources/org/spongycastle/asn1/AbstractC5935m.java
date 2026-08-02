package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: org.spongycastle.asn1.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5935m implements InterfaceC5927e {
    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C5939q(byteArrayOutputStream).j(this);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] b(String str) {
        if (str.equals(ASN1Encoding.DER)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new b0(byteArrayOutputStream).j(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (!str.equals(ASN1Encoding.DL)) {
            return a();
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        new o0(byteArrayOutputStream2).j(this);
        return byteArrayOutputStream2.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC5927e) {
            return toASN1Primitive().equals(((InterfaceC5927e) obj).toASN1Primitive());
        }
        return false;
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    @Override // org.spongycastle.asn1.InterfaceC5927e
    public abstract AbstractC5940s toASN1Primitive();
}
