package ru.ozon.app.android.geo.map.clusterization;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.geo.map.clusterization.MapPlacemarkFactoryImpl", f = "MapPlacemarkFactory.kt", l = {32}, m = "createMapPlacemarks")
/* loaded from: classes12.dex */
final class MapPlacemarkFactoryImpl$createMapPlacemarks$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MapPlacemarkFactoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapPlacemarkFactoryImpl$createMapPlacemarks$1(MapPlacemarkFactoryImpl mapPlacemarkFactoryImpl, d<? super MapPlacemarkFactoryImpl$createMapPlacemarks$1> dVar) {
        super(dVar);
        this.this$0 = mapPlacemarkFactoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.createMapPlacemarks(null, this);
    }
}
