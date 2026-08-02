package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;

/* compiled from: ByteString.java */
/* loaded from: classes13.dex */
public final class f extends ByteString.a {
    public int b = 0;
    public final int c;
    public final /* synthetic */ ByteString d;

    public f(ByteString byteString) {
        this.d = byteString;
        this.c = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
