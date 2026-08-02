package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import java.io.IOException;

/* loaded from: classes.dex */
public interface S extends T {

    public interface a extends T, Cloneable {
        AbstractC5917x buildPartial();
    }

    void a(AbstractC5906l abstractC5906l) throws IOException;

    int getSerializedSize();

    AbstractC5917x.a newBuilderForType();

    AbstractC5903i toByteString();
}
