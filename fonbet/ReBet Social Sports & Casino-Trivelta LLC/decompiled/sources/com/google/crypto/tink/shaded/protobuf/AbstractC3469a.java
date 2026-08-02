package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3469a implements O {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0520a implements O.a {
        public static j0 b(O o10) {
            return new j0(o10);
        }
    }

    public abstract int b(e0 e0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public j0 d() {
        return new j0(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC3479k U10 = AbstractC3479k.U(bArr);
            a(U10);
            U10.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(c("byte array"), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public AbstractC3476h toByteString() {
        try {
            AbstractC3476h.C0521h m10 = AbstractC3476h.m(getSerializedSize());
            a(m10.b());
            return m10.a();
        } catch (IOException e10) {
            throw new RuntimeException(c("ByteString"), e10);
        }
    }
}
