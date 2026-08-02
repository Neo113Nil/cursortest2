package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import xsna.fvk;
import xsna.gvk;
import xsna.ha40;
import xsna.iia0;
import xsna.ovj;
import xsna.whn0;
import xsna.x0g0;
import xsna.zvj;

/* compiled from: UniversalRequestDataStoreProvider.kt */
/* loaded from: classes14.dex */
public final class UniversalRequestDataStoreProvider {
    private fvk<UniversalRequestStoreOuterClass.UniversalRequestStore> cachedDataStore;
    private final Context context;
    private final ovj dispatcher;

    public UniversalRequestDataStoreProvider(Context context, ovj ovjVar) {
        this.context = context;
        this.dispatcher = ovjVar;
    }

    private final fvk<UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore() {
        return gvk.a(new UniversalRequestStoreSerializer(), new x0g0(new ha40(18)), null, zvj.a(this.dispatcher.plus(whn0.a())), new iia0(this, 28), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore createDataStore$lambda$2(CorruptionException corruptionException) {
        return new UniversalRequestStoreSerializer().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createDataStore$lambda$3(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        return ContextExtensionsKt.unityAdsDataStoreFile(universalRequestDataStoreProvider.context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
    }

    public final Context getContext() {
        return this.context;
    }

    public final ovj getDispatcher() {
        return this.dispatcher;
    }

    public final fvk<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
        synchronized (this) {
            fvk<UniversalRequestStoreOuterClass.UniversalRequestStore> fvkVar = this.cachedDataStore;
            if (fvkVar != null) {
                return fvkVar;
            }
            fvk<UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore = createDataStore();
            this.cachedDataStore = createDataStore;
            return createDataStore;
        }
    }
}
