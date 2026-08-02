package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.Result;
import xsna.s3q0;
import xsna.spj;
import xsna.zcl;

/* compiled from: AndroidLegacyConfigStoreDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";
    private final StorageManager storageManager;

    /* compiled from: AndroidLegacyConfigStoreDataSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidLegacyConfigStoreDataSource(StorageManager storageManager) {
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(spj<? super ByteStringStoreOuterClass.ByteStringStore> spjVar) {
        Object obj;
        Object obj2;
        Object obj3 = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str != null) {
            try {
                obj = ProtobufExtensionsKt.fromBase64(str, true);
            } catch (Throwable th) {
                obj2 = new Result.Failure(th);
            }
        } else {
            obj = null;
        }
        obj2 = obj;
        ByteString byteString = (ByteString) (obj2 instanceof Result.Failure ? null : obj2);
        ByteStringStoreKt.Dsl _create = ByteStringStoreKt.Dsl.Companion._create(ByteStringStoreOuterClass.ByteStringStore.newBuilder());
        if (byteString == null) {
            byteString = ByteString.EMPTY;
        }
        _create.setData(byteString);
        return _create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, spj<? super s3q0> spjVar) {
        Storage storage = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return s3q0.a;
    }
}
