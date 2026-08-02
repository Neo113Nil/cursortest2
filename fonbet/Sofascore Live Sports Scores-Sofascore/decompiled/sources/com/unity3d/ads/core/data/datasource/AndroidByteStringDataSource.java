package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.t98;
import defpackage.ye4;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidByteStringDataSource;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lye4;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "dataStore", "<init>", "(Lye4;)V", "get", "(Lrq3;)Ljava/lang/Object;", "Lcom/google/protobuf/ByteString;", "data", "", "set", "(Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "Lye4;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidByteStringDataSource implements ByteStringDataSource {

    @NotNull
    private final ye4 dataStore;

    public AndroidByteStringDataSource(@NotNull ye4 ye4Var) {
        ye4Var.getClass();
        this.dataStore = ye4Var;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object get(@NotNull rq3<? super ByteStringStoreOuterClass.ByteStringStore> rq3Var) {
        return rd0.y(new t98(this.dataStore.getData(), new AndroidByteStringDataSource$get$2(null), 1), rq3Var);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object set(@NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var) {
        Object a = this.dataStore.a(new AndroidByteStringDataSource$set$2(byteString, null), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }
}
