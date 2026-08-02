package ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressPopupButtonViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ CheckoutPrefetchController $checkoutPrefetchController;
    final /* synthetic */ AddressPopupButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressPopupButtonViewHolder$actionHandler$1(CheckoutPrefetchController checkoutPrefetchController, AddressPopupButtonViewHolder addressPopupButtonViewHolder) {
        super(1);
        this.$checkoutPrefetchController = checkoutPrefetchController;
        this.this$0 = addressPopupButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        String link;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.Move) {
            this.$checkoutPrefetchController.removeAllCache();
        }
        AtomAction.DismissRedirect dismissRedirect = it instanceof AtomAction.DismissRedirect ? (AtomAction.DismissRedirect) it : null;
        if (dismissRedirect == null || (link = dismissRedirect.getLink()) == null) {
            return Boolean.FALSE;
        }
        String uri = LinkGenerator.INSTANCE.modal().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        boolean z11 = true;
        if (h.t(link, uri, true)) {
            composerReferences = this.this$0.refs;
            composerReferences.getNavigator().popBackStack();
            composerReferences2 = this.this$0.refs;
            ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(composerReferences2.getNavigator(), "fragment_tag", link, null, null, null, 28, null);
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
