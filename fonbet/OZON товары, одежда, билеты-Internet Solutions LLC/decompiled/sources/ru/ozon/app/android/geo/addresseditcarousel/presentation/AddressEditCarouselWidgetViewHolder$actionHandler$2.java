package ru.ozon.app.android.geo.addresseditcarousel.presentation;

import Tl.b;
import i10.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.map.DetailsSheetManager;
import ru.ozon.app.android.geo.map.utils.BottomSheetActionParams;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditCarouselWidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ AddressEditCarouselWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditCarouselWidgetViewHolder$actionHandler$2(AddressEditCarouselWidgetViewHolder addressEditCarouselWidgetViewHolder) {
        super(1);
        this.this$0 = addressEditCarouselWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click click) {
        String link;
        DetailsSheetManager detailsSheetManager;
        String str;
        if (b.i(click, "action", "bottomSheetAction") && (link = click.getLink()) != null) {
            h.c.a aVar = new h.c.a(link, (String) null, (String) null, 14);
            AddressEditCarouselWidgetViewHolder addressEditCarouselWidgetViewHolder = this.this$0;
            Map<String, String> params = click.getParams();
            String str2 = params != null ? params.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null;
            Map<String, String> params2 = click.getParams();
            Boolean t02 = (params2 == null || (str = params2.get("skipCollapsed")) == null) ? null : kotlin.text.h.t0(str);
            Map<String, String> params3 = click.getParams();
            BottomSheetActionParams bottomSheetActionParams = new BottomSheetActionParams(str2, t02, params3 != null ? params3.get("state") : null);
            detailsSheetManager = addressEditCarouselWidgetViewHolder.detailsSheetManager;
            detailsSheetManager.show(aVar, bottomSheetActionParams);
        }
    }
}
