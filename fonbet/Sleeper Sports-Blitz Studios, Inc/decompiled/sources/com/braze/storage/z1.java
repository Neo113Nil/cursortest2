package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class z1 extends DataStoreProvider {
    public static final FeatureFlagsDataStoreProvider$Companion d = new FeatureFlagsDataStoreProvider$Companion(null);
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f771a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f771a = str;
        this.b = apiKey;
        this.c = LazyKt.lazy(new Function0() { // from class: com.braze.storage.z1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z1.a(context, this);
            }
        });
    }

    public static final String a(Context context, z1 z1Var) {
        return StringUtils.getCacheFileSuffix(context, z1Var.f771a, z1Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        SharedPreferencesMigration<Preferences> SharedPreferencesMigration = SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.braze.managers.featureflags.eligibility" + ((String) this.c.getValue()), SetsKt.setOf(DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String str = "com.braze.managers.featureflags.storage" + ((String) this.c.getValue());
        FeatureFlagsDataStoreProvider$Companion featureFlagsDataStoreProvider$Companion = d;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigration, new SharedPreferencesMigration(context, str, null, null, new x1(featureFlagsDataStoreProvider$Companion), 12, null), new SharedPreferencesMigration(getContext(), "com.braze.managers.featureflags.impressions" + ((String) this.c.getValue()), null, null, new y1(featureFlagsDataStoreProvider$Companion), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.featureflags." + ((String) this.c.getValue());
    }
}
