package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import Tl.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.travel.molecules.extensions.SendEmailExtensionKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class InfoPopupV4StickyWidgetViewHolder$actionHandler$3 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ InfoPopupV4StickyWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoPopupV4StickyWidgetViewHolder$actionHandler$3(InfoPopupV4StickyWidgetViewHolder infoPopupV4StickyWidgetViewHolder) {
        super(1);
        this.this$0 = infoPopupV4StickyWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click click) {
        Map<String, String> params;
        String str;
        i iVar;
        if (!b.i(click, "atomAction", "travelSendToEmail") || (params = click.getParams()) == null || (str = params.get("link")) == null) {
            return;
        }
        iVar = this.this$0.container;
        SendEmailExtensionKt.mailTo(str, iVar);
    }
}
