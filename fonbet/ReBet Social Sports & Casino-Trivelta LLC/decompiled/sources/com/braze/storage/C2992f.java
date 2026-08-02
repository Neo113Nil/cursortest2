package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.g7;
import bo.app.h7;
import com.braze.storage.C2992f;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.braze.storage.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2992f extends DataStoreProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final g7 f29419b = new g7();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f29420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2992f(final Context context, final String str, final String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29420a = LazyKt.lazy(new Function0() { // from class: X3.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2992f.a(context, str, str2);
            }
        });
    }

    public static final String a(Context context, String str, String str2) {
        return StringUtils.getCacheFileSuffix(context, str, str2);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new K0.a(getContext(), "com.appboy.storage.appboy_event_storage" + ((String) this.f29420a.getValue()), null, null, new h7(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.events" + ((String) this.f29420a.getValue());
    }
}
