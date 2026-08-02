package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import we0.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/m;", "<unused var>", "", "invoke", "(Lwe0/m;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsMapViewV2$onMapClickListener$1 extends AbstractC7737t implements Function1<m, Unit> {
    final /* synthetic */ HotelsMapViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapViewV2$onMapClickListener$1(HotelsMapViewV2 hotelsMapViewV2) {
        super(1);
        this.this$0 = hotelsMapViewV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(m mVar) {
        invoke2(mVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(m mVar) {
        Boolean bool;
        String str;
        Intrinsics.checkNotNullParameter(mVar, "<unused var>");
        bool = this.this$0.isSerpPage;
        if (Intrinsics.d(bool, Boolean.FALSE)) {
            return;
        }
        this.this$0.getBottomCardController().slideDown();
        HotelsMapViewV2 hotelsMapViewV2 = this.this$0;
        str = hotelsMapViewV2.previousClickedPinId;
        if (str == null) {
            str = "";
        }
        hotelsMapViewV2.updateMap(false, str);
    }
}
