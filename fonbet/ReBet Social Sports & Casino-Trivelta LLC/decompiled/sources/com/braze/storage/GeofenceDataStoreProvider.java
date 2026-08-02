package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.o8;
import bo.app.p8;
import bo.app.q8;
import bo.app.r8;
import com.braze.enums.DataStoreKey;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/braze/storage/GeofenceDataStoreProvider;", "Lcom/braze/storage/DataStoreProvider;", "Landroid/content/Context;", "context", "", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getDataStoreFileName", "()Ljava/lang/String;", "LI0/i;", "LL0/f;", "getDataStore", "()LI0/i;", "Ljava/lang/String;", "getApiKey", "Companion", "bo/app/o8", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GeofenceDataStoreProvider extends DataStoreProvider {
    public static final o8 Companion = new o8();
    private final String apiKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceDataStoreProvider(Context context, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.apiKey = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateGeofencesListToJson(o8 o8Var, K0.c sharedPrefs, L0.f currentData, Continuation continuation) {
        o8Var.getClass();
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        return o8Var.a(sharedPrefs, currentData, DataStoreKey.GEOFENCES.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getDataStore$migrateIndividualReeligibilityMapToJson(o8 o8Var, K0.c cVar, L0.f fVar, Continuation continuation) {
        return o8Var.a(cVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateRegisteredGeofencesListToJson(o8 o8Var, K0.c sharedPrefs, L0.f currentData, Continuation continuation) {
        o8Var.getClass();
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        return o8Var.a(sharedPrefs, currentData, DataStoreKey.REGISTERED_GEOFENCES.getKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.braze.storage.DataStoreProvider
    public InterfaceC1344i getDataStore() {
        K0.a a10 = androidx.datastore.preferences.i.a(getContext(), "com.appboy.managers.geofences.eligibility.global." + this.apiKey, SetsKt.setOf((Object[]) new String[]{DataStoreKey.GLOBAL_LAST_REPORT.getKey(), DataStoreKey.GLOBAL_LAST_REQUEST.getKey()}));
        Context context = getContext();
        String str = "com.appboy.managers.geofences.eligibility.individual." + this.apiKey;
        o8 o8Var = Companion;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{a10, new K0.a(context, str, null, null, new p8(o8Var), 12, null), new K0.a(getContext(), "com.appboy.managers.geofences.storage." + this.apiKey, null, null, new q8(o8Var), 12, null), new K0.a(getContext(), "com.appboy.support.geofences", 0 == true ? 1 : 0, null, new r8(o8Var), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public String getDataStoreFileName() {
        return "com.braze.geofences." + this.apiKey;
    }
}
