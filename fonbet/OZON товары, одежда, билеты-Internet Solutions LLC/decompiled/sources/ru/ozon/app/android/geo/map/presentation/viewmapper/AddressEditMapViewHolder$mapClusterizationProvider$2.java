package ru.ozon.app.android.geo.map.presentation.viewmapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.map.clusterization.BitmapContainer;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "key", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewHolder$mapClusterizationProvider$2 extends AbstractC7737t implements Function1<Integer, BitmapContainer> {
    final /* synthetic */ AddressEditMapViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewHolder$mapClusterizationProvider$2(AddressEditMapViewHolder addressEditMapViewHolder) {
        super(1);
        this.this$0 = addressEditMapViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ BitmapContainer invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final BitmapContainer invoke(int i11) {
        ClusterizationLoadingService clusterizationLoadingService;
        clusterizationLoadingService = this.this$0.clusterizationLoadingService;
        return clusterizationLoadingService.getBitmap(i11);
    }
}
