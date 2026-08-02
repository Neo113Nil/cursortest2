package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.A;
import db.C4049a;
import db.C4050b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class y extends AbstractC3447b {

    /* renamed from: a, reason: collision with root package name */
    public final A f37007a;

    /* renamed from: b, reason: collision with root package name */
    public final C4050b f37008b;

    /* renamed from: c, reason: collision with root package name */
    public final C4049a f37009c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f37010d;

    public y(A a10, C4050b c4050b, C4049a c4049a, Integer num) {
        this.f37007a = a10;
        this.f37008b = c4050b;
        this.f37009c = c4049a;
        this.f37010d = num;
    }

    public static y a(A.a aVar, C4050b c4050b, Integer num) {
        A.a aVar2 = A.a.f36884d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c4050b.b() == 32) {
            A a10 = A.a(aVar);
            return new y(a10, c4050b, b(a10, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c4050b.b());
    }

    public static C4049a b(A a10, Integer num) {
        if (a10.b() == A.a.f36884d) {
            return C4049a.a(new byte[0]);
        }
        if (a10.b() == A.a.f36883c) {
            return C4049a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (a10.b() == A.a.f36882b) {
            return C4049a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + a10.b());
    }
}
