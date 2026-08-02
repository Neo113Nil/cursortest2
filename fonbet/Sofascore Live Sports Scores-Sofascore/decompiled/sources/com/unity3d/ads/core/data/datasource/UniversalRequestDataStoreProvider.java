package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.au3;
import defpackage.e3c;
import defpackage.f8h;
import defpackage.s9a;
import defpackage.sbk;
import defpackage.tz9;
import defpackage.uu3;
import defpackage.w1i;
import defpackage.ye4;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "", "Landroid/content/Context;", "context", "Lau3;", "dispatcher", "<init>", "(Landroid/content/Context;Lau3;)V", "Lye4;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "createDataStore", "()Lye4;", "invoke", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lau3;", "getDispatcher", "()Lau3;", "cachedDataStore", "Lye4;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UniversalRequestDataStoreProvider {

    @Nullable
    private ye4 cachedDataStore;

    @NotNull
    private final Context context;

    @NotNull
    private final au3 dispatcher;

    public UniversalRequestDataStoreProvider(@NotNull Context context, @NotNull au3 au3Var) {
        context.getClass();
        au3Var.getClass();
        this.context = context;
        this.dispatcher = au3Var;
    }

    private final ye4 createDataStore() {
        return f8h.k(new UniversalRequestStoreSerializer(), new e3c(new sbk(0), 10), null, s9a.c(this.dispatcher.plus(tz9.o())), new w1i(this, 29), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore createDataStore$lambda$2(uu3 uu3Var) {
        uu3Var.getClass();
        return new UniversalRequestStoreSerializer().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createDataStore$lambda$3(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        return ContextExtensionsKt.unityAdsDataStoreFile(universalRequestDataStoreProvider.context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final au3 getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final ye4 invoke() {
        synchronized (this) {
            ye4 ye4Var = this.cachedDataStore;
            if (ye4Var != null) {
                return ye4Var;
            }
            ye4 createDataStore = createDataStore();
            this.cachedDataStore = createDataStore;
            return createDataStore;
        }
    }
}
