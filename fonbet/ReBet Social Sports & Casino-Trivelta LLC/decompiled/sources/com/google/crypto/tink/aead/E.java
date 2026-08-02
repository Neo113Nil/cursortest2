package com.google.crypto.tink.aead;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class E implements com.google.crypto.tink.a {
    private static final byte[] EMPTY_AAD = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.proto.A f36892a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.crypto.tink.a f36893b;

    public E(com.google.crypto.tink.proto.A a10, com.google.crypto.tink.a aVar) {
        this.f36892a = a10;
        this.f36893b = aVar;
    }

    @Override // com.google.crypto.tink.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = com.google.crypto.tink.x.j(this.f36892a).toByteArray();
        return c(this.f36893b.a(byteArray, EMPTY_AAD), ((com.google.crypto.tink.a) com.google.crypto.tink.x.g(this.f36892a.U(), byteArray, com.google.crypto.tink.a.class)).a(bArr, bArr2));
    }

    @Override // com.google.crypto.tink.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((com.google.crypto.tink.a) com.google.crypto.tink.x.g(this.f36892a.U(), this.f36893b.b(bArr3, EMPTY_AAD), com.google.crypto.tink.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}
