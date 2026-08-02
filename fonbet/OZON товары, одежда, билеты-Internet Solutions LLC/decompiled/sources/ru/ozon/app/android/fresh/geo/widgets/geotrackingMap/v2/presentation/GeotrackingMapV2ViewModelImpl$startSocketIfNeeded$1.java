package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl", f = "GeotrackingMapV2ViewModelImpl.kt", l = {106}, m = "startSocketIfNeeded")
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GeotrackingMapV2ViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$1(GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl, d<? super GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$1> dVar) {
        super(dVar);
        this.this$0 = geotrackingMapV2ViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object startSocketIfNeeded;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        startSocketIfNeeded = this.this$0.startSocketIfNeeded(this);
        return startSocketIfNeeded;
    }
}
