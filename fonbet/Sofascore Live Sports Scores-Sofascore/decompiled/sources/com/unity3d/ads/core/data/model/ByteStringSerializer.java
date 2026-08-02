package com.unity3d.ads.core.data.model;

import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import defpackage.c6h;
import defpackage.rq3;
import defpackage.uu3;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/model/ByteStringSerializer;", "Lc6h;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lrq3;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "writeTo", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Ljava/io/OutputStream;Lrq3;)Ljava/lang/Object;", "defaultValue", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "getDefaultValue", "()Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteStringSerializer implements c6h {

    @NotNull
    private final ByteStringStoreOuterClass.ByteStringStore defaultValue;

    public ByteStringSerializer() {
        ByteStringStoreOuterClass.ByteStringStore defaultInstance = ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance();
        defaultInstance.getClass();
        this.defaultValue = defaultInstance;
    }

    @Override // defpackage.c6h
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull rq3<? super ByteStringStoreOuterClass.ByteStringStore> rq3Var) {
        try {
            ByteStringStoreOuterClass.ByteStringStore parseFrom = ByteStringStoreOuterClass.ByteStringStore.parseFrom(inputStream);
            parseFrom.getClass();
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new uu3("Cannot read proto.", e);
        }
    }

    @Override // defpackage.c6h
    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, rq3 rq3Var) {
        return writeTo((ByteStringStoreOuterClass.ByteStringStore) obj, outputStream, (rq3<? super Unit>) rq3Var);
    }

    @Override // defpackage.c6h
    @NotNull
    public ByteStringStoreOuterClass.ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    @Nullable
    public Object writeTo(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull OutputStream outputStream, @NotNull rq3<? super Unit> rq3Var) {
        byteStringStore.writeTo(outputStream);
        return Unit.a;
    }
}
