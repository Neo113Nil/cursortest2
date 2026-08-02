package org.spongycastle.asn1;

import java.io.IOException;

/* renamed from: org.spongycastle.asn1.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5940s extends AbstractC5935m {
    public static AbstractC5940s g(byte[] bArr) {
        C5932j c5932j = new C5932j(bArr);
        try {
            AbstractC5940s D02 = c5932j.D0();
            if (c5932j.available() == 0) {
                return D02;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract boolean c(AbstractC5940s abstractC5940s);

    public abstract void e(C5939q c5939q);

    @Override // org.spongycastle.asn1.AbstractC5935m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5927e) && c(((InterfaceC5927e) obj).toASN1Primitive());
    }

    public abstract int f();

    public abstract boolean h();

    @Override // org.spongycastle.asn1.AbstractC5935m
    public abstract int hashCode();

    public AbstractC5940s i() {
        return this;
    }

    public AbstractC5940s j() {
        return this;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this;
    }
}
