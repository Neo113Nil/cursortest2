package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.c8;
import bo.app.d8;
import com.braze.enums.DataStoreKey;
import com.braze.storage.C2994h;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.braze.storage.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2994h extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final FeatureFlagsDataStoreProvider$Companion f29425d = new FeatureFlagsDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29427b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2994h(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29426a = str;
        this.f29427b = apiKey;
        this.f29428c = LazyKt.lazy(new Function0() { // from class: X3.K0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2994h.a(context, this);
            }
        });
    }

    public static final String a(Context context, C2994h c2994h) {
        return StringUtils.getCacheFileSuffix(context, c2994h.f29426a, c2994h.f29427b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        K0.a a10 = androidx.datastore.preferences.i.a(getContext(), "com.braze.managers.featureflags.eligibility" + ((String) this.f29428c.getValue()), SetsKt.setOf(DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String str = "com.braze.managers.featureflags.storage" + ((String) this.f29428c.getValue());
        FeatureFlagsDataStoreProvider$Companion featureFlagsDataStoreProvider$Companion = f29425d;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{a10, new K0.a(context, str, null, null, new c8(featureFlagsDataStoreProvider$Companion), 12, null), new K0.a(getContext(), "com.braze.managers.featureflags.impressions" + ((String) this.f29428c.getValue()), null, null, new d8(featureFlagsDataStoreProvider$Companion), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.featureflags." + ((String) this.f29428c.getValue());
    }
}
