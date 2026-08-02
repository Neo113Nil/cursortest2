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
public final class m extends DataStoreProvider {
    public static final ContentCardsDataStoreProvider$Companion d = new ContentCardsDataStoreProvider$Companion(null);
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f728a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f728a = str;
        this.b = apiKey;
        this.c = LazyKt.lazy(new Function0() { // from class: com.braze.storage.m$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.a(context, this);
            }
        });
    }

    public static final String a(Context context, m mVar) {
        return StringUtils.getCacheFileSuffix(context, mVar.f728a, mVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        Context context = getContext();
        String str = "com.appboy.storage.content_cards_storage_provider.cards" + ((String) this.c.getValue());
        ContentCardsDataStoreProvider$Companion contentCardsDataStoreProvider$Companion = d;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{new SharedPreferencesMigration(context, str, null, null, new k(contentCardsDataStoreProvider$Companion), 12, null), new SharedPreferencesMigration(getContext(), "com.braze.storage.content_cards_storage_provider.metadata" + ((String) this.c.getValue()), null, null, new l(contentCardsDataStoreProvider$Companion), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.contentcards." + ((String) this.c.getValue());
    }
}
