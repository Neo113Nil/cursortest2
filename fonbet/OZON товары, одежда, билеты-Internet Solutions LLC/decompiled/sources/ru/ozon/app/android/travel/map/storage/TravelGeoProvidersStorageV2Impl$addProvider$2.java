package ru.ozon.app.android.travel.map.storage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import we0.m;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorageV2Impl", f = "TravelGeoProvidersStorageV2Impl.kt", l = {67}, m = "addProvider")
/* loaded from: classes2.dex */
final class TravelGeoProvidersStorageV2Impl$addProvider$2 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TravelGeoProvidersStorageV2Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelGeoProvidersStorageV2Impl$addProvider$2(TravelGeoProvidersStorageV2Impl travelGeoProvidersStorageV2Impl, d<? super TravelGeoProvidersStorageV2Impl$addProvider$2> dVar) {
        super(dVar);
        this.this$0 = travelGeoProvidersStorageV2Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object addProvider;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        addProvider = this.this$0.addProvider((m) null, (Context) null, (d<? super GeoProviderConfig>) this);
        return addProvider;
    }
}
