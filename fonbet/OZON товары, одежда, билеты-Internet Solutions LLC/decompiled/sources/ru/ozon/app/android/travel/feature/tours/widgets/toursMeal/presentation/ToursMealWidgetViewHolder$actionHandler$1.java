package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealSelectUpdateKey;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursMealWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ ComposerReferences $references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursMealWidgetViewHolder$actionHandler$1(ComposerReferences composerReferences) {
        super(1);
        this.$references = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(action, "action");
        InterfaceC7851b controller = this.$references.getController();
        String link = action.getLink();
        Map<String, String> params = action.getParams();
        controller.update(new ToursMealSelectUpdateKey(link, params != null ? params.get("buttonTitle") : null));
    }
}
