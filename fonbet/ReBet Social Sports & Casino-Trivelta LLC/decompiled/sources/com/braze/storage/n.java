package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f29443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29444b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29445c;

    static {
        new SdkAuthenticationDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29443a = str;
        this.f29444b = apiKey;
        this.f29445c = LazyKt.lazy(new Function0() { // from class: X3.O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.n.a(context, this);
            }
        });
    }

    public static final String a(Context context, n nVar) {
        return StringUtils.getCacheFileSuffix(context, nVar.f29443a, nVar.f29444b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(androidx.datastore.preferences.i.a(getContext(), "com.braze.storage.sdk_auth_cache" + ((String) this.f29445c.getValue()), SetsKt.setOf(DataStoreKey.SDK_AUTH.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.sdk_auth" + ((String) this.f29445c.getValue());
    }
}
