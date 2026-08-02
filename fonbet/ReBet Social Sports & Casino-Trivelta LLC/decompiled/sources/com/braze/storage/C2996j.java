package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.cc;
import com.braze.storage.C2996j;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.braze.storage.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2996j extends DataStoreProvider {

    /* renamed from: c, reason: collision with root package name */
    public static final PushDeliveryDataStoreProvider$Companion f29431c = new PushDeliveryDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29432a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f29433b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2996j(final Context context, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29432a = apiKey;
        this.f29433b = LazyKt.lazy(new Function0() { // from class: X3.L0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2996j.a(context, this);
            }
        });
    }

    public static final String a(Context context, C2996j c2996j) {
        return StringUtils.getCacheFileSuffix(context, null, c2996j.f29432a);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new K0.a(getContext(), "com.braze.storage.braze_push_delivery_storage" + ((String) this.f29433b.getValue()), null, null, new cc(f29431c), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_delivery." + this.f29432a;
    }
}
