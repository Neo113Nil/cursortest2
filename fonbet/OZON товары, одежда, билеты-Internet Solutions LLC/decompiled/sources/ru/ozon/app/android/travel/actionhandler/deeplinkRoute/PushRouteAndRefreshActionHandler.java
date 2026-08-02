package ru.ozon.app.android.travel.actionhandler.deeplinkRoute;

import androidx.lifecycle.B;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventPublisher;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000e*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/PushRouteAndRefreshActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventPublisher;", "deeplinkRoutePublisher", "<init>", "(Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventPublisher;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventPublisher;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getLinkUrl", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Ljava/lang/String;", "linkUrl", "Landroidx/lifecycle/B;", "getLifecycleScope", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Landroidx/lifecycle/B;", "lifecycleScope", "Companion", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushRouteAndRefreshActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final DeeplinkRouteEventPublisher deeplinkRoutePublisher;

    public PushRouteAndRefreshActionHandler(@NotNull DeeplinkRouteEventPublisher deeplinkRoutePublisher) {
        Intrinsics.checkNotNullParameter(deeplinkRoutePublisher, "deeplinkRoutePublisher");
        this.deeplinkRoutePublisher = deeplinkRoutePublisher;
        this.actionId = "pushRouteAndRefresh";
    }

    private final B getLifecycleScope(CustomActionHandler.HandlerReferences handlerReferences) {
        return K.a(handlerReferences.getRefs().getContainer().g());
    }

    private final String getLinkUrl(AtomAction.Click click) {
        Map<String, String> params = click.getParams();
        if (params != null) {
            return params.get("refreshUrl");
        }
        return null;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        String linkUrl;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.Click) && (linkUrl = getLinkUrl((AtomAction.Click) action)) != null) {
            C10727i.c(getLifecycleScope(handlerRefs), null, null, new PushRouteAndRefreshActionHandler$processAction$1(this, linkUrl, null), 3);
        }
    }
}
