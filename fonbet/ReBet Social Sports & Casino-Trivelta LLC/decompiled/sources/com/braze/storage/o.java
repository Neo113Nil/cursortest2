package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.je;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final SdkMetadataDataStoreProvider$Companion f29446d = new SdkMetadataDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29448b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29447a = str;
        this.f29448b = apiKey;
        this.f29449c = LazyKt.lazy(new Function0() { // from class: X3.P0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.o.a(context, this);
            }
        });
    }

    public static final String a(Context context, o oVar) {
        return StringUtils.getCacheFileSuffix(context, oVar.f29447a, oVar.f29448b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new K0.a(getContext(), "com.braze.storage.sdk_metadata_cache" + ((String) this.f29449c.getValue()), null, null, new je(f29446d), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.sdk_metadata" + ((String) this.f29449c.getValue());
    }
}
