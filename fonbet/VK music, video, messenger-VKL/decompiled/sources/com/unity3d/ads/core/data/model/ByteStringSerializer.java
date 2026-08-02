package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import java.io.InputStream;
import java.io.OutputStream;
import xsna.qmi0;
import xsna.s3q0;
import xsna.spj;

/* compiled from: ByteStringSerializer.kt */
/* loaded from: classes14.dex */
public final class ByteStringSerializer implements qmi0<ByteStringStoreOuterClass.ByteStringStore> {
    private final ByteStringStoreOuterClass.ByteStringStore defaultValue = ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance();

    @Override // xsna.qmi0
    public Object readFrom(InputStream inputStream, spj<? super ByteStringStoreOuterClass.ByteStringStore> spjVar) {
        try {
            return ByteStringStoreOuterClass.ByteStringStore.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @Override // xsna.qmi0
    public /* bridge */ /* synthetic */ Object writeTo(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OutputStream outputStream, spj spjVar) {
        return writeTo2(byteStringStore, outputStream, (spj<? super s3q0>) spjVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.qmi0
    public ByteStringStoreOuterClass.ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OutputStream outputStream, spj<? super s3q0> spjVar) {
        byteStringStore.writeTo(outputStream);
        return s3q0.a;
    }
}
