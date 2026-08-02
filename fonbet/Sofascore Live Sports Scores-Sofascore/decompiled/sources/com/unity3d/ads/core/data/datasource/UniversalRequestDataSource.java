package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.ironsource.U3;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.t98;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "universalRequestStoreProvider", "<init>", "(Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;)V", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "get", "(Lrq3;)Ljava/lang/Object;", "", U3.i.W, "Lcom/google/protobuf/ByteString;", "data", "", "set", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "remove", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UniversalRequestDataSource {

    @NotNull
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    public UniversalRequestDataSource(@NotNull UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        universalRequestDataStoreProvider.getClass();
        this.universalRequestStoreProvider = universalRequestDataStoreProvider;
    }

    @Nullable
    public final Object get(@NotNull rq3<? super UniversalRequestStoreOuterClass.UniversalRequestStore> rq3Var) {
        return rd0.y(new t98(this.universalRequestStoreProvider.invoke().getData(), new UniversalRequestDataSource$get$2(null), 1), rq3Var);
    }

    @Nullable
    public final Object remove(@NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        Object a = this.universalRequestStoreProvider.invoke().a(new UniversalRequestDataSource$remove$2(str, null), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    @Nullable
    public final Object set(@NotNull String str, @NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var) {
        Object a = this.universalRequestStoreProvider.invoke().a(new UniversalRequestDataSource$set$2(str, byteString, null), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }
}
