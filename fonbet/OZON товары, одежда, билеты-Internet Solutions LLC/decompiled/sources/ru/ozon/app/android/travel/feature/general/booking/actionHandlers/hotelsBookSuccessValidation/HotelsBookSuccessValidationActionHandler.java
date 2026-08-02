package ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation;

import Ae.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.data.storage.utils.TravelPageStorageUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/actionHandlers/hotelsBookSuccessValidation/HotelsBookSuccessValidationActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "", "deeplink", "", "openBottomSheet", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Ljava/lang/String;)V", "sendStartPollingEvent", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/general/booking/actionHandlers/hotelsBookSuccessValidation/HotelsBookEventFlow;", "getEventFlow-OIGt0m8", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)LAe/w0;", "eventFlow", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsBookSuccessValidationActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId = "hotelsBookSuccessValidation";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/actionHandlers/hotelsBookSuccessValidation/HotelsBookSuccessValidationActionHandler$Companion;", "", "<init>", "()V", "ACTION_ID", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: getEventFlow-OIGt0m8, reason: not valid java name */
    private final w0<Unit> m1100getEventFlowOIGt0m8(CustomActionHandler.HandlerReferences handlerReferences) {
        TravelPageKeyValueStorage pageStorage = TravelPageStorageUtilsKt.getTravelPageStorageHolder(handlerReferences.getRefs()).getPageStorage();
        String name = HotelsBookEventFlow.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = pageStorage.get(name);
        if (!(obj instanceof HotelsBookEventFlow)) {
            obj = null;
        }
        HotelsBookEventFlow hotelsBookEventFlow = (HotelsBookEventFlow) obj;
        if (hotelsBookEventFlow != null) {
            return hotelsBookEventFlow.getFlow();
        }
        return null;
    }

    private final ComposerNavigator getNavigator(CustomActionHandler.HandlerReferences handlerReferences) {
        return handlerReferences.getRefs().getNavigator();
    }

    private final void openBottomSheet(CustomActionHandler.HandlerReferences handlerReferences, String str) {
        ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(getNavigator(handlerReferences), str, str, 9001, null, null, 24, null);
    }

    private final void sendStartPollingEvent(CustomActionHandler.HandlerReferences handlerReferences) {
        w0<Unit> m1100getEventFlowOIGt0m8 = m1100getEventFlowOIGt0m8(handlerReferences);
        if (m1100getEventFlowOIGt0m8 != null) {
            HotelsBookEventFlow.m1098tryEmitimpl(m1100getEventFlowOIGt0m8, Unit.f71690a);
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.Click) && (link = ((AtomAction.Click) action).getLink()) != null) {
            sendStartPollingEvent(handlerRefs);
            openBottomSheet(handlerRefs, link);
        }
    }
}
