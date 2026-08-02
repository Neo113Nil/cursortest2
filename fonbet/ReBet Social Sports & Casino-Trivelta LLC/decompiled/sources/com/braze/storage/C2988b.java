package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.s3;
import bo.app.t3;
import com.braze.storage.C2988b;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.braze.storage.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2988b extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final ContentCardsDataStoreProvider$Companion f29408d = new ContentCardsDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29409a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29410b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2988b(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29409a = str;
        this.f29410b = apiKey;
        this.f29411c = LazyKt.lazy(new Function0() { // from class: X3.G0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2988b.a(context, this);
            }
        });
    }

    public static final String a(Context context, C2988b c2988b) {
        return StringUtils.getCacheFileSuffix(context, c2988b.f29409a, c2988b.f29410b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        Context context = getContext();
        String str = "com.appboy.storage.content_cards_storage_provider.cards" + ((String) this.f29411c.getValue());
        ContentCardsDataStoreProvider$Companion contentCardsDataStoreProvider$Companion = f29408d;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{new K0.a(context, str, null, null, new s3(contentCardsDataStoreProvider$Companion), 12, null), new K0.a(getContext(), "com.braze.storage.content_cards_storage_provider.metadata" + ((String) this.f29411c.getValue()), null, null, new t3(contentCardsDataStoreProvider$Companion), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.contentcards." + ((String) this.f29411c.getValue());
    }
}
