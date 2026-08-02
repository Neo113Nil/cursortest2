package ru.ozon.app.android.travel.actionhandler.notificationAction;

import Vg.f;
import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.K;
import com.google.android.material.bottomsheet.b;
import java.util.List;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/notificationAction/SwitchNotificationActionHandler;", "LVg/f;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "enableNotificationsSuggestingHandler", "<init>", "(Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;)V", "Landroidx/fragment/app/G;", "", "closeBottomSheet", "(Landroidx/fragment/app/G;)V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lxe/B0;", "actionJob", "Lxe/B0;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SwitchNotificationActionHandler extends f {

    @NotNull
    private final String actionId;
    private B0 actionJob;

    @NotNull
    private final EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;

    public SwitchNotificationActionHandler(@NotNull EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler) {
        Intrinsics.checkNotNullParameter(enableNotificationsSuggestingHandler, "enableNotificationsSuggestingHandler");
        this.enableNotificationsSuggestingHandler = enableNotificationsSuggestingHandler;
        this.actionId = "checkSystemNotifications";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeBottomSheet(G g10) {
        List<ComponentCallbacksC5392m> r02 = g10.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) C7714v.Z(r02);
        ComponentCallbacksC5392m parentFragment = componentCallbacksC5392m != null ? componentCallbacksC5392m.getParentFragment() : null;
        if (parentFragment instanceof b) {
            ((b) parentFragment).dismiss();
            g10.c0();
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull Tg.b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t d11;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        l tokenizedAnalytics = ((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
        AtomAction.SendAnalytics sendAnalytics = action instanceof AtomAction.SendAnalytics ? (AtomAction.SendAnalytics) action : null;
        if (sendAnalytics != null && (trackingInfo = sendAnalytics.getTrackingInfo()) != null && (d11 = x.d(trackingInfo, widgetInfo.c().c())) != null) {
            m.a(tokenizedAnalytics, d11, null);
        }
        B0 b02 = this.actionJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.actionJob = C10727i.c(K.a(widgetInfo.a().g()), null, null, new SwitchNotificationActionHandler$processWidgetAction$2(widgetInfo, this, null), 3);
    }
}
