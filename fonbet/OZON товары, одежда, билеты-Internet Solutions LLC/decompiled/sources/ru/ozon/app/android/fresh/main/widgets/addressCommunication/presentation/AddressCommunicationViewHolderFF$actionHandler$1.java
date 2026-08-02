package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressCommunicationViewHolderFF$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ AddressCommunicationViewHolderFF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCommunicationViewHolderFF$actionHandler$1(AddressCommunicationViewHolderFF addressCommunicationViewHolderFF) {
        super(1);
        this.this$0 = addressCommunicationViewHolderFF;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        String link = it.getLink();
        if (link != null && link.length() != 0) {
            composerReferences = this.this$0.refs;
            ComposerNavigator navigator = composerReferences.getNavigator();
            String link2 = it.getLink();
            Intrinsics.f(link2);
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, link2, null, 2, null);
        }
        this.this$0.setWidgetInvisible();
    }
}
