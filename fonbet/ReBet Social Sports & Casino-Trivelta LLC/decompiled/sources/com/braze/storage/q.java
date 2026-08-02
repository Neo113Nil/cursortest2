package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.df;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final SessionStorageDataStoreProvider$Companion f29452d = new SessionStorageDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29453a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29454b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29453a = str;
        this.f29454b = apiKey;
        this.f29455c = LazyKt.lazy(new Function0() { // from class: X3.Q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.q.a(context, this);
            }
        });
    }

    public static final String a(Context context, q qVar) {
        return StringUtils.getCacheFileSuffix(context, qVar.f29453a, qVar.f29454b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{androidx.datastore.preferences.i.a(getContext(), "com.appboy.storage.session_storage" + ((String) this.f29455c.getValue()), SetsKt.setOf(DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey())), new K0.a(getContext(), "com.appboy.storage.session_storage" + ((String) this.f29455c.getValue()), null, null, new df(f29452d), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.session_storage" + ((String) this.f29455c.getValue());
    }
}
