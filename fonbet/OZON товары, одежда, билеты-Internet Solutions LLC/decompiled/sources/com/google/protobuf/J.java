package com.google.protobuf;

import com.google.protobuf.C5951b;
import java.io.IOException;

/* loaded from: classes.dex */
interface J<T> {
    boolean equals(T t2, T t11);

    int getSerializedSize(T t2);

    int hashCode(T t2);

    boolean isInitialized(T t2);

    void makeImmutable(T t2);

    void mergeFrom(T t2, I i11, C5957h c5957h) throws IOException;

    void mergeFrom(T t2, T t11);

    void mergeFrom(T t2, byte[] bArr, int i11, int i12, C5951b.C0915b c0915b) throws IOException;

    T newInstance();

    void writeTo(T t2, T t11) throws IOException;
}
