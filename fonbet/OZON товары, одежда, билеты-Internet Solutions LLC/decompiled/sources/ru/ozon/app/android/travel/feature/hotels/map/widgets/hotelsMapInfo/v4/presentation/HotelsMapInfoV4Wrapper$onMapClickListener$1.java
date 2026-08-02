package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import we0.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/m;", "<unused var>", "", "invoke", "(Lwe0/m;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$onMapClickListener$1 extends AbstractC7737t implements Function1<m, Unit> {
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$onMapClickListener$1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper) {
        super(1);
        this.this$0 = hotelsMapInfoV4Wrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(m mVar) {
        invoke2(mVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<unused var>");
        this.this$0.viewModel.onEvent(MapEvent.OnClickMap.INSTANCE);
    }
}
