package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5895a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5895a.AbstractC0905a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5906l;
import com.google.crypto.tink.shaded.protobuf.S;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5895a<MessageType extends AbstractC5895a<MessageType, BuilderType>, BuilderType extends AbstractC0905a<MessageType, BuilderType>> implements S {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0905a<MessageType extends AbstractC5895a<MessageType, BuilderType>, BuilderType extends AbstractC0905a<MessageType, BuilderType>> implements S.a {
    }

    private String d(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int b() {
        throw new UnsupportedOperationException();
    }

    int c(f0 f0Var) {
        int b11 = b();
        if (b11 != -1) {
            return b11;
        }
        int e11 = f0Var.e(this);
        e(e11);
        return e11;
    }

    void e(int i11) {
        throw new UnsupportedOperationException();
    }

    public final byte[] f() {
        try {
            int c11 = ((AbstractC5917x) this).c(null);
            byte[] bArr = new byte[c11];
            int i11 = AbstractC5906l.f59429d;
            AbstractC5906l.a aVar = new AbstractC5906l.a(c11, bArr);
            ((AbstractC5917x) this).a(aVar);
            if (aVar.m() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e11) {
            throw new RuntimeException(d("byte array"), e11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final AbstractC5903i toByteString() {
        try {
            int c11 = ((AbstractC5917x) this).c(null);
            AbstractC5903i abstractC5903i = AbstractC5903i.f59377b;
            AbstractC5903i.e eVar = new AbstractC5903i.e(c11);
            ((AbstractC5917x) this).a(eVar.b());
            return eVar.a();
        } catch (IOException e11) {
            throw new RuntimeException(d("ByteString"), e11);
        }
    }
}
