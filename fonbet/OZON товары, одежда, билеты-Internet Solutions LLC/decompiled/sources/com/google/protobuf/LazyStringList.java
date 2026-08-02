package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* loaded from: classes9.dex */
public interface LazyStringList extends List {
    void add(ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends ByteString> collection);

    List<byte[]> asByteArrayList();

    List asByteStringList();

    byte[] getByteArray(int i11);

    ByteString getByteString(int i11);

    Object getRaw(int i11);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList lazyStringList);

    void set(int i11, ByteString byteString);

    void set(int i11, byte[] bArr);
}
