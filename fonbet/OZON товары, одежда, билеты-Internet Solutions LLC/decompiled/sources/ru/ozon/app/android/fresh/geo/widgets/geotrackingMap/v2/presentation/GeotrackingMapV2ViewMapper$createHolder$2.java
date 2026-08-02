package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewMapper$createHolder$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ComponentCallbacksC5392m $fragment;
    final /* synthetic */ GeotrackingMapV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2ViewMapper$createHolder$2(GeotrackingMapV2ViewMapper geotrackingMapV2ViewMapper, ComponentCallbacksC5392m componentCallbacksC5392m) {
        super(0);
        this.this$0 = geotrackingMapV2ViewMapper;
        this.$fragment = componentCallbacksC5392m;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GeotrackingMapV2Binder geotrackingMapV2Binder;
        PageModifier pageModifier;
        this.this$0.clearWindow(this.$fragment);
        geotrackingMapV2Binder = this.this$0.binder;
        if (geotrackingMapV2Binder != null) {
            geotrackingMapV2Binder.onRemove();
        }
        pageModifier = this.this$0.pageModifier;
        if (pageModifier != null) {
            pageModifier.detachFromPage();
        }
    }
}
