package ru.ozon.app.android.payment.ui.changepayment.configurator;

import a00.C4908c;
import a00.C4911f;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.payment.ui.changepayment.presentation.ChangePaymentMethodAction;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/payment/ui/changepayment/configurator/ChangePaymentMethodConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "showMessage", "action", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangePaymentMethodConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final void showMessage(ChangePaymentMethodAction action) {
        C4911f ownerContainer;
        C4908c g10;
        ConfiguratorReferences references;
        C4911f ownerContainer2;
        r a11;
        ViewGroup rootView;
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null || (g10 = ownerContainer.g()) == null || (references = getReferences()) == null || (ownerContainer2 = references.getOwnerContainer()) == null || (a11 = ownerContainer2.a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        if (!(action instanceof ChangePaymentMethodAction.Success)) {
            if (action instanceof ChangePaymentMethodAction.Error) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, ((ChangePaymentMethodAction.Error) action).getMessage(), null, null, null, g10, 58, null).show();
            }
        } else {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            String message = ((ChangePaymentMethodAction.Success) action).getMessage();
            if (message == null) {
                message = "";
            }
            FlashbarFactory.create$default(flashbarFactory, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_check_green), null, null, null, null, null, null, null, null, null, null, g10, 65498, null).show();
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Bundle extras;
        if (requestCode != 874 || resultCode != -1) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        ChangePaymentMethodAction changePaymentMethodAction = (data == null || (extras = data.getExtras()) == null) ? null : (ChangePaymentMethodAction) extras.getParcelable("key_message");
        if (changePaymentMethodAction != null) {
            showMessage(changePaymentMethodAction);
        }
    }
}
