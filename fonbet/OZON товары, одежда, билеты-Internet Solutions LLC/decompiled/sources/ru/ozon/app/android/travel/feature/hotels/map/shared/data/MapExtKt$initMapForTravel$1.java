package ru.ozon.app.android.travel.feature.hotels.map.shared.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt", f = "MapExt.kt", l = {274, 275, 284}, m = "initMapForTravel")
/* loaded from: classes4.dex */
final class MapExtKt$initMapForTravel$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    MapExtKt$initMapForTravel$1(d<? super MapExtKt$initMapForTravel$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return MapExtKt.initMapForTravel(null, null, null, null, null, null, this);
    }
}
