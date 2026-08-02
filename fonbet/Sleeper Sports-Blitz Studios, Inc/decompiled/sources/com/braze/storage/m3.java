package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import com.braze.support.StringUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class m3 extends DataStoreProvider {
    public static final TriggerDataStoreProvider$Companion d = new TriggerDataStoreProvider$Companion(null);
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f731a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f731a = str;
        this.b = apiKey;
        this.c = LazyKt.lazy(new Function0() { // from class: com.braze.storage.m3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m3.a(context, this);
            }
        });
    }

    public static final String a(Context context, m3 m3Var) {
        return StringUtils.getCacheFileSuffix(context, m3Var.f731a, m3Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        Context context = getContext();
        String str = "com.appboy.storage.triggers.actions" + ((String) this.c.getValue());
        TriggerDataStoreProvider$Companion triggerDataStoreProvider$Companion = d;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{new SharedPreferencesMigration(context, str, null, null, new k3(triggerDataStoreProvider$Companion), 12, null), new SharedPreferencesMigration(getContext(), "com.appboy.storage.triggers.re_eligibility" + ((String) this.c.getValue()), null, null, new l3(triggerDataStoreProvider$Companion), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.triggers." + ((String) this.c.getValue());
    }
}
