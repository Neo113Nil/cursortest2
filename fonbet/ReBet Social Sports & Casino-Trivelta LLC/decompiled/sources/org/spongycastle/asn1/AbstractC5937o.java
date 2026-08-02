package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.spongycastle.asn1.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5937o extends AbstractC5940s implements InterfaceC5938p {
    byte[] string;

    public AbstractC5937o(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.string = bArr;
    }

    public static AbstractC5937o k(Object obj) {
        if (obj == null || (obj instanceof AbstractC5937o)) {
            return (AbstractC5937o) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return k(AbstractC5940s.g((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e10.getMessage());
            }
        }
        if (obj instanceof InterfaceC5927e) {
            AbstractC5940s aSN1Primitive = ((InterfaceC5927e) obj).toASN1Primitive();
            if (aSN1Primitive instanceof AbstractC5937o) {
                return (AbstractC5937o) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static AbstractC5937o l(AbstractC5947z abstractC5947z, boolean z10) {
        AbstractC5940s m10 = abstractC5947z.m();
        return (z10 || (m10 instanceof AbstractC5937o)) ? k(m10) : E.o(AbstractC5941t.k(m10));
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof AbstractC5937o) {
            return Aj.a.a(this.string, ((AbstractC5937o) abstractC5940s).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.spongycastle.asn1.InterfaceC5938p
    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return Aj.a.q(m());
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s i() {
        return new Z(this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s j() {
        return new Z(this.string);
    }

    public byte[] m() {
        return this.string;
    }

    public String toString() {
        return "#" + Aj.h.b(org.spongycastle.util.encoders.f.b(this.string));
    }
}
