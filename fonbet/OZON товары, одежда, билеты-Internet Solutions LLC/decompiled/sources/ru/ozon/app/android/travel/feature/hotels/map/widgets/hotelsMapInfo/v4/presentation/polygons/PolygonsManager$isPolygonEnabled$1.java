package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.polygons;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.polygons.PolygonsManager", f = "PolygonsManager.kt", l = {131}, m = "isPolygonEnabled")
/* loaded from: classes4.dex */
final class PolygonsManager$isPolygonEnabled$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PolygonsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PolygonsManager$isPolygonEnabled$1(PolygonsManager polygonsManager, d<? super PolygonsManager$isPolygonEnabled$1> dVar) {
        super(dVar);
        this.this$0 = polygonsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.isPolygonEnabled(null, this);
    }
}
