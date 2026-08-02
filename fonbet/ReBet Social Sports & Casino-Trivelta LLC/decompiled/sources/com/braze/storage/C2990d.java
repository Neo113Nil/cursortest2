package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.C2990d;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.braze.storage.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2990d extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f29414a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29415b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29416c;

    static {
        new DustDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2990d(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29414a = str;
        this.f29415b = apiKey;
        this.f29416c = LazyKt.lazy(new Function0() { // from class: X3.H0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2990d.a(context, this);
            }
        });
    }

    public static final String a(Context context, C2990d c2990d) {
        return StringUtils.getCacheFileSuffix(context, c2990d.f29414a, c2990d.f29415b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(androidx.datastore.preferences.i.a(getContext(), "com.braze.managers.dust.metadata" + ((String) this.f29416c.getValue()), SetsKt.setOf(DataStoreKey.MITE_KEY.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.dust" + ((String) this.f29416c.getValue());
    }
}
