package ru.ozon.app.android.geo.map.clusterization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import we0.t;
import we0.u;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lwe0/u;", "placemarks", "", "<unused var>", "Lwe0/t;", "invoke", "(Ljava/util/List;Ljava/lang/String;)Lwe0/t;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MapClusterizationProvider$createClusterizer$1 extends AbstractC7737t implements Function2<List<? extends u>, String, t> {
    final /* synthetic */ MapClusterizationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapClusterizationProvider$createClusterizer$1(MapClusterizationProvider mapClusterizationProvider) {
        super(2);
        this.this$0 = mapClusterizationProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ t invoke(List<? extends u> list, String str) {
        return invoke2((List<u>) list, str);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final t invoke2(List<u> placemarks, String str) {
        t createClusterIcon;
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        createClusterIcon = this.this$0.createClusterIcon(placemarks);
        return createClusterIcon;
    }
}
