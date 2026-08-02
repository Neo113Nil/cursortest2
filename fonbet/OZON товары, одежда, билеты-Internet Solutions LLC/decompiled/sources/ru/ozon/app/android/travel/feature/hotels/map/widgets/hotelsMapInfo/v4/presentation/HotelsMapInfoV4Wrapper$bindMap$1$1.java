package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import we0.i;
import we0.n;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$bindMap$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ HotelsMapInfoV4VO $item;
    final /* synthetic */ i $lastVisibleArea;
    final /* synthetic */ ve0.b $this_run;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isFinished", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$bindMap$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper) {
            super(1);
            this.this$0 = hotelsMapInfoV4Wrapper;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            this.this$0.sendMapReadyEvent(z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$bindMap$1$1(i iVar, HotelsMapInfoV4VO hotelsMapInfoV4VO, ve0.b bVar, HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper) {
        super(0);
        this.$lastVisibleArea = iVar;
        this.$item = hotelsMapInfoV4VO;
        this.$this_run = bVar;
        this.this$0 = hotelsMapInfoV4Wrapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        n visibleRegion;
        i iVar = this.$lastVisibleArea;
        if (iVar == null || (visibleRegion = MapExtKt.toBounds(iVar)) == null) {
            visibleRegion = this.$item.getVisibleRegion();
        }
        if (visibleRegion == null) {
            this.this$0.sendMapReadyEvent(true);
        } else {
            ve0.b bVar = this.$this_run;
            MapExtKt.move(bVar, MapExtKt.position(bVar, visibleRegion), new AnonymousClass1(this.this$0));
        }
    }
}
