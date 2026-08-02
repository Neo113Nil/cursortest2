package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.io.InputStream;
import java.io.OutputStream;
import xsna.qmi0;
import xsna.s3q0;
import xsna.spj;

/* compiled from: UniversalRequestStoreSerializer.kt */
/* loaded from: classes14.dex */
public final class UniversalRequestStoreSerializer implements qmi0<UniversalRequestStoreOuterClass.UniversalRequestStore> {
    private final UniversalRequestStoreOuterClass.UniversalRequestStore defaultValue = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();

    @Override // xsna.qmi0
    public Object readFrom(InputStream inputStream, spj<? super UniversalRequestStoreOuterClass.UniversalRequestStore> spjVar) {
        try {
            return UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        } catch (Throwable th) {
            throw new CorruptionException("Error while reading proto file.", th);
        }
    }

    @Override // xsna.qmi0
    public /* bridge */ /* synthetic */ Object writeTo(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OutputStream outputStream, spj spjVar) {
        return writeTo2(universalRequestStore, outputStream, (spj<? super s3q0>) spjVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.qmi0
    public UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OutputStream outputStream, spj<? super s3q0> spjVar) {
        universalRequestStore.writeTo(outputStream);
        return s3q0.a;
    }
}
