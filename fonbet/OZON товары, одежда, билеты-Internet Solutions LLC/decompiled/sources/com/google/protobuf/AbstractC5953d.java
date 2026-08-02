package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5953d {
    public abstract void write(byte b11) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i11, int i12) throws IOException;
}
