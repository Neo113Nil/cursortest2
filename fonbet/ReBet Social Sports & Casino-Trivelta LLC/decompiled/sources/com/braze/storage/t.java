package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.bg;
import bo.app.cg;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final TriggerDataStoreProvider$Companion f29457d = new TriggerDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29458a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29459b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29458a = str;
        this.f29459b = apiKey;
        this.f29460c = LazyKt.lazy(new Function0() { // from class: X3.R0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.t.a(context, this);
            }
        });
    }

    public static final String a(Context context, t tVar) {
        return StringUtils.getCacheFileSuffix(context, tVar.f29458a, tVar.f29459b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        Context context = getContext();
        String str = "com.appboy.storage.triggers.actions" + ((String) this.f29460c.getValue());
        TriggerDataStoreProvider$Companion triggerDataStoreProvider$Companion = f29457d;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{new K0.a(context, str, null, null, new bg(triggerDataStoreProvider$Companion), 12, null), new K0.a(getContext(), "com.appboy.storage.triggers.re_eligibility" + ((String) this.f29460c.getValue()), null, null, new cg(triggerDataStoreProvider$Companion), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.triggers." + ((String) this.f29460c.getValue());
    }
}
