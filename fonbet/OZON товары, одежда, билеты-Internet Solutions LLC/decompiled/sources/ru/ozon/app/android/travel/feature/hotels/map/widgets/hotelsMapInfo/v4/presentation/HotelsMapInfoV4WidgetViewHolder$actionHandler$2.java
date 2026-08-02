package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clickAction", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4WidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ HotelsMapInfoV4WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4WidgetViewHolder$actionHandler$2(HotelsMapInfoV4WidgetViewHolder hotelsMapInfoV4WidgetViewHolder) {
        super(1);
        this.this$0 = hotelsMapInfoV4WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click clickAction) {
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel;
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel2;
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel3;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        String id2 = clickAction.getId();
        if (id2 != null) {
            int hashCode = id2.hashCode();
            if (hashCode == -641278678) {
                if (id2.equals("stopMapPollings")) {
                    hotelsMapInfoV4ViewModel = this.this$0.viewModel;
                    hotelsMapInfoV4ViewModel.onEvent(MapEvent.OnStopPollings.INSTANCE);
                    return;
                }
                return;
            }
            if (hashCode == 480605351) {
                if (id2.equals("hotelsMapInfoReposition")) {
                    hotelsMapInfoV4ViewModel2 = this.this$0.viewModel;
                    hotelsMapInfoV4ViewModel2.onEvent(MapEvent.OnClickNotificationBar.INSTANCE);
                    return;
                }
                return;
            }
            if (hashCode == 1679056201 && id2.equals("travelMapToggleRegions")) {
                hotelsMapInfoV4ViewModel3 = this.this$0.viewModel;
                hotelsMapInfoV4ViewModel3.onEvent(MapEvent.OnClickPolygonPanel.INSTANCE);
            }
        }
    }
}
