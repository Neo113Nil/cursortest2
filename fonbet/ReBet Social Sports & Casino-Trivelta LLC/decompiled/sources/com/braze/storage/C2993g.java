package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.n7;
import com.braze.storage.C2993g;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.braze.storage.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2993g extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final EventDuplicationValidatorDataStoreProvider$Companion f29421d = new EventDuplicationValidatorDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29422a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29423b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2993g(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29422a = str;
        this.f29423b = apiKey;
        this.f29424c = LazyKt.lazy(new Function0() { // from class: X3.J0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2993g.a(context, this);
            }
        });
    }

    public static final String a(Context context, C2993g c2993g) {
        return StringUtils.getCacheFileSuffix(context, c2993g.f29422a, c2993g.f29423b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new K0.a(getContext(), "com.appboy.storage.event_data_validator" + ((String) this.f29424c.getValue()), null, null, new n7(f29421d), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.storage.event_data_validator" + ((String) this.f29424c.getValue());
    }
}
