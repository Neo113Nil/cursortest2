package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.I;
import db.C4049a;
import db.C4050b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class G extends AbstractC3447b {

    /* renamed from: a, reason: collision with root package name */
    public final I f36895a;

    /* renamed from: b, reason: collision with root package name */
    public final C4050b f36896b;

    /* renamed from: c, reason: collision with root package name */
    public final C4049a f36897c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f36898d;

    public G(I i10, C4050b c4050b, C4049a c4049a, Integer num) {
        this.f36895a = i10;
        this.f36896b = c4050b;
        this.f36897c = c4049a;
        this.f36898d = num;
    }

    public static G a(I.a aVar, C4050b c4050b, Integer num) {
        I.a aVar2 = I.a.f36903d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c4050b.b() == 32) {
            I a10 = I.a(aVar);
            return new G(a10, c4050b, b(a10, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c4050b.b());
    }

    public static C4049a b(I i10, Integer num) {
        if (i10.b() == I.a.f36903d) {
            return C4049a.a(new byte[0]);
        }
        if (i10.b() == I.a.f36902c) {
            return C4049a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (i10.b() == I.a.f36901b) {
            return C4049a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + i10.b());
    }
}
