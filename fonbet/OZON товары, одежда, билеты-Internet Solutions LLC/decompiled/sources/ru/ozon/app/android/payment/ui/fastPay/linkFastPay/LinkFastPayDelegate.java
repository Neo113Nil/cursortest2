package ru.ozon.app.android.payment.ui.fastPay.linkFastPay;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayEvent;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayDelegate;", "", "references", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "<init>", "(Lru/ozon/app/android/composer/ConfiguratorReferences;)V", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "processEvent", "event", "Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayEvent;", "processEvent$payment_prodGoogleAllVendorsRelease", "linkFastPay", "response", "Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayResponse;", "showError", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LinkFastPayDelegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ConfiguratorReferences references;

    public LinkFastPayDelegate(@NotNull ConfiguratorReferences references) {
        Intrinsics.checkNotNullParameter(references, "references");
        this.references = references;
        this.actionHandler = BaseActionHandler.Builder.INSTANCE.invoke(references.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(references.getComposerWidgetComponentStorage())).buildHandler();
    }

    private final void linkFastPay(LinkFastPayResponse response) {
        String attachFastPayUrl = response.getAttachFastPayUrl();
        if (attachFastPayUrl == null) {
            showError();
            return;
        }
        this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(response.getAction(), null));
        String uri = LinkGenerator.externalLink$default(LinkGenerator.INSTANCE, attachFastPayUrl, false, 2, null).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.references.getNavigator(), uri, null, 2, null);
    }

    private final void showError() {
        RestrictionsUtilsKt.showNotification$default(this.references.getOwnerContainer(), StringProvider.getString(R$string.error_common_error_technical_error_title), NotificationDTO.Preset.NEGATIVE, false, 4, null);
    }

    public final void processEvent$payment_prodGoogleAllVendorsRelease(@NotNull LinkFastPayEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof LinkFastPayEvent.ShowError) {
            showError();
        } else {
            if (!(event instanceof LinkFastPayEvent.LinkFastPay)) {
                throw new o();
            }
            linkFastPay(((LinkFastPayEvent.LinkFastPay) event).getResponse());
        }
    }
}
