package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0135a;
import java.io.IOException;
import java.util.logging.Logger;
import xsna.ka20;
import xsna.na20;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0135a<MessageType, BuilderType>> implements ka20 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0135a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0135a<MessageType, BuilderType>> implements na20, Cloneable {
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void d(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.ka20
    public final byte[] toByteArray() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int serializedSize = generatedMessageLite.getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.b;
            CodedOutputStream.a aVar = new CodedOutputStream.a(bArr, serializedSize);
            generatedMessageLite.f(aVar);
            if (aVar.J() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(c("byte array"), e);
        }
    }

    @Override // xsna.ka20
    public final ByteString.g toByteString() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int serializedSize = generatedMessageLite.getSerializedSize();
            ByteString.g gVar = ByteString.b;
            ByteString.e eVar = new ByteString.e(serializedSize);
            generatedMessageLite.f(eVar.b());
            return eVar.a();
        } catch (IOException e) {
            throw new RuntimeException(c("ByteString"), e);
        }
    }
}
