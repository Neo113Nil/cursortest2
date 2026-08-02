package ru.ozon.app.android.search.aiMessenger.actionHandlers;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.action.c;
import ru.ozon.android.messenger.framework.navigation.action.e;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.AiRefreshActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/actionHandlers/AiRefreshActionHandlerImpl;", "Lru/ozon/app/android/storefront/actionHandlers/AiRefreshActionHandler;", "<init>", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lru/ozon/android/messenger/framework/navigation/action/e;", "messengerActionSender$delegate", "LSc/j;", "getMessengerActionSender", "()Lru/ozon/android/messenger/framework/navigation/action/e;", "messengerActionSender", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiRefreshActionHandlerImpl extends AiRefreshActionHandler {

    @NotNull
    private final String actionId = "aiRefresh";

    /* renamed from: messengerActionSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j messengerActionSender = k.b(AiRefreshActionHandlerImpl$messengerActionSender$2.INSTANCE);

    private final e getMessengerActionSender() {
        return (e) this.messengerActionSender.getValue();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.Click) && (params = ((AtomAction.Click) action).getParams()) != null) {
            handlerRefs.getRefs().getNavigator().popBackStack();
            e messengerActionSender = getMessengerActionSender();
            if (messengerActionSender != null) {
                messengerActionSender.a(new c.b(params));
            }
        }
    }
}
