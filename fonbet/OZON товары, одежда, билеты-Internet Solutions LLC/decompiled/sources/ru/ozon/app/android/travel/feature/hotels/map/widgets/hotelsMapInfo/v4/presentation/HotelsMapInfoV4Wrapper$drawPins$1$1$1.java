package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import we0.u;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u00012\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "layer", "", "Lwe0/u;", "placemarks", "", "invoke", "(Ljava/lang/Float;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$drawPins$1$1$1 extends AbstractC7737t implements Function2<Float, List<u>, Unit> {
    final /* synthetic */ M $$this$launch;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$drawPins$1$1$1(M m11, HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper) {
        super(2);
        this.$$this$launch = m11;
        this.this$0 = hotelsMapInfoV4Wrapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Float f7, List<u> list) {
        invoke2(f7, list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Float layer, List<u> placemarks) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        N.e(this.$$this$launch);
        this.this$0.hotelsMapInfoView.getController().b().g(layer.floatValue() == 1.0f ? 0L : 200L, placemarks, (long) layer.floatValue());
    }
}
