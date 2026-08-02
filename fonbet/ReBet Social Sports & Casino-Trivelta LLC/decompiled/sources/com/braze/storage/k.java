package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.jc;
import bo.app.kc;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final jc f29434d = new jc();

    /* renamed from: a, reason: collision with root package name */
    public final String f29435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29436b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(final Context context, String str, String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29435a = str;
        this.f29436b = str2;
        this.f29437c = LazyKt.lazy(new Function0() { // from class: X3.M0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.k.a(context, this);
            }
        });
    }

    public static final String a(Context context, k kVar) {
        return StringUtils.getCacheFileSuffix(context, kVar.f29435a, kVar.f29436b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new K0.a(getContext(), "com.braze.storage.push_identifier_storage" + ((String) this.f29437c.getValue()), null, null, new kc(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_identifier" + ((String) this.f29437c.getValue());
    }
}
