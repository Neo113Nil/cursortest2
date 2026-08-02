package ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode;

import Sh.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "shareBarcodeAnalytics", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeAnalytics;", "<init>", "(Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeAnalytics;)V", "shareDelegate", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeDelegate;", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareBarcodeActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ShareBarcodeAnalytics shareBarcodeAnalytics;

    @NotNull
    private final ShareBarcodeDelegate shareDelegate;

    public ShareBarcodeActionHandler(@NotNull ShareBarcodeAnalytics shareBarcodeAnalytics) {
        Intrinsics.checkNotNullParameter(shareBarcodeAnalytics, "shareBarcodeAnalytics");
        this.shareBarcodeAnalytics = shareBarcodeAnalytics;
        this.shareDelegate = new ShareBarcodeDelegate();
        this.actionId = "shareBarcode";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.Click click;
        Map<String, String> params;
        String str;
        Map<String, String> params2;
        String str2;
        Map<String, String> params3;
        String str3;
        r a11;
        ComponentCallbacksC5392m b11;
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (params = (click = (AtomAction.Click) action).getParams()) == null || (str = params.get("code")) == null || (params2 = click.getParams()) == null || (str2 = params2.get("text")) == null || (params3 = click.getParams()) == null || (str3 = params3.get("visibleCode")) == null || (a11 = handlerRefs.getRefs().getContainer().a()) == null || (b11 = a.b(handlerRefs)) == null || (lifecycle = b11.getLifecycle()) == null) {
            return;
        }
        ComponentCallbacksC5392m b12 = a.b(handlerRefs);
        if (b12 != null) {
            this.shareBarcodeAnalytics.init(b12);
        }
        ShareBarcodeAnalytics shareBarcodeAnalytics = this.shareBarcodeAnalytics;
        Map<String, String> params4 = click.getParams();
        shareBarcodeAnalytics.widgetShareButtonClick(params4 != null ? params4.get("propertiesTitle") : null);
        this.shareDelegate.share(a11, str, str3, str2, new WeakReference<>(lifecycle));
    }
}
