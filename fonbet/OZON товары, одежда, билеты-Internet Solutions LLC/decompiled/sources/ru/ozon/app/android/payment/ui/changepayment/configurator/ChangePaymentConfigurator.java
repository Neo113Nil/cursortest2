package ru.ozon.app.android.payment.ui.changepayment.configurator;

import a00.C4911f;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/payment/ui/changepayment/configurator/ChangePaymentConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "showRestrictionIfNeed", "text", "", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangePaymentConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final void showRestrictionIfNeed(String text) {
        ConfiguratorReferences references;
        C4911f ownerContainer;
        r a11;
        ViewGroup rootView;
        if (text == null || (references = getReferences()) == null || (ownerContainer = references.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        int i11 = R$drawable.ic_check_green;
        FlashbarFactory.create$default(flashbarFactory, rootView, null, OzonSpannableStringKt.toOzonSpannableString(text), null, null, Integer.valueOf(i11), null, UniColors.BG_POSITIVE_PRIMARY.getToken(), null, null, null, null, null, 3000L, null, null, getContainer().g(), 57178, null).show();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        InterfaceC7851b controller;
        if (requestCode != 889 || resultCode != -1) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        ConfiguratorReferences references = getReferences();
        if (references != null && (controller = references.getController()) != null) {
            InterfaceC7851b.a.a(controller, null, null, null, null, 15);
        }
        showRestrictionIfNeed(data != null ? data.getStringExtra("key_message") : null);
    }
}
