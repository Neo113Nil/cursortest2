package com.braze.storage;

import I0.InterfaceC1344i;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.models.BannerPendingDismissal;
import com.braze.storage.C2987a;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.StringUtils;
import di.C4087f;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* renamed from: com.braze.storage.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2987a extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final BannersDataStoreProvider$Companion f29404d = new BannersDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29405a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29406b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2987a(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29405a = str;
        this.f29406b = apiKey;
        this.f29407c = LazyKt.lazy(new Function0() { // from class: X3.F0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2987a.a(context, this);
            }
        });
    }

    public static final String a(Context context, C2987a c2987a) {
        return StringUtils.getCacheFileSuffix(context, c2987a.f29405a, c2987a.f29406b);
    }

    public final List b() {
        List emptyList;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_PENDING_DISMISSALS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            return new ArrayList();
        }
        try {
            Object readData = readData(dataStoreKey, "");
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
            String str = (String) readData;
            if (StringsKt.isBlank(str)) {
                return new ArrayList();
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            if (StringsKt.isBlank(str)) {
                emptyList = CollectionsKt.emptyList();
            } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                emptyList = CollectionsKt.emptyList();
            } else {
                try {
                    AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                    aVar.a();
                    emptyList = (List) aVar.d(new C4087f(BannerPendingDismissal.Companion.serializer()), str);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                    emptyList = CollectionsKt.emptyList();
                }
            }
            return CollectionsKt.toMutableList((Collection) emptyList);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
            return new ArrayList();
        }
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        K0.a a10 = androidx.datastore.preferences.i.a(getContext(), "com.braze.managers.banners.eligibility" + ((String) this.f29407c.getValue()), SetsKt.setOf(DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String str = "com.braze.managers.banners.storage" + ((String) this.f29407c.getValue());
        BannersDataStoreProvider$Companion bannersDataStoreProvider$Companion = f29404d;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{a10, new K0.a(context, str, null, null, new bo.app.r(bannersDataStoreProvider$Companion), 12, null), new K0.a(getContext(), "com.braze.managers.banners.impressions" + ((String) this.f29407c.getValue()), null, null, new bo.app.s(bannersDataStoreProvider$Companion), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.banners" + ((String) this.f29407c.getValue());
    }

    public final void a(List list) {
        String str;
        Intrinsics.checkNotNullParameter(list, "list");
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_PENDING_DISMISSALS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(BannerPendingDismissal.Companion.serializer()), list);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = list instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            writeData(dataStoreKey, str);
        } catch (Exception e12) {
            e = e12;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final Map a() {
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        InterfaceC1901b k10;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object readData = readData(dataStoreKey, "");
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
            String str = (String) readData;
            if (StringsKt.isBlank(str)) {
                return new LinkedHashMap();
            }
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            if (StringsKt.isBlank(str)) {
                emptyMap = MapsKt.emptyMap();
            } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                emptyMap = MapsKt.emptyMap();
            } else {
                try {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
                    try {
                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            k10 = AbstractC2028a.k(AbstractC2028a.H(stringCompanionObject), AbstractC2028a.H(stringCompanionObject));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.F(LongCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.E(IntCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                            k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.D(FloatCompanionObject.INSTANCE));
                        } else {
                            dataStoreUtils = dataStoreUtils2;
                            try {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) bo.app.t.f26064a, 6, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            } catch (Exception e10) {
                                e = e10;
                                exc = e;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                                Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                return TypeIntrinsics.asMutableMap(mutableMap);
                            }
                        }
                        Object d10 = AbstractC4212b.f46079d.d(k10, str);
                        Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                        emptyMap = (Map) d10;
                    } catch (Exception e11) {
                        exc = e11;
                        dataStoreUtils = dataStoreUtils2;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                        emptyMap = MapsKt.emptyMap();
                        Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                        Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        return TypeIntrinsics.asMutableMap(mutableMap2);
                    }
                } catch (Exception e12) {
                    e = e12;
                    dataStoreUtils = dataStoreUtils2;
                }
            }
            Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
            Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
            return TypeIntrinsics.asMutableMap(mutableMap22);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }
}
